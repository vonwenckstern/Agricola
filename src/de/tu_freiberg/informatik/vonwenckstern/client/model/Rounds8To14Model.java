package de.tu_freiberg.informatik.vonwenckstern.client.model;

import java.io.Serializable;

public class Rounds8To14Model implements Serializable {
	private static final long serialVersionUID = 1L;
	private BigFieldModel modelBoar = new BigFieldModel(BackgroundCard.BOAR, Resource.R_BOAR, 1, 1, "get boar", false);
	private BigFieldModel modelVegetable = new BigFieldModel(BackgroundCard.VEGETABLE, Resource.R_NONE, 0, 0, "get one vegetable", false);
	private BigFieldModel modelStone = new BigFieldModel(BackgroundCard.STONE4, Resource.R_STONE, 1, 1, "get stone", false);
	private BigFieldModel modelCow = new BigFieldModel(BackgroundCard.COW, Resource.R_COW, 1, 1, "get cow", false);
	private BigFieldModel modelPlowSow = new BigFieldModel(BackgroundCard.PLOWING_SOWING, Resource.R_NONE, 0, 0, "plow one field\nand/or\nseed grains or vegetables on your fields", false);
	private BigFieldModel modelFamily = new BigFieldModel(BackgroundCard.FAMILY_ADDITION5, Resource.R_NONE, 0, 0, "make a baby (you do NOT need a free room)", false);
	private BigFieldModel modelRestauration = new BigFieldModel(BackgroundCard.RESTAURATION_FENCE, Resource.R_NONE, 0, 0, "restaurate your homes \nand if wanted you can\nbuild your onw fence (1 wood for each fence part)", false);
	
	
	public BigFieldModel getModelBoar() {
		return modelBoar;
	}

	public BigFieldModel getModelVegetable() {
		return modelVegetable;
	}

	public BigFieldModel getModelStone() {
		return modelStone;
	}

	public BigFieldModel getModelCow() {
		return modelCow;
	}

	public BigFieldModel getModelPlowSow() {
		return modelPlowSow;
	}

	public BigFieldModel getModelFamily() {
		return modelFamily;
	}

	public BigFieldModel getModelRestauration() {
		return modelRestauration;
	}

	@Override
	public boolean equals(Object o) {
		if( !(o instanceof Rounds8To14Model) )
			return false;
		Rounds8To14Model cm = (Rounds8To14Model)o;
		return modelBoar.equals(cm.getModelBoar()) && modelVegetable.equals(cm.getModelVegetable()) && modelStone.equals(cm.getModelStone())
				&& modelCow.equals(cm.getModelCow()) && modelPlowSow.equals(cm.getModelPlowSow()) &&
				modelFamily.equals(cm.getModelFamily()) && modelRestauration.equals(cm.getModelRestauration());
	}
	
	public void update(Rounds8To14Model model) {
		if(model == null) return;
		_cloneBM(this.getModelBoar(), model.getModelBoar());
		_cloneBM(this.getModelVegetable(), model.getModelVegetable());
		_cloneBM(this.getModelStone(), model.getModelStone());
		_cloneBM(this.getModelCow(), model.getModelCow());
		_cloneBM(this.getModelPlowSow(), model.getModelPlowSow());
		_cloneBM(this.getModelFamily(), model.getModelFamily());
		_cloneBM(this.getModelRestauration(), model.getModelRestauration());
	}
	
	public Rounds8To14Model clone() {
		Rounds8To14Model model = new Rounds8To14Model();
		_cloneBM(model.getModelBoar(), this.getModelBoar());
		_cloneBM(model.getModelVegetable(), this.getModelVegetable());
		_cloneBM(model.getModelStone(), this.getModelStone());
		_cloneBM(model.getModelCow(), this.getModelCow());
		_cloneBM(model.getModelPlowSow(), this.getModelPlowSow());
		_cloneBM(model.getModelFamily(), this.getModelFamily());
		_cloneBM(model.getModelRestauration(), this.getModelRestauration());
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
