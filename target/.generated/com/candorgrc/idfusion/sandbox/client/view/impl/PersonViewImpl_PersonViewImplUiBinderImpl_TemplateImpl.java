package com.candorgrc.idfusion.sandbox.client.view.impl;

public class PersonViewImpl_PersonViewImplUiBinderImpl_TemplateImpl implements com.candorgrc.idfusion.sandbox.client.view.impl.PersonViewImpl_PersonViewImplUiBinderImpl.Template {
  
  public com.google.gwt.safehtml.shared.SafeHtml html1(java.lang.String arg0,java.lang.String arg1,java.lang.String arg2,java.lang.String arg3,java.lang.String arg4) {
    StringBuilder sb = new java.lang.StringBuilder();
    sb.append("<header> <div class='filter-toolbar'> <div class='row'> <div class='first-name form-field'> <span class='label'>First Name</span> <input class='value' type='text'> </div>  <div class='last-name form-field'> <span class='label'>Last Name</span> <input class='value' type='text'> </div> </div> <div class='row'> <div class='title form-field'> <span class='label'>Title</span> <select class='value'> <option value=''></option> <option value='Mr.'>Mr.</option> <option value='Mrs.'>Mrs.</option> <option value='Ms.'>Ms.</option> </select> </div>  <div class='suffix form-field'> <span class='label'>Suffix</span> <select class='value'> <option value=''></option> <option value='PhD'>PhD.</option> <option value='Engineer'>Engineer</option> <option value='Doctor'>Doctor</option> </select> </div> <div class='gender form-field'> <span class='label'>Gender</span> <select class='value'> <option value=''></option> <option value='m'>Male</option> <option value='f'>Female</option> </select> </div> </div>  <div class='row'> <div class='race form-field'> <span class='label'>Race</span> <input class='value' type='text'> </div>  <div class='language form-field'> <span class='label'>Language</span> <input class='value' type='text'> </div> </div> <div class='email form-field'> <span class='label'>E-Mail</span> <input class='value' type='text'> </div> <div class='university form-field'> <span class='label'>University</span> <input class='value' type='text'> </div> <div class='company form-field'> <span class='label'>Company</span> <input class='value' type='text'> </div> <div class='job-title form-field'> <span class='label'>Job Title</span> <input class='value' type='text'> </div>  <div class='buzzword form-field'> <span class='label'>Buzzword</span> <input class='value' type='text'> </div>   <div class='linkedin-skill form-field'> <span class='label'>LinkedinIn Skill</span> <input class='value' type='text'> </div>  <div class='row'> <div class='ein form-field'> <span class='label'>Employer ID</span> <input class='value' type='text'> </div>  <div class='dept form-field'> <span class='label'>Department</span> <input class='value' type='text'> </div> </div> <div class='row'> <div class='start-date form-field'> <label for='start'>Start</label> <input id='start' max='2018-12-31' min='2018-01-01' type='date' value='2018-09-29'> </div>  <div class='end-date form-field'> <label for='end'>End</label> <input id='end' max='2018-12-31' min='2018-01-01' type='date' value='2018-10-29'> </div> </div> </div> <button class='apply-filters' id='");
    sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg0));
    sb.append("'>Apply Filters</button> </header> <section> <header class='controls'> <button class='toggle-view-mode' id='");
    sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg1));
    sb.append("'>Switch view mode</button> <button class='reset' id='");
    sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg2));
    sb.append("'>Reset data collection</button> </header> <span id='");
    sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg3));
    sb.append("'></span>  <footer> <button class='fetch' id='");
    sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg4));
    sb.append("'>Fetch more...</button> </footer> </section>");
return new com.google.gwt.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}
}
