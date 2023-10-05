package com.example.coursejee.Filtres;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class MyFilter2 implements Filter {


    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Execution de Pre-Traitement de Filter Empty ");
        HttpServletRequest req= (HttpServletRequest) servletRequest;
        HttpServletResponse res= (HttpServletResponse) servletResponse;
        PrintWriter out = res.getWriter();
        String NumField= req.getParameter("NUM");
        String NameField=req.getParameter("NAME");
        System.out.println("Execution de Traitement de Filter Empty ");
        // NumField==null means that the user didnt visit the form page and try to enter to the servlet Directly , and the NumField.isempty () means that the user visited the Form page and submit the form with an empty fields
        if( (NumField==null || NumField.isEmpty()) && (NameField==null || NameField.isEmpty())){
            out.write("Please Fill the inputs Before Submetting ! ");
        } else {
            filterChain.doFilter(req,res);
        }
        System.out.println("Execution de Post-Traitement  FilterEmpty ");

    }
}
