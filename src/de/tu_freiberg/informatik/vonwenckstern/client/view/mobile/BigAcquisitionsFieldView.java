package de.tu_freiberg.informatik.vonwenckstern.client.view.mobile;

import java.util.Iterator;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

import de.tu_freiberg.informatik.vonwenckstern.client.model.BigAcquisitationsModel;
import de.tu_freiberg.informatik.vonwenckstern.client.model.BigAcquisitions;
import de.tu_freiberg.informatik.vonwenckstern.client.presenter.BigAcquisitionsPresenter;

public class BigAcquisitionsFieldView extends Composite implements BigAcquisitionsPresenter.Display {

	private static final Binder binder = GWT.create(Binder.class);

	interface Binder extends UiBinder<VerticalPanel, BigAcquisitionsFieldView> {
	}

	private VerticalPanel panel = null;
	
	public BigAcquisitionsFieldView() {
		panel = binder.createAndBindUi(this);
		initWidget(panel);
	}

	@Override
	public void registerHandlers(ClickHandler p) {
		regHandlers(p, panel);
	}
	
	
	private void regHandlers(ClickHandler p, HasWidgets cont) {
		Iterator<Widget> it = cont.iterator();
		while(it.hasNext()) {
			Widget w = it.next();
			if(w instanceof LabelAcquisitionRenderer) {
				((LabelAcquisitionRenderer) w).addClickHandler(p);
			} else if(w instanceof HasWidgets) {
				regHandlers(p, (HasWidgets) w);
			}
		}
	}
	
	@Override
	public void hideAcquisition(BigAcquisitions aquisition) {
		hideAcq(aquisition, panel);
	}
	
	private void hideAcq(BigAcquisitions aquisition, HasWidgets cont) {
		Iterator<Widget> it = cont.iterator();
		while(it.hasNext()) {
			Widget w = it.next();
			if(w instanceof LabelAcquisitionRenderer  &&
					(((LabelAcquisitionRenderer) w).getModel().getAcquisition() == aquisition)) {
				w.setVisible(false);
				((LabelAcquisitionRenderer) w).getModel().setVisible(false);
			} else if(w instanceof HasWidgets) {
				hideAcq(aquisition,  (HasWidgets) w);
			}
		}
	}

	@Override
	public void update(BigAcquisitationsModel model) {
		HorizontalPanel hp = (HorizontalPanel) panel.getWidget(1);
		for(int i=0; i<5; i++) {
			((LabelAcquisitionRenderer)hp.getWidget(i)).setModel(model.getModel(i));
		}
		hp = (HorizontalPanel) panel.getWidget(2);
		for(int i=0; i<5; i++) {
			((LabelAcquisitionRenderer)hp.getWidget(i)).setModel(model.getModel(i+5));
		}
	}

}
