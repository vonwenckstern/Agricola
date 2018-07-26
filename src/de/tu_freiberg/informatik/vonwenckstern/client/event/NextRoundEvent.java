package de.tu_freiberg.informatik.vonwenckstern.client.event;

import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.HandlerRegistration;

import de.tu_freiberg.informatik.vonwenckstern.client.event.NextRoundEvent.NextRoundHandler;

/**
 * Fires after the user selected a card field containing resources
 */
public class NextRoundEvent extends GwtEvent<NextRoundHandler> {

  /**
   * Handler type.
   */
  private static Type<NextRoundHandler> TYPE;

  /**
   * Gets the type associated with this event.
   * 
   * @return returns the handler type
   */
  public static Type<NextRoundHandler> getType() {
    if (TYPE == null) {
      TYPE = new Type<NextRoundHandler>();
    }
    return TYPE;
  }
  
  private int round;
  
  public NextRoundEvent(int round) {
	  this.round = round;
  }
  
  public int getRound() {
	  return round;
  }
  
  @SuppressWarnings({"unchecked", "rawtypes"})
  @Override
  public Type<NextRoundHandler> getAssociatedType() {
    return (Type) TYPE;
  }

  @Override
  protected void dispatch(NextRoundHandler handler) {
    handler.onNextRound(this);
  }
  
  /**
   * Handler class for {@link NextRoundEvent} events.
   */
  public interface NextRoundHandler extends EventHandler {

    /**
     * Called when a player selected resources
     */
    void onNextRound(NextRoundEvent event);
  }
  
  /**
   * A widget that implements this interface is a public source of
   * {@link NextRoundEvent} events.
   */
  public interface HasNextRoundHandler {

    /**
     * Adds a {@link NextRoundHandler} handler for {@link NextRoundEvent} events.
     * 
     * @param handler the handler
     * @return the registration for the event
     */
    HandlerRegistration addNextRoundHandler(NextRoundHandler handler);
  }

}
