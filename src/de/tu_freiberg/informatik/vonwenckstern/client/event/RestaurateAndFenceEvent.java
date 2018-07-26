package de.tu_freiberg.informatik.vonwenckstern.client.event;

import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.HandlerRegistration;

import de.tu_freiberg.informatik.vonwenckstern.client.event.RestaurateAndFenceEvent.RestaurateAndFenceHandler;

/**
 * Fires after the user selected a card field containing resources
 */
public class RestaurateAndFenceEvent extends GwtEvent<RestaurateAndFenceHandler> {

  /**
   * Handler type.
   */
  private static Type<RestaurateAndFenceHandler> TYPE;

  /**
   * Gets the type associated with this event.
   * 
   * @return returns the handler type
   */
  public static Type<RestaurateAndFenceHandler> getType() {
    if (TYPE == null) {
      TYPE = new Type<RestaurateAndFenceHandler>();
    }
    return TYPE;
  }
  
  public RestaurateAndFenceEvent() {
  }
  
  @SuppressWarnings({"unchecked", "rawtypes"})
  @Override
  public Type<RestaurateAndFenceHandler> getAssociatedType() {
    return (Type) TYPE;
  }

  @Override
  protected void dispatch(RestaurateAndFenceHandler handler) {
    handler.onRestaurateAndBuildFence(this);
  }
  
  /**
   * Handler class for {@link RestaurateAndFenceEvent} events.
   */
  public interface RestaurateAndFenceHandler extends EventHandler {

    /**
     * Called when a player selected resources
     */
    void onRestaurateAndBuildFence(RestaurateAndFenceEvent event);
  }
  
  /**
   * A widget that implements this interface is a public source of
   * {@link RestaurateAndFenceEvent} events.
   */
  public interface HasRestaurateAndFenceHandler {

    /**
     * Adds a {@link RestaurateAndFenceHandler} handler for {@link RestaurateAndFenceEvent} events.
     * 
     * @param handler the handler
     * @return the registration for the event
     */
    HandlerRegistration addRestaurateAndFenceHandler(RestaurateAndFenceHandler handler);
  }

}
