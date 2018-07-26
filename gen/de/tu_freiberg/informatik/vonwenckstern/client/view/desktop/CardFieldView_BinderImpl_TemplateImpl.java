package de.tu_freiberg.informatik.vonwenckstern.client.view.desktop;

public class CardFieldView_BinderImpl_TemplateImpl implements de.tu_freiberg.informatik.vonwenckstern.client.view.desktop.CardFieldView_BinderImpl.Template {
  
  public com.google.gwt.safehtml.shared.SafeHtml html1(com.google.gwt.safehtml.shared.SafeUri arg0) {
    StringBuilder sb = new java.lang.StringBuilder();
    sb.append("<img src='");
    sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg0.asString()));
    sb.append("' width='400px'>");
return new com.google.gwt.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}

public com.google.gwt.safehtml.shared.SafeHtml html2(com.google.gwt.safehtml.shared.SafeUri arg0,com.google.gwt.safehtml.shared.SafeUri arg1,com.google.gwt.safehtml.shared.SafeUri arg2,com.google.gwt.safehtml.shared.SafeUri arg3,com.google.gwt.safehtml.shared.SafeUri arg4,com.google.gwt.safehtml.shared.SafeUri arg5) {
StringBuilder sb = new java.lang.StringBuilder();
sb.append("<b>build a house</b><br> wood house: 5 <img src='");
sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg0.asString()));
sb.append("' width='20px'> + 2 <img src='");
sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg1.asString()));
sb.append("' width='20px'><br> clay house: 5 <img src='");
sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg2.asString()));
sb.append("' width='20px'> + 2 <img src='");
sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg3.asString()));
sb.append("' width='20px'><br> stone house: 5 <img src='");
sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg4.asString()));
sb.append("' width='20px'> + 2 <img src='");
sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg5.asString()));
sb.append("' width='20px'><br> <br><br>and/or <b>build stables</b><br> 2 woods per stable");
return new com.google.gwt.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}

public com.google.gwt.safehtml.shared.SafeHtml html3() {
StringBuilder sb = new java.lang.StringBuilder();
sb.append("become start player");
return new com.google.gwt.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}

public com.google.gwt.safehtml.shared.SafeHtml html4(com.google.gwt.safehtml.shared.SafeUri arg0) {
StringBuilder sb = new java.lang.StringBuilder();
sb.append("get one grain<br> + <img src='");
sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg0.asString()));
sb.append("' width='20px'>");
return new com.google.gwt.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}

public com.google.gwt.safehtml.shared.SafeHtml html5() {
StringBuilder sb = new java.lang.StringBuilder();
sb.append("plow one field");
return new com.google.gwt.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}

public com.google.gwt.safehtml.shared.SafeHtml html6() {
StringBuilder sb = new java.lang.StringBuilder();
sb.append("this operation is not implemented");
return new com.google.gwt.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}

public com.google.gwt.safehtml.shared.SafeHtml html7(com.google.gwt.safehtml.shared.SafeUri arg0,com.google.gwt.safehtml.shared.SafeUri arg1) {
StringBuilder sb = new java.lang.StringBuilder();
sb.append("get two food marers<br> + <img src='");
sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg0.asString()));
sb.append("' width='20px'><img src='");
sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg1.asString()));
sb.append("' width='20px'>");
return new com.google.gwt.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}
}
