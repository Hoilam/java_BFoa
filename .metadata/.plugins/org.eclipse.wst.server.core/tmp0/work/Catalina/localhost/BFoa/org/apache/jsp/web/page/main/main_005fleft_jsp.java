/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.36
 * Generated at: 2016-09-21 11:15:12 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.web.page.main;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class main_005fleft_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = null;
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

      out.write('\r');
      out.write('\n');

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("    \r\n");
      out.write("    <title>My JSP 'main_left.jsp' starting page</title>\r\n");
      out.write("    \r\n");
      out.write("\t<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"expires\" content=\"0\">    \r\n");
      out.write("\t<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("\t<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"web/css/reset.css\" />\r\n");
      out.write(" <style type=\"text/css\">\r\n");
      out.write(" \tdiv.functionButton{\r\n");
      out.write("\t\tcursor:pointer;\r\n");
      out.write("\t\twidth:188px;\r\n");
      out.write("\t\theight:44px;\r\n");
      out.write("\t\tline-height:44px;\r\n");
      out.write("\t\ttext-align:center;\r\n");
      out.write("\t\tcolor:#ffffff;\r\n");
      out.write("\t}\r\n");
      out.write("\t.textShadow{\r\n");
      out.write("\t\tcolor:#FFFFFF;\r\n");
      out.write("\t\tcursor:pointer;\r\n");
      out.write("\t\tfont-size:18px;\r\n");
      out.write("\t\ttext-shadow:black 2px 2px 2px;\r\n");
      out.write("\t\t-ms-filter: \"progid:DXImageTransform.Microsoft.DropShadow(offx=1, offy=1, color='#000000', positive='true')\"; /* IE8+ */\r\n");
      out.write("\t\tfilter: progid:DXImageTransform.Microsoft.DropShadow(offx=1, offy=1, color='#000000', positive='true') /* IE and lower */\r\n");
      out.write("\t}\r\n");
      out.write(" </style>\r\n");
      out.write(" \r\n");
      out.write(" <script type=\"text/javascript\" src=\"web/js/jquery-1.4.2.min.js\"></script>\r\n");
      out.write("  <script type=\"text/javascript\">\r\n");
      out.write("  \t//改变按钮图片\r\n");
      out.write(" \tfunction changePic(obj,picName){\r\n");
      out.write("\t\tobj.style.backgroundImage = 'url(web/imgs/' + picName + ')';\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t//跳转路径\r\n");
      out.write("\tfunction gotoLocation(path){\r\n");
      out.write("\t\twindow.top.rightFrame.document.location=path; \r\n");
      out.write("\t}\r\n");
      out.write(" </script>\r\n");
      out.write("\r\n");
      out.write("  </head>\r\n");
      out.write("  \r\n");
      out.write("  <body>\r\n");
      out.write("    <div style=\"background-image:url(web/imgs/mainFunction_bar.jpg); width:188px; height:403px;\">\r\n");
      out.write("\t\t<div style=\"height:35px\"></div>\r\n");
      out.write("\t\t<div class=\"functionButton\" \r\n");
      out.write("\t\t\t\tstyle=\"background-image:url(web/imgs/zzgl_normal.jpg)\"\r\n");
      out.write("\t\t\t\tonmouseover=\"changePic(this,'zzgl_choose.jpg')\"\r\n");
      out.write("\t\t\t\tonmouseout=\"changePic(this,'zzgl_normal.jpg')\"\r\n");
      out.write("\t\t\t\tonclick=\"gotoLocation('main_right_zzgl.jsp')\">\r\n");
      out.write("\t\t\t\t<p class=\"textShadow\" onclick=\"gotoLocation('main_right_zzgl.jsp')\">&nbsp;&nbsp;组织管理</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div style=\"height:5px\"></div>\r\n");
      out.write("\t\t<div class=\"functionButton\" \r\n");
      out.write("\t\t\t\tstyle=\"background-image:url(web/imgs/qxgl_normal.jpg)\"\r\n");
      out.write("\t\t\t\tonmouseover=\"changePic(this,'qxgl_choose.jpg')\"\r\n");
      out.write("\t\t\t\tonmouseout=\"changePic(this,'qxgl_normal.jpg')\"\r\n");
      out.write("\t\t\t\tonclick=\"gotoLocation('main_right_qxgl.jsp')\">\r\n");
      out.write("\t\t\t\t<p class=\"textShadow\" onclick=\"gotoLocation('main_right_qxgl.jsp')\">&nbsp;&nbsp;权限管理</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div style=\"height:5px\"></div>\r\n");
      out.write("\t\t<div class=\"functionButton\" \r\n");
      out.write("\t\t\t\tstyle=\"background-image:url(web/imgs/gwgl_normal.jpg)\"\r\n");
      out.write("\t\t\t\tonmouseover=\"changePic(this,'gwgl_choose.jpg')\"\r\n");
      out.write("\t\t\t\tonmouseout=\"changePic(this,'gwgl_normal.jpg')\"\r\n");
      out.write("\t\t\t\tonclick=\"gotoLocation('main_right_gwgl.jsp')\">\r\n");
      out.write("\t\t\t\t<p class=\"textShadow\" onclick=\"gotoLocation('main_right_gwgl.jsp')\">&nbsp;&nbsp;公文管理</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div style=\"height:5px\"></div>\r\n");
      out.write("\t\t<div class=\"functionButton\" \r\n");
      out.write("\t\t\t\tstyle=\"background-image:url(web/imgs/lcgl_normal.jpg)\"\r\n");
      out.write("\t\t\t\tonmouseover=\"changePic(this,'lcgl_choose.jpg')\"\r\n");
      out.write("\t\t\t\tonmouseout=\"changePic(this,'lcgl_normal.jpg')\"\r\n");
      out.write("\t\t\t\tonclick=\"gotoLocation('main_right_lcgl.jsp')\">\r\n");
      out.write("\t\t\t\t<p class=\"textShadow\" onclick=\"gotoLocation('main_right_lcgl.jsp')\">&nbsp;&nbsp;流程管理</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div style=\"background-image:url(web/imgs/main_left_bar2.jpg); width:188px; height:380px\">\r\n");
      out.write("\r\n");
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
