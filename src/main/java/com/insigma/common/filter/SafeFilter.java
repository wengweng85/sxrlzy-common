package com.insigma.common.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * 网站安全过滤器
 * 1.是否登录过滤
 * 2 csrf referer 过滤
 * 3 xss及sql注入过滤
 *
 */
public class SafeFilter implements javax.servlet.Filter {

    Log log= LogFactory.getLog(SafeFilter.class);

    private String []  ignorurlpattern;

    @Override
    public void destroy() {
        // TODO Auto-generated method stub

    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    	String pattens=filterConfig.getInitParameter("ignorurlpattern");
    	if(pattens!=null){
    		ignorurlpattern=pattens.split(",");
    	}
    }

	@Override
	@SuppressWarnings("unused")
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
       
        boolean isignore=false;
        String requesturi=request.getRequestURI();
        if(ignorurlpattern!=null&&!ignorurlpattern.equals("")){
        	 for(int i=0;i<ignorurlpattern.length;i++){
                 if(requesturi.matches(ignorurlpattern[i])){
                	 isignore=true;
               	     break;
                 }
           }
        }
        
        /**
         * xss及sql注入过滤
         **/
        //是否忽略校验
        if(isignore){
        	filterChain.doFilter(servletRequest, servletResponse);
        }else{
    	    SafeFilterHttpServletRequestWrapper safeRequest = new SafeFilterHttpServletRequestWrapper(request);
    	    filterChain.doFilter(safeRequest, servletResponse);
        }
    }

}
