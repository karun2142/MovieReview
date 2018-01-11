package com.Bean;

public class ReviewBean {
	private String movieName;
	private String review;
	private String status;
	public ReviewBean(){
		
	}
	public ReviewBean(String movieName) {
		super();
		this.movieName = movieName;
	}

	public ReviewBean(String movieName, String review) {
		super();
		this.movieName = movieName;
		this.review = review;
	}
	public ReviewBean(String movieName, String review, String status) {
		super();
		this.movieName = movieName;
		this.review = review;
		this.status = status;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	

}
