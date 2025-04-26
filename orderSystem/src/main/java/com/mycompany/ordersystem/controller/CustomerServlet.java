package com.mycompany.ordersystem.controller;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

@WebServlet(
        name = "customerServlet",
        urlPatterns = {"/customer"},
        loadOnStartup = 1,
        initParams = {
                @WebInitParam(name = "driverClassName", value = "com.mysql.jdbc.Driver"),
                @WebInitParam(name = "url", value = "jdbc:mysql://localhost:3306/order_system"),
                @WebInitParam(name = "username", value = "realdev"),
                @WebInitParam(name = "password", value = "1234")
        }

)
public class CustomerServlet extends HttpServlet {

    private String driverClassName = null;
    private String url = null;
    private String username = null;
    private String password = null;

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println(config.getServletName() + " 서블릿이 시작되었습니다.");
        driverClassName = config.getInitParameter("driverClassName");
        url = config.getInitParameter("url");
        username = config.getInitParameter("username");
        password = config.getInitParameter("password");
    }

    @Override
    public void destroy() {
        System.out.println("서블릿이 종료되었습니다.");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("CustomerServlet.doPost");

        String name = request.getParameter("name");
        String address = request.getParameter("address");
        String email = request.getParameter("email");
        System.out.printf("이름 : %s, 주소 : %s, 이메일 : %s 고객이 등록되었습니다.\n", name, address, email);

        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        PrintWriter writer = response.getWriter();
        writer.append("<!DOCTYPE html>\n")
                .append("<html>\n")
                .append("<head>\n")
                .append("<meta charset=\"utf-8\"/>\n")
                .append("<title>고객 등록 정보</title>\n")
                .append("</head>\n")
                .append("<body>\n")
                .append("<h1>고객 등록 정보</h1>\n")
                .append("이름 : ").append(name).append("<br>\n")
                .append("주소 : ").append(address).append("<br>\n")
                .append("이메일 : ").append(email).append("<br>\n")
                .append("<p>\n")
                .append("<a href=\"customer\">고객정보 입력</a>\n")
                .append("<h3>데이터베이스 설정</h3>\n")
                .append("driverClassName : " )
                .append(driverClassName).append("<br/>\n")
                .append("url : ").append(url).append("<br/>\n")
                .append("username : ").append(username).append("<br/>\n")
                .append("password : ").append(password).append("<br/>\n")
                .append("</body>\n")
                .append("</html>");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("CustomerServlet.doGet");

        for(Enumeration<String> e = request.getHeaderNames(); e.hasMoreElements();) {
            String header = e.nextElement();
            System.out.println(header + " : " + request.getHeader(header));
        }

        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
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
