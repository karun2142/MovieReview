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

import com.Bean.movieBean;
import com.Service.LogginService;

/**
 * Servlet implementation class movie
 */
@WebServlet("/movie")
public class movie extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  HttpSession session =request.getSession();
	  LogginService ls=new LogginService();
	 // try {
		//movieBean mb=ls.fetchMovies();
		//session.setAttribute("movie", mb);
		//RequestDispatcher rs= request.getRequestDispatcher("AddMovie.jsp");
		//rs.forward(request, response);
	 // } catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		//}
		
		List<movieBean> m=null;
		try{
			m=ls.fetchMovies();
		}
		catch(SQLException e){
			e.printStackTrace();
			
		}
		session.setAttribute("movie", m);
		RequestDispatcher dispatcher=request.getRequestDispatcher("movies.jsp");
		dispatcher.forward(request, response);
	
	  
	}

	

}
