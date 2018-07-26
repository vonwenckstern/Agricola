package de.tu_freiberg.informatik.vonwenckstern.client.model;

import java.io.Serializable;

public class CardFieldModel implements Serializable {
	private static final long serialVersionUID = 1L;
	private BigFieldModel modelOneWood = new BigFieldModel(BackgroundCard.ONE_WOOD, Resource.R_WOOD, 1, 1, "get woods", true);
	private BigFieldModel modelTwoWood = new BigFieldModel(BackgroundCard.TWO_WOOD, Resource.R_WOOD, 2, 2, "get woods", true);
	private BigFieldModel modelTwoClay = new BigFieldModel(BackgroundCard.TWO_CLAY, Resource.R_CLAY, 2, 2, "get clays", true);
	private BigFieldModel modelReedStoneFood = new BigFieldModel(BackgroundCard.REED_STONE_FOOD, Resource.R_NONE, 0, 0, "get one reed, one stone and one food marker", true);;
	private BigFieldModel modelCabaret = new BigFieldModel(BackgroundCard.CABARET, Resource.R_FOOD, 1, 1, "get food markers", true);
	
	private BaseFieldModel modelHouse = new BaseFieldModel("buildHouse");
	private BaseFieldModel modelStartPlayer = new BaseFieldModel("startPlayer");
	private BaseFieldModel modelGrain = new BaseFieldModel("oneGrain");
	private BaseFieldModel modelPlowField = new BaseFieldModel("plowField");
	private BaseFieldModel modelFood = new BaseFieldModel("twoFoodMarkers");
	
	public BaseFieldModel getModelHouse() {
		return modelHouse;
	}
	public void setModelHouse(BaseFieldModel modelHouse) {
		this.modelHouse = modelHouse;
	}
	public BaseFieldModel getModelStartPlayer() {
		return modelStartPlayer;
	}
	public void setModelStartPlayer(BaseFieldModel modelStartPlayer) {
		this.modelStartPlayer = modelStartPlayer;
	}
	public BaseFieldModel getModelGrain() {
		return modelGrain;
	}
	public void setModelGrain(BaseFieldModel modelGrain) {
		this.modelGrain = modelGrain;
	}
	public BaseFieldModel getModelPlowField() {
		return modelPlowField;
	}
	public void setModelPlowField(BaseFieldModel modelPlowField) {
		this.modelPlowField = modelPlowField;
	}
	public BaseFieldModel getModelFood() {
		return modelFood;
	}
	public void setModelFood(BaseFieldModel modelFood) {
		this.modelFood = modelFood;
	}
	public BigFieldModel getModelOneWood() {
		return modelOneWood;
	}
	public BigFieldModel getModelTwoWood() {
		return modelTwoWood;
	}
	public BigFieldModel getModelTwoClay() {
		return modelTwoClay;
	}
	public BigFieldModel getModelReedStoneFood() {
		return modelReedStoneFood;
	}
	public BigFieldModel getModelCabaret() {
		return modelCabaret;
	}
	
	@Override
	public boolean equals(Object o) {
		if( !(o instanceof CardFieldModel) )
			return false;
		CardFieldModel cm = (CardFieldModel)o;
		return modelOneWood.equals(cm.getModelOneWood()) && modelTwoWood.equals(cm.getModelTwoWood()) && modelTwoClay.equals(cm.getModelTwoClay())
				&& modelReedStoneFood.equals(cm.getModelReedStoneFood()) && modelCabaret.equals(cm.getModelCabaret()) &&
				modelHouse.equals(cm.modelHouse) && modelStartPlayer.equals(cm.modelStartPlayer) && modelGrain.equals(cm.modelGrain) &&
				modelPlowField.equals(cm.modelPlowField) && modelFood.equals(cm.modelFood);
	}
	
	public void update(CardFieldModel model) {
		if(model == null)
			return;
		_cloneBM(this.getModelOneWood(), model.getModelOneWood());
		_cloneBM(this.getModelTwoWood(), model.getModelTwoWood());
		_cloneBM(this.getModelTwoClay(), model.getModelTwoClay());
		_cloneBM(this.getModelReedStoneFood(), model.getModelReedStoneFood());
		_cloneBM(this.getModelCabaret(), model.getModelCabaret());
		
		_cloneBaseM(this.modelHouse, model.modelHouse);
		_cloneBaseM(this.modelStartPlayer, model.modelStartPlayer);
		_cloneBaseM(this.modelGrain, model.modelGrain);
		_cloneBaseM(this.modelPlowField, model.modelPlowField);
		_cloneBaseM(this.modelFood, model.modelFood);
	}
	
	public CardFieldModel clone() {
		CardFieldModel model = new CardFieldModel();
		_cloneBM(model.getModelOneWood(), this.getModelOneWood());
		_cloneBM(model.getModelTwoWood(), this.getModelTwoWood());
		_cloneBM(model.getModelTwoClay(), this.getModelTwoClay());
		_cloneBM(model.getModelReedStoneFood(), this.getModelReedStoneFood());
		_cloneBM(model.getModelCabaret(), this.getModelCabaret());
		
		_cloneBaseM(model.modelHouse, this.modelHouse);
		_cloneBaseM(model.modelStartPlayer, this.modelStartPlayer);
		_cloneBaseM(model.modelGrain, this.modelGrain);
		_cloneBaseM(model.modelPlowField, this.modelPlowField);
		_cloneBaseM(model.modelFood, this.modelFood);
		return model;
	}
	
	private void _cloneBM(BigFieldModel bm, BigFieldModel org) {
//		bm.setBgCard(org.getBgCard());
		bm.setChild(org.getChild());
//		bm.setDescription(org.getDescription());
//		bm.setId(org.getId());
		bm.setRessource(org.getRessource());
		bm.setRessourceCount(org.getRessourceCount());
		bm.setVisible(org.isVisible());
	}
	
	private void _cloneBaseM(BaseFieldModel bm, BaseFieldModel org) {
		bm.setChild(org.getChild());
//		bm.setDescription(org.getDescription());
//		bm.setId(org.getId());
		bm.setRessource(org.getRessource());
		bm.setRessourceCount(org.getRessourceCount());
	}
}
