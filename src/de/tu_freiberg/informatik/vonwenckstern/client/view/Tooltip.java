package de.tu_freiberg.informatik.vonwenckstern.client.view;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.MouseOutEvent;
import com.google.gwt.event.dom.client.MouseOutHandler;
import com.google.gwt.event.dom.client.MouseOverEvent;
import com.google.gwt.event.dom.client.MouseOverHandler;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.PopupPanel;
import com.google.gwt.user.client.ui.Widget;

public class Tooltip extends PopupPanel implements MouseOverHandler, MouseOutHandler, ClickHandler {
	private Widget w;
	public Tooltip(Widget w, Widget tooltip) {
		super(false, false);
		this.w = w;
		w.addDomHandler(this, MouseOverEvent.getType());
		w.addDomHandler(this, MouseOutEvent.getType());
		w.addDomHandler(this, ClickEvent.getType());
		this.add(tooltip);
		this.show();
		DOM.setStyleAttribute(this.getElement(), "zIndex", "100");
		this.setVisible(false);
	}
	
	public Tooltip() {
		super(false, false);
	}
	
	@Override
	public void onMouseOut(MouseOutEvent event) {
		this.setVisible(false);
	}
	@Override
	public void onMouseOver(MouseOverEvent event) {
		this.setPopupPosition(w.getAbsoluteLeft() + event.getRelativeX(w.getElement()) + 10, w.getAbsoluteTop() + event.getRelativeY(w.getElement()) + 10);
		this.setVisible(true);
	}

	@Override
	public void onClick(ClickEvent event) {
		this.setVisible(false);
	}
}
