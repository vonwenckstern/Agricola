package de.tu_freiberg.informatik.vonwenckstern.client.presenter;

import java.util.ArrayList;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.IntegerBox;
import com.google.gwt.user.client.ui.PushButton;
import com.google.gwt.user.client.ui.Widget;

import de.tu_freiberg.informatik.vonwenckstern.client.EventBus;
import de.tu_freiberg.informatik.vonwenckstern.client.HistoryController;
import de.tu_freiberg.informatik.vonwenckstern.client.event.ChildStartsWorkingEvent;
import de.tu_freiberg.informatik.vonwenckstern.client.event.ChildStartsWorkingEvent.ChildStartsWorkingHandler;
import de.tu_freiberg.informatik.vonwenckstern.client.event.HistoryChangedEvent;
import de.tu_freiberg.informatik.vonwenckstern.client.event.NextRoundEvent;
import de.tu_freiberg.informatik.vonwenckstern.client.event.PlayerFieldDoneEvent;
import de.tu_freiberg.informatik.vonwenckstern.client.event.RequestHistoryEvent;
import de.tu_freiberg.informatik.vonwenckstern.client.event.SaveHistoryToURLEvent;
import de.tu_freiberg.informatik.vonwenckstern.client.event.ShowingDialogEvent;
import de.tu_freiberg.informatik.vonwenckstern.client.event.ShowingDialogEvent.ShowingDialogHandler;
import de.tu_freiberg.informatik.vonwenckstern.client.model.AcquisitionCardModel;
import de.tu_freiberg.informatik.vonwenckstern.client.model.BigAcquisitions;
import de.tu_freiberg.informatik.vonwenckstern.client.model.Child;
import de.tu_freiberg.informatik.vonwenckstern.client.model.FieldCard;
import de.tu_freiberg.informatik.vonwenckstern.client.model.HasAcquisitionCardModel;
import de.tu_freiberg.informatik.vonwenckstern.client.model.HasBaseFieldModel;
import de.tu_freiberg.informatik.vonwenckstern.client.model.PlayerFieldModel;
import de.tu_freiberg.informatik.vonwenckstern.client.model.PlayerFieldModel.AcquisitationType;
import de.tu_freiberg.informatik.vonwenckstern.client.model.PlayerFieldModel.PastureInfo;
import de.tu_freiberg.informatik.vonwenckstern.client.model.PlayerFieldModel.PastureInfo.Animal;
import de.tu_freiberg.informatik.vonwenckstern.client.model.PlayerResourceModel;
import de.tu_freiberg.informatik.vonwenckstern.client.model.Resource;
import de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel;
import de.tu_freiberg.informatik.vonwenckstern.client.view.HasPosition;


public class PlayerFieldPresenter implements Activity<PlayerFieldModel>, ClickHandler, ChildStartsWorkingHandler, ShowingDialogHandler {

	public interface Display {
		public void setInformation(String text);
		public void setInformationVisible(boolean visible);
		public void setFeedingFamilyBtnVisible(boolean visible);
		public void setEnclosureBtnVisible(boolean visible);
		public void update(PlayerFieldModel model);
		public void registerHandlers(ClickHandler p);
		public Widget asWidget();
	}
	
	public static enum State {
		NONE, BUILD_HOUSE, BUILD_STABLE, PLOW_FIELD, BUILD_FENCE, GET_SHEEP, BACK_BREAD, SEED_GRAIN, SEED_VEGETABLE,
		FAMILY_ADDITION, RESTAURATE, BIG_ACQUISITATION, GET_BOAR, GET_COW, FAMILIY_ADDITION_NO_HOUSE, KILL_ANIMALS_FIREPLACE, 
		KILL_ANIMALS_COOKERY
	}
	
	private Display display = null;
	private PlayerFieldModel model = null;
	private ArrayList<State> states = new ArrayList<State>();
	private State state = State.NONE;
	PlayerResourceModel resourceModel = null;
	/** true if the harvest season already started and the user can do special events on the big acquisitation cards */
	private boolean isHarvestSeason = false;
	/** true if the user has to pick a big acquisitation and so the harvest season cannot start now*/
	private boolean isGettingBigAcquisitation = false;
	/** true if the harvest season should start when the user finished getting its big acquisitation */
	private boolean souldHarvestSeasonStart = false;
	private boolean isShowingDialog = false;
	
	public boolean isGettingBigAcquisitation() {
		return isGettingBigAcquisitation;
	}

	public void setGettingBigAcquisitation(boolean isGettingBigAcquisitation) {
		this.isGettingBigAcquisitation = isGettingBigAcquisitation;
		if(!isGettingBigAcquisitation && souldHarvestSeasonStart) {
			souldHarvestSeasonStart = false;
			childFinishedWorking();
		}
	}

	public void addState(State state) {
		states.add(state);
	}
	
	private void updateModel() {
		display.update(model);
		EventBus.fire(new HistoryChangedEvent(this));
	}
	
	@Override
	public void onChildStartsWorking(ChildStartsWorkingEvent event) {
		model.sendPersonToWork();
		if(states.isEmpty() && state == State.NONE && !isGettingBigAcquisitation && !isShowingDialog)
			childFinishedWorking();
		else {
			if(isGettingBigAcquisitation || isShowingDialog)
				souldHarvestSeasonStart = true;
			updateModel();
		}
	}
	
	private void childFinishedWorking() {
		if(!model.isPersonAvailableForWork()) {
			model.sendAllPersonsHome();
			int round = model.getRound();
			if(round == 4 || round == 7 || round == 9 || round == 11 || round == 13 || round == 14) {
				// it is harvest season, now
				
				// (1) pick grains and/or vegetables
				for(int i=0; i<15; i++) {
					SmallFieldModel m = model.getField(i);
					if(m.getField() == FieldCard.F_FIELD && m.getRessourceCount() > 0) {
						resourceModel.addRessource(m.getRessource(), 1);
						m.setRessourceCount(m.getRessourceCount() - 1);
						if(m.getRessourceCount() == 0) {
							m.setRessource(Resource.R_NONE);
						}
					}
				}
				// TODO let people kill some animals for food
				if( (model.selectAcquisitationCards(AcquisitationType.HARVEST_SEASON)) && 
						Window.confirm("Do you want to do some special events on your big acquisitations?")) {
					clearSelection();
					display.setFeedingFamilyBtnVisible(true);
					isHarvestSeason = true;
					executeStates();
				} else {
					clearSelection();
					feedingFamily();
				}
			} else {
				announceNextRound();
			}
		} else {
			updateModel();
			EventBus.fire(new SaveHistoryToURLEvent());
		}
	}
	
	private void announceNextRound() {
		model.increaseRound();
		EventBus.fire(new NextRoundEvent(model.getRound()));
		// children will become persons
		for(int i=0; i<15; i++) {
			SmallFieldModel m = model.getField(i);
			m.setPersonsCount(m.getPersonsCount() + m.getChildCount());
			m.setChildCount(0);
		}
		updateModel();
		EventBus.fire(new SaveHistoryToURLEvent());
	}
	
	private void feedingFamily() {
		// (2) feed your family
		int food = 0;
		for(int i=0; i<15; i++) {
			food += 2*model.getField(i).getPersonsCount() + model.getField(i).getChildCount();
		}
		resourceModel.addRessource(Resource.R_FOOD, -1*food);
		
		// (3) let the animals get babies
		model.breedAnimals();
		
		announceNextRound();
	}
	
	public void addBigAcquisitation(AcquisitionCardModel acquisition) {
		model.addAcquisitation(new AcquisitionCardModel(acquisition.getAcquisition(), acquisition.isVisible(), acquisition.getDescription()));
		updateModel();
	}
	
	public void executeStates() {
		if(!states.isEmpty()) {
			State s = states.get(0);
			states.remove(0);
			switch(s) {
			case BUILD_HOUSE: buildHouse(); break;
			case BUILD_STABLE: buildStable(); break;
			case PLOW_FIELD: plowField(); break;
			case BUILD_FENCE: buildFence(); break;
			case GET_SHEEP: getSheep(); break;
			case BACK_BREAD: backBread(); break;
			case SEED_GRAIN: seedGrain(); break;
			case SEED_VEGETABLE: seedVegetable(); break;
			case FAMILY_ADDITION: familyAddition(); break;
			case RESTAURATE: restaurate(); break;
			case BIG_ACQUISITATION: break;
			case GET_BOAR: getBoar(); break;
			case GET_COW: getCow(); break;
			case FAMILIY_ADDITION_NO_HOUSE: familyAdditonNoHouse(); break;
			case KILL_ANIMALS_FIREPLACE: killAnimals(State.KILL_ANIMALS_FIREPLACE); break;
			case KILL_ANIMALS_COOKERY: killAnimals(State.KILL_ANIMALS_COOKERY); break;
			case NONE: break;
			}
		} else {
			if(isHarvestSeason) {
				harvestSeason();
			} else {
				display.setInformationVisible(false);
				display.setEnclosureBtnVisible(false);
				EventBus.fire(new PlayerFieldDoneEvent());
				childFinishedWorking();
			}
		}
	}
	
	private void harvestSeason() {
		model.selectAcquisitationCards(AcquisitationType.HARVEST_SEASON);	
		updateModel();	
	}

	private void killAnimals(State s) {
		int fields = 0;
		for(int i=0; i<15; i++) {
			if(model.isPasture(i) && model.containsAnimals(i)) {
				model.getField(i).setSelectable(true);
				fields++;
			} else {
				model.getField(i).setSelectable(false);
			}
		}
		if(fields == 0) {
			Window.alert("You have no animals to kill to make food!");
			this.state = State.NONE;
			executeStates();
		} else {
			state = s;
			display.setInformation("kill animals");
			updateModel();	
		}
	}
	
	private void familyAdditonNoHouse() {
		if(resourceModel.getPersonsCount() < 1) {
			Window.alert("Your family size is already 5. You do not have a free person stone.\nThe turn finished now.");
			executeStates();
			return;
		}
		for(int i=0; i<15; i++) {
			SmallFieldModel m = model.getField(i);
			if(model.isHouse(i)){
				m.setSelectable(true);
			} else {
				m.setSelectable(false);
			}
		}
		resourceModel.setPersonsCount(resourceModel.getPersonsCount() - 1);
		state = State.FAMILIY_ADDITION_NO_HOUSE;
		display.setInformation("choose a room for your new baby");
		updateModel();	
	}

	private void getCow() {
		boolean selected = model.selectAcquisitationCards(AcquisitationType.CHANGE);
		int fields = 0;
		int[] pIds = model.categorizePasture();
		for(int i=0; i<15; i++) {
			SmallFieldModel m = model.getField(i);
			PastureInfo pInfo = model.getPastureInfo(i, pIds);
			if(pInfo.maxAnimals > pInfo.animalCount && (pInfo.animal == Animal.COW || pInfo.animal == Animal.NONE)){
				m.setSelectable(true);
				fields++;
			} else {
				m.setSelectable(false);
			}
		}
		if(fields == 0 && !selected) {
			Window.alert("You do not have a free pasture field for your sheep\nThe turn finished now.");
			executeStates();
		}
		state = State.GET_COW;
		display.setInformation("select a pasture for your sheep");
		updateModel();
	}

	private void getBoar() {
		boolean selected = model.selectAcquisitationCards(AcquisitationType.CHANGE);
		int fields = 0;
		int[] pIds = model.categorizePasture();
		for(int i=0; i<15; i++) {
			SmallFieldModel m = model.getField(i);
			PastureInfo pInfo = model.getPastureInfo(i, pIds);
			if(pInfo.maxAnimals > pInfo.animalCount && (pInfo.animal == Animal.BOAR || pInfo.animal == Animal.NONE)){
				m.setSelectable(true);
				fields++;
			} else {
				m.setSelectable(false);
			}
		}
		if(fields == 0 && !selected) {
			Window.alert("You do not have a free pasture field for your sheep\nThe turn finished now.");
			executeStates();
		}
		state = State.GET_BOAR;
		display.setInformation("select a pasture for your sheep");
		updateModel();
	}

	private void restaurate() {
		int houses = 0;
		for(int i=0; i<15; i++) {
			if(model.isHouse(i)){
				houses++;
			}
		}
		if(model.getField(4).getField() == FieldCard.F_WOOD_HOUSE) {
			 if(resourceModel.getClayCount() < houses) {
				 Window.alert("You do not have enough clay to restaurate your houses!");
				 executeStates();
				 return;
			 }
			 resourceModel.addRessource(Resource.R_CLAY, houses*-1);
		} else if(model.getField(4).getField() == FieldCard.F_CLAY_HOUSE) {
			if(resourceModel.getStoneCount() < houses) {
				 Window.alert("You do not have enough stone to restaurate your houses!");
				 executeStates();
				 return;
			 }
			 resourceModel.addRessource(Resource.R_STONE, houses*-1);
		}
		
		for(int i=0; i<15; i++) {
			SmallFieldModel m = model.getField(i);
			if(model.isHouse(i)){
				if(m.getField() == FieldCard.F_WOOD_HOUSE)
					m.setField(FieldCard.F_CLAY_HOUSE);
				else if(m.getField() == FieldCard.F_CLAY_HOUSE)
					m.setField(FieldCard.F_STONE_HOUSE);
			}
		}
		updateModel();
		executeStates();
	}

	private void familyAddition() {
		if(resourceModel.getPersonsCount() < 1) {
			Window.alert("Your family size is already 5. You do not have a free person stone.\nThe turn finished now.");
			executeStates();
			return;
		}
		int fields = 0;
		for(int i=0; i<15; i++) {
			SmallFieldModel m = model.getField(i);
			if(model.isHouse(i) && m.getChild() == Child.C_NONE){
				m.setSelectable(true);
				fields++;
			} else {
				m.setSelectable(false);
			}
		}
		if(fields == 0) {
			Window.alert("You do not have a free room for your baby.\nThe turn finished now.");
			executeStates();
			return;
		}
		resourceModel.setPersonsCount(resourceModel.getPersonsCount() - 1);
		state = State.FAMILY_ADDITION;
		display.setInformation("choose a place for your new baby");
		updateModel();	
	}

	private void seedVegetable() {
		if(resourceModel.getVegetableCount() < 1) {
			Window.alert("You have no vegetable to seed your fields");
			executeStates();
		} else {
			resourceModel.addRessource(Resource.R_VEGETABLE, -1);
			int fields = 0;
			for(int i=0; i<15; i++) {
				SmallFieldModel m = model.getField(i);
				if(m.getField() == FieldCard.F_FIELD && m.getRessourceCount() == 0){
					m.setSelectable(true);
					fields++;
				} else {
					m.setSelectable(false);
				}
			}
			if(fields == 0) {
				Window.alert("You have no free field to seed vegetable\nThe turn finished now.");
				executeStates();
			} else {
				state = State.SEED_VEGETABLE;
				display.setInformation("seed your vegetables");
				updateModel();	
			}
		}
	}

	private void seedGrain() {
		if(resourceModel.getGrainCount() < 1) {
			Window.alert("You have no grain to seed your fields");
			executeStates();
		} else {
			resourceModel.addRessource(Resource.R_GRAIN, -1);
			int fields = 0;
			for(int i=0; i<15; i++) {
				SmallFieldModel m = model.getField(i);
				if(m.getField() == FieldCard.F_FIELD && m.getRessourceCount() == 0){
					m.setSelectable(true);
					fields++;
				} else {
					m.setSelectable(false);
				}
			}
			if(fields == 0) {
				Window.alert("You have no free field to seed grain\nThe turn finished now.");
				executeStates();
			} else {
				state = State.SEED_GRAIN;
				display.setInformation("seed your grain");
				updateModel();	
			}
		}
	}

	private void backBread() {
		boolean selected = model.selectAcquisitationCards(AcquisitationType.BACK_BREAD);
		if(!selected) {
			Window.alert("You have no big acquisitation for backing bread");
			executeStates();
		} else {
			if(resourceModel.getGrainCount() < 1) {
				Window.alert("You have no grain for backing bread");
				executeStates();
			} else {
				state = State.BACK_BREAD;
				display.setInformation("What card do you want to use for backing bread?");
				updateModel();	
			}
		}
		
	}

	public PlayerFieldPresenter(Display display, PlayerFieldModel model, PlayerResourceModel resourceModel) {
		this.display = display;
		this.model = model;
		this.resourceModel = resourceModel;
		display.registerHandlers(this);
		EventBus.getEventBus().addChildStartsWorkingHandler(this);
		EventBus.getEventBus().addShwoingDialogHandler(this);
		HistoryController.getInstance().addActivityPresenter(this);
		EventBus.fire(new RequestHistoryEvent(this));
	}
	
	@Override
	public Widget getView() {
		return display.asWidget();
	}
	
	private void getSheep() {
		boolean selected = model.selectAcquisitationCards(AcquisitationType.CHANGE);
		int fields = 0;
		int[] pIds = model.categorizePasture();
		for(int i=0; i<15; i++) {
			SmallFieldModel m = model.getField(i);
			PastureInfo pInfo = model.getPastureInfo(i, pIds);
			if(pInfo.maxAnimals > pInfo.animalCount && (pInfo.animal == Animal.SHEEP || pInfo.animal == Animal.NONE)){
				m.setSelectable(true);
				fields++;
			} else {
				m.setSelectable(false);
			}
		}
		if(fields == 0 && !selected) {
			Window.alert("You do not have a free pasture field for your sheep\nThe turn finished now.");
			executeStates();
		}
		state = State.GET_SHEEP;
		display.setInformation("select a pasture for your sheep");
		updateModel();
	}
	
	private void buildFence() {
		for(int i=0; i<15; i++) {
			SmallFieldModel m = model.getField(i);
			if(model.isPasture(i) || model.isHouse(i) || model.isField(i)){
				m.setSelectable(false);
			} else {
				m.setSelectable(true);
			}
		}
		state = State.BUILD_FENCE;
		display.setInformation("build your fence enclosure");
		display.setEnclosureBtnVisible(true);
		updateModel();
	}
	
	
	
	private void plowField() {
		for(int i=0; i<15; i++) {
			SmallFieldModel m = model.getField(i);
			if(m.getField() == FieldCard.F_NONE && !model.isPasture(i) && (model.countFields() == 0 ||
					((i/5 == (i-1)/5) && model.isField(i-1) || (i/5 == (i+1)/5) && model.isField(i+1) || // fields are next to each other in the same row
							model.isField(i-5) || model.isField(i+5)) 	)){ // fields are next to each other in the same column
				m.setSelectable(true);
			} else {
				m.setSelectable(false);
			}
		}
		state = State.PLOW_FIELD;
		display.setInformation("plow your field");
		updateModel();
	}
	
	private void buildStable() {
		if(resourceModel.getWoodCount() < 2 || resourceModel.getStableCount() < 1) {
			if(resourceModel.getWoodCount() < 2)
				Window.alert("You do not have enough wood to build a stable!");
			else
				Window.alert("You have only 4 stables.\nYou have no free stable stone anymore.\nYour turn is over now.");
			executeStates();
		} else {
			resourceModel.addRessource(Resource.R_WOOD, -2);
			resourceModel.setStableCount(resourceModel.getStableCount() - 1);
			for(int i=0; i<15; i++) {
				SmallFieldModel m = model.getField(i);
				if(m.getField() == FieldCard.F_NONE){
					m.setSelectable(true);
				} else {
					m.setSelectable(false);
				}
			}
			state = State.BUILD_STABLE;
			display.setInformation("build your stable");
			updateModel();
		}
	}
	
	private void buildHouse() {
		if(resourceModel.getReedCount() < 2) {
			Window.alert("You have not enough reed to build any house!");
			executeStates();
		} else if(model.getField(4).getField() == FieldCard.F_CLAY_HOUSE && resourceModel.getClayCount() < 5) {
			Window.alert("You have not enough clay to build a clay house!");
			executeStates();
		} else if(model.getField(4).getField() == FieldCard.F_STONE_HOUSE && resourceModel.getStoneCount() < 5) {
			Window.alert("You have not enough stone to build a stone house!");
			executeStates();
		} else if(model.getField(4).getField() == FieldCard.F_WOOD_HOUSE && resourceModel.getWoodCount() < 5) {
			Window.alert("You have not enough wood to build a wood house!");
			executeStates();
		} else { // the player has enough resources
			resourceModel.addRessource(Resource.R_REED, -2);
			if(model.getField(4).getField() == FieldCard.F_WOOD_HOUSE) {
				resourceModel.addRessource(Resource.R_WOOD, -5);
			} else if(model.getField(4).getField() == FieldCard.F_CLAY_HOUSE) {
				resourceModel.addRessource(Resource.R_CLAY, -5);
			} else if(model.getField(4).getField() == FieldCard.F_STONE_HOUSE) {
				resourceModel.addRessource(Resource.R_STONE, -5);
			}
			for(int i=0; i<15; i++) {
				SmallFieldModel m = model.getField(i);
				if(m.getField() == FieldCard.F_NONE && !model.isPasture(i) &&
						((i/5 == (i-1)/5) && model.isHouse(i-1) || (i/5 == (i+1)/5) && model.isHouse(i+1) || // houses are next to each other in the same row
								model.isHouse(i-5) || model.isHouse(i+5)) ){ // houses are next to each other in the same column
					m.setSelectable(true);
				} else {
					m.setSelectable(false);
				}
			}
			state = State.BUILD_HOUSE;
			display.setInformation("build your house");
			updateModel();
		}
	}

	private void clearSelection() {
		for(int i=0; i<15; i++) {
			SmallFieldModel m = model.getField(i);
			m.setSelectable(false);
		}
		for(int i=0; i<10; i++) {
			AcquisitionCardModel m = model.getAcquisitation(i);
			if(m != null)
				m.setSelectable(false);
		}
	}
	
	@Override
	public void onClick(ClickEvent event) {
		if(event.getSource() instanceof PushButton) {
			if(((PushButton)event.getSource()).getText().equals("new enclosure")) {
				model.nextFence();
			} else {
				isHarvestSeason = false;
				display.setFeedingFamilyBtnVisible(false);
				model.setAllowBasketMaker(true);
				model.setAllowJoinery(true);
				model.setAllowPottery(true);
				clearSelection();
				feedingFamily();
			}
		} else if(event.getSource() instanceof HasBaseFieldModel && event.getSource() instanceof HasPosition) {
			SmallFieldModel m = (SmallFieldModel) ((HasBaseFieldModel)event.getSource()).getModel();
			int pos = ((HasPosition)event.getSource()).getPosition();
			if(state == State.BUILD_HOUSE) {
				if(m.isSelectable()) {
					m.setField(model.getField(4).getField());
					clearSelection();
					state = State.NONE;
					updateModel();
				} else {
					Window.alert("You can only build a house on the highlighted fields.");
				}
				executeStates();
			} else if(state == State.BUILD_STABLE) {
				if(m.isSelectable()) {
					m.setField(FieldCard.F_STABLE);
					clearSelection();
					state = State.NONE;
					updateModel();
				} else {
					Window.alert("You can only build a house on the highlighted fields.");
				}
				executeStates();
			} else if(state == State.PLOW_FIELD) {
				if(m.isSelectable()) {
					m.setField(FieldCard.F_FIELD);
					clearSelection();
					state = State.NONE;
					updateModel();
				} else {
					Window.alert("You can only build a house on the highlighted fields.");
				}
				executeStates();
			} else if(state == State.BUILD_FENCE) {
				if(m.isSelectable()) {
					int wood = 0;
					wood += (pos /5 == (pos-1) / 5 && model.hasRightFence(pos-1)) ? -1 : pos /5 == (pos-1) / 5 && pos > 0 && model.getField(pos-1).getRightFence() > 0 ? 0 : 1;
					wood += (pos /5 == (pos+1) / 5 && model.hasLeftFence(pos+1)) ? -1 :  pos /5 == (pos+1) / 5 && pos < 14 && model.getField(pos+1).getLeftFence() > 0 ? 0 : 1;
					wood += model.hasTopFence(pos+5) ? -1 : pos<10 && model.getField(pos+5).getTopFence() > 0 ? 0: 1;
					wood += model.hasBottomFence(pos-5) ? -1 : pos > 4 && model.getField(pos-5).getBottomFence() > 0 ? 0 : 1;
					if(resourceModel.getWoodCount() < wood || resourceModel.getFenceCount() < wood) {
						if(resourceModel.getWoodCount() < wood)
							Window.alert("You have not enough wood to build this fence");
						else
							Window.alert("You have not enough fence parts to build this fence");
						clearSelection();
						state = State.NONE;
					} else {
						resourceModel.addRessource(Resource.R_WOOD, -1*wood);
						resourceModel.setFenceCount(resourceModel.getFenceCount() - wood);
						model.setLeftFence(pos, pos / 5 != (pos-1) / 5 || !model.hasRightFence(pos-1));
						if(pos /5 == (pos-1) / 5)
							model.setRightFence(pos-1, false);
						model.setRightFence(pos, pos / 5 != (pos+1) / 5 || !model.hasLeftFence(pos+1));
						if(pos /5 == (pos+1) / 5)
							model.setLeftFence(pos+1, false);
						model.setBottomFence(pos, !model.hasTopFence(pos+5));
						model.setTopFence(pos+5, false);
						model.setTopFence(pos, !model.hasBottomFence(pos-5));
						model.setBottomFence(pos-5, false);
						clearSelection();
						state = State.NONE;
						updateModel();
					}
				} else {
					Window.alert("You can only build a house on the highlighted fields.");
				}
				executeStates();
			} else if(state == State.GET_SHEEP) {
				if(m.isSelectable()) {
					m.setRessource(Resource.R_SHEEP);
					m.setRessourceCount(m.getRessourceCount() + 1);
					clearSelection();
					state = State.NONE;
					updateModel();
				} else {
					Window.alert("You can only build a house on the highlighted fields.");
				}
				executeStates();
			} else if(state == State.SEED_GRAIN) {
				if(m.isSelectable()) {
					m.setRessource(Resource.R_GRAIN);
					m.setRessourceCount(3);
					clearSelection();
					state = State.NONE;
					updateModel();
				} else {
					Window.alert("You can only build a house on the highlighted fields.");
				}
				executeStates();
			} else if(state == State.SEED_VEGETABLE) {
				if(m.isSelectable()) {
					m.setRessource(Resource.R_VEGETABLE);
					m.setRessourceCount(2);
					clearSelection();
					state = State.NONE;
					updateModel();
				} else {
					Window.alert("You can only build a house on the highlighted fields.");
				}
				executeStates();
			} else if(state == State.FAMILY_ADDITION) {
				if(m.isSelectable()) {
					model.setChild(pos);
					m.setChildCount(1);
					clearSelection();
					state = State.NONE;
					updateModel();
				} else {
					Window.alert("You can only build a house on the highlighted fields.");
				}
				executeStates();
			} else if(state == State.GET_BOAR) {
				if(m.isSelectable()) {
					m.setRessource(Resource.R_BOAR);
					m.setRessourceCount(m.getRessourceCount() + 1);
					clearSelection();
					state = State.NONE;
					updateModel();
				} else {
					Window.alert("You can only build a house on the highlighted fields.");
				}
				executeStates();
			} else if(state == State.GET_COW) {
				if(m.isSelectable()) {
					m.setRessource(Resource.R_COW);
					m.setRessourceCount(m.getRessourceCount() + 1);
					clearSelection();
					state = State.NONE;
					updateModel();
				} else {
					Window.alert("You can only build a house on the highlighted fields.");
				}
				executeStates();
			} else if(state == State.FAMILIY_ADDITION_NO_HOUSE) {
				if(m.isSelectable()) {
					model.setChild(pos);
					m.setChildCount(1);
					clearSelection();
					state = State.NONE;
					updateModel();
				} else {
					Window.alert("You can only build a house on the highlighted fields.");
				}
				executeStates();
			} else if(state == State.KILL_ANIMALS_FIREPLACE) {
				if(m.isSelectable()) {
					resourceModel.addRessource(Resource.R_FOOD, m.getRessource() == Resource.R_COW ? 3 : 2);
					m.setRessourceCount(m.getRessourceCount() - 1);
					clearSelection();
					state = State.NONE;
					updateModel();
				} else {
					Window.alert("You can only kill animals on the highlighted fields.");
				}
				executeStates();
			} else if(state == State.KILL_ANIMALS_COOKERY) {
				if(m.isSelectable()) {
					resourceModel.addRessource(Resource.R_FOOD, m.getRessource() == Resource.R_COW ? 4 : 
						m.getRessource() == Resource.R_BOAR ? 3 : 2);
					m.setRessourceCount(m.getRessourceCount() - 1);
					clearSelection();
					state = State.NONE;
					updateModel();
				} else {
					Window.alert("You can only kill animals on the highlighted fields.");
				}
				executeStates();
			}
		} else if(event.getSource() instanceof HasAcquisitionCardModel) {
			HasAcquisitionCardModel ar = (HasAcquisitionCardModel)event.getSource();
			if(ar.getModel().isSelectable() || state == State.NONE) {
				BigAcquisitions ba = ar.getModel().getAcquisition();
				if( (ba == BigAcquisitions.BA_FIRE_PLACE) || (ba == BigAcquisitions.BA_FIRE_PLACE2) ) {
					switch(state) {
					case GET_SHEEP: 
					case GET_BOAR:
						resourceModel.addRessource(Resource.R_FOOD, 2); break;
					case GET_COW:
						resourceModel.addRessource(Resource.R_FOOD, 3); break;
					case BACK_BREAD:
						String input = Window.prompt("How many grain to want to change into food? (1 grain -> 2 food markers)", "1");
						try {
							int nb = Integer.parseInt(input);
							if(resourceModel.getGrainCount() < nb)
								nb = resourceModel.getGrainCount();
							resourceModel.addRessource(Resource.R_GRAIN, -1*nb);
							resourceModel.addRessource(Resource.R_FOOD, 2*nb);
						} catch(Exception e) {
							Window.alert("You should have enter a number, now your turn is over.");
						}
						break;
					case NONE:
						showDialogFirePlaceCookery(State.KILL_ANIMALS_FIREPLACE);
						break;
					default: break;
					}
				} else if( (ba == BigAcquisitions.BA_COOKERY) || (ba == BigAcquisitions.BA_COOKERY2) ) {
					switch(state) {
					case GET_SHEEP:
						resourceModel.addRessource(Resource.R_FOOD, 2); break;
					case GET_BOAR:
						resourceModel.addRessource(Resource.R_FOOD, 3); break;
					case GET_COW:
						resourceModel.addRessource(Resource.R_FOOD, 4); break;
					case BACK_BREAD:
						String input = Window.prompt("How many grain to want to change into food? (1 grain -> 3 food markers)", "1");
						try {
							int nb = Integer.parseInt(input);
							if(nb < 0) nb = 0;
							if(resourceModel.getGrainCount() < nb)
								nb = resourceModel.getGrainCount();
							resourceModel.addRessource(Resource.R_GRAIN, -1*nb);
							resourceModel.addRessource(Resource.R_FOOD, 3*nb);
						} catch(Exception e) {
							Window.alert("You should have enter a number, now your turn is over.");
						}
						break;
					case NONE:
						showDialogFirePlaceCookery(State.KILL_ANIMALS_COOKERY);
						break;
					default: break;
					}
				} else if((ba == BigAcquisitions.BA_CLAY_OVEN) && state == State.BACK_BREAD && resourceModel.getGrainCount() > 0) {
					resourceModel.addRessource(Resource.R_GRAIN, -1);
					resourceModel.addRessource(Resource.R_FOOD, 5);
				} else if((ba == BigAcquisitions.BA_STONE_OVEN) && state == State.BACK_BREAD && resourceModel.getGrainCount() > 0) {
					String input = Window.prompt("Do you want to change ONE or TWO grain into food? (1 grain -> 4 food markers)", "1");
					try {
						int nb = Integer.parseInt(input);
						if(nb < 0) nb = 0;
						if(nb > 2) nb = 2;
						if(resourceModel.getGrainCount() < nb)
							nb = resourceModel.getGrainCount();
						resourceModel.addRessource(Resource.R_GRAIN, -1*nb);
						resourceModel.addRessource(Resource.R_FOOD, 4*nb);
					} catch(Exception e) {
						Window.alert("You should have enter a number, now your turn is over.");
					}
				} else if((ba == BigAcquisitions.BA_JOINERY) && isHarvestSeason) {
					model.setAllowJoinery(false);
					if(resourceModel.getWoodCount()< 1) {
						Window.alert("You have not enough wood!");
					} else {
						resourceModel.addRessource(Resource.R_WOOD, -1);
						resourceModel.addRessource(Resource.R_FOOD, 2);
					}
				} else if((ba == BigAcquisitions.BA_POTTERY) && isHarvestSeason) {
					model.setAllowPottery(false);
					if(resourceModel.getClayCount()< 1) {
						Window.alert("You have not enough wood!");
					} else {
						resourceModel.addRessource(Resource.R_CLAY, -1);
						resourceModel.addRessource(Resource.R_FOOD, 2);
					}
				} else if((ba == BigAcquisitions.BA_BASKET_MAKER) && isHarvestSeason) {
					model.setAllowBasketMaker(false);
					if(resourceModel.getClayCount()< 1) {
						Window.alert("You have not enough wood!");
					} else {
						resourceModel.addRessource(Resource.R_REED, -1);
						resourceModel.addRessource(Resource.R_FOOD, 3);
					}
				}
			} else {
				Window.alert("You can only select highlighted cards.");
			}
			clearSelection();
			state = State.NONE;
			updateModel();
			executeStates();
		}
	}
	private void showDialogFirePlaceCookery(final State s) {
		final DialogBox dlg = new DialogBox(false, true);
		Grid grid = new Grid(4, 2);
		grid.setHTML(0, 0, "How many resources do you want to change to food:");
		grid.setHTML(1, 0, "How many <b>animals</b> do you want to kill?");
		final IntegerBox animals = new IntegerBox();
		animals.setValue(0);
		grid.setWidget(1, 1, animals);
		grid.setHTML(2, 0, "How many <b>vegetables</b> do you want to eat?");
		final IntegerBox vegetables = new IntegerBox();
		vegetables.setValue(0);
		grid.setWidget(2, 1, vegetables);
		Button ok = new Button("OK");
		ok.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				dlg.hide();
				EventBus.fire(new ShowingDialogEvent(false));
				// TODO make other things gray
				int veg = vegetables.getValue();
				if(resourceModel.getVegetableCount() < veg)
					veg = resourceModel.getVegetableCount();
				resourceModel.addRessource(Resource.R_VEGETABLE, -1*veg);
				resourceModel.addRessource(Resource.R_FOOD, s == State.KILL_ANIMALS_FIREPLACE ? 2*veg : 3*veg);
				for(int i=0; i<animals.getValue(); i++) {
					states.add(s);
				}
				executeStates();
			}
		});
		grid.setWidget(3, 1, ok);
		dlg.setWidget(grid);
		EventBus.fire(new ShowingDialogEvent(true));
		dlg.show();
	}

	@Override
	public void onShowingDialog(ShowingDialogEvent event) {
		isShowingDialog = event.isShowingDialog();
		if(!isShowingDialog && souldHarvestSeasonStart) {
			souldHarvestSeasonStart = false;
			childFinishedWorking();
		}
	}

	private static Type<PlayerFieldPresenter> TYPE = new Type<PlayerFieldPresenter>("PlayerFieldPresenter");
	@Override
	public Activity.Type<?> getActivityKey() {
		return TYPE;
	}

	@Override
	public PlayerFieldModel getActualHistory() {
		return model.clone();
	}

	@Override
	public void setActualHistory(PlayerFieldModel state) {
		model.update(state);
		display.update(model);
	}

}
