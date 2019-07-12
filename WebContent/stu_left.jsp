<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<style>
	ul{	list-style:none;}
	ul li{
		margin:10px;
		padding:10px;
			}
</style>
<body>
	<!-- target="mainFrame"必须加上去,不然就在当页显示(也就是在左边显示)-->
	<ul>
		<li><a href="stu_select.jsp"  target="mainFrame">查询学生信息</a></li>
		<li><a href="stu_insert.jsp"  target="mainFrame">添加学生信息</a></li>
		<li><a href="stu_delete.jsp"  target="mainFrame">删除学生信息</a></li>	
		<li><a href="stu_update.jsp"  target="mainFrame">修改学生信息</a></li>
	</ul>
</body>
</html>