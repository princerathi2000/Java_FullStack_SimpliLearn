package com.softwareacademy.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.softwareacademy.service.ClassesServiceImpl;

 
public class ServletDeleteClasses extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer cid=Integer.parseInt(request.getParameter("classid"));
		new ClassesServiceImpl().deleteClasses(cid); 		
		System.out.println("Deleted Successfully");
	}
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 		doGet(request, response);
	}

}
