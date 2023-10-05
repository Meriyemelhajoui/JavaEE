package com.example.coursejee.Filtres;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "Myservlet" , urlPatterns = {"/Myservlet"})
public class Myservlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       int numero= Integer.parseInt(req.getParameter("NUM"));
       String nom = req.getParameter("NOM");
        PrintWriter out = resp.getWriter();
        out.write("Hello "+ nom + "Vous avez entrez un numero positif ");

    }
}
