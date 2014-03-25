package com.tr8n.struts.interceptors;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.tr8n.core.Session;

public class Tr8nInterceptor extends AbstractInterceptor {
  private static final long serialVersionUID = 5065298925572763728L;
  
    @Override
    public String intercept(ActionInvocation invocation) throws Exception {
//		Map session = invocation.getInvocationContext().getSession();
		ActionContext context = invocation.getInvocationContext();  
	    HttpServletRequest request = (HttpServletRequest) context.get(ServletActionContext.HTTP_REQUEST);
	    
	    Session tr8nSession = new Session("37f812fac93a71088", "a9dc95ff798e6e1d1", "https://sandbox.tr8nhub.com");
	    tr8nSession.setCurrentLocale("ru");
	    request.setAttribute("tr8n", tr8nSession);
	    
	    // request.getCookies()
	    
//		if(session.get(USER_KEY) == null) {
//			addActionError(invocation, "You must be authenticated to access this page");
//			return Action.ERROR;
//		}
	
//		invocation.getProxy().getAction();
//		invocation.getProxy().getNamespace();
//		invocation.getProxy().getMethod();
		
	    try {
	    	return invocation.invoke();
	    } finally {
		    if (tr8nSession != null) 
		    	tr8nSession.getApplication().submitMissingTranslationKeys();
	    }
    }
    
}
