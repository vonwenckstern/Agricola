package de.tu_freiberg.informatik.vonwenckstern.client.presenter;

import java.io.Serializable;
/**
 * is a presenter which states should get serialized to the URL, so that the back/ forward button can restore the older states
 * @author wencky
 *
 * @param <T>
 */
public interface Activity<T extends Serializable> extends Presenter{
	/**
	 * the activity key to identify the presenter whose data should get loaded or updated; e.g. 1 for TableTree, 2 for MainView
	 * @return the activity key, it must be unique for each object, so if you have several objects of one class you should add anything like System.currentTimeMillis()
	 * to make it unique
	 */
	public Type<?> getActivityKey();
	/**
	 * returns an serializable Object which represents the state of this history
	 */
	public T getActualHistory();
	/**
	 * updates the component to a special history state
	 * @param state the history state which was created by getActualHistory()
	 */
	public void setActualHistory(T state);
	
	public static class Type<A> {
	    private static int nextHashCode;
	    private final int index;
	    private final String presenterValue;

	    /**
	     * Constructor.
	     */
	    public Type(String presenterValue) {
	      index = ++nextHashCode;
	      this.presenterValue = presenterValue;
	    }

	    @Override
	    public final int hashCode() {
	      return index;
	    }

	    @Override
	    public String toString() {
	      return "Activity type: " + presenterValue;
	    }
	  }
}
