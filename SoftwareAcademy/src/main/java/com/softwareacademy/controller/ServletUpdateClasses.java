package com.softwareacademy.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.softwareacademy.service.ClassesServiceImpl;

 
public class ServletUpdateClasses extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		Integer cid=Integer.parseInt(request.getParameter("classid"));
		String cname=request.getParameter("classname");
		
		new ClassesServiceImpl().updateClasses(cid,cname); 
	}
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 		doGet(request, response);
	}

}
