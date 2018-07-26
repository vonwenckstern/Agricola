package de.tu_freiberg.informatik.vonwenckstern.client.view.desktop;

import java.util.ArrayList;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.uibinder.client.UiChild;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Widget;

import de.tu_freiberg.informatik.vonwenckstern.client.view.Tooltip;

public class TooltipImage extends Image implements HasClickHandlers {
	@UiChild(limit=1)
	public void addTooltip(Widget tooltip) {
		new Tooltip(this, tooltip);
	}
	
	private ArrayList<HandlerRegistration> clickHandlers = new  ArrayList<HandlerRegistration>();
	
	public void removeAllClickHandlers() {
		int size =clickHandlers.size()-1; 
		for(int i=size; i>=0; i--) {
			if(clickHandlers.get(i) != null) {
				clickHandlers.get(i).removeHandler();
			}
			clickHandlers.remove(i);
		}
	}
	
	@Override
	public HandlerRegistration addClickHandler(ClickHandler handler) {
		HandlerRegistration handlerReg = this.addDomHandler(handler, ClickEvent.getType());
		clickHandlers.add(handlerReg);
		return handlerReg;
	}
}
