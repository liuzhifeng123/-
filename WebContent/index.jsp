<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<frameset rows="125,600,200" frameborder="1">
  <frame src="stu_top.jsp" name="topFrame" scrolling="no" noresize>
  <frameset cols="249,*" frameborder="1" >
  	  <frame src="stu_left.jsp" name="leftFrame" scrolling="no" noresize>
   	  <frame src="stu_right.jsp" name="mainFrame">
  </frameset>
  	  <frame src="stu_botton.jsp" name="footFrame" scrolling="no" noresize>  
</frameset>
</html>