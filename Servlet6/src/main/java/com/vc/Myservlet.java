package com.vc;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Myservlet
 */
@WebServlet("/hitme")
public class Myservlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		read index.html page controls data
//		String name = request.getParameter("tbname");
//		String num = request.getParameter("tbnum");
		
		RequestDispatcher res = request.getRequestDispatcher("result.jsp");
		res.forward(request, response);
	}

}
