package de.tu_freiberg.informatik.vonwenckstern.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.safehtml.client.SafeHtmlTemplates;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlUtils;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.safehtml.shared.SafeUri;
import com.google.gwt.safehtml.shared.UriUtils;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class AppView_BinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, de.tu_freiberg.informatik.vonwenckstern.client.AppView>, de.tu_freiberg.informatik.vonwenckstern.client.AppView.Binder {

  interface Template extends SafeHtmlTemplates {
    @Template("<h1>MVP example</h1><h2>Agricola board game</h2>")
    SafeHtml html1();
     
    @Template("Images are photos of the original Agricola board game.<br> For more information see <a href='http://www.brettspiele-report.de/agricola/'>this link</a>. <br><br> The GWT source code of this game is written by Michael von Wenckstern. <br> The source code of this game is used in his diploma thesis to show the Model-View-Presenter pattern.")
    SafeHtml html2();
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final de.tu_freiberg.informatik.vonwenckstern.client.AppView owner) {


    return new Widgets(owner).get_f_AbsolutePanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final de.tu_freiberg.informatik.vonwenckstern.client.AppView owner;


    public Widgets(final de.tu_freiberg.informatik.vonwenckstern.client.AppView owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
    }

    SafeHtml template_html1() {
      return template.html1();
    }
    SafeHtml template_html2() {
      return template.html2();
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.AppView_BinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.AppView_BinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.AppView_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (de.tu_freiberg.informatik.vonwenckstern.client.AppView_BinderImpl_GenBundle) GWT.create(de.tu_freiberg.informatik.vonwenckstern.client.AppView_BinderImpl_GenBundle.class);
      // Setup section.


      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 5 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.AppView_BinderImpl_GenCss_style style;
    private de.tu_freiberg.informatik.vonwenckstern.client.AppView_BinderImpl_GenCss_style get_style() {
      return style;
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.AppView_BinderImpl_GenCss_style build_style() {
      // Creation section.
      style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
      // Setup section.
      style.ensureInjected();


      return style;
    }

    /**
     * Getter for f_AbsolutePanel1 called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private com.google.gwt.user.client.ui.AbsolutePanel get_f_AbsolutePanel1() {
      return build_f_AbsolutePanel1();
    }
    private com.google.gwt.user.client.ui.AbsolutePanel build_f_AbsolutePanel1() {
      // Creation section.
      final com.google.gwt.user.client.ui.AbsolutePanel f_AbsolutePanel1 = (com.google.gwt.user.client.ui.AbsolutePanel) GWT.create(com.google.gwt.user.client.ui.AbsolutePanel.class);
      // Setup section.
      f_AbsolutePanel1.add(get_f_HTML2(), 300, 20);
      f_AbsolutePanel1.add(get_leftLayout(), 0, 134);
      f_AbsolutePanel1.add(get_middleLayout(), 405, 131);
      f_AbsolutePanel1.add(get_topLayout(), 810, 0);
      f_AbsolutePanel1.add(get_bottomLayout(), 810, 295);
      f_AbsolutePanel1.add(get_rightLayout(), 1375, 295);
      f_AbsolutePanel1.add(get_infoLayout(), 1312, 0);
      f_AbsolutePanel1.add(get_disabledLabel(), 0, 130);
      f_AbsolutePanel1.add(get_disabledLabel2(), 810, 290);
      f_AbsolutePanel1.add(get_disabledLabel3(), 810, 0);
      f_AbsolutePanel1.add(get_disabledLabel4(), 1370, 290);
      f_AbsolutePanel1.add(get_f_HTML3(), 10, 720);
      f_AbsolutePanel1.setHeight("950px");
      f_AbsolutePanel1.setWidth("1920px");


      return f_AbsolutePanel1;
    }

    /**
     * Getter for f_HTML2 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.HTML get_f_HTML2() {
      return build_f_HTML2();
    }
    private com.google.gwt.user.client.ui.HTML build_f_HTML2() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTML f_HTML2 = (com.google.gwt.user.client.ui.HTML) GWT.create(com.google.gwt.user.client.ui.HTML.class);
      // Setup section.
      f_HTML2.setHTML(template_html1().asString());


      return f_HTML2;
    }

    /**
     * Getter for leftLayout called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.SimplePanel get_leftLayout() {
      return build_leftLayout();
    }
    private com.google.gwt.user.client.ui.SimplePanel build_leftLayout() {
      // Creation section.
      final com.google.gwt.user.client.ui.SimplePanel leftLayout = (com.google.gwt.user.client.ui.SimplePanel) GWT.create(com.google.gwt.user.client.ui.SimplePanel.class);
      // Setup section.


      owner.leftLayout = leftLayout;

      return leftLayout;
    }

    /**
     * Getter for middleLayout called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.SimplePanel get_middleLayout() {
      return build_middleLayout();
    }
    private com.google.gwt.user.client.ui.SimplePanel build_middleLayout() {
      // Creation section.
      final com.google.gwt.user.client.ui.SimplePanel middleLayout = (com.google.gwt.user.client.ui.SimplePanel) GWT.create(com.google.gwt.user.client.ui.SimplePanel.class);
      // Setup section.


      owner.middleLayout = middleLayout;

      return middleLayout;
    }

    /**
     * Getter for topLayout called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.SimplePanel get_topLayout() {
      return build_topLayout();
    }
    private com.google.gwt.user.client.ui.SimplePanel build_topLayout() {
      // Creation section.
      final com.google.gwt.user.client.ui.SimplePanel topLayout = (com.google.gwt.user.client.ui.SimplePanel) GWT.create(com.google.gwt.user.client.ui.SimplePanel.class);
      // Setup section.


      owner.topLayout = topLayout;

      return topLayout;
    }

    /**
     * Getter for bottomLayout called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.SimplePanel get_bottomLayout() {
      return build_bottomLayout();
    }
    private com.google.gwt.user.client.ui.SimplePanel build_bottomLayout() {
      // Creation section.
      final com.google.gwt.user.client.ui.SimplePanel bottomLayout = (com.google.gwt.user.client.ui.SimplePanel) GWT.create(com.google.gwt.user.client.ui.SimplePanel.class);
      // Setup section.


      owner.bottomLayout = bottomLayout;

      return bottomLayout;
    }

    /**
     * Getter for rightLayout called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.SimplePanel get_rightLayout() {
      return build_rightLayout();
    }
    private com.google.gwt.user.client.ui.SimplePanel build_rightLayout() {
      // Creation section.
      final com.google.gwt.user.client.ui.SimplePanel rightLayout = (com.google.gwt.user.client.ui.SimplePanel) GWT.create(com.google.gwt.user.client.ui.SimplePanel.class);
      // Setup section.


      owner.rightLayout = rightLayout;

      return rightLayout;
    }

    /**
     * Getter for infoLayout called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.SimplePanel get_infoLayout() {
      return build_infoLayout();
    }
    private com.google.gwt.user.client.ui.SimplePanel build_infoLayout() {
      // Creation section.
      final com.google.gwt.user.client.ui.SimplePanel infoLayout = (com.google.gwt.user.client.ui.SimplePanel) GWT.create(com.google.gwt.user.client.ui.SimplePanel.class);
      // Setup section.


      owner.infoLayout = infoLayout;

      return infoLayout;
    }

    /**
     * Getter for disabledLabel called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.Label get_disabledLabel() {
      return build_disabledLabel();
    }
    private com.google.gwt.user.client.ui.Label build_disabledLabel() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label disabledLabel = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      disabledLabel.setStyleName("" + get_style().disabled() + "");
      disabledLabel.setHeight("570px");
      disabledLabel.setVisible(false);
      disabledLabel.setWidth("810px");


      owner.disabledLabel = disabledLabel;

      return disabledLabel;
    }

    /**
     * Getter for disabledLabel2 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.Label get_disabledLabel2() {
      return build_disabledLabel2();
    }
    private com.google.gwt.user.client.ui.Label build_disabledLabel2() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label disabledLabel2 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      disabledLabel2.setStyleName("" + get_style().disabled() + "");
      disabledLabel2.setHeight("410px");
      disabledLabel2.setVisible(false);
      disabledLabel2.setWidth("560px");


      owner.disabledLabel2 = disabledLabel2;

      return disabledLabel2;
    }

    /**
     * Getter for disabledLabel3 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.Label get_disabledLabel3() {
      return build_disabledLabel3();
    }
    private com.google.gwt.user.client.ui.Label build_disabledLabel3() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label disabledLabel3 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      disabledLabel3.setStyleName("" + get_style().disabled2() + "");
      disabledLabel3.setHeight("290px");
      disabledLabel3.setVisible(true);
      disabledLabel3.setWidth("400px");


      owner.disabledLabel3 = disabledLabel3;

      return disabledLabel3;
    }

    /**
     * Getter for disabledLabel4 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.Label get_disabledLabel4() {
      return build_disabledLabel4();
    }
    private com.google.gwt.user.client.ui.Label build_disabledLabel4() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label disabledLabel4 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      disabledLabel4.setStyleName("" + get_style().disabled() + "");
      disabledLabel4.setHeight("410px");
      disabledLabel4.setVisible(false);
      disabledLabel4.setWidth("550px");


      owner.disabledLabel4 = disabledLabel4;

      return disabledLabel4;
    }

    /**
     * Getter for f_HTML3 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.HTML get_f_HTML3() {
      return build_f_HTML3();
    }
    private com.google.gwt.user.client.ui.HTML build_f_HTML3() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTML f_HTML3 = (com.google.gwt.user.client.ui.HTML) GWT.create(com.google.gwt.user.client.ui.HTML.class);
      // Setup section.
      f_HTML3.setHTML(template_html2().asString());
      f_HTML3.setStyleName("" + get_style().info() + "");


      return f_HTML3;
    }
  }
}
