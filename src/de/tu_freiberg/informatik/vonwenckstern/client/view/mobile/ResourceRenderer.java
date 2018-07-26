package de.tu_freiberg.informatik.vonwenckstern.client.view.mobile;

import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.IntegerBox;
import com.google.gwt.user.client.ui.Label;

import de.tu_freiberg.informatik.vonwenckstern.client.model.BaseFieldModel;
import de.tu_freiberg.informatik.vonwenckstern.client.view.Tooltip;

public class ResourceRenderer extends HorizontalPanel {
	private BaseFieldModel model;
	public ResourceRenderer() {
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
		String s = null;
		switch(model.getRessource()) {
		case R_BOAR: s = "boar"; break;
		case R_CLAY: s = "clay"; break;
		case R_COW: s = "cow"; break;
		case R_FOOD: s = "food"; break;
		case R_GRAIN: s = "grain"; break;
		case R_NONE: s = null; break;
		case R_REED: s = "reed"; break;
		case R_SHEEP: s = "sheep"; break;
		case R_STONE: s = "stone"; break;
		case R_VEGETABLE: s = "vegetable"; break;
		case R_WOOD: s = "wood"; break;
		}
		if((s != null) && (model.getRessourceCount() > 0)) {
			this.add(new Label(s));
			if(model.getRessourceCount() > 1) {
				IntegerBox tb = new IntegerBox();
				tb.setVisibleLength(2);
				tb.setValue(model.getRessourceCount());
				tb.setReadOnly(true);
				Label l = new Label();
				l.setPixelSize(5, 5);
				this.add(l);
				this.add(tb);
			}
		}
		this.setVisible((s != null) && (model.getRessourceCount() > 0));
	}
}
