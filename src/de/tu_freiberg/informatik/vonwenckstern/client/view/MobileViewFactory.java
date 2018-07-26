package de.tu_freiberg.informatik.vonwenckstern.client.view;

import de.tu_freiberg.informatik.vonwenckstern.client.AppController;
import de.tu_freiberg.informatik.vonwenckstern.client.AppController.Display;
import de.tu_freiberg.informatik.vonwenckstern.client.AppViewMobile;
import de.tu_freiberg.informatik.vonwenckstern.client.presenter.BigAcquisitionsPresenter;
import de.tu_freiberg.informatik.vonwenckstern.client.presenter.CardFieldPresenter;
import de.tu_freiberg.informatik.vonwenckstern.client.presenter.InfoViewPresenter;
import de.tu_freiberg.informatik.vonwenckstern.client.presenter.PlayerFieldPresenter;
import de.tu_freiberg.informatik.vonwenckstern.client.presenter.Rounds1To7Presenter;
import de.tu_freiberg.informatik.vonwenckstern.client.presenter.Rounds8To14Presenter;
import de.tu_freiberg.informatik.vonwenckstern.client.view.mobile.BigAcquisitionsFieldView;
import de.tu_freiberg.informatik.vonwenckstern.client.view.mobile.CardFieldView;
import de.tu_freiberg.informatik.vonwenckstern.client.view.mobile.InfoView;
import de.tu_freiberg.informatik.vonwenckstern.client.view.mobile.PlayerFieldView;
import de.tu_freiberg.informatik.vonwenckstern.client.view.mobile.Rounds1To7View;
import de.tu_freiberg.informatik.vonwenckstern.client.view.mobile.Rounds8To14View;

public class MobileViewFactory implements ViewFactory {
	private static final AppController.Display appView = new AppViewMobile();
	private static final BigAcquisitionsPresenter.Display acquisitionView = new BigAcquisitionsFieldView();
	private static final CardFieldPresenter.Display cardFieldView = new CardFieldView();
	private static final InfoViewPresenter.Display infoView = new InfoView();
	private static final PlayerFieldPresenter.Display playerFieldView = new PlayerFieldView();
	private static final Rounds1To7Presenter.Display rounds1To7View = new Rounds1To7View();
	private static final Rounds8To14Presenter.Display rounds8To14View = new Rounds8To14View();

	@Override
	public BigAcquisitionsPresenter.Display getAcquisitionsView() {
		return acquisitionView;
	}

	@Override
	public CardFieldPresenter.Display getCardFieldView() {
		return cardFieldView;
	}

	@Override
	public InfoViewPresenter.Display getInfoView() {
		return infoView;
	}

	@Override
	public PlayerFieldPresenter.Display getPlayerFieldView() {
		return playerFieldView;
	}

	@Override
	public Rounds1To7Presenter.Display getRounds1To7View() {
		return rounds1To7View;
	}

	@Override
	public Rounds8To14Presenter.Display getRounds8To14View() {
		return rounds8To14View;
	}

	@Override
	public Display getAppView() {
		return appView;
	}

}
