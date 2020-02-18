/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.ensup.SERVLET;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author lorris
 */
@WebServlet("/MyExampleSERVLET")
public class MyExampleSERVLET extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        System.out.println("******************************************");
        System.out.println(request.getMethod());
        System.out.println(request.getAuthType());
        System.out.println(request.getPathInfo());
        System.out.println(request.getClass());
        System.out.println(request.getLocalName());
        System.out.println(request.getLocalPort());
        System.out.println(request.getUserPrincipal());
        System.out.println(request.getCharacterEncoding());
        System.out.println(request.getHeaderNames());
        System.out.println(request.getProtocol());
        System.out.println("******************************************");
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("******************************************");
        System.out.println(request.getMethod());
        System.out.println(request.getAuthType());
        System.out.println(request.getPathInfo());
        System.out.println(request.getClass());
        System.out.println(request.getLocalName());
        System.out.println(request.getLocalPort());
        System.out.println(request.getUserPrincipal());
        System.out.println("******************************************");
        
        
         
    }

   

}
