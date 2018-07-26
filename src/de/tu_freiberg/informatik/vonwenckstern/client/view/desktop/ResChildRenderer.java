package de.tu_freiberg.informatik.vonwenckstern.client.view.desktop;

import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.HTML;

import de.tu_freiberg.informatik.vonwenckstern.client.model.BigFieldModel;
import de.tu_freiberg.informatik.vonwenckstern.client.model.HasBaseFieldModel;
import de.tu_freiberg.informatik.vonwenckstern.client.view.Renderer;
import de.tu_freiberg.informatik.vonwenckstern.client.view.Tooltip;
public class ResChildRenderer extends AbsolutePanel implements Renderer, HasBaseFieldModel {
	private BigFieldModel model;
	private boolean childLeft = true;
	
	public void setChildLeft(boolean b) {
		childLeft = b;
		if(model != null)
			render();
	}
	
	public ResChildRenderer() {
		this.setPixelSize(100, 65);
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
		this.add(new ChildRenderer(model), childLeft ? 0 : 50, 10);
		this.add(new ResourceRenderer(model), childLeft ? 65 : 0, 0);
	}

}
