package de.tu_freiberg.informatik.vonwenckstern.client.presenter;

import com.google.gwt.user.client.Window;

import de.tu_freiberg.informatik.vonwenckstern.client.EventBus;
import de.tu_freiberg.informatik.vonwenckstern.client.HistoryController;
import de.tu_freiberg.informatik.vonwenckstern.client.event.AddResourceEvent;
import de.tu_freiberg.informatik.vonwenckstern.client.event.AddResourceEvent.RessourceItem;
import de.tu_freiberg.informatik.vonwenckstern.client.event.BuildHouseEvent;
import de.tu_freiberg.informatik.vonwenckstern.client.event.HistoryChangedEvent;
import de.tu_freiberg.informatik.vonwenckstern.client.event.NextRoundEvent;
import de.tu_freiberg.informatik.vonwenckstern.client.event.PlowFieldEvent;
import de.tu_freiberg.informatik.vonwenckstern.client.event.RequestHistoryEvent;
import de.tu_freiberg.informatik.vonwenckstern.client.model.BaseFieldModel;
import de.tu_freiberg.informatik.vonwenckstern.client.model.BigFieldModel;
import de.tu_freiberg.informatik.vonwenckstern.client.model.CardFieldModel;
import de.tu_freiberg.informatik.vonwenckstern.client.model.Player;
import de.tu_freiberg.informatik.vonwenckstern.client.model.Resource;

public class CardFieldPresenter extends ResourcePresenter implements Activity<CardFieldModel>{

	public interface Display extends ResourcePresenter.Display {
		public void update(CardFieldModel model);
	}
	
	private CardFieldModel model = null;
	
	public CardFieldPresenter(Display display, Player player, CardFieldModel model) {
		super(display, player);
		this.model = model;
		display.update(model);
		HistoryController.getInstance().addActivityPresenter(this);
		EventBus.fire(new RequestHistoryEvent(this));
	}

	public boolean processAction(BaseFieldModel model) {
		super.processAction(model);
		String id = model.getId();
		if(id == null) id = "";
		if(id.equals("buildHouse")) {
			EventBus.fire(new BuildHouseEvent());
		} else if(id.equals("startPlayer")) {
			Window.alert("Since this play supports only single player mode until now, you wasted one turn.");
		} else if(id.equals("oneGrain")) {
			RessourceItem[] items = new RessourceItem[] { new RessourceItem(Resource.R_GRAIN, 1)};
			EventBus.fire(new AddResourceEvent(items));
		} else if(id.equals("plowField")) {
			EventBus.fire(new PlowFieldEvent());
		} else if(id.equals("twoFoodMarkers")) {
			RessourceItem[] items = new RessourceItem[] { new RessourceItem(Resource.R_FOOD, 2)};
			EventBus.fire(new AddResourceEvent(items));
		} else if(id.equals("noOperation")) {
			return false;
		}else if(model instanceof BigFieldModel) {
			switch(((BigFieldModel) model).getBgCard()) {
			case REED_STONE_FOOD: {
				RessourceItem[] items = new RessourceItem[] { new RessourceItem(Resource.R_REED, 1),new RessourceItem(Resource.R_STONE, 1),new RessourceItem(Resource.R_FOOD, 1) };
				EventBus.fire(new AddResourceEvent(items));
				break;
			}
			default: break;
			}
		}
		return true;
	}

	private static Type<CardFieldPresenter> TYPE = new Type<CardFieldPresenter>("CardFieldPresenter");
	@Override
	public Activity.Type<?> getActivityKey() {
		return TYPE;
	}

	@Override
	public CardFieldModel getActualHistory() {
		return model.clone(); // need to return a clone, otherwise the equals comparison in the history controller is every time true
	}

	@Override
	public void setActualHistory(CardFieldModel state) {
		model.update(state);
		((Display)display).update(model);
	}
	
	@Override
	public void onNextRound(NextRoundEvent event) {
		super.onNextRound(event);
		EventBus.fire(new HistoryChangedEvent(this));
	}
}
