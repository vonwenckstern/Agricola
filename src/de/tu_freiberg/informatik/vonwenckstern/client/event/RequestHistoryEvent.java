package de.tu_freiberg.informatik.vonwenckstern.client.event;

import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.HandlerRegistration;

import de.tu_freiberg.informatik.vonwenckstern.client.event.RequestHistoryEvent.RequestHistoryHandler;
import de.tu_freiberg.informatik.vonwenckstern.client.presenter.Activity;

/**
 * Fires after the user selected a card field containing resources
 */
@SuppressWarnings("rawtypes")
public class RequestHistoryEvent extends GwtEvent<RequestHistoryHandler> {

  /**
   * Handler type.
   */
  private static Type<RequestHistoryHandler> TYPE;

  /**
   * Gets the type associated with this event.
   * 
   * @return returns the handler type
   */
  public static Type<RequestHistoryHandler> getType() {
    if (TYPE == null) {
      TYPE = new Type<RequestHistoryHandler>();
    }
    return TYPE;
  }
  
  	private Activity activity;
	
	public RequestHistoryEvent(Activity activity) {
		this.activity = activity;
	}
	
	public Activity getActivity() { return activity; }
  
  @SuppressWarnings({"unchecked"})
  @Override
  public Type<RequestHistoryHandler> getAssociatedType() {
    return (Type) TYPE;
  }

  @Override
  protected void dispatch(RequestHistoryHandler handler) {
    handler.onRequestHistory(this);
  }
  
  /**
   * Handler class for {@link RequestHistoryEvent} events.
   */
  public interface RequestHistoryHandler extends EventHandler {

    /**
     * Called when a player selected resources
     */
    void onRequestHistory(RequestHistoryEvent event);
  }
  
  /**
   * A widget that implements this interface is a public source of
   * {@link RequestHistoryEvent} events.
   */
  public interface HasRequestHistoryHandler {

    /**
     * Adds a {@link RequestHistoryHandler} handler for {@link RequestHistoryEvent} events.
     * 
     * @param handler the handler
     * @return the registration for the event
     */
    HandlerRegistration addRequestHistoryHandler(RequestHistoryHandler handler);
  }

}
