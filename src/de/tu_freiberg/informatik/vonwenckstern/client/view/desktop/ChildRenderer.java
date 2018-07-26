package de.tu_freiberg.informatik.vonwenckstern.client.view.desktop;

import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.Image;

import de.tu_freiberg.informatik.vonwenckstern.client.model.BaseFieldModel;
import de.tu_freiberg.informatik.vonwenckstern.client.resources.Images;

public class ChildRenderer extends AbsolutePanel {
	private BaseFieldModel model;
	public ChildRenderer() {
		this.setPixelSize(55, 55);
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
		this.clear();
		Images im = Images.Util.getInstance();
		ImageResource child = null;
		switch(model.getChild()) {
		case C_BLUE: child = im.childBlue(); break;
		case C_GREEN: child = im.childGreen(); break;
		case C_NONE: child = null; break;
		case C_RED: child = im.childRed(); break;
		case C_ROSA: child = im.childRosa(); break;
		}
		if(child != null) {
			Image image = new Image();
			image.setHeight("50px");
			image.setUrl(child.getSafeUri());
			this.add(image,0,0);
		}
		this.setVisible(child != null);
	}
}
