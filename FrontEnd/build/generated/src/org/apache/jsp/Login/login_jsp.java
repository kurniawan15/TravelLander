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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<title>LOGIN</title>\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/allpages.css\">\n");
      out.write("</head>\n");
      out.write("<style>\n");
      out.write("body{\n");
      out.write(" /* Location of the image */\n");
      out.write("  background-image: url(img/2.jpg);\n");
      out.write("  \n");
      out.write("  /* Background image is centered vertically and horizontally at all times */\n");
      out.write("  background-position: center center;\n");
      out.write("  \n");
      out.write("  /* Background image doesn't tile */\n");
      out.write("  background-repeat: no-repeat;\n");
      out.write("  \n");
      out.write("  /* Background image is fixed in the viewport so that it doesn't move when \n");
      out.write("     the content's height is greater than the image's height */\n");
      out.write("  background-attachment: fixed;\n");
      out.write("  \n");
      out.write("  /* This is what makes the background image rescale based\n");
      out.write("     on the container's size */\n");
      out.write("  background-size: cover;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<div class=\"header2\">\n");
      out.write("  \t<h1>Travelander</h1>\n");
      out.write("</div>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<div class=\"row\">\n");
      out.write("\n");
      out.write("<div class=\"col-5 1\">\n");
      out.write("\t\t<div class=\"header\">\n");
      out.write("                    <form name=\"login\" action=\"ceklogin.jsp\">\n");
      out.write("\t\t  <center>Login</center>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t    <input type=\"text\" id=\"fname\" name=\"user\" placeholder=\"Username\">\n");
      out.write("\t\t    <input type=\"password\" id=\"lname\" name=\"pass\" placeholder=\"Password\">\n");
      out.write("\t\t    <input type=\"submit\" value=\"Login\">\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"col-6 2\">\n");
      out.write("\t\t<div class=\"header\">\n");
      out.write("                </form>\n");
      out.write("                    <form name=\"registrasi\" action=\"Registrasi/progresregistrasi.jsp\">\n");
      out.write("\t\t  <center>Register</center>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-6 3.1\">\n");
      out.write("\t\t\t    <input type=\"text\" id=\"fname\" name=\"firstname\" placeholder=\"Your name..\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-6 3.2\">\n");
      out.write("\t\t\t    <input type=\"text\" id=\"lname\" name=\"lastname\" placeholder=\"Your last name..\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<input type=\"text\" id=\"lname\" name=\"email\" placeholder=\"Your E-mail..\">\n");
      out.write("\t\t\t<div class=\"col-6 3.1\">\n");
      out.write("\t\t\t    <input type=\"text\" id=\"fname\" name=\"user\" placeholder=\"Your Username..\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-6 3.2\">\n");
      out.write("\t\t\t    <input type=\"text\" id=\"lname\" name=\"lastname\" placeholder=\"Your Password..\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t    <label for=\"country\" style=\"color: white\">Country</label><br>\n");
      out.write("\t\t    <select id=\"country\" name=\"country\">\n");
      out.write("\t\t      <option value=\"australia\">Indonesia</option>\n");
      out.write("\t\t      <option value=\"canada\">Swedia</option>\n");
      out.write("\t\t    </select>\n");
      out.write("\t\t    <input type=\"submit\" value=\"Submit\">\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("</form>\n");
      out.write("\t<div class=\"footer\">\n");
      out.write(" \t\t<p>© Copyright Kelompok B2 | October 2017</p>\n");
      out.write(" \t</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
