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

public class PlayerFieldView_BinderImpl implements UiBinder<com.google.gwt.user.client.ui.AbsolutePanel, de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.PlayerFieldView>, de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.PlayerFieldView.Binder {

  interface Template extends SafeHtmlTemplates {
    @Template("<img height='400px' src='{0}'>")
    SafeHtml html1(SafeUri arg0);
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.AbsolutePanel createAndBindUi(final de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.PlayerFieldView owner) {


    return new Widgets(owner).get_f_AbsolutePanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.PlayerFieldView owner;


    public Widgets(final de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.PlayerFieldView owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
      build_F_NONE();  // more than one getter call detected. Type: DEFAULT, precedence: 1
      build_F_WOOD_HOUSE();  // more than one getter call detected. Type: DEFAULT, precedence: 1
      build_BLUE();  // more than one getter call detected. Type: DEFAULT, precedence: 1
      build_C_BLUE();  // more than one getter call detected. Type: DEFAULT, precedence: 1
    }

    SafeHtml template_html1() {
      return template.html1(get_im().playerField().getSafeUri());
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.PlayerFieldView_BinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.PlayerFieldView_BinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.PlayerFieldView_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.PlayerFieldView_BinderImpl_GenBundle) GWT.create(de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.PlayerFieldView_BinderImpl_GenBundle.class);
      // Setup section.


      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 15 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.PlayerFieldView_BinderImpl_GenCss_style style;
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.PlayerFieldView_BinderImpl_GenCss_style get_style() {
      return style;
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.PlayerFieldView_BinderImpl_GenCss_style build_style() {
      // Creation section.
      style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
      // Setup section.
      style.ensureInjected();


      return style;
    }

    /**
     * Getter for F_NONE called 13 times. Type: DEFAULT. Build precedence: 1.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.model.FieldCard F_NONE;
    private de.tu_freiberg.informatik.vonwenckstern.client.model.FieldCard get_F_NONE() {
      return F_NONE;
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.model.FieldCard build_F_NONE() {
      // Creation section.
      F_NONE = de.tu_freiberg.informatik.vonwenckstern.client.model.FieldCard.F_NONE;
      // Setup section.


      return F_NONE;
    }

    /**
     * Getter for F_FIELD called 0 times. Type: DEFAULT. Build precedence: 1.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.model.FieldCard get_F_FIELD() {
      return build_F_FIELD();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.model.FieldCard build_F_FIELD() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.model.FieldCard F_FIELD = de.tu_freiberg.informatik.vonwenckstern.client.model.FieldCard.F_FIELD;
      // Setup section.


      return F_FIELD;
    }

    /**
     * Getter for F_WOOD_HOUSE called 2 times. Type: DEFAULT. Build precedence: 1.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.model.FieldCard F_WOOD_HOUSE;
    private de.tu_freiberg.informatik.vonwenckstern.client.model.FieldCard get_F_WOOD_HOUSE() {
      return F_WOOD_HOUSE;
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.model.FieldCard build_F_WOOD_HOUSE() {
      // Creation section.
      F_WOOD_HOUSE = de.tu_freiberg.informatik.vonwenckstern.client.model.FieldCard.F_WOOD_HOUSE;
      // Setup section.


      return F_WOOD_HOUSE;
    }

    /**
     * Getter for F_CLAY_HOUSE called 0 times. Type: DEFAULT. Build precedence: 1.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.model.FieldCard get_F_CLAY_HOUSE() {
      return build_F_CLAY_HOUSE();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.model.FieldCard build_F_CLAY_HOUSE() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.model.FieldCard F_CLAY_HOUSE = de.tu_freiberg.informatik.vonwenckstern.client.model.FieldCard.F_CLAY_HOUSE;
      // Setup section.


      return F_CLAY_HOUSE;
    }

    /**
     * Getter for F_STONE_HOUSE called 0 times. Type: DEFAULT. Build precedence: 1.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.model.FieldCard get_F_STONE_HOUSE() {
      return build_F_STONE_HOUSE();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.model.FieldCard build_F_STONE_HOUSE() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.model.FieldCard F_STONE_HOUSE = de.tu_freiberg.informatik.vonwenckstern.client.model.FieldCard.F_STONE_HOUSE;
      // Setup section.


      return F_STONE_HOUSE;
    }

    /**
     * Getter for F_STABLE called 0 times. Type: DEFAULT. Build precedence: 1.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.model.FieldCard get_F_STABLE() {
      return build_F_STABLE();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.model.FieldCard build_F_STABLE() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.model.FieldCard F_STABLE = de.tu_freiberg.informatik.vonwenckstern.client.model.FieldCard.F_STABLE;
      // Setup section.


      return F_STABLE;
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
     * Getter for NONE called 0 times. Type: DEFAULT. Build precedence: 1.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.model.Player get_NONE() {
      return build_NONE();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.model.Player build_NONE() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.model.Player NONE = de.tu_freiberg.informatik.vonwenckstern.client.model.Player.NONE;
      // Setup section.


      return NONE;
    }

    /**
     * Getter for ROSA called 0 times. Type: DEFAULT. Build precedence: 1.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.model.Player get_ROSA() {
      return build_ROSA();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.model.Player build_ROSA() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.model.Player ROSA = de.tu_freiberg.informatik.vonwenckstern.client.model.Player.ROSA;
      // Setup section.


      return ROSA;
    }

    /**
     * Getter for GREEN called 0 times. Type: DEFAULT. Build precedence: 1.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.model.Player get_GREEN() {
      return build_GREEN();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.model.Player build_GREEN() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.model.Player GREEN = de.tu_freiberg.informatik.vonwenckstern.client.model.Player.GREEN;
      // Setup section.


      return GREEN;
    }

    /**
     * Getter for BLUE called 15 times. Type: DEFAULT. Build precedence: 1.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.model.Player BLUE;
    private de.tu_freiberg.informatik.vonwenckstern.client.model.Player get_BLUE() {
      return BLUE;
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.model.Player build_BLUE() {
      // Creation section.
      BLUE = de.tu_freiberg.informatik.vonwenckstern.client.model.Player.BLUE;
      // Setup section.


      return BLUE;
    }

    /**
     * Getter for RED called 0 times. Type: DEFAULT. Build precedence: 1.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.model.Player get_RED() {
      return build_RED();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.model.Player build_RED() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.model.Player RED = de.tu_freiberg.informatik.vonwenckstern.client.model.Player.RED;
      // Setup section.


      return RED;
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
     * Getter for C_BLUE called 2 times. Type: DEFAULT. Build precedence: 1.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.model.Child C_BLUE;
    private de.tu_freiberg.informatik.vonwenckstern.client.model.Child get_C_BLUE() {
      return C_BLUE;
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.model.Child build_C_BLUE() {
      // Creation section.
      C_BLUE = de.tu_freiberg.informatik.vonwenckstern.client.model.Child.C_BLUE;
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
     * Getter for field1 called 1 times. Type: IMPORTED. Build precedence: 1.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel get_field1() {
      return build_field1();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel build_field1() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel field1 = (de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel) GWT.create(de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel.class);
      // Setup section.
      field1.setField(get_F_NONE());
      field1.setPlayer(get_BLUE());


      return field1;
    }

    /**
     * Getter for field2 called 1 times. Type: IMPORTED. Build precedence: 1.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel get_field2() {
      return build_field2();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel build_field2() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel field2 = (de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel) GWT.create(de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel.class);
      // Setup section.
      field2.setField(get_F_NONE());
      field2.setPlayer(get_BLUE());


      return field2;
    }

    /**
     * Getter for field3 called 1 times. Type: IMPORTED. Build precedence: 1.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel get_field3() {
      return build_field3();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel build_field3() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel field3 = (de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel) GWT.create(de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel.class);
      // Setup section.
      field3.setField(get_F_NONE());
      field3.setPlayer(get_BLUE());


      return field3;
    }

    /**
     * Getter for field4 called 1 times. Type: IMPORTED. Build precedence: 1.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel get_field4() {
      return build_field4();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel build_field4() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel field4 = (de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel) GWT.create(de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel.class);
      // Setup section.
      field4.setField(get_F_NONE());
      field4.setPlayer(get_BLUE());


      return field4;
    }

    /**
     * Getter for field5 called 1 times. Type: IMPORTED. Build precedence: 1.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel get_field5() {
      return build_field5();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel build_field5() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel field5 = (de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel) GWT.create(de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel.class);
      // Setup section.
      field5.setChild(get_C_BLUE());
      field5.setField(get_F_WOOD_HOUSE());
      field5.setPersonsCount(1);
      field5.setPlayer(get_BLUE());


      return field5;
    }

    /**
     * Getter for field6 called 1 times. Type: IMPORTED. Build precedence: 1.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel get_field6() {
      return build_field6();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel build_field6() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel field6 = (de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel) GWT.create(de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel.class);
      // Setup section.
      field6.setField(get_F_NONE());
      field6.setPlayer(get_BLUE());


      return field6;
    }

    /**
     * Getter for field7 called 1 times. Type: IMPORTED. Build precedence: 1.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel get_field7() {
      return build_field7();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel build_field7() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel field7 = (de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel) GWT.create(de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel.class);
      // Setup section.
      field7.setField(get_F_NONE());
      field7.setPlayer(get_BLUE());


      return field7;
    }

    /**
     * Getter for field8 called 1 times. Type: IMPORTED. Build precedence: 1.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel get_field8() {
      return build_field8();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel build_field8() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel field8 = (de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel) GWT.create(de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel.class);
      // Setup section.
      field8.setField(get_F_NONE());
      field8.setPlayer(get_BLUE());


      return field8;
    }

    /**
     * Getter for field9 called 1 times. Type: IMPORTED. Build precedence: 1.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel get_field9() {
      return build_field9();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel build_field9() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel field9 = (de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel) GWT.create(de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel.class);
      // Setup section.
      field9.setField(get_F_NONE());
      field9.setPlayer(get_BLUE());


      return field9;
    }

    /**
     * Getter for field10 called 1 times. Type: IMPORTED. Build precedence: 1.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel get_field10() {
      return build_field10();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel build_field10() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel field10 = (de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel) GWT.create(de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel.class);
      // Setup section.
      field10.setChild(get_C_BLUE());
      field10.setField(get_F_WOOD_HOUSE());
      field10.setPersonsCount(1);
      field10.setPlayer(get_BLUE());


      return field10;
    }

    /**
     * Getter for field11 called 1 times. Type: IMPORTED. Build precedence: 1.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel get_field11() {
      return build_field11();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel build_field11() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel field11 = (de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel) GWT.create(de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel.class);
      // Setup section.
      field11.setField(get_F_NONE());
      field11.setPlayer(get_BLUE());


      return field11;
    }

    /**
     * Getter for field12 called 1 times. Type: IMPORTED. Build precedence: 1.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel get_field12() {
      return build_field12();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel build_field12() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel field12 = (de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel) GWT.create(de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel.class);
      // Setup section.
      field12.setField(get_F_NONE());
      field12.setPlayer(get_BLUE());


      return field12;
    }

    /**
     * Getter for field13 called 1 times. Type: IMPORTED. Build precedence: 1.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel get_field13() {
      return build_field13();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel build_field13() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel field13 = (de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel) GWT.create(de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel.class);
      // Setup section.
      field13.setField(get_F_NONE());
      field13.setPlayer(get_BLUE());


      return field13;
    }

    /**
     * Getter for field14 called 1 times. Type: IMPORTED. Build precedence: 1.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel get_field14() {
      return build_field14();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel build_field14() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel field14 = (de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel) GWT.create(de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel.class);
      // Setup section.
      field14.setField(get_F_NONE());
      field14.setPlayer(get_BLUE());


      return field14;
    }

    /**
     * Getter for field15 called 1 times. Type: IMPORTED. Build precedence: 1.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel get_field15() {
      return build_field15();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel build_field15() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel field15 = (de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel) GWT.create(de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel.class);
      // Setup section.
      field15.setField(get_F_NONE());
      field15.setPlayer(get_BLUE());


      return field15;
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
      f_AbsolutePanel1.add(get_info(), 55, 335);
      f_AbsolutePanel1.add(get_btnEnclosure(), 449, 335);
      f_AbsolutePanel1.add(get_btnFeedingFamily(), 229, 335);
      f_AbsolutePanel1.add(get_f_SmallFieldRenderer3(), 55, 35);
      f_AbsolutePanel1.add(get_f_SmallFieldRenderer4(), 159, 35);
      f_AbsolutePanel1.add(get_f_SmallFieldRenderer5(), 261, 35);
      f_AbsolutePanel1.add(get_f_SmallFieldRenderer6(), 363, 35);
      f_AbsolutePanel1.add(get_f_SmallFieldRenderer7(), 465, 35);
      f_AbsolutePanel1.add(get_f_SmallFieldRenderer8(), 55, 140);
      f_AbsolutePanel1.add(get_f_SmallFieldRenderer9(), 159, 140);
      f_AbsolutePanel1.add(get_f_SmallFieldRenderer10(), 261, 140);
      f_AbsolutePanel1.add(get_f_SmallFieldRenderer11(), 363, 140);
      f_AbsolutePanel1.add(get_f_SmallFieldRenderer12(), 465, 140);
      f_AbsolutePanel1.add(get_f_SmallFieldRenderer13(), 55, 242);
      f_AbsolutePanel1.add(get_f_SmallFieldRenderer14(), 159, 242);
      f_AbsolutePanel1.add(get_f_SmallFieldRenderer15(), 261, 242);
      f_AbsolutePanel1.add(get_f_SmallFieldRenderer16(), 363, 242);
      f_AbsolutePanel1.add(get_f_SmallFieldRenderer17(), 465, 242);
      f_AbsolutePanel1.add(get_f_AcquisitionCardRenderer18(), 475, 400);
      f_AbsolutePanel1.add(get_f_AcquisitionCardRenderer19(), 405, 400);
      f_AbsolutePanel1.add(get_f_AcquisitionCardRenderer20(), 335, 400);
      f_AbsolutePanel1.add(get_f_AcquisitionCardRenderer21(), 265, 400);
      f_AbsolutePanel1.add(get_f_AcquisitionCardRenderer22(), 195, 400);
      f_AbsolutePanel1.add(get_f_AcquisitionCardRenderer23(), 125, 400);
      f_AbsolutePanel1.add(get_f_AcquisitionCardRenderer24(), 55, 400);
      f_AbsolutePanel1.add(get_f_AcquisitionCardRenderer25(), 475, 515);
      f_AbsolutePanel1.add(get_f_AcquisitionCardRenderer26(), 405, 515);
      f_AbsolutePanel1.add(get_f_AcquisitionCardRenderer27(), 335, 515);
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
     * Getter for info called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.Label get_info() {
      return build_info();
    }
    private com.google.gwt.user.client.ui.Label build_info() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label info = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      info.setText("Information");
      info.setVisible(false);


      owner.info = info;

      return info;
    }

    /**
     * Getter for btnEnclosure called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.PushButton get_btnEnclosure() {
      return build_btnEnclosure();
    }
    private com.google.gwt.user.client.ui.PushButton build_btnEnclosure() {
      // Creation section.
      final com.google.gwt.user.client.ui.PushButton btnEnclosure = (com.google.gwt.user.client.ui.PushButton) GWT.create(com.google.gwt.user.client.ui.PushButton.class);
      // Setup section.
      btnEnclosure.setText("new enclosure");
      btnEnclosure.setVisible(false);


      owner.btnEnclosure = btnEnclosure;

      return btnEnclosure;
    }

    /**
     * Getter for btnFeedingFamily called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.PushButton get_btnFeedingFamily() {
      return build_btnFeedingFamily();
    }
    private com.google.gwt.user.client.ui.PushButton build_btnFeedingFamily() {
      // Creation section.
      final com.google.gwt.user.client.ui.PushButton btnFeedingFamily = (com.google.gwt.user.client.ui.PushButton) GWT.create(com.google.gwt.user.client.ui.PushButton.class);
      // Setup section.
      btnFeedingFamily.setText("finish special events and continue feeding your family");
      btnFeedingFamily.setVisible(false);


      owner.btnFeedingFamily = btnFeedingFamily;

      return btnFeedingFamily;
    }

    /**
     * Getter for f_SmallFieldRenderer3 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.SmallFieldRenderer get_f_SmallFieldRenderer3() {
      return build_f_SmallFieldRenderer3();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.SmallFieldRenderer build_f_SmallFieldRenderer3() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.SmallFieldRenderer f_SmallFieldRenderer3 = (de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.SmallFieldRenderer) GWT.create(de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.SmallFieldRenderer.class);
      // Setup section.
      f_SmallFieldRenderer3.setStyleName("" + get_style().handcursor() + "");
      f_SmallFieldRenderer3.setPosition(0);
      f_SmallFieldRenderer3.setModel(get_field1());


      return f_SmallFieldRenderer3;
    }

    /**
     * Getter for f_SmallFieldRenderer4 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.SmallFieldRenderer get_f_SmallFieldRenderer4() {
      return build_f_SmallFieldRenderer4();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.SmallFieldRenderer build_f_SmallFieldRenderer4() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.SmallFieldRenderer f_SmallFieldRenderer4 = (de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.SmallFieldRenderer) GWT.create(de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.SmallFieldRenderer.class);
      // Setup section.
      f_SmallFieldRenderer4.setStyleName("" + get_style().handcursor() + "");
      f_SmallFieldRenderer4.setPosition(1);
      f_SmallFieldRenderer4.setModel(get_field2());


      return f_SmallFieldRenderer4;
    }

    /**
     * Getter for f_SmallFieldRenderer5 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.SmallFieldRenderer get_f_SmallFieldRenderer5() {
      return build_f_SmallFieldRenderer5();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.SmallFieldRenderer build_f_SmallFieldRenderer5() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.SmallFieldRenderer f_SmallFieldRenderer5 = (de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.SmallFieldRenderer) GWT.create(de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.SmallFieldRenderer.class);
      // Setup section.
      f_SmallFieldRenderer5.setStyleName("" + get_style().handcursor() + "");
      f_SmallFieldRenderer5.setPosition(2);
      f_SmallFieldRenderer5.setModel(get_field3());


      return f_SmallFieldRenderer5;
    }

    /**
     * Getter for f_SmallFieldRenderer6 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.SmallFieldRenderer get_f_SmallFieldRenderer6() {
      return build_f_SmallFieldRenderer6();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.SmallFieldRenderer build_f_SmallFieldRenderer6() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.SmallFieldRenderer f_SmallFieldRenderer6 = (de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.SmallFieldRenderer) GWT.create(de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.SmallFieldRenderer.class);
      // Setup section.
      f_SmallFieldRenderer6.setStyleName("" + get_style().handcursor() + "");
      f_SmallFieldRenderer6.setPosition(3);
      f_SmallFieldRenderer6.setModel(get_field4());


      return f_SmallFieldRenderer6;
    }

    /**
     * Getter for f_SmallFieldRenderer7 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.SmallFieldRenderer get_f_SmallFieldRenderer7() {
      return build_f_SmallFieldRenderer7();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.SmallFieldRenderer build_f_SmallFieldRenderer7() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.SmallFieldRenderer f_SmallFieldRenderer7 = (de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.SmallFieldRenderer) GWT.create(de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.SmallFieldRenderer.class);
      // Setup section.
      f_SmallFieldRenderer7.setStyleName("" + get_style().handcursor() + "");
      f_SmallFieldRenderer7.setPosition(4);
      f_SmallFieldRenderer7.setModel(get_field5());


      return f_SmallFieldRenderer7;
    }

    /**
     * Getter for f_SmallFieldRenderer8 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.SmallFieldRenderer get_f_SmallFieldRenderer8() {
      return build_f_SmallFieldRenderer8();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.SmallFieldRenderer build_f_SmallFieldRenderer8() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.SmallFieldRenderer f_SmallFieldRenderer8 = (de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.SmallFieldRenderer) GWT.create(de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.SmallFieldRenderer.class);
      // Setup section.
      f_SmallFieldRenderer8.setStyleName("" + get_style().handcursor() + "");
      f_SmallFieldRenderer8.setPosition(5);
      f_SmallFieldRenderer8.setModel(get_field6());


      return f_SmallFieldRenderer8;
    }

    /**
     * Getter for f_SmallFieldRenderer9 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.SmallFieldRenderer get_f_SmallFieldRenderer9() {
      return build_f_SmallFieldRenderer9();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.SmallFieldRenderer build_f_SmallFieldRenderer9() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.SmallFieldRenderer f_SmallFieldRenderer9 = (de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.SmallFieldRenderer) GWT.create(de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.SmallFieldRenderer.class);
      // Setup section.
      f_SmallFieldRenderer9.setStyleName("" + get_style().handcursor() + "");
      f_SmallFieldRenderer9.setPosition(6);
      f_SmallFieldRenderer9.setModel(get_field7());


      return f_SmallFieldRenderer9;
    }

    /**
     * Getter for f_SmallFieldRenderer10 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.SmallFieldRenderer get_f_SmallFieldRenderer10() {
      return build_f_SmallFieldRenderer10();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.SmallFieldRenderer build_f_SmallFieldRenderer10() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.SmallFieldRenderer f_SmallFieldRenderer10 = (de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.SmallFieldRenderer) GWT.create(de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.SmallFieldRenderer.class);
      // Setup section.
      f_SmallFieldRenderer10.setStyleName("" + get_style().handcursor() + "");
      f_SmallFieldRenderer10.setPosition(7);
      f_SmallFieldRenderer10.setModel(get_field8());


      return f_SmallFieldRenderer10;
    }

    /**
     * Getter for f_SmallFieldRenderer11 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.SmallFieldRenderer get_f_SmallFieldRenderer11() {
      return build_f_SmallFieldRenderer11();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.SmallFieldRenderer build_f_SmallFieldRenderer11() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.SmallFieldRenderer f_SmallFieldRenderer11 = (de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.SmallFieldRenderer) GWT.create(de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.SmallFieldRenderer.class);
      // Setup section.
      f_SmallFieldRenderer11.setStyleName("" + get_style().handcursor() + "");
      f_SmallFieldRenderer11.setPosition(8);
      f_SmallFieldRenderer11.setModel(get_field9());


      return f_SmallFieldRenderer11;
    }

    /**
     * Getter for f_SmallFieldRenderer12 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.SmallFieldRenderer get_f_SmallFieldRenderer12() {
      return build_f_SmallFieldRenderer12();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.SmallFieldRenderer build_f_SmallFieldRenderer12() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.SmallFieldRenderer f_SmallFieldRenderer12 = (de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.SmallFieldRenderer) GWT.create(de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.SmallFieldRenderer.class);
      // Setup section.
      f_SmallFieldRenderer12.setStyleName("" + get_style().handcursor() + "");
      f_SmallFieldRenderer12.setPosition(9);
      f_SmallFieldRenderer12.setModel(get_field10());


      return f_SmallFieldRenderer12;
    }

    /**
     * Getter for f_SmallFieldRenderer13 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.SmallFieldRenderer get_f_SmallFieldRenderer13() {
      return build_f_SmallFieldRenderer13();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.SmallFieldRenderer build_f_SmallFieldRenderer13() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.SmallFieldRenderer f_SmallFieldRenderer13 = (de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.SmallFieldRenderer) GWT.create(de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.SmallFieldRenderer.class);
      // Setup section.
      f_SmallFieldRenderer13.setStyleName("" + get_style().handcursor() + "");
      f_SmallFieldRenderer13.setPosition(10);
      f_SmallFieldRenderer13.setModel(get_field11());


      return f_SmallFieldRenderer13;
    }

    /**
     * Getter for f_SmallFieldRenderer14 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.SmallFieldRenderer get_f_SmallFieldRenderer14() {
      return build_f_SmallFieldRenderer14();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.SmallFieldRenderer build_f_SmallFieldRenderer14() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.SmallFieldRenderer f_SmallFieldRenderer14 = (de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.SmallFieldRenderer) GWT.create(de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.SmallFieldRenderer.class);
      // Setup section.
      f_SmallFieldRenderer14.setStyleName("" + get_style().handcursor() + "");
      f_SmallFieldRenderer14.setPosition(11);
      f_SmallFieldRenderer14.setModel(get_field12());


      return f_SmallFieldRenderer14;
    }

    /**
     * Getter for f_SmallFieldRenderer15 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.SmallFieldRenderer get_f_SmallFieldRenderer15() {
      return build_f_SmallFieldRenderer15();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.SmallFieldRenderer build_f_SmallFieldRenderer15() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.SmallFieldRenderer f_SmallFieldRenderer15 = (de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.SmallFieldRenderer) GWT.create(de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.SmallFieldRenderer.class);
      // Setup section.
      f_SmallFieldRenderer15.setStyleName("" + get_style().handcursor() + "");
      f_SmallFieldRenderer15.setPosition(12);
      f_SmallFieldRenderer15.setModel(get_field13());


      return f_SmallFieldRenderer15;
    }

    /**
     * Getter for f_SmallFieldRenderer16 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.SmallFieldRenderer get_f_SmallFieldRenderer16() {
      return build_f_SmallFieldRenderer16();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.SmallFieldRenderer build_f_SmallFieldRenderer16() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.SmallFieldRenderer f_SmallFieldRenderer16 = (de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.SmallFieldRenderer) GWT.create(de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.SmallFieldRenderer.class);
      // Setup section.
      f_SmallFieldRenderer16.setStyleName("" + get_style().handcursor() + "");
      f_SmallFieldRenderer16.setPosition(13);
      f_SmallFieldRenderer16.setModel(get_field14());


      return f_SmallFieldRenderer16;
    }

    /**
     * Getter for f_SmallFieldRenderer17 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.SmallFieldRenderer get_f_SmallFieldRenderer17() {
      return build_f_SmallFieldRenderer17();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.SmallFieldRenderer build_f_SmallFieldRenderer17() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.SmallFieldRenderer f_SmallFieldRenderer17 = (de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.SmallFieldRenderer) GWT.create(de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.SmallFieldRenderer.class);
      // Setup section.
      f_SmallFieldRenderer17.setStyleName("" + get_style().handcursor() + "");
      f_SmallFieldRenderer17.setPosition(14);
      f_SmallFieldRenderer17.setModel(get_field15());


      return f_SmallFieldRenderer17;
    }

    /**
     * Getter for f_AcquisitionCardRenderer18 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.AcquisitionCardRenderer get_f_AcquisitionCardRenderer18() {
      return build_f_AcquisitionCardRenderer18();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.AcquisitionCardRenderer build_f_AcquisitionCardRenderer18() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.AcquisitionCardRenderer f_AcquisitionCardRenderer18 = (de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.AcquisitionCardRenderer) GWT.create(de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.AcquisitionCardRenderer.class);
      // Setup section.
      f_AcquisitionCardRenderer18.setPosition(0);


      return f_AcquisitionCardRenderer18;
    }

    /**
     * Getter for f_AcquisitionCardRenderer19 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.AcquisitionCardRenderer get_f_AcquisitionCardRenderer19() {
      return build_f_AcquisitionCardRenderer19();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.AcquisitionCardRenderer build_f_AcquisitionCardRenderer19() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.AcquisitionCardRenderer f_AcquisitionCardRenderer19 = (de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.AcquisitionCardRenderer) GWT.create(de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.AcquisitionCardRenderer.class);
      // Setup section.
      f_AcquisitionCardRenderer19.setPosition(1);


      return f_AcquisitionCardRenderer19;
    }

    /**
     * Getter for f_AcquisitionCardRenderer20 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.AcquisitionCardRenderer get_f_AcquisitionCardRenderer20() {
      return build_f_AcquisitionCardRenderer20();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.AcquisitionCardRenderer build_f_AcquisitionCardRenderer20() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.AcquisitionCardRenderer f_AcquisitionCardRenderer20 = (de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.AcquisitionCardRenderer) GWT.create(de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.AcquisitionCardRenderer.class);
      // Setup section.
      f_AcquisitionCardRenderer20.setPosition(2);


      return f_AcquisitionCardRenderer20;
    }

    /**
     * Getter for f_AcquisitionCardRenderer21 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.AcquisitionCardRenderer get_f_AcquisitionCardRenderer21() {
      return build_f_AcquisitionCardRenderer21();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.AcquisitionCardRenderer build_f_AcquisitionCardRenderer21() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.AcquisitionCardRenderer f_AcquisitionCardRenderer21 = (de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.AcquisitionCardRenderer) GWT.create(de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.AcquisitionCardRenderer.class);
      // Setup section.
      f_AcquisitionCardRenderer21.setPosition(3);


      return f_AcquisitionCardRenderer21;
    }

    /**
     * Getter for f_AcquisitionCardRenderer22 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.AcquisitionCardRenderer get_f_AcquisitionCardRenderer22() {
      return build_f_AcquisitionCardRenderer22();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.AcquisitionCardRenderer build_f_AcquisitionCardRenderer22() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.AcquisitionCardRenderer f_AcquisitionCardRenderer22 = (de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.AcquisitionCardRenderer) GWT.create(de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.AcquisitionCardRenderer.class);
      // Setup section.
      f_AcquisitionCardRenderer22.setPosition(4);


      return f_AcquisitionCardRenderer22;
    }

    /**
     * Getter for f_AcquisitionCardRenderer23 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.AcquisitionCardRenderer get_f_AcquisitionCardRenderer23() {
      return build_f_AcquisitionCardRenderer23();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.AcquisitionCardRenderer build_f_AcquisitionCardRenderer23() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.AcquisitionCardRenderer f_AcquisitionCardRenderer23 = (de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.AcquisitionCardRenderer) GWT.create(de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.AcquisitionCardRenderer.class);
      // Setup section.
      f_AcquisitionCardRenderer23.setPosition(5);


      return f_AcquisitionCardRenderer23;
    }

    /**
     * Getter for f_AcquisitionCardRenderer24 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.AcquisitionCardRenderer get_f_AcquisitionCardRenderer24() {
      return build_f_AcquisitionCardRenderer24();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.AcquisitionCardRenderer build_f_AcquisitionCardRenderer24() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.AcquisitionCardRenderer f_AcquisitionCardRenderer24 = (de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.AcquisitionCardRenderer) GWT.create(de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.AcquisitionCardRenderer.class);
      // Setup section.
      f_AcquisitionCardRenderer24.setPosition(6);


      return f_AcquisitionCardRenderer24;
    }

    /**
     * Getter for f_AcquisitionCardRenderer25 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.AcquisitionCardRenderer get_f_AcquisitionCardRenderer25() {
      return build_f_AcquisitionCardRenderer25();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.AcquisitionCardRenderer build_f_AcquisitionCardRenderer25() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.AcquisitionCardRenderer f_AcquisitionCardRenderer25 = (de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.AcquisitionCardRenderer) GWT.create(de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.AcquisitionCardRenderer.class);
      // Setup section.
      f_AcquisitionCardRenderer25.setPosition(7);


      return f_AcquisitionCardRenderer25;
    }

    /**
     * Getter for f_AcquisitionCardRenderer26 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.AcquisitionCardRenderer get_f_AcquisitionCardRenderer26() {
      return build_f_AcquisitionCardRenderer26();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.AcquisitionCardRenderer build_f_AcquisitionCardRenderer26() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.AcquisitionCardRenderer f_AcquisitionCardRenderer26 = (de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.AcquisitionCardRenderer) GWT.create(de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.AcquisitionCardRenderer.class);
      // Setup section.
      f_AcquisitionCardRenderer26.setPosition(8);


      return f_AcquisitionCardRenderer26;
    }

    /**
     * Getter for f_AcquisitionCardRenderer27 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.AcquisitionCardRenderer get_f_AcquisitionCardRenderer27() {
      return build_f_AcquisitionCardRenderer27();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.AcquisitionCardRenderer build_f_AcquisitionCardRenderer27() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.AcquisitionCardRenderer f_AcquisitionCardRenderer27 = (de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.AcquisitionCardRenderer) GWT.create(de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.AcquisitionCardRenderer.class);
      // Setup section.
      f_AcquisitionCardRenderer27.setPosition(9);


      return f_AcquisitionCardRenderer27;
    }
  }
}
