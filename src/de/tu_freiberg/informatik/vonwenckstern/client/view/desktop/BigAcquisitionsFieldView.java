package de.tu_freiberg.informatik.vonwenckstern.client.view.desktop;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

import de.tu_freiberg.informatik.vonwenckstern.client.model.BigAcquisitationsModel;
import de.tu_freiberg.informatik.vonwenckstern.client.model.BigAcquisitions;
import de.tu_freiberg.informatik.vonwenckstern.client.presenter.BigAcquisitionsPresenter;

public class BigAcquisitionsFieldView extends Composite implements BigAcquisitionsPresenter.Display {

	private static final Binder binder = GWT.create(Binder.class);

	interface Binder extends UiBinder<AbsolutePanel, BigAcquisitionsFieldView> {
	}

	private AbsolutePanel panel = null;
	
	public BigAcquisitionsFieldView() {
		panel = binder.createAndBindUi(this);
		initWidget(panel);
	}

	@Override
	public void registerHandlers(ClickHandler p) {
		for(int i=0; i<panel.getWidgetCount(); i++) {
			Widget w = panel.getWidget(i);
			if(w instanceof TooltipImageAcquisitionRenderer) {
				((TooltipImageAcquisitionRenderer) w).addClickHandler(p);
			}
		}
	}
	
	@Override
	public void hideAcquisition(BigAcquisitions aquisition) {
		for(int i=0; i<panel.getWidgetCount(); i++) {
			Widget w = panel.getWidget(i);
			if(w instanceof TooltipImageAcquisitionRenderer &&
					(((TooltipImageAcquisitionRenderer) w).getModel().getAcquisition() == aquisition) ) {
				w.setVisible(false);
				((TooltipImageAcquisitionRenderer) w).getModel().setVisible(false);
				break;
			}
		}
	}

	@Override
	public void update(BigAcquisitationsModel model) {
		for(int i=0; i<10; i++) {
			((TooltipImageAcquisitionRenderer)panel.getWidget(i+1)).setModel(model.getModel(i));
		}
	}

}
