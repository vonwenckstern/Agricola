package de.tu_freiberg.informatik.vonwenckstern.client.event;

import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.HandlerRegistration;

import de.tu_freiberg.informatik.vonwenckstern.client.event.ShowingDialogEvent.ShowingDialogHandler;

/**
 * Fires after the user selected a card field containing resources
 */
public class ShowingDialogEvent extends GwtEvent<ShowingDialogHandler> {

  /**
   * Handler type.
   */
  private static Type<ShowingDialogHandler> TYPE;

  /**
   * Gets the type associated with this event.
   * 
   * @return returns the handler type
   */
  public static Type<ShowingDialogHandler> getType() {
    if (TYPE == null) {
      TYPE = new Type<ShowingDialogHandler>();
    }
    return TYPE;
  }
  
  private boolean isShowingDialog = false;
  
  /** true, if the dialog is shown; false if it gets hidden */
  public ShowingDialogEvent(boolean isShowingDialog) {
	  this.isShowingDialog = isShowingDialog;
  }
  
  public boolean isShowingDialog() { return this.isShowingDialog; }
  
  @SuppressWarnings({"unchecked", "rawtypes"})
  @Override
  public Type<ShowingDialogHandler> getAssociatedType() {
    return (Type) TYPE;
  }

  @Override
  protected void dispatch(ShowingDialogHandler handler) {
    handler.onShowingDialog(this);
  }
  
  /**
   * Handler class for {@link ShowingDialogEvent} events.
   */
  public interface ShowingDialogHandler extends EventHandler {

    /**
     * Called when a player selected resources
     */
    void onShowingDialog(ShowingDialogEvent event);
  }
  
  /**
   * A widget that implements this interface is a public source of
   * {@link ShowingDialogEvent} events.
   */
  public interface HasShowingDialogHandler {

    /**
     * Adds a {@link ShowingDialogHandler} handler for {@link ShowingDialogEvent} events.
     * 
     * @param handler the handler
     * @return the registration for the event
     */
    HandlerRegistration addShwoingDialogHandler(ShowingDialogHandler handler);
  }

}
