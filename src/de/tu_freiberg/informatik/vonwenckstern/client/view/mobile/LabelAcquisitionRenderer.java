package de.tu_freiberg.informatik.vonwenckstern.client.view.mobile;
import de.tu_freiberg.informatik.vonwenckstern.client.view.Renderer;
import com.google.gwt.uibinder.client.UiChild;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.HasHTML;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;

import de.tu_freiberg.informatik.vonwenckstern.client.model.AcquisitionCardModel;
import de.tu_freiberg.informatik.vonwenckstern.client.model.BigAcquisitions;
import de.tu_freiberg.informatik.vonwenckstern.client.model.HasAcquisitionCardModel;

public class LabelAcquisitionRenderer extends TooltipPanel implements Renderer, HasAcquisitionCardModel {

	private AcquisitionCardModel model = new AcquisitionCardModel();
	
	public LabelAcquisitionRenderer() {
		super();
		DOM.setStyleAttribute(this.getElement(), "cursor", "pointer");
		DOM.setStyleAttribute(this.getElement(), "border", "1px solid black");
		DOM.setStyleAttribute(this.getElement(), "textAlign", "center");
	}
	
	public LabelAcquisitionRenderer(AcquisitionCardModel model) {
		this();
		if(model != null) {
			this.model = model;
			render();
		}
	}
	
	@UiChild(limit=1)
	public void addTooltip(Widget tooltip) {
		if(tooltip instanceof HasHTML) {
			model.setDescription(((HasHTML) tooltip).getHTML());
		}
		super.addTooltip(tooltip);
	}
	
	@Override
	public AcquisitionCardModel getModel() {
		return model;
	}
	
	public void setModel(AcquisitionCardModel model) {
		if(model != null) {
			this.model = model;
			render();
		}
	}
	
	public void setBigAcquisiton(BigAcquisitions ba) {
		model.setAcquisition(ba);
		render();
	}

	@Override
	public void render() {
		this.clear();
		String s = null;
		switch(model.getAcquisition()) {
		case BA_FIRE_PLACE: s = "fire place"; break;
		case BA_FIRE_PLACE2: s = "fire place 2"; break;
		case BA_COOKERY: s = "cookery"; break;
		case BA_COOKERY2: s = "cookery 2"; break;
		case BA_FOUNTAIN: s = "fountain"; break;
		
		case BA_CLAY_OVEN: s = "clay oven"; break;
		case BA_STONE_OVEN: s = "stone oven"; break;
		case BA_JOINERY: s = "joinery"; break;
		case BA_POTTERY: s = "pottery"; break;
		case BA_BASKET_MAKER: s = "basket maker"; break;
		case BA_NONE: s = ""; break;
		}
		
		this.add(new Label(s));
		this.setVisible(model.isVisible());
	}

}
