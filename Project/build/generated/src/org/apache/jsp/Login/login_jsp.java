package org.apache.jsp.Login;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Traveller;
import DAO.DAOTraveller;
import java.util.List;
import java.util.ArrayList;
import Database.KoneksiDB;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<title>TRAVELENDAR - Politeknik Negeri Bandung</title>\r\n");
      out.write("\t<link href=\"css/grid.css\" type=\"text/css\" rel=\"stylesheet\">\r\n");
      out.write("\t<link href=\"css/style.css\" type=\"text/css\" rel=\"stylesheet\">\r\n");
      out.write("\t<script src=\"js/jquery.min.js\"></script>\r\n");
      out.write("\t<script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("body{\r\n");
      out.write("\tbackground-image: url(img/1.jpg);\r\n");
      out.write("\tbackground-position: center center;\r\n");
      out.write("\tbackground-repeat: no-repeat;\r\n");
      out.write("\tbackground-attachment: fixed;\r\n");
      out.write("\tbackground-size: cover;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"col-lg-4 col-md-4 col-sm-6 col-xs-10 red col-lg-offset-4 col-md-offset-4 col-sm-offset-3 col-xs-offset-1\">\r\n");
      out.write("\t\t\t<div class=\"login-form\">\r\n");
      out.write("\t\t\t\t<h1><center><img class=\"img-responsive\" src=\"img/logo.png\"></center></h1>\r\n");
      out.write("\t\t\t\t<br>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<button class=\"tablink\" onclick=\"openCity('login', this, '#25aae2')\" id=\"defaultOpen\">LOGIN</button>\r\n");
      out.write("\t\t\t\t\t<button class=\"tablink\" onclick=\"openCity('signup', this, '#25aae2')\">SIGNUP</button>\r\n");
      out.write("\t\t\t\t\t<div id=\"login\" class=\"tabcontent\">\r\n");
      out.write("\t\t\t\t\t  <form action=\"../traveller?data=traveller&proses=cek-traveller\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" name=\"user\" placeholder=\"Username\" style=\"text-align: left; font-size: 14px;\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"password\" name=\"pass\" placeholder=\"Password\">\r\n");
      out.write("\t\t\t\t\t\t<button type=\"submit\" name=\"login\" class=\"btn btn-primary btn-block\" onclick=\"Dashboard.html\">Login</button></a> \r\n");
      out.write("\t\t\t\t\t  </form>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div id=\"signup\" class=\"tabcontent\">\r\n");
      out.write("\t\t\t\t\t  <form action=\"Dashboard.html\">\r\n");
      out.write("\t\t\t\t\t  \t<input type=\"text\" name=\"pass\" placeholder=\"Nickname\" style=\"text-align: left; font-size: 14px;\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" name=\"user\" placeholder=\"Username\"  style=\"text-align: left; font-size: 14px;\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"password\" name=\"pass\" placeholder=\"Password\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"password\" name=\"pass\" placeholder=\"Confirm Password\">\t\t\r\n");
      out.write("\t\t\t\t\t    <button type=\"submit\" name=\"login\" class=\"btn btn-primary btn-block\" onclick=\"*\">Submit</button>\r\n");
      out.write("\t\t\t\t\t  </form> \r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<script>\r\n");
      out.write("\t\t\t\t\tfunction openCity(cityName,elmnt,color) {\r\n");
      out.write("\t\t\t\t\t    var i, tabcontent, tablinks;\r\n");
      out.write("\t\t\t\t\t    tabcontent = document.getElementsByClassName(\"tabcontent\");\r\n");
      out.write("\t\t\t\t\t    for (i = 0; i < tabcontent.length; i++) {\r\n");
      out.write("\t\t\t\t\t        tabcontent[i].style.display = \"none\";\r\n");
      out.write("\t\t\t\t\t    }\r\n");
      out.write("\t\t\t\t\t    tablinks = document.getElementsByClassName(\"tablink\");\r\n");
      out.write("\t\t\t\t\t    for (i = 0; i < tablinks.length; i++) {\r\n");
      out.write("\t\t\t\t\t        tablinks[i].style.backgroundColor = \"\";\r\n");
      out.write("\t\t\t\t\t    }\r\n");
      out.write("\t\t\t\t\t    document.getElementById(cityName).style.display = \"block\";\r\n");
      out.write("\t\t\t\t\t    elmnt.style.backgroundColor = color;\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t// Get the element with id=\"defaultOpen\" and click on it\r\n");
      out.write("\t\t\t\t\tdocument.getElementById(\"defaultOpen\").click();\r\n");
      out.write("\t\t\t\t\t</script>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
