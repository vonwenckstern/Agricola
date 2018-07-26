package de.tu_freiberg.informatik.vonwenckstern.client.event;

import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.HandlerRegistration;

import de.tu_freiberg.informatik.vonwenckstern.client.event.GetBoarEvent.GetBoarHandler;

/**
 * Fires after the user selected a card field containing resources
 */
public class GetBoarEvent extends GwtEvent<GetBoarHandler> {

  /**
   * Handler type.
   */
  private static Type<GetBoarHandler> TYPE;

  /**
   * Gets the type associated with this event.
   * 
   * @return returns the handler type
   */
  public static Type<GetBoarHandler> getType() {
    if (TYPE == null) {
      TYPE = new Type<GetBoarHandler>();
    }
    return TYPE;
  }
  
  private int boar;
  
  public GetBoarEvent(int boar) {
	  this.boar = boar;
  }
  
  public int getBoarCount() {
	  return boar;
  }
  
  @SuppressWarnings({"unchecked", "rawtypes"})
  @Override
  public Type<GetBoarHandler> getAssociatedType() {
    return (Type) TYPE;
  }

  @Override
  protected void dispatch(GetBoarHandler handler) {
    handler.onGettingBoar(this);
  }
  
  /**
   * Handler class for {@link GetBoarEvent} events.
   */
  public interface GetBoarHandler extends EventHandler {

    /**
     * Called when a player selected resources
     */
    void onGettingBoar(GetBoarEvent event);
  }
  
  /**
   * A widget that implements this interface is a public source of
   * {@link GetBoarEvent} events.
   */
  public interface HasGetBoarHandler {

    /**
     * Adds a {@link GetBoarHandler} handler for {@link GetBoarEvent} events.
     * 
     * @param handler the handler
     * @return the registration for the event
     */
    HandlerRegistration addGetBoarHandler(GetBoarHandler handler);
  }

}
