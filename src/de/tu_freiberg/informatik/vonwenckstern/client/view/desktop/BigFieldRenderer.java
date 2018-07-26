package de.tu_freiberg.informatik.vonwenckstern.client.view.desktop;


import com.google.gwt.resources.client.ImageResource;
import de.tu_freiberg.informatik.vonwenckstern.client.view.Renderer;
import de.tu_freiberg.informatik.vonwenckstern.client.view.Tooltip;

import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Image;

import de.tu_freiberg.informatik.vonwenckstern.client.model.BigFieldModel;
import de.tu_freiberg.informatik.vonwenckstern.client.model.HasBaseFieldModel;
import de.tu_freiberg.informatik.vonwenckstern.client.resources.Images;

public class BigFieldRenderer extends AbsolutePanel implements HasBaseFieldModel, Renderer {
	private BigFieldModel model;
	
	
	
	public BigFieldRenderer() {
		this.setPixelSize(100, 150);
	}
	
	public BigFieldModel getModel() {
		return model;
	}

	public void setModel(BigFieldModel model) {
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
		ImageResource bgImage = null;
		switch(model.getBgCard()) {
		case ACQUISITION: bgImage = im.acquisition(); break;
		case BOAR: bgImage = im.boar(); break;
		case CABARET: bgImage = im.cabaret(); break;
		case COW: bgImage = im.cow(); break;
		case FAMILIY_ADDITION2: bgImage = im.familyAddition(); break;
		case FAMILY_ADDITION5: bgImage = im.familyAddition2(); break;
		case FENCE: bgImage = im.fence(); break;
		case NONE: bgImage = null; break;
		case ONE_WOOD: bgImage = im.wood(); break;
		case PLOWING_SOWING: bgImage = im.plowingField(); break;
		case REED_STONE_FOOD: bgImage = im.reedStoneFood(); break;
		case RESTAURATION: bgImage = im.restauration(); break;
		case RESTAURATION_FENCE: bgImage = im.restauration2(); break;
		case SEEDING_BACKING: bgImage = im.seedingBacking(); break;
		case SHEEP: bgImage = im.sheep(); break;
		case STONE2: bgImage = im.stone(); break;
		case STONE4: bgImage = im.stone2(); break;
		case TWO_CLAY: bgImage = im.clayTwo(); break;
		case TWO_WOOD: bgImage = im.woodTwo(); break;
		case VEGETABLE: bgImage = im.vegetable(); break;
		}
		if(bgImage != null) {
			Image image = new Image();
			image.setHeight("150px");
			image.setUrl(bgImage.getSafeUri());
			this.add(image);
		}
		this.add(new ChildRenderer(model), 20, 10);
		this.add(new ResourceRenderer(model), 30, 80);
		this.setVisible(model.isVisible());
	}
}
