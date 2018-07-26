package de.tu_freiberg.informatik.vonwenckstern.client.view.mobile;

import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.VerticalPanel;

import de.tu_freiberg.informatik.vonwenckstern.client.model.BigFieldModel;
import de.tu_freiberg.informatik.vonwenckstern.client.model.HasBaseFieldModel;
import de.tu_freiberg.informatik.vonwenckstern.client.view.Renderer;
import de.tu_freiberg.informatik.vonwenckstern.client.view.Tooltip;
public class ResChildRenderer extends VerticalPanel implements Renderer, HasBaseFieldModel {
	private BigFieldModel model;
	
	public ResChildRenderer() {
		this.setPixelSize(100, 50);
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

	@Override
	public void render() {
		this.clear();
		this.add(new ChildRenderer(model));
		this.add(new ResourceRenderer(model));
	}

}
