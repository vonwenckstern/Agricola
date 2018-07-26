package de.tu_freiberg.informatik.vonwenckstern.client.event;

import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.HandlerRegistration;

import de.tu_freiberg.informatik.vonwenckstern.client.event.GetSheepEvent.GetSheepHandler;

/**
 * Fires after the user selected a card field containing resources
 */
public class GetSheepEvent extends GwtEvent<GetSheepHandler> {

  /**
   * Handler type.
   */
  private static Type<GetSheepHandler> TYPE;

  /**
   * Gets the type associated with this event.
   * 
   * @return returns the handler type
   */
  public static Type<GetSheepHandler> getType() {
    if (TYPE == null) {
      TYPE = new Type<GetSheepHandler>();
    }
    return TYPE;
  }
  
  private int sheep;
  
  public GetSheepEvent(int sheep) {
	  this.sheep = sheep;
  }
  
  public int getSheepCount() {
	  return sheep;
  }
  
  @SuppressWarnings({"unchecked", "rawtypes"})
  @Override
  public Type<GetSheepHandler> getAssociatedType() {
    return (Type) TYPE;
  }

  @Override
  protected void dispatch(GetSheepHandler handler) {
    handler.onGettingSheep(this);
  }
  
  /**
   * Handler class for {@link GetSheepEvent} events.
   */
  public interface GetSheepHandler extends EventHandler {

    /**
     * Called when a player selected resources
     */
    void onGettingSheep(GetSheepEvent event);
  }
  
  /**
   * A widget that implements this interface is a public source of
   * {@link GetSheepEvent} events.
   */
  public interface HasGetSheepHandler {

    /**
     * Adds a {@link GetSheepHandler} handler for {@link GetSheepEvent} events.
     * 
     * @param handler the handler
     * @return the registration for the event
     */
    HandlerRegistration addGetSheepHandler(GetSheepHandler handler);
  }

}
