<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>My JSP'EditEmp.jsp' starting page</title>
	<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="utf-8">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

</head>
<body>
	<div id="addemp">
	<center>
		<fieldset>
		<legend>编辑员工信息</legend>
			<form method="post" action="" id="form1" name="form1">
				<ul>
					
				
				
				</ul>
			
			</form>
		
		
		</fieldset>
	</center>
	</div>
</body>
</html>