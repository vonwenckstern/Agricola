package de.tu_freiberg.informatik.vonwenckstern.client.view.mobile;
import com.google.gwt.user.client.ui.HTML;

import de.tu_freiberg.informatik.vonwenckstern.client.model.BaseFieldModel;

public class ChildRenderer extends HTML {
	private BaseFieldModel model;
	public ChildRenderer() {
	}
	
	public ChildRenderer(BaseFieldModel model) {
		this();
		setModel(model);
	}
	
	public void setModel(BaseFieldModel model) {
		this.model = model;
		if(model != null)
			render();
	}
	
	public void render() {
		String s = null;
		switch(model.getChild()) {
		case C_BLUE: s = "blue"; break;
		case C_GREEN: s = "green"; break;
		case C_NONE: s = null; break;
		case C_RED: s = "red"; break;
		case C_ROSA: s = "pink"; break;
		}
		if(s != null) {
			setHTML("<font color=\"red\">occupied by " + s + "</font>");
		} else {
			setHTML("<font color=\"green\">free</font>");
		}
	}
}
