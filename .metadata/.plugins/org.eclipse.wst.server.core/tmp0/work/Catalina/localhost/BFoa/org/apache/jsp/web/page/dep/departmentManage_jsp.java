/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.36
 * Generated at: 2016-09-22 14:57:30 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.web.page.dep;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.bf.po.dep.Department;

public final class departmentManage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.bf.po.dep.Department");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("    \r\n");
      out.write("    <title>My JSP 'departmentManage.jsp' starting page</title>\r\n");
      out.write("    \r\n");
      out.write("\t<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"expires\" content=\"0\">    \r\n");
      out.write("\t<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("\t<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"web/css/reset.css\" />\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"web/css/mainstyle.css\" />\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"web/css/dtree.css\" />\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"web/js/mainjs.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"web/js/dtree.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"web/js/jquery-1.4.2.js\"></script>\r\n");
      out.write("\t<style type=\"text/css\">\r\n");
      out.write("\t\t.tinfo td{height:30px; line-height:30px}\r\n");
      out.write("\t</style>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t   function showDep(id,name,depSn,parentDep,depDesc) {\r\n");
      out.write("\t\t   var parent =  $(window.parent.document);\r\n");
      out.write("\t\t   parent.find('#depId').attr('value',id);\r\n");
      out.write("\t\t   parent.find('#depName').attr('value',name);\r\n");
      out.write("\t\t   parent.find('#depSn').attr('value',depSn);\r\n");
      out.write("\t\t   parent.find('#parentDep').attr('value',parentDep);\r\n");
      out.write("\t\t   parent.find('#desc').attr('value',depDesc);\r\n");
      out.write("\t   }\r\n");
      out.write("\t   \r\n");
      out.write("\t   function showAddDep() {\r\n");
      out.write("\t\t   document.location='bfdep/dep_showAddDep.action';\r\n");
      out.write("\t   }\r\n");
      out.write("\t   function deleteDep() {\r\n");
      out.write("\t\t    var depId = $(\"#depId\").val();\r\n");
      out.write("\t\t    document.location='bfdep/dep_deleteDep.action?depId='+depId;\r\n");
      out.write("\t   }\r\n");
      out.write("\t   function findByPage() {\r\n");
      out.write("\t\t   $(\"#f2\").submit();\r\n");
      out.write("\t   }\r\n");
      out.write("\t</script>\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("  </head>\r\n");
      out.write("  \r\n");
      out.write("  <body>\r\n");
      out.write("    <div align=\"center\">\r\n");
      out.write("\t<table width=\"600\" height=\"460\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td colspan=\"2\" align=\"left\" \r\n");
      out.write("\t\t\t\tstyle=\" height:60px;line-height:60px;\r\n");
      out.write("\t\t\t\t\t\tbackground-image:url(web/imgs/accountbar.jpg);\r\n");
      out.write("\t\t\t\t\t\t\">\r\n");
      out.write("\t\t\t\t<div style=\"width:70px; height:60px; float:left\"></div>\r\n");
      out.write("\t\t\t\t<p style=\"color:#0066ff; font-size:18px;\" class=\"textShadow\">\r\n");
      out.write("\t\t\t\t 部门管理</p>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td width=\"200\" style=\"width:200px; height:300px\" valign=\"top\">\r\n");
      out.write("\t\t\t\t<div style=\"height:300px; width:200px; border:1px solid\">\r\n");
      out.write("\t\t\t\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\t\t\t    d = new dTree('d');\r\n");
      out.write("\t\t\t\t\t    d.add(0,-1,'北风部门');\r\n");
      out.write("\t\t\t\t\t  \r\n");
      out.write("\t\t\t\t\t    document.write(d);\r\n");
      out.write("\t\t\t\t\t</script>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t<td valign=\"top\" width=\"400\" align=\"center\">\r\n");
      out.write("\t\t\t\t<table width=\"90%\" class=\"tinfo\">\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"right\" width=\"40%\">部门名称:</td>\r\n");
      out.write("\t\t\t\t\t\t<td width=\"60%\" align=\"left\"><input type=\"text\" name=\"dep_name\" id=\"depName\"/></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"right\">部门ID:</td>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"left\"><input type=\"text\" name=\"dep_id\" id=\"depId\"/></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"right\">部门编号:</td>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"left\"><input type=\"text\" name=\"dep_sn\" id=\"depSn\"/></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"right\">上级部门:</td>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"left\"><input type=\"text\" name=\"parentDep\" id=\"parentDep\"/></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"right\" valign=\"top\" style=\"vertical-align:top\">部门描述:</td>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"left\"><textarea style=\"width:160px; height:50px\" name=\"dep_desc\" id=\"desc\"></textarea></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td colspan=\"2\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"button\" onmouseover=\"buttonHover(this,'web/')\" onmouseout=\"buttonNormal(this,'web/')\" style=\"float:left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t修改\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<c:choose>\r\n");
      out.write("\t\t\t\t\t\t\t  \r\n");
      out.write("\t\t\t\t\t\t\t     <div class=\"button\" onmouseover=\"buttonHover(this,'web/')\" onmouseout=\"buttonNormal(this,'web/')\" style=\"float:left\" onclick=\"showAddDep()\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t添加\r\n");
      out.write("\t\t\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t\t\t    \r\n");
      out.write("\t\t\t\t\t\t\t    <c:otherwise>\r\n");
      out.write("\t\t\t\t\t\t\t       <div class=\"button\" onmouseover=\"buttonHover(this,'web/')\" onmouseout=\"buttonNormal(this,'web/')\" style=\"float:left\" onclick=\"javascript:void(alert('你没有该权限'))\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t添加\r\n");
      out.write("\t\t\t\t\t\t\t      </div>\r\n");
      out.write("\t\t\t\t\t\t\t    </c:otherwise>\r\n");
      out.write("\t\t\t\t\t\t\t</c:choose>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"button\" onmouseover=\"buttonHover(this,'web/')\" onmouseout=\"buttonNormal(this,'web/')\" style=\"float:left\" onclick=\"deleteDep()\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t删除\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td colspan=\"2\" align=\"left\" style=\"height:100px\">\r\n");
      out.write("\t\t\t\t<fieldset style=\"border:1px solid #cccccc; height:100px\">\r\n");
      out.write("\t\t\t\t\t<legend>查找部门</legend>\r\n");
      out.write("\t\t\t\t\t<form action=\"bfdep/dep_findByPage\" method=\"post\" id=\"f2\">\r\n");
      out.write("\t\t\t\t\t<table width=\"98%\" class=\"tinfo\">\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"100%\" align=\"center\"><input type=\"radio\" />按编号查询&nbsp;&nbsp;<input type=\"radio\" />按名称查询 </td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td align=\"center\">查询条件:<input type=\"text\" name=\"type\"/>\r\n");
      out.write("\t\t\t\t\t\t\t<c:choose>\r\n");
      out.write("\t\t\t\t\t\t\t  \r\n");
      out.write("\t\t\t\t\t\t\t     <div class=\"button\" onmouseover=\"buttonHover(this,'web/')\" onmouseout=\"buttonNormal(this,'web/')\" style=\"float:right\" onclick=\"findByPage()\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t查询\r\n");
      out.write("\t\t\t\t\t\t\t     </div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t   <c:otherwise>\r\n");
      out.write("\t\t\t\t\t\t\t   <div class=\"button\" onmouseover=\"buttonHover(this,'web/')\" onmouseout=\"buttonNormal(this,'web/')\" style=\"float:right\" onclick=\"javascript:void(alert('你没有该权限'))\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t查询\r\n");
      out.write("\t\t\t\t\t\t\t   </div>\r\n");
      out.write("\t\t\t\t\t\t\t   </c:otherwise>\r\n");
      out.write("\t\t\t\t\t\t\t</c:choose>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t</fieldset>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</td>\t\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t</div>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
