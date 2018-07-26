package de.tu_freiberg.informatik.vonwenckstern.client.view.mobile;

import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.SimplePanel;

import de.tu_freiberg.informatik.vonwenckstern.client.model.AcquisitionCardModel;
import de.tu_freiberg.informatik.vonwenckstern.client.model.HasAcquisitionCardModel;
import de.tu_freiberg.informatik.vonwenckstern.client.view.Renderer;
import de.tu_freiberg.informatik.vonwenckstern.client.view.Tooltip;

public class AcquisitionCardRenderer extends SimplePanel implements Renderer, HasAcquisitionCardModel {
	private AcquisitionCardModel model = null;
	private int position;
	private boolean tooltipAdded = false;
	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}
	
	public AcquisitionCardRenderer() {
		this.setPixelSize(70, 40);
		this.setVisible(false);
		DOM.setStyleAttribute(this.getElement(), "border", "1px solid black");
	}

	public AcquisitionCardModel getModel() {
		return model;
	}

	public void setModel(AcquisitionCardModel model) {
		this.model = model;
		if(!tooltipAdded && model != null) {
			tooltipAdded = true;
			new Tooltip(this, new HTML(model.getDescription()));
		}
		if(model != null) {
			render();
		} else {
			this.setVisible(false);
		}
	}
	
	public void render() {
		this.setWidget(new LabelAcquisitionRenderer(model));
		if(model.isSelectable()) {
			DOM.setStyleAttribute(this.getElement(), "backgroundColor", "lightgreen");
		} else {
			DOM.setStyleAttribute(this.getElement(), "backgroundColor", "white");
		}
		this.setVisible(model.isVisible());
	}
}
