package com.Bean;

import java.io.InputStream;
import java.sql.Blob;

public class movieBean {
  
	private String movieName;
	private String movieGenre;
	private String movieLang;
	private String Review;
	private Blob is;
	
	
	
	public Blob getIs() {
		return is;
	}
	public void setIs(Blob is) {
		this.is = is;
	}
	
	public movieBean(String movieName, String movieGenre, String movieLang, String review) {
		super();
		this.movieName = movieName;
		this.movieGenre = movieGenre;
		this.movieLang = movieLang;
		this.Review = review;
	}
	
	
	
	
	public movieBean(String movieName, String movieGenre, String movieLang) {
		super();
		this.movieName = movieName;
		this.movieGenre = movieGenre;
		this.movieLang = movieLang;
	}
	public movieBean() {
		// TODO Auto-generated constructor stub
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMovieGenre() {
		return movieGenre;
	}
	public void setMovieGenre(String movieGenre) {
		this.movieGenre = movieGenre;
	}
	public String getMovieLang() {
		return movieLang;
	}
	public void setMovieLang(String movieLang) {
		this.movieLang = movieLang;
	}
	public String getReview() {
		return Review;
	}
	public void setReview(String review) {
		Review = review;
	}


}
