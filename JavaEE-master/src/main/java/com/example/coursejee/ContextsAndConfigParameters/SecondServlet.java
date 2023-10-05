package com.example.coursejee.ContextsAndConfigParameters;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.net.http.HttpClient;


@WebServlet(name = "SecondServlet" , urlPatterns = {"/secondServlet"})
public class SecondServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String paramG= getServletContext().getInitParameter("ParametreGenerale");
        System.out.println("Je suis un parametre general de l app "+ paramG);
    }
}
