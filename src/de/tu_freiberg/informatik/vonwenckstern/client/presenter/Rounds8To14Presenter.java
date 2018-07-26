package de.tu_freiberg.informatik.vonwenckstern.client.presenter;

import de.tu_freiberg.informatik.vonwenckstern.client.EventBus;
import de.tu_freiberg.informatik.vonwenckstern.client.HistoryController;
import de.tu_freiberg.informatik.vonwenckstern.client.event.AddResourceEvent;
import de.tu_freiberg.informatik.vonwenckstern.client.event.AddResourceEvent.RessourceItem;
import de.tu_freiberg.informatik.vonwenckstern.client.event.FamilyAdditionWithoutHouseEvent;
import de.tu_freiberg.informatik.vonwenckstern.client.event.GetBoarEvent;
import de.tu_freiberg.informatik.vonwenckstern.client.event.GetCowEvent;
import de.tu_freiberg.informatik.vonwenckstern.client.event.HistoryChangedEvent;
import de.tu_freiberg.informatik.vonwenckstern.client.event.NextRoundEvent;
import de.tu_freiberg.informatik.vonwenckstern.client.event.PlowFieldSeedEvent;
import de.tu_freiberg.informatik.vonwenckstern.client.event.RequestHistoryEvent;
import de.tu_freiberg.informatik.vonwenckstern.client.event.RestaurateAndFenceEvent;
import de.tu_freiberg.informatik.vonwenckstern.client.model.BackgroundCard;
import de.tu_freiberg.informatik.vonwenckstern.client.model.BaseFieldModel;
import de.tu_freiberg.informatik.vonwenckstern.client.model.BigFieldModel;
import de.tu_freiberg.informatik.vonwenckstern.client.model.Player;
import de.tu_freiberg.informatik.vonwenckstern.client.model.Resource;
import de.tu_freiberg.informatik.vonwenckstern.client.model.Rounds8To14Model;

public class Rounds8To14Presenter extends ResourcePresenter implements Activity<Rounds8To14Model>{

	public interface Display extends ResourcePresenter.Display {
		public void update(Rounds8To14Model model);
	}
	
	private Rounds8To14Model model = null;
	
	public Rounds8To14Presenter(Display display, Player player, Rounds8To14Model model) {
		super(display, player);
		this.model = model;
		display.update(model);
		HistoryController.getInstance().addActivityPresenter(this);
		EventBus.fire(new RequestHistoryEvent(this));
	}
	
	public boolean processAction(BaseFieldModel model) {
		if(model instanceof BigFieldModel && ((BigFieldModel) model).getBgCard() == BackgroundCard.BOAR) {
			if(model.getRessourceCount() > 0) {
				EventBus.fire(new GetBoarEvent(model.getRessourceCount()));
				model.setRessourceCount(0);
			}
		} else if(model instanceof BigFieldModel && ((BigFieldModel) model).getBgCard() == BackgroundCard.COW) {
			if(model.getRessourceCount() > 0) {
				EventBus.fire(new GetCowEvent(model.getRessourceCount()));
				model.setRessourceCount(0);
			}
		} else {
			super.processAction(model); // process other resources
		}
		if(model instanceof BigFieldModel) {
			switch(((BigFieldModel) model).getBgCard()) {
			case VEGETABLE: {
				RessourceItem[] items = new RessourceItem[] { new RessourceItem(Resource.R_VEGETABLE, 1)};
				EventBus.fire(new AddResourceEvent(items));
				break; }
			case PLOWING_SOWING: EventBus.fire(new PlowFieldSeedEvent()); break;
			case FAMILY_ADDITION5: EventBus.fire(new FamilyAdditionWithoutHouseEvent()); break;
			case RESTAURATION_FENCE: EventBus.fire(new RestaurateAndFenceEvent()); break;
			default: break;
			}
		}
		return true;
	}

	@Override
	public void onNextRound(NextRoundEvent event) {
		super.onNextRound(event);
		if(event.getRound() > 7)
			showOneMoreBigCard(event.getRound());
		EventBus.fire(new HistoryChangedEvent(this));
	}

	private static Type<Rounds8To14Presenter> TYPE = new Type<Rounds8To14Presenter>("Rounds8To14Presenter");
	@Override
	public Activity.Type<?> getActivityKey() {
		return TYPE;
	}

	@Override
	public Rounds8To14Model getActualHistory() {
		return model.clone();
	}

	@Override
	public void setActualHistory(Rounds8To14Model state) {
		model.update(state);
		((Display)display).update(model);
	}
}
