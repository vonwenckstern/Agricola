package de.tu_freiberg.informatik.vonwenckstern.client.event;

import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.HandlerRegistration;

import de.tu_freiberg.informatik.vonwenckstern.client.event.GetCowEvent.GetCowHandler;

/**
 * Fires after the user selected a card field containing resources
 */
public class GetCowEvent extends GwtEvent<GetCowHandler> {

  /**
   * Handler type.
   */
  private static Type<GetCowHandler> TYPE;

  /**
   * Gets the type associated with this event.
   * 
   * @return returns the handler type
   */
  public static Type<GetCowHandler> getType() {
    if (TYPE == null) {
      TYPE = new Type<GetCowHandler>();
    }
    return TYPE;
  }
  
  private int cow;
  
  public GetCowEvent(int cow) {
	  this.cow = cow;
  }
  
  public int getCowCount() {
	  return cow;
  }
  
  @SuppressWarnings({"unchecked", "rawtypes"})
  @Override
  public Type<GetCowHandler> getAssociatedType() {
    return (Type) TYPE;
  }

  @Override
  protected void dispatch(GetCowHandler handler) {
    handler.onGettingCow(this);
  }
  
  /**
   * Handler class for {@link GetCowEvent} events.
   */
  public interface GetCowHandler extends EventHandler {

    /**
     * Called when a player selected resources
     */
    void onGettingCow(GetCowEvent event);
  }
  
  /**
   * A widget that implements this interface is a public source of
   * {@link GetCowEvent} events.
   */
  public interface HasGetCowHandler {

    /**
     * Adds a {@link GetCowHandler} handler for {@link GetCowEvent} events.
     * 
     * @param handler the handler
     * @return the registration for the event
     */
    HandlerRegistration addGetCowHandler(GetCowHandler handler);
  }

}
