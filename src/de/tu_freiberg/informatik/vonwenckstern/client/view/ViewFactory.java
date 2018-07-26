package de.tu_freiberg.informatik.vonwenckstern.client.view;

import com.google.gwt.core.shared.GWT;

import de.tu_freiberg.informatik.vonwenckstern.client.AppController;
import de.tu_freiberg.informatik.vonwenckstern.client.presenter.BigAcquisitionsPresenter;
import de.tu_freiberg.informatik.vonwenckstern.client.presenter.CardFieldPresenter;
import de.tu_freiberg.informatik.vonwenckstern.client.presenter.InfoViewPresenter;
import de.tu_freiberg.informatik.vonwenckstern.client.presenter.PlayerFieldPresenter;
import de.tu_freiberg.informatik.vonwenckstern.client.presenter.Rounds1To7Presenter;
import de.tu_freiberg.informatik.vonwenckstern.client.presenter.Rounds8To14Presenter;

public interface ViewFactory {
	public AppController.Display getAppView();
	public BigAcquisitionsPresenter.Display getAcquisitionsView();
	public CardFieldPresenter.Display getCardFieldView();
	public InfoViewPresenter.Display getInfoView();
	public PlayerFieldPresenter.Display getPlayerFieldView();
	public Rounds1To7Presenter.Display getRounds1To7View();
	public Rounds8To14Presenter.Display getRounds8To14View();
	
	public static class Util {
		private static ViewFactory viewfactory = GWT.create(ViewFactory.class);
		public static ViewFactory getViewFactory() {
			return viewfactory;
		}
	}
}
