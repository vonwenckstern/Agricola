package de.tu_freiberg.informatik.vonwenckstern.client;

public class AppView_BinderImpl_TemplateImpl implements de.tu_freiberg.informatik.vonwenckstern.client.AppView_BinderImpl.Template {
  
  public com.google.gwt.safehtml.shared.SafeHtml html1() {
    StringBuilder sb = new java.lang.StringBuilder();
    sb.append("<h1>MVP example</h1><h2>Agricola board game</h2>");
return new com.google.gwt.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}

public com.google.gwt.safehtml.shared.SafeHtml html2() {
StringBuilder sb = new java.lang.StringBuilder();
sb.append("Images are photos of the original Agricola board game.<br> For more information see <a href='http://www.brettspiele-report.de/agricola/'>this link</a>. <br><br> The GWT source code of this game is written by Michael von Wenckstern. <br> The source code of this game is used in his diploma thesis to show the Model-View-Presenter pattern.");
return new com.google.gwt.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}
}
