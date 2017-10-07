package org.apache.jsp.Login.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class calender_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("<title>Super Admin</title>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/index.css\" />\n");
      out.write("<script type=\"text/javascript\" src=\"Js/date.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"Js/place.js\"></script>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/calendar.css\"/>\n");
      out.write("<link rel=\"stylesheet\" href=\"lib/fullcalendar.css\">\n");
      out.write("\n");
      out.write("<script src=\"lib/jquery.min.js\"> </script>\n");
      out.write("<script src=\"lib/moment.min.js\"></script>\n");
      out.write("<script src=\"lib/fullcalendar.min.js\"></script>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("\t$(document).ready(function() {\n");
      out.write("\t\t\n");
      out.write("\t\t$('#calendar').fullCalendar({\n");
      out.write("\t\t\theader: {\n");
      out.write("\t\t\t\tleft: 'prev,next today',\n");
      out.write("\t\t\t\tcenter: 'title',\n");
      out.write("\t\t\t\tright: 'month,agendaWeek,agendaDay,listWeek'\n");
      out.write("\t\t\t},\n");
      out.write("\t\t\tdefaultDate: '2017-09-12',\n");
      out.write("\t\t\tnavLinks: true, // can click day/week names to navigate views\n");
      out.write("\t\t\teditable: true,\n");
      out.write("\t\t\teventLimit: true, // allow \"more\" link when too many events\n");
      out.write("\t\t\tevents: [\n");
      out.write("\t\t\t\t{\n");
      out.write("\t\t\t\t\ttitle: 'All Day Event',\n");
      out.write("\t\t\t\t\tstart: '2017-09-01',\n");
      out.write("\t\t\t\t},\n");
      out.write("\t\t\t\t{\n");
      out.write("\t\t\t\t\ttitle: 'Long Event',\n");
      out.write("\t\t\t\t\tstart: '2017-09-07',\n");
      out.write("\t\t\t\t\tend: '2017-09-10'\n");
      out.write("\t\t\t\t},\n");
      out.write("\t\t\t\t{\n");
      out.write("\t\t\t\t\tid: 999,\n");
      out.write("\t\t\t\t\ttitle: 'Repeating Event',\n");
      out.write("\t\t\t\t\tstart: '2017-09-09T16:00:00'\n");
      out.write("\t\t\t\t},\n");
      out.write("\t\t\t\t{\n");
      out.write("\t\t\t\t\tid: 999,\n");
      out.write("\t\t\t\t\ttitle: 'Repeating Event',\n");
      out.write("\t\t\t\t\tstart: '2017-09-16T16:00:00'\n");
      out.write("\t\t\t\t},\n");
      out.write("\t\t\t\t{\n");
      out.write("\t\t\t\t\ttitle: 'Conference',\n");
      out.write("\t\t\t\t\tstart: '2017-09-11',\n");
      out.write("\t\t\t\t\tend: '2017-09-13'\n");
      out.write("\t\t\t\t},\n");
      out.write("\t\t\t\t{\n");
      out.write("\t\t\t\t\ttitle: 'Meeting',\n");
      out.write("\t\t\t\t\tstart: '2017-09-12T10:30:00',\n");
      out.write("\t\t\t\t\tend: '2017-09-12T12:30:00'\n");
      out.write("\t\t\t\t},\n");
      out.write("\t\t\t\t{\n");
      out.write("\t\t\t\t\ttitle: 'Lunch',\n");
      out.write("\t\t\t\t\tstart: '2017-09-12T12:00:00'\n");
      out.write("\t\t\t\t},\n");
      out.write("\t\t\t\t{\n");
      out.write("\t\t\t\t\ttitle: 'Meeting',\n");
      out.write("\t\t\t\t\tstart: '2017-09-12T14:30:00'\n");
      out.write("\t\t\t\t},\n");
      out.write("\t\t\t\t{\n");
      out.write("\t\t\t\t\ttitle: 'Happy Hour',\n");
      out.write("\t\t\t\t\tstart: '2017-09-12T17:30:00'\n");
      out.write("\t\t\t\t},\n");
      out.write("\t\t\t\t{\n");
      out.write("\t\t\t\t\ttitle: 'Dinner',\n");
      out.write("\t\t\t\t\tstart: '2017-09-12T20:00:00'\n");
      out.write("\t\t\t\t},\n");
      out.write("\t\t\t\t{\n");
      out.write("\t\t\t\t\ttitle: 'Birthday Party',\n");
      out.write("\t\t\t\t\tstart: '2017-09-13T07:00:00'\n");
      out.write("\t\t\t\t},\n");
      out.write("\t\t\t\t{\n");
      out.write("\t\t\t\t\ttitle: 'Click for Google',\n");
      out.write("\t\t\t\t\turl: 'http://google.com/',\n");
      out.write("\t\t\t\t\tstart: '2017-09-28'\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t]\n");
      out.write("\t\t});\n");
      out.write("\t\t\n");
      out.write("\t});\n");
      out.write("</script>\n");
      out.write("<style>\n");
      out.write("\t#calendar {\n");
      out.write("\t\tmax-width: 90%;\n");
      out.write("\t\tmargin: 0 auto;\n");
      out.write("\t}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\t\t\t\t\t\n");
      out.write("<div id=\"header\">\n");
      out.write("   \t<div class=\"logo\"><a href=\"#\">Travel<span>Calendar</span></a></div>\n");
      out.write("\t<ul id=\"dropdown\">\n");
      out.write("\t\t\t<li><a href=\"#\">Log Out</a></li>\n");
      out.write("\t</ul>\n");
      out.write("</div>\n");
      out.write("    \n");
      out.write("    <div id=\"container\">\n");
      out.write("    \t<div class=\"sidebar\">\n");
      out.write("        <ul id=\"nav\">\n");
      out.write("        \t<li><a class=\"selected\" href=\"#\">Calendar</a></li>\n");
      out.write("            <li><a href=\"DataPlace.jsp\">Manage Place</a></li>\n");
      out.write("            <li><a href=\"distance.jsp\">Manage Distance</a></li>\n");
      out.write("            <li><a href=\"time.jsp\">Manage Time</a></li>\n");
      out.write("            <li><a href=\"transpotation.jsp\">Manage Transpotation</a></li>\n");
      out.write("      \t</ul>\n");
      out.write("        \n");
      out.write("            \n");
      out.write("    \t</div>\n");
      out.write("        \n");
      out.write("<div class=\"content\">\n");
      out.write("        \t<h1></h1>\n");
      out.write("            <p>Calendar</p>                      \n");
      out.write("            \t<div id=\"box\">                    \n");
      out.write("                 \t<div class=\"box-panel\">\n");
      out.write("                    \t<h2></h2>\n");
      out.write("                        <div id=\"calendar\">\n");
      out.write("                       </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("   </div>\n");
      out.write("   </div>\n");
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
