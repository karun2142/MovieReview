package com.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.Bean.ReviewBean;
import com.Bean.movieBean;
import com.Bean.userDetails;

public class ValidateDAO {
	public static final String db_url="jdbc:oracle:thin:@localhost:1521:xe";
    public static final String usrid="hr";
    public static final String password="hr";
    Connection conn=null;
    public Connection getConnection(){
   	 Connection con=null;
   	 try {
    	  	Class.forName("oracle.jdbc.OracleDriver");
    	  	con=DriverManager.getConnection(db_url,usrid,password);
    	  	//Statement statement=conn.createStatement();
    	  	}
   	 catch(SQLException e){
      		 e.printStackTrace();
      	}
      	catch(ClassNotFoundException e){
      		e.printStackTrace();
      	}
		return con;
   }
    public Boolean verify(String uname,String upass) throws SQLException{
   	 conn=getConnection();
   	 PreparedStatement ps=conn.prepareStatement("Select * from  UserDetails where name=? and password=?");
		 ps.setString(1,uname);
		 ps.setString(2,upass);
		 
		 ResultSet rs=ps.executeQuery();
		 
   	 if(rs.next()){
     /*String uName=rs.getString(1);
     String uPass=rs.getString(2);
     String uEmail=rs.getString(3);
     long ucon =rs.getLong(4);
   */userDetails ud=new userDetails(rs.getString(1),rs.getString(2),rs.getString(3),rs.getLong(4));
   
       return true;
   		 
   	 }else{
   		 return false;
   	 }
   	 
   	 
   	 
		
    }
    
    
    public List<movieBean> fetch() throws SQLException{
    	conn=getConnection();
    	List<movieBean> listmovie=new ArrayList<movieBean>();
    	
    	String sql="Select * from movies";
    	Statement stmt=conn.createStatement();
    	ResultSet rs=stmt.executeQuery(sql);
    	while(rs.next()){
    		String name=rs.getString(1);
    		String genre=rs.getString(2);
    		String lang=rs.getString(3);
    		//String review=rs.getString(4);
    		movieBean mb=new movieBean(name,genre,lang);
    		listmovie.add(mb);
    	}
    		return listmovie;
    	}
    	
    	 public Boolean setReviewDao(ReviewBean r) throws SQLException{
    		 conn=getConnection();
    		 PreparedStatement ps=conn.prepareStatement("Insert into review values(?,?,'no')");
    		 ps.setString(1,r.getMovieName());
    		 ps.setString(2,r.getReview());
    	Boolean b=ps.execute();
    	return b;
    		
    	 }
    	 public List<ReviewBean> fetchreview() throws SQLException{
    		    conn=getConnection();
    	    	List<ReviewBean> listreview=new ArrayList<ReviewBean>();
    	    	String sql="Select * from review ";
    	    	Statement stmt=conn.createStatement();
    	    	ResultSet rs=stmt.executeQuery(sql);
    	    	while(rs.next()){
    	    		String moviename=rs.getString(1);
    	    		String review=rs.getString(2);
    	    		String status=rs.getString(3);
    	         ReviewBean rr=new ReviewBean(moviename,review,status);
    	    		listreview.add(rr);
    	    	}
    	    		return listreview;
    	    		
    	    	}
    	    	
    	  public Boolean validateReviewDAO(ReviewBean r) throws SQLException{
    		  conn=getConnection();
    		 
    		  PreparedStatement ps=conn.prepareStatement("update review set status='yes' where moviename=?");
    		  ps.setString(1,r.getMovieName());
    		  Boolean b=ps.execute();
    		  return b;
    	  }
    	  public Boolean setMovieDao(movieBean m) throws SQLException{
     		 conn=getConnection();
     		 PreparedStatement ps=conn.prepareStatement("Insert into review values(?,?,?)");
     		 ps.setString(1,m.getMovieName());
     		ps.setString(2,m.getMovieGenre());
     		ps.setString(3,m.getMovieLang());
     		boolean b=ps.execute();
			return b;
     		 
}
}
    	
    
    
    
    
    
    
    
    
    
    
    

