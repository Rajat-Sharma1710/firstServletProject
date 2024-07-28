package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SquareOfServlet extends HttpServlet {
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		// get the req data which comes from the request of another servlet
//		int resfromPrevServlet = (int) req.getAttribute("sum");
		
		// since we don't get the data from the same request obj
		HttpSession session = req.getSession();
		int sq = (int) session.getAttribute("k");
		
		int result = sq * sq;
		PrintWriter out = res.getWriter();
		out.println("The Square of sum is: " + result);
	}


}
