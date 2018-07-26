package de.tu_freiberg.informatik.vonwenckstern.client.view.desktop;

import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;

import de.tu_freiberg.informatik.vonwenckstern.client.model.AcquisitionCardModel;
import de.tu_freiberg.informatik.vonwenckstern.client.model.HasAcquisitionCardModel;
import de.tu_freiberg.informatik.vonwenckstern.client.view.Renderer;
import de.tu_freiberg.informatik.vonwenckstern.client.view.Tooltip;

public class AcquisitionCardRenderer extends AbsolutePanel implements Renderer, HasAcquisitionCardModel {
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
		this.setPixelSize(65, 110);
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
		this.clear();
		this.add(new TooltipImageAcquisitionRenderer(model),0,0);
		if(model.isSelectable()) {
			Label l = new Label();
			l.setPixelSize(65, 110);
			DOM.setStyleAttribute(l.getElement(), "backgroundColor", "rgba(255,255,255,0.4)");
			DOM.setStyleAttribute(l.getElement(), "cursor", "pointer");
			this.add(l,0,0);
		}
		this.setVisible(model.isVisible());
	}
}
