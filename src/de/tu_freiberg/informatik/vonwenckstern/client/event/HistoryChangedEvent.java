package de.tu_freiberg.informatik.vonwenckstern.client.event;

import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.HandlerRegistration;

import de.tu_freiberg.informatik.vonwenckstern.client.event.HistoryChangedEvent.HistoryChangedHandler;
import de.tu_freiberg.informatik.vonwenckstern.client.presenter.Activity;

/**
 * Fires after the user selected a card field containing resources
 */
@SuppressWarnings("rawtypes")
public class HistoryChangedEvent extends GwtEvent<HistoryChangedHandler> {

  /**
   * Handler type.
   */
  private static Type<HistoryChangedHandler> TYPE;

  /**
   * Gets the type associated with this event.
   * 
   * @return returns the handler type
   */
  public static Type<HistoryChangedHandler> getType() {
    if (TYPE == null) {
      TYPE = new Type<HistoryChangedHandler>();
    }
    return TYPE;
  }
  
  	private Activity activity;
	
	public HistoryChangedEvent(Activity activity) {
		this.activity = activity;
	}
	
	public Activity getActivity() { return activity; }
  
  @SuppressWarnings({"unchecked"})
  @Override
  public Type<HistoryChangedHandler> getAssociatedType() {
    return (Type) TYPE;
  }

  @Override
  protected void dispatch(HistoryChangedHandler handler) {
    handler.onHistoryChanged(this);
  }
  
  /**
   * Handler class for {@link HistoryChangedEvent} events.
   */
  public interface HistoryChangedHandler extends EventHandler {

    /**
     * Called when a player selected resources
     */
    void onHistoryChanged(HistoryChangedEvent event);
  }
  
  /**
   * A widget that implements this interface is a public source of
   * {@link HistoryChangedEvent} events.
   */
  public interface HasHistoryChangedHandler {

    /**
     * Adds a {@link HistoryChangedHandler} handler for {@link HistoryChangedEvent} events.
     * 
     * @param handler the handler
     * @return the registration for the event
     */
    HandlerRegistration addHistoryChangedHandler(HistoryChangedHandler handler);
  }

}
