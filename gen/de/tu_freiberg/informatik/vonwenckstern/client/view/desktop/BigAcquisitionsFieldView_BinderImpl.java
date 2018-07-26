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

public class BigAcquisitionsFieldView_BinderImpl implements UiBinder<com.google.gwt.user.client.ui.AbsolutePanel, de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.BigAcquisitionsFieldView>, de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.BigAcquisitionsFieldView.Binder {

  interface Template extends SafeHtmlTemplates {
    @Template("<img src='{0}' width='400px'>")
    SafeHtml html1(SafeUri arg0);
     
    @Template("<b>fire place</b> <img height='20px' src='{0}' width='20px'><img src='{1}' width='20px'><br> Vegetable <img src='{2}' width='20px'> → <img src='{3}' width='20px'><img src='{4}' width='20px'><br> Sheep <img src='{5}' width='20px'> → <img src='{6}' width='20px'><img src='{7}' width='20px'><br> Boar <img src='{8}' width='20px'> → <img src='{9}' width='20px'><img src='{10}' width='20px'><br> Cow <img src='{11}' width='20px'> → <img src='{12}' width='20px'><img src='{13}' width='20px'><img src='{14}' width='20px'><br> <br><br>for the action <b>backing bread</b>:<br> Grain <img src='{15}' width='20px'> → <img src='{16}' width='20px'><img src='{17}' width='20px'>")
    SafeHtml html2(SafeUri arg0, SafeUri arg1, SafeUri arg2, SafeUri arg3, SafeUri arg4, SafeUri arg5, SafeUri arg6, SafeUri arg7, SafeUri arg8, SafeUri arg9, SafeUri arg10, SafeUri arg11, SafeUri arg12, SafeUri arg13, SafeUri arg14, SafeUri arg15, SafeUri arg16, SafeUri arg17);
     
    @Template("<b>fire place</b> <img src='{0}' width='20px'><img src='{1}' width='20px'><img src='{2}' width='20px'><br> Vegetable <img src='{3}' width='20px'> → <img src='{4}' width='20px'><img src='{5}' width='20px'><br> Sheep <img src='{6}' width='20px'> → <img src='{7}' width='20px'><img src='{8}' width='20px'><br> Boar <img src='{9}' width='20px'> → <img src='{10}' width='20px'><img src='{11}' width='20px'><br> Cow <img src='{12}' width='20px'> → <img src='{13}' width='20px'><img src='{14}' width='20px'><img src='{15}' width='20px'><br> <br><br>for the action <b>backing bread</b>:<br> Grain <img src='{16}' width='20px'> → <img src='{17}' width='20px'><img src='{18}' width='20px'>")
    SafeHtml html3(SafeUri arg0, SafeUri arg1, SafeUri arg2, SafeUri arg3, SafeUri arg4, SafeUri arg5, SafeUri arg6, SafeUri arg7, SafeUri arg8, SafeUri arg9, SafeUri arg10, SafeUri arg11, SafeUri arg12, SafeUri arg13, SafeUri arg14, SafeUri arg15, SafeUri arg16, SafeUri arg17, SafeUri arg18);
     
    @Template("<b>cookery</b> <img src='{0}' width='20px'><img src='{1}' width='20px'><img src='{2}' width='20px'><img src='{3}' width='20px'><br> Vegetable <img src='{4}' width='20px'> → <img src='{5}' width='20px'><img src='{6}' width='20px'><img src='{7}' width='20px'><br> Sheep <img src='{8}' width='20px'> → <img src='{9}' width='20px'><img src='{10}' width='20px'><br> Boar <img src='{11}' width='20px'> → <img src='{12}' width='20px'><img src='{13}' width='20px'><img src='{14}' width='20px'><br> Cow <img src='{15}' width='20px'> → <img src='{16}' width='20px'><img src='{17}' width='20px'><img src='{18}' width='20px'><img src='{19}' width='20px'><br> <br><br>for the action <b>backing bread</b>:<br> Grain <img src='{20}' width='20px'> → <img src='{21}' width='20px'><img src='{22}' width='20px'><img src='{23}' width='20px'>")
    SafeHtml html4(SafeUri arg0, SafeUri arg1, SafeUri arg2, SafeUri arg3, SafeUri arg4, SafeUri arg5, SafeUri arg6, SafeUri arg7, SafeUri arg8, SafeUri arg9, SafeUri arg10, SafeUri arg11, SafeUri arg12, SafeUri arg13, SafeUri arg14, SafeUri arg15, SafeUri arg16, SafeUri arg17, SafeUri arg18, SafeUri arg19, SafeUri arg20, SafeUri arg21, SafeUri arg22, SafeUri arg23);
     
    @Template("<b>cookery</b> <img src='{0}' width='20px'><img src='{1}' width='20px'><img src='{2}' width='20px'><img src='{3}' width='20px'><img src='{4}' width='20px'><br> Vegetable <img src='{5}' width='20px'> → <img src='{6}' width='20px'><img src='{7}' width='20px'><img src='{8}' width='20px'><br> Sheep <img src='{9}' width='20px'> → <img src='{10}' width='20px'><img src='{11}' width='20px'><br> Boar <img src='{12}' width='20px'> → <img src='{13}' width='20px'><img src='{14}' width='20px'><img src='{15}' width='20px'><br> Cow <img src='{16}' width='20px'> → <img src='{17}' width='20px'><img src='{18}' width='20px'><img src='{19}' width='20px'><img src='{20}' width='20px'><br> <br><br>for the action <b>backing bread</b>:<br> Grain <img src='{21}' width='20px'> → <img src='{22}' width='20px'><img src='{23}' width='20px'><img src='{24}' width='20px'>")
    SafeHtml html5(SafeUri arg0, SafeUri arg1, SafeUri arg2, SafeUri arg3, SafeUri arg4, SafeUri arg5, SafeUri arg6, SafeUri arg7, SafeUri arg8, SafeUri arg9, SafeUri arg10, SafeUri arg11, SafeUri arg12, SafeUri arg13, SafeUri arg14, SafeUri arg15, SafeUri arg16, SafeUri arg17, SafeUri arg18, SafeUri arg19, SafeUri arg20, SafeUri arg21, SafeUri arg22, SafeUri arg23, SafeUri arg24);
     
    @Template("<b>fountain</b> <img src='{0}' width='20px'><img src='{1}' width='20px'><img src='{2}' width='20px'><img src='{3}' width='20px'><br> You will get 5 food markers.")
    SafeHtml html6(SafeUri arg0, SafeUri arg1, SafeUri arg2, SafeUri arg3);
     
    @Template("<b>clay oven</b> <img src='{0}' width='20px'><img src='{1}' width='20px'><img src='{2}' width='20px'><img src='{3}' width='20px'><br> for the action <b>backing bread</b>:<br> <b>1x</b> Grain <img src='{4}' width='20px'> → <img src='{5}' width='20px'><img src='{6}' width='20px'><img src='{7}' width='20px'><img src='{8}' width='20px'><img src='{9}' width='20px'>")
    SafeHtml html7(SafeUri arg0, SafeUri arg1, SafeUri arg2, SafeUri arg3, SafeUri arg4, SafeUri arg5, SafeUri arg6, SafeUri arg7, SafeUri arg8, SafeUri arg9);
     
    @Template("<b>stone oven</b> <img src='{0}' width='20px'><img src='{1}' width='20px'><img src='{2}' width='20px'><img src='{3}' width='20px'><br> for the action <b>backing bread</b>:<br> <b>2x</b> Grain <img src='{4}' width='20px'> → <img src='{5}' width='20px'><img src='{6}' width='20px'><img src='{7}' width='20px'><img src='{8}' width='20px'>")
    SafeHtml html8(SafeUri arg0, SafeUri arg1, SafeUri arg2, SafeUri arg3, SafeUri arg4, SafeUri arg5, SafeUri arg6, SafeUri arg7, SafeUri arg8);
     
    @Template("<b>joinery</b> <img src='{0}' width='20px'><img src='{1}' width='20px'><img src='{2}' width='20px'><img src='{3}' width='20px'><br> in every <b>harvest season</b>:<br> <b>1x</b> Wood <img src='{4}' width='20px'> → <img src='{5}' width='20px'><img src='{6}' width='20px'>")
    SafeHtml html9(SafeUri arg0, SafeUri arg1, SafeUri arg2, SafeUri arg3, SafeUri arg4, SafeUri arg5, SafeUri arg6);
     
    @Template("<b>pottery</b> <img src='{0}' width='20px'><img src='{1}' width='20px'><img src='{2}' width='20px'><img src='{3}' width='20px'><br> in every <b>harvest season</b>:<br> <b>1x</b> Clay <img src='{4}' width='20px'> → <img src='{5}' width='20px'><img src='{6}' width='20px'>")
    SafeHtml html10(SafeUri arg0, SafeUri arg1, SafeUri arg2, SafeUri arg3, SafeUri arg4, SafeUri arg5, SafeUri arg6);
     
    @Template("<b>basket maker</b> <img src='{0}' width='20px'><img src='{1}' width='20px'><img src='{2}' width='20px'><img src='{3}' width='20px'><br> in every <b>harvest season</b>:<br> <b>1x</b> Reed <img src='{4}' width='20px'> → <img src='{5}' width='20px'><img src='{6}' width='20px'><img src='{7}' width='20px'>")
    SafeHtml html11(SafeUri arg0, SafeUri arg1, SafeUri arg2, SafeUri arg3, SafeUri arg4, SafeUri arg5, SafeUri arg6, SafeUri arg7);
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.AbsolutePanel createAndBindUi(final de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.BigAcquisitionsFieldView owner) {


    return new Widgets(owner).get_f_AbsolutePanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.BigAcquisitionsFieldView owner;


    public Widgets(final de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.BigAcquisitionsFieldView owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
      build_im();  // more than one getter call detected. Type: IMPORTED, precedence: 1
    }

    SafeHtml template_html1() {
      return template.html1(get_im().bigAcquisitionsField().getSafeUri());
    }
    SafeHtml template_html2() {
      return template.html2(get_im().clayIcon().getSafeUri(), get_im().clayIcon().getSafeUri(), get_im().vegetableIcon().getSafeUri(), get_im().foodMarker().getSafeUri(), get_im().foodMarker().getSafeUri(), get_im().sheepIcon().getSafeUri(), get_im().foodMarker().getSafeUri(), get_im().foodMarker().getSafeUri(), get_im().boarIcon().getSafeUri(), get_im().foodMarker().getSafeUri(), get_im().foodMarker().getSafeUri(), get_im().cowIcon().getSafeUri(), get_im().foodMarker().getSafeUri(), get_im().foodMarker().getSafeUri(), get_im().foodMarker().getSafeUri(), get_im().grainIcon().getSafeUri(), get_im().foodMarker().getSafeUri(), get_im().foodMarker().getSafeUri());
    }
    SafeHtml template_html3() {
      return template.html3(get_im().clayIcon().getSafeUri(), get_im().clayIcon().getSafeUri(), get_im().clayIcon().getSafeUri(), get_im().vegetableIcon().getSafeUri(), get_im().foodMarker().getSafeUri(), get_im().foodMarker().getSafeUri(), get_im().sheepIcon().getSafeUri(), get_im().foodMarker().getSafeUri(), get_im().foodMarker().getSafeUri(), get_im().boarIcon().getSafeUri(), get_im().foodMarker().getSafeUri(), get_im().foodMarker().getSafeUri(), get_im().cowIcon().getSafeUri(), get_im().foodMarker().getSafeUri(), get_im().foodMarker().getSafeUri(), get_im().foodMarker().getSafeUri(), get_im().grainIcon().getSafeUri(), get_im().foodMarker().getSafeUri(), get_im().foodMarker().getSafeUri());
    }
    SafeHtml template_html4() {
      return template.html4(get_im().clayIcon().getSafeUri(), get_im().clayIcon().getSafeUri(), get_im().clayIcon().getSafeUri(), get_im().clayIcon().getSafeUri(), get_im().vegetableIcon().getSafeUri(), get_im().foodMarker().getSafeUri(), get_im().foodMarker().getSafeUri(), get_im().foodMarker().getSafeUri(), get_im().sheepIcon().getSafeUri(), get_im().foodMarker().getSafeUri(), get_im().foodMarker().getSafeUri(), get_im().boarIcon().getSafeUri(), get_im().foodMarker().getSafeUri(), get_im().foodMarker().getSafeUri(), get_im().foodMarker().getSafeUri(), get_im().cowIcon().getSafeUri(), get_im().foodMarker().getSafeUri(), get_im().foodMarker().getSafeUri(), get_im().foodMarker().getSafeUri(), get_im().foodMarker().getSafeUri(), get_im().grainIcon().getSafeUri(), get_im().foodMarker().getSafeUri(), get_im().foodMarker().getSafeUri(), get_im().foodMarker().getSafeUri());
    }
    SafeHtml template_html5() {
      return template.html5(get_im().clayIcon().getSafeUri(), get_im().clayIcon().getSafeUri(), get_im().clayIcon().getSafeUri(), get_im().clayIcon().getSafeUri(), get_im().clayIcon().getSafeUri(), get_im().vegetableIcon().getSafeUri(), get_im().foodMarker().getSafeUri(), get_im().foodMarker().getSafeUri(), get_im().foodMarker().getSafeUri(), get_im().sheepIcon().getSafeUri(), get_im().foodMarker().getSafeUri(), get_im().foodMarker().getSafeUri(), get_im().boarIcon().getSafeUri(), get_im().foodMarker().getSafeUri(), get_im().foodMarker().getSafeUri(), get_im().foodMarker().getSafeUri(), get_im().cowIcon().getSafeUri(), get_im().foodMarker().getSafeUri(), get_im().foodMarker().getSafeUri(), get_im().foodMarker().getSafeUri(), get_im().foodMarker().getSafeUri(), get_im().grainIcon().getSafeUri(), get_im().foodMarker().getSafeUri(), get_im().foodMarker().getSafeUri(), get_im().foodMarker().getSafeUri());
    }
    SafeHtml template_html6() {
      return template.html6(get_im().woodIcon().getSafeUri(), get_im().stoneIcon().getSafeUri(), get_im().stoneIcon().getSafeUri(), get_im().stoneIcon().getSafeUri());
    }
    SafeHtml template_html7() {
      return template.html7(get_im().stoneIcon().getSafeUri(), get_im().clayIcon().getSafeUri(), get_im().clayIcon().getSafeUri(), get_im().clayIcon().getSafeUri(), get_im().grainIcon().getSafeUri(), get_im().foodMarker().getSafeUri(), get_im().foodMarker().getSafeUri(), get_im().foodMarker().getSafeUri(), get_im().foodMarker().getSafeUri(), get_im().foodMarker().getSafeUri());
    }
    SafeHtml template_html8() {
      return template.html8(get_im().clayIcon().getSafeUri(), get_im().stoneIcon().getSafeUri(), get_im().stoneIcon().getSafeUri(), get_im().stoneIcon().getSafeUri(), get_im().grainIcon().getSafeUri(), get_im().foodMarker().getSafeUri(), get_im().foodMarker().getSafeUri(), get_im().foodMarker().getSafeUri(), get_im().foodMarker().getSafeUri());
    }
    SafeHtml template_html9() {
      return template.html9(get_im().woodIcon().getSafeUri(), get_im().woodIcon().getSafeUri(), get_im().stoneIcon().getSafeUri(), get_im().stoneIcon().getSafeUri(), get_im().woodIcon().getSafeUri(), get_im().foodMarker().getSafeUri(), get_im().foodMarker().getSafeUri());
    }
    SafeHtml template_html10() {
      return template.html10(get_im().clayIcon().getSafeUri(), get_im().clayIcon().getSafeUri(), get_im().stoneIcon().getSafeUri(), get_im().stoneIcon().getSafeUri(), get_im().clayIcon().getSafeUri(), get_im().foodMarker().getSafeUri(), get_im().foodMarker().getSafeUri());
    }
    SafeHtml template_html11() {
      return template.html11(get_im().reedIcon().getSafeUri(), get_im().reedIcon().getSafeUri(), get_im().stoneIcon().getSafeUri(), get_im().stoneIcon().getSafeUri(), get_im().reedIcon().getSafeUri(), get_im().foodMarker().getSafeUri(), get_im().foodMarker().getSafeUri(), get_im().foodMarker().getSafeUri());
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.BigAcquisitionsFieldView_BinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.BigAcquisitionsFieldView_BinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.BigAcquisitionsFieldView_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.BigAcquisitionsFieldView_BinderImpl_GenBundle) GWT.create(de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.BigAcquisitionsFieldView_BinderImpl_GenBundle.class);
      // Setup section.


      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 0 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.BigAcquisitionsFieldView_BinderImpl_GenCss_style get_style() {
      return build_style();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.BigAcquisitionsFieldView_BinderImpl_GenCss_style build_style() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.BigAcquisitionsFieldView_BinderImpl_GenCss_style style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
      // Setup section.
      style.ensureInjected();


      return style;
    }

    /**
     * Getter for BA_NONE called 0 times. Type: DEFAULT. Build precedence: 1.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.model.BigAcquisitions get_BA_NONE() {
      return build_BA_NONE();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.model.BigAcquisitions build_BA_NONE() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.model.BigAcquisitions BA_NONE = de.tu_freiberg.informatik.vonwenckstern.client.model.BigAcquisitions.BA_NONE;
      // Setup section.


      return BA_NONE;
    }

    /**
     * Getter for BA_FIRE_PLACE called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.model.BigAcquisitions get_BA_FIRE_PLACE() {
      return build_BA_FIRE_PLACE();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.model.BigAcquisitions build_BA_FIRE_PLACE() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.model.BigAcquisitions BA_FIRE_PLACE = de.tu_freiberg.informatik.vonwenckstern.client.model.BigAcquisitions.BA_FIRE_PLACE;
      // Setup section.


      return BA_FIRE_PLACE;
    }

    /**
     * Getter for BA_FIRE_PLACE2 called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.model.BigAcquisitions get_BA_FIRE_PLACE2() {
      return build_BA_FIRE_PLACE2();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.model.BigAcquisitions build_BA_FIRE_PLACE2() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.model.BigAcquisitions BA_FIRE_PLACE2 = de.tu_freiberg.informatik.vonwenckstern.client.model.BigAcquisitions.BA_FIRE_PLACE2;
      // Setup section.


      return BA_FIRE_PLACE2;
    }

    /**
     * Getter for BA_COOKERY called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.model.BigAcquisitions get_BA_COOKERY() {
      return build_BA_COOKERY();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.model.BigAcquisitions build_BA_COOKERY() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.model.BigAcquisitions BA_COOKERY = de.tu_freiberg.informatik.vonwenckstern.client.model.BigAcquisitions.BA_COOKERY;
      // Setup section.


      return BA_COOKERY;
    }

    /**
     * Getter for BA_COOKERY2 called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.model.BigAcquisitions get_BA_COOKERY2() {
      return build_BA_COOKERY2();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.model.BigAcquisitions build_BA_COOKERY2() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.model.BigAcquisitions BA_COOKERY2 = de.tu_freiberg.informatik.vonwenckstern.client.model.BigAcquisitions.BA_COOKERY2;
      // Setup section.


      return BA_COOKERY2;
    }

    /**
     * Getter for BA_FOUNTAIN called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.model.BigAcquisitions get_BA_FOUNTAIN() {
      return build_BA_FOUNTAIN();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.model.BigAcquisitions build_BA_FOUNTAIN() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.model.BigAcquisitions BA_FOUNTAIN = de.tu_freiberg.informatik.vonwenckstern.client.model.BigAcquisitions.BA_FOUNTAIN;
      // Setup section.


      return BA_FOUNTAIN;
    }

    /**
     * Getter for BA_CLAY_OVEN called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.model.BigAcquisitions get_BA_CLAY_OVEN() {
      return build_BA_CLAY_OVEN();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.model.BigAcquisitions build_BA_CLAY_OVEN() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.model.BigAcquisitions BA_CLAY_OVEN = de.tu_freiberg.informatik.vonwenckstern.client.model.BigAcquisitions.BA_CLAY_OVEN;
      // Setup section.


      return BA_CLAY_OVEN;
    }

    /**
     * Getter for BA_STONE_OVEN called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.model.BigAcquisitions get_BA_STONE_OVEN() {
      return build_BA_STONE_OVEN();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.model.BigAcquisitions build_BA_STONE_OVEN() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.model.BigAcquisitions BA_STONE_OVEN = de.tu_freiberg.informatik.vonwenckstern.client.model.BigAcquisitions.BA_STONE_OVEN;
      // Setup section.


      return BA_STONE_OVEN;
    }

    /**
     * Getter for BA_JOINERY called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.model.BigAcquisitions get_BA_JOINERY() {
      return build_BA_JOINERY();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.model.BigAcquisitions build_BA_JOINERY() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.model.BigAcquisitions BA_JOINERY = de.tu_freiberg.informatik.vonwenckstern.client.model.BigAcquisitions.BA_JOINERY;
      // Setup section.


      return BA_JOINERY;
    }

    /**
     * Getter for BA_POTTERY called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.model.BigAcquisitions get_BA_POTTERY() {
      return build_BA_POTTERY();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.model.BigAcquisitions build_BA_POTTERY() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.model.BigAcquisitions BA_POTTERY = de.tu_freiberg.informatik.vonwenckstern.client.model.BigAcquisitions.BA_POTTERY;
      // Setup section.


      return BA_POTTERY;
    }

    /**
     * Getter for BA_BASKET_MAKER called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.model.BigAcquisitions get_BA_BASKET_MAKER() {
      return build_BA_BASKET_MAKER();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.model.BigAcquisitions build_BA_BASKET_MAKER() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.model.BigAcquisitions BA_BASKET_MAKER = de.tu_freiberg.informatik.vonwenckstern.client.model.BigAcquisitions.BA_BASKET_MAKER;
      // Setup section.


      return BA_BASKET_MAKER;
    }

    /**
     * Getter for im called 132 times. Type: IMPORTED. Build precedence: 1.
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
      f_AbsolutePanel1.add(get_f_TooltipImageAcquisitionRenderer3(), 5, 25);
      f_AbsolutePanel1.add(get_f_TooltipImageAcquisitionRenderer5(), 85, 25);
      f_AbsolutePanel1.add(get_f_TooltipImageAcquisitionRenderer7(), 168, 25);
      f_AbsolutePanel1.add(get_f_TooltipImageAcquisitionRenderer9(), 250, 25);
      f_AbsolutePanel1.add(get_f_TooltipImageAcquisitionRenderer11(), 330, 25);
      f_AbsolutePanel1.add(get_f_TooltipImageAcquisitionRenderer13(), 5, 160);
      f_AbsolutePanel1.add(get_f_TooltipImageAcquisitionRenderer15(), 85, 160);
      f_AbsolutePanel1.add(get_f_TooltipImageAcquisitionRenderer17(), 168, 160);
      f_AbsolutePanel1.add(get_f_TooltipImageAcquisitionRenderer19(), 250, 160);
      f_AbsolutePanel1.add(get_f_TooltipImageAcquisitionRenderer21(), 330, 160);
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
     * Getter for f_TooltipImageAcquisitionRenderer3 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.TooltipImageAcquisitionRenderer get_f_TooltipImageAcquisitionRenderer3() {
      return build_f_TooltipImageAcquisitionRenderer3();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.TooltipImageAcquisitionRenderer build_f_TooltipImageAcquisitionRenderer3() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.TooltipImageAcquisitionRenderer f_TooltipImageAcquisitionRenderer3 = (de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.TooltipImageAcquisitionRenderer) GWT.create(de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.TooltipImageAcquisitionRenderer.class);
      // Setup section.
      f_TooltipImageAcquisitionRenderer3.addTooltip(get_f_HTML4());
      f_TooltipImageAcquisitionRenderer3.setBigAcquisiton(get_BA_FIRE_PLACE());


      return f_TooltipImageAcquisitionRenderer3;
    }

    /**
     * Getter for f_HTML4 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.HTML get_f_HTML4() {
      return build_f_HTML4();
    }
    private com.google.gwt.user.client.ui.HTML build_f_HTML4() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTML f_HTML4 = (com.google.gwt.user.client.ui.HTML) GWT.create(com.google.gwt.user.client.ui.HTML.class);
      // Setup section.
      f_HTML4.setHTML(template_html2().asString());


      return f_HTML4;
    }

    /**
     * Getter for f_TooltipImageAcquisitionRenderer5 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.TooltipImageAcquisitionRenderer get_f_TooltipImageAcquisitionRenderer5() {
      return build_f_TooltipImageAcquisitionRenderer5();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.TooltipImageAcquisitionRenderer build_f_TooltipImageAcquisitionRenderer5() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.TooltipImageAcquisitionRenderer f_TooltipImageAcquisitionRenderer5 = (de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.TooltipImageAcquisitionRenderer) GWT.create(de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.TooltipImageAcquisitionRenderer.class);
      // Setup section.
      f_TooltipImageAcquisitionRenderer5.addTooltip(get_f_HTML6());
      f_TooltipImageAcquisitionRenderer5.setBigAcquisiton(get_BA_FIRE_PLACE2());


      return f_TooltipImageAcquisitionRenderer5;
    }

    /**
     * Getter for f_HTML6 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.HTML get_f_HTML6() {
      return build_f_HTML6();
    }
    private com.google.gwt.user.client.ui.HTML build_f_HTML6() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTML f_HTML6 = (com.google.gwt.user.client.ui.HTML) GWT.create(com.google.gwt.user.client.ui.HTML.class);
      // Setup section.
      f_HTML6.setHTML(template_html3().asString());


      return f_HTML6;
    }

    /**
     * Getter for f_TooltipImageAcquisitionRenderer7 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.TooltipImageAcquisitionRenderer get_f_TooltipImageAcquisitionRenderer7() {
      return build_f_TooltipImageAcquisitionRenderer7();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.TooltipImageAcquisitionRenderer build_f_TooltipImageAcquisitionRenderer7() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.TooltipImageAcquisitionRenderer f_TooltipImageAcquisitionRenderer7 = (de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.TooltipImageAcquisitionRenderer) GWT.create(de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.TooltipImageAcquisitionRenderer.class);
      // Setup section.
      f_TooltipImageAcquisitionRenderer7.addTooltip(get_f_HTML8());
      f_TooltipImageAcquisitionRenderer7.setBigAcquisiton(get_BA_COOKERY());


      return f_TooltipImageAcquisitionRenderer7;
    }

    /**
     * Getter for f_HTML8 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.HTML get_f_HTML8() {
      return build_f_HTML8();
    }
    private com.google.gwt.user.client.ui.HTML build_f_HTML8() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTML f_HTML8 = (com.google.gwt.user.client.ui.HTML) GWT.create(com.google.gwt.user.client.ui.HTML.class);
      // Setup section.
      f_HTML8.setHTML(template_html4().asString());


      return f_HTML8;
    }

    /**
     * Getter for f_TooltipImageAcquisitionRenderer9 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.TooltipImageAcquisitionRenderer get_f_TooltipImageAcquisitionRenderer9() {
      return build_f_TooltipImageAcquisitionRenderer9();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.TooltipImageAcquisitionRenderer build_f_TooltipImageAcquisitionRenderer9() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.TooltipImageAcquisitionRenderer f_TooltipImageAcquisitionRenderer9 = (de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.TooltipImageAcquisitionRenderer) GWT.create(de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.TooltipImageAcquisitionRenderer.class);
      // Setup section.
      f_TooltipImageAcquisitionRenderer9.addTooltip(get_f_HTML10());
      f_TooltipImageAcquisitionRenderer9.setBigAcquisiton(get_BA_COOKERY2());


      return f_TooltipImageAcquisitionRenderer9;
    }

    /**
     * Getter for f_HTML10 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.HTML get_f_HTML10() {
      return build_f_HTML10();
    }
    private com.google.gwt.user.client.ui.HTML build_f_HTML10() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTML f_HTML10 = (com.google.gwt.user.client.ui.HTML) GWT.create(com.google.gwt.user.client.ui.HTML.class);
      // Setup section.
      f_HTML10.setHTML(template_html5().asString());


      return f_HTML10;
    }

    /**
     * Getter for f_TooltipImageAcquisitionRenderer11 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.TooltipImageAcquisitionRenderer get_f_TooltipImageAcquisitionRenderer11() {
      return build_f_TooltipImageAcquisitionRenderer11();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.TooltipImageAcquisitionRenderer build_f_TooltipImageAcquisitionRenderer11() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.TooltipImageAcquisitionRenderer f_TooltipImageAcquisitionRenderer11 = (de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.TooltipImageAcquisitionRenderer) GWT.create(de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.TooltipImageAcquisitionRenderer.class);
      // Setup section.
      f_TooltipImageAcquisitionRenderer11.addTooltip(get_f_HTML12());
      f_TooltipImageAcquisitionRenderer11.setBigAcquisiton(get_BA_FOUNTAIN());


      return f_TooltipImageAcquisitionRenderer11;
    }

    /**
     * Getter for f_HTML12 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.HTML get_f_HTML12() {
      return build_f_HTML12();
    }
    private com.google.gwt.user.client.ui.HTML build_f_HTML12() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTML f_HTML12 = (com.google.gwt.user.client.ui.HTML) GWT.create(com.google.gwt.user.client.ui.HTML.class);
      // Setup section.
      f_HTML12.setHTML(template_html6().asString());


      return f_HTML12;
    }

    /**
     * Getter for f_TooltipImageAcquisitionRenderer13 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.TooltipImageAcquisitionRenderer get_f_TooltipImageAcquisitionRenderer13() {
      return build_f_TooltipImageAcquisitionRenderer13();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.TooltipImageAcquisitionRenderer build_f_TooltipImageAcquisitionRenderer13() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.TooltipImageAcquisitionRenderer f_TooltipImageAcquisitionRenderer13 = (de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.TooltipImageAcquisitionRenderer) GWT.create(de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.TooltipImageAcquisitionRenderer.class);
      // Setup section.
      f_TooltipImageAcquisitionRenderer13.addTooltip(get_f_HTML14());
      f_TooltipImageAcquisitionRenderer13.setBigAcquisiton(get_BA_CLAY_OVEN());


      return f_TooltipImageAcquisitionRenderer13;
    }

    /**
     * Getter for f_HTML14 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.HTML get_f_HTML14() {
      return build_f_HTML14();
    }
    private com.google.gwt.user.client.ui.HTML build_f_HTML14() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTML f_HTML14 = (com.google.gwt.user.client.ui.HTML) GWT.create(com.google.gwt.user.client.ui.HTML.class);
      // Setup section.
      f_HTML14.setHTML(template_html7().asString());


      return f_HTML14;
    }

    /**
     * Getter for f_TooltipImageAcquisitionRenderer15 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.TooltipImageAcquisitionRenderer get_f_TooltipImageAcquisitionRenderer15() {
      return build_f_TooltipImageAcquisitionRenderer15();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.TooltipImageAcquisitionRenderer build_f_TooltipImageAcquisitionRenderer15() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.TooltipImageAcquisitionRenderer f_TooltipImageAcquisitionRenderer15 = (de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.TooltipImageAcquisitionRenderer) GWT.create(de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.TooltipImageAcquisitionRenderer.class);
      // Setup section.
      f_TooltipImageAcquisitionRenderer15.addTooltip(get_f_HTML16());
      f_TooltipImageAcquisitionRenderer15.setBigAcquisiton(get_BA_STONE_OVEN());


      return f_TooltipImageAcquisitionRenderer15;
    }

    /**
     * Getter for f_HTML16 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.HTML get_f_HTML16() {
      return build_f_HTML16();
    }
    private com.google.gwt.user.client.ui.HTML build_f_HTML16() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTML f_HTML16 = (com.google.gwt.user.client.ui.HTML) GWT.create(com.google.gwt.user.client.ui.HTML.class);
      // Setup section.
      f_HTML16.setHTML(template_html8().asString());


      return f_HTML16;
    }

    /**
     * Getter for f_TooltipImageAcquisitionRenderer17 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.TooltipImageAcquisitionRenderer get_f_TooltipImageAcquisitionRenderer17() {
      return build_f_TooltipImageAcquisitionRenderer17();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.TooltipImageAcquisitionRenderer build_f_TooltipImageAcquisitionRenderer17() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.TooltipImageAcquisitionRenderer f_TooltipImageAcquisitionRenderer17 = (de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.TooltipImageAcquisitionRenderer) GWT.create(de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.TooltipImageAcquisitionRenderer.class);
      // Setup section.
      f_TooltipImageAcquisitionRenderer17.addTooltip(get_f_HTML18());
      f_TooltipImageAcquisitionRenderer17.setBigAcquisiton(get_BA_JOINERY());


      return f_TooltipImageAcquisitionRenderer17;
    }

    /**
     * Getter for f_HTML18 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.HTML get_f_HTML18() {
      return build_f_HTML18();
    }
    private com.google.gwt.user.client.ui.HTML build_f_HTML18() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTML f_HTML18 = (com.google.gwt.user.client.ui.HTML) GWT.create(com.google.gwt.user.client.ui.HTML.class);
      // Setup section.
      f_HTML18.setHTML(template_html9().asString());


      return f_HTML18;
    }

    /**
     * Getter for f_TooltipImageAcquisitionRenderer19 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.TooltipImageAcquisitionRenderer get_f_TooltipImageAcquisitionRenderer19() {
      return build_f_TooltipImageAcquisitionRenderer19();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.TooltipImageAcquisitionRenderer build_f_TooltipImageAcquisitionRenderer19() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.TooltipImageAcquisitionRenderer f_TooltipImageAcquisitionRenderer19 = (de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.TooltipImageAcquisitionRenderer) GWT.create(de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.TooltipImageAcquisitionRenderer.class);
      // Setup section.
      f_TooltipImageAcquisitionRenderer19.addTooltip(get_f_HTML20());
      f_TooltipImageAcquisitionRenderer19.setBigAcquisiton(get_BA_POTTERY());


      return f_TooltipImageAcquisitionRenderer19;
    }

    /**
     * Getter for f_HTML20 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.HTML get_f_HTML20() {
      return build_f_HTML20();
    }
    private com.google.gwt.user.client.ui.HTML build_f_HTML20() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTML f_HTML20 = (com.google.gwt.user.client.ui.HTML) GWT.create(com.google.gwt.user.client.ui.HTML.class);
      // Setup section.
      f_HTML20.setHTML(template_html10().asString());


      return f_HTML20;
    }

    /**
     * Getter for f_TooltipImageAcquisitionRenderer21 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.TooltipImageAcquisitionRenderer get_f_TooltipImageAcquisitionRenderer21() {
      return build_f_TooltipImageAcquisitionRenderer21();
    }
    private de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.TooltipImageAcquisitionRenderer build_f_TooltipImageAcquisitionRenderer21() {
      // Creation section.
      final de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.TooltipImageAcquisitionRenderer f_TooltipImageAcquisitionRenderer21 = (de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.TooltipImageAcquisitionRenderer) GWT.create(de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.TooltipImageAcquisitionRenderer.class);
      // Setup section.
      f_TooltipImageAcquisitionRenderer21.addTooltip(get_f_HTML22());
      f_TooltipImageAcquisitionRenderer21.setBigAcquisiton(get_BA_BASKET_MAKER());


      return f_TooltipImageAcquisitionRenderer21;
    }

    /**
     * Getter for f_HTML22 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.HTML get_f_HTML22() {
      return build_f_HTML22();
    }
    private com.google.gwt.user.client.ui.HTML build_f_HTML22() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTML f_HTML22 = (com.google.gwt.user.client.ui.HTML) GWT.create(com.google.gwt.user.client.ui.HTML.class);
      // Setup section.
      f_HTML22.setHTML(template_html11().asString());


      return f_HTML22;
    }
  }
}
