package de.tu_freiberg.informatik.vonwenckstern.client.view.desktop;

import java.util.Iterator;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Widget;

import de.tu_freiberg.informatik.vonwenckstern.client.model.Rounds8To14Model;
import de.tu_freiberg.informatik.vonwenckstern.client.presenter.Rounds8To14Presenter;
import de.tu_freiberg.informatik.vonwenckstern.client.view.Renderer;
public class Rounds8To14View extends Composite implements Rounds8To14Presenter.Display {

	private static final Binder binder = GWT.create(Binder.class);

	interface Binder extends UiBinder<AbsolutePanel, Rounds8To14View> {
	}

	private AbsolutePanel panel = null;
	
	public Rounds8To14View() {
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
		Iterator<Widget> it = panel.iterator();
		while(it.hasNext()) {
			Widget w = it.next();
			if(w instanceof BigFieldRenderer) {
				if(!w.isVisible()) {
					w.setVisible(true);
					((BigFieldRenderer)w).getModel().setVisible(true);
					return;
				}
			}
		}
	}
	
	@Override
	public HasWidgets getPanel() {
		return panel;
	}

	@Override
	public void update(Rounds8To14Model model) {
		((BigFieldRenderer)panel.getWidget(1)).setModel(model.getModelBoar());
		((BigFieldRenderer)panel.getWidget(2)).setModel(model.getModelVegetable());
		((BigFieldRenderer)panel.getWidget(3)).setModel(model.getModelStone());
		((BigFieldRenderer)panel.getWidget(4)).setModel(model.getModelCow());
		((BigFieldRenderer)panel.getWidget(5)).setModel(model.getModelPlowSow());
		((BigFieldRenderer)panel.getWidget(6)).setModel(model.getModelFamily());
		((BigFieldRenderer)panel.getWidget(7)).setModel(model.getModelRestauration());
	}

}
