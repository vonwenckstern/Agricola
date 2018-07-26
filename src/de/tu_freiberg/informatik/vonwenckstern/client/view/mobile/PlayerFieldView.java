package de.tu_freiberg.informatik.vonwenckstern.client.view.mobile;

import java.util.Iterator;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.PushButton;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

import de.tu_freiberg.informatik.vonwenckstern.client.model.PlayerFieldModel;
import de.tu_freiberg.informatik.vonwenckstern.client.presenter.PlayerFieldPresenter.Display;
import de.tu_freiberg.informatik.vonwenckstern.client.view.Renderer;
import de.tu_freiberg.informatik.vonwenckstern.client.view.mobile.AcquisitionCardRenderer;
import de.tu_freiberg.informatik.vonwenckstern.client.view.mobile.SmallFieldRenderer;

public class PlayerFieldView extends Composite implements Display {

	private static final Binder binder = GWT.create(Binder.class);

	interface Binder extends UiBinder<VerticalPanel, PlayerFieldView> {
	}
	
	private VerticalPanel panel = null;
	
	@UiField
	Label info;
	@UiField
	PushButton btnEnclosure;
	@UiField
	PushButton btnFeedingFamily;

	public PlayerFieldView() {
		panel = binder.createAndBindUi(this);
		initWidget(panel);
	}

	@Override
	public void update(PlayerFieldModel model) {
		_update(model, panel);
	}
	
	private void _update(PlayerFieldModel model, HasWidgets cont) {
		Iterator<Widget> it = cont.iterator();
		while(it.hasNext()) {
			Widget w = it.next();
			if(w instanceof SmallFieldRenderer) {
				SmallFieldRenderer s = (SmallFieldRenderer) w;
				s.setModel(model.getField(s.getPosition()));
			} else if(w instanceof AcquisitionCardRenderer) {
				AcquisitionCardRenderer a = (AcquisitionCardRenderer)w;
				a.setModel(model.getAcquisitation(a.getPosition()));
			} else if(w instanceof HasWidgets) {
				_update(model, (HasWidgets) w);
			}
		}
	}

	@Override
	public void registerHandlers(ClickHandler p) {
		_registerHandlers(p, panel);
		btnEnclosure.addClickHandler(p);
		btnFeedingFamily.addClickHandler(p);
	}
	
	private void _registerHandlers(ClickHandler p, HasWidgets cont) {
		Iterator<Widget> it = cont.iterator();
		while(it.hasNext()) {
			Widget w = it.next();
			if(w instanceof Renderer) {
				w.addDomHandler(p, ClickEvent.getType());
			} else if(w instanceof HasWidgets) {
				_registerHandlers(p, (HasWidgets) w);
			}
		}
	}

	@Override
	/** sets the text and makes the information visible */
	public void setInformation(String text) {
		info.setText(text);
		info.setVisible(true);
	}

	@Override
	public void setInformationVisible(boolean visible) {
		info.setVisible(visible);
	}

	@Override
	public void setEnclosureBtnVisible(boolean visible) {
		btnEnclosure.setVisible(visible);
	}

	@Override
	public void setFeedingFamilyBtnVisible(boolean visible) {
		btnFeedingFamily.setVisible(visible);
	}

}
