package com.example.coursejee.Cookies;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
@WebServlet(name = "HomeServlet" , urlPatterns = {"/HomeServlet"})
public class HomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username= req.getParameter("Username");
        String password= req.getParameter("Password");
        // We gonna Create cookie//
        Cookie c = new Cookie("username",username);
        // We gonne set it to the response object  //
        resp.addCookie(c);
        // redirection client side  //
        resp.sendRedirect("AcceuilServlet");
    }
}
