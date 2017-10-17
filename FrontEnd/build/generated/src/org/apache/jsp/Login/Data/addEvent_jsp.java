package org.apache.jsp.Login.Data;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addEvent_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\r\n");
      out.write("  <meta charset=\"UTF-8\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\r\n");
      out.write("  <title>Input Schedule</title>\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"css/index.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<style>\r\n");
      out.write("body{\r\n");
      out.write(" /* Location of the image */\r\n");
      out.write("  background-image: url(img/2.jpg);\r\n");
      out.write("  \r\n");
      out.write("  /* Background image is centered vertically and horizontally at all times */\r\n");
      out.write("  background-position: center center;\r\n");
      out.write("  \r\n");
      out.write("  /* Background image doesn't tile */\r\n");
      out.write("  background-repeat: no-repeat;\r\n");
      out.write("  \r\n");
      out.write("  /* Background image is fixed in the viewport so that it doesn't move when \r\n");
      out.write("     the content's height is greater than the image's height */\r\n");
      out.write("  background-attachment: fixed;\r\n");
      out.write("  \r\n");
      out.write("  /* This is what makes the background image rescale based\r\n");
      out.write("     on the container's size */\r\n");
      out.write("  background-size: cover;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
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
      out.write("    \t<li><a href=\"#\">Log Out</a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("  </nav>\r\n");
      out.write("\r\n");
      out.write("  <div id=\"side-menu\" class=\"side-nav\">\r\n");
      out.write("    <a href=\"#\" class=\"btn-close\" onclick=\"closeSlideMenu()\">&times;</a>\r\n");
      out.write("    <a href=\"#\">Calendar</a>                                                                                   \r\n");
      out.write("    <a href=\"#\">Manage Place</a>\r\n");
      out.write("    <a href=\"#\">Manage Distance</a>\r\n");
      out.write("    <a href=\"#\">Manage Time</a>\r\n");
      out.write("    <a href=\"#\">Manage Transpotation</a>\r\n");
      out.write("  </div>\r\n");
      out.write("<div class=\"main-content\">\r\n");
      out.write("\t  <div id=\"main\">\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t<div class=\"widget\">\r\n");
      out.write("\t\t\t<div class=\"title\">Create Schedule</div>\r\n");
      out.write("          <div class=\"col-12\">\r\n");
      out.write("              <div class=\"col-5 namaevent\">\r\n");
      out.write("              <h1 style=\"font-size: 15px; padding-top: 2%; padding-left: 1%;\">Event Name :</h1>\r\n");
      out.write("              <input type=\"text\" id=\"fname\" name=\"namaevent\" placeholder=\"Input Event Name\">\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"col-5 waktu\">\r\n");
      out.write("              <h1 style=\"font-size: 15px; padding-left: 1%; padding-bottom: 1%;\">Event Time :</h1>\r\n");
      out.write("              <input type=\"datetime-local\" style=\"width: 230px; border-radius:5px;\r\n");
      out.write("    box-sizing: border-box; width: 100%; padding-top: 2%; padding-bottom: 2%; padding-left:4%; opacity: 0.8;\" name=\"waktu_mulai\" placeholder=\"start time\">     \r\n");
      out.write("              </div>\r\n");
      out.write("          </div>\r\n");
      out.write("              <div class=\"col-5 LokasiAwal\">\r\n");
      out.write("                <h1 style=\"font-size: 15px; padding-left: 1%; padding-top: 2%; opacity: 1;\">Start Location :</h1>\r\n");
      out.write("               <select id=\"LokasiAwal\" name=\"LokasiAwal\">\r\n");
      out.write("                  <option value=\"Lokasi1\">Lokasi 1</option>\r\n");
      out.write("                  <option value=\"Lokasi2\">Lokasi 2</option>\r\n");
      out.write("                  <option value=\"Lokasi3\">Lokasi 3</option>\r\n");
      out.write("                  <option value=\"Lokasi4\">Lokasi 4</option>\r\n");
      out.write("                  <option value=\"Lokasi5\">Lokasi 5</option>\r\n");
      out.write("                </select>     \r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"col-5 LokasiAkhir\">\r\n");
      out.write("                <h1 style=\"font-size: 15px; padding-left: 1%; padding-top: 1%;\">End Location :</h1>\r\n");
      out.write("              <input type=\"text\" id=\"fname\" name=\"Username\" placeholder=\"Lokasi Akhir\">  \r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"col-5 create\">\r\n");
      out.write("                <input type=\"submit\" value=\"Create Schedule\">\r\n");
      out.write("            </div>   \r\n");
      out.write("            <br> \r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t  </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("  <script>\r\n");
      out.write("/*----------------------------edit buat mav----------------------------------------------*/\r\n");
      out.write("    function openSlideMenu(){\r\n");
      out.write("      document.getElementById('side-menu').style.width = '250px';\r\n");
      out.write("      document.getElementById('main').style.marginLeft = '250px';\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function closeSlideMenu(){\r\n");
      out.write("      document.getElementById('side-menu').style.width = '0';\r\n");
      out.write("      document.getElementById('main').style.marginLeft = '0';\r\n");
      out.write("    }\r\n");
      out.write("\t\r\n");
      out.write("/*-------------------------Membuat modal Pop Up-----------------------------------------*/\r\n");
      out.write("\r\n");
      out.write("\tfunction openo()\r\n");
      out.write("\t{\r\n");
      out.write("\t\tdocument.getElementById(\"confirm\").style.display = \"block\"\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction opena()\r\n");
      out.write("\t{\r\n");
      out.write("\t\tdocument.getElementById(\"ask\").style.display = \"block\"\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction tutup()\r\n");
      out.write("\t{\r\n");
      out.write("\t\tdocument.getElementById(\"confirm\").style.display = \"none\"\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction tutup2()\r\n");
      out.write("\t{\r\n");
      out.write("\t\tdocument.getElementById(\"ask\").style.display = \"none\"\r\n");
      out.write("\t}\r\n");
      out.write("  </script>\r\n");
      out.write("<div class=\"footer\">\r\n");
      out.write("    <p>© Copyright Kelompok B2 | October 2017</p>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
