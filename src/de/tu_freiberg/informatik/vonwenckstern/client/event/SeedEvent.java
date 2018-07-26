package de.tu_freiberg.informatik.vonwenckstern.client.event;

import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.HandlerRegistration;

import de.tu_freiberg.informatik.vonwenckstern.client.event.SeedEvent.SeedHandler;

/**
 * Fires after the user selected a card field containing resources
 */
public class SeedEvent extends GwtEvent<SeedHandler> {

  /**
   * Handler type.
   */
  private static Type<SeedHandler> TYPE;

  /**
   * Gets the type associated with this event.
   * 
   * @return returns the handler type
   */
  public static Type<SeedHandler> getType() {
    if (TYPE == null) {
      TYPE = new Type<SeedHandler>();
    }
    return TYPE;
  }
  
  public SeedEvent() {
  }
  
  @SuppressWarnings({"unchecked", "rawtypes"})
  @Override
  public Type<SeedHandler> getAssociatedType() {
    return (Type) TYPE;
  }

  @Override
  protected void dispatch(SeedHandler handler) {
    handler.onSeeding(this);
  }
  
  /**
   * Handler class for {@link SeedEvent} events.
   */
  public interface SeedHandler extends EventHandler {

    /**
     * Called when a player selected resources
     */
    void onSeeding(SeedEvent event);
  }
  
  /**
   * A widget that implements this interface is a public source of
   * {@link SeedEvent} events.
   */
  public interface HasSeedHandler {

    /**
     * Adds a {@link SeedHandler} handler for {@link SeedEvent} events.
     * 
     * @param handler the handler
     * @return the registration for the event
     */
    HandlerRegistration addSeedHandler(SeedHandler handler);
  }

}
