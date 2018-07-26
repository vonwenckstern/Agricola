package de.tu_freiberg.informatik.vonwenckstern.client.view.mobile;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

import de.tu_freiberg.informatik.vonwenckstern.client.model.Rounds1To7Model;
import de.tu_freiberg.informatik.vonwenckstern.client.presenter.Rounds1To7Presenter;
import de.tu_freiberg.informatik.vonwenckstern.client.view.Renderer;
public class Rounds1To7View extends Composite implements Rounds1To7Presenter.Display {

	private static final Binder binder = GWT.create(Binder.class);

	interface Binder extends UiBinder<Grid, Rounds1To7View> {
	}
	
	private Grid grid = null;

	public Rounds1To7View() {
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
				} else if(w instanceof VerticalPanel) {
					VerticalPanel vp = (VerticalPanel)w;
					vp.getWidget(0).addDomHandler(p, ClickEvent.getType());
					vp.getWidget(1).addDomHandler(p, ClickEvent.getType());
				}
			}
		}
	}

	@Override
	public void showOneMoreBigCard(int round) {
		for(int r=0; r<grid.getRowCount(); r++) {
			for(int c=0; c<grid.getCellCount(r); c++) {
				Widget w = grid.getWidget(r,c);
				if(w instanceof BigFieldRenderer && ((BigFieldRenderer)w).getOrder() == round) {
					w.setVisible(true);
					((BigFieldRenderer)w).getModel().setVisible(true);
				}
			}
		}
	}
	
	@Override
	public HasWidgets getPanel() {
		return grid;
	}

	@Override
	public void update(Rounds1To7Model model) {
		((BigFieldRenderer)grid.getWidget(0, 0)).setModel(model.getModelSheep());
		((BigFieldRenderer)grid.getWidget(0, 1)).setModel(model.getModelBigAcquisitation());
		((BigFieldRenderer)grid.getWidget(0, 2)).setModel(model.getModelFamily());
		((ResChildRenderer)((VerticalPanel)grid.getWidget(1, 0)).getWidget(0)).setModel(model.getModelWood());
		((ResChildRenderer)((VerticalPanel)grid.getWidget(1, 0)).getWidget(1)).setModel(model.getModelClay());
		((BigFieldRenderer)grid.getWidget(1, 1)).setModel(model.getModelFence());
		((BigFieldRenderer)grid.getWidget(1, 2)).setModel(model.getModelStone());
		((ResChildRenderer)((VerticalPanel)grid.getWidget(2, 0)).getWidget(0)).setModel(model.getModelReed());
		((ResChildRenderer)((VerticalPanel)grid.getWidget(2, 0)).getWidget(1)).setModel(model.getModelFood());
		((BigFieldRenderer)grid.getWidget(2, 1)).setModel(model.getModelSeedingBacking());
		((BigFieldRenderer)grid.getWidget(2, 2)).setModel(model.getModelRestauration());
	}

}
