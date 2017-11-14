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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("  <!--____________________________Call Css Page Input____________________________-->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/List.css\">\n");
      out.write("    <!--____________________________Title Website____________________________-->\n");
      out.write("    <title>Travelendar - Dashboard</title>\n");
      out.write("</head>\n");
      out.write("<style>\n");
      out.write("body{\n");
      out.write("    background-image: url(img/2.jpg);/*call image*/\n");
      out.write("    background-position: center center;/*set posisi background agar ditengah*/\n");
      out.write("    background-repeat: no-repeat;/*set gambar biar gaberulang*/\n");
      out.write("    background-attachment: fixed;/*set gambar agar ketika discroll tidak ikut bergerak*/\n");
      out.write("    background-size: cover;/*set ukuran gambar sesuai ukuran layar*/\n");
      out.write("    }\n");
      out.write("</style>\n");
      out.write("<body>\n");
      out.write("  <nav class=\"navbar\">\n");
      out.write("    <span class=\"open-slide\">\n");
      out.write("      <a href=\"#\" onclick=\"openSlideMenu()\">\n");
      out.write("        <svg width=\"30\" height=\"30\">\n");
      out.write("            <path d=\"M0,5 30,5\" stroke=\"#fff\"stroke-width=\"5\"/>\n");
      out.write("            <path d=\"M0,14 30,14\" stroke=\"#fff\" stroke-width=\"5\"/>\n");
      out.write("            <path d=\"M0,23 30,23\" stroke=\"#fff\" stroke-width=\"5\"/>\n");
      out.write("        </svg>\n");
      out.write("      </a>\n");
      out.write("    </span>\n");
      out.write("    <ul id=\"dropdown\">\n");
      out.write("      <li><a href=\"#\">Log Out</a></li>\n");
      out.write("    </ul>\n");
      out.write("  </nav>\n");
      out.write("\n");
      out.write("  <div id=\"side-menu\" class=\"side-nav\">\n");
      out.write("    <a href=\"#\" class=\"btn-close\" onclick=\"closeSlideMenu()\">&times;</a>\n");
      out.write("    <a href=\"#\">Dashboard</a>                                                                  \n");
      out.write("    <a href=\"addEvent.jsp\">Create Schedule</a>\n");
      out.write("    <a href=\"#\">Finished Task</a>\n");
      out.write("    <a href=\"lisTData.jsp\">Event List</a>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("<div class=\"main-content\">\n");
      out.write("    <div id=\"main\">                                         \n");
      out.write("    \n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("</div><br><br><br><br><br>\n");
      out.write("<!--____________________________Footer Page____________________________--> \n");
      out.write("    <div class=\"footer\">\n");
      out.write("      <div class=\"footkiri\">\n");
      out.write("        <img class=\"logoweb\" src=\"img/L21.png\">\n");
      out.write("      </div>\n");
      out.write("      <div class=\"footkanan\">\n");
      out.write("        <p class=\"pfooter\">  \n");
      out.write("        ©Copyright Kelompok B1 [<i><b>Brave Heart-Group</b></i>] | Front-End [Made With Love] | October 2017</p>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("<div id=\"confirm\" class=\"confirm2\">\n");
      out.write("  <div class=\"confirm-content\">\n");
      out.write("    <span onClick=\"tutup()\" class=\"exit\" >&times;</span>\n");
      out.write("      <div class=\"form\">\n");
      out.write("          <label style=\"font-weight:bold\">\n");
      out.write("              <a>Edit Place</a>\n");
      out.write("            </label>\n");
      out.write("        <input type=\"text\" placeholder=\"Enter New Place\" name=\"#\" required>\n");
      out.write("            <button type=\"submit\" onClick=\"tutup()\" name=\"#\">Update Data</button>\n");
      out.write("        </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<div id=\"ask\" class=\"confirm2\">\n");
      out.write("  <div class=\"ask-content\">\n");
      out.write("      <span onClick=\"tutup2()\" class=\"exit\" >&times;</span>\n");
      out.write("        <div class=\"ask\">\n");
      out.write("            <label style=\"font-weight:bold\">\n");
      out.write("                <a> &nbsp &nbsp Are You Sure To Delete Data? </a> <br>\n");
      out.write("            </label>\n");
      out.write("            <button onClick=\"tutup2()\" class=\"b1\" type=\"submit\" name=\"#\">NO</button>  <button onClick=\"tutup2()\" class=\"b2\" type=\"submit\" name=\"#\">YES </button>\n");
      out.write("        </div> \n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("  \n");
      out.write("<script>\n");
      out.write("  function openSlideMenu(){\n");
      out.write("    document.getElementById('side-menu').style.width = '250px';\n");
      out.write("    document.getElementById('main').style.marginLeft = '250px';\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  function closeSlideMenu(){\n");
      out.write("    document.getElementById('side-menu').style.width = '0';\n");
      out.write("    document.getElementById('main').style.marginLeft = '0';\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("/*-------------------------Membuat modal Pop Up-----------------------------------------*/\n");
      out.write("  function openo()\n");
      out.write("  {\n");
      out.write("    document.getElementById(\"confirm\").style.display = \"block\"\n");
      out.write("  }\n");
      out.write("  function opena()\n");
      out.write("  {\n");
      out.write("    document.getElementById(\"ask\").style.display = \"block\"\n");
      out.write("  }\n");
      out.write("  function tutup()\n");
      out.write("  {\n");
      out.write("    document.getElementById(\"confirm\").style.display = \"none\"\n");
      out.write("  }\n");
      out.write("  function tutup2()\n");
      out.write("  {\n");
      out.write("    document.getElementById(\"ask\").style.display = \"none\"\n");
      out.write("  }\n");
      out.write("</script>\n");
      out.write("</body>\n");
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
