package de.tu_freiberg.informatik.vonwenckstern.client.view.desktop;
import de.tu_freiberg.informatik.vonwenckstern.client.view.Renderer;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.uibinder.client.UiChild;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.HasHTML;
import com.google.gwt.user.client.ui.Widget;

import de.tu_freiberg.informatik.vonwenckstern.client.model.AcquisitionCardModel;
import de.tu_freiberg.informatik.vonwenckstern.client.model.BigAcquisitions;
import de.tu_freiberg.informatik.vonwenckstern.client.model.HasAcquisitionCardModel;
import de.tu_freiberg.informatik.vonwenckstern.client.resources.Images;

public class TooltipImageAcquisitionRenderer extends TooltipImage implements Renderer, HasAcquisitionCardModel {

	private AcquisitionCardModel model = new AcquisitionCardModel();
	
	public TooltipImageAcquisitionRenderer() {
		super();
		this.setPixelSize(65, 110);
		DOM.setStyleAttribute(this.getElement(), "cursor", "pointer");
	}
	
	public TooltipImageAcquisitionRenderer(AcquisitionCardModel model) {
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
		Images im = Images.Util.getInstance();
		ImageResource i = null;
		switch(model.getAcquisition()) {
		case BA_FIRE_PLACE: i = im.firePlace(); break;
		case BA_FIRE_PLACE2: i = im.firePlace2(); break;
		case BA_COOKERY: i = im.cookery(); break;
		case BA_COOKERY2: i = im.cookery2(); break;
		case BA_FOUNTAIN: i = im.fountain(); break;
		
		case BA_CLAY_OVEN: i = im.clayOven(); break;
		case BA_STONE_OVEN: i = im.stoneOven(); break;
		case BA_JOINERY: i = im.joinery(); break;
		case BA_POTTERY: i = im.pottery(); break;
		case BA_BASKET_MAKER: i = im.basketMaker(); break;
		case BA_NONE: i = im.clear(); break;
		}
		
		this.setUrl(i.getSafeUri().asString());
		this.setVisible(model.isVisible());
	}

}
