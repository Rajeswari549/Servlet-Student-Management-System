package com.vc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Myservlet
 */
@WebServlet("/register")
public class Myservlet extends HttpServlet {
//	this task read the values through the post method 

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h2>welcome to dopost() method</h2>");
		
		String name = request.getParameter("tbname");
		String num = request.getParameter("tbnum");
		out.println(name);
		out.println(num);
	}

}
