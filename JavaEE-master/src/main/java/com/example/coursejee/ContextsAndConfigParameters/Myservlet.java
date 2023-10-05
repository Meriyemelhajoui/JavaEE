package com.example.coursejee.ContextsAndConfigParameters;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;


public class Myservlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String par1= getServletConfig().getInitParameter("Config Parameter");
        String par2= getServletConfig().getInitParameter("ConfigParameter2");
        System.out.println("Je suis le parametre de configuration : " + par1);
        System.out.println("");
        System.out.println("Je suis le parametre 2 de configuration : " + par2);
        String paramG= getServletContext().getInitParameter("ParametreGenerale");
        System.out.println("Je suis un parametre general de l app"+ paramG);

    }
}
