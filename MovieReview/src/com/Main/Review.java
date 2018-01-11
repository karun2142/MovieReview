package com.Main;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Bean.ReviewBean;
import com.Bean.movieBean;
import com.Service.LogginService;

/**
 * Servlet implementation class Review
 */
@WebServlet("/Review")
public class Review extends HttpServlet {
	
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session =request.getSession();
		  LogginService ls=new LogginService();
           String s=request.getParameter("id");
          // System.out.println(s);
			
			try{
				List<ReviewBean> r=ls.fetchReviews();
				session.setAttribute("review", r);
				if(s.equals("valid")){
					RequestDispatcher dispatcher=request.getRequestDispatcher("validatereview.jsp");
				dispatcher.forward(request, response);}else
				{
					RequestDispatcher dispatcher=request.getRequestDispatcher("reviews.jsp");
					dispatcher.forward(request, response);
				}
			}
			catch(SQLException e){
				e.printStackTrace();
				
			}
			
		
		  
		}
	}


