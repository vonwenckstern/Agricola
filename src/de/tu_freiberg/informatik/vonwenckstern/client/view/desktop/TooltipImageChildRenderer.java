package de.tu_freiberg.informatik.vonwenckstern.client.view.desktop;

import com.google.gwt.resources.client.ImageResource;

import de.tu_freiberg.informatik.vonwenckstern.client.model.BaseFieldModel;
import de.tu_freiberg.informatik.vonwenckstern.client.model.HasBaseFieldModel;
import de.tu_freiberg.informatik.vonwenckstern.client.resources.Images;
import de.tu_freiberg.informatik.vonwenckstern.client.view.Renderer;
public class TooltipImageChildRenderer extends TooltipImage implements Renderer, HasBaseFieldModel {
	// setId will not work in UiBuilder
		public void setValue(String value) {
			model.setId(value);
		}

		BaseFieldModel model = new BaseFieldModel();
		
		@Override
		public void render() {
			Images im = Images.Util.getInstance();
			ImageResource child = null;
			switch(model.getChild()) {
			case C_BLUE: child = im.childBlue(); break;
			case C_GREEN: child = im.childGreen(); break;
			case C_NONE: child = im.clear(); break;
			case C_RED: child = im.childRed(); break;
			case C_ROSA: child = im.childRosa(); break;
			}
			
			this.setUrl(child.getSafeUri());
		}

		@Override
		public BaseFieldModel getModel() {
			return model;
		}

		public void setModel(BaseFieldModel model) {
			this.model = model;
			if(model != null) {
				render();
			}
		}
}
