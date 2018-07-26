package de.tu_freiberg.informatik.vonwenckstern.client.event;

import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.HandlerRegistration;

import de.tu_freiberg.informatik.vonwenckstern.client.event.ChildStartsWorkingEvent.ChildStartsWorkingHandler;

/**
 * Fires after the user selected a card field containing resources
 */
public class ChildStartsWorkingEvent extends GwtEvent<ChildStartsWorkingHandler> {

  /**
   * Handler type.
   */
  private static Type<ChildStartsWorkingHandler> TYPE;

  /**
   * Gets the type associated with this event.
   * 
   * @return returns the handler type
   */
  public static Type<ChildStartsWorkingHandler> getType() {
    if (TYPE == null) {
      TYPE = new Type<ChildStartsWorkingHandler>();
    }
    return TYPE;
  }
  
  public ChildStartsWorkingEvent() {
  }
  
  @SuppressWarnings({"unchecked", "rawtypes"})
  @Override
  public Type<ChildStartsWorkingHandler> getAssociatedType() {
    return (Type) TYPE;
  }

  @Override
  protected void dispatch(ChildStartsWorkingHandler handler) {
    handler.onChildStartsWorking(this);
  }
  
  /**
   * Handler class for {@link ChildStartsWorkingEvent} events.
   */
  public interface ChildStartsWorkingHandler extends EventHandler {

    /**
     * Called when a player selected resources
     */
    void onChildStartsWorking(ChildStartsWorkingEvent event);
  }
  
  /**
   * A widget that implements this interface is a public source of
   * {@link ChildStartsWorkingEvent} events.
   */
  public interface HasChildStartsWorkingHandler {

    /**
     * Adds a {@link ChildStartsWorkingHandler} handler for {@link ChildStartsWorkingEvent} events.
     * 
     * @param handler the handler
     * @return the registration for the event
     */
    HandlerRegistration addChildStartsWorkingHandler(ChildStartsWorkingHandler handler);
  }

}
