package com.elite.spring.origin;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by wjc133
 * Date: 2016/8/4
 * Time: 17:20
 */
@Component
public class ForDelegateFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("forDelegateFilter init");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Filter Test");
    }

    @Override
    public void destroy() {
        System.out.println("forDelegateFilter destroy");
    }
}
