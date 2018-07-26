package de.tu_freiberg.informatik.vonwenckstern.client.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

import de.tu_freiberg.informatik.vonwenckstern.client.model.PlayerFieldModel.PastureInfo.Animal;

public class PlayerFieldModel implements Serializable {
	private static final long serialVersionUID = 1L;
	private int fenceId = 1;
	private SmallFieldModel[] fields = null;
	private AcquisitionCardModel[] acquisitations = new AcquisitionCardModel[] {null, null, null, null, null, null, null, null, null, null};
	private transient Player player;
	private boolean allowJoinery = true;
	private boolean allowPottery = true;
	private boolean allowBasketMaker = true;
	int round = 1;
	
	public int getRound() {
		return round;
	}

	public void setRound(int round) {
		this.round = round;
	}
	
	public void increaseRound() {
		round++;
	}

	public boolean equals(Object o) {
		if( !(o instanceof PlayerFieldModel)) {
			return false;
		}
		PlayerFieldModel pm = (PlayerFieldModel)o;
		return fenceId == pm.fenceId && Arrays.equals(fields, pm.fields) && Arrays.equals(acquisitations, pm.acquisitations) && player == pm.player && 
				allowJoinery == pm.allowJoinery && allowPottery == pm.allowPottery && allowBasketMaker == pm.allowBasketMaker && round == pm.round;
	}
	
	public void update(PlayerFieldModel model) {
		if(model == null) return;
		fields = new SmallFieldModel[model.fields.length];
		for(int i=0; i<model.fields.length ; i++) {
			SmallFieldModel sm = model.fields[i];
			if(sm == null)
				fields[i] = null;
			else
				fields[i] = new SmallFieldModel(sm.getField(), sm.getLeftFence(), sm.getRightFence(), sm.getTopFence(), sm.getBottomFence(), sm.isSelectable(), sm.getPersonsCount(), sm.getPersonsAtWork(),
						sm.getRessource(), sm.getRessourceCount(), sm.getChild(), sm.getDescription(), sm.getId(), player);
		}
		acquisitations = new AcquisitionCardModel[model.acquisitations.length];
		for(int i=0; i<model.acquisitations.length; i++) {
			AcquisitionCardModel am = model.acquisitations[i];
			if(am == null)
				acquisitations[i] = null;
			else
				acquisitations[i] = new AcquisitionCardModel(am.getAcquisition(), am.isVisible());
		}
		allowJoinery = model.allowJoinery;
		allowPottery = model.allowPottery;
		allowBasketMaker = model.allowBasketMaker;
		round = model.round;
	}
	
	public PlayerFieldModel clone() {
		PlayerFieldModel pm = new PlayerFieldModel(this.player);
		pm.fields = new SmallFieldModel[fields.length];
		for(int i=0; i<fields.length ; i++) {
			SmallFieldModel sm = fields[i];
			if(sm == null)
				pm.fields[i] = null;
			else
				pm.fields[i] = new SmallFieldModel(sm.getField(), sm.getLeftFence(), sm.getRightFence(), sm.getTopFence(), sm.getBottomFence(), sm.isSelectable(), sm.getPersonsCount(), sm.getPersonsAtWork(),
						sm.getRessource(), sm.getRessourceCount(), sm.getChild(), sm.getDescription(), sm.getId(), sm.getPlayer());
		}
		pm.acquisitations = new AcquisitionCardModel[acquisitations.length];
		for(int i=0; i<acquisitations.length; i++) {
			AcquisitionCardModel am = acquisitations[i];
			if(am == null)
				pm.acquisitations[i] = null;
			else
				pm.acquisitations[i] = new AcquisitionCardModel(am.getAcquisition(), am.isVisible());
		}
		pm.allowJoinery = allowJoinery;
		pm.allowPottery = allowPottery;
		pm.allowBasketMaker = allowBasketMaker;
		pm.round = round;
		return pm;
	}
	
	public boolean isAllowJoinery() {
		return allowJoinery;
	}

	public void setAllowJoinery(boolean allowJoinery) {
		this.allowJoinery = allowJoinery;
	}

	public boolean isAllowPottery() {
		return allowPottery;
	}

	public void setAllowPottery(boolean allowPottery) {
		this.allowPottery = allowPottery;
	}

	public boolean isAllowBasketMaker() {
		return allowBasketMaker;
	}

	public void setAllowBasketMaker(boolean allowBasketMaker) {
		this.allowBasketMaker = allowBasketMaker;
	}

	public PlayerFieldModel() {
		this(Player.BLUE);
	}
	
	public PlayerFieldModel(Player player) {
		this.player = player;
		fields = new SmallFieldModel[15];
		for(int i=0; i<15; i++) {
			fields[i] = new SmallFieldModel(player);
		}
		fields[4].setField(FieldCard.F_WOOD_HOUSE);
		fields[4].setPersonsCount(1);
		setChild(4);
		fields[9].setField(FieldCard.F_WOOD_HOUSE);
		fields[9].setPersonsCount(1);
		setChild(9);
	}
	
	public void addAcquisitation(AcquisitionCardModel acquisition) {
		for(int i=0; i<10; i++) {
			if(acquisitations[i] == null) {
				acquisitations[i] = acquisition;
				break;
			}
		}
	}
	
	public static enum AcquisitationType {
		CHANGE, BACK_BREAD, HARVEST_SEASON
	}
	
	/** 
	 * @return true, if one more card could get selected; otherwise false
	 * */
	public boolean selectAcquisitationCards(AcquisitationType type) {
		boolean ret = false;
		for(int i=0; i<10; i++) {
			AcquisitionCardModel m = acquisitations[i];
			if(m == null)
				break;
			BigAcquisitions ba = m.getAcquisition();
			if(( ba ==  BigAcquisitions.BA_FIRE_PLACE ||
				 ba == BigAcquisitions.BA_FIRE_PLACE2 ||
				 ba == BigAcquisitions.BA_COOKERY ||
				 ba == BigAcquisitions.BA_COOKERY2
					) && (type == AcquisitationType.CHANGE || type == AcquisitationType.BACK_BREAD || type == AcquisitationType.HARVEST_SEASON)) {
				m.setSelectable(true);
				ret = true;
			} else if(( ba == BigAcquisitions.BA_CLAY_OVEN ||
					    ba == BigAcquisitions.BA_STONE_OVEN
					) && (type == AcquisitationType.BACK_BREAD)) {
				m.setSelectable(true);
				ret = true;
			} else if(( ba == BigAcquisitions.BA_JOINERY && allowJoinery ||
					    ba == BigAcquisitions.BA_POTTERY && allowPottery ||
					    ba == BigAcquisitions.BA_BASKET_MAKER && allowBasketMaker
					) && type == AcquisitationType.HARVEST_SEASON) {
				m.setSelectable(true);
				ret = true;
			} else {
				m.setSelectable(false);
			}
		}
		return ret;
	}
	
	public AcquisitionCardModel getAcquisitation(int number) {
		return acquisitations[number];
	}
	
	public SmallFieldModel getField(int fieldId) {
		return fields[fieldId];
	}
	
	public void setChild(int fieldId) {
		switch(player) {
		case BLUE: fields[fieldId].setChild(Child.C_BLUE); break;
		case GREEN: fields[fieldId].setChild(Child.C_GREEN); break;
		case RED: fields[fieldId].setChild(Child.C_RED); break;
		case ROSA: fields[fieldId].setChild(Child.C_ROSA); break;
		case NONE: fields[fieldId].setChild(Child.C_NONE); break;
		}
	}
	
	public boolean isHouse(int fieldId) {
		return fieldId >= 0 && fieldId < 15 &&
				(fields[fieldId].getField() == FieldCard.F_WOOD_HOUSE || fields[fieldId].getField() == FieldCard.F_CLAY_HOUSE || fields[fieldId].getField() == FieldCard.F_STONE_HOUSE);
	}
	
	public int countFields() {
		int sum = 0;
		for(int i=0; i<15; i++) {
			if(fields[i].getField() == FieldCard.F_FIELD) {
				sum++;
			}
		}
		return sum;
	}
	
	public int countPastures() {
		int sum = 0;
		for(int i=0; i<15; i++) {
			if(isPasture(i)) {
				sum++;
			}
		}
		return sum;
	}
	
	public int countGrainsOnFields() {
		int sum = 0;
		for(int i=0; i<15; i++) {
			if(fields[i].getRessource() == Resource.R_GRAIN && fields[i].getField() == FieldCard.F_FIELD) {
				sum += fields[i].getRessourceCount();
			}
		}
		return sum;
	}
	
	public int countVegetablesOnFields() {
		int sum = 0;
		for(int i=0; i<15; i++) {
			if(fields[i].getRessource() == Resource.R_VEGETABLE && fields[i].getField() == FieldCard.F_FIELD) {
				sum += fields[i].getRessourceCount();
			}
		}
		return sum;
	}
	
	public int countSheep() {
		int sum = 0;
		for(int i=0; i<15; i++) {
			if(fields[i].getRessource() == Resource.R_SHEEP && isPasture(i)) {
				sum += fields[i].getRessourceCount();
			}
		}
		return sum;
	}
	
	public int countBoars() {
		int sum = 0;
		for(int i=0; i<15; i++) {
			if(fields[i].getRessource() == Resource.R_BOAR && isPasture(i)) {
				sum += fields[i].getRessourceCount();
			}
		}
		return sum;
	}
	
	public int countCows() {
		int sum = 0;
		for(int i=0; i<15; i++) {
			if(fields[i].getRessource() == Resource.R_COW && isPasture(i)) {
				sum += fields[i].getRessourceCount();
			}
		}
		return sum;
	}
	
	public int countUnusedFields() {
		int sum = 0;
		for(int i=0; i<15; i++) {
			if(fields[i].getField() == FieldCard.F_NONE && fields[i].getBottomFence() == 0 && fields[i].getLeftFence() == 0
					 && fields[i].getRightFence() == 0 && fields[i].getTopFence() == 0) {
				sum++;
			}
		}
		return sum;
	}
	
	public int countFencedStables() {
		int sum = 0;
		for(int i=0; i<15; i++) {
			if(fields[i].getField() == FieldCard.F_STABLE && isPasture(i)) {
				sum++;
			}
		}
		return sum;
	}
	
	public int countClayHouses() {
		int sum = 0;
		for(int i=0; i<15; i++) {
			if(fields[i].getField() == FieldCard.F_CLAY_HOUSE) {
				sum++;
			}
		}
		return sum;
	}
	
	public int countStoneHouses() {
		int sum = 0;
		for(int i=0; i<15; i++) {
			if(fields[i].getField() == FieldCard.F_STONE_HOUSE) {
				sum++;
			}
		}
		return sum;
	}
	
	public int countPersons() {
		int sum = 0;
		for(int i=0; i<15; i++) {
			if(isHouse(i)) {
				sum+=fields[i].getPersonsCount();
			}
		}
		return sum;
	}
	
	public int countCardPoints() {
		int sum = 0;
		for(int i=0; i<10; i++) {
			if(acquisitations[i] == null)
				break;
			AcquisitionCardModel a = acquisitations[i];
			switch(a.getAcquisition()) {
			case BA_FIRE_PLACE:
			case BA_FIRE_PLACE2:
			case BA_COOKERY:
			case BA_COOKERY2:
				sum++; break;
			case BA_CLAY_OVEN:
			case BA_JOINERY:
			case BA_POTTERY:
			case BA_BASKET_MAKER:
				sum += 2; break;
			case BA_STONE_OVEN:
				sum += 3; break;
			case BA_FOUNTAIN:
				sum += 4; break;
			case BA_NONE: break;
			}
		}
		return sum;
	}
	
	public void sendPersonToWork() {
		for(int i=0; i<15; i++) {
			if(fields[i].getPersonsCount() - fields[i].getPersonsAtWork() > 0) {
				fields[i].setPersonsAtWork(fields[i].getPersonsAtWork()+1);
				break;
			}
		}
	}
	
	public void sendAllPersonsHome() {
		for(int i=0; i<15; i++) {
			fields[i].setPersonsAtWork(0);
		}
	}
	
	public boolean isPersonAvailableForWork() {
		for(int i=0; i<15; i++) {
			if(fields[i].getPersonsCount() - fields[i].getPersonsAtWork() > 0) {
				return true;
			}
		}
		return false;
	}
	
	public void nextFence() {
		fenceId++;
	}
	
	public boolean isField(int fieldId) {
		return fieldId >= 0 && fieldId < 15 && fields[fieldId].getField() == FieldCard.F_FIELD;
	}
	
	public boolean hasLeftFence(int fieldId) {
		return fieldId >= 0 && fieldId < 15 && fields[fieldId].getLeftFence() == fenceId;
	}
	public boolean hasRightFence(int fieldId) {
		return fieldId >= 0 && fieldId < 15 && fields[fieldId].getRightFence() == fenceId;
	}
	public boolean hasTopFence(int fieldId) {
		return fieldId >= 0 && fieldId < 15 && fields[fieldId].getTopFence() == fenceId;
	}
	public boolean hasBottomFence(int fieldId) {
		return fieldId >= 0 && fieldId < 15 && fields[fieldId].getBottomFence() == fenceId;
	}
	
	public void setLeftFence(int fieldId, boolean value) {
		if(fieldId >= 0 && fieldId < 15)
			fields[fieldId].setLeftFence(value?fenceId:0);
	}
	public void setRightFence(int fieldId, boolean value) {
		if(fieldId >= 0 && fieldId < 15)
			fields[fieldId].setRightFence(value?fenceId:0);
	}
	public void setTopFence(int fieldId, boolean value) {
		if(fieldId >= 0 && fieldId < 15)
			fields[fieldId].setTopFence(value?fenceId:0);
	}
	public void setBottomFence(int fieldId, boolean value) {
		if(fieldId >= 0 && fieldId < 15)
			fields[fieldId].setBottomFence(value?fenceId:0);
	}
	
	public static class PastureInfo {
		public static enum Animal {
			NONE, SHEEP, COW, BOAR
		}
		public Animal animal = Animal.NONE;
		public int animalCount = 0;
		public int maxAnimals = 0;
	}
	
	private int[] _fillUpEmptyPastureFields(int[] pastureId) {
		for(int i=0; i<15; i++) {
			if(pastureId[i] == 0) { // if this field has no pasture id, than we look if has no fence to the other pasture field, and give this field the same pasture id
				if(i>0 && !_isLeftFence(i) && pastureId[i-1] > 0 && i/5 == (i-1)/5)
					pastureId[i] = pastureId[i-1];
				else if(i<14 && !_isRightFence(i) && pastureId[i+1] > 0 && i/5 == (i+1)/5)
					pastureId[i] = pastureId[i+1];
				else if(i>4 && !_isTopFence(i) && pastureId[i-5] > 0)
					pastureId[i] = pastureId[i-5];
				else if(i<10 && !_isBottomFence(i) && pastureId[i+5] > 0)
					pastureId[i] = pastureId[i+5];
			}
		}
		return pastureId;
	}
	
	public int[] categorizePasture() {
		int[] pastureId = new int[] {0,0,0,0,0,
									 0,0,0,0,0,
									 0,0,0,0,0};
		for(int i=0; i<15; i++) {
			if(fields[i].getBottomFence() > 0)
				pastureId[i] = fields[i].getBottomFence();
			else if(fields[i].getLeftFence() > 0)
				pastureId[i] = fields[i].getLeftFence();
			else if(fields[i].getRightFence() > 0)
				pastureId[i] = fields[i].getRightFence();
			else if(fields[i].getTopFence() > 0)
				pastureId[i] = fields[i].getTopFence();
		}
		int pastureMaxId = 100;
		pastureId = _fillUpEmptyPastureFields(pastureId);
			
		for(int i=0; i<15; i++) {
			if(isPasture(i) && pastureId[i] == 0) {
				pastureId[i] = pastureMaxId; // it is a pasture field, but has no fence on its field - it is surrendered by fences of other pasture fields
				pastureMaxId++;
				// now we need to set the pastureId of the other fields belonging to this pasture in the loop 
				for(int k=0; k<15; k++) {
					pastureId = _fillUpEmptyPastureFields(pastureId);
				}
			}
		}
		return pastureId;
	}
	
	public void breedAnimals() {
		int[] pastureId = categorizePasture();
		
		ArrayList<Integer> doneIds = new ArrayList<Integer>();
		for(int i=0; i<15; i++) {
			int pId = pastureId[i];
			if(pId != 0 && !doneIds.contains(pId)) {
				doneIds.add(pId);
				PastureInfo pInfo = getPastureInfo(i, pastureId);
				int babies = pInfo.animalCount / 2;
				if(pInfo.animalCount + babies > pInfo.maxAnimals) {
					babies = pInfo.maxAnimals - pInfo.animalCount;
				}
				fields[i].setRessourceCount(fields[i].getRessourceCount() + babies);
				Resource res = Resource.R_NONE;
				switch(pInfo.animal) {
				case BOAR: res = Resource.R_BOAR; break;
				case COW: res = Resource.R_COW; break;
				case SHEEP: res = Resource.R_SHEEP; break;
				case NONE: break;
				}
				fields[i].setRessource(res);
			}
		}
	}
	
	public boolean containsAnimals(int fieldId) {
		return fields[fieldId].getRessourceCount() > 0 && (fields[fieldId].getRessource() == Resource.R_BOAR || 
				fields[fieldId].getRessource() == Resource.R_COW || fields[fieldId].getRessource() == Resource.R_SHEEP);
	}
	
	public PastureInfo getPastureInfo(int fieldId, int[] pastureId) {
		PastureInfo past = new PastureInfo();
		if(isPasture(fieldId)) {
			// now we have categorized the pastures with id
			// next we want to count the animals of the fields with the given pastureId
			// and set also the maximum allowed amount of animals, depending on the pasture's size and the amount of stables
			int stables = 0;
			int pastureSize = 0;
			int animals = 0;
			Animal animal = Animal.NONE;
			int pId = pastureId[fieldId];
			for(int i=0; i<15; i++) {
				if(pastureId[i] == pId) {
					pastureSize++;
					if(fields[i].getField() == FieldCard.F_STABLE)
						stables++;
					switch(fields[i].getRessource()) {
					case R_BOAR: animal = Animal.BOAR; break;
					case R_COW: animal = Animal.COW; break;
					case R_SHEEP: animal = Animal.SHEEP; break;
					default: break;
					}
					animals += fields[i].getRessourceCount();
				}
			}
			past.animal = animal;
			past.animalCount = animals;
			past.maxAnimals = pastureSize * 2;
			for(int i=0; i<stables; i++)
				past.maxAnimals *= 2;
		} else if(fields[fieldId].getField() == FieldCard.F_STABLE) {
			past.animalCount = fields[fieldId].getRessourceCount();
			past.maxAnimals = 1;
		}
		return past;
	}
	
	// TODO this function does not work for every case
	public boolean isPasture(int fieldId) {
		boolean retTop = false; // true if the field has a top fence
		for(int i=fieldId; i >= 0 && !retTop; i-=5) {
			retTop = _isTopFence(i);
		}
		boolean retBottom = false; // true if the field has a bottom fence
		for(int i=fieldId; i < 15 && !retBottom; i+=5) {
			retBottom = _isBottomFence(i);
		}
		boolean retLeft = false; // true if the field has a left fence
		for(int i=fieldId; i >= 0 && !retLeft && i/5 == fieldId /5; i--) {
			retLeft = _isLeftFence(i);
		}
		boolean retRight = false; // true if the field has a right fence
		for(int i=fieldId; i < 15 && !retRight && i/5 == fieldId /5; i++) {
			retRight = _isRightFence(i);
		}
		return retBottom && retLeft && retRight && retTop;
	}
	
	private boolean _isTopFence(int fieldId) {
		return fieldId >=0 && fieldId < 15 && fields[fieldId].getTopFence() > 0 || fieldId >= 5 && fieldId < 20 && fields[fieldId-5].getBottomFence() > 0;
	}
	private boolean _isBottomFence(int fieldId) {
		return fieldId >=0 && fieldId < 15 && fields[fieldId].getBottomFence() > 0 || fieldId >= -5 && fieldId < 10 && fields[fieldId+5].getTopFence() > 0;
	}
	private boolean _isLeftFence(int fieldId) {
		return fieldId >=0 && fieldId < 15 && fields[fieldId].getLeftFence() > 0 || fieldId >= 1 && fieldId < 16 && fieldId/5 == (fieldId-1)/5 && fields[fieldId-1].getRightFence() > 0;
	}
	private boolean _isRightFence(int fieldId) {
		return fieldId >=0 && fieldId < 15 && fields[fieldId].getRightFence() > 0 || fieldId >= -1 && fieldId < 14 && fieldId/5 == (fieldId+1)/5 && fields[fieldId+1].getLeftFence() > 0;
	}
}
