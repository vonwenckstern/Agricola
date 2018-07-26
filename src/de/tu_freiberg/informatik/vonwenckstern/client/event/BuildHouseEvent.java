package de.tu_freiberg.informatik.vonwenckstern.client.event;

import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.HandlerRegistration;

import de.tu_freiberg.informatik.vonwenckstern.client.event.BuildHouseEvent.BuildHouseHandler;

/**
 * Fires after the user selected a card field containing resources
 */
public class BuildHouseEvent extends GwtEvent<BuildHouseHandler> {

  /**
   * Handler type.
   */
  private static Type<BuildHouseHandler> TYPE;

  /**
   * Gets the type associated with this event.
   * 
   * @return returns the handler type
   */
  public static Type<BuildHouseHandler> getType() {
    if (TYPE == null) {
      TYPE = new Type<BuildHouseHandler>();
    }
    return TYPE;
  }
  
  public BuildHouseEvent() {
  }
  
  @SuppressWarnings({"unchecked", "rawtypes"})
  @Override
  public Type<BuildHouseHandler> getAssociatedType() {
    return (Type) TYPE;
  }

  @Override
  protected void dispatch(BuildHouseHandler handler) {
    handler.onBuildHouse(this);
  }
  
  /**
   * Handler class for {@link BuildHouseEvent} events.
   */
  public interface BuildHouseHandler extends EventHandler {

    /**
     * Called when a player selected resources
     */
    void onBuildHouse(BuildHouseEvent event);
  }
  
  /**
   * A widget that implements this interface is a public source of
   * {@link BuildHouseEvent} events.
   */
  public interface HasBuildHouseHandler {

    /**
     * Adds a {@link BuildHouseHandler} handler for {@link BuildHouseEvent} events.
     * 
     * @param handler the handler
     * @return the registration for the event
     */
    HandlerRegistration addBuildHouseHandler(BuildHouseHandler handler);
  }

}
