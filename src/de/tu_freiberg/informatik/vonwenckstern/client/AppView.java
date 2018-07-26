package de.tu_freiberg.informatik.vonwenckstern.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;

public class AppView extends Composite implements AppController.Display {

	private static final Binder binder = GWT.create(Binder.class);
	@UiField
	SimplePanel leftLayout;
	@UiField
	SimplePanel middleLayout;
	@UiField
	SimplePanel topLayout;
	@UiField
	SimplePanel bottomLayout;
	@UiField
	SimplePanel rightLayout;
	@UiField
	SimplePanel infoLayout;
	@UiField
	Label disabledLabel;
	@UiField
	Label disabledLabel2;
	@UiField
	Label disabledLabel3;
	@UiField
	Label disabledLabel4;
	
	interface Binder extends UiBinder<Widget, AppView> {
	}

	public AppView() {
		initWidget(binder.createAndBindUi(this));
	}

	@Override
	public void setLeftWidget(Widget w) {
		leftLayout.setWidget(w);
	}

	@Override
	public void setMiddleWidget(Widget w) {
		middleLayout.setWidget(w);
	}

	@Override
	public void setTopWidget(Widget w) {
		topLayout.setWidget(w);
	}

	@Override
	public void setBottomWidget(Widget w) {
		bottomLayout.setWidget(w);
	}

	@Override
	public void setRightWidget(Widget w) {
		rightLayout.setWidget(w);
	}

	@Override
	public void setInfoWidget(Widget w) {
		infoLayout.setWidget(w);
	}

	@Override
	public void setForcePlayerField(boolean b) {
		disabledLabel.setVisible(b);
		disabledLabel2.setVisible(b);
	}

	@Override
	public void setForceBigAcquisitationField(boolean b) {
		disabledLabel.setVisible(b);
		disabledLabel2.setVisible(b);
		disabledLabel4.setVisible(b);
		disabledLabel3.setVisible(!b);
	}

	@Override
	public boolean isBigAcquisitationFieldEnabled() {
		return !disabledLabel3.isVisible();
	}

}
