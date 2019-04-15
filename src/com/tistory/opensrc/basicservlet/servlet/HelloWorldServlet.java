package com.tistory.opensrc.basicservlet.servlet;

import javax.servlet.http.HttpServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.*;

public class HelloWorldServlet extends HttpServlet {

	/**
	 * serial version id
	 */
	private static final long serialVersionUID = 1974469345581015240L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("hello, world<br/>");
		out.println("method : " + request.getMethod());
		out.println("</html>");
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("hello, world<br/>");
		out.println("method : " + request.getMethod());
		out.println("</html>");
	}
}
