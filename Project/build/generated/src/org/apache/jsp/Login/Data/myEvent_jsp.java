package org.apache.jsp.Login.Data;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import DAO.DAONewEvent;
import model.NewEvent;
import java.util.List;
import java.util.ArrayList;
import Database.KoneksiDB;

public final class myEvent_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Roboto+Slab\" rel=\"stylesheet\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/myEvent.css\">\r\n");
      out.write("        <script src=\"Js/myEvent.js\"></script>\r\n");
      out.write("        <title>MY EVENT</title>\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body onload=\"startTime()\">\r\n");
      out.write("            <div class=\"headbar\" id=\"side-menu\">\r\n");
      out.write("                <header>\r\n");
      out.write("                    <center><img class=\"logoweb\" id=\"logoweb\" src=\"img/L210.png\"></center>\r\n");
      out.write("                </header>\r\n");
      out.write("            </div>\r\n");
      out.write("    <div class=\"container\" id=\"main\">\r\n");
      out.write("  <div id=\"menu\" class=\"side-nav\">\r\n");
      out.write("    <a href=\"#\" class=\"btn-close\" onclick=\"closeSlideMenu()\">&times;</a>\r\n");
      out.write("    <a href=\"myEvent.jsp\"><li class=\"none\"><i class=\"material-icons\" style=\"font-size:20px;color:white; padding-right: 30px;\">home</i>Dasboard</li></a>\r\n");
      out.write("    <a href=\"calendar.jsp\"><li class=\"none\"><i class=\"material-icons\" style=\"font-size:20px;color:white; padding-right: 30px;\">date_range</i>Calendar</li></a>\r\n");
      out.write("    <a href=\"addEvent.jsp\"><li class=\"none\"><i class=\"material-icons\" style=\"font-size:20px;color:white; padding-right: 30px;\">add</i>Create Schedule</li></a>\r\n");
      out.write("    <a href=\"listData.jsp\"><li class=\"none\"><i class=\"material-icons\" style=\"font-size:20px;color:white; padding-right: 30px;\">done</i>Finished Task</li>\r\n");
      out.write("    <a href=\"PageEventList.jsp\"><li class=\"none\"><i class=\"material-icons\" style=\"font-size:20px;color:white; padding-right: 30px;\">list</i>Event List</li></a>\r\n");
      out.write("    <a href=\"#\"><li class=\"none\"><i class=\"material-icons\" style=\"font-size:20px;color:white; padding-right: 30px;\">build</i>Manage</li></a>\r\n");
      out.write("  </div>\r\n");
      out.write("    <div class=\"Walpaper\">\r\n");
      out.write("        <a href=\"#\" onclick=\"openSlideMenu()\">\r\n");
      out.write("            <svg width=\"30\" height=\"30\">\r\n");
      out.write("                <path d=\"M0,5 30,5\" stroke=\"#fff\"stroke-width=\"5\"/>\r\n");
      out.write("                <path d=\"M0,14 30,14\" stroke=\"#fff\" stroke-width=\"5\"/>\r\n");
      out.write("                <path d=\"M0,23 30,23\" stroke=\"#fff\" stroke-width=\"5\"/>\r\n");
      out.write("            </svg>\r\n");
      out.write("        </a>\r\n");
      out.write("        <div class=\"tampilan-text\" id=\"coba\"></div>\r\n");
      out.write("        <div class=\"tampilan-text\" id=\"tess\">\r\n");
      out.write("            <h1> Rizal Muhammad </h1>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"tempat-foto\">\r\n");
      out.write("            <img src=\"https://akademik.polban.ac.id/fotomhsrekap/161511057.jpg\" alt=\"\" class=\"profile main\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"tampilan-text\">\r\n");
      out.write("            <h2>Your Event Today</h2>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"bottom-view\">\r\n");
      out.write("            <div class=\"entry\">\r\n");
      out.write("                <div class=\"batas-tabel\">\r\n");
      out.write("                    <table class=\"table\">\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <th>NO</th>\r\n");
      out.write("                            <th>Event Name</th>\r\n");
      out.write("                            <th>Event Locaton</th>\r\n");
      out.write("                            <th>Event Time</th>\r\n");
      out.write("                            <th>Edit Your Event</th>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        ");

                      DAONewEvent kt = new DAONewEvent();
                      List<NewEvent> data = new ArrayList<NewEvent>();
                      String ket = request.getParameter("ket");

                      if (ket == null) {
                          data = kt.tampil();
                      }
                  
                      for (int x = 0; x < data.size(); x++) {
                    
      out.write("\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td title=\"NO\">");
      out.print(x + 1);
      out.write("</td>\r\n");
      out.write("                            <td title=\"Event Name\">");
      out.print(data.get(x).getNamaEvent());
      out.write("</td>\r\n");
      out.write("                            <td title=\"Location\">");
      out.print(data.get(x).getKdTraveller());
      out.write("</td>\r\n");
      out.write("                            <td title=\"Ibu Kota\">");
      out.print(data.get(x).getWaktuMulai());
      out.write("</td>\r\n");
      out.write("                            <td><input type=\"submit\" class=\"button2\" onClick=\"opena()\" value=\"Edit\" ></td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                           ");
 
                    }
              
      out.write("                 \r\n");
      out.write("                    </table>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"row-full-event\">\r\n");
      out.write("                    <button class=\"full-event\" type=\"submit\" name=\"Tambah\">Show All List</button> \r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <footer>Copyright &copy; Kelompok B1 | Front-End [Made With Love] </footer>\r\n");
      out.write("</div>\r\n");
      out.write("    </body>\r\n");
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
