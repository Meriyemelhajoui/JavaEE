package com.example.coursejee.Cookies;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "AcceuilServlet" ,urlPatterns={"/Acceuil" , "/AcceuilServlet"} )
public class AcceuilServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        Cookie [] cookies= req.getCookies();
        for(Cookie c : cookies){
            if(c.getName().equals("username")){
              out.write("Hello , Your cookie'name : "+ c.getName()+" Your cookie's value : "+ c.getValue());
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
