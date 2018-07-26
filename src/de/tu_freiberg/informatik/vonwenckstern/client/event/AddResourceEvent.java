package de.tu_freiberg.informatik.vonwenckstern.client.event;

import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.HandlerRegistration;

import de.tu_freiberg.informatik.vonwenckstern.client.event.AddResourceEvent.AddResourceHandler;
import de.tu_freiberg.informatik.vonwenckstern.client.model.Resource;

/**
 * Fires after the user selected a card field containing resources
 */
public class AddResourceEvent extends GwtEvent<AddResourceHandler> {

  /**
   * Handler type.
   */
  private static Type<AddResourceHandler> TYPE;

  /**
   * Gets the type associated with this event.
   * 
   * @return returns the handler type
   */
  public static Type<AddResourceHandler> getType() {
    if (TYPE == null) {
      TYPE = new Type<AddResourceHandler>();
    }
    return TYPE;
  }
  
  public static class RessourceItem {
	  public RessourceItem(Resource res, int resCount) {
		  this.res = res;
		  this.resCount = resCount;
	  }
	  public Resource res = Resource.R_NONE;
	  public int resCount = 0;
  }
  
  private RessourceItem[] items;
  
  public AddResourceEvent(RessourceItem[] items) {
    this.items = items;
  }
  
  @SuppressWarnings({"unchecked", "rawtypes"})
  @Override
  public Type<AddResourceHandler> getAssociatedType() {
    return (Type) TYPE;
  }

  public RessourceItem[] getItems() {
    return items;
  }

  @Override
  protected void dispatch(AddResourceHandler handler) {
    handler.onAddResource(this);
  }
  
  /**
   * Handler class for {@link AddResourceEvent} events.
   */
  public interface AddResourceHandler extends EventHandler {

    /**
     * Called when a player selected resources
     */
    void onAddResource(AddResourceEvent event);
  }
  
  /**
   * A widget that implements this interface is a public source of
   * {@link AddResourceEvent} events.
   */
  public interface HasAddResourceHandler {

    /**
     * Adds a {@link AddResourceHandler} handler for {@link AddResourceEvent} events.
     * 
     * @param handler the handler
     * @return the registration for the event
     */
    HandlerRegistration addAddResourceHandler(AddResourceHandler handler);
  }

}
