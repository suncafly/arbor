package com.suncafly.filter;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

/**
 * ${TODO}
 *
 * @author LiFang
 * @create 2018-07-01 9:22 PM
 */
@Component
public class CommonFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("this is init method");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("####start####");
        filterChain.doFilter(request, response);
        System.out.println("###end###");
    }

    @Override
    public void destroy() {
        System.out.println("this is destroy method");
    }
}
