package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.annotation.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestServlet extends HttpServlet {

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    Cookie cookie = new Cookie("myname","1234");
    response.addCookie(cookie);
    PrintWriter out = response.getWriter();
    out.println("hello! cookie added.");
  }

}
