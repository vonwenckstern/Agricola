package de.tu_freiberg.informatik.vonwenckstern.client.model;

import java.io.Serializable;

public class SmallFieldModel extends BaseFieldModel implements Serializable {
	private static final long serialVersionUID = 1L;
	private FieldCard field = FieldCard.F_NONE;
	private int leftFence = 0;
	private int rightFence = 0;
	private int topFence = 0;
	private int bottomFence = 0;
	private boolean selectable = false;
	private int personsCount = 0;
	private int personsAtWork = 0;
	private transient Player player;
	
	public SmallFieldModel(FieldCard field, int leftFence, int rightFence, int topFence, int bottomFence, boolean selectable, int personsCount, int personsAtWork,
			Resource ressource, int ressourceCount, Child child, String description, String id, Player player) {
		this.field = field; this.leftFence = leftFence; this.rightFence = rightFence; this.topFence = topFence; this.bottomFence = bottomFence;
		this.selectable = selectable; this.personsCount = personsCount; this.personsAtWork = personsAtWork; this.player = player;
		setRessource(ressource); setRessourceCount(ressourceCount); setChild(child); setDescription(description); setId(id);
	}
	
	public boolean equals(Object o) {
		if( !(o instanceof SmallFieldModel))
			return false;
		SmallFieldModel sm = (SmallFieldModel)o;
		return super.equals((BaseFieldModel)o) && field == sm.field && leftFence == sm.leftFence && rightFence == sm.rightFence && topFence == sm.topFence && bottomFence == sm.bottomFence
				&& selectable == sm.selectable && personsCount == sm.personsCount && personsAtWork == sm.personsAtWork && player == sm.player;
	}
	
	public int getChildCount() {
		return childCount;
	}
	public void setChildCount(int childCount) {
		this.childCount = childCount;
	}
	private int childCount = 0;
	public int getPersonsAtWork() {
		return personsAtWork;
	}
	public void setPersonsAtWork(int parentsAtWork) {
		this.personsAtWork = parentsAtWork;
	}
	public int getPersonsCount() {
		return personsCount;
	}
	public void setPersonsCount(int personsCount) {
		this.personsCount = personsCount;
	}
	public boolean isSelectable() {
		return selectable;
	}
	public void setSelectable(boolean selectable) {
		this.selectable = selectable;
	}
	
	public SmallFieldModel() {}
	public SmallFieldModel(Player player) {
		this.player = player;
	}
	public FieldCard getField() {
		return field;
	}
	public void setField(FieldCard field) {
		this.field = field;
	}
	public int getLeftFence() {
		return leftFence;
	}
	public void setLeftFence(int leftFence) {
		this.leftFence = leftFence;
	}
	public int getRightFence() {
		return rightFence;
	}
	public void setRightFence(int rightFence) {
		this.rightFence = rightFence;
	}
	public int getTopFence() {
		return topFence;
	}
	public void setTopFence(int topFence) {
		this.topFence = topFence;
	}
	public int getBottomFence() {
		return bottomFence;
	}
	public void setBottomFence(int bottomFence) {
		this.bottomFence = bottomFence;
	}
	public Player getPlayer() {
		return player;
	}
	public void setPlayer(Player player) {
		this.player = player;
	}
}
