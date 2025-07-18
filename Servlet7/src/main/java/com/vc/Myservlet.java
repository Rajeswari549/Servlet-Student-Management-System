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
@WebServlet("/result")
public class Myservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String M = request.getParameter("maths");    
	   	int math = Integer.parseInt(M);              //HERE CONVERTING STRING TO INTEGER                               
		                                  
		String P = request.getParameter("physics");   
		int phy = Integer.parseInt(P);
		
		String C = request.getParameter("chemistry");
		int che = Integer.parseInt(C);
		
//		PERCENTAGE
		 float per=((math+phy+che)/300.0f)*100;
		 String grade=null;
		 
		 if(per>=60)
		 {
			 grade="first calss";
		 }
		 else if(per>=35)
		 {
			 grade="second class";
		 }else
		 {
			 grade="fail";
		 }
		 
		 request.setAttribute("percentage", per);   //by using setattribute we can set the values and it will take 2 input strings  1.stringname 2.reference
		 request.setAttribute("grade", grade);
		 
		 RequestDispatcher dispatcher = request.getRequestDispatcher("result.jsp");   //by using we can redirect from one to another page
		 dispatcher.forward(request, response);    //it will take all previous requests and all resonses from ths to next page
		 
	}

}
