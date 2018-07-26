package de.tu_freiberg.informatik.vonwenckstern.client.event;

import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.HandlerRegistration;

import de.tu_freiberg.informatik.vonwenckstern.client.event.SaveHistoryToURLEvent.SaveHistoryToURLHandler;

/**
 * Fires after the user selected a card field containing resources
 */
@SuppressWarnings("rawtypes")
public class SaveHistoryToURLEvent extends GwtEvent<SaveHistoryToURLHandler> {

  /**
   * Handler type.
   */
  private static Type<SaveHistoryToURLHandler> TYPE;

  /**
   * Gets the type associated with this event.
   * 
   * @return returns the handler type
   */
  public static Type<SaveHistoryToURLHandler> getType() {
    if (TYPE == null) {
      TYPE = new Type<SaveHistoryToURLHandler>();
    }
    return TYPE;
  }
	
	public SaveHistoryToURLEvent() {
	}
  
  @SuppressWarnings({"unchecked"})
  @Override
  public Type<SaveHistoryToURLHandler> getAssociatedType() {
    return (Type) TYPE;
  }

  @Override
  protected void dispatch(SaveHistoryToURLHandler handler) {
    handler.onSaveHistoryToURL(this);
  }
  
  /**
   * Handler class for {@link SaveHistoryToURLEvent} events.
   */
  public interface SaveHistoryToURLHandler extends EventHandler {

    /**
     * Called when a player selected resources
     */
    void onSaveHistoryToURL(SaveHistoryToURLEvent event);
  }
  
  /**
   * A widget that implements this interface is a public source of
   * {@link SaveHistoryToURLEvent} events.
   */
  public interface HasSaveHistoryToURLHandler {

    /**
     * Adds a {@link SaveHistoryToURLHandler} handler for {@link SaveHistoryToURLEvent} events.
     * 
     * @param handler the handler
     * @return the registration for the event
     */
    HandlerRegistration addSaveHistoryToURLHandler(SaveHistoryToURLHandler handler);
  }

}
