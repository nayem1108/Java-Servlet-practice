/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.*;


public class FirstServlet implements Servlet{
    ServletConfig conf;
    
//    servlet lifecycle methods
    @Override
    public void init(ServletConfig conf){
        this.conf = conf;
        System.out.println("Hey Starting servlet here. creating servlet here");
        
    }
    
    @Override
    public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException{
        System.out.println("Servicing on your request");
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        String grettings = "<h1>Hello Dear ! Pray for me please.</h1>";       
        String date = "<h1>Current time is </h1>";
        
        String strDate = new Date().toString();

        out.println(grettings);  
        out.println(date  + strDate);
        
        out.println(strDate.charAt(0));
        
        String[] str = strDate.split(" ");
        out.println("<br>");
        
        for (String str1 : str) {
            out.println(str1 + "<br>");
        }

    }
    
    @Override
    public void destroy(){
        System.out.println("Destroyed your request");
    }
    
//    these three methods are the main methods 
    
//    non life-cycle methods
    @Override
    public ServletConfig getServletConfig(){
        return this.conf;
    }
    
    @Override
    public String getServletInfo(){
        return "This servlet is created by Nayem Uddin.";
    }
}
