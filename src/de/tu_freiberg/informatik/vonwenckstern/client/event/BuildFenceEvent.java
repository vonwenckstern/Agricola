package de.tu_freiberg.informatik.vonwenckstern.client.event;

import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.HandlerRegistration;

import de.tu_freiberg.informatik.vonwenckstern.client.event.BuildFenceEvent.BuildFenceHandler;

/**
 * Fires after the user selected a card field containing resources
 */
public class BuildFenceEvent extends GwtEvent<BuildFenceHandler> {

  /**
   * Handler type.
   */
  private static Type<BuildFenceHandler> TYPE;

  /**
   * Gets the type associated with this event.
   * 
   * @return returns the handler type
   */
  public static Type<BuildFenceHandler> getType() {
    if (TYPE == null) {
      TYPE = new Type<BuildFenceHandler>();
    }
    return TYPE;
  }
  
  public BuildFenceEvent() {
  }
  
  @SuppressWarnings({"unchecked", "rawtypes"})
  @Override
  public Type<BuildFenceHandler> getAssociatedType() {
    return (Type) TYPE;
  }

  @Override
  protected void dispatch(BuildFenceHandler handler) {
    handler.onBuildFence(this);
  }
  
  /**
   * Handler class for {@link BuildFenceEvent} events.
   */
  public interface BuildFenceHandler extends EventHandler {

    /**
     * Called when a player selected resources
     */
    void onBuildFence(BuildFenceEvent event);
  }
  
  /**
   * A widget that implements this interface is a public source of
   * {@link BuildFenceEvent} events.
   */
  public interface HasBuildFenceHandler {

    /**
     * Adds a {@link BuildFenceHandler} handler for {@link BuildFenceEvent} events.
     * 
     * @param handler the handler
     * @return the registration for the event
     */
    HandlerRegistration addBuildFenceHandler(BuildFenceHandler handler);
  }

}
