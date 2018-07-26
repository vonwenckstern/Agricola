package de.tu_freiberg.informatik.vonwenckstern.client.view.desktop;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Widget;

import de.tu_freiberg.informatik.vonwenckstern.client.model.CardFieldModel;
import de.tu_freiberg.informatik.vonwenckstern.client.presenter.CardFieldPresenter;
import de.tu_freiberg.informatik.vonwenckstern.client.view.Renderer;

public class CardFieldView extends Composite implements CardFieldPresenter.Display{

	private static final Binder binder = GWT.create(Binder.class);
	interface Binder extends UiBinder<AbsolutePanel, CardFieldView> {
	}
	private AbsolutePanel panel = null;

	public CardFieldView() {
		panel = binder.createAndBindUi(this);
		initWidget(panel);
	}


	@Override
	public void registerHandlers(ClickHandler p) {
		for(int i=0; i<panel.getWidgetCount(); i++) {
			Widget w = panel.getWidget(i);
			if(w instanceof Renderer) {
				w.addDomHandler(p, ClickEvent.getType());
			}
		}
	}

	@Override
	public void showOneMoreBigCard(int round) {
	}


	@Override
	public HasWidgets getPanel() {
		return panel;
	}


	@Override
	public void update(CardFieldModel model) {
		((BigFieldRenderer)panel.getWidget(1)).setModel(model.getModelOneWood());
		((BigFieldRenderer)panel.getWidget(2)).setModel(model.getModelTwoClay());
		((BigFieldRenderer)panel.getWidget(3)).setModel(model.getModelTwoWood());
		((BigFieldRenderer)panel.getWidget(4)).setModel(model.getModelReedStoneFood());
		((BigFieldRenderer)panel.getWidget(5)).setModel(model.getModelCabaret());
		
		((TooltipImageChildRenderer)panel.getWidget(6)).setModel(model.getModelHouse());
		((TooltipImageChildRenderer)panel.getWidget(7)).setModel(model.getModelStartPlayer());
		((TooltipImageChildRenderer)panel.getWidget(8)).setModel(model.getModelGrain());
		((TooltipImageChildRenderer)panel.getWidget(9)).setModel(model.getModelPlowField());
		((TooltipImageChildRenderer)panel.getWidget(11)).setModel(model.getModelFood());
	}

}
