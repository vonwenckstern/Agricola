package de.tu_freiberg.informatik.vonwenckstern.client.view.mobile;

import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.Label;

import de.tu_freiberg.informatik.vonwenckstern.client.model.BaseFieldModel;
import de.tu_freiberg.informatik.vonwenckstern.client.model.HasBaseFieldModel;
import de.tu_freiberg.informatik.vonwenckstern.client.view.Renderer;
public class TooltipPanelChildRenderer extends TooltipPanel implements Renderer, HasBaseFieldModel {
		
	public TooltipPanelChildRenderer() {
		super();
		this.setPixelSize(100, 100);
		DOM.setStyleAttribute(this.getElement(), "border", "1px solid black");
	}
	
	private String fixText = null;
	
	public String getFixText() {
		return fixText;
	}

	public void setFixText(String fixText) {
		this.fixText = fixText;
		render();
	}

		// setId will not work in UiBuilder
		public void setValue(String value) {
			model.setId(value);
		}

		BaseFieldModel model = new BaseFieldModel();
		
		@Override
		public void render() {
			this.clear();
			if(fixText != null) {
				Label l = new Label(fixText);
				DOM.setStyleAttribute(l.getElement(), "backgroundColor", "lightblue");
				this.add(l);
			}
			this.add(new ChildRenderer(model));
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
