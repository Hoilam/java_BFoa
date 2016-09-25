<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'employeeManage.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script type="text/javascript" src="web/js/jquery-1.4.2.js"></script>
	<script type="text/javascript">
	   function t_test() {
		   var pid = $('#s1').val();
		   var url = "bfdep/dep.action?pid="+pid;
		   
		   $.get(url,null,function(data){
			   var dom = data.getElementsByTagName("subDep");
			   var s2 = document.getElementById("s2");
			   t_clear();
			   for(i=0;i<dom.length;i++) {
				   var dep_name = (dom[i].getElementsByTagName("subDep-name")[0]).firstChild.data;
				   var dep_id = (dom[i].getElementsByTagName("subDep-id")[0]).firstChild.data;
				   s2[i] = new Option(dep_name,dep_id);
			   }
		   });
	   }
	   function t_clear() {
		   var s2 = document.getElementById("s2");
		   var sLength = s2.length;
		   for(i=0;i<sLength;i++) {
			   s2.options[i] = null;
		   }
	   }
	</script>
	
	
	
	
	
	
	<style type="text/css">
			body{background-color:#FFFFFF;}
			.button{
			cursor:pointer;
			background-image:url(web/imgs/button_normal.jpg);
			width:102px;
			height:35px; 
			border:0px solid #fff;
			line-height:35px
		}
		a{ font-size:12px; text-decoration:none;COLOR: #3443ad;}
		a:hover{font-size:12px; text-decoration:underline;COLOR: #3443ad;}
			.item
			{
					COLOR: #3443ad;
					FONT-FAMILY: 宋体;
					FONT-SIZE: 12px;
			}
			.th_1{ font-weight: bold;}
		#addemp,#emplist{margin-left:auto; margin-right:auto; width:550px;}
		fieldset{width:99%;}
		#emplist  td{font-size:12px;COLOR: #3443ad;}
		#emplist  table,#deptlist  td{border:#ccc 1px solid;border-collapse: collapse; }   
		#emplist  input{border:#333333 1px solid;}
		#emplist  .style_box{border-width: 0px; height:18px;}
		
		#addemp UL {
				CLEAR:left;
				BORDER:0px;PADDING: 0px;
				DISPLAY: inline;
				MARGIN: 0px;
				LIST-STYLE-TYPE: none;
				TEXT-ALIGN: left;
			}
		#addemp UL li{ list-style:none;TEXT-ALIGN: left; float:left; margin-left:0px;margin-top:5px;}
		#addemp label{float:left;display: block;width:80px; margin:0px; text-align: right;border:#333 0px solid;font-size:12px;COLOR: #3443ad;}
		#addemp input{border:#A4B97F 1px solid; margin:0px;}
		#addemp .style_box{border-width: 0px; height:18px;}
		#addemp .input_r{background-color: #f1f1f1;}
		#addemp span{font-size:12px;COLOR: #3443ad;}
		legend{ font-size:12px;}
		select{width: 150px;}
		form{ display:inline ; padding:0px ; margin:0px;}
		.button{
			cursor:pointer;
			background-image:url(web/imgs/button_normal.jpg);
			width:102px;
			height:35px; 
			border:0px solid #fff;
			line-height:35px
		}
			</style>
			<script type="text/javascript">
		function buttonNormal(obj){
			obj.style.backgroundImage= "url('web/imgs/button_normal.jpg')";
		}
		
		function buttonHover(obj){
			obj.style.backgroundImage="url('web/imgs/button_hover.jpg')";
		}
	</script>

  </head>
  
  <body>
<center>

<div id="emplist">
<form action="" method="post">
  <table width="550" height="30" border="1" align="center" cellpadding="0" cellspacing="0" >
  <tr>
    <td align="center"  width="40" height="25" class="th_1">序号</td>      
    <td align="center"  width="80" height="25" class="th_1">员工编号</td>
    <td align="center"  width="80" height="25" class="th_1">员工姓名</td>
    <td align="center"  width="40" height="25" class="th_1">性 别</td>
	<td align="center"  width="80" height="25" class="th_1">所属部门</td>
	<td align="center"  width="*" height="25" class="th_1">所任职务</td>
	<td align="center"  width="40" height="25" class="th_1">选择</td>
	<td align="center"  width="50" height="25" class="th_1">操作</td>

  </tr>
  	 <tr>
	    <td align="center" height="25">1</td>
	    <td>emp201001</td>
	    <td>张三</td>
	    <td>女</td>
		<td>教职部</td>
		<td>班主任</td>
		<td><input type="checkbox" class="style_box" /></td>
		<td><a href="editEmployee.html">详细</a></td>
     </tr>
  
  	 <tr>
	    <td align="center" height="25">1</td>
	    <td>emp201002</td>
	    <td>李四</td>
	    <td>男</td>
		<td>教职部</td>
		<td>教师</td>
		<td><input type="checkbox"  class="style_box"/></td>
		<td><a href="editEmployee.html">详细</a></td>
     </tr>
	 <tr><td colspan="8" align="right"><input type="checkbox" class="style_box"/>全选/取消&nbsp;&nbsp;<input type="submit" value="删除信息"   onmouseover="buttonHover(this)" onmouseout="buttonNormal(this)" class="button" style="border:0px solid #fff;"  onclick="alert('删除成功');return false;" />&nbsp;</td></tr>
</table>
</form>
	<center>
		 
         
            <a href="#">首页</a>
         
         
         
         
         
            
              <font color="red" class="item">1</font>
            
            
             
         
         
         
            
            
            <a href="#">2</a>
            
             
         
         
         
            <a href="#">后页</a>
         
         
            <a href="#">尾页</a>
         
      
		</center>
	</div>
	<Br /><br />
	<div id="addemp">
	<center>
<fieldset>
<legend>添加员工信息</legend>
		<form method="POST" action="" id="form1" name="form1">

		    <ul>
				<li><label>账&nbsp;&nbsp;号：</label><input type="text" name="loginName" value="" readonly="readonly" disabled="disabled" class="input_r"></li>
				<li lass="left"><label>密&nbsp;&nbsp;码：</label><input type="text" name="loginPwd" value="" readonly="readonly" disabled="disabled" class="input_r"></li>
				<li><label>员工编号：</label><input type="text" name="empNo" value=""></li>
				<li><label>员工姓名：</label><input type="text" name="empName" value=""></li>
				<li><label>所属部门：</label>
				    <select name="parentDep" id="s1" onchange="t_test()">
				     <option value="请选择">--请选择--</option>
				     <s:iterator value="#request.deps">
				     <option value='<s:property value="dep_id"/>'><s:property value="dep_name"/></option>
				     </s:iterator>
				    </select>
				</li>
				<li><label>子部门：</label>
				 <select name="subDep" id="s2">
				 <option value="请选择">--请选择--</option>
				    </select>
				</li>
				<li><label>所任职务：</label><input type="text" name="job" value=""></li>
				<li><label>联系电话：</label><input type="text" name="phone" value=""></li>
				<li><label>现所在住址：</label><input type="text" name="address" value="" maxlength="120" style="width:400px;"></li>
				 <li><label>性  别：</label><input type="text" name="sex" value=""></li>
				<li style="width:100%;text-align:center;"><input type="submit" name="cmdSave" value="添 加"  onmouseover="buttonHover(this)" onmouseout="buttonNormal(this)" class="button" style="border:0px solid #fff;" onclick="alert('添加成功');return false;"></li>
			</ul>

				</form>
				</fieldset>
				<br />
<fieldset>
<legend>查找员工</legend>
<form method="POST" action="" id="form1" name="form1">
<input type="radio" class="style_box" name="radio1" /><span>按编号查询</span>&nbsp;&nbsp;<input type="radio" class="style_box" checked="checked" name="radio1" /><span>按姓名查询</span><br /><Br />
<div style=" margin-left:70px;text-align:left"><label for="keywords" style="margin-top:12px;">查询条件：</label><input type="text" id="keywords" name="keywords" style="width:200px; height:25px;" /> <input type="submit" value="提交查询" class="button" style="border:0px solid #fff;"   onmouseover="buttonHover(this)" onmouseout="buttonNormal(this)" onClick="return false;" /><div>
</form>
</fieldset>
				</center>
	</div>
	</body>
</html>