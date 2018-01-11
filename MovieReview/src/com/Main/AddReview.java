package com.Main;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Bean.ReviewBean;
import com.Service.LogginService;

/**
 * Servlet implementation class AddReview
 */
@WebServlet("/AddReview")
public class AddReview extends HttpServlet {
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String movieName=request.getParameter("movieName");
		String review=request.getParameter("review");
		
		ReviewBean r=new ReviewBean(movieName, review);
		LogginService ls=new LogginService();
		try {
			Boolean b=ls.setReview(r);
			if(b==true){
				RequestDispatcher rs=request.getRequestDispatcher("Home2.jsp");
				rs.forward(request,response);
				
			}else{
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
