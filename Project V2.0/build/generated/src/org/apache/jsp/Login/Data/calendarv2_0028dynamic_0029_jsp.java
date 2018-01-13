package org.apache.jsp.Login.Data;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import DAO.DAONewEvent;
import model.NewEvent;
import DAO.DAONewLokasi;
import model.NewLokasi;
import java.util.*;
import java.text.SimpleDateFormat;

public final class calendarv2_0028dynamic_0029_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("   \r\n");
      out.write("    <link href='lib/lain/fullcalendar.min.css' rel='stylesheet' />\r\n");
      out.write("    \r\n");
      out.write("    <script src='lib/moment.min.js'></script>    \r\n");
      out.write("    <script src='lib/jquery.min.js'></script>\r\n");
      out.write("    <script src='lib/lain/fullcalendar.min.js'></script>\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  #calendar {\r\n");
      out.write("    max-width: 70%;\r\n");
      out.write("   \r\n");
      out.write("\r\n");
      out.write("    margin: 0 auto;\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div id='calendar'></div>            \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("<script>\r\n");
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
      out.write("\r\n");
      out.write("    $(document).ready(function() {\r\n");
      out.write("\r\n");
      out.write("      $('#calendar').fullCalendar({\r\n");
      out.write("        header: {\r\n");
      out.write("          left: 'prev,next today',\r\n");
      out.write("          center: 'title',\r\n");
      out.write("          right: 'month,agendaWeek,agendaDay,listWeek'\r\n");
      out.write("        },\r\n");
      out.write("        defaultDate: '2017-11-12',\r\n");
      out.write("        navLinks: true, // can click day/week names to navigate views\r\n");
      out.write("        editable: true,\r\n");
      out.write("        eventLimit: true, // allow \"more\" link when too many events\r\n");
      out.write("        events: [\r\n");
      out.write("          ");
                        
                for (int x = 0; x < data.size(); x++) {
                
      out.write("\r\n");
      out.write("                          {\r\n");
      out.write("                              title: '");
      out.print(data.get(x).getNamaEvent());
      out.write("',\r\n");
      out.write("                              start: '");
      out.print(format.format(data.get(x).getWaktuMulai()));
      out.write("',\r\n");
      out.write("                              end: '");
      out.print(format.format(data.get(x).getWaktuSelesai()));
      out.write("',\r\n");
      out.write("                                                                  },\r\n");
      out.write("              ");
}
      out.write("\r\n");
      out.write("        ]\r\n");
      out.write("      });\r\n");
      out.write("\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
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
