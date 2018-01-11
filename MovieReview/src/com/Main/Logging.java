package com.Main;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Bean.userDetails;
import com.Service.LogginService;

/**
 * Servlet implementation class Logging
 */
@WebServlet("/Logging")
public class Logging extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		PrintWriter ps=response.getWriter();
		
		HttpSession session=request.getSession();
		String uname=request.getParameter("uname");
		String upass=request.getParameter("upass");
		
		userDetails ud=new userDetails();
		ud.setuName(uname);
		ud.setuPass(upass);
		LogginService ls;
		
		
		try {
			ls = new LogginService();
		Boolean b=ls.validate(ud);
			if(uname.equals("admin")&&upass.equals("admin")){
				//ps.println("login successful");
				RequestDispatcher rs= request.getRequestDispatcher("Home1.jsp");
				rs.forward(request, response);
			
			}else if(b){
				session.setAttribute("name", uname);
				RequestDispatcher rs= request.getRequestDispatcher("Home2.jsp");
				rs.forward(request, response);
				
				
			}else{
				response.sendRedirect("Login.jsp?msg='LoginFailed'");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
