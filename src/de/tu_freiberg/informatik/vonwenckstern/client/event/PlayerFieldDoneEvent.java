package de.tu_freiberg.informatik.vonwenckstern.client.event;

import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.HandlerRegistration;

import de.tu_freiberg.informatik.vonwenckstern.client.event.PlayerFieldDoneEvent.PlayerFieldDoneHandler;

/**
 * Fires after the user selected a card field containing resources
 */
public class PlayerFieldDoneEvent extends GwtEvent<PlayerFieldDoneHandler> {

  /**
   * Handler type.
   */
  private static Type<PlayerFieldDoneHandler> TYPE;

  /**
   * Gets the type associated with this event.
   * 
   * @return returns the handler type
   */
  public static Type<PlayerFieldDoneHandler> getType() {
    if (TYPE == null) {
      TYPE = new Type<PlayerFieldDoneHandler>();
    }
    return TYPE;
  }
  
  public PlayerFieldDoneEvent() {
  }
  
  @SuppressWarnings({"unchecked", "rawtypes"})
  @Override
  public Type<PlayerFieldDoneHandler> getAssociatedType() {
    return (Type) TYPE;
  }

  @Override
  protected void dispatch(PlayerFieldDoneHandler handler) {
    handler.onPlayerFieldDone(this);
  }
  
  /**
   * Handler class for {@link PlayerFieldDoneEvent} events.
   */
  public interface PlayerFieldDoneHandler extends EventHandler {

    /**
     * Called when a player selected resources
     */
    void onPlayerFieldDone(PlayerFieldDoneEvent event);
  }
  
  /**
   * A widget that implements this interface is a public source of
   * {@link PlayerFieldDoneEvent} events.
   */
  public interface HasPlayerFieldDoneHandler {

    /**
     * Adds a {@link PlayerFieldDoneHandler} handler for {@link PlayerFieldDoneEvent} events.
     * 
     * @param handler the handler
     * @return the registration for the event
     */
    HandlerRegistration addPlayerFieldDoneHandler(PlayerFieldDoneHandler handler);
  }

}
