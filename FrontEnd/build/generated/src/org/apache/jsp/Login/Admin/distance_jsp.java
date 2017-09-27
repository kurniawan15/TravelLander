package org.apache.jsp.Login.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class distance_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("   \t<div class=\"logo\"><a href=\"#\">Travel<span>Calendar</span></a></div>\r\n");
      out.write("\t<ul id=\"dropdown\">\r\n");
      out.write("        ");

            String nama = session.getAttribute("id_Admin").toString();
        //    out.println("Selamat Datang " + nama +"<br> Anda berhasil Login");
            
      out.write("\r\n");
      out.write("            <li><a href=\"../logout.jsp\">Log Out</a></li>\r\n");
      out.write("\t</ul>\r\n");
      out.write("</div>\r\n");
      out.write("    \r\n");
      out.write("    <div id=\"container\">\r\n");
      out.write("    \t<div class=\"sidebar\">\r\n");
      out.write("        <ul id=\"nav\">\r\n");
      out.write("        \t<li><a href=\"calender.jsp\">Calendar</a></li>\r\n");
      out.write("            <li><a href=\"DataPlace.jsp\">Manage Place</a></li>\r\n");
      out.write("            <li><a class=\"selected\"  href=\"distance.html\">Manage Distance</a></li>\r\n");
      out.write("            <li><a href=\"time.jsp\">Manage Time</a></li>\r\n");
      out.write("            <li><a href=\"transpotation.jsp\">Manage Transpotation</a></li>\r\n");
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
      out.write("            <p>Distance</p>                      \r\n");
      out.write("            \t<div id=\"box\">                    \r\n");
      out.write("                 \t<div class=\"box-panel\">\r\n");
      out.write("                    \t<h2></h2>\r\n");
      out.write("                        \r\n");
      out.write("                        <div id=\"div2\">\r\n");
      out.write("                         <table id=\"table2\">\r\n");
      out.write("                         \t<tr>\r\n");
      out.write("                            <th> No </th>\r\n");
      out.write("                            <th> starting location </th>\r\n");
      out.write("                            <th> final location </th>\r\n");
      out.write("                            <th> Distance (KM) </th>\r\n");
      out.write("                            <th> Action </th>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                         \t<tr>\r\n");
      out.write("                            <td > 1 </td>\r\n");
      out.write("                            <td> Rumah </td>\r\n");
      out.write("                            <td> Kantor </td>\r\n");
      out.write("                            <td> 10 </td>\r\n");
      out.write("                            <td > <input type=\"submit\" name=\"\" value=\" Delet Data\"> </td>\r\n");
      out.write("                       \t\t</tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                            <td> 1 </td>\r\n");
      out.write("                            <td> Rumah </td>\r\n");
      out.write("                             <td> Kantor </td>\r\n");
      out.write("                            <td> 10 </td>\r\n");
      out.write("                            <td> <input type=\"submit\" name=\"\" value=\"Delet Data\"> </td>\r\n");
      out.write("                       \t\t</tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                            <td> 1 </td>\r\n");
      out.write("                            <td> Rumah </td>\r\n");
      out.write("                             <td> Kantor </td>\r\n");
      out.write("                            <td> 10 </td>\r\n");
      out.write("                            <td> <a href=\"place-update.html\"><input type=\"submit\" name=\"\" value=\" Delet Data\"></a> </td>\r\n");
      out.write("                       \t\t</tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                            <td> 1 </td>\r\n");
      out.write("                            <td> Rumah </td>\r\n");
      out.write("                             <td> Kantor </td>\r\n");
      out.write("                            <td> 10 </td>\r\n");
      out.write("                            <td> <input type=\"submit\" name=\"\" value=\" Delet Data\"> </td>\r\n");
      out.write("                       \t\t</tr>    \r\n");
      out.write("                            <tr>\r\n");
      out.write("                            <td> 1 </td>\r\n");
      out.write("                            <td> Rumah </td>\r\n");
      out.write("                             <td> Kantor </td>\r\n");
      out.write("                            <td> 10 </td>\r\n");
      out.write("                            <td> <input type=\"submit\" name=\"\" value=\" Delet Data\"> </td>\r\n");
      out.write("                       \t\t</tr>    \r\n");
      out.write("                            <tr>\r\n");
      out.write("                            <td> 1 </td>\r\n");
      out.write("                            <td> Rumah </td>\r\n");
      out.write("                             <td> Kantor </td>\r\n");
      out.write("                            <td> 10 </td>\r\n");
      out.write("                            <td> <input type=\"submit\" name=\"\" value=\"Delet Data\"> </td>\r\n");
      out.write("                       \t\t</tr>    \r\n");
      out.write("                            <tr>\r\n");
      out.write("                            <td> 1 </td>\r\n");
      out.write("                            <td> Rumah </td>\r\n");
      out.write("                             <td> Kantor </td>\r\n");
      out.write("                            <td> 10 </td>\r\n");
      out.write("                            <td> <input type=\"submit\" name=\"\" value=\"Delet Data\"> </td>\r\n");
      out.write("                       \t\t</tr>    \r\n");
      out.write("                            <tr>\r\n");
      out.write("                            <td> 1 </td>\r\n");
      out.write("                            <td> Rumah </td>\r\n");
      out.write("                             <td> Kantor </td>\r\n");
      out.write("                            <td> 10 </td>\r\n");
      out.write("                            <td> <input type=\"submit\" name=\"\" value=\"Delet Data\"> </td>\r\n");
      out.write("                       \t\t</tr>    \r\n");
      out.write("                            <tr>\r\n");
      out.write("                            <td> 1 </td>\r\n");
      out.write("                            <td> Rumah </td>\r\n");
      out.write("                             <td> Kantor </td>\r\n");
      out.write("                            <td> 10 </td>\r\n");
      out.write("                            <td> <input type=\"submit\" name=\"\" value=\"Delet Data\"> </td>\r\n");
      out.write("                       \t\t</tr>    \r\n");
      out.write("                            <tr>\r\n");
      out.write("                            <td> 1 </td>\r\n");
      out.write("                            <td> Rumah </td>\r\n");
      out.write("                             <td> Kantor </td>\r\n");
      out.write("                            <td> 10 </td>\r\n");
      out.write("                            <td> <input type=\"submit\" name=\"\" value=\"Delet Data\"> </td>\r\n");
      out.write("                       \t\t</tr>    \r\n");
      out.write("                            <tr>\r\n");
      out.write("                            <td> 1 </td>\r\n");
      out.write("                            <td> Rumah </td>\r\n");
      out.write("                             <td> Kantor </td>\r\n");
      out.write("                            <td> 10 </td>\r\n");
      out.write("                            <td> <input type=\"submit\" name=\"\" value=\"Delet\"> </td>\r\n");
      out.write("                       \t\t</tr>                           \r\n");
      out.write("                       \t  </table>                          \r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div id=\"imput\">\r\n");
      out.write("                        \t Imput Distance\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div id=\"form\">\r\n");
      out.write("                        \t<div class=\"chose1\">\r\n");
      out.write("                            starting location\t\t\r\n");
      out.write("                                <select id=\"locaton\" name=\"location\" style=\"width:25%\" >\r\n");
      out.write("                                    <option value=\"jangar\"></option>\r\n");
      out.write("                                    <option value=\"jangar\">Tempat1</option>\r\n");
      out.write("                                    <option value=\"jangar\">Tempat2</option>\r\n");
      out.write("                                    <option value=\"jangar\">Tempat3</option>\r\n");
      out.write("                                    <option value=\"jangar\">Tempat4</option>\r\n");
      out.write("                                    <option value=\"jangar\">Tempat5</option>\r\n");
      out.write("                                    <option value=\"jangar\">Tempat6</option>\r\n");
      out.write("                                </select>\r\n");
      out.write("                               \r\n");
      out.write("                        \t\r\n");
      out.write("                           Final Location\r\n");
      out.write("                           \t\t\r\n");
      out.write("                             \t<select id=\"locaton2\" name=\"location\" style=\"width:25%\">\r\n");
      out.write("                                    <option value=\"jangar\"></option>\r\n");
      out.write("                                    <option value=\"jangar\">Tempat1</option>\r\n");
      out.write("                                    <option value=\"jangar\">Tempat2</option>\r\n");
      out.write("                                    <option value=\"jangar\">Tempat3</option>\r\n");
      out.write("                                    <option value=\"jangar\">Tempat4</option>\r\n");
      out.write("                                    <option value=\"jangar\">Tempat5</option>\r\n");
      out.write("                                    <option value=\"jangar\">Tempat6</option>\r\n");
      out.write("                            \t</select>\r\n");
      out.write("                                                          \r\n");
      out.write("                        \t</div>\r\n");
      out.write("                           \r\n");
      out.write("                        \t <input type=\"text\" name=\"#\" style=\"width:50%\" placeholder=\"Distance\"> KM        \r\n");
      out.write("                              <br>                \r\n");
      out.write("                             <button class=\"button\"><span>Submit </span></button>\r\n");
      out.write("                            \r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("   </div>\r\n");
      out.write("   </div>\r\n");
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
