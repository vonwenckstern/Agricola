package de.tu_freiberg.informatik.vonwenckstern.client.model;

import java.io.Serializable;

public class Rounds1To7Model implements Serializable {
	private static final long serialVersionUID = 1L;
	private BigFieldModel modelSheep = new BigFieldModel(BackgroundCard.SHEEP, Resource.R_SHEEP, 1, 1, "get sheep", true);
	private BigFieldModel modelBigAcquisitation = new BigFieldModel(BackgroundCard.ACQUISITION, Resource.R_NONE, 0, 0, "get one big acquisitation", false);
	private BigFieldModel modelFence = new BigFieldModel(BackgroundCard.FENCE, Resource.R_NONE, 0, 0, "build your onw fence (1 wood for each fence part)", false);
	private BigFieldModel modelSeedingBacking = new BigFieldModel(BackgroundCard.SEEDING_BACKING, Resource.R_NONE, 0, 0, "seed grains or vegetables on your fields and/or back bread", false);
	private BigFieldModel modelFamily = new BigFieldModel(BackgroundCard.FAMILIY_ADDITION2, Resource.R_NONE, 0, 0, "make a baby (you need one free room)", false);
	private BigFieldModel modelStone = new BigFieldModel(BackgroundCard.STONE2, Resource.R_STONE, 1, 1, "get stone", false);
	private BigFieldModel modelRestauration = new BigFieldModel(BackgroundCard.RESTAURATION, Resource.R_NONE, 0, 0, "restaurate your homes and if wanted you can do a big acquisitation later on", false);
	
	private BigFieldModel modelWood = new BigFieldModel(BackgroundCard.NONE, Resource.R_WOOD, 3, 3, "get wood", true);
	private BigFieldModel modelClay = new BigFieldModel(BackgroundCard.NONE, Resource.R_CLAY, 1, 1, "get clay", true);
	private BigFieldModel modelReed = new BigFieldModel(BackgroundCard.NONE, Resource.R_REED, 1, 1, "get reed", true);
	private BigFieldModel modelFood = new BigFieldModel(BackgroundCard.NONE, Resource.R_FOOD, 1, 1, "get food markers", true);
	
	
	public BigFieldModel getModelSheep() {
		return modelSheep;
	}

	public BigFieldModel getModelBigAcquisitation() {
		return modelBigAcquisitation;
	}

	public BigFieldModel getModelFence() {
		return modelFence;
	}

	public BigFieldModel getModelSeedingBacking() {
		return modelSeedingBacking;
	}

	public BigFieldModel getModelFamily() {
		return modelFamily;
	}

	public BigFieldModel getModelStone() {
		return modelStone;
	}

	public BigFieldModel getModelRestauration() {
		return modelRestauration;
	}

	public BigFieldModel getModelWood() {
		return modelWood;
	}

	public BigFieldModel getModelClay() {
		return modelClay;
	}

	public BigFieldModel getModelReed() {
		return modelReed;
	}

	public BigFieldModel getModelFood() {
		return modelFood;
	}

	@Override
	public boolean equals(Object o) {
		if( !(o instanceof Rounds1To7Model) )
			return false;
		Rounds1To7Model cm = (Rounds1To7Model)o;
		return modelSheep.equals(cm.getModelSheep()) && modelBigAcquisitation.equals(cm.getModelBigAcquisitation()) && modelFence.equals(cm.getModelFence())
				&& modelSeedingBacking.equals(cm.getModelSeedingBacking()) && modelFamily.equals(cm.getModelFamily()) &&
				modelStone.equals(cm.getModelStone()) && modelRestauration.equals(cm.getModelRestauration()) && modelWood.equals(cm.getModelWood())
				&& modelClay.equals(cm.getModelClay()) && modelReed.equals(cm.getModelReed()) && modelFood.equals(cm.getModelFood());
	}
	
	public void update(Rounds1To7Model model) {
		if(model == null) return;
		_cloneBM(this.getModelSheep(), model.getModelSheep());
		_cloneBM(this.getModelBigAcquisitation(), model.getModelBigAcquisitation());
		_cloneBM(this.getModelFence(), model.getModelFence());
		_cloneBM(this.getModelSeedingBacking(), model.getModelSeedingBacking());
		_cloneBM(this.getModelFamily(), model.getModelFamily());
		_cloneBM(this.getModelStone(), model.getModelStone());
		_cloneBM(this.getModelRestauration(), model.getModelRestauration());
		_cloneBM(this.getModelWood(), model.getModelWood());
		_cloneBM(this.getModelClay(), model.getModelClay());
		_cloneBM(this.getModelReed(), model.getModelReed());
		_cloneBM(this.getModelFood(), model.getModelFood());
	}
	
	public Rounds1To7Model clone() {
		Rounds1To7Model model = new Rounds1To7Model();
		_cloneBM(model.getModelSheep(), this.getModelSheep());
		_cloneBM(model.getModelBigAcquisitation(), this.getModelBigAcquisitation());
		_cloneBM(model.getModelFence(), this.getModelFence());
		_cloneBM(model.getModelSeedingBacking(), this.getModelSeedingBacking());
		_cloneBM(model.getModelFamily(), this.getModelFamily());
		_cloneBM(model.getModelStone(), this.getModelStone());
		_cloneBM(model.getModelRestauration(), this.getModelRestauration());
		_cloneBM(model.getModelWood(), this.getModelWood());
		_cloneBM(model.getModelClay(), this.getModelClay());
		_cloneBM(model.getModelReed(), this.getModelReed());
		_cloneBM(model.getModelFood(), this.getModelFood());
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
}
