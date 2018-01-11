<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.*" %>
    <%@page import="com.Bean.ReviewBean" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>LIST OF REVIEWS</h1>
<h1>
<div align="center">
<table border="1" cellpadding="5">
<tr>
         <th>movieName</th>
         <th>Review</th>
         </tr>
         <%
         List<ReviewBean> listreview=(List<ReviewBean>)session.getAttribute("review");
         for(ReviewBean review:listreview){
         %>
<tr>
 <td><%=review.getMovieName()%></td>
 <td><%=review.getReview()%></td>
 
</tr>
<%} %>
<div/>
</table>
</h1>
</body>
</html>