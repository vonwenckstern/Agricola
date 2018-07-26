package de.tu_freiberg.informatik.vonwenckstern.client;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.event.shared.HandlerRegistration;

import de.tu_freiberg.informatik.vonwenckstern.client.event.AddResourceEvent;
import de.tu_freiberg.informatik.vonwenckstern.client.event.BuildFenceEvent;
import de.tu_freiberg.informatik.vonwenckstern.client.event.ChildStartsWorkingEvent;
import de.tu_freiberg.informatik.vonwenckstern.client.event.ChildStartsWorkingEvent.ChildStartsWorkingHandler;
import de.tu_freiberg.informatik.vonwenckstern.client.event.EnableBigAcquisitionEvent;
import de.tu_freiberg.informatik.vonwenckstern.client.event.EnableBigAcquisitionEvent.EnableBigAcquisitionHandler;
import de.tu_freiberg.informatik.vonwenckstern.client.event.FamilyAdditionWithoutHouseEvent;
import de.tu_freiberg.informatik.vonwenckstern.client.event.GetBigAcquisitionEvent;
import de.tu_freiberg.informatik.vonwenckstern.client.event.GetBigAcquisitionEvent.GetBigAcquisitionHandler;
import de.tu_freiberg.informatik.vonwenckstern.client.event.GetBigAcquisitionEvent.HasGetBigAcquisitionHandler;
import de.tu_freiberg.informatik.vonwenckstern.client.event.GetBoarEvent;
import de.tu_freiberg.informatik.vonwenckstern.client.event.GetCowEvent;
import de.tu_freiberg.informatik.vonwenckstern.client.event.EnableBigAcquisitionEvent.HasEnableBigAcquisitionHandler;
import de.tu_freiberg.informatik.vonwenckstern.client.event.FamilyAdditionWithoutHouseEvent.FamilyAdditionWithoutHouseHandler;
import de.tu_freiberg.informatik.vonwenckstern.client.event.FamilyAdditionWithoutHouseEvent.HasFamilyAdditionWithoutHouseHandler;
import de.tu_freiberg.informatik.vonwenckstern.client.event.GetBoarEvent.GetBoarHandler;
import de.tu_freiberg.informatik.vonwenckstern.client.event.GetBoarEvent.HasGetBoarHandler;
import de.tu_freiberg.informatik.vonwenckstern.client.event.GetCowEvent.GetCowHandler;
import de.tu_freiberg.informatik.vonwenckstern.client.event.GetCowEvent.HasGetCowHandler;
import de.tu_freiberg.informatik.vonwenckstern.client.event.GetSheepEvent;
import de.tu_freiberg.informatik.vonwenckstern.client.event.AddResourceEvent.AddResourceHandler;
import de.tu_freiberg.informatik.vonwenckstern.client.event.AddResourceEvent.HasAddResourceHandler;
import de.tu_freiberg.informatik.vonwenckstern.client.event.BuildFenceEvent.BuildFenceHandler;
import de.tu_freiberg.informatik.vonwenckstern.client.event.BuildHouseEvent;
import de.tu_freiberg.informatik.vonwenckstern.client.event.BuildFenceEvent.HasBuildFenceHandler;
import de.tu_freiberg.informatik.vonwenckstern.client.event.BuildHouseEvent.BuildHouseHandler;
import de.tu_freiberg.informatik.vonwenckstern.client.event.BuildHouseEvent.HasBuildHouseHandler;
import de.tu_freiberg.informatik.vonwenckstern.client.event.ChildStartsWorkingEvent.HasChildStartsWorkingHandler;
import de.tu_freiberg.informatik.vonwenckstern.client.event.FamilyAdditionEvent;
import de.tu_freiberg.informatik.vonwenckstern.client.event.FamilyAdditionEvent.FamilyAdditionHandler;
import de.tu_freiberg.informatik.vonwenckstern.client.event.FamilyAdditionEvent.HasFamilyAdditionHandler;
import de.tu_freiberg.informatik.vonwenckstern.client.event.GetSheepEvent.GetSheepHandler;
import de.tu_freiberg.informatik.vonwenckstern.client.event.GetSheepEvent.HasGetSheepHandler;
import de.tu_freiberg.informatik.vonwenckstern.client.event.HistoryChangedEvent;
import de.tu_freiberg.informatik.vonwenckstern.client.event.HistoryChangedEvent.HasHistoryChangedHandler;
import de.tu_freiberg.informatik.vonwenckstern.client.event.HistoryChangedEvent.HistoryChangedHandler;
import de.tu_freiberg.informatik.vonwenckstern.client.event.NextRoundEvent;
import de.tu_freiberg.informatik.vonwenckstern.client.event.NextRoundEvent.HasNextRoundHandler;
import de.tu_freiberg.informatik.vonwenckstern.client.event.NextRoundEvent.NextRoundHandler;
import de.tu_freiberg.informatik.vonwenckstern.client.event.PlayerFieldDoneEvent;
import de.tu_freiberg.informatik.vonwenckstern.client.event.PlayerFieldDoneEvent.HasPlayerFieldDoneHandler;
import de.tu_freiberg.informatik.vonwenckstern.client.event.PlayerFieldDoneEvent.PlayerFieldDoneHandler;
import de.tu_freiberg.informatik.vonwenckstern.client.event.PlowFieldEvent;
import de.tu_freiberg.informatik.vonwenckstern.client.event.PlowFieldEvent.HasPlowFieldHandler;
import de.tu_freiberg.informatik.vonwenckstern.client.event.PlowFieldEvent.PlowFieldHandler;
import de.tu_freiberg.informatik.vonwenckstern.client.event.PlowFieldSeedEvent;
import de.tu_freiberg.informatik.vonwenckstern.client.event.PlowFieldSeedEvent.HasPlowFieldSeedHandler;
import de.tu_freiberg.informatik.vonwenckstern.client.event.PlowFieldSeedEvent.PlowFieldSeedHandler;
import de.tu_freiberg.informatik.vonwenckstern.client.event.RequestHistoryEvent;
import de.tu_freiberg.informatik.vonwenckstern.client.event.RequestHistoryEvent.HasRequestHistoryHandler;
import de.tu_freiberg.informatik.vonwenckstern.client.event.RequestHistoryEvent.RequestHistoryHandler;
import de.tu_freiberg.informatik.vonwenckstern.client.event.RestaurateAndFenceEvent;
import de.tu_freiberg.informatik.vonwenckstern.client.event.RestaurateAndFenceEvent.HasRestaurateAndFenceHandler;
import de.tu_freiberg.informatik.vonwenckstern.client.event.RestaurateAndFenceEvent.RestaurateAndFenceHandler;
import de.tu_freiberg.informatik.vonwenckstern.client.event.RestaurateEvent;
import de.tu_freiberg.informatik.vonwenckstern.client.event.RestaurateEvent.HasRestaurateHandler;
import de.tu_freiberg.informatik.vonwenckstern.client.event.RestaurateEvent.RestaurateHandler;
import de.tu_freiberg.informatik.vonwenckstern.client.event.SaveHistoryToURLEvent;
import de.tu_freiberg.informatik.vonwenckstern.client.event.SaveHistoryToURLEvent.HasSaveHistoryToURLHandler;
import de.tu_freiberg.informatik.vonwenckstern.client.event.SaveHistoryToURLEvent.SaveHistoryToURLHandler;
import de.tu_freiberg.informatik.vonwenckstern.client.event.SeedEvent;
import de.tu_freiberg.informatik.vonwenckstern.client.event.SeedEvent.HasSeedHandler;
import de.tu_freiberg.informatik.vonwenckstern.client.event.SeedEvent.SeedHandler;
import de.tu_freiberg.informatik.vonwenckstern.client.event.ShowingDialogEvent;
import de.tu_freiberg.informatik.vonwenckstern.client.event.ShowingDialogEvent.HasShowingDialogHandler;
import de.tu_freiberg.informatik.vonwenckstern.client.event.ShowingDialogEvent.ShowingDialogHandler;

public class EventBus extends HandlerManager implements HasAddResourceHandler, HasBuildHouseHandler, HasPlayerFieldDoneHandler, HasPlowFieldHandler,
	HasBuildFenceHandler, HasFamilyAdditionHandler, HasRestaurateHandler, HasSeedHandler, HasGetSheepHandler, HasGetBoarHandler, HasGetCowHandler,
	HasPlowFieldSeedHandler, HasFamilyAdditionWithoutHouseHandler, HasRestaurateAndFenceHandler, HasChildStartsWorkingHandler, HasNextRoundHandler,
	HasGetBigAcquisitionHandler, HasEnableBigAcquisitionHandler, HasShowingDialogHandler, HasHistoryChangedHandler, HasRequestHistoryHandler, HasSaveHistoryToURLHandler {
	
	private EventBus() {
		super(null);
	}
	private static EventBus eventBus = new EventBus();
	public static EventBus getEventBus() {
		return eventBus;
	}
	
	public static void fire(GwtEvent<?> event) {
		eventBus.fireEvent(event);
	}
	
	@Override
	public HandlerRegistration addAddResourceHandler(AddResourceHandler handler) {
		return addHandler(AddResourceEvent.getType(), handler);
	}

	@Override
	public HandlerRegistration addBuildHouseHandler(BuildHouseHandler handler) {
		return addHandler(BuildHouseEvent.getType(), handler);
	}

	@Override
	public HandlerRegistration addPlayerFieldDoneHandler(PlayerFieldDoneHandler handler) {
		return addHandler(PlayerFieldDoneEvent.getType(), handler);
	}

	@Override
	public HandlerRegistration addPlowFieldHandler(PlowFieldHandler handler) {
		return addHandler(PlowFieldEvent.getType(), handler);
	}

	@Override
	public HandlerRegistration addSeedHandler(SeedHandler handler) {
		return addHandler(SeedEvent.getType(), handler);
	}

	@Override
	public HandlerRegistration addRestaurateHandler(RestaurateHandler handler) {
		return addHandler(RestaurateEvent.getType(), handler);
	}

	@Override
	public HandlerRegistration addFamilyAdditionHandler(FamilyAdditionHandler handler) {
		return addHandler(FamilyAdditionEvent.getType(), handler);
	}

	@Override
	public HandlerRegistration addBuildFenceHandler(BuildFenceHandler handler) {
		return addHandler(BuildFenceEvent.getType(), handler);
	}

	@Override
	public HandlerRegistration addGetSheepHandler(GetSheepHandler handler) {
		return addHandler(GetSheepEvent.getType(), handler);
	}

	@Override
	public HandlerRegistration addRestaurateAndFenceHandler(RestaurateAndFenceHandler handler) {
		return addHandler(RestaurateAndFenceEvent.getType(), handler);
	}

	@Override
	public HandlerRegistration addFamilyAdditionWithoutHouseHandler(FamilyAdditionWithoutHouseHandler handler) {
		return addHandler(FamilyAdditionWithoutHouseEvent.getType(), handler);
	}

	@Override
	public HandlerRegistration addPlowFieldSeedHandler(PlowFieldSeedHandler handler) {
		return addHandler(PlowFieldSeedEvent.getType(), handler);
	}

	@Override
	public HandlerRegistration addGetCowHandler(GetCowHandler handler) {
		return addHandler(GetCowEvent.getType(), handler);
	}

	@Override
	public HandlerRegistration addGetBoarHandler(GetBoarHandler handler) {
		return addHandler(GetBoarEvent.getType(), handler);
	}

	@Override
	public HandlerRegistration addChildStartsWorkingHandler(ChildStartsWorkingHandler handler) {
		return addHandler(ChildStartsWorkingEvent.getType(), handler);
	}

	@Override
	public HandlerRegistration addNextRoundHandler(NextRoundHandler handler) {
		return addHandler(NextRoundEvent.getType(), handler);
	}

	@Override
	public HandlerRegistration addGetBigAcquisitionHandler(GetBigAcquisitionHandler handler) {
		return addHandler(GetBigAcquisitionEvent.getType(), handler);
	}

	@Override
	public HandlerRegistration addEnableBigAcquisitionHandler(EnableBigAcquisitionHandler handler) {
		return addHandler(EnableBigAcquisitionEvent.getType(), handler);
	}

	@Override
	public HandlerRegistration addShwoingDialogHandler(ShowingDialogHandler handler) {
		return addHandler(ShowingDialogEvent.getType(), handler);
	}

	@Override
	public HandlerRegistration addRequestHistoryHandler(RequestHistoryHandler handler) {
		return addHandler(RequestHistoryEvent.getType(), handler);
	}

	@Override
	public HandlerRegistration addHistoryChangedHandler(HistoryChangedHandler handler) {
		return addHandler(HistoryChangedEvent.getType(), handler);
	}

	@Override
	public HandlerRegistration addSaveHistoryToURLHandler(SaveHistoryToURLHandler handler) {
		return addHandler(SaveHistoryToURLEvent.getType(), handler);
	}
}
