package org.apache.jsp.Login.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import repository.LokasiDAO;
import java.util.ArrayList;
import java.util.List;
import model.Lokasi;

public final class DataPlace_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!doctype html>\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"UTF-8\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\r\n");
      out.write("  <title>Super Admin</title>\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("</head>\r\n");
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
      out.write("    \t<li><a href=\"../logout.jsp\">Log Out</a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("  </nav>\r\n");
      out.write("\r\n");
      out.write("  <div id=\"side-menu\" class=\"side-nav\">\r\n");
      out.write("    <a href=\"#\" class=\"btn-close\" onclick=\"closeSlideMenu()\">&times;</a>\r\n");
      out.write("    <a href=\"calender.jsp\">Calendar</a>                                                                                   \r\n");
      out.write("    <a class=\"selected\" href=\"#\">Manage Place</a>\r\n");
      out.write("    <a href=\"distance.jsp\">Manage Distance</a>\r\n");
      out.write("    <a href=\"time.jsp\">Manage Time</a>\r\n");
      out.write("    <a href=\"transportation.jsp\" >Manage Transpotation</a>\r\n");
      out.write("  </div>\r\n");
      out.write("<div class=\"main-content\">\r\n");
      out.write("\t  <div id=\"main\">\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t<div class=\"widget\">\r\n");
      out.write("\t\t\t<div class=\"title\">Manage Place</div>\r\n");
      out.write("            <table class=\"table\">\r\n");
      out.write("            <tr>\r\n");
      out.write("                <th>NO</th>\r\n");
      out.write("                <th>Adrees</th>\r\n");
      out.write("                <th>Place</th>\r\n");
      out.write("                <th>Action</th>\r\n");
      out.write("            </tr>\r\n");
      out.write("            \r\n");
      out.write("            ");

                String driverName = "com.mysql.jdbc.Driver"; // Driver Untuk Koneksi Ke MySQL  
                String jdbc = "jdbc:mysql://";  
                String host = "localhost:"; // Bisa Menggunakan IP Anda, Cnth : 192.168.100.100  
                String port = "3306/"; // Port ini port MySQL  
                String database = "travelender"; // Ini Database yang akan digunakan  

                String jdbcURL = jdbc + host + port + database;  
                String jdbcUsername = "root"; // username default mysql  
                String jdbcPassword = "";
                
                List<Lokasi> listLokasi = new ArrayList();
                LokasiDAO lokasiDAO = new LokasiDAO(jdbcURL, jdbcUsername, jdbcPassword);
                listLokasi = lokasiDAO.listAll();
                 int i = 1;
                for(Lokasi lo : listLokasi){
                    
      out.write("\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td title=\"NO\">");
      out.print(i);
      out.write("</td>\r\n");
      out.write("                <td title=\"Adrees\">");
 out.print(lo.getAlamat());
      out.write(" </td>\r\n");
      out.write("                <td title=\"Place\">");
 out.print(lo.getNamaLokasi());
      out.write("</td>\r\n");
      out.write("                <td title=\"Action\"><input type=\"submit\" onClick=\"openo()\" class=\"button1\" name=\"\" value=\" Edit \">&nbsp <input type=\"submit\" onClick=\"opena()\" class=\"button2\" name=\"\" value=\" Delete\"></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("                    ");

                i++;
            }
            
      out.write("\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            </table>\r\n");
      out.write("\t\t\t<div class=\"tex\">\r\n");
      out.write("           <p></p>\r\n");
      out.write("            </div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("            <form method=\"post\" action=\"lokasiController.jsp\" name=\"lokasi\" id=\"lokasi\">    \r\n");
      out.write("        <div class=\"widget\">\r\n");
      out.write("        \t<div class=\"title\"> \r\n");
      out.write("            \tImput Place \r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"imput\">\r\n");
      out.write("            \tImput New Place \r\n");
      out.write("                <input type=\"text\" placeholder=\"Enter New Place\" name=\"nama_lokasi\" required>\r\n");
      out.write("                Input New Address\r\n");
      out.write("                <textarea class=\"address\"  rows=\"4\" cols=\"50\" name=\"alamat\" form=\"lokasi\" placeholder=\"Enter Imput Address In here...\">\r\n");
      out.write("                    \r\n");
      out.write("                </textarea>\r\n");
      out.write("                <button type=\"submit\" class=\"ImputButton\" onClick=\"tutup()\" name=\"#\">Update Data</button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("            </form>\r\n");
      out.write("\t  </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"confirm\" class=\"confirm2\">\r\n");
      out.write("\t<div class=\"confirm-content\">\r\n");
      out.write("    <span onClick=\"tutup()\" class=\"exit\" >&times;</span>\r\n");
      out.write("    \t<div class=\"form\">\r\n");
      out.write("        \t<label style=\"font-weight:bold\">\r\n");
      out.write("            \t<a>Edit Place</a>\r\n");
      out.write("            </label>\r\n");
      out.write("    \t\t<input type=\"text\" placeholder=\"Enter New Place\" name=\"#\" required>\r\n");
      out.write("            <button type=\"submit\" onClick=\"tutup()\" name=\"#\">Update Data</button>\r\n");
      out.write("        </div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div id=\"ask\" class=\"confirm2\">\r\n");
      out.write("\t<div class=\"ask-content\">\r\n");
      out.write("    \t<span onClick=\"tutup2()\" class=\"exit\" >&times;</span>\r\n");
      out.write("        <div class=\"ask\">\r\n");
      out.write("            <label style=\"font-weight:bold\">\r\n");
      out.write("                <a> &nbsp &nbsp Are You Sure To Delete Data? </a> <br>\r\n");
      out.write("            </label>\r\n");
      out.write("            <button onClick=\"tutup2()\" class=\"b1\" type=\"submit\" name=\"#\">NO</button>  <button onClick=\"tutup2()\" class=\"b2\" type=\"submit\" name=\"#\">YES </button>\r\n");
      out.write("        </div> \r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
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
      out.write("\t \r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  </script>\r\n");
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
