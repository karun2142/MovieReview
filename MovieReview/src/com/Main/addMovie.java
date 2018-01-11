package com.Main;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.Bean.movieBean;
import com.Service.LogginService;

/**
 * Servlet implementation class addMovie
 */
@WebServlet("/addMovie")
public class addMovie extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String mname=request.getParameter("mname");
		String mlang=request.getParameter("mlang");
		String mgenre=request.getParameter("mgenre");
		//String img=request.getParameter("img");
		LogginService ls=new LogginService();
		 InputStream inputStream = null;
		 Part filePart = request.getPart("file");
		 if (filePart != null) {
			 inputStream = filePart.getInputStream();
		 }
		
		/*
		 movieBean mb=new movieBean();
		 mb.setMovieName(mname);
		 mb.setMovieLang(mlang);
		 mb.setMovieGenre(mgenre);
		mb.setIs(inputStream);
		ls.*/
		
		 
	}

}
