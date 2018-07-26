package de.tu_freiberg.informatik.vonwenckstern.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class AppView_BinderImpl_GenBundle_default_InlineClientBundleGenerator implements de.tu_freiberg.informatik.vonwenckstern.client.AppView_BinderImpl_GenBundle {
  private static AppView_BinderImpl_GenBundle_default_InlineClientBundleGenerator _instance0 = new AppView_BinderImpl_GenBundle_default_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new de.tu_freiberg.informatik.vonwenckstern.client.AppView_BinderImpl_GenCss_style() {
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
        return (".GC-1F5UDEI{background-color:" + ("rgba(" + "0"+ ","+ " " +"0"+ ","+ " " +"0"+ ","+ " " +"0.6" + ")")  + ";z-index:" + ("101")  + ";}.GC-1F5UDFI{background-color:" + ("rgba(" + "0"+ ","+ " " +"0"+ ","+ " " +"0"+ ","+ " " +"0.6" + ")")  + ";z-index:" + ("50")  + ";pointer-events:" + ("none")  + ";}.GC-1F5UDGI{color:" + ("darkgray")  + ";font-size:" + ("medium")  + ";}.GC-1F5UDGI a:link,.GC-1F5UDGI a:visited{color:" + ("darkgray")  + ";text-decoration:" + ("none")  + ";font-style:" + ("italic")  + ";}.GC-1F5UDGI a:hover{color:") + (("darkgray")  + ";text-decoration:" + ("none")  + ";font-style:" + ("normal")  + ";}.GC-1F5UDGI a:active{color:" + ("darkgray")  + ";text-decoration:" + ("none")  + ";font-style:" + ("italic")  + ";}");
      }
      public java.lang.String disabled(){
        return "GC-1F5UDEI";
      }
      public java.lang.String disabled2(){
        return "GC-1F5UDFI";
      }
      public java.lang.String info(){
        return "GC-1F5UDGI";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static de.tu_freiberg.informatik.vonwenckstern.client.AppView_BinderImpl_GenCss_style get() {
      return style;
    }
  }
  public de.tu_freiberg.informatik.vonwenckstern.client.AppView_BinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static de.tu_freiberg.informatik.vonwenckstern.client.AppView_BinderImpl_GenCss_style style;
  
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
      case 'style': return this.@de.tu_freiberg.informatik.vonwenckstern.client.AppView_BinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
