package com.example.coursejee.Filtres;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;


public class MyFilter implements Filter {

//    @Override
//    public void init(FilterConfig filterConfig) throws ServletException {
//        System.out.println("Init is called ");
//    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain Chain) throws IOException, ServletException {
        ////////////////// Pre-traitement /////////////////

        System.out.println("Execution des instructions PreTraitement de Filtre  ");
        HttpServletRequest req= (HttpServletRequest) servletRequest;
        HttpServletResponse res = (HttpServletResponse) servletResponse;
        PrintWriter out = res.getWriter();


                ////////////// traitement   //////////////
        System.out.println("Execution des instructions Traitement de filtre  ");
         int num = Integer.parseInt(req.getParameter("NUM"));
         if(num > 0){
            Chain.doFilter(req,res);
         }
         else {
             out.write("Please Try to Enter a positive Number ! ");
         }



        //////////////////// Post -traitement //////////
        System.out.println("Execution des instructions Post Traitement de Filter ");

    }

}





//    @Override
//    public void destroy() {
//        System.out.println("Destroy is called ");
//    }
//}
