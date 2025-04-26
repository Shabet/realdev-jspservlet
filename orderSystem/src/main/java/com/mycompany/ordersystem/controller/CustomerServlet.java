package com.mycompany.ordersystem.controller;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "customerServlet", urlPatterns = {"/customer"}, loadOnStartup = 1)
public class CustomerServlet extends HttpServlet {

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println(config.getServletName() + " 서블릿이 시작되었습니다.");
    }

    @Override
    public void destroy() {
        System.out.println("서블릿이 종료되었습니다.");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("CustomerServlet.doGet");
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        writer.append("<!DOCTYPE html>\n")
                .append("<html>\n")
                .append("<head>\n")
                .append("<meta charset=\"utf-8\"/>\n")
                .append("<title>고객 정보 입력</title>\n")
                .append("</head>\n")
                .append("<body>\n")
                .append("<h3>고객 정보 입력</h3>\n")
                .append("<fieldset>\n")
                .append("<form action=\"customer\" method=\"POST\">\n")
                .append("<label for=\"name\">이름 : </label>\n")
                .append("<input type=\"text\" name=\"name\" /> <br>\n")
                .append("<label for=\"address\">주소 : </label>\n")
                .append("<input type=\"text\" name=\"address\" /> <br>\n")
                .append("<label for=\"email\">이메일 : </label>\n")
                .append("<input type=\"text\" name=\"email\" /> <br>\n")
                .append("<input type=\"submit\" value=\"저장\"/>\n")
                .append( "</form>\n")
                .append("</fieldset>\n")
                .append("</body>\n")
                .append("</html>");
    }
}
