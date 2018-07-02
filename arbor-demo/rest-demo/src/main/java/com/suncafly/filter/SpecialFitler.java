package com.suncafly.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * ${TODO}
 *
 * @author LiFang
 * @create 2018-07-01 9:27 PM
 */
public class SpecialFitler implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println(" this is SpecialFitler init method");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("#### start SpecialFitler####");
        filterChain.doFilter(request, response);
        System.out.println("### end SpecialFitler###");
    }

    @Override
    public void destroy() {
        System.out.println("this is SpecialFitler destroy method");
    }
}
