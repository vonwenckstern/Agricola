package de.tu_freiberg.informatik.vonwenckstern.client.view.mobile;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Widget;

import de.tu_freiberg.informatik.vonwenckstern.client.model.CardFieldModel;
import de.tu_freiberg.informatik.vonwenckstern.client.presenter.CardFieldPresenter;
import de.tu_freiberg.informatik.vonwenckstern.client.view.Renderer;

public class CardFieldView extends Composite implements CardFieldPresenter.Display {

	private static final Binder binder = GWT.create(Binder.class);
	interface Binder extends UiBinder<Grid, CardFieldView> {
	}
	private Grid grid = null;

	public CardFieldView() {
		grid = binder.createAndBindUi(this);
		initWidget(grid);
	}


	@Override
	public void registerHandlers(ClickHandler p) {
		for(int r=0; r<grid.getRowCount(); r++) {
			for(int c=0; c<grid.getCellCount(r); c++) {
				Widget w = grid.getWidget(r,c);
				if(w instanceof Renderer) {
					w.addDomHandler(p, ClickEvent.getType());
				}
			}
		}
	}


	@Override
	public HasWidgets getPanel() {
		return grid;
	}


	@Override
	public void showOneMoreBigCard(int round) {
	}


	@Override
	public void update(CardFieldModel model) {
		((BigFieldRenderer)grid.getWidget(0, 0)).setModel(model.getModelOneWood());
		((BigFieldRenderer)grid.getWidget(0, 1)).setModel(model.getModelTwoClay());
		((BigFieldRenderer)grid.getWidget(0, 2)).setModel(model.getModelTwoWood());
		((BigFieldRenderer)grid.getWidget(1, 0)).setModel(model.getModelReedStoneFood());
		((BigFieldRenderer)grid.getWidget(1, 1)).setModel(model.getModelCabaret());
		((TooltipPanelChildRenderer)grid.getWidget(1, 2)).setModel(model.getModelHouse());
		((TooltipPanelChildRenderer)grid.getWidget(2, 0)).setModel(model.getModelGrain());
		((TooltipPanelChildRenderer)grid.getWidget(2, 1)).setModel(model.getModelPlowField());
		((TooltipPanelChildRenderer)grid.getWidget(2, 2)).setModel(model.getModelFood());
	}

}
