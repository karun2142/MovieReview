package com.Bean;

public class userDetails {
  private String uName;
  private String uPass;
  private String uEmail;
  private Long uCon;
  
  public userDetails(){
	  
  }
public userDetails(String uName, String uPass, String uEmail, Long uCon) {
	super();
	this.uName = uName;
	this.uPass = uPass;
	this.uEmail = uEmail;
	this.uCon = uCon;
}
public String getuName() {
	return uName;
}
public void setuName(String uName) {
	this.uName = uName;
}
public String getuPass() {
	return uPass;
}
public void setuPass(String uPass) {
	this.uPass = uPass;
}
public String getuEmail() {
	return uEmail;
}
public void setuEmail(String uEmail) {
	this.uEmail = uEmail;
}
public Long getuCon() {
	return uCon;
}
public void setuCon(Long uCon) {
	this.uCon = uCon;
}
  
}
