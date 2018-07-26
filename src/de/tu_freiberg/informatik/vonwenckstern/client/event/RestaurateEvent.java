package de.tu_freiberg.informatik.vonwenckstern.client.event;

import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.HandlerRegistration;

import de.tu_freiberg.informatik.vonwenckstern.client.event.RestaurateEvent.RestaurateHandler;

/**
 * Fires after the user selected a card field containing resources
 */
public class RestaurateEvent extends GwtEvent<RestaurateHandler> {

  /**
   * Handler type.
   */
  private static Type<RestaurateHandler> TYPE;

  /**
   * Gets the type associated with this event.
   * 
   * @return returns the handler type
   */
  public static Type<RestaurateHandler> getType() {
    if (TYPE == null) {
      TYPE = new Type<RestaurateHandler>();
    }
    return TYPE;
  }
  
  public RestaurateEvent() {
  }
  
  @SuppressWarnings({"unchecked", "rawtypes"})
  @Override
  public Type<RestaurateHandler> getAssociatedType() {
    return (Type) TYPE;
  }

  @Override
  protected void dispatch(RestaurateHandler handler) {
    handler.onRestaurate(this);
  }
  
  /**
   * Handler class for {@link RestaurateEvent} events.
   */
  public interface RestaurateHandler extends EventHandler {

    /**
     * Called when a player selected resources
     */
    void onRestaurate(RestaurateEvent event);
  }
  
  /**
   * A widget that implements this interface is a public source of
   * {@link RestaurateEvent} events.
   */
  public interface HasRestaurateHandler {

    /**
     * Adds a {@link RestaurateHandler} handler for {@link RestaurateEvent} events.
     * 
     * @param handler the handler
     * @return the registration for the event
     */
    HandlerRegistration addRestaurateHandler(RestaurateHandler handler);
  }

}
