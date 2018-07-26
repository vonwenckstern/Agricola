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

public class CardFieldView_BinderImpl implements UiBinder<com.google.gwt.user.client.ui.AbsolutePanel, de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.CardFieldView>, de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.CardFieldView.Binder {

  interface Template extends SafeHtmlTemplates {
    @Template("<img src='{0}' width='400px'>")
    SafeHtml html1(SafeUri arg0);
     
    @Template("<b>build a house</b><br> wood house: 5 <img src='{0}' width='20px'> + 2 <img src='{1}' width='20px'><br> clay house: 5 <img src='{2}' width='20px'> + 2 <img src='{3}' width='20px'><br> stone house: 5 <img src='{4}' width='20px'> + 2 <img src='{5}' width='20px'><br> <br><br>and/or <b>build stables</b><br> 2 woods per stable")
    SafeHtml html2(SafeUri arg0, SafeUri arg1, SafeUri arg2, SafeUri arg3, SafeUri arg4, SafeUri arg5);
     
    @Template("become start player")
    SafeHtml html3();
     
    @Template("get one grain<br> + <img src='{0}' width='20px'>")
    SafeHtml html4(SafeUri arg0);
     
    @Template("plow one field")
    SafeHtml html5();
     
    @Template("this operation is not implemented")
    SafeHtml html6();
     
    @Template("get two food marers<br> + <img src='{0}' width='20px'><img src='{1}' width='20px'>")
    SafeHtml html7(SafeUri arg0, SafeUri arg1);
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.AbsolutePanel createAndBindUi(final de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.CardFieldView owner) {


    return new Widgets(owner).get_f_AbsolutePanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.CardFieldView owner;


    public Widgets(final de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.CardFieldView owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
      build_im();  // more than one getter call detected. Type: IMPORTED, precedence: 1
    }

    SafeHtml template_html1() {
      return template.html1(get_im().cardField().getSafeUri());
    }
    SafeHtml template_html2() {
      return template.html2(get_im().woodIcon().getSafeUri(), get_im().reedIcon().getSafeUri(), get_im().clayIcon().getSafeUri(), get_im().reedIcon().getSafeUri(), get_im().stoneIcon().getSafeUri(), get_im().reedIcon().getSafeUri());
    }
    SafeHtml template_html3() {
      return template.html3();
    }
    SafeHtml template_html4() {
      return template.html4(get_im().grainIcon().getSafeUri());
    }
    SafeHtml template_html5() {
      return template.html5();
    }
    SafeHtml template_html6() {
      return template.html6();
    }
    SafeHtml template_html7() {
      return template.html7(get_im().foodMarker().getSafeUri(), get_im().foodMarker().getSafeUri());
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.CardFieldView_BinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.CardFieldView_BinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.CardFieldView_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.CardFieldView_BinderImpl_GenBundle) GWT.create(de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.CardFieldView_BinderImpl_GenBundle.class);
      // Setup section.


      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 11 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.CardFieldView_BinderImpl_GenCss_style style;
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.CardFieldView_BinderImpl_GenCss_style get_style() {
      return style;
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.CardFieldView_BinderImpl_GenCss_style build_style() {
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
     * Getter for C_NONE called 0 times. Type: DEFAULT. Build precedence: 1.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.model.Child get_C_NONE() {
      return build_C_NONE();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.model.Child build_C_NONE() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.model.Child C_NONE = de.tu_freiberg.informatik.vonwenckstern.client.model.Child.C_NONE;
      // Setup section.


      return C_NONE;
    }

    /**
     * Getter for C_BLUE called 0 times. Type: DEFAULT. Build precedence: 1.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.model.Child get_C_BLUE() {
      return build_C_BLUE();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.model.Child build_C_BLUE() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.model.Child C_BLUE = de.tu_freiberg.informatik.vonwenckstern.client.model.Child.C_BLUE;
      // Setup section.


      return C_BLUE;
    }

    /**
     * Getter for C_GREEN called 0 times. Type: DEFAULT. Build precedence: 1.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.model.Child get_C_GREEN() {
      return build_C_GREEN();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.model.Child build_C_GREEN() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.model.Child C_GREEN = de.tu_freiberg.informatik.vonwenckstern.client.model.Child.C_GREEN;
      // Setup section.


      return C_GREEN;
    }

    /**
     * Getter for C_ROSA called 0 times. Type: DEFAULT. Build precedence: 1.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.model.Child get_C_ROSA() {
      return build_C_ROSA();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.model.Child build_C_ROSA() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.model.Child C_ROSA = de.tu_freiberg.informatik.vonwenckstern.client.model.Child.C_ROSA;
      // Setup section.


      return C_ROSA;
    }

    /**
     * Getter for C_RED called 0 times. Type: DEFAULT. Build precedence: 1.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.model.Child get_C_RED() {
      return build_C_RED();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.model.Child build_C_RED() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.model.Child C_RED = de.tu_freiberg.informatik.vonwenckstern.client.model.Child.C_RED;
      // Setup section.


      return C_RED;
    }

    /**
     * Getter for im called 16 times. Type: IMPORTED. Build precedence: 1.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.resources.Images im;
    private de.tu_freiberg.informatik.vonwenckstern.client.resources.Images get_im() {
      return im;
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.resources.Images build_im() {
      // Creation section.
      im = (de.tu_freiberg.informatik.vonwenckstern.client.resources.Images) GWT.create(de.tu_freiberg.informatik.vonwenckstern.client.resources.Images.class);
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
      f_AbsolutePanel1.add(get_f_BigFieldRenderer3(), 27, 32);
      f_AbsolutePanel1.add(get_f_BigFieldRenderer4(), 142, 32);
      f_AbsolutePanel1.add(get_f_BigFieldRenderer5(), 27, 205);
      f_AbsolutePanel1.add(get_f_BigFieldRenderer6(), 142, 205);
      f_AbsolutePanel1.add(get_f_BigFieldRenderer7(), 27, 390);
      f_AbsolutePanel1.add(get_f_TooltipImageChildRenderer8(), 265, 20);
      f_AbsolutePanel1.add(get_f_TooltipImageChildRenderer10(), 265, 110);
      f_AbsolutePanel1.add(get_f_TooltipImageChildRenderer12(), 265, 205);
      f_AbsolutePanel1.add(get_f_TooltipImageChildRenderer14(), 265, 290);
      f_AbsolutePanel1.add(get_f_TooltipImageChildRenderer16(), 265, 380);
      f_AbsolutePanel1.add(get_f_TooltipImageChildRenderer18(), 265, 470);
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


      return f_BigFieldRenderer7;
    }

    /**
     * Getter for f_TooltipImageChildRenderer8 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.TooltipImageChildRenderer get_f_TooltipImageChildRenderer8() {
      return build_f_TooltipImageChildRenderer8();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.TooltipImageChildRenderer build_f_TooltipImageChildRenderer8() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.TooltipImageChildRenderer f_TooltipImageChildRenderer8 = (de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.TooltipImageChildRenderer) GWT.create(de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.TooltipImageChildRenderer.class);
      // Setup section.
      f_TooltipImageChildRenderer8.addTooltip(get_f_HTML9());
      f_TooltipImageChildRenderer8.setStyleName("" + get_style().handcursor() + "");
      f_TooltipImageChildRenderer8.setHeight("65px");
      f_TooltipImageChildRenderer8.setWidth("65px");
      f_TooltipImageChildRenderer8.setValue("buildHouse");
      f_TooltipImageChildRenderer8.setUrl("" + get_im().clear().getSafeUri().asString() + "");


      return f_TooltipImageChildRenderer8;
    }

    /**
     * Getter for f_HTML9 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.HTML get_f_HTML9() {
      return build_f_HTML9();
    }
    private com.google.gwt.user.client.ui.HTML build_f_HTML9() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTML f_HTML9 = (com.google.gwt.user.client.ui.HTML) GWT.create(com.google.gwt.user.client.ui.HTML.class);
      // Setup section.
      f_HTML9.setHTML(template_html2().asString());


      return f_HTML9;
    }

    /**
     * Getter for f_TooltipImageChildRenderer10 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.TooltipImageChildRenderer get_f_TooltipImageChildRenderer10() {
      return build_f_TooltipImageChildRenderer10();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.TooltipImageChildRenderer build_f_TooltipImageChildRenderer10() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.TooltipImageChildRenderer f_TooltipImageChildRenderer10 = (de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.TooltipImageChildRenderer) GWT.create(de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.TooltipImageChildRenderer.class);
      // Setup section.
      f_TooltipImageChildRenderer10.addTooltip(get_f_HTML11());
      f_TooltipImageChildRenderer10.setStyleName("" + get_style().handcursor() + "");
      f_TooltipImageChildRenderer10.setHeight("65px");
      f_TooltipImageChildRenderer10.setWidth("65px");
      f_TooltipImageChildRenderer10.setUrl("" + get_im().clear().getSafeUri().asString() + "");


      return f_TooltipImageChildRenderer10;
    }

    /**
     * Getter for f_HTML11 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.HTML get_f_HTML11() {
      return build_f_HTML11();
    }
    private com.google.gwt.user.client.ui.HTML build_f_HTML11() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTML f_HTML11 = (com.google.gwt.user.client.ui.HTML) GWT.create(com.google.gwt.user.client.ui.HTML.class);
      // Setup section.
      f_HTML11.setHTML(template_html3().asString());


      return f_HTML11;
    }

    /**
     * Getter for f_TooltipImageChildRenderer12 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.TooltipImageChildRenderer get_f_TooltipImageChildRenderer12() {
      return build_f_TooltipImageChildRenderer12();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.TooltipImageChildRenderer build_f_TooltipImageChildRenderer12() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.TooltipImageChildRenderer f_TooltipImageChildRenderer12 = (de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.TooltipImageChildRenderer) GWT.create(de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.TooltipImageChildRenderer.class);
      // Setup section.
      f_TooltipImageChildRenderer12.addTooltip(get_f_HTML13());
      f_TooltipImageChildRenderer12.setStyleName("" + get_style().handcursor() + "");
      f_TooltipImageChildRenderer12.setHeight("65px");
      f_TooltipImageChildRenderer12.setWidth("65px");
      f_TooltipImageChildRenderer12.setUrl("" + get_im().clear().getSafeUri().asString() + "");


      return f_TooltipImageChildRenderer12;
    }

    /**
     * Getter for f_HTML13 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.HTML get_f_HTML13() {
      return build_f_HTML13();
    }
    private com.google.gwt.user.client.ui.HTML build_f_HTML13() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTML f_HTML13 = (com.google.gwt.user.client.ui.HTML) GWT.create(com.google.gwt.user.client.ui.HTML.class);
      // Setup section.
      f_HTML13.setHTML(template_html4().asString());


      return f_HTML13;
    }

    /**
     * Getter for f_TooltipImageChildRenderer14 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.TooltipImageChildRenderer get_f_TooltipImageChildRenderer14() {
      return build_f_TooltipImageChildRenderer14();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.TooltipImageChildRenderer build_f_TooltipImageChildRenderer14() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.TooltipImageChildRenderer f_TooltipImageChildRenderer14 = (de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.TooltipImageChildRenderer) GWT.create(de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.TooltipImageChildRenderer.class);
      // Setup section.
      f_TooltipImageChildRenderer14.addTooltip(get_f_HTML15());
      f_TooltipImageChildRenderer14.setStyleName("" + get_style().handcursor() + "");
      f_TooltipImageChildRenderer14.setHeight("65px");
      f_TooltipImageChildRenderer14.setWidth("65px");
      f_TooltipImageChildRenderer14.setUrl("" + get_im().clear().getSafeUri().asString() + "");


      return f_TooltipImageChildRenderer14;
    }

    /**
     * Getter for f_HTML15 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.HTML get_f_HTML15() {
      return build_f_HTML15();
    }
    private com.google.gwt.user.client.ui.HTML build_f_HTML15() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTML f_HTML15 = (com.google.gwt.user.client.ui.HTML) GWT.create(com.google.gwt.user.client.ui.HTML.class);
      // Setup section.
      f_HTML15.setHTML(template_html5().asString());


      return f_HTML15;
    }

    /**
     * Getter for f_TooltipImageChildRenderer16 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.TooltipImageChildRenderer get_f_TooltipImageChildRenderer16() {
      return build_f_TooltipImageChildRenderer16();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.TooltipImageChildRenderer build_f_TooltipImageChildRenderer16() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.TooltipImageChildRenderer f_TooltipImageChildRenderer16 = (de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.TooltipImageChildRenderer) GWT.create(de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.TooltipImageChildRenderer.class);
      // Setup section.
      f_TooltipImageChildRenderer16.addTooltip(get_f_HTML17());
      f_TooltipImageChildRenderer16.setStyleName("" + get_style().nocursor() + "");
      f_TooltipImageChildRenderer16.setHeight("65px");
      f_TooltipImageChildRenderer16.setWidth("65px");
      f_TooltipImageChildRenderer16.setUrl("" + get_im().clear().getSafeUri().asString() + "");


      return f_TooltipImageChildRenderer16;
    }

    /**
     * Getter for f_HTML17 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.HTML get_f_HTML17() {
      return build_f_HTML17();
    }
    private com.google.gwt.user.client.ui.HTML build_f_HTML17() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTML f_HTML17 = (com.google.gwt.user.client.ui.HTML) GWT.create(com.google.gwt.user.client.ui.HTML.class);
      // Setup section.
      f_HTML17.setHTML(template_html6().asString());


      return f_HTML17;
    }

    /**
     * Getter for f_TooltipImageChildRenderer18 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.TooltipImageChildRenderer get_f_TooltipImageChildRenderer18() {
      return build_f_TooltipImageChildRenderer18();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.TooltipImageChildRenderer build_f_TooltipImageChildRenderer18() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.TooltipImageChildRenderer f_TooltipImageChildRenderer18 = (de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.TooltipImageChildRenderer) GWT.create(de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.TooltipImageChildRenderer.class);
      // Setup section.
      f_TooltipImageChildRenderer18.addTooltip(get_f_HTML19());
      f_TooltipImageChildRenderer18.setStyleName("" + get_style().handcursor() + "");
      f_TooltipImageChildRenderer18.setHeight("65px");
      f_TooltipImageChildRenderer18.setWidth("65px");
      f_TooltipImageChildRenderer18.setUrl("" + get_im().clear().getSafeUri().asString() + "");


      return f_TooltipImageChildRenderer18;
    }

    /**
     * Getter for f_HTML19 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.HTML get_f_HTML19() {
      return build_f_HTML19();
    }
    private com.google.gwt.user.client.ui.HTML build_f_HTML19() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTML f_HTML19 = (com.google.gwt.user.client.ui.HTML) GWT.create(com.google.gwt.user.client.ui.HTML.class);
      // Setup section.
      f_HTML19.setHTML(template_html7().asString());


      return f_HTML19;
    }
  }
}
