package org.apache.jsp.Login;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<title>LOGIN</title>\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/allpages.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<style>\r\n");
      out.write("body{\r\n");
      out.write(" /* Location of the image */\r\n");
      out.write("  background-image: url(img/2.jpg);\r\n");
      out.write("  \r\n");
      out.write("  /* Background image is centered vertically and horizontally at all times */\r\n");
      out.write("  background-position: center center;\r\n");
      out.write("  \r\n");
      out.write("  /* Background image doesn't tile */\r\n");
      out.write("  background-repeat: no-repeat;\r\n");
      out.write("  \r\n");
      out.write("  /* Background image is fixed in the viewport so that it doesn't move when \r\n");
      out.write("     the content's height is greater than the image's height */\r\n");
      out.write("  background-attachment: fixed;\r\n");
      out.write("  \r\n");
      out.write("  /* This is what makes the background image rescale based\r\n");
      out.write("     on the container's size */\r\n");
      out.write("  background-size: cover;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<div class=\"header2\">\r\n");
      out.write("  \t<h1>Travelander</h1>\r\n");
      out.write("</div>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("<div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("<div class=\"col-5 1\">\r\n");
      out.write("\t\t<div class=\"header\">\r\n");
      out.write("                    <form name=\"login\" action=\"ceklogin.jsp\">\r\n");
      out.write("\t\t  <center>Login</center>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t    <input type=\"text\" id=\"fname\" name=\"user\" placeholder=\"Username\">\r\n");
      out.write("\t\t    <input type=\"password\" id=\"lname\" name=\"pass\" placeholder=\"Password\">\r\n");
      out.write("\t\t    <input type=\"submit\" value=\"Login\">\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"col-6 2\">\r\n");
      out.write("\t\t<div class=\"header\">\r\n");
      out.write("                </form>\r\n");
      out.write("                    <form name=\"registrasi\" action=\"Registrasi/progresregistrasi.jsp\">\r\n");
      out.write("\t\t  <center>Register</center>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-6 3.1\">\r\n");
      out.write("\t\t\t    <input type=\"text\" id=\"fname\" name=\"firstname\" placeholder=\"Your name..\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-6 3.2\">\r\n");
      out.write("\t\t\t    <input type=\"text\" id=\"lname\" name=\"lastname\" placeholder=\"Your last name..\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<input type=\"text\" id=\"lname\" name=\"email\" placeholder=\"Your E-mail..\">\r\n");
      out.write("\t\t\t<div class=\"col-6 3.1\">\r\n");
      out.write("\t\t\t    <input type=\"text\" id=\"fname\" name=\"user\" placeholder=\"Your Username..\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-6 3.2\">\r\n");
      out.write("\t\t\t    <input type=\"text\" id=\"lname\" name=\"lastname\" placeholder=\"Your Password..\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t    <label for=\"country\" style=\"color: white\">Country</label><br>\r\n");
      out.write("\t\t    <select id=\"country\" name=\"country\">\r\n");
      out.write("\t\t      <option value=\"australia\">Indonesia</option>\r\n");
      out.write("\t\t      <option value=\"canada\">Swedia</option>\r\n");
      out.write("\t\t    </select>\r\n");
      out.write("\t\t    <input type=\"submit\" value=\"Submit\">\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</form>\r\n");
      out.write("\t<div class=\"footer\">\r\n");
      out.write(" \t\t<p>© Copyright Kelompok B2 | October 2017</p>\r\n");
      out.write(" \t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
