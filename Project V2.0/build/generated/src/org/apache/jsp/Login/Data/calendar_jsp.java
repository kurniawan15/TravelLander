package org.apache.jsp.Login.Data;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.SimpleDateFormat;
import DAO.DAONewEvent;
import model.NewEvent;
import DAO.DAONewLokasi;
import model.NewLokasi;
import java.util.*;

public final class calendar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  <link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("  <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\r\n");
      out.write("  \r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <link href='lib/lain/fullcalendar.min.css' rel='stylesheet' />\r\n");
      out.write("    \r\n");
      out.write("    <script src='lib/moment.min.js'></script>    \r\n");
      out.write("    <script src='lib/jquery.min.js'></script>\r\n");
      out.write("    <script src='lib/lain/fullcalendar.min.js'></script>\r\n");
      out.write("    \r\n");
      out.write("      ");

            String username = (String) session.getAttribute("USERNAME");
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            DAONewEvent ev = new DAONewEvent();
            List<NewEvent> data = new ArrayList<NewEvent>();
            String ket = request.getParameter("ket");
            data = ev.tampil();
            ev.setKdEvent("");

         
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    <script>\r\n");
      out.write("\r\n");
      out.write("  $(document).ready(function() {\r\n");
      out.write("    \r\n");
      out.write("    $('#calendar').fullCalendar({\r\n");
      out.write("      header: {\r\n");
      out.write("        left: 'prev,next today',\r\n");
      out.write("        center: 'title',\r\n");
      out.write("        right: 'month,agendaWeek,agendaDay,listWeek'\r\n");
      out.write("      },\r\n");
      out.write("      defaultDate: '2017-11-12',\r\n");
      out.write("      navLinks: true, // can click day/week names to navigate views\r\n");
      out.write("      editable: false,\r\n");
      out.write("      businessHours: true, \r\n");
      out.write("      eventLimit: true, // allow \"more\" link when too many events\r\n");
      out.write("      timeFormat: 'H(:mm)',\r\n");
      out.write("            events: [\r\n");
      out.write("        ");
                        
              for (int x = 0; x < data.size(); x++) {
              
      out.write("\r\n");
      out.write("                        {\r\n");
      out.write("                            title: '");
      out.print(data.get(x).getNamaEvent());
      out.write("',\r\n");
      out.write("                            start: '");
      out.print(format.format(data.get(x).getWaktuMulai()));
      out.write("',\r\n");
      out.write("                            end: '");
      out.print(format.format(data.get(x).getWaktuSelesai()));
      out.write("'\r\n");
      out.write("                                                                },\r\n");
      out.write("            ");
}
      out.write("\r\n");
      out.write("      ]\r\n");
      out.write("    });\r\n");
      out.write("    \r\n");
      out.write("  });\r\n");
      out.write("\r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  #calendar {\r\n");
      out.write("    max-width: 70%;\r\n");
      out.write("\r\n");
      out.write("    margin: 0 auto;\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<style>\r\n");
      out.write("  body{\r\n");
      out.write("    background-image: url(img/backweb.jpg);/*call image*/\r\n");
      out.write("    background-position: center center;/*set posisi background agar ditengah*/\r\n");
      out.write("    background-repeat: no-repeat;/*set gambar biar gaberulang*/\r\n");
      out.write("    background-attachment: fixed;/*set gambar agar ketika discroll tidak ikut bergerak*/\r\n");
      out.write("    background-size: cover;/*set ukuran gambar sesuai ukuran layar*/\r\n");
      out.write("    }\r\n");
      out.write("</style>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div class=\"flex-container\">\r\n");
      out.write("<div class=\"headbar\">\r\n");
      out.write("<header>\r\n");
      out.write("  <center><img class=\"logoweb\" src=\"img/L210.png\"></center>\r\n");
      out.write("</header>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<nav class=\"nav\">\r\n");
      out.write("<ul>\r\n");
      out.write("   <br><br><br>\r\n");
      out.write("    <a href=\"myEvent.jsp\"><li class=\"none\"><i class=\"material-icons\" style=\"font-size:20px;color:white; padding-right: 30px;\">home</i>Dasboard</li></a>\r\n");
      out.write("    <li class=\"pilih\"><i class=\"material-icons\" style=\"font-size:20px;color:white\">date_range</i>Calendar</li>\r\n");
      out.write("    <a href=\"addEvent.jsp\"><li class=\"none\"><i class=\"material-icons\" style=\"font-size:20px;color:white; padding-right: 30px;\">add</i>Create Schedule</li></a>\r\n");
      out.write("    <a href=\"listData.jsp.jsp\"><li class=\"none\"><i class=\"material-icons\" style=\"font-size:20px;color:white; padding-right: 30px;\">done</i>Finished Task</li>\r\n");
      out.write("    <a href=\"PageEventList.jsp\"><li class=\"none\"><i class=\"material-icons\" style=\"font-size:20px;color:white; padding-right: 30px;\">list</i>Event List</li></a>\r\n");
      out.write("    <a href=\"#\"><li class=\"none\"><i class=\"material-icons\" style=\"font-size:20px;color:white; padding-right: 30px;\">build</i>Manage</li></a>\r\n");
      out.write("</ul>\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("<article class=\"article\">\r\n");
      out.write("  <div class=\"contentlist\">\r\n");
      out.write("  <div id=\"main\">                                         \r\n");
      out.write("  <br><br><br><br><br>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("      <div id='calendar'></div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("   \r\n");
      out.write("  </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</article>\r\n");
      out.write("\r\n");
      out.write("<footer>Copyright &copy; Kelompok B1 | Front-End [Made With Love] </footer>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
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
