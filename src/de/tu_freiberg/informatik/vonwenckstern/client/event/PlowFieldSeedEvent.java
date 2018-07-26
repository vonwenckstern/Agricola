package de.tu_freiberg.informatik.vonwenckstern.client.event;

import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.HandlerRegistration;

import de.tu_freiberg.informatik.vonwenckstern.client.event.PlowFieldSeedEvent.PlowFieldSeedHandler;

/**
 * Fires after the user selected a card field containing resources
 */
public class PlowFieldSeedEvent extends GwtEvent<PlowFieldSeedHandler> {

  /**
   * Handler type.
   */
  private static Type<PlowFieldSeedHandler> TYPE;

  /**
   * Gets the type associated with this event.
   * 
   * @return returns the handler type
   */
  public static Type<PlowFieldSeedHandler> getType() {
    if (TYPE == null) {
      TYPE = new Type<PlowFieldSeedHandler>();
    }
    return TYPE;
  }
  
  public PlowFieldSeedEvent() {
  }
  
  @SuppressWarnings({"unchecked", "rawtypes"})
  @Override
  public Type<PlowFieldSeedHandler> getAssociatedType() {
    return (Type) TYPE;
  }

  @Override
  protected void dispatch(PlowFieldSeedHandler handler) {
    handler.onPlowFieldAndSeed(this);
  }
  
  /**
   * Handler class for {@link PlowFieldSeedEvent} events.
   */
  public interface PlowFieldSeedHandler extends EventHandler {

    /**
     * Called when a player selected resources
     */
    void onPlowFieldAndSeed(PlowFieldSeedEvent event);
  }
  
  /**
   * A widget that implements this interface is a public source of
   * {@link PlowFieldSeedEvent} events.
   */
  public interface HasPlowFieldSeedHandler {

    /**
     * Adds a {@link PlowFieldSeedHandler} handler for {@link PlowFieldSeedEvent} events.
     * 
     * @param handler the handler
     * @return the registration for the event
     */
    HandlerRegistration addPlowFieldSeedHandler(PlowFieldSeedHandler handler);
  }

}
