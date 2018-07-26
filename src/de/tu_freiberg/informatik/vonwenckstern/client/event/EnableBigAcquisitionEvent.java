package de.tu_freiberg.informatik.vonwenckstern.client.event;

import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.HandlerRegistration;

import de.tu_freiberg.informatik.vonwenckstern.client.event.EnableBigAcquisitionEvent.EnableBigAcquisitionHandler;

/**
 * Fires after the user selected a card field containing resources
 */
public class EnableBigAcquisitionEvent extends GwtEvent<EnableBigAcquisitionHandler> {

  /**
   * Handler type.
   */
  private static Type<EnableBigAcquisitionHandler> TYPE;

  /**
   * Gets the type associated with this event.
   * 
   * @return returns the handler type
   */
  public static Type<EnableBigAcquisitionHandler> getType() {
    if (TYPE == null) {
      TYPE = new Type<EnableBigAcquisitionHandler>();
    }
    return TYPE;
  }
  
  public EnableBigAcquisitionEvent() {
  }
  
  @SuppressWarnings({"unchecked", "rawtypes"})
  @Override
  public Type<EnableBigAcquisitionHandler> getAssociatedType() {
    return (Type) TYPE;
  }

  @Override
  protected void dispatch(EnableBigAcquisitionHandler handler) {
    handler.onEnablingBigAcquisition(this);
  }
  
  /**
   * Handler class for {@link EnableBigAcquisitionEvent} events.
   */
  public interface EnableBigAcquisitionHandler extends EventHandler {

    /**
     * Called when a player selected resources
     */
    void onEnablingBigAcquisition(EnableBigAcquisitionEvent event);
  }
  
  /**
   * A widget that implements this interface is a public source of
   * {@link EnableBigAcquisitionEvent} events.
   */
  public interface HasEnableBigAcquisitionHandler {

    /**
     * Adds a {@link EnableBigAcquisitionHandler} handler for {@link EnableBigAcquisitionEvent} events.
     * 
     * @param handler the handler
     * @return the registration for the event
     */
    HandlerRegistration addEnableBigAcquisitionHandler(EnableBigAcquisitionHandler handler);
  }

}
