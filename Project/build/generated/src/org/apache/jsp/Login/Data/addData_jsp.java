package org.apache.jsp.Login.Data;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addData_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>EVENT</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <h1>ADD EVENT TRAVELLER!</h1>\r\n");
      out.write("        ");
 
            String dateTraveller = request.getParameter("date");
            String nameTraveller = request.getParameter("event");
            String destinationTraveller = request.getParameter("destination");
            String transfortationTraveller = request.getParameter("transfortation");
            String arriveTraveller = request.getParameter("arrive");
            String departTraveller = request.getParameter("depart");
            String durationTraveller = request.getParameter("duration");
            String startTraveller = request.getParameter("start");
        
      out.write("\r\n");
      out.write("        <table border=\"1\">\r\n");
      out.write("            <thead>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th>DATE :</th>\r\n");
      out.write("                    <th> ");
      out.print( dateTraveller );
      out.write(" </th>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </thead>\r\n");
      out.write("            <tbody>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>NAME :</td>\r\n");
      out.write("                    <td>");
      out.print( nameTraveller );
      out.write("</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>DESTINATION</td>\r\n");
      out.write("                    <td>");
      out.print( destinationTraveller );
      out.write("</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>TRANSFORTATION</td>\r\n");
      out.write("                    <td>");
      out.print( transfortationTraveller );
      out.write("</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>TIME ARRIVE</td>\r\n");
      out.write("                    <td>");
      out.print( arriveTraveller );
      out.write("</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>TIME DEPART</td>\r\n");
      out.write("                    <td>");
      out.print( departTraveller );
      out.write("</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>DURATION TIME</td>\r\n");
      out.write("                    <td>");
      out.print( durationTraveller );
      out.write("</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </tbody>\r\n");
      out.write("            <a href=\"addEvent.jsp\">Tambah Data</a>\r\n");
      out.write("        </table>\r\n");
      out.write("\r\n");
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
