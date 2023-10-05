package com.example.coursejee.SendRedirection;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "Redir1" , urlPatterns = {"/Redir1"})
public class Redir1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        int n1 = Integer.parseInt(req.getParameter("number1"));
        int n2 = Integer.parseInt(req.getParameter("number2"));
        int result = n1+n2;
        // Redirection in the client Side , it will be Shown to the user (URL)
        resp.sendRedirect("Redir2?result= " + result); //URL Rewriting the only way to recover the old value because we are not sending the old objects of req and resp
    }
}
