package com.example.coursejee.AuthentificationSystem;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "WelcomePage", urlPatterns = {"/WelcomePage"})
public class WelcomPage extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         PrintWriter out = resp.getWriter();
         out.write("Welcome to the Servlet of welcome page ");
        HttpSession session = req.getSession();
        if(session.getAttribute("username") == null){
            resp.sendRedirect("LoginForm.jsp");
        }
        else{
            req.getRequestDispatcher("WelcomeJSPPage.jsp").forward(req,resp);
        }
        // Disable caching
        resp.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1
        resp.setHeader("Pragma", "no-cache"); // HTTP 1.0
        resp.setDateHeader("Expires", 0); // Proxies

    }


}
