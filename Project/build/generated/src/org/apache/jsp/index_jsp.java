package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head lang=\"en\"> \n");
      out.write("   <!--     <meta charset=\"utf-8\"> -->\n");
      out.write("        <title>OutDates</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\"/>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        <nav> \n");
      out.write("            <img src=\"images/logo_head.png\" width=20% height=100%>\n");
      out.write("        </nav>\n");
      out.write("        \n");
      out.write("\n");
      out.write("        <div id=\"head\">\n");
      out.write("            <nav>\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"#\">Home</a></li>\n");
      out.write("                    <li><a href=\"#anchor-headline\">What's This?</a></li>\n");
      out.write("    \n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
      out.write("        \n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("             \n");
      out.write("        <div class=\"sect sectOne\">         \n");
      out.write(" \n");
      out.write("           <br />\n");
      out.write("           <p id=\"Tagline\">Create Your Simple Plans</p>   \n");
      out.write("           <a href=\"#\"> <button>Get's Started</button> </a>  \n");
      out.write("        \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"subSection\">\n");
      out.write("            \n");
      out.write("            <h3 id=\"anchor-headline\"> Anchor </h3>            \n");
      out.write("            \n");
      out.write("            <br />\n");
      out.write("\n");
      out.write("\n");
      out.write("            <h2 id=\"heading-headline\">Schedule - Check - Go</h2>\n");
      out.write("            \n");
      out.write("            <img src=\"images/logo_kotak.png\" width=\"50%\"\" height=\"80%\" >\n");
      out.write("            <p>\n");
      out.write("                  Create Your any Plan for Tomorrow and Next <br> Anything, Anytime, Anywhere\n");
      out.write("            </p>\n");
      out.write("            \n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"tesc sectTwo\">\n");
      out.write("            \n");
      out.write("           <br />\n");
      out.write("           \n");
      out.write("           <!--<img src=\"images/DAYS.png\" width=\"20%\" height=\"20%\" id=\"Anchor-Down\"> -->\n");
      out.write("           <p>Start your Date Now!</p>  \n");
      out.write("           <a href=\"#\"> <button>Go</button> </a>  \n");
      out.write("        \n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>");
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
