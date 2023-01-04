/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.logincompany;
import java.io.IOException;
import javax.servlet.*;

/**
 *
 * @author nayem
 */
public class login implements Servlet{
    
    ServletConfig config;
    @Override
    public void init(ServletConfig config){
        this.config = config;
    }
    
    @Override
    public void service(ServletRequest req, ServletResponse response) throws ServletException,IOException{
        System.out.println("Hello from service...");
    }
    
    @Override
    public void destroy(){
        System.out.println("This is destroy function");
    }
    
    @Override
    public ServletConfig getServletConfig(){
        return this.config;
    }
    
    @Override
    public String getServletInfo(){
        return "Nayem Uddin";
    }
    
}
