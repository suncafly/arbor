package com.suncafly.filter;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

/**
 * 自定义Filter继承Filter
 * 启动时使用@Component注入到容器中
 * @author LiFang
 * @create 2018-07-01 9:22 PM
 */

@Component
public class CommonFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("CommonFilter init method");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("CommonFilter doFilter start");
        filterChain.doFilter(request, response);
        System.out.println("CommonFilter doFilter end");
    }

    @Override
    public void destroy() {
        System.out.println("CommonFilter destroy method");
    }
}
