package org.apache.jsp.Login.Data;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class input_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>Helooo</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/home.css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"Js/date.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"Js/place.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/calendar.css\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<script src=\"https://maps.googleapis.com/maps/api/js?v=3.exp&signedin=true&libraries=places\"></script>\r\n");
      out.write("\t<div id=\"header\">\r\n");
      out.write("    \t<div class=\"logo\"><a href=\"#\">Haloo<span>Source</span></a></div>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <div id=\"container\">\r\n");
      out.write("    \t<div class=\"sidebar\">\r\n");
      out.write("        <ul id=\"nav\">\r\n");
      out.write("        \t<li><a href=\"#\">Dashboard</a></li>\r\n");
      out.write("            <li><a class=\"selected\" href=\"#\">Create scedule</a></li>\r\n");
      out.write("            <li><a href=\"#\">Finished Task</a></li>\r\n");
      out.write("            <li><a href=\"#\">Pending or Cancle</a></li>\r\n");
      out.write("             ");

            String nama = session.getAttribute("id_Admin").toString();
        //    out.println("Selamat Datang " + nama +"<br> Anda berhasil Login");
            
      out.write("\r\n");
      out.write("            <li><a href=\"../logout.jsp\">LOGOUT</a></li>\r\n");
      out.write("      \t</ul>\r\n");
      out.write("            \r\n");
      out.write("        <div id=\"calendar\">\r\n");
      out.write("\t    <p id=\"calendar-day\"></p>\r\n");
      out.write("            <p id=\"calendar-date\"></p>\r\n");
      out.write("            <p id=\"calendar-month-year\"></p>\r\n");
      out.write("         </div>\r\n");
      out.write("            \r\n");
      out.write("    \t</div>\r\n");
      out.write("        \r\n");
      out.write("    \t<div class=\"content\">\r\n");
      out.write("        \t<h1></h1>\r\n");
      out.write("           <form name=\"myForm\" action=\"addData.jsp\" method=\"POST\">\r\n");
      out.write("            <p>Create Scedule</p>\r\n");
      out.write("            \r\n");
      out.write("            <div id=\"box\">\r\n");
      out.write("            \t<div class=\"box-top\">Please Input Created In here</div>\r\n");
      out.write("                <div class=\"box-panel\">\r\n");
      out.write("                <h2></h2>\r\n");
      out.write("                \t<div id=\"imput1\">\r\n");
      out.write("                    \tnama acara       : \r\n");
      out.write("                \t\t<input type=\"text\" name=\"event\" placeholder=\"Untitled event\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div id=\"imput2\">\r\n");
      out.write("                    \tImput waktu :\r\n");
      out.write("                    \t<input type=\"datetime-local\" name=\"arrive\" placeholder=\"start time\"> until \r\n");
      out.write("                    \t<input type=\"datetime-local\" name=\"depart\" placeholder=\"end time\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div id=\"boxin\">\r\n");
      out.write("                    \tEvent Details\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div id=\"imput3\">\r\n");
      out.write("                    \tSarting Point \t:\r\n");
      out.write("                    \t<input type=\"text\" name=\"start\" style=\"width:52%\" placeholder=\"Posisi Akhir\">\r\n");
      out.write("           \t\t\t</div>\r\n");
      out.write("                    <div id=\"imput5\">\r\n");
      out.write("                    Destination\t:\r\n");
      out.write("                    \t<input type=\"text\" name=\"destination\" style=\"width:51%\" placeholder=\"enter a location\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"wrap\">\r\n");
      out.write("                        <form action=\"\" class=\"choise\">\r\n");
      out.write("                            <div class=\"radio\">\r\n");
      out.write("                                <h2>Transportation</h2>\r\n");
      out.write("                                <input type=\"radio\" name=\"transfortation\" id=\"Sepedah\">\r\n");
      out.write("                                    <label for=\"Sepedah\">Sepedah</label>\r\n");
      out.write("                                    \r\n");
      out.write("                              <input type=\"radio\" name=\"transfortation\" id=\"Mobil\">\r\n");
      out.write("                                    <label for=\"Mobil\">Mobil</label>\r\n");
      out.write("                                    \r\n");
      out.write("                                <input type=\"radio\" name=\"transfortation\" id=\"Motor\">\r\n");
      out.write("                                    <label for=\"Motor\">Motor</label>\r\n");
      out.write("                                    \r\n");
      out.write("                                <input type=\"radio\" name=\"transfortation\" id=\"Pesawat\">\r\n");
      out.write("                                    <label for=\"Pesawat\">Pesawat</label>\r\n");
      out.write("                                    \r\n");
      out.write("                              \t<input type=\"radio\" name=\"transfortation\" id=\"Perahu\">\r\n");
      out.write("                                    <label for=\"Perahu\">Perahu</label>\r\n");
      out.write("                 \t\t\r\n");
      out.write("                                 <input type=\"radio\" name=\"transfortation\" id=\"Kereta\">\r\n");
      out.write("                                    <label for=\"Kereta\">Kereta</label>\r\n");
      out.write("                                    \r\n");
      out.write("                           \t\t<input type=\"radio\" name=\"transfortation\" id=\"Kendaraan_Umum\">\r\n");
      out.write("                                    <label for=\"Kendaraan_Umum\">Kendaraan Umum</label>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </form>\r\n");
      out.write("                \t</div>    \r\n");
      out.write("                    <input type=\"submit\" name=\"#\" value=\" created\"> \r\n");
      out.write("               \t\r\n");
      out.write("                </div>\r\n");
      out.write("    \t</div\r\n");
      out.write("    </div>\r\n");
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
