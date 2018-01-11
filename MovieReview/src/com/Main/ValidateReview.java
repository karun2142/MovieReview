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
 * Servlet implementation class ValidateReview
 */
@WebServlet("/ValidateReview")
public class ValidateReview extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String movie=request.getParameter("id");
	    ReviewBean r=new ReviewBean(movie);
	    LogginService ls=new LogginService();
	    String valid = "valid";
	    try {
			Boolean b=ls.validateReview(r);
			if(b==true){
				RequestDispatcher dispatcher=request.getRequestDispatcher("Review?id='<%=valid %>'");
				dispatcher.forward(request, response);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
}
