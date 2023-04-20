package com.example.coursejee.Forward;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpClient;
@WebServlet(name = "Redirection2" , urlPatterns = {"/Redirection2"})
// In this second Servlet we are going to do another calculation using the old result
public class Redirection2 extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        int OldResult= (int) req.getAttribute("Firstresultat");
        out.write("The old result : "+ OldResult);
        out.println(" ");
        int NewResult= OldResult*2;
        out.write("The new result : "+ NewResult);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
