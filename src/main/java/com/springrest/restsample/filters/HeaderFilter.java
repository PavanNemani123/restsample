package com.springrest.restsample.filters;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class HeaderFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) servletRequest;

        System.out.println("request servlet path"+req.getServletPath());

        if(!req.getServletPath().contains("api")){
            System.out.println("test achieved");
        }
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
