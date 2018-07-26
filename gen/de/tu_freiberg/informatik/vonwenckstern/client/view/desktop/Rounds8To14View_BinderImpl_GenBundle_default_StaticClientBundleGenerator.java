package de.tu_freiberg.informatik.vonwenckstern.client.view.desktop;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class Rounds8To14View_BinderImpl_GenBundle_default_StaticClientBundleGenerator implements de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.Rounds8To14View_BinderImpl_GenBundle {
  private static Rounds8To14View_BinderImpl_GenBundle_default_StaticClientBundleGenerator _instance0 = new Rounds8To14View_BinderImpl_GenBundle_default_StaticClientBundleGenerator();
  private void styleInitializer() {
    style = new de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.Rounds8To14View_BinderImpl_GenCss_style() {
      private boolean injected;
      public boolean ensureInjected() {
        if (!injected) {
          injected = true;
          com.google.gwt.dom.client.StyleInjector.inject(getText());
          return true;
        }
        return false;
      }
      public String getName() {
        return "style";
      }
      public String getText() {
        return (".GC-1F5UDBJ{background-color:" + ("ivory")  + ";cursor:" + ("pointer")  + ";}.GC-1F5UDAJ{cursor:" + ("pointer")  + ";}");
      }
      public java.lang.String handcursor(){
        return "GC-1F5UDAJ";
      }
      public java.lang.String panel(){
        return "GC-1F5UDBJ";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.Rounds8To14View_BinderImpl_GenCss_style get() {
      return style;
    }
  }
  public de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.Rounds8To14View_BinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.Rounds8To14View_BinderImpl_GenCss_style style;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      style(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("style", style());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'style': return this.@de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.Rounds8To14View_BinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
