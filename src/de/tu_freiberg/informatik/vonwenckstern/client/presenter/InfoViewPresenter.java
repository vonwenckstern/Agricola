package de.tu_freiberg.informatik.vonwenckstern.client.presenter;

import com.google.gwt.user.client.ui.Widget;

import de.tu_freiberg.informatik.vonwenckstern.client.EventBus;
import de.tu_freiberg.informatik.vonwenckstern.client.HistoryController;
import de.tu_freiberg.informatik.vonwenckstern.client.event.HistoryChangedEvent;
import de.tu_freiberg.informatik.vonwenckstern.client.event.RequestHistoryEvent;
import de.tu_freiberg.informatik.vonwenckstern.client.event.ResourceModelChangedEvent;
import de.tu_freiberg.informatik.vonwenckstern.client.event.ResourceModelChangedEvent.ResourceModelChangedHandler;
import de.tu_freiberg.informatik.vonwenckstern.client.model.PlayerResourceModel;

public class InfoViewPresenter implements Activity<PlayerResourceModel>, ResourceModelChangedHandler {
	
	public interface Display {
		public void updateView(PlayerResourceModel model);
		public Widget asWidget();
	}
	
	private Display display = null;
	private PlayerResourceModel model = null; 
	
	public InfoViewPresenter(Display display, PlayerResourceModel model) {
		this.display = display;
		this.model = model;
		model.addResourceModelChangedHandler(this);
		HistoryController.getInstance().addActivityPresenter(this);
		EventBus.fire(new RequestHistoryEvent(this));
	}
	
	@Override
	public Widget getView() {
		return display.asWidget();
	}

	@Override
	public void onResourceChanged(ResourceModelChangedEvent event) {
		display.updateView(model);
		EventBus.fire(new HistoryChangedEvent(this));
	}

	private static Type<InfoViewPresenter> TYPE = new Type<InfoViewPresenter>("InfoViewPresenter");
	@Override
	public Activity.Type<?> getActivityKey() {
		return TYPE;
	}

	@Override
	public PlayerResourceModel getActualHistory() {
		return model.clone();
	}

	@Override
	public void setActualHistory(PlayerResourceModel state) {
		model.update(state); // never reassign the model by doing this.model = state;
		// because than you changed the reference, and if anywhere else this model was earlier referenced 
		// the view is not synchrony anymore
		display.updateView(model);
	}

}
