package de.tu_freiberg.informatik.vonwenckstern.client.event;

import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.HandlerRegistration;

import de.tu_freiberg.informatik.vonwenckstern.client.event.FamilyAdditionEvent.FamilyAdditionHandler;

/**
 * Fires after the user selected a card field containing resources
 */
public class FamilyAdditionEvent extends GwtEvent<FamilyAdditionHandler> {

  /**
   * Handler type.
   */
  private static Type<FamilyAdditionHandler> TYPE;

  /**
   * Gets the type associated with this event.
   * 
   * @return returns the handler type
   */
  public static Type<FamilyAdditionHandler> getType() {
    if (TYPE == null) {
      TYPE = new Type<FamilyAdditionHandler>();
    }
    return TYPE;
  }
  
  public FamilyAdditionEvent() {
  }
  
  @SuppressWarnings({"unchecked", "rawtypes"})
  @Override
  public Type<FamilyAdditionHandler> getAssociatedType() {
    return (Type) TYPE;
  }

  @Override
  protected void dispatch(FamilyAdditionHandler handler) {
    handler.onFamilyAddition(this);
  }
  
  /**
   * Handler class for {@link FamilyAdditionEvent} events.
   */
  public interface FamilyAdditionHandler extends EventHandler {

    /**
     * Called when a player selected resources
     */
    void onFamilyAddition(FamilyAdditionEvent event);
  }
  
  /**
   * A widget that implements this interface is a public source of
   * {@link FamilyAdditionEvent} events.
   */
  public interface HasFamilyAdditionHandler {

    /**
     * Adds a {@link FamilyAdditionHandler} handler for {@link FamilyAdditionEvent} events.
     * 
     * @param handler the handler
     * @return the registration for the event
     */
    HandlerRegistration addFamilyAdditionHandler(FamilyAdditionHandler handler);
  }

}
