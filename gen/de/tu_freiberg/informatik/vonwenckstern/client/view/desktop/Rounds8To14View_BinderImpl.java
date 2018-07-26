package de.tu_freiberg.informatik.vonwenckstern.client.view.desktop;

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
import com.google.gwt.user.client.ui.AbsolutePanel;

public class Rounds8To14View_BinderImpl implements UiBinder<com.google.gwt.user.client.ui.AbsolutePanel, de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.Rounds8To14View>, de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.Rounds8To14View.Binder {

  interface Template extends SafeHtmlTemplates {
    @Template("<img height='400px' src='{0}'>")
    SafeHtml html1(SafeUri arg0);
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.AbsolutePanel createAndBindUi(final de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.Rounds8To14View owner) {


    return new Widgets(owner).get_f_AbsolutePanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.Rounds8To14View owner;


    public Widgets(final de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.Rounds8To14View owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
    }

    SafeHtml template_html1() {
      return template.html1(get_im().rounds8To14().getSafeUri());
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.Rounds8To14View_BinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.Rounds8To14View_BinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.Rounds8To14View_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.Rounds8To14View_BinderImpl_GenBundle) GWT.create(de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.Rounds8To14View_BinderImpl_GenBundle.class);
      // Setup section.


      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 7 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.Rounds8To14View_BinderImpl_GenCss_style style;
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.Rounds8To14View_BinderImpl_GenCss_style get_style() {
      return style;
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.Rounds8To14View_BinderImpl_GenCss_style build_style() {
      // Creation section.
      style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
      // Setup section.
      style.ensureInjected();


      return style;
    }

    /**
     * Getter for NONE called 0 times. Type: DEFAULT. Build precedence: 1.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.model.BackgroundCard get_NONE() {
      return build_NONE();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.model.BackgroundCard build_NONE() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.model.BackgroundCard NONE = de.tu_freiberg.informatik.vonwenckstern.client.model.BackgroundCard.NONE;
      // Setup section.


      return NONE;
    }

    /**
     * Getter for SHEEP called 0 times. Type: DEFAULT. Build precedence: 1.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.model.BackgroundCard get_SHEEP() {
      return build_SHEEP();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.model.BackgroundCard build_SHEEP() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.model.BackgroundCard SHEEP = de.tu_freiberg.informatik.vonwenckstern.client.model.BackgroundCard.SHEEP;
      // Setup section.


      return SHEEP;
    }

    /**
     * Getter for ACQUISITION called 0 times. Type: DEFAULT. Build precedence: 1.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.model.BackgroundCard get_ACQUISITION() {
      return build_ACQUISITION();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.model.BackgroundCard build_ACQUISITION() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.model.BackgroundCard ACQUISITION = de.tu_freiberg.informatik.vonwenckstern.client.model.BackgroundCard.ACQUISITION;
      // Setup section.


      return ACQUISITION;
    }

    /**
     * Getter for FENCE called 0 times. Type: DEFAULT. Build precedence: 1.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.model.BackgroundCard get_FENCE() {
      return build_FENCE();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.model.BackgroundCard build_FENCE() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.model.BackgroundCard FENCE = de.tu_freiberg.informatik.vonwenckstern.client.model.BackgroundCard.FENCE;
      // Setup section.


      return FENCE;
    }

    /**
     * Getter for SEEDING_BACKING called 0 times. Type: DEFAULT. Build precedence: 1.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.model.BackgroundCard get_SEEDING_BACKING() {
      return build_SEEDING_BACKING();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.model.BackgroundCard build_SEEDING_BACKING() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.model.BackgroundCard SEEDING_BACKING = de.tu_freiberg.informatik.vonwenckstern.client.model.BackgroundCard.SEEDING_BACKING;
      // Setup section.


      return SEEDING_BACKING;
    }

    /**
     * Getter for FAMILIY_ADDITION2 called 0 times. Type: DEFAULT. Build precedence: 1.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.model.BackgroundCard get_FAMILIY_ADDITION2() {
      return build_FAMILIY_ADDITION2();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.model.BackgroundCard build_FAMILIY_ADDITION2() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.model.BackgroundCard FAMILIY_ADDITION2 = de.tu_freiberg.informatik.vonwenckstern.client.model.BackgroundCard.FAMILIY_ADDITION2;
      // Setup section.


      return FAMILIY_ADDITION2;
    }

    /**
     * Getter for STONE2 called 0 times. Type: DEFAULT. Build precedence: 1.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.model.BackgroundCard get_STONE2() {
      return build_STONE2();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.model.BackgroundCard build_STONE2() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.model.BackgroundCard STONE2 = de.tu_freiberg.informatik.vonwenckstern.client.model.BackgroundCard.STONE2;
      // Setup section.


      return STONE2;
    }

    /**
     * Getter for RESTAURATION called 0 times. Type: DEFAULT. Build precedence: 1.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.model.BackgroundCard get_RESTAURATION() {
      return build_RESTAURATION();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.model.BackgroundCard build_RESTAURATION() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.model.BackgroundCard RESTAURATION = de.tu_freiberg.informatik.vonwenckstern.client.model.BackgroundCard.RESTAURATION;
      // Setup section.


      return RESTAURATION;
    }

    /**
     * Getter for BOAR called 0 times. Type: DEFAULT. Build precedence: 1.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.model.BackgroundCard get_BOAR() {
      return build_BOAR();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.model.BackgroundCard build_BOAR() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.model.BackgroundCard BOAR = de.tu_freiberg.informatik.vonwenckstern.client.model.BackgroundCard.BOAR;
      // Setup section.


      return BOAR;
    }

    /**
     * Getter for VEGETABLE called 0 times. Type: DEFAULT. Build precedence: 1.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.model.BackgroundCard get_VEGETABLE() {
      return build_VEGETABLE();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.model.BackgroundCard build_VEGETABLE() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.model.BackgroundCard VEGETABLE = de.tu_freiberg.informatik.vonwenckstern.client.model.BackgroundCard.VEGETABLE;
      // Setup section.


      return VEGETABLE;
    }

    /**
     * Getter for STONE4 called 0 times. Type: DEFAULT. Build precedence: 1.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.model.BackgroundCard get_STONE4() {
      return build_STONE4();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.model.BackgroundCard build_STONE4() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.model.BackgroundCard STONE4 = de.tu_freiberg.informatik.vonwenckstern.client.model.BackgroundCard.STONE4;
      // Setup section.


      return STONE4;
    }

    /**
     * Getter for COW called 0 times. Type: DEFAULT. Build precedence: 1.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.model.BackgroundCard get_COW() {
      return build_COW();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.model.BackgroundCard build_COW() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.model.BackgroundCard COW = de.tu_freiberg.informatik.vonwenckstern.client.model.BackgroundCard.COW;
      // Setup section.


      return COW;
    }

    /**
     * Getter for PLOWING_SOWING called 0 times. Type: DEFAULT. Build precedence: 1.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.model.BackgroundCard get_PLOWING_SOWING() {
      return build_PLOWING_SOWING();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.model.BackgroundCard build_PLOWING_SOWING() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.model.BackgroundCard PLOWING_SOWING = de.tu_freiberg.informatik.vonwenckstern.client.model.BackgroundCard.PLOWING_SOWING;
      // Setup section.


      return PLOWING_SOWING;
    }

    /**
     * Getter for FAMILY_ADDITION5 called 0 times. Type: DEFAULT. Build precedence: 1.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.model.BackgroundCard get_FAMILY_ADDITION5() {
      return build_FAMILY_ADDITION5();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.model.BackgroundCard build_FAMILY_ADDITION5() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.model.BackgroundCard FAMILY_ADDITION5 = de.tu_freiberg.informatik.vonwenckstern.client.model.BackgroundCard.FAMILY_ADDITION5;
      // Setup section.


      return FAMILY_ADDITION5;
    }

    /**
     * Getter for RESTAURATION_FENCE called 0 times. Type: DEFAULT. Build precedence: 1.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.model.BackgroundCard get_RESTAURATION_FENCE() {
      return build_RESTAURATION_FENCE();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.model.BackgroundCard build_RESTAURATION_FENCE() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.model.BackgroundCard RESTAURATION_FENCE = de.tu_freiberg.informatik.vonwenckstern.client.model.BackgroundCard.RESTAURATION_FENCE;
      // Setup section.


      return RESTAURATION_FENCE;
    }

    /**
     * Getter for ONE_WOOD called 0 times. Type: DEFAULT. Build precedence: 1.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.model.BackgroundCard get_ONE_WOOD() {
      return build_ONE_WOOD();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.model.BackgroundCard build_ONE_WOOD() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.model.BackgroundCard ONE_WOOD = de.tu_freiberg.informatik.vonwenckstern.client.model.BackgroundCard.ONE_WOOD;
      // Setup section.


      return ONE_WOOD;
    }

    /**
     * Getter for TWO_CLAY called 0 times. Type: DEFAULT. Build precedence: 1.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.model.BackgroundCard get_TWO_CLAY() {
      return build_TWO_CLAY();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.model.BackgroundCard build_TWO_CLAY() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.model.BackgroundCard TWO_CLAY = de.tu_freiberg.informatik.vonwenckstern.client.model.BackgroundCard.TWO_CLAY;
      // Setup section.


      return TWO_CLAY;
    }

    /**
     * Getter for TWO_WOOD called 0 times. Type: DEFAULT. Build precedence: 1.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.model.BackgroundCard get_TWO_WOOD() {
      return build_TWO_WOOD();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.model.BackgroundCard build_TWO_WOOD() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.model.BackgroundCard TWO_WOOD = de.tu_freiberg.informatik.vonwenckstern.client.model.BackgroundCard.TWO_WOOD;
      // Setup section.


      return TWO_WOOD;
    }

    /**
     * Getter for REED_STONE_FOOD called 0 times. Type: DEFAULT. Build precedence: 1.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.model.BackgroundCard get_REED_STONE_FOOD() {
      return build_REED_STONE_FOOD();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.model.BackgroundCard build_REED_STONE_FOOD() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.model.BackgroundCard REED_STONE_FOOD = de.tu_freiberg.informatik.vonwenckstern.client.model.BackgroundCard.REED_STONE_FOOD;
      // Setup section.


      return REED_STONE_FOOD;
    }

    /**
     * Getter for CABARET called 0 times. Type: DEFAULT. Build precedence: 1.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.model.BackgroundCard get_CABARET() {
      return build_CABARET();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.model.BackgroundCard build_CABARET() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.model.BackgroundCard CABARET = de.tu_freiberg.informatik.vonwenckstern.client.model.BackgroundCard.CABARET;
      // Setup section.


      return CABARET;
    }

    /**
     * Getter for R_NONE called 0 times. Type: DEFAULT. Build precedence: 1.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.model.Resource get_R_NONE() {
      return build_R_NONE();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.model.Resource build_R_NONE() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.model.Resource R_NONE = de.tu_freiberg.informatik.vonwenckstern.client.model.Resource.R_NONE;
      // Setup section.


      return R_NONE;
    }

    /**
     * Getter for R_VEGETABLE called 0 times. Type: DEFAULT. Build precedence: 1.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.model.Resource get_R_VEGETABLE() {
      return build_R_VEGETABLE();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.model.Resource build_R_VEGETABLE() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.model.Resource R_VEGETABLE = de.tu_freiberg.informatik.vonwenckstern.client.model.Resource.R_VEGETABLE;
      // Setup section.


      return R_VEGETABLE;
    }

    /**
     * Getter for R_WOOD called 0 times. Type: DEFAULT. Build precedence: 1.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.model.Resource get_R_WOOD() {
      return build_R_WOOD();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.model.Resource build_R_WOOD() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.model.Resource R_WOOD = de.tu_freiberg.informatik.vonwenckstern.client.model.Resource.R_WOOD;
      // Setup section.


      return R_WOOD;
    }

    /**
     * Getter for R_CLAY called 0 times. Type: DEFAULT. Build precedence: 1.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.model.Resource get_R_CLAY() {
      return build_R_CLAY();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.model.Resource build_R_CLAY() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.model.Resource R_CLAY = de.tu_freiberg.informatik.vonwenckstern.client.model.Resource.R_CLAY;
      // Setup section.


      return R_CLAY;
    }

    /**
     * Getter for R_STONE called 0 times. Type: DEFAULT. Build precedence: 1.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.model.Resource get_R_STONE() {
      return build_R_STONE();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.model.Resource build_R_STONE() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.model.Resource R_STONE = de.tu_freiberg.informatik.vonwenckstern.client.model.Resource.R_STONE;
      // Setup section.


      return R_STONE;
    }

    /**
     * Getter for R_GRAIN called 0 times. Type: DEFAULT. Build precedence: 1.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.model.Resource get_R_GRAIN() {
      return build_R_GRAIN();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.model.Resource build_R_GRAIN() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.model.Resource R_GRAIN = de.tu_freiberg.informatik.vonwenckstern.client.model.Resource.R_GRAIN;
      // Setup section.


      return R_GRAIN;
    }

    /**
     * Getter for R_SHEEP called 0 times. Type: DEFAULT. Build precedence: 1.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.model.Resource get_R_SHEEP() {
      return build_R_SHEEP();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.model.Resource build_R_SHEEP() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.model.Resource R_SHEEP = de.tu_freiberg.informatik.vonwenckstern.client.model.Resource.R_SHEEP;
      // Setup section.


      return R_SHEEP;
    }

    /**
     * Getter for R_COW called 0 times. Type: DEFAULT. Build precedence: 1.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.model.Resource get_R_COW() {
      return build_R_COW();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.model.Resource build_R_COW() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.model.Resource R_COW = de.tu_freiberg.informatik.vonwenckstern.client.model.Resource.R_COW;
      // Setup section.


      return R_COW;
    }

    /**
     * Getter for R_BOAR called 0 times. Type: DEFAULT. Build precedence: 1.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.model.Resource get_R_BOAR() {
      return build_R_BOAR();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.model.Resource build_R_BOAR() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.model.Resource R_BOAR = de.tu_freiberg.informatik.vonwenckstern.client.model.Resource.R_BOAR;
      // Setup section.


      return R_BOAR;
    }

    /**
     * Getter for R_FOOD called 0 times. Type: DEFAULT. Build precedence: 1.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.model.Resource get_R_FOOD() {
      return build_R_FOOD();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.model.Resource build_R_FOOD() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.model.Resource R_FOOD = de.tu_freiberg.informatik.vonwenckstern.client.model.Resource.R_FOOD;
      // Setup section.


      return R_FOOD;
    }

    /**
     * Getter for R_REED called 0 times. Type: DEFAULT. Build precedence: 1.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.model.Resource get_R_REED() {
      return build_R_REED();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.model.Resource build_R_REED() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.model.Resource R_REED = de.tu_freiberg.informatik.vonwenckstern.client.model.Resource.R_REED;
      // Setup section.


      return R_REED;
    }

    /**
     * Getter for im called 1 times. Type: IMPORTED. Build precedence: 1.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.resources.Images get_im() {
      return build_im();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.resources.Images build_im() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.resources.Images im = (de.tu_freiberg.informatik.vonwenckstern.client.resources.Images) GWT.create(de.tu_freiberg.informatik.vonwenckstern.client.resources.Images.class);
      // Setup section.


      return im;
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
      f_AbsolutePanel1.add(get_f_HTML2(), 0, 0);
      f_AbsolutePanel1.add(get_f_BigFieldRenderer3(), 20, 35);
      f_AbsolutePanel1.add(get_f_BigFieldRenderer4(), 22, 205);
      f_AbsolutePanel1.add(get_f_BigFieldRenderer5(), 145, 35);
      f_AbsolutePanel1.add(get_f_BigFieldRenderer6(), 145, 210);
      f_AbsolutePanel1.add(get_f_BigFieldRenderer7(), 270, 30);
      f_AbsolutePanel1.add(get_f_BigFieldRenderer8(), 270, 203);
      f_AbsolutePanel1.add(get_f_BigFieldRenderer9(), 390, 30);
      f_AbsolutePanel1.setHeight("1000px");
      f_AbsolutePanel1.setWidth("1000px");


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
     * Getter for f_BigFieldRenderer3 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.BigFieldRenderer get_f_BigFieldRenderer3() {
      return build_f_BigFieldRenderer3();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.BigFieldRenderer build_f_BigFieldRenderer3() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.BigFieldRenderer f_BigFieldRenderer3 = (de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.BigFieldRenderer) GWT.create(de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.BigFieldRenderer.class);
      // Setup section.
      f_BigFieldRenderer3.setStyleName("" + get_style().handcursor() + "");
      f_BigFieldRenderer3.setVisible(false);


      return f_BigFieldRenderer3;
    }

    /**
     * Getter for f_BigFieldRenderer4 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.BigFieldRenderer get_f_BigFieldRenderer4() {
      return build_f_BigFieldRenderer4();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.BigFieldRenderer build_f_BigFieldRenderer4() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.BigFieldRenderer f_BigFieldRenderer4 = (de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.BigFieldRenderer) GWT.create(de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.BigFieldRenderer.class);
      // Setup section.
      f_BigFieldRenderer4.setStyleName("" + get_style().handcursor() + "");
      f_BigFieldRenderer4.setVisible(false);


      return f_BigFieldRenderer4;
    }

    /**
     * Getter for f_BigFieldRenderer5 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.BigFieldRenderer get_f_BigFieldRenderer5() {
      return build_f_BigFieldRenderer5();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.BigFieldRenderer build_f_BigFieldRenderer5() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.BigFieldRenderer f_BigFieldRenderer5 = (de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.BigFieldRenderer) GWT.create(de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.BigFieldRenderer.class);
      // Setup section.
      f_BigFieldRenderer5.setStyleName("" + get_style().handcursor() + "");
      f_BigFieldRenderer5.setVisible(false);


      return f_BigFieldRenderer5;
    }

    /**
     * Getter for f_BigFieldRenderer6 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.BigFieldRenderer get_f_BigFieldRenderer6() {
      return build_f_BigFieldRenderer6();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.BigFieldRenderer build_f_BigFieldRenderer6() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.BigFieldRenderer f_BigFieldRenderer6 = (de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.BigFieldRenderer) GWT.create(de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.BigFieldRenderer.class);
      // Setup section.
      f_BigFieldRenderer6.setStyleName("" + get_style().handcursor() + "");
      f_BigFieldRenderer6.setVisible(false);


      return f_BigFieldRenderer6;
    }

    /**
     * Getter for f_BigFieldRenderer7 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.BigFieldRenderer get_f_BigFieldRenderer7() {
      return build_f_BigFieldRenderer7();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.BigFieldRenderer build_f_BigFieldRenderer7() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.BigFieldRenderer f_BigFieldRenderer7 = (de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.BigFieldRenderer) GWT.create(de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.BigFieldRenderer.class);
      // Setup section.
      f_BigFieldRenderer7.setStyleName("" + get_style().handcursor() + "");
      f_BigFieldRenderer7.setVisible(false);


      return f_BigFieldRenderer7;
    }

    /**
     * Getter for f_BigFieldRenderer8 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.BigFieldRenderer get_f_BigFieldRenderer8() {
      return build_f_BigFieldRenderer8();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.BigFieldRenderer build_f_BigFieldRenderer8() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.BigFieldRenderer f_BigFieldRenderer8 = (de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.BigFieldRenderer) GWT.create(de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.BigFieldRenderer.class);
      // Setup section.
      f_BigFieldRenderer8.setStyleName("" + get_style().handcursor() + "");
      f_BigFieldRenderer8.setVisible(false);


      return f_BigFieldRenderer8;
    }

    /**
     * Getter for f_BigFieldRenderer9 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.BigFieldRenderer get_f_BigFieldRenderer9() {
      return build_f_BigFieldRenderer9();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.BigFieldRenderer build_f_BigFieldRenderer9() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.BigFieldRenderer f_BigFieldRenderer9 = (de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.BigFieldRenderer) GWT.create(de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.BigFieldRenderer.class);
      // Setup section.
      f_BigFieldRenderer9.setStyleName("" + get_style().handcursor() + "");
      f_BigFieldRenderer9.setVisible(false);


      return f_BigFieldRenderer9;
    }
  }
}
