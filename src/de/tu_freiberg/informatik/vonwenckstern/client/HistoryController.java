package de.tu_freiberg.informatik.vonwenckstern.client;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.http.client.URL;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.Window;
import com.versatile.gwt.serializer.client.Serializer;

import de.tu_freiberg.informatik.vonwenckstern.client.event.HistoryChangedEvent;
import de.tu_freiberg.informatik.vonwenckstern.client.event.HistoryChangedEvent.HistoryChangedHandler;
import de.tu_freiberg.informatik.vonwenckstern.client.event.RequestHistoryEvent;
import de.tu_freiberg.informatik.vonwenckstern.client.event.RequestHistoryEvent.RequestHistoryHandler;
import de.tu_freiberg.informatik.vonwenckstern.client.event.SaveHistoryToURLEvent;
import de.tu_freiberg.informatik.vonwenckstern.client.event.SaveHistoryToURLEvent.SaveHistoryToURLHandler;
import de.tu_freiberg.informatik.vonwenckstern.client.model.AcquisitionCardModel;
import de.tu_freiberg.informatik.vonwenckstern.client.model.BackgroundCard;
import de.tu_freiberg.informatik.vonwenckstern.client.model.BaseFieldModel;
import de.tu_freiberg.informatik.vonwenckstern.client.model.BigAcquisitationsModel;
import de.tu_freiberg.informatik.vonwenckstern.client.model.BigAcquisitions;
import de.tu_freiberg.informatik.vonwenckstern.client.model.BigFieldModel;
import de.tu_freiberg.informatik.vonwenckstern.client.model.CardFieldModel;
import de.tu_freiberg.informatik.vonwenckstern.client.model.Child;
import de.tu_freiberg.informatik.vonwenckstern.client.model.FieldCard;
import de.tu_freiberg.informatik.vonwenckstern.client.model.HistoryMap;
import de.tu_freiberg.informatik.vonwenckstern.client.model.Player;
import de.tu_freiberg.informatik.vonwenckstern.client.model.PlayerFieldModel;
import de.tu_freiberg.informatik.vonwenckstern.client.model.PlayerResourceModel;
import de.tu_freiberg.informatik.vonwenckstern.client.model.Resource;
import de.tu_freiberg.informatik.vonwenckstern.client.model.Rounds1To7Model;
import de.tu_freiberg.informatik.vonwenckstern.client.model.Rounds8To14Model;
import de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel;
import de.tu_freiberg.informatik.vonwenckstern.client.presenter.Activity;
/**
 * manages the history event, when the user changed the url by pressing the back or forward button.
 * it also creates the url string which represents a history state of the complete application and deserializes the string to the state again.
 * @author wencky
 *
 */

@SuppressWarnings("rawtypes")
public class HistoryController implements RequestHistoryHandler, HistoryChangedHandler, ValueChangeHandler<String>, SaveHistoryToURLHandler{
	private static HistoryController histController;
	public static HistoryController getInstance(){
		if (histController == null) {
			histController = new HistoryController();
			if ("".equals(History.getToken())) {
			      History.newItem("start", false);
			} else {
			      History.fireCurrentHistoryState();
			}
		}
		return histController;
	}
	
	private final Class[] modelClasses = {AcquisitionCardModel.class, BackgroundCard.class, BaseFieldModel.class, BigAcquisitationsModel.class, BigAcquisitions.class, BigFieldModel.class,
		CardFieldModel.class, Child.class, FieldCard.class, Player.class, PlayerFieldModel.class, PlayerResourceModel.class, Resource.class, Rounds1To7Model.class, Rounds8To14Model.class, SmallFieldModel.class,
		SmallFieldModel[].class, AcquisitionCardModel[].class};
	private String[] modelNames = null; 
	private String[] shortNames = null;
	
	private HistoryMap historyMap = new HistoryMap();
	private String oldHistoryToken;
	
	/** this map contains all activity presenters who registered using the addActivityPresenter method*/
	private HashMap<Integer, Activity> activityPresenterMap = new HashMap<Integer, Activity>();
	/** this list contains all presenters whose history has changed */
	private ArrayList<Integer> activityHistoryChanged = new ArrayList<Integer>();
	
	private HistoryController() {
		shortNames = new String[modelClasses.length];
		modelNames = new String[modelClasses.length];
		for(int i=0; i<modelNames.length; i++) {
			modelNames[i] = Serializer.getSerializationSignature(modelClasses[i]) + "\\!";
			shortNames[i] = "S" + i + "M\\!";
		}
		bind();
	}
	
	private void bind() {
		// Event is fired when the URL history changed
		History.addValueChangeHandler(this);
		// Event is fired when a component changed their history, e.g. when a user loads a table
		EventBus.getEventBus().addHistoryChangedHandler(this);
		// Event is fired when a presenter becomes visible and wants to know its actual history to update the view
		EventBus.getEventBus().addRequestHistoryHandler(this);
		// Event is fired when the changed history should get stored in the URL
		EventBus.getEventBus().addSaveHistoryToURLHandler(this);
	}
	
	public void addActivityPresenter(Activity activity) {
		activityPresenterMap.put(activity.getActivityKey().hashCode(), activity);
	}
	public void removeActivityPresenter(Activity activity) {
		activityPresenterMap.remove(activity.getActivityKey());
	}

	@SuppressWarnings("unchecked")
	@Override
	public void onValueChange(ValueChangeEvent<String> event) { /* 1 */
		String token = event.getValue();
	    
	    if (token != null && !token.equals(oldHistoryToken)) {
	    	
	      oldHistoryToken = token;	
	      
	      if (token.equals("start")) {
	    	  Window.Location.reload(); // reload the app
	      } else {
	    	  String deserilized = URL.decode(token).replace("yy", "\\!");
	    	  deserilized = deserilized.replace("\\!T\\!", "\\!true\\!");
	    	  deserilized = deserilized.replace("\\!F\\!", "\\!false\\!");
	    	  deserilized = (Serializer.getSerializationSignature(HistoryMap.class) + "\\!") + deserilized;
	    	  for(int i=0; i<modelNames.length; i++) {
	    		  deserilized = deserilized.replace(shortNames[i], modelNames[i]);
	    	  }
	    	  HistoryMap newHistoryMap = Serializer.deserialize(deserilized);
	    	  for(int key : newHistoryMap.keySet()) {
	    		  if(historyMap.containsKey(key)) {
	    			  Serializable newHistory = newHistoryMap.get(key);
	    			  if(!historyMap.get(key).equals(newHistory)) {
	    				  // history of this activity presenter changed
	    				  Activity activity = activityPresenterMap.get(key);
	    				  if(activity != null) {
	    					  activity.setActualHistory(newHistory);
	    				  }
	    			  }
	    		  } else if(activityPresenterMap.containsKey(key)) {
	    			  // history is new, because the key is not part of historyMap
	    			  Serializable newHistory = newHistoryMap.get(key);
	    			  Activity activity = activityPresenterMap.get(key);
					  if(activity != null) {
						  activity.setActualHistory(newHistory);
					  }
	    		  }
	    	  }
	    	  for(int key : historyMap.keySet()) {
	    		  if(!newHistoryMap.containsKey(key)) {
	    			  Activity activity = activityPresenterMap.get(key);
					  if(activity != null) {
						  activity.setActualHistory(null); // the old state is not anymore in the null state, so we have to reset the state
					  }
	    		  }
	    	  }
	    	  historyMap = newHistoryMap;
	      }
	  } 
		
	}


	@Override
	public void onHistoryChanged(HistoryChangedEvent event) {
		if(!activityHistoryChanged.contains(event.getActivity().getActivityKey().hashCode())) {
			activityHistoryChanged.add(event.getActivity().getActivityKey().hashCode());
		}
	}
	
	
	
	@SuppressWarnings("unchecked")
	@Override
	public void onRequestHistory(RequestHistoryEvent event) {
		Serializable s = historyMap.get(event.getActivity().getActivityKey().hashCode());
		event.getActivity().setActualHistory(s);
	}

	@Override
	public void onSaveHistoryToURL(SaveHistoryToURLEvent event) {
		boolean changed = false;
		for(int historyKey: activityHistoryChanged) {
			Activity a = activityPresenterMap.get(historyKey);
			if(a != null) {
				Serializable oldHistory = historyMap.get(historyKey);
				Serializable history = a.getActualHistory();
				changed |= (oldHistory == null || !oldHistory.equals(history));
				historyMap.put(historyKey, history);
			}
		}
		activityHistoryChanged.clear();
		if(changed) {
			// the history changed
			String serialized = Serializer.serialize(historyMap);
			// removing useless values, because it starts everytime with the same
			serialized = serialized.substring((Serializer.getSerializationSignature(HistoryMap.class) + "\\!").length());
			for(int i=0; i<modelNames.length; i++) {
	    		  serialized = serialized.replace(modelNames[i], shortNames[i]);
	    	 }
			serialized = serialized.replace("\\!true\\!", "\\!T\\!");
			serialized = serialized.replace("\\!false\\!", "\\!F\\!");
			oldHistoryToken = URL.encode(serialized.replace("\\!", "yy"));
			History.newItem(oldHistoryToken, false);
		}
	}
}
