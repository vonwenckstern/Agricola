package de.tu_freiberg.informatik.vonwenckstern.client.model;

import java.io.Serializable;

import de.tu_freiberg.informatik.vonwenckstern.client.Utils;

public class BaseFieldModel implements Serializable {
	private static final long serialVersionUID = 1L;
	private Resource ressource = Resource.R_NONE;
	private int ressourceCount = 0;
	private Child child = Child.C_NONE;
	private transient String description = null;
	private transient String id = null;
	
	public BaseFieldModel() {}
	
	public BaseFieldModel(String id) {
		this.id = id;
	}
	
	public boolean equals(Object o) {
		if( !(o instanceof BaseFieldModel))
			return false;
		BaseFieldModel bm = (BaseFieldModel)o;
		return ressource == bm.getRessource() && ressourceCount == bm.getRessourceCount() && child == bm.getChild() && Utils.equals(description, bm.getDescription()) 
				&& Utils.equals(id, bm.getId());
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		if(description != null)
			this.description = description.replace("\\n", "\n");
	}
	
	public Child getChild() {
		return child;
	}
	public void setChild(Child child) {
		this.child = child;
	}
	public Resource getRessource() {
		return ressource;
	}
	public void setRessource(Resource ressource) {
		this.ressource = ressource;
	}
	public int getRessourceCount() {
		return ressourceCount;
	}
	public void setRessourceCount(int ressourceCount) {
		if(ressourceCount < 0) throw new RuntimeException("ressource count cannot be negative");
		this.ressourceCount = ressourceCount;
	}
}
