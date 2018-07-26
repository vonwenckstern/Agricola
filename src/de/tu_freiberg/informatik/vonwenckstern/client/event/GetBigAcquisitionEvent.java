package de.tu_freiberg.informatik.vonwenckstern.client.event;

import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.HandlerRegistration;

import de.tu_freiberg.informatik.vonwenckstern.client.event.GetBigAcquisitionEvent.GetBigAcquisitionHandler;
import de.tu_freiberg.informatik.vonwenckstern.client.model.AcquisitionCardModel;

/** Fires after the user selected a big acquisition */
public class GetBigAcquisitionEvent extends GwtEvent<GetBigAcquisitionHandler> {

  /** Handler type */
  private static Type<GetBigAcquisitionHandler> TYPE;

  /** Gets the type associated with this event.
   * @return returns the handler type
   */
  public static Type<GetBigAcquisitionHandler> getType() {
    if (TYPE == null) {
      TYPE = new Type<GetBigAcquisitionHandler>();
    }
    return TYPE;
  }
  
  private AcquisitionCardModel acquisition;
  
  public GetBigAcquisitionEvent(AcquisitionCardModel acquisition) {
	  this.acquisition = acquisition;
  }
  
  public  AcquisitionCardModel getAcquisition() {
	  return acquisition;
  }
  
  @SuppressWarnings({"unchecked", "rawtypes"})
  @Override
  public Type<GetBigAcquisitionHandler> getAssociatedType() {
    return (Type) TYPE;
  }

  @Override
  protected void dispatch(GetBigAcquisitionHandler handler) {
    handler.onGetBigAcquisition(this);
  }
  
  /** Handler class for {@link GetBigAcquisitionEvent} events. */
  public interface GetBigAcquisitionHandler extends EventHandler {

    /** Called when a player selected a big acquisition */
    void onGetBigAcquisition(GetBigAcquisitionEvent event);
  }
  
  /** A widget that implements this interface is a public source of
   * {@link GetBigAcquisitionEvent} events. */
  public interface HasGetBigAcquisitionHandler {

    /** Adds a {@link GetBigAcquisitionHandler} handler for
     *  {@link GetBigAcquisitionEvent} events.
     * @param handler the handler
     * @return the registration for the event */
    HandlerRegistration addGetBigAcquisitionHandler(GetBigAcquisitionHandler handler);
  }

}
