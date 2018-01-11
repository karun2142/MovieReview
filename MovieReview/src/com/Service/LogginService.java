package com.Service;

import java.sql.SQLException;
import java.util.List;

import com.Bean.ReviewBean;
import com.Bean.ReviewBean;
import com.Bean.movieBean;
import com.Bean.userDetails;
import com.DAO.ValidateDAO;

public class LogginService {
     
	public Boolean validate(userDetails u) throws SQLException{
		
		ValidateDAO vd=new ValidateDAO();
		Boolean b=vd.verify(u.getuName(),u.getuPass());
		if(b){
         return true;		
		}else{
			return false;
		}
		
	}
	
	public List<movieBean> fetchMovies() throws SQLException{
		ValidateDAO vd=new ValidateDAO();
		List<movieBean> mb=vd.fetch();
		return mb;
	}
	
	public Boolean setMovie(){
		ValidateDAO vd=new ValidateDAO();
		
		
		return null;
		
	}
	public Boolean setReview(ReviewBean r) throws SQLException{
		ValidateDAO vd=new ValidateDAO();
		Boolean b=vd.setReviewDao(r);
		return b;
	}
	
	public List<ReviewBean> fetchReviews() throws SQLException{
		ValidateDAO vd=new ValidateDAO();
		List<ReviewBean> rr=vd.fetchreview();
		return rr;
		
	}
	
	public Boolean validateReview(ReviewBean r) throws SQLException{
		ValidateDAO vd=new ValidateDAO();
		Boolean b=vd.validateReviewDAO(r);
		return b;
	}
	
	
	
}
