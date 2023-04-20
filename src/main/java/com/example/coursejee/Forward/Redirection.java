package com.example.coursejee.Forward;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet( name = "Redirection" , urlPatterns = {"/Redirection","/java"})
public class Redirection extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        // getting paramters from the form
        int numero1= Integer.parseInt(req.getParameter("number1"));
        int numero2= Integer.parseInt(req.getParameter("number2"));
        int Firstresultat=numero1+numero2;
        out.write("Le resultat est : " + Firstresultat);

        //  Stock the old value on the request
        req.setAttribute("Firstresultat",Firstresultat);
        // RequestDispatcher // Redirection in the server side we send the req/resp objects
        req.getRequestDispatcher("Redirection2").forward(req,resp);
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
