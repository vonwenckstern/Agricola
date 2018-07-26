package de.tu_freiberg.informatik.vonwenckstern.client.model;

import java.io.Serializable;

public class BigFieldModel extends BaseFieldModel implements Serializable {
	private static final long serialVersionUID = 1L;
	private transient BackgroundCard bgCard = BackgroundCard.NONE;
	private transient int ressourceRoundAddition;
	private boolean visible;
	
	public boolean isVisible() {
		return visible;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}

	public BigFieldModel() { super(); }
	
	public BigFieldModel(BackgroundCard bgCard, Resource res, int resCount, int resRoundAddition, String describtion, boolean visible) {
		super();
		this.bgCard = bgCard;
		this.setRessource(res);
		this.setRessourceCount(resCount);
		this.ressourceRoundAddition = resRoundAddition;
		this.setDescription(describtion);
		this.visible = visible;
	}
	
	public BigFieldModel(int resCount, boolean visible) {
		super();
		this.setRessourceCount(resCount);
		this.visible = visible;
	}
	
	public int getRessourceRoundAddition() {
		return ressourceRoundAddition;
	}
	public void setRessourceRoundAddition(int ressourceRoundAddition) {
		if(ressourceRoundAddition < 0) throw new RuntimeException("ressourceRoundAddition represents the number of new ressources which are added to the field in each round and it cannot be negative");
		this.ressourceRoundAddition = ressourceRoundAddition;
	}

	public BackgroundCard getBgCard() {
		return bgCard;
	}
	public void setBgCard(BackgroundCard bgCard) {
		this.bgCard = bgCard;
	}
	
	@Override
	public boolean equals(Object o) {
		if( !(o instanceof BigFieldModel))
			return false;
		BigFieldModel bm = (BigFieldModel)o;
		return super.equals((BaseFieldModel)bm) && bgCard == bm.getBgCard() && ressourceRoundAddition == bm.getRessourceRoundAddition() && visible == bm.isVisible();
	}
}
