package org.apache.jsp.Login.Data;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import Database.KoneksiDB;
import model.Event;
import DAO.DAOEvent;

public final class Dashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("  <!--_____________________Script Pendukung Calendar____________________________-->\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\"/>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"lib/fullcalendar.css\"/>\r\n");
      out.write("    <script src=\"lib/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"lib/moment.min.js\"></script>\r\n");
      out.write("    <script src=\"lib/fullcalendar.min.js\"></script>\r\n");
      out.write("  <!--____________________________Call Css Page Input____________________________-->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/List.css\">\r\n");
      out.write("    <!--____________________________Title Website____________________________-->\r\n");
      out.write("    <title>Travelendar - Dashboard</title>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    <script>\r\n");
      out.write("\r\n");
      out.write("\t$(document).ready(function() {\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$('#calendar').fullCalendar({\r\n");
      out.write("\t\t\theader: {\r\n");
      out.write("\t\t\t\tleft: 'prev,next today',\r\n");
      out.write("\t\t\t\tcenter: 'title',\r\n");
      out.write("\t\t\t\tright: 'month,agendaWeek,agendaDay,listWeek'\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tdefaultDate: '2017-11-12',\r\n");
      out.write("\t\t\tnavLinks: true, // can click day/week names to navigate views\r\n");
      out.write("\t\t\teditable: false,\r\n");
      out.write("\t\t\teventLimit: true, // allow \"more\" link when too many events\r\n");
      out.write("\t\t\tevents: [\r\n");
      out.write("\r\n");
      out.write("                                ]\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("    </script>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("</head>\r\n");
      out.write("<style>\r\n");
      out.write("body{\r\n");
      out.write("    background-image: url(img/2.jpg);/*call image*/\r\n");
      out.write("    background-position: center center;/*set posisi background agar ditengah*/\r\n");
      out.write("    background-repeat: no-repeat;/*set gambar biar gaberulang*/\r\n");
      out.write("    background-attachment: fixed;/*set gambar agar ketika discroll tidak ikut bergerak*/\r\n");
      out.write("    background-size: cover;/*set ukuran gambar sesuai ukuran layar*/\r\n");
      out.write("    }\r\n");
      out.write("#calendar {\r\n");
      out.write("    max-width: 50%;\r\n");
      out.write("    margin: auto;\r\n");
      out.write("    background-color:#00CBFF;\r\n");
      out.write("    }\r\n");
      out.write("</style>\r\n");
      out.write("<body>\r\n");
      out.write("  <nav class=\"navbar\">\r\n");
      out.write("    <span class=\"open-slide\">\r\n");
      out.write("      <a href=\"#\" onclick=\"openSlideMenu()\">\r\n");
      out.write("        <svg width=\"30\" height=\"30\">\r\n");
      out.write("            <path d=\"M0,5 30,5\" stroke=\"#fff\"stroke-width=\"5\"/>\r\n");
      out.write("            <path d=\"M0,14 30,14\" stroke=\"#fff\" stroke-width=\"5\"/>\r\n");
      out.write("            <path d=\"M0,23 30,23\" stroke=\"#fff\" stroke-width=\"5\"/>\r\n");
      out.write("        </svg>\r\n");
      out.write("      </a>\r\n");
      out.write("    </span>\r\n");
      out.write("    <ul id=\"dropdown\">\r\n");
      out.write("      <li><a href=\"#\">Log Out</a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("  </nav>\r\n");
      out.write("\r\n");
      out.write("  <div id=\"side-menu\" class=\"side-nav\">\r\n");
      out.write("    <a href=\"#\" class=\"btn-close\" onclick=\"closeSlideMenu()\">&times;</a>\r\n");
      out.write("    <a href=\"#\">Dashboard</a>                                                                  \r\n");
      out.write("    <a href=\"addEvent.jsp\">Create Schedule</a>\r\n");
      out.write("    <a href=\"#\">Finished Task</a>\r\n");
      out.write("    <a href=\"lisTData.jsp\">Event List</a>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"main-content\">\r\n");
      out.write("    <div id=\"main\">                                         \r\n");
      out.write("    <div class=\"widget\">\r\n");
      out.write("      <div class=\"title\"><center>Event List</center></div>\r\n");
      out.write("\r\n");
      out.write("      <div id='calendar'></div><br><br><br>\r\n");
      out.write("    \r\n");
      out.write("    </div>\r\n");
      out.write("        \r\n");
      out.write("    </div>\r\n");
      out.write("</div><br><br><br><br><br>\r\n");
      out.write("<!--____________________________Footer Page____________________________--> \r\n");
      out.write("    <div class=\"footer\">\r\n");
      out.write("      <div class=\"footkiri\">\r\n");
      out.write("        <img class=\"logoweb\" src=\"img/L21.png\">\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"footkanan\">\r\n");
      out.write("        <p class=\"pfooter\">  \r\n");
      out.write("        ©Copyright Kelompok B1 [<i><b>Brave Heart-Group</b></i>] | Front-End [Made With Love] | October 2017</p>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("<div id=\"confirm\" class=\"confirm2\">\r\n");
      out.write("  <div class=\"confirm-content\">\r\n");
      out.write("    <span onClick=\"tutup()\" class=\"exit\" >&times;</span>\r\n");
      out.write("      <div class=\"form\">\r\n");
      out.write("          <label style=\"font-weight:bold\">\r\n");
      out.write("              <a>Edit Place</a>\r\n");
      out.write("            </label>\r\n");
      out.write("        <input type=\"text\" placeholder=\"Enter New Place\" name=\"#\" required>\r\n");
      out.write("            <button type=\"submit\" onClick=\"tutup()\" name=\"#\">Update Data</button>\r\n");
      out.write("        </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"ask\" class=\"confirm2\">\r\n");
      out.write("  <div class=\"ask-content\">\r\n");
      out.write("      <span onClick=\"tutup2()\" class=\"exit\" >&times;</span>\r\n");
      out.write("        <div class=\"ask\">\r\n");
      out.write("            <label style=\"font-weight:bold\">\r\n");
      out.write("                <a> &nbsp &nbsp Are You Sure To Delete Data? </a> <br>\r\n");
      out.write("            </label>\r\n");
      out.write("            <button onClick=\"tutup2()\" class=\"b1\" type=\"submit\" name=\"#\">NO</button>  <button onClick=\"tutup2()\" class=\"b2\" type=\"submit\" name=\"#\">YES </button>\r\n");
      out.write("        </div> \r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("  \r\n");
      out.write("<script>\r\n");
      out.write("  function openSlideMenu(){\r\n");
      out.write("    document.getElementById('side-menu').style.width = '250px';\r\n");
      out.write("    document.getElementById('main').style.marginLeft = '250px';\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  function closeSlideMenu(){\r\n");
      out.write("    document.getElementById('side-menu').style.width = '0';\r\n");
      out.write("    document.getElementById('main').style.marginLeft = '0';\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("/*-------------------------Membuat modal Pop Up-----------------------------------------*/\r\n");
      out.write("  function openo()\r\n");
      out.write("  {\r\n");
      out.write("    document.getElementById(\"confirm\").style.display = \"block\"\r\n");
      out.write("  }\r\n");
      out.write("  function opena()\r\n");
      out.write("  {\r\n");
      out.write("    document.getElementById(\"ask\").style.display = \"block\"\r\n");
      out.write("  }\r\n");
      out.write("  function tutup()\r\n");
      out.write("  {\r\n");
      out.write("    document.getElementById(\"confirm\").style.display = \"none\"\r\n");
      out.write("  }\r\n");
      out.write("  function tutup2()\r\n");
      out.write("  {\r\n");
      out.write("    document.getElementById(\"ask\").style.display = \"none\"\r\n");
      out.write("  }\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html> ");
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
