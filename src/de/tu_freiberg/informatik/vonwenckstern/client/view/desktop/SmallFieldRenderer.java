package de.tu_freiberg.informatik.vonwenckstern.client.view.desktop;

import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.DoubleBox;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;

import de.tu_freiberg.informatik.vonwenckstern.client.model.FieldCard;
import de.tu_freiberg.informatik.vonwenckstern.client.model.HasBaseFieldModel;
import de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel;
import de.tu_freiberg.informatik.vonwenckstern.client.resources.Images;
import de.tu_freiberg.informatik.vonwenckstern.client.view.HasPosition;
import de.tu_freiberg.informatik.vonwenckstern.client.view.Renderer;
public class SmallFieldRenderer extends AbsolutePanel implements Renderer, HasBaseFieldModel, HasPosition  {
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
		Images im = Images.Util.getInstance();
		ImageResource field = null;
		switch(model.getField()) {
		case F_CLAY_HOUSE: field = im.clayHouse(); break;
		case F_FIELD: field = im.fieldMarker(); break;
		case F_NONE: field = null; break;
		case F_STABLE: {
				switch(model.getPlayer()) {
				case BLUE: field = im.houseBlue(); break;
				case GREEN: field = im.houseGreen(); break;
				case NONE: field = null; break;
				case ROSA: field = im.houseRosa(); break;
				case RED: field = im.houseRed(); break;
				}
				break;
			}
		case F_STONE_HOUSE: field = im.stoneHouse(); break;
		case F_WOOD_HOUSE: field = im.woodHouse(); break;
		}
		if(field != null) {
			Image image = new Image();
			image.setHeight((model.getField() == FieldCard.F_STABLE) ? "20px" : "70px");
			image.setUrl(field.getSafeUri());
			this.add(image,0,0);
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
				String noColor = "green none 0px";
				DOM.setStyleAttribute(getElement(), "borderLeft", model.getLeftFence() > 0?color:noColor);
				DOM.setStyleAttribute(getElement(), "borderRight", model.getRightFence() > 0?color:noColor);
				DOM.setStyleAttribute(getElement(), "borderTop", model.getTopFence() > 0?color:noColor);
				DOM.setStyleAttribute(getElement(), "borderBottom", model.getBottomFence() > 0?color:noColor);
			}
		} else {
			DOM.setStyleAttribute(getElement(), "borderLeft", "green none 0px");
			DOM.setStyleAttribute(getElement(), "borderRight", "green none 0px");
			DOM.setStyleAttribute(getElement(), "borderTop", "green none 0px");
			DOM.setStyleAttribute(getElement(), "borderBottom", "green none 0px");
		}
		if(model.isSelectable()) {
			Label l = new Label();
			l.setPixelSize(70, 70);
			DOM.setStyleAttribute(l.getElement(), "backgroundColor", "rgba(255,255,255,0.4)");
			this.add(l,0,0);
		}
		
		if(model.getPersonsCount() - model.getPersonsAtWork() + model.getChildCount() > 0) {
			this.add(new ChildRenderer(model), 8, 8);
			if(model.getPersonsCount() - model.getPersonsAtWork() + 0.5*model.getChildCount() != 1) {
				DoubleBox tb = new DoubleBox();
				tb.setVisibleLength(2);
				tb.setValue(model.getPersonsCount() - model.getPersonsAtWork() + 0.5*model.getChildCount());
				tb.setReadOnly(true);
				this.add(tb, 10, 10);
			}
		}
		this.add(new ResourceRenderer(model), 30, 20);
	}
}
