package de.tu_freiberg.informatik.vonwenckstern.client.view.mobile;

import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.DoubleBox;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;

import de.tu_freiberg.informatik.vonwenckstern.client.model.HasBaseFieldModel;
import de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel;
import de.tu_freiberg.informatik.vonwenckstern.client.view.HasPosition;
import de.tu_freiberg.informatik.vonwenckstern.client.view.Renderer;
public class SmallFieldRenderer extends VerticalPanel implements Renderer, HasBaseFieldModel, HasPosition {
	private SmallFieldModel model;
	private int position;
	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public SmallFieldRenderer() {
		this.setPixelSize(70, 70);
		DOM.setStyleAttribute(this.getElement(), "border", "1px solid black");
	}
	
	public SmallFieldRenderer(SmallFieldModel model) {
		this();
		setModel(model);
	}
	
	public void setModel(SmallFieldModel model) {
		this.model = model;
		if(model != null)
			render();
	}
	
	public SmallFieldModel getModel() {
		return model;
	}
	
	public void render() {
		this.clear();
		String field = null;
		switch(model.getField()) {
		case F_CLAY_HOUSE: field = "clay house"; break;
		case F_FIELD: field = "field"; break;
		case F_NONE: field = null; break;
		case F_STABLE: field = "stable"; break;
		case F_STONE_HOUSE: field = "stone house"; break;
		case F_WOOD_HOUSE: field = "wooden house"; break;
		}
		if(field != null) {
			Label l = new Label(field);
			DOM.setStyleAttribute(l.getElement(), "backgroundColor", "lightblue");
			this.add(l);
		}
		if (model.getBottomFence() > 0 || model.getLeftFence() > 0|| model.getRightFence() > 0|| model.getTopFence() > 0) {
			String color = null;
			switch(model.getPlayer()) {
			case BLUE: color = "blue"; break;
			case GREEN: color = "green"; break;
			case NONE: color = null; break;
			case ROSA: color = "pink"; break;
			case RED: color = "red"; break;
			}
			if(color != null) {
				color += " solid 5px";
				String noColor = "black 1px solid";
				DOM.setStyleAttribute(getElement(), "borderLeft", model.getLeftFence() > 0?color:noColor);
				DOM.setStyleAttribute(getElement(), "borderRight", model.getRightFence() > 0?color:noColor);
				DOM.setStyleAttribute(getElement(), "borderTop", model.getTopFence() > 0?color:noColor);
				DOM.setStyleAttribute(getElement(), "borderBottom", model.getBottomFence() > 0?color:noColor);
			}
		} else {
			DOM.setStyleAttribute(getElement(), "borderLeft", "black 1px solid");
			DOM.setStyleAttribute(getElement(), "borderRight", "black 1px solid");
			DOM.setStyleAttribute(getElement(), "borderTop", "black 1px solid");
			DOM.setStyleAttribute(getElement(), "borderBottom", "black 1px solid");
		}
		if(model.isSelectable()) {
			DOM.setStyleAttribute(this.getElement(), "backgroundColor", "lightgreen");
		} else {
			DOM.setStyleAttribute(this.getElement(), "backgroundColor", "white");
		}
		
		if(model.getPersonsCount() - model.getPersonsAtWork() + model.getChildCount() > 0) {
			this.add(new ChildRenderer(model));
			if(model.getPersonsCount() - model.getPersonsAtWork() + 0.5*model.getChildCount() != 1) {
				DoubleBox tb = new DoubleBox();
				tb.setVisibleLength(2);
				tb.setValue(model.getPersonsCount() - model.getPersonsAtWork() + 0.5*model.getChildCount());
				tb.setReadOnly(true);
				this.add(tb);
			}
		}
		this.add(new ResourceRenderer(model));
	}
}
