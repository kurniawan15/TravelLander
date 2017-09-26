package org.apache.jsp.Login.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class DataPlace_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!doctype html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Super Admin</title>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/index.css\" />\n");
      out.write("<script type=\"text/javascript\" src=\"Js/date.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"Js/place.js\"></script>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/calendar.css\">\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\t\t\t\t\t\n");
      out.write("<div id=\"header\">\n");
      out.write("    \t<div class=\"logo\"><a href=\"#\">Travel<span>Calendar</span></a></div>\n");
      out.write("        <ul id=\"dropdown\">\n");
      out.write("        ");

            String nama = session.getAttribute("id_Admin").toString();
        //    out.println("Selamat Datang " + nama +"<br> Anda berhasil Login");
            
      out.write("\n");
      out.write("            <li><a href=\"../Logout.jsp\">Log Out</a></li>\n");
      out.write("\t</ul>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <div id=\"container\">\n");
      out.write("    \t<div class=\"sidebar\">\n");
      out.write("        <ul id=\"nav\">\n");
      out.write("        \t<li><a href=\"#\">Calendar</a></li>\n");
      out.write("            <li><a class=\"selected\" href=\"#\">Manage Place</a></li>\n");
      out.write("            <li><a href=\"distance.html\">Manage Distance</a></li>\n");
      out.write("            <li><a href=\"time.html\">Manage Time</a></li>\n");
      out.write("            <li><a href=\"#\">Manage Transpotation</a></li>\n");
      out.write("      \t</ul>\n");
      out.write("        <div id=\"calendar\">\n");
      out.write("\t\t\t<p id=\"calendar-day\"></p>\n");
      out.write("            <p id=\"calendar-date\"></p>\n");
      out.write("            <p id=\"calendar-month-year\"></p>\n");
      out.write("         </div>\n");
      out.write("            \n");
      out.write("    \t</div>\n");
      out.write("        \n");
      out.write("<div class=\"content\">\n");
      out.write("        \t<h1></h1>\n");
      out.write("            <p>Place</p>                      \n");
      out.write("            \t<div id=\"box\">                    \n");
      out.write("                 \t<div class=\"box-panel\">\n");
      out.write("                    \t<h2></h2>\n");
      out.write("                        \n");
      out.write("                        <div id=\"div2\">\n");
      out.write("                         <table id=\"table2\">\n");
      out.write("                         \t<tr>\n");
      out.write("                            <th> No </th>\n");
      out.write("                            <th> Place Name </th>\n");
      out.write("                            <th> Action </th>\n");
      out.write("                            </tr>\n");
      out.write("                         \t<tr>\n");
      out.write("                            <td > 1 </td>\n");
      out.write("                            <td> Rumah </td>\n");
      out.write("                            <td > <input type=\"submit\" name=\"\" value=\" Delet Data\"> </td>\n");
      out.write("                       \t\t</tr>\n");
      out.write("                            <tr>\n");
      out.write("                            <td> 1 </td>\n");
      out.write("                            <td> Rumah </td>\n");
      out.write("                            <td> <input type=\"submit\" name=\"\" value=\"Delet Data\"> </td>\n");
      out.write("                       \t\t</tr>\n");
      out.write("                            <tr>\n");
      out.write("                            <td> 1 </td>\n");
      out.write("                            <td> Rumah </td>\n");
      out.write("                            <td> <input type=\"submit\" name=\"\" value=\" Delet Data\"> </td>\n");
      out.write("                       \t\t</tr>\n");
      out.write("                            <tr>\n");
      out.write("                            <td> 1 </td>\n");
      out.write("                            <td> Rumah </td>\n");
      out.write("                            <td> <input type=\"submit\" name=\"\" value=\" Delet Data\"> </td>\n");
      out.write("                       \t\t</tr>    \n");
      out.write("                            <tr>\n");
      out.write("                            <td> 1 </td>\n");
      out.write("                            <td> Rumah </td>\n");
      out.write("                            <td> <input type=\"submit\" name=\"\" value=\" Delet Data\"> </td>\n");
      out.write("                       \t\t</tr>    \n");
      out.write("                            <tr>\n");
      out.write("                            <td> 1 </td>\n");
      out.write("                            <td> Rumah </td>\n");
      out.write("                            <td> <input type=\"submit\" name=\"\" value=\"Delet Data\"> </td>\n");
      out.write("                       \t\t</tr>    \n");
      out.write("                            <tr>\n");
      out.write("                            <td> 1 </td>\n");
      out.write("                            <td> Rumah </td>\n");
      out.write("                            <td> <input type=\"submit\" name=\"\" value=\"Delet Data\"> </td>\n");
      out.write("                       \t\t</tr>    \n");
      out.write("                            <tr>\n");
      out.write("                            <td> 1 </td>\n");
      out.write("                            <td> Rumah </td>\n");
      out.write("                            <td> <input type=\"submit\" name=\"\" value=\"Delet Data\"> </td>\n");
      out.write("                       \t\t</tr>    \n");
      out.write("                            <tr>\n");
      out.write("                            <td> 1 </td>\n");
      out.write("                            <td> Rumah </td>\n");
      out.write("                            <td> <input type=\"submit\" name=\"\" value=\"Delet Data\"> </td>\n");
      out.write("                       \t\t</tr>    \n");
      out.write("                            <tr>\n");
      out.write("                            <td> 1 </td>\n");
      out.write("                            <td> Rumah </td>\n");
      out.write("                            <td> <input type=\"submit\" name=\"\" value=\"Delet Data\"> </td>\n");
      out.write("                       \t\t</tr>    \n");
      out.write("                            <tr>\n");
      out.write("                            <td> 1 </td>\n");
      out.write("                            <td> Rumah </td>\n");
      out.write("                            <td> <input type=\"submit\" name=\"\" value=\"Delet\"> </td>\n");
      out.write("                       \t\t</tr>                           \n");
      out.write("                       \t  </table>                          \n");
      out.write("                        </div>\n");
      out.write("                        <div id=\"imput\">\n");
      out.write("                        \t Imput Place\n");
      out.write("                        </div>\n");
      out.write("                        <div id=\"form\">\n");
      out.write("                        \t <input type=\"text\" name=\"#\" style=\"width:100%\" placeholder=\"Place Name\">\n");
      out.write("                            \n");
      out.write("                             \t<button class=\"button\" name=\"#\" style=\"width:100%\"><span>Submit </span></button>\n");
      out.write("                             \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("   </div>\n");
      out.write("   </div>\t\n");
      out.write("   </body>\n");
      out.write("</html>\n");
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
