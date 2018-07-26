package de.tu_freiberg.informatik.vonwenckstern.client.event;

import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.HandlerRegistration;

import de.tu_freiberg.informatik.vonwenckstern.client.event.ResourceModelChangedEvent.ResourceModelChangedHandler;

/**
 * Fires after the user selected a card field containing resources
 */
public class ResourceModelChangedEvent extends GwtEvent<ResourceModelChangedHandler> {

  /**
   * Handler type.
   */
  private static Type<ResourceModelChangedHandler> TYPE;

  /**
   * Gets the type associated with this event.
   * 
   * @return returns the handler type
   */
  public static Type<ResourceModelChangedHandler> getType() {
    if (TYPE == null) {
      TYPE = new Type<ResourceModelChangedHandler>();
    }
    return TYPE;
  }
  
  public ResourceModelChangedEvent() {
  }
  
  @SuppressWarnings({"unchecked", "rawtypes"})
  @Override
  public Type<ResourceModelChangedHandler> getAssociatedType() {
    return (Type) TYPE;
  }

  @Override
  protected void dispatch(ResourceModelChangedHandler handler) {
    handler.onResourceChanged(this);
  }
  
  /**
   * Handler class for {@link ResourceModelChangedEvent} events.
   */
  public interface ResourceModelChangedHandler extends EventHandler {

    /**
     * Called when a player selected resources
     */
    void onResourceChanged(ResourceModelChangedEvent event);
  }
  
  /**
   * A widget that implements this interface is a public source of
   * {@link ResourceModelChangedEvent} events.
   */
  public interface HasResourceModelChangedHandler {

    /**
     * Adds a {@link ResourceModelChangedHandler} handler for {@link ResourceModelChangedEvent} events.
     * 
     * @param handler the handler
     * @return the registration for the event
     */
    HandlerRegistration addResourceModelChangedHandler(ResourceModelChangedHandler handler);
  }

}
