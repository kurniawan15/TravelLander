package org.apache.jsp.Login.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class transpotation_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!doctype html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Super Admin</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/index.css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"Js/date.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"Js/place.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/calendar.css\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("<div id=\"header\">\r\n");
      out.write("    \t<div class=\"logo\"><a href=\"#\">Travel<span>Calendar</span></a></div>\r\n");
      out.write("        <ul id=\"dropdown\">\r\n");
      out.write("        ");

            String nama = session.getAttribute("id_Admin").toString();
        //    out.println("Selamat Datang " + nama +"<br> Anda berhasil Login");
            
      out.write("\r\n");
      out.write("            <li><a href=\"../logout.jsp\">Log Out</a></li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <div id=\"container\">\r\n");
      out.write("    \t<div class=\"sidebar\">\r\n");
      out.write("        <ul id=\"nav\">\r\n");
      out.write("        \t<li><a href=\"calender.jsp\">Calendar</a></li>\r\n");
      out.write("            <li><a href=\"DatePlace.jsp\">Manage Place</a></li>\r\n");
      out.write("            <li><a href=\"distance.jsp\">Manage Distance</a></li>\r\n");
      out.write("            <li><a href=\"time.jsp\">Manage Time</a></li>\r\n");
      out.write("            <li><a class=\"selected\" href=\"transpotation.jsp\">Manage Transpotation</a></li>\r\n");
      out.write("      \t</ul>\r\n");
      out.write("        <div id=\"calendar\">\r\n");
      out.write("\t\t\t<p id=\"calendar-day\"></p>\r\n");
      out.write("            <p id=\"calendar-date\"></p>\r\n");
      out.write("            <p id=\"calendar-month-year\"></p>\r\n");
      out.write("         </div>\r\n");
      out.write("            \r\n");
      out.write("    \t</div>\r\n");
      out.write("        \r\n");
      out.write("<div class=\"content\">\r\n");
      out.write("        \t<h1></h1>\r\n");
      out.write("            <p>Place</p>                      \r\n");
      out.write("            \t<div id=\"box\">                    \r\n");
      out.write("                 \t<div class=\"box-panel\">\r\n");
      out.write("                    \t<h2></h2>\r\n");
      out.write("                        \r\n");
      out.write("                        <div id=\"div2\">\r\n");
      out.write("                         <table id=\"table2\">\r\n");
      out.write("                         \t<tr>\r\n");
      out.write("                            <th> No </th>\r\n");
      out.write("                            <th> Transpotation</th>\r\n");
      out.write("                            <th> Action </th>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                         \t<tr>\r\n");
      out.write("                            <td > 1 </td>\r\n");
      out.write("                            <td> Pesawat </td>\r\n");
      out.write("                            <td > <input type=\"submit\" name=\"\" value=\" Delet Data\"> </td>\r\n");
      out.write("                       \t\t</tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                            <td> 2 </td>\r\n");
      out.write("                            <td> Kereta </td>\r\n");
      out.write("                            <td> <input type=\"submit\" name=\"\" value=\"Delet Data\"> </td>\r\n");
      out.write("                       \t\t</tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                            <td> 3 </td>\r\n");
      out.write("                            <td> Mobil </td>\r\n");
      out.write("                            <td> <input type=\"submit\" name=\"\" value=\" Delet Data\"> </td>\r\n");
      out.write("                       \t\t</tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                            <td> 4 </td>\r\n");
      out.write("                            <td> Motor </td>\r\n");
      out.write("                            <td> <input type=\"submit\" name=\"\" value=\" Delet Data\"> </td>\r\n");
      out.write("                       \t\t</tr>    \r\n");
      out.write("                            <tr>\r\n");
      out.write("                            <td> 5 </td>\r\n");
      out.write("                            <td> Jalan Kaki </td>\r\n");
      out.write("                            <td> <input type=\"submit\" name=\"\" value=\" Delet Data\"> </td>\r\n");
      out.write("                       \t\t</tr>    \r\n");
      out.write("                            <tr>\r\n");
      out.write("                            <td> 6 </td>\r\n");
      out.write("                            <td> Bus </td>\r\n");
      out.write("                            <td> <input type=\"submit\" name=\"\" value=\"Delet Data\"> </td>\r\n");
      out.write("                       \t\t</tr>    \r\n");
      out.write("                                                      \r\n");
      out.write("                       \t  </table>                          \r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div id=\"imput\">\r\n");
      out.write("                        \t Imput Place\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div id=\"form\">\r\n");
      out.write("                        \t <input type=\"text\" name=\"#\" style=\"width:100%\" placeholder=\"Transpotation\">\r\n");
      out.write("                            \r\n");
      out.write("                             \t<button class=\"button\" style=\"width:100%\"><span>Submit </span></button>\r\n");
      out.write("                             \r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("   </div>\r\n");
      out.write("   </div>\t\r\n");
      out.write("   </body>\r\n");
      out.write("</html>\r\n");
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
