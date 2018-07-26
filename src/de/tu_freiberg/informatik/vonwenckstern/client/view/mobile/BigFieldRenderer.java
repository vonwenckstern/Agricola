package de.tu_freiberg.informatik.vonwenckstern.client.view.mobile;


import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;

import de.tu_freiberg.informatik.vonwenckstern.client.model.BigFieldModel;
import de.tu_freiberg.informatik.vonwenckstern.client.model.HasBaseFieldModel;
import de.tu_freiberg.informatik.vonwenckstern.client.view.Renderer;
import de.tu_freiberg.informatik.vonwenckstern.client.view.Tooltip;

public class BigFieldRenderer extends VerticalPanel implements HasBaseFieldModel, Renderer {
	private BigFieldModel model;
	private int order;
	
	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

	public BigFieldRenderer() {
		this.setPixelSize(100, 100);
		DOM.setStyleAttribute(this.getElement(), "border", "1px solid black");
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
		String s = null;
		switch(model.getBgCard()) {
		case ACQUISITION: s = "get a big acquisition"; break;
		case BOAR: s = "get boars"; break;
		case CABARET: s = "cabaret: you can get food"; break;
		case COW: s = "get cows"; break;
		case FAMILIY_ADDITION2: s = "family addition (need a room)"; break;
		case FAMILY_ADDITION5: s = "family addition (need not a room)"; break;
		case FENCE: s = "build fences"; break;
		case NONE: s = null; break;
		case ONE_WOOD: s = "get wood"; break;
		case PLOWING_SOWING: s = "plow field and/or seed grains"; break;
		case REED_STONE_FOOD: s = "get one reed, one stone, and one food marker"; break;
		case RESTAURATION: s = "restaurate your rooms"; break;
		case RESTAURATION_FENCE: s = "restaurate your rooms and build fences if wanted"; break;
		case SEEDING_BACKING: s = "seed grains and/or back bread"; break;
		case SHEEP: s = "get sheep"; break;
		case STONE2: s = "get stone"; break;
		case STONE4: s = "get stone"; break;
		case TWO_CLAY: s = "get clay"; break;
		case TWO_WOOD: s = "get wood"; break;
		case VEGETABLE: s = "get one vegetable"; break;
		}
		if(s != null) {
			Label l = new Label(s);
			DOM.setStyleAttribute(l.getElement(), "backgroundColor", "lightblue");
			this.add(l);
		}
		this.add(new ChildRenderer(model));
		this.add(new ResourceRenderer(model));
		this.setVisible(model.isVisible());
	}
}
