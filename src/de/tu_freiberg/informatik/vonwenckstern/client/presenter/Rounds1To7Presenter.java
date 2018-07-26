package de.tu_freiberg.informatik.vonwenckstern.client.presenter;

import de.tu_freiberg.informatik.vonwenckstern.client.EventBus;
import de.tu_freiberg.informatik.vonwenckstern.client.HistoryController;
import de.tu_freiberg.informatik.vonwenckstern.client.event.BuildFenceEvent;
import de.tu_freiberg.informatik.vonwenckstern.client.event.EnableBigAcquisitionEvent;
import de.tu_freiberg.informatik.vonwenckstern.client.event.FamilyAdditionEvent;
import de.tu_freiberg.informatik.vonwenckstern.client.event.GetSheepEvent;
import de.tu_freiberg.informatik.vonwenckstern.client.event.HistoryChangedEvent;
import de.tu_freiberg.informatik.vonwenckstern.client.event.NextRoundEvent;
import de.tu_freiberg.informatik.vonwenckstern.client.event.RequestHistoryEvent;
import de.tu_freiberg.informatik.vonwenckstern.client.event.RestaurateEvent;
import de.tu_freiberg.informatik.vonwenckstern.client.event.SeedEvent;
import de.tu_freiberg.informatik.vonwenckstern.client.model.BackgroundCard;
import de.tu_freiberg.informatik.vonwenckstern.client.model.BaseFieldModel;
import de.tu_freiberg.informatik.vonwenckstern.client.model.BigFieldModel;
import de.tu_freiberg.informatik.vonwenckstern.client.model.Player;
import de.tu_freiberg.informatik.vonwenckstern.client.model.Rounds1To7Model;

public class Rounds1To7Presenter extends ResourcePresenter implements Activity<Rounds1To7Model>{

	public interface Display extends ResourcePresenter.Display {
		public void update(Rounds1To7Model model);
	}
	
	private Rounds1To7Model model = null;
	
	public Rounds1To7Presenter(Display display, Player player, Rounds1To7Model model) {
		super(display, player);
		this.model = model;
		display.update(model);
		HistoryController.getInstance().addActivityPresenter(this);
		EventBus.fire(new RequestHistoryEvent(this));
	}
	
	public boolean processAction(BaseFieldModel model) {
		if(model instanceof BigFieldModel && ((BigFieldModel) model).getBgCard() == BackgroundCard.SHEEP) {
			if(model.getRessourceCount() > 0) {
				EventBus.fire(new GetSheepEvent(model.getRessourceCount()));
				model.setRessourceCount(0);
			}
		} else {
			super.processAction(model); // process other resources
		}
		if(model instanceof BigFieldModel) {
			switch(((BigFieldModel) model).getBgCard()) {
			case ACQUISITION: EventBus.fire(new EnableBigAcquisitionEvent()); break;
			case FENCE: EventBus.fire(new BuildFenceEvent()); break;
			case SEEDING_BACKING: EventBus.fire(new SeedEvent()); break;
			case FAMILIY_ADDITION2: EventBus.fire(new FamilyAdditionEvent()); break;
			case RESTAURATION: EventBus.fire(new RestaurateEvent()); break;
			default: break;
			}
		}
		return true;
	}
	
	@Override
	public void onNextRound(NextRoundEvent event) {
		super.onNextRound(event);
		if(event.getRound() < 8)
			showOneMoreBigCard(event.getRound());
		EventBus.fire(new HistoryChangedEvent(this));
	}

	private static Type<Rounds1To7Presenter> TYPE = new Type<Rounds1To7Presenter>("Rounds1To7Presenter");
	@Override
	public Activity.Type<?> getActivityKey() {
		return TYPE;
	}

	@Override
	public Rounds1To7Model getActualHistory() {
		return model.clone();
	}

	@Override
	public void setActualHistory(Rounds1To7Model state) {
		model.update(state);
		((Display)display).update(model);
	}

}
