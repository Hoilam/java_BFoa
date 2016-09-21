<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<%@taglib uri="/struts-tags" prefix="s"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'findAll.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
     <table>
        <tr>
          <td width="300">ID</td>
          <td width="100">name</td>
          <td width="100">pwd</td>
        </tr>
        <s:iterator value="pv.pageList">
            <tr>
          <td width="300"><s:property value="id"/></td>
          <td width="100"><s:property value="name"/></td>
          <td width="100"><s:property value="pwd"/></td>
        </tr>
        </s:iterator>
     </table>
     <table>
        <tr>
        <td><a href="bf/user_findByPage?page=1">第一页</a></td>
        <td><a href="bf/user_findByPage?page=${pm.previousPageNo}">上一页</a></td>
        <td><a href="bf/user_findByPage?page=${pm.nextPageNo}">下一页</a></td>
        <td><a href="bf/user_findByPage?page=${pm.totalPage}">最后页</a></td>
        </tr>
     </table>
  </body>
</html>
