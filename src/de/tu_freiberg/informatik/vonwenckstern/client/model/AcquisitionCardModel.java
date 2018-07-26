package de.tu_freiberg.informatik.vonwenckstern.client.model;

import java.io.Serializable;

import de.tu_freiberg.informatik.vonwenckstern.client.Utils;

public class AcquisitionCardModel implements Serializable {
	private static final long serialVersionUID = 1L;
	private BigAcquisitions acquisition = BigAcquisitions.BA_NONE;
	private boolean selectable = false;
	private transient String description = "";
	private boolean visible = true;
	
	public boolean equals(Object o) {
		if(!(o instanceof AcquisitionCardModel))
			return false;
		AcquisitionCardModel am = (AcquisitionCardModel)o;
		return acquisition == am.acquisition && selectable == am.selectable && Utils.equals(description, am.description) && visible == am.visible;
	}
	
	public boolean isVisible() {
		return visible;
	}
	public void setVisible(boolean visible) {
		this.visible = visible;
	}
	public AcquisitionCardModel() {}
	public AcquisitionCardModel(BigAcquisitions acquisition) {
		this.acquisition = acquisition;
	}
	
	public AcquisitionCardModel(BigAcquisitions acquisition, boolean visible) {
		this.acquisition = acquisition;
		this.visible = visible;
	}
	
	public AcquisitionCardModel(BigAcquisitions acquisition, boolean visible, String description) {
		this.acquisition = acquisition;
		this.visible = visible;
		this.description = description;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public BigAcquisitions getAcquisition() {
		return acquisition;
	}
	public void setAcquisition(BigAcquisitions acquisition) {
		this.acquisition = acquisition;
	}
	public boolean isSelectable() {
		return selectable;
	}
	public void setSelectable(boolean selectable) {
		this.selectable = selectable;
	}
}
