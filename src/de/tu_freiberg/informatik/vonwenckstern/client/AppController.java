package de.tu_freiberg.informatik.vonwenckstern.client;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.IntegerBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

import de.tu_freiberg.informatik.vonwenckstern.client.event.AddResourceEvent;
import de.tu_freiberg.informatik.vonwenckstern.client.event.AddResourceEvent.AddResourceHandler;
import de.tu_freiberg.informatik.vonwenckstern.client.event.AddResourceEvent.RessourceItem;
import de.tu_freiberg.informatik.vonwenckstern.client.event.BuildFenceEvent;
import de.tu_freiberg.informatik.vonwenckstern.client.event.BuildFenceEvent.BuildFenceHandler;
import de.tu_freiberg.informatik.vonwenckstern.client.event.BuildHouseEvent;
import de.tu_freiberg.informatik.vonwenckstern.client.event.BuildHouseEvent.BuildHouseHandler;
import de.tu_freiberg.informatik.vonwenckstern.client.event.EnableBigAcquisitionEvent;
import de.tu_freiberg.informatik.vonwenckstern.client.event.EnableBigAcquisitionEvent.EnableBigAcquisitionHandler;
import de.tu_freiberg.informatik.vonwenckstern.client.event.FamilyAdditionEvent;
import de.tu_freiberg.informatik.vonwenckstern.client.event.FamilyAdditionEvent.FamilyAdditionHandler;
import de.tu_freiberg.informatik.vonwenckstern.client.event.FamilyAdditionWithoutHouseEvent;
import de.tu_freiberg.informatik.vonwenckstern.client.event.FamilyAdditionWithoutHouseEvent.FamilyAdditionWithoutHouseHandler;
import de.tu_freiberg.informatik.vonwenckstern.client.event.GetBigAcquisitionEvent;
import de.tu_freiberg.informatik.vonwenckstern.client.event.GetBigAcquisitionEvent.GetBigAcquisitionHandler;
import de.tu_freiberg.informatik.vonwenckstern.client.event.GetBoarEvent;
import de.tu_freiberg.informatik.vonwenckstern.client.event.GetBoarEvent.GetBoarHandler;
import de.tu_freiberg.informatik.vonwenckstern.client.event.GetCowEvent;
import de.tu_freiberg.informatik.vonwenckstern.client.event.GetCowEvent.GetCowHandler;
import de.tu_freiberg.informatik.vonwenckstern.client.event.GetSheepEvent;
import de.tu_freiberg.informatik.vonwenckstern.client.event.GetSheepEvent.GetSheepHandler;
import de.tu_freiberg.informatik.vonwenckstern.client.event.NextRoundEvent;
import de.tu_freiberg.informatik.vonwenckstern.client.event.NextRoundEvent.NextRoundHandler;
import de.tu_freiberg.informatik.vonwenckstern.client.event.PlayerFieldDoneEvent;
import de.tu_freiberg.informatik.vonwenckstern.client.event.PlayerFieldDoneEvent.PlayerFieldDoneHandler;
import de.tu_freiberg.informatik.vonwenckstern.client.event.PlowFieldEvent;
import de.tu_freiberg.informatik.vonwenckstern.client.event.PlowFieldEvent.PlowFieldHandler;
import de.tu_freiberg.informatik.vonwenckstern.client.event.PlowFieldSeedEvent;
import de.tu_freiberg.informatik.vonwenckstern.client.event.PlowFieldSeedEvent.PlowFieldSeedHandler;
import de.tu_freiberg.informatik.vonwenckstern.client.event.RestaurateAndFenceEvent;
import de.tu_freiberg.informatik.vonwenckstern.client.event.RestaurateAndFenceEvent.RestaurateAndFenceHandler;
import de.tu_freiberg.informatik.vonwenckstern.client.event.RestaurateEvent;
import de.tu_freiberg.informatik.vonwenckstern.client.event.RestaurateEvent.RestaurateHandler;
import de.tu_freiberg.informatik.vonwenckstern.client.event.SeedEvent;
import de.tu_freiberg.informatik.vonwenckstern.client.event.SeedEvent.SeedHandler;
import de.tu_freiberg.informatik.vonwenckstern.client.event.ShowingDialogEvent;
import de.tu_freiberg.informatik.vonwenckstern.client.model.AcquisitionCardModel;
import de.tu_freiberg.informatik.vonwenckstern.client.model.BigAcquisitationsModel;
import de.tu_freiberg.informatik.vonwenckstern.client.model.BigAcquisitions;
import de.tu_freiberg.informatik.vonwenckstern.client.model.CardFieldModel;
import de.tu_freiberg.informatik.vonwenckstern.client.model.Player;
import de.tu_freiberg.informatik.vonwenckstern.client.model.PlayerFieldModel;
import de.tu_freiberg.informatik.vonwenckstern.client.model.PlayerResourceModel;
import de.tu_freiberg.informatik.vonwenckstern.client.model.Resource;
import de.tu_freiberg.informatik.vonwenckstern.client.model.Rounds1To7Model;
import de.tu_freiberg.informatik.vonwenckstern.client.model.Rounds8To14Model;
import de.tu_freiberg.informatik.vonwenckstern.client.presenter.BigAcquisitionsPresenter;
import de.tu_freiberg.informatik.vonwenckstern.client.presenter.CardFieldPresenter;
import de.tu_freiberg.informatik.vonwenckstern.client.presenter.InfoViewPresenter;
import de.tu_freiberg.informatik.vonwenckstern.client.presenter.PlayerFieldPresenter;
import de.tu_freiberg.informatik.vonwenckstern.client.presenter.PlayerFieldPresenter.State;
import de.tu_freiberg.informatik.vonwenckstern.client.presenter.Presenter;
import de.tu_freiberg.informatik.vonwenckstern.client.presenter.Rounds1To7Presenter;
import de.tu_freiberg.informatik.vonwenckstern.client.presenter.Rounds8To14Presenter;
import de.tu_freiberg.informatik.vonwenckstern.client.view.ViewFactory;

public class AppController implements Presenter, AddResourceHandler, BuildHouseHandler, PlayerFieldDoneHandler, PlowFieldHandler,
	BuildFenceHandler, FamilyAdditionHandler, RestaurateHandler, SeedHandler, GetSheepHandler, GetBoarHandler, GetCowHandler, PlowFieldSeedHandler,
	FamilyAdditionWithoutHouseHandler, RestaurateAndFenceHandler, NextRoundHandler, GetBigAcquisitionHandler, EnableBigAcquisitionHandler {
	
	public interface Display {
		public void setLeftWidget(Widget w);
		public void setMiddleWidget(Widget w);
		public void setTopWidget(Widget w);
		public void setBottomWidget(Widget w);
		public void setRightWidget(Widget w);
		public void setInfoWidget(Widget w);
		public void setForcePlayerField(boolean b);
		public void setForceBigAcquisitationField(boolean b);
		public boolean isBigAcquisitationFieldEnabled();
		public Widget asWidget();
	}
	
	private Display display = null;
	private Presenter leftPresenter = null;
	private Presenter infoPresenter = null;
	private Presenter middlePresenter = null;
	private Presenter bottomPresenter = null;
	private Presenter rightPresenter = null;
	private Presenter topPresenter = null;
	
	private Player player = Player.BLUE;
	private PlayerFieldModel playerModel = new PlayerFieldModel(player);
	private PlayerResourceModel resourceModel = new PlayerResourceModel();
	
	public AppController(Display display, Player player) {
		this.display = display;
		this.player = player;
		ViewFactory vf = ViewFactory.Util.getViewFactory();
		leftPresenter = new CardFieldPresenter(vf.getCardFieldView(), player, new CardFieldModel());
		middlePresenter = new Rounds1To7Presenter(vf.getRounds1To7View(), player, new Rounds1To7Model());
		infoPresenter = new InfoViewPresenter(vf.getInfoView(), resourceModel);
		rightPresenter = new PlayerFieldPresenter(vf.getPlayerFieldView(), playerModel, resourceModel);
		bottomPresenter = new Rounds8To14Presenter(vf.getRounds8To14View(), player, new Rounds8To14Model());
		topPresenter = new BigAcquisitionsPresenter(vf.getAcquisitionsView(), new BigAcquisitationsModel());
		updateView();
		bind();
	}
	
	private void bind() {
		EventBus.getEventBus().addAddResourceHandler(this);
		EventBus.getEventBus().addBuildHouseHandler(this);
		EventBus.getEventBus().addPlayerFieldDoneHandler(this);
		EventBus.getEventBus().addPlowFieldHandler(this);
		EventBus.getEventBus().addBuildFenceHandler(this);
		EventBus.getEventBus().addFamilyAdditionHandler(this);
		EventBus.getEventBus().addRestaurateHandler(this);
		EventBus.getEventBus().addSeedHandler(this);
		EventBus.getEventBus().addGetSheepHandler(this);
		EventBus.getEventBus().addGetBoarHandler(this);
		EventBus.getEventBus().addGetCowHandler(this);
		EventBus.getEventBus().addPlowFieldSeedHandler(this);
		EventBus.getEventBus().addFamilyAdditionWithoutHouseHandler(this);
		EventBus.getEventBus().addRestaurateAndFenceHandler(this);
		EventBus.getEventBus().addNextRoundHandler(this);
		EventBus.getEventBus().addGetBigAcquisitionHandler(this);
		EventBus.getEventBus().addEnableBigAcquisitionHandler(this);
	}
	
	private void updateView() {
		if(leftPresenter != null) {
			display.setLeftWidget(leftPresenter.getView());
		}
		if(middlePresenter != null) {
			display.setMiddleWidget(middlePresenter.getView());
		}
		if(infoPresenter != null) {
			display.setInfoWidget(infoPresenter.getView());
		}
		if(bottomPresenter != null) {
			display.setBottomWidget(bottomPresenter.getView());
		}
		if(rightPresenter != null) {
			display.setRightWidget(rightPresenter.getView());
		}
		if(topPresenter != null) {
			display.setTopWidget(topPresenter.getView());
		}
//		display.setMiddleWidget(new Rounds1To7View());
//		display.setInfoWidget(new InfoView());
	}

	@Override
	public Widget getView() {
		return display.asWidget();
	}

	@Override
	public void onAddResource(AddResourceEvent event) {
		if(infoPresenter instanceof InfoViewPresenter) {
			for(RessourceItem item : event.getItems()) {
				resourceModel.addRessource(item.res, item.resCount);
			}
		}
	}

	@Override
	public void onBuildHouse(BuildHouseEvent event) {
		if(rightPresenter instanceof PlayerFieldPresenter) {
			final DialogBox dlg = new DialogBox(false, true);
			Grid grid = new Grid(4, 2);
			grid.setHTML(0, 0, "Make your choice:");
			grid.setHTML(1, 0, "Do you want to build a house?");
			final CheckBox buildHouse = new CheckBox("house");
			buildHouse.setValue(true);
			grid.setWidget(1, 1, buildHouse);
			grid.setHTML(2, 0, "How many stables do you want?");
			final IntegerBox stables = new IntegerBox();
			stables.setValue(0);
			grid.setWidget(2, 1, stables);
			Button ok = new Button("OK");
			ok.addClickHandler(new ClickHandler() {
				@Override
				public void onClick(ClickEvent event) {
					dlg.hide();
					EventBus.fire(new ShowingDialogEvent(false));
					display.setForcePlayerField(true);
					if(buildHouse.getValue()) {
						((PlayerFieldPresenter) rightPresenter).addState(State.BUILD_HOUSE);
					}
					for(int i=0; i<stables.getValue() && i<10; i++) {
						((PlayerFieldPresenter) rightPresenter).addState(State.BUILD_STABLE);
					}
					((PlayerFieldPresenter) rightPresenter).executeStates();
				}
			});
			grid.setWidget(3, 1, ok);
			dlg.setWidget(grid);
			EventBus.fire(new ShowingDialogEvent(true));
			dlg.show();
		}
	}

	@Override
	public void onPlayerFieldDone(PlayerFieldDoneEvent event) {
		display.setForcePlayerField(false);
	}

	@Override
	public void onPlowField(PlowFieldEvent event) {
		display.setForcePlayerField(true);
		((PlayerFieldPresenter) rightPresenter).addState(State.PLOW_FIELD);
		((PlayerFieldPresenter) rightPresenter).executeStates();
	}

	@Override
	public void onSeeding(SeedEvent event) {
		if(rightPresenter instanceof PlayerFieldPresenter) {
			final DialogBox dlg = new DialogBox(false, true);
			Grid grid = new Grid(5, 2);
			grid.setHTML(0, 0, "Make your choice:");
			grid.setHTML(1, 0, "Do you want to back bread?");
			final CheckBox backBread = new CheckBox("back bread");
			backBread.setValue(false);
			grid.setWidget(1, 1, backBread);
			grid.setHTML(2, 0, "How many <b>grain</b> fields should get seeded?");
			final IntegerBox grains = new IntegerBox();
			grains.setValue(1);
			grid.setWidget(2, 1, grains);
			grid.setHTML(3, 0, "How many <b>vegetable</b> fields should get seeded?");
			final IntegerBox vegetables = new IntegerBox();
			vegetables.setValue(0);
			grid.setWidget(3, 1, vegetables);
			Button ok = new Button("OK");
			ok.addClickHandler(new ClickHandler() {
				@Override
				public void onClick(ClickEvent event) {
					dlg.hide();
					EventBus.fire(new ShowingDialogEvent(false));
					display.setForcePlayerField(true);
					if(backBread.getValue()) {
						((PlayerFieldPresenter) rightPresenter).addState(State.BACK_BREAD);
					}
					for(int i=0; i<grains.getValue() && i<10; i++) {
						((PlayerFieldPresenter) rightPresenter).addState(State.SEED_GRAIN);
					}
					for(int i=0; i<vegetables.getValue() && i<10; i++) {
						((PlayerFieldPresenter) rightPresenter).addState(State.SEED_VEGETABLE);
					}
					((PlayerFieldPresenter) rightPresenter).executeStates();
				}
			});
			grid.setWidget(4, 1, ok);
			dlg.setWidget(grid);
			EventBus.fire(new ShowingDialogEvent(true));
			dlg.show();
		}
	}

	@Override
	public void onRestaurate(RestaurateEvent event) {
		((PlayerFieldPresenter) rightPresenter).addState(State.RESTAURATE);
		if(Window.confirm("Do you want to make a big acquisitation after restaurating your rooms?")) {
			onEnablingBigAcquisition(null);
		}
		display.setForcePlayerField(true);
		((PlayerFieldPresenter) rightPresenter).executeStates();	
	}

	@Override
	public void onFamilyAddition(FamilyAdditionEvent event) {
		display.setForcePlayerField(true);
		((PlayerFieldPresenter) rightPresenter).addState(State.FAMILY_ADDITION);
		((PlayerFieldPresenter) rightPresenter).executeStates();
	}

	@Override
	public void onBuildFence(BuildFenceEvent event) {
		String res = Window.prompt("How many fields do you want to fence?", "1");
		try {
			int amount = Integer.parseInt(res);
			for(int i=0; i<amount && i<20; i++) {
				((PlayerFieldPresenter) rightPresenter).addState(State.BUILD_FENCE);
			}
			display.setForcePlayerField(true);
			((PlayerFieldPresenter) rightPresenter).executeStates();
		} catch(Exception e) { 
			Window.alert("You have to enter a number");
			onBuildFence(event);
		}
	}

	@Override
	public void onGettingSheep(GetSheepEvent event) {
		for(int i=0; i<event.getSheepCount(); i++) {
			((PlayerFieldPresenter) rightPresenter).addState(State.GET_SHEEP);
		}
		display.setForcePlayerField(true);
		((PlayerFieldPresenter) rightPresenter).executeStates();
	}

	@Override
	public void onRestaurateAndBuildFence(RestaurateAndFenceEvent event) {
		((PlayerFieldPresenter) rightPresenter).addState(State.RESTAURATE);
		String res = Window.prompt("How many fields do you want to fence after restaurating your rooms?", "0");
		try {
			int amount = Integer.parseInt(res);
			for(int i=0; i<amount && i<20; i++) {
				((PlayerFieldPresenter) rightPresenter).addState(State.BUILD_FENCE);
			}
			display.setForcePlayerField(true);
			((PlayerFieldPresenter) rightPresenter).executeStates();
		} catch(Exception e) { 
			Window.alert("You did not enter a number, so you will build no fence.");
		}
		display.setForcePlayerField(true);
		((PlayerFieldPresenter) rightPresenter).executeStates();	
	}

	@Override
	public void onFamilyAdditionWithoutHouse(FamilyAdditionWithoutHouseEvent event) {
		((PlayerFieldPresenter) rightPresenter).addState(State.FAMILIY_ADDITION_NO_HOUSE);
		display.setForcePlayerField(true);
		((PlayerFieldPresenter) rightPresenter).executeStates();
	}

	@Override
	public void onPlowFieldAndSeed(PlowFieldSeedEvent event) {
		if(rightPresenter instanceof PlayerFieldPresenter) {
			final DialogBox dlg = new DialogBox(false, true);
			Grid grid = new Grid(5, 2);
			grid.setHTML(0, 0, "Make your choice:");
			grid.setHTML(1, 0, "Do you want to plow one field?");
			final CheckBox plowField = new CheckBox("plow field");
			plowField.setValue(true);
			grid.setWidget(1, 1, plowField);
			grid.setHTML(2, 0, "How many <b>grain</b> fields should get seeded?");
			final IntegerBox grains = new IntegerBox();
			grains.setValue(0);
			grid.setWidget(2, 1, grains);
			grid.setHTML(3, 0, "How many <b>vegetable</b> fields should get seeded?");
			final IntegerBox vegetables = new IntegerBox();
			vegetables.setValue(0);
			grid.setWidget(3, 1, vegetables);
			Button ok = new Button("OK");
			ok.addClickHandler(new ClickHandler() {
				@Override
				public void onClick(ClickEvent event) {
					dlg.hide();
					EventBus.fire(new ShowingDialogEvent(false));
					display.setForcePlayerField(true);
					if(plowField.getValue()) {
						((PlayerFieldPresenter) rightPresenter).addState(State.PLOW_FIELD);
					}
					for(int i=0; i<grains.getValue() && i<10; i++) {
						((PlayerFieldPresenter) rightPresenter).addState(State.SEED_GRAIN);
					}
					for(int i=0; i<vegetables.getValue() && i<10; i++) {
						((PlayerFieldPresenter) rightPresenter).addState(State.SEED_VEGETABLE);
					}
					((PlayerFieldPresenter) rightPresenter).executeStates();
				}
			});
			grid.setWidget(4, 1, ok);
			dlg.setWidget(grid);
			EventBus.fire(new ShowingDialogEvent(true));
			dlg.show();
		}
	}

	@Override
	public void onGettingCow(GetCowEvent event) {
		for(int i=0; i<event.getCowCount(); i++) {
			((PlayerFieldPresenter) rightPresenter).addState(State.GET_COW);
		}
		display.setForcePlayerField(true);
		((PlayerFieldPresenter) rightPresenter).executeStates();
	}

	@Override
	public void onGettingBoar(GetBoarEvent event) {
		for(int i=0; i<event.getBoarCount(); i++) {
			((PlayerFieldPresenter) rightPresenter).addState(State.GET_BOAR);
		}
		display.setForcePlayerField(true);
		((PlayerFieldPresenter) rightPresenter).executeStates();
	}

	@Override
	public void onNextRound(NextRoundEvent event) {
		int rnd = event.getRound();
		System.out.println("round: " + rnd);
		if(rnd > 14) {
			Grid g = new Grid(16, 2);
			g.setHTML(0, 0, "Fields: ");
			int pointsFields = playerModel.countFields() - 1;
			if(pointsFields == 0) pointsFields = -1;
			if(pointsFields > 4) pointsFields = 4;
			g.setHTML(0, 1, pointsFields+"");
			
			g.setHTML(1, 0, "pastures: ");
			int pointsPastures = playerModel.countPastures();
			if(pointsPastures == 0) pointsPastures = -1;
			if(pointsPastures > 4) pointsPastures = 4;
			g.setHTML(1, 1, pointsPastures+"");
			
			g.setHTML(2, 0, "Grains: ");
			int grains = resourceModel.getGrainCount() + playerModel.countGrainsOnFields();
			int pointsGrains = grains < 1 ? -1 : grains < 4 ? 1 : grains < 6 ? 2 : grains < 8 ? 3 : 4;
			g.setHTML(2, 1, pointsGrains+"");
			
			g.setHTML(3, 0, "Vegetables: ");
			int pointsVegetables = resourceModel.getVegetableCount() + playerModel.countVegetablesOnFields();
			if(pointsVegetables == 0) pointsVegetables = -1;
			if(pointsVegetables > 4) pointsVegetables = 4;
			g.setHTML(3, 1, pointsVegetables+"");
			
			g.setHTML(4, 0, "Sheep: ");
			int sheep = playerModel.countSheep();
			int pointsSheep = sheep < 1 ? -1 : sheep < 4 ? 1 : sheep < 6 ? 2 : sheep < 8 ? 3 : 4;
			g.setHTML(4, 1, pointsSheep+"");
			
			g.setHTML(5, 0, "Boars: ");
			int boars = playerModel.countBoars();
			int pointsBoars = boars < 1 ? -1 : boars < 3 ? 1 : boars < 5 ? 2 : boars < 7 ? 3 : 4;
			g.setHTML(5, 1, pointsBoars+"");
			
			g.setHTML(6, 0, "Cows: ");
			int cows = playerModel.countCows();
			int pointsCows = cows < 1 ? -1 : cows < 2 ? 1 : cows < 4 ? 2 : cows < 6 ? 3 : 4;
			g.setHTML(6, 1, pointsCows+"");
			
			g.setHTML(7, 0, "Unused fields: ");
			int pointsUnusedFields = -1*playerModel.countUnusedFields();
			g.setHTML(7, 1, pointsUnusedFields+"");
			
			g.setHTML(8, 0, "Fenced stables: ");
			int pointsFencedStables = playerModel.countFencedStables();
			g.setHTML(8, 1, pointsFencedStables+"");
			
			g.setHTML(9, 0, "Clay houses: ");
			int pointsClayHouses = playerModel.countClayHouses();
			g.setHTML(9, 1, pointsClayHouses+"");
			
			g.setHTML(10, 0, "Stone houses: ");
			int pointsStoneHouses = 2*playerModel.countStoneHouses();
			g.setHTML(10, 1, pointsStoneHouses+"");
			
			g.setHTML(11, 0, "Family members: ");
			int pointsFamily = 3*playerModel.countPersons();
			g.setHTML(11, 1, pointsFamily+"");
			
			g.setHTML(12, 0, "Card points: ");
			int pointsCards = playerModel.countCardPoints();
			g.setHTML(12, 1, pointsCards+"");
			
			int pointsExtra = 0;
			for(int i=0; i<10; i++) {
				AcquisitionCardModel a = playerModel.getAcquisitation(i);
				if(a == null)
					break;
				BigAcquisitions ba = a.getAcquisition();
				if(ba == BigAcquisitions.BA_POTTERY) {
					int c = resourceModel.getClayCount();
					pointsExtra += c>6 ? 3 : c>4 ? 2 : c>2 ? 1 : 0; 
				} else if(ba == BigAcquisitions.BA_BASKET_MAKER) {
					int r = resourceModel.getReedCount();
					pointsExtra += r>4 ? 3 : r>3 ? 2 : r>1 ? 1 : 0;
				} else if(ba == BigAcquisitions.BA_JOINERY) {
					int w = resourceModel.getWoodCount();
					pointsExtra += w>6 ? 3 : w>4 ? 2 : w>2 ? 1 : 0; 
				}
			}
			g.setHTML(13, 0, "Extra points: ");
			g.setHTML(13, 1, pointsExtra+"");
			
			g.setHTML(14, 0, "Beggar points: ");
			int pointsBeggar = -3*resourceModel.getBeggerCards();
			g.setHTML(14, 1, pointsBeggar+"");
			
			g.setHTML(15, 0, "Total number of points: ");
			int total = pointsFields + pointsPastures + pointsGrains + pointsVegetables + pointsSheep + pointsBoars + pointsCows + pointsUnusedFields +
					pointsFencedStables + pointsClayHouses + pointsStoneHouses + pointsFamily + pointsCards + pointsExtra + pointsBeggar;
			g.setHTML(15, 1, "<b>"+total+"</b>");
			DialogBox dlg = new DialogBox(false, true);
			VerticalPanel panel = new VerticalPanel();
			panel.add(new HTML("<h1>Your score: </h1>"));
			panel.add(g);
			Button btn = new Button("restart game");
			panel.add(btn);
			btn.addClickHandler(new ClickHandler() {
				@Override
				public void onClick(ClickEvent event) {
					Window.Location.reload();
				}
			});
			dlg.setWidget(panel);
			dlg.show();
		}
	}

	@Override
	public void onGetBigAcquisition(GetBigAcquisitionEvent event) {
		if(!display.isBigAcquisitationFieldEnabled()) {
			Window.alert("The big acquisitation field is disabled.\nEnable this field by using the field card 1 big acquisitation - it is coming in round 1,2,3 or 4.");
			return;
		}
		BigAcquisitions ba = event.getAcquisition().getAcquisition();
		if(
				(ba == BigAcquisitions.BA_FIRE_PLACE) && (resourceModel.getClayCount() < 2) ||
				(ba == BigAcquisitions.BA_FIRE_PLACE2) && (resourceModel.getClayCount() < 3) ||
				(ba == BigAcquisitions.BA_COOKERY) && (resourceModel.getClayCount() < 4) ||
				(ba == BigAcquisitions.BA_COOKERY2) && (resourceModel.getClayCount() < 5) ||
				(ba == BigAcquisitions.BA_FOUNTAIN) && (resourceModel.getWoodCount() < 1 || resourceModel.getStoneCount() < 3) ||
				
				(ba == BigAcquisitions.BA_CLAY_OVEN) && (resourceModel.getClayCount() < 3 || resourceModel.getStoneCount() < 1) ||
				(ba == BigAcquisitions.BA_STONE_OVEN) && (resourceModel.getClayCount() < 1 || resourceModel.getStoneCount() < 3) ||
				(ba == BigAcquisitions.BA_JOINERY) && (resourceModel.getStoneCount() < 2 || resourceModel.getStoneCount() < 2) ||
				(ba == BigAcquisitions.BA_POTTERY) && (resourceModel.getClayCount() < 2 || resourceModel.getStoneCount() < 2) ||
				(ba == BigAcquisitions.BA_BASKET_MAKER) && (resourceModel.getReedCount() < 2 || resourceModel.getStoneCount() < 2)
		) {
			Window.alert("You have not enough resources to buy the big acquisitation.\nYour turn is over now.");
		} else {
			switch(ba) {
			case BA_FIRE_PLACE: resourceModel.addRessource(Resource.R_CLAY, -2); break;
			case BA_FIRE_PLACE2: resourceModel.addRessource(Resource.R_CLAY, -3); break;
			case BA_COOKERY: resourceModel.addRessource(Resource.R_CLAY, -4); break;
			case BA_COOKERY2: resourceModel.addRessource(Resource.R_CLAY, -5); break;
			case BA_FOUNTAIN: resourceModel.addRessource(Resource.R_WOOD, -1); resourceModel.addRessource(Resource.R_STONE, -3); resourceModel.addRessource(Resource.R_FOOD, 5); break;
			
			case BA_CLAY_OVEN: resourceModel.addRessource(Resource.R_CLAY, -3); resourceModel.addRessource(Resource.R_STONE, -1); break;
			case BA_STONE_OVEN: resourceModel.addRessource(Resource.R_CLAY, -1); resourceModel.addRessource(Resource.R_STONE, -3); break;
			case BA_JOINERY: resourceModel.addRessource(Resource.R_WOOD, -2); resourceModel.addRessource(Resource.R_STONE, -2); break;
			case BA_POTTERY: resourceModel.addRessource(Resource.R_CLAY, -2); resourceModel.addRessource(Resource.R_STONE, -2); break;
			case BA_BASKET_MAKER: resourceModel.addRessource(Resource.R_REED, -2); resourceModel.addRessource(Resource.R_STONE, -2); break;
			case BA_NONE: break;
			}
			((PlayerFieldPresenter) rightPresenter).addBigAcquisitation(event.getAcquisition());
			((BigAcquisitionsPresenter) topPresenter).hideAcquisition(ba);
		}
		display.setForceBigAcquisitationField(false);
		((PlayerFieldPresenter) rightPresenter).setGettingBigAcquisitation(false);
	}

	@Override
	public void onEnablingBigAcquisition(EnableBigAcquisitionEvent event) {
		((PlayerFieldPresenter) rightPresenter).setGettingBigAcquisitation(true);
		display.setForceBigAcquisitationField(true);
	}
}
