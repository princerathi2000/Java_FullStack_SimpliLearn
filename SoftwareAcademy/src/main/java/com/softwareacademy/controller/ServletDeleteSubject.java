package com.softwareacademy.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.softwareacademy.service.SubjectServiceImpl;

 
public class ServletDeleteSubject extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer sid=Integer.parseInt(request.getParameter("subjectid"));
		new SubjectServiceImpl().deleteSubject(sid); 		
		System.out.println("Deleted Successfully");
	} 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 		doGet(request, response);
	}

}
