package de.tu_freiberg.informatik.vonwenckstern.client.view.desktop;

public class PlayerFieldView_BinderImpl_TemplateImpl implements de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.PlayerFieldView_BinderImpl.Template {
  
  public com.google.gwt.safehtml.shared.SafeHtml html1(com.google.gwt.safehtml.shared.SafeUri arg0) {
    StringBuilder sb = new java.lang.StringBuilder();
    sb.append("<img height='400px' src='");
    sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg0.asString()));
    sb.append("'>");
return new com.google.gwt.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}
}
