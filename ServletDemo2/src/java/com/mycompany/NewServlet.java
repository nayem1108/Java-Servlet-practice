/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import java.util.*;

public class NewServlet implements Servlet{
    ServletConfig conf;

//    the three main methods is here
//    it's called life-cycle
//    1.init() -: type void; when hits url for the first time, this methods is called
//    

    @Override
    public void init(ServletConfig conf){
        this.conf = conf;
        System.out.println("Created........");
        
    }
//    2.service() -: type void; it will be execute,
//    when hits same url more and more from second time
    
    @Override
    public void service(ServletRequest req, ServletResponse resp) throws IOException{
        System.out.println("Running ...........");
        resp.setContentType("text/html");
        PrintWriter display = resp.getWriter();
        String welcome = "<h1>Hello From test-route page</h1>";
        String date = new Date().toString();
        
        display.println("<div style='text-align:center; color:red;'> " + welcome+ "<br>" + date + "</div>");
        
    }
    
//    3.destryo() -: type void; used to destroy 
    @Override
    public void destroy(){
        System.out.println("Destroyed......");
    }
    
//    other's two  methods:- is called non life-cycle methods
//    1. getServletConfig() :- type ServletConfig; return current servlet information
//    2. getServletInfo() :- type String; return a string value
    
    @Override
    public ServletConfig getServletConfig(){
        return this.conf;
    }
    
    @Override
    public String getServletInfo(){
        return "created by:- Nayem Uddin";
    }
}
