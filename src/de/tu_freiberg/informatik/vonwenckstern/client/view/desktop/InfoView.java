package de.tu_freiberg.informatik.vonwenckstern.client.view.desktop;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.IntegerBox;
import com.google.gwt.user.client.ui.Widget;

import de.tu_freiberg.informatik.vonwenckstern.client.model.BigFieldModel;
import de.tu_freiberg.informatik.vonwenckstern.client.model.PlayerResourceModel;
import de.tu_freiberg.informatik.vonwenckstern.client.presenter.InfoViewPresenter;
import de.tu_freiberg.informatik.vonwenckstern.client.view.Tooltip;

public class InfoView extends Composite implements InfoViewPresenter.Display {

	private static final Binder binder = GWT.create(Binder.class);

	interface Binder extends UiBinder<HorizontalPanel, InfoView> {
	}

	private HorizontalPanel panel = null;
	
	public InfoView() {
		panel = binder.createAndBindUi(this);
		initWidget(panel);
		new Tooltip(beggarCard, new HTML("This is a beggar card.<br>You receive this card, if you have not enough food family.<br><br>Every cards gives you minus <b>3</b> points at the end."));
		new Tooltip(childCard, new HTML("This are your free persons, which you can add to your family by playing the card <b>making a baby</b>."));
		String sStable = "Your available stables, which you can add to your fields by playing <b>build a house</b> and/or <b>build stables</b>.";
		new Tooltip(stableCard, new HTML(sStable));
		new Tooltip(stableCounter, new HTML(sStable));
		String sFence = "Your available fence parts, which you need to fence your fields.";
		new Tooltip(fenceCard, new HTML(sFence));
		new Tooltip(fenceCounter, new HTML(sFence));
	}
	
	@UiField
	BigFieldModel modelWood;
	@UiField
	BigFieldModel modelClay;
	@UiField
	BigFieldModel modelStone;
	@UiField
	BigFieldModel modelReed;
	@UiField
	BigFieldModel modelFood;
	@UiField
	BigFieldModel modelGrain;
	@UiField
	BigFieldModel modelVegetable;
	@UiField
	Image beggarCard;
	@UiField
	IntegerBox beggarCounter;
	@UiField
	Image childCard;
	@UiField
	IntegerBox childCounter;
	@UiField
	Image stableCard;
	@UiField
	IntegerBox stableCounter;
	@UiField
	HTML fenceCard;
	@UiField
	IntegerBox fenceCounter;
	
	
	@Override
	public void updateView(PlayerResourceModel model) {
		modelWood.setRessourceCount(model.getWoodCount());
		modelClay.setRessourceCount(model.getClayCount());
		modelStone.setRessourceCount(model.getStoneCount());
		modelReed.setRessourceCount(model.getReedCount());
		modelFood.setRessourceCount(model.getFoodCount());
		modelGrain.setRessourceCount(model.getGrainCount());
		modelVegetable.setRessourceCount(model.getVegetableCount());
		
		beggarCard.setVisible(model.getBeggerCards() > 0);
		beggarCounter.setVisible(model.getBeggerCards() > 1);
		beggarCounter.setValue(model.getBeggerCards());
		
		childCard.setVisible(model.getPersonsCount() > 0);
		childCounter.setVisible(model.getPersonsCount() > 1);
		childCounter.setValue(model.getPersonsCount());
		
		stableCard.setVisible(model.getStableCount() > 0);
		stableCounter.setVisible(model.getStableCount() > 1);
		stableCounter.setValue(model.getStableCount());
		
		fenceCard.setVisible(model.getFenceCount() > 0);
		fenceCounter.setVisible(model.getFenceCount() > 1);
		fenceCounter.setValue(model.getFenceCount());
		
		for(int i=0; i<panel.getWidgetCount(); i++) {
			Widget w = panel.getWidget(i);
			if(w instanceof ResourceRenderer) {
				((ResourceRenderer) w).render();
			}
		}
	}
}
