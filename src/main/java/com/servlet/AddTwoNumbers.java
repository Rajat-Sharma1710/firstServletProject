package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/*
 * 1. Servlet class should be identified as class that extends HttpServlet
 * 2. service(req, res) is the method that does the processing with the incoming
 * 	  request and returns the response.
 */
@WebServlet("/add")
public class AddTwoNumbers extends HttpServlet{
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		int first = Integer.parseInt(req.getParameter("num1"));
		int sec = Integer.parseInt(req.getParameter("num2"));
		
		int sum = first + sec;
//		req.setAttribute("sum", sum);
		
		HttpSession session = req.getSession();
		session.setAttribute("k", sum);
		
		// sends the current servlet to another servlet named squ
//		RequestDispatcher obj = req.getRequestDispatcher("sq");
//		obj.forward(req, res);
		
		// send a response back to the client to redirect to a different servlet
		// send the value of sum as a parameter in query string
//		res.sendRedirect("sq?k=" + sum);
		
		res.sendRedirect("sq");
	}

}
