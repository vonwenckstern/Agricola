package de.tu_freiberg.informatik.vonwenckstern.client.presenter;

import java.util.Iterator;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiConstructor;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Widget;

import de.tu_freiberg.informatik.vonwenckstern.client.EventBus;
import de.tu_freiberg.informatik.vonwenckstern.client.event.AddResourceEvent;
import de.tu_freiberg.informatik.vonwenckstern.client.event.AddResourceEvent.RessourceItem;
import de.tu_freiberg.informatik.vonwenckstern.client.event.ChildStartsWorkingEvent;
import de.tu_freiberg.informatik.vonwenckstern.client.event.HistoryChangedEvent;
import de.tu_freiberg.informatik.vonwenckstern.client.event.NextRoundEvent;
import de.tu_freiberg.informatik.vonwenckstern.client.event.NextRoundEvent.NextRoundHandler;
import de.tu_freiberg.informatik.vonwenckstern.client.model.BaseFieldModel;
import de.tu_freiberg.informatik.vonwenckstern.client.model.BigFieldModel;
import de.tu_freiberg.informatik.vonwenckstern.client.model.Child;
import de.tu_freiberg.informatik.vonwenckstern.client.model.HasBaseFieldModel;
import de.tu_freiberg.informatik.vonwenckstern.client.model.Player;
import de.tu_freiberg.informatik.vonwenckstern.client.model.Resource;
import de.tu_freiberg.informatik.vonwenckstern.client.view.Renderer;
public class ResourcePresenter implements Presenter, ClickHandler, NextRoundHandler {
	public interface Display {
		public void registerHandlers(ClickHandler p);
		public Widget asWidget();
		public void showOneMoreBigCard(int round);
		public HasWidgets getPanel();
	}
	protected Display display;
	protected Player player = Player.BLUE;
	
	@UiConstructor
	public ResourcePresenter(Display display, Player player) {
		this.display = display;
		this.player = player;
		EventBus.getEventBus().addNextRoundHandler(this);
		display.registerHandlers(this);
	}

	@Override
	public Widget getView() {
		return display.asWidget();
	}

	@Override
	public void onClick(ClickEvent event) {
		Object s = event.getSource();
		if(s instanceof Widget) {
			Renderer renderer = getRenderer((Widget) s);
			if(renderer instanceof HasBaseFieldModel) {
				BaseFieldModel model = ((HasBaseFieldModel) renderer).getModel();
				if(model.getChild() != Child.C_NONE) {
					Window.alert("This place is already occupied. You cannot set your child here.");
					return;
				}
				
				if(processAction(model)) {
				
					Child child = Child.C_NONE;
					switch(player) {
					case BLUE: child = Child.C_BLUE; break;
					case GREEN: child = Child.C_GREEN; break;
					case RED: child = Child.C_RED; break;
					case ROSA: child = Child.C_ROSA; break;
					case NONE: child = Child.C_NONE; break;
					}
					model.setChild(child);
					renderer.render();
					if(this instanceof Activity) {
						EventBus.fire(new HistoryChangedEvent((Activity<?>)this));
					}
					EventBus.fire(new ChildStartsWorkingEvent());
				}
			} else {
				processAction((Widget) s);
			}
		}
	}
	
	/**
	 * overload this method to handle special cards for which no model exists
	 * @param w the widget which got clicked
	 */
	public void processAction(Widget w) {
		
	}
	
	/**
	 * overload this method to handle special cards for which a model exists
	 * @param model the model of the card which got clicked <br>and do not forget to call super.processAction()
	 * @return true if the operation is allowed and the child should get set, otherwise false
	 */
	public boolean processAction(BaseFieldModel model) {
		if(model.getRessourceCount() > 0 && model.getRessource() != Resource.R_NONE) {
			RessourceItem[] items = new RessourceItem[] { new RessourceItem(model.getRessource(), model.getRessourceCount()) };
			EventBus.getEventBus().fireEvent(new AddResourceEvent(items));
			model.setRessourceCount(0);
		}
		return true;
	}
	
	public Renderer getRenderer(Widget w) {
		do {
			if(w instanceof Renderer) {
				return (Renderer) w;
			}
		} while( (w = w.getParent()) != null);
		return null;
	}

	@Override
	public void onNextRound(NextRoundEvent event) {
		removeChildrenAndAddRessources((Widget) display.getPanel());
	}
	
	private void removeChildrenAndAddRessources(Widget w) {
		if(w instanceof Renderer) {
			Renderer r = (Renderer)w;
			if(r instanceof HasBaseFieldModel) {
				BaseFieldModel model = ((HasBaseFieldModel) r).getModel();
				model.setChild(Child.C_NONE);
				if(model instanceof BigFieldModel && w.isVisible()) {
					model.setRessourceCount(model.getRessourceCount() + ((BigFieldModel)model).getRessourceRoundAddition());
				}
				r.render();
			}
		} else if(w instanceof HasWidgets) {
			Iterator<Widget> it = ((HasWidgets) w).iterator();
			while(it.hasNext()) {
				removeChildrenAndAddRessources(it.next());
			}
		}
	}
	
	public void showOneMoreBigCard(int round) {
		display.showOneMoreBigCard(round);
	}
}
