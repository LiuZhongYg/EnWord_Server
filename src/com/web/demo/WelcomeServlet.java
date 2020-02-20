package com.web.demo;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by lzy on 2020/2/19.
 */
public class WelcomeServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        OutputStream outputStream= servletResponse.getOutputStream();
        outputStream.write("Welcom EveryOne  ,这是我的第一个web页面".getBytes());

    }
}
