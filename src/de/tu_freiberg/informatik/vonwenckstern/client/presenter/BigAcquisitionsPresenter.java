package de.tu_freiberg.informatik.vonwenckstern.client.presenter;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Widget;

import de.tu_freiberg.informatik.vonwenckstern.client.EventBus;
import de.tu_freiberg.informatik.vonwenckstern.client.HistoryController;
import de.tu_freiberg.informatik.vonwenckstern.client.event.GetBigAcquisitionEvent;
import de.tu_freiberg.informatik.vonwenckstern.client.event.HistoryChangedEvent;
import de.tu_freiberg.informatik.vonwenckstern.client.event.RequestHistoryEvent;
import de.tu_freiberg.informatik.vonwenckstern.client.model.BigAcquisitationsModel;
import de.tu_freiberg.informatik.vonwenckstern.client.model.BigAcquisitions;
import de.tu_freiberg.informatik.vonwenckstern.client.model.HasAcquisitionCardModel;

public class BigAcquisitionsPresenter implements Activity<BigAcquisitationsModel>, ClickHandler {
	
	public interface Display {
		public void update(BigAcquisitationsModel model);
		public void hideAcquisition(BigAcquisitions aquisition);
		public void registerHandlers(ClickHandler p);
		public Widget asWidget();
	}
	
	private BigAcquisitationsModel model = null;
	
	private Display display = null;
	
	public BigAcquisitionsPresenter(Display display, BigAcquisitationsModel model) {
		this.display = display;
		display.registerHandlers(this);
		this.model = model;
		display.update(model);
		HistoryController.getInstance().addActivityPresenter(this);
		EventBus.fire(new RequestHistoryEvent(this));
	}

	@Override
	public void onClick(ClickEvent event) {
		if(event.getSource() instanceof HasAcquisitionCardModel) {
			EventBus.fire(new GetBigAcquisitionEvent(((HasAcquisitionCardModel) event.getSource()).getModel()));
		}
	}

	@Override
	public Widget getView() {
		return display.asWidget();
	}
	
	public void hideAcquisition(BigAcquisitions aquisition) {
		display.hideAcquisition(aquisition);
		EventBus.fire(new HistoryChangedEvent(this));
	}

	private static Type<BigAcquisitionsPresenter> TYPE = new Type<BigAcquisitionsPresenter>("BigAcquisitionsPresenter");
	@Override
	public Activity.Type<?> getActivityKey() {
		return TYPE;
	}

	@Override
	public BigAcquisitationsModel getActualHistory() {
		return model.clone();
	}

	@Override
	public void setActualHistory(BigAcquisitationsModel state) {
		model.update(state);
		display.update(model);
	}

}
