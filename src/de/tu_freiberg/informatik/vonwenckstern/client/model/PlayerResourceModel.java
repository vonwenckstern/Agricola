package de.tu_freiberg.informatik.vonwenckstern.client.model;

import java.io.Serializable;

import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.event.shared.HandlerRegistration;

import de.tu_freiberg.informatik.vonwenckstern.client.event.ResourceModelChangedEvent;
import de.tu_freiberg.informatik.vonwenckstern.client.event.ResourceModelChangedEvent.HasResourceModelChangedHandler;
import de.tu_freiberg.informatik.vonwenckstern.client.event.ResourceModelChangedEvent.ResourceModelChangedHandler;

public class PlayerResourceModel implements HasResourceModelChangedHandler, Serializable {
	private static final long serialVersionUID = 1L;
	private int woodCount = 0;
	private int clayCount = 0;
	private int stoneCount = 0;
	private int reedCount = 0;
	private int foodCount = 3;
	private int grainCount = 0;
	private int vegetableCount = 0;
	private int beggerCards = 0;
	private int fenceCount = 15;
	private int personsCount = 3;
	private int stableCount = 4;
	
	public void update(PlayerResourceModel model) {
		if(model == null) return;
		this.woodCount = model.woodCount;
		this.clayCount = model.clayCount; 
		this.stoneCount = model.stoneCount;
		this.reedCount = model.reedCount; 
		this.foodCount = model.foodCount;
		this.grainCount = model.grainCount; 
		this.vegetableCount = model.vegetableCount;
		this.beggerCards = model.beggerCards; 
		this.fenceCount = model.fenceCount;
		this.personsCount = model.personsCount; 
		this.stableCount = model.stableCount;
	}
	
	public boolean equals(Object o) {
		if( !(o instanceof PlayerResourceModel))
			return false;
		PlayerResourceModel pm = (PlayerResourceModel)o;
		return woodCount == pm.woodCount && clayCount == pm.clayCount && stoneCount == pm.stoneCount && reedCount == pm.reedCount && foodCount == pm.foodCount &&
				grainCount == pm.grainCount && vegetableCount == pm.vegetableCount && beggerCards == pm.beggerCards && fenceCount == pm.fenceCount &&
				personsCount == pm.personsCount && stableCount == pm.stableCount;
	}
	
	public PlayerResourceModel clone() {
		PlayerResourceModel pm = new PlayerResourceModel();
		pm.woodCount = woodCount;
		pm.clayCount = clayCount; 
		pm.stoneCount = stoneCount;
		pm.reedCount = reedCount; 
		pm.foodCount = foodCount;
		pm.grainCount = grainCount; 
		pm.vegetableCount = vegetableCount;
		pm.beggerCards = beggerCards; 
		pm.fenceCount = fenceCount;
		pm.personsCount = personsCount; 
		pm.stableCount = stableCount;
		return pm;
	}
	
	public int getFenceCount() {
		return fenceCount;
	}

	public void setFenceCount(int fenceCount) {
		this.fenceCount = fenceCount;
		fireModelChanged();
	}

	public int getPersonsCount() {
		return personsCount;
	}

	public void setPersonsCount(int personsCount) {
		this.personsCount = personsCount;
		fireModelChanged();
	}

	public int getStableCount() {
		return stableCount;
	}

	public void setStableCount(int stableCount) {
		this.stableCount = stableCount;
		fireModelChanged();
	}

	private static HandlerManager eventBus = new HandlerManager(null);
	
	public void addRessource(Resource res, int count) {
		boolean valid = true;
		switch(res) {
		case R_WOOD: woodCount += count; break;
		case R_CLAY: clayCount += count; break;
		case R_STONE: stoneCount += count; break;
		case R_REED: reedCount += count; break;
		case R_FOOD: foodCount += count; 
			if(foodCount < 0) {
				beggerCards += -1*foodCount;
				foodCount = 0;
			}
			break;
		case R_GRAIN: grainCount += count; break;
		case R_VEGETABLE: vegetableCount += count; break;
		default: valid = false; break;
		}
		if(valid)
			fireModelChanged();
	}
	
	public int getWoodCount() {
		return woodCount;
	}
	public void setWoodCount(int woodCount) {
		this.woodCount = woodCount;
		fireModelChanged();
	}
	public int getClayCount() {
		return clayCount;
	}
	public void setClayCount(int clayCount) {
		this.clayCount = clayCount;
		fireModelChanged();
	}
	public int getStoneCount() {
		return stoneCount;
	}
	public void setStoneCount(int stoneCount) {
		this.stoneCount = stoneCount;
		fireModelChanged();
	}
	public int getReedCount() {
		return reedCount;
	}
	public void setReedCount(int reedCount) {
		this.reedCount = reedCount;
		fireModelChanged();
	}
	public int getFoodCount() {
		return foodCount;
	}
	public void setFoodCount(int foodCount) {
		this.foodCount = foodCount;
		if(this.foodCount < 0) {
			beggerCards += -1*this.foodCount;
			this.foodCount = 0;
		}
		fireModelChanged();
	}
	public int getBeggerCards() {
		return beggerCards;
	}

	public int getGrainCount() {
		return grainCount;
	}
	public void setGrainCount(int grainCount) {
		this.grainCount = grainCount;
		fireModelChanged();
	}
	public int getVegetableCount() {
		return vegetableCount;
	}
	public void setVegetableCount(int vegetableCount) {
		this.vegetableCount = vegetableCount;
		fireModelChanged();
	}
	
	private void fireModelChanged() {
		eventBus.fireEvent(new ResourceModelChangedEvent());
	}

	@Override
	public HandlerRegistration addResourceModelChangedHandler(ResourceModelChangedHandler handler) {
		return eventBus.addHandler(ResourceModelChangedEvent.getType(), handler);
	}
	
	
}
