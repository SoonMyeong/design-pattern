package com.soon.design._13_chain_of_responsibilities._03_java;

import javax.servlet.*;
import java.io.IOException;

//책임연쇄 패턴의 예 (서블릿 필터)
public class CoRInJava {

    public static void main(String[] args) {
        Filter filter = new Filter() {
            @Override
            public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
                chain.doFilter(request,response);
            }
        };
    }
}
