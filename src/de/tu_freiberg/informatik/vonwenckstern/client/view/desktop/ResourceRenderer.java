package de.tu_freiberg.informatik.vonwenckstern.client.view.desktop;

import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.IntegerBox;

import de.tu_freiberg.informatik.vonwenckstern.client.model.BaseFieldModel;
import de.tu_freiberg.informatik.vonwenckstern.client.resources.Images;
import de.tu_freiberg.informatik.vonwenckstern.client.view.Tooltip;

public class ResourceRenderer extends AbsolutePanel {
	private BaseFieldModel model;
	public ResourceRenderer() {
		this.setPixelSize(30, 50);
	}
	
	public ResourceRenderer(BaseFieldModel model) {
		this();
		setModel(model);
	}
	
	public BaseFieldModel getModel() {
		return model;
	}

	public void setModel(BaseFieldModel model) {
		this.model = model;
		if(model != null) {
			if(model.getDescription() != null)
				new Tooltip(this, new HTML(new SafeHtmlBuilder().appendEscapedLines(model.getDescription()).toSafeHtml()));
			render();
		}
	}
	
	public void render() {
		this.clear();
		Images im = Images.Util.getInstance();
		ImageResource resImage = null;
		switch(model.getRessource()) {
		case R_BOAR: resImage = im.boarMarker(); break;
		case R_CLAY: resImage = im.clayStone(); break;
		case R_COW: resImage = im.cowMarker(); break;
		case R_FOOD: resImage = im.foodMarker(); break;
		case R_GRAIN: resImage = im.grainStone(); break;
		case R_NONE: resImage = null; break;
		case R_REED: resImage = im.reedStone(); break;
		case R_SHEEP: resImage = im.sheepMarker(); break;
		case R_STONE: resImage = im.stoneStone(); break;
		case R_VEGETABLE: resImage = im.vegetableStone(); break;
		case R_WOOD: resImage = im.woodStone(); break;
		}
		if((resImage != null) && (model.getRessourceCount() > 0)) {
			Image image = new Image();
			image.setWidth("30px");
			image.setUrl(resImage.getSafeUri());
			this.add(image, 0, 25);
			if(model.getRessourceCount() > 1) {
				IntegerBox tb = new IntegerBox();
				tb.setVisibleLength(2);
				tb.setValue(model.getRessourceCount());
				tb.setReadOnly(true);
				this.add(tb, 0, 0);
			}
		}
		this.setVisible((resImage != null) && (model.getRessourceCount() > 0));
	}
}
