package de.tu_freiberg.informatik.vonwenckstern.client.event;

import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.HandlerRegistration;

import de.tu_freiberg.informatik.vonwenckstern.client.event.FamilyAdditionWithoutHouseEvent.FamilyAdditionWithoutHouseHandler;

/**
 * Fires after the user selected a card field containing resources
 */
public class FamilyAdditionWithoutHouseEvent extends GwtEvent<FamilyAdditionWithoutHouseHandler> {

  /**
   * Handler type.
   */
  private static Type<FamilyAdditionWithoutHouseHandler> TYPE;

  /**
   * Gets the type associated with this event.
   * 
   * @return returns the handler type
   */
  public static Type<FamilyAdditionWithoutHouseHandler> getType() {
    if (TYPE == null) {
      TYPE = new Type<FamilyAdditionWithoutHouseHandler>();
    }
    return TYPE;
  }
  
  public FamilyAdditionWithoutHouseEvent() {
  }
  
  @SuppressWarnings({"unchecked", "rawtypes"})
  @Override
  public Type<FamilyAdditionWithoutHouseHandler> getAssociatedType() {
    return (Type) TYPE;
  }

  @Override
  protected void dispatch(FamilyAdditionWithoutHouseHandler handler) {
    handler.onFamilyAdditionWithoutHouse(this);
  }
  
  /**
   * Handler class for {@link FamilyAdditionWithoutHouseEvent} events.
   */
  public interface FamilyAdditionWithoutHouseHandler extends EventHandler {

    /**
     * Called when a player selected resources
     */
    void onFamilyAdditionWithoutHouse(FamilyAdditionWithoutHouseEvent event);
  }
  
  /**
   * A widget that implements this interface is a public source of
   * {@link FamilyAdditionWithoutHouseEvent} events.
   */
  public interface HasFamilyAdditionWithoutHouseHandler {

    /**
     * Adds a {@link FamilyAdditionWithoutHouseHandler} handler for {@link FamilyAdditionWithoutHouseEvent} events.
     * 
     * @param handler the handler
     * @return the registration for the event
     */
    HandlerRegistration addFamilyAdditionWithoutHouseHandler(FamilyAdditionWithoutHouseHandler handler);
  }

}
