package de.tu_freiberg.informatik.vonwenckstern.client.event;

import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.HandlerRegistration;

import de.tu_freiberg.informatik.vonwenckstern.client.event.PlowFieldEvent.PlowFieldHandler;

/**
 * Fires after the user selected a card field containing resources
 */
public class PlowFieldEvent extends GwtEvent<PlowFieldHandler> {

  /**
   * Handler type.
   */
  private static Type<PlowFieldHandler> TYPE;

  /**
   * Gets the type associated with this event.
   * 
   * @return returns the handler type
   */
  public static Type<PlowFieldHandler> getType() {
    if (TYPE == null) {
      TYPE = new Type<PlowFieldHandler>();
    }
    return TYPE;
  }
  
  public PlowFieldEvent() {
  }
  
  @SuppressWarnings({"unchecked", "rawtypes"})
  @Override
  public Type<PlowFieldHandler> getAssociatedType() {
    return (Type) TYPE;
  }

  @Override
  protected void dispatch(PlowFieldHandler handler) {
    handler.onPlowField(this);
  }
  
  /**
   * Handler class for {@link PlowFieldEvent} events.
   */
  public interface PlowFieldHandler extends EventHandler {

    /**
     * Called when a player selected resources
     */
    void onPlowField(PlowFieldEvent event);
  }
  
  /**
   * A widget that implements this interface is a public source of
   * {@link PlowFieldEvent} events.
   */
  public interface HasPlowFieldHandler {

    /**
     * Adds a {@link PlowFieldHandler} handler for {@link PlowFieldEvent} events.
     * 
     * @param handler the handler
     * @return the registration for the event
     */
    HandlerRegistration addPlowFieldHandler(PlowFieldHandler handler);
  }

}
