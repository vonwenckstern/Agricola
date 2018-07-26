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
import com.google.gwt.user.client.ui.HorizontalPanel;

public class InfoView_BinderImpl implements UiBinder<com.google.gwt.user.client.ui.HorizontalPanel, de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.InfoView>, de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.InfoView.Binder {

  interface Template extends SafeHtmlTemplates {
    @Template("<div style='width: 10px; height: 50px; border-left: blue solid 5px'></div>")
    SafeHtml html1();
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.HorizontalPanel createAndBindUi(final de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.InfoView owner) {


    return new Widgets(owner).get_f_HorizontalPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.InfoView owner;


    public Widgets(final de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.InfoView owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
      build_im();  // more than one getter call detected. Type: IMPORTED, precedence: 1
    }

    SafeHtml template_html1() {
      return template.html1();
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.InfoView_BinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.InfoView_BinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.InfoView_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.InfoView_BinderImpl_GenBundle) GWT.create(de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.InfoView_BinderImpl_GenBundle.class);
      // Setup section.


      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 7 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.InfoView_BinderImpl_GenCss_style style;
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.InfoView_BinderImpl_GenCss_style get_style() {
      return style;
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.InfoView_BinderImpl_GenCss_style build_style() {
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
     * Getter for R_VEGETABLE called 1 times. Type: DEFAULT. Build precedence: 1.
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
     * Getter for R_WOOD called 1 times. Type: DEFAULT. Build precedence: 1.
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
     * Getter for R_CLAY called 1 times. Type: DEFAULT. Build precedence: 1.
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
     * Getter for R_STONE called 1 times. Type: DEFAULT. Build precedence: 1.
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
     * Getter for R_GRAIN called 1 times. Type: DEFAULT. Build precedence: 1.
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
     * Getter for R_FOOD called 1 times. Type: DEFAULT. Build precedence: 1.
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
     * Getter for R_REED called 1 times. Type: DEFAULT. Build precedence: 1.
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
     * Getter for im called 3 times. Type: IMPORTED. Build precedence: 1.
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
     * Getter for modelWood called 1 times. Type: IMPORTED. Build precedence: 1.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.model.BigFieldModel get_modelWood() {
      return build_modelWood();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.model.BigFieldModel build_modelWood() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.model.BigFieldModel modelWood = (de.tu_freiberg.informatik.vonwenckstern.client.model.BigFieldModel) GWT.create(de.tu_freiberg.informatik.vonwenckstern.client.model.BigFieldModel.class);
      // Setup section.
      modelWood.setRessourceRoundAddition(0);
      modelWood.setRessource(get_R_WOOD());
      modelWood.setRessourceCount(0);
      modelWood.setDescription("your wood resources");


      owner.modelWood = modelWood;

      return modelWood;
    }

    /**
     * Getter for modelClay called 1 times. Type: IMPORTED. Build precedence: 1.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.model.BigFieldModel get_modelClay() {
      return build_modelClay();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.model.BigFieldModel build_modelClay() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.model.BigFieldModel modelClay = (de.tu_freiberg.informatik.vonwenckstern.client.model.BigFieldModel) GWT.create(de.tu_freiberg.informatik.vonwenckstern.client.model.BigFieldModel.class);
      // Setup section.
      modelClay.setRessourceRoundAddition(0);
      modelClay.setRessource(get_R_CLAY());
      modelClay.setRessourceCount(0);
      modelClay.setDescription("your clay resources");


      owner.modelClay = modelClay;

      return modelClay;
    }

    /**
     * Getter for modelStone called 1 times. Type: IMPORTED. Build precedence: 1.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.model.BigFieldModel get_modelStone() {
      return build_modelStone();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.model.BigFieldModel build_modelStone() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.model.BigFieldModel modelStone = (de.tu_freiberg.informatik.vonwenckstern.client.model.BigFieldModel) GWT.create(de.tu_freiberg.informatik.vonwenckstern.client.model.BigFieldModel.class);
      // Setup section.
      modelStone.setRessourceRoundAddition(0);
      modelStone.setRessource(get_R_STONE());
      modelStone.setRessourceCount(0);
      modelStone.setDescription("your stone resources");


      owner.modelStone = modelStone;

      return modelStone;
    }

    /**
     * Getter for modelReed called 1 times. Type: IMPORTED. Build precedence: 1.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.model.BigFieldModel get_modelReed() {
      return build_modelReed();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.model.BigFieldModel build_modelReed() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.model.BigFieldModel modelReed = (de.tu_freiberg.informatik.vonwenckstern.client.model.BigFieldModel) GWT.create(de.tu_freiberg.informatik.vonwenckstern.client.model.BigFieldModel.class);
      // Setup section.
      modelReed.setRessourceRoundAddition(0);
      modelReed.setRessource(get_R_REED());
      modelReed.setRessourceCount(0);
      modelReed.setDescription("your reed resources");


      owner.modelReed = modelReed;

      return modelReed;
    }

    /**
     * Getter for modelFood called 1 times. Type: IMPORTED. Build precedence: 1.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.model.BigFieldModel get_modelFood() {
      return build_modelFood();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.model.BigFieldModel build_modelFood() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.model.BigFieldModel modelFood = (de.tu_freiberg.informatik.vonwenckstern.client.model.BigFieldModel) GWT.create(de.tu_freiberg.informatik.vonwenckstern.client.model.BigFieldModel.class);
      // Setup section.
      modelFood.setRessourceRoundAddition(0);
      modelFood.setRessource(get_R_FOOD());
      modelFood.setRessourceCount(3);
      modelFood.setDescription("your food markers");


      owner.modelFood = modelFood;

      return modelFood;
    }

    /**
     * Getter for modelGrain called 1 times. Type: IMPORTED. Build precedence: 1.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.model.BigFieldModel get_modelGrain() {
      return build_modelGrain();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.model.BigFieldModel build_modelGrain() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.model.BigFieldModel modelGrain = (de.tu_freiberg.informatik.vonwenckstern.client.model.BigFieldModel) GWT.create(de.tu_freiberg.informatik.vonwenckstern.client.model.BigFieldModel.class);
      // Setup section.
      modelGrain.setRessourceRoundAddition(0);
      modelGrain.setRessource(get_R_GRAIN());
      modelGrain.setRessourceCount(0);
      modelGrain.setDescription("your grain resources");


      owner.modelGrain = modelGrain;

      return modelGrain;
    }

    /**
     * Getter for modelVegetable called 1 times. Type: IMPORTED. Build precedence: 1.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.model.BigFieldModel get_modelVegetable() {
      return build_modelVegetable();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.model.BigFieldModel build_modelVegetable() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.model.BigFieldModel modelVegetable = (de.tu_freiberg.informatik.vonwenckstern.client.model.BigFieldModel) GWT.create(de.tu_freiberg.informatik.vonwenckstern.client.model.BigFieldModel.class);
      // Setup section.
      modelVegetable.setRessourceRoundAddition(0);
      modelVegetable.setRessource(get_R_VEGETABLE());
      modelVegetable.setRessourceCount(0);
      modelVegetable.setDescription("your vegetable resources");


      owner.modelVegetable = modelVegetable;

      return modelVegetable;
    }

    /**
     * Getter for f_HorizontalPanel1 called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_f_HorizontalPanel1() {
      return build_f_HorizontalPanel1();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_f_HorizontalPanel1() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel1 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      f_HorizontalPanel1.add(get_f_ResourceRenderer2());
      f_HorizontalPanel1.add(get_f_ResourceRenderer3());
      f_HorizontalPanel1.add(get_f_ResourceRenderer4());
      f_HorizontalPanel1.add(get_f_ResourceRenderer5());
      f_HorizontalPanel1.add(get_f_ResourceRenderer6());
      f_HorizontalPanel1.add(get_f_ResourceRenderer7());
      f_HorizontalPanel1.add(get_f_ResourceRenderer8());
      f_HorizontalPanel1.add(get_f_AbsolutePanel9());
      f_HorizontalPanel1.add(get_f_AbsolutePanel10());
      f_HorizontalPanel1.add(get_f_AbsolutePanel11());
      f_HorizontalPanel1.add(get_f_AbsolutePanel12());


      return f_HorizontalPanel1;
    }

    /**
     * Getter for f_ResourceRenderer2 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.ResourceRenderer get_f_ResourceRenderer2() {
      return build_f_ResourceRenderer2();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.ResourceRenderer build_f_ResourceRenderer2() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.ResourceRenderer f_ResourceRenderer2 = (de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.ResourceRenderer) GWT.create(de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.ResourceRenderer.class);
      // Setup section.
      f_ResourceRenderer2.setStyleName("" + get_style().handcursor() + "");
      f_ResourceRenderer2.setModel(get_modelWood());


      return f_ResourceRenderer2;
    }

    /**
     * Getter for f_ResourceRenderer3 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.ResourceRenderer get_f_ResourceRenderer3() {
      return build_f_ResourceRenderer3();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.ResourceRenderer build_f_ResourceRenderer3() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.ResourceRenderer f_ResourceRenderer3 = (de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.ResourceRenderer) GWT.create(de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.ResourceRenderer.class);
      // Setup section.
      f_ResourceRenderer3.setStyleName("" + get_style().handcursor() + "");
      f_ResourceRenderer3.setModel(get_modelClay());


      return f_ResourceRenderer3;
    }

    /**
     * Getter for f_ResourceRenderer4 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.ResourceRenderer get_f_ResourceRenderer4() {
      return build_f_ResourceRenderer4();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.ResourceRenderer build_f_ResourceRenderer4() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.ResourceRenderer f_ResourceRenderer4 = (de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.ResourceRenderer) GWT.create(de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.ResourceRenderer.class);
      // Setup section.
      f_ResourceRenderer4.setStyleName("" + get_style().handcursor() + "");
      f_ResourceRenderer4.setModel(get_modelStone());


      return f_ResourceRenderer4;
    }

    /**
     * Getter for f_ResourceRenderer5 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.ResourceRenderer get_f_ResourceRenderer5() {
      return build_f_ResourceRenderer5();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.ResourceRenderer build_f_ResourceRenderer5() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.ResourceRenderer f_ResourceRenderer5 = (de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.ResourceRenderer) GWT.create(de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.ResourceRenderer.class);
      // Setup section.
      f_ResourceRenderer5.setStyleName("" + get_style().handcursor() + "");
      f_ResourceRenderer5.setModel(get_modelReed());


      return f_ResourceRenderer5;
    }

    /**
     * Getter for f_ResourceRenderer6 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.ResourceRenderer get_f_ResourceRenderer6() {
      return build_f_ResourceRenderer6();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.ResourceRenderer build_f_ResourceRenderer6() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.ResourceRenderer f_ResourceRenderer6 = (de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.ResourceRenderer) GWT.create(de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.ResourceRenderer.class);
      // Setup section.
      f_ResourceRenderer6.setStyleName("" + get_style().handcursor() + "");
      f_ResourceRenderer6.setModel(get_modelFood());


      return f_ResourceRenderer6;
    }

    /**
     * Getter for f_ResourceRenderer7 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.ResourceRenderer get_f_ResourceRenderer7() {
      return build_f_ResourceRenderer7();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.ResourceRenderer build_f_ResourceRenderer7() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.ResourceRenderer f_ResourceRenderer7 = (de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.ResourceRenderer) GWT.create(de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.ResourceRenderer.class);
      // Setup section.
      f_ResourceRenderer7.setStyleName("" + get_style().handcursor() + "");
      f_ResourceRenderer7.setModel(get_modelGrain());


      return f_ResourceRenderer7;
    }

    /**
     * Getter for f_ResourceRenderer8 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.ResourceRenderer get_f_ResourceRenderer8() {
      return build_f_ResourceRenderer8();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.ResourceRenderer build_f_ResourceRenderer8() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.ResourceRenderer f_ResourceRenderer8 = (de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.ResourceRenderer) GWT.create(de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.ResourceRenderer.class);
      // Setup section.
      f_ResourceRenderer8.setStyleName("" + get_style().handcursor() + "");
      f_ResourceRenderer8.setModel(get_modelVegetable());


      return f_ResourceRenderer8;
    }

    /**
     * Getter for f_AbsolutePanel9 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.AbsolutePanel get_f_AbsolutePanel9() {
      return build_f_AbsolutePanel9();
    }
    private com.google.gwt.user.client.ui.AbsolutePanel build_f_AbsolutePanel9() {
      // Creation section.
      final com.google.gwt.user.client.ui.AbsolutePanel f_AbsolutePanel9 = (com.google.gwt.user.client.ui.AbsolutePanel) GWT.create(com.google.gwt.user.client.ui.AbsolutePanel.class);
      // Setup section.
      f_AbsolutePanel9.add(get_childCard(), 0, 0);
      f_AbsolutePanel9.add(get_childCounter(), 18, 14);
      f_AbsolutePanel9.setHeight("50px");
      f_AbsolutePanel9.setWidth("50px");


      return f_AbsolutePanel9;
    }

    /**
     * Getter for childCard called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.Image get_childCard() {
      return build_childCard();
    }
    private com.google.gwt.user.client.ui.Image build_childCard() {
      // Creation section.
      final com.google.gwt.user.client.ui.Image childCard = (com.google.gwt.user.client.ui.Image) GWT.create(com.google.gwt.user.client.ui.Image.class);
      // Setup section.
      childCard.setWidth("50px");
      childCard.setUrl("" + get_im().childBlue().getSafeUri().asString() + "");


      owner.childCard = childCard;

      return childCard;
    }

    /**
     * Getter for childCounter called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.IntegerBox get_childCounter() {
      return build_childCounter();
    }
    private com.google.gwt.user.client.ui.IntegerBox build_childCounter() {
      // Creation section.
      final com.google.gwt.user.client.ui.IntegerBox childCounter = (com.google.gwt.user.client.ui.IntegerBox) GWT.create(com.google.gwt.user.client.ui.IntegerBox.class);
      // Setup section.
      childCounter.setVisibleLength(1);
      childCounter.setReadOnly(true);
      childCounter.setWidth("10px");
      childCounter.setValue(3);


      owner.childCounter = childCounter;

      return childCounter;
    }

    /**
     * Getter for f_AbsolutePanel10 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.AbsolutePanel get_f_AbsolutePanel10() {
      return build_f_AbsolutePanel10();
    }
    private com.google.gwt.user.client.ui.AbsolutePanel build_f_AbsolutePanel10() {
      // Creation section.
      final com.google.gwt.user.client.ui.AbsolutePanel f_AbsolutePanel10 = (com.google.gwt.user.client.ui.AbsolutePanel) GWT.create(com.google.gwt.user.client.ui.AbsolutePanel.class);
      // Setup section.
      f_AbsolutePanel10.add(get_stableCard(), 0, 0);
      f_AbsolutePanel10.add(get_stableCounter(), 5, 25);
      f_AbsolutePanel10.setHeight("50px");
      f_AbsolutePanel10.setWidth("30px");


      return f_AbsolutePanel10;
    }

    /**
     * Getter for stableCard called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.Image get_stableCard() {
      return build_stableCard();
    }
    private com.google.gwt.user.client.ui.Image build_stableCard() {
      // Creation section.
      final com.google.gwt.user.client.ui.Image stableCard = (com.google.gwt.user.client.ui.Image) GWT.create(com.google.gwt.user.client.ui.Image.class);
      // Setup section.
      stableCard.setHeight("20px");
      stableCard.setUrl("" + get_im().houseBlue().getSafeUri().asString() + "");


      owner.stableCard = stableCard;

      return stableCard;
    }

    /**
     * Getter for stableCounter called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.IntegerBox get_stableCounter() {
      return build_stableCounter();
    }
    private com.google.gwt.user.client.ui.IntegerBox build_stableCounter() {
      // Creation section.
      final com.google.gwt.user.client.ui.IntegerBox stableCounter = (com.google.gwt.user.client.ui.IntegerBox) GWT.create(com.google.gwt.user.client.ui.IntegerBox.class);
      // Setup section.
      stableCounter.setVisibleLength(1);
      stableCounter.setReadOnly(true);
      stableCounter.setWidth("15px");
      stableCounter.setValue(4);


      owner.stableCounter = stableCounter;

      return stableCounter;
    }

    /**
     * Getter for f_AbsolutePanel11 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.AbsolutePanel get_f_AbsolutePanel11() {
      return build_f_AbsolutePanel11();
    }
    private com.google.gwt.user.client.ui.AbsolutePanel build_f_AbsolutePanel11() {
      // Creation section.
      final com.google.gwt.user.client.ui.AbsolutePanel f_AbsolutePanel11 = (com.google.gwt.user.client.ui.AbsolutePanel) GWT.create(com.google.gwt.user.client.ui.AbsolutePanel.class);
      // Setup section.
      f_AbsolutePanel11.add(get_fenceCard(), 0, 0);
      f_AbsolutePanel11.add(get_fenceCounter(), 7, 25);
      f_AbsolutePanel11.setHeight("50px");
      f_AbsolutePanel11.setWidth("30px");


      return f_AbsolutePanel11;
    }

    /**
     * Getter for fenceCard called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.HTML get_fenceCard() {
      return build_fenceCard();
    }
    private com.google.gwt.user.client.ui.HTML build_fenceCard() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTML fenceCard = (com.google.gwt.user.client.ui.HTML) GWT.create(com.google.gwt.user.client.ui.HTML.class);
      // Setup section.
      fenceCard.setHTML(template_html1().asString());


      owner.fenceCard = fenceCard;

      return fenceCard;
    }

    /**
     * Getter for fenceCounter called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.IntegerBox get_fenceCounter() {
      return build_fenceCounter();
    }
    private com.google.gwt.user.client.ui.IntegerBox build_fenceCounter() {
      // Creation section.
      final com.google.gwt.user.client.ui.IntegerBox fenceCounter = (com.google.gwt.user.client.ui.IntegerBox) GWT.create(com.google.gwt.user.client.ui.IntegerBox.class);
      // Setup section.
      fenceCounter.setVisibleLength(1);
      fenceCounter.setReadOnly(true);
      fenceCounter.setWidth("15px");
      fenceCounter.setValue(15);


      owner.fenceCounter = fenceCounter;

      return fenceCounter;
    }

    /**
     * Getter for f_AbsolutePanel12 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.AbsolutePanel get_f_AbsolutePanel12() {
      return build_f_AbsolutePanel12();
    }
    private com.google.gwt.user.client.ui.AbsolutePanel build_f_AbsolutePanel12() {
      // Creation section.
      final com.google.gwt.user.client.ui.AbsolutePanel f_AbsolutePanel12 = (com.google.gwt.user.client.ui.AbsolutePanel) GWT.create(com.google.gwt.user.client.ui.AbsolutePanel.class);
      // Setup section.
      f_AbsolutePanel12.add(get_beggarCard(), 0, 0);
      f_AbsolutePanel12.add(get_beggarCounter(), 75, 65);
      f_AbsolutePanel12.setHeight("300px");
      f_AbsolutePanel12.setWidth("100px");


      return f_AbsolutePanel12;
    }

    /**
     * Getter for beggarCard called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.Image get_beggarCard() {
      return build_beggarCard();
    }
    private com.google.gwt.user.client.ui.Image build_beggarCard() {
      // Creation section.
      final com.google.gwt.user.client.ui.Image beggarCard = (com.google.gwt.user.client.ui.Image) GWT.create(com.google.gwt.user.client.ui.Image.class);
      // Setup section.
      beggarCard.setVisible(false);
      beggarCard.setWidth("100px");
      beggarCard.setUrl("" + get_im().beggarCard().getSafeUri().asString() + "");


      owner.beggarCard = beggarCard;

      return beggarCard;
    }

    /**
     * Getter for beggarCounter called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.IntegerBox get_beggarCounter() {
      return build_beggarCounter();
    }
    private com.google.gwt.user.client.ui.IntegerBox build_beggarCounter() {
      // Creation section.
      final com.google.gwt.user.client.ui.IntegerBox beggarCounter = (com.google.gwt.user.client.ui.IntegerBox) GWT.create(com.google.gwt.user.client.ui.IntegerBox.class);
      // Setup section.
      beggarCounter.setVisibleLength(1);
      beggarCounter.setReadOnly(true);
      beggarCounter.setVisible(false);
      beggarCounter.setWidth("15px");
      beggarCounter.setValue(20);


      owner.beggarCounter = beggarCounter;

      return beggarCounter;
    }
  }
}
