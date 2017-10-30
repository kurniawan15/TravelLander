package org.apache.jsp.Login.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Lokasi;
import java.util.List;
import java.util.ArrayList;
import Database.KoneksiDB;
import DAO.DAOLokasi;

public final class lokasi_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"UTF-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n");
      out.write("  <title>Super Admin</title>\n");
      out.write("  <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("</head>\n");
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
      out.write("    \t<li><a href=\"../logout.jsp\">Log Out</a></li>\n");
      out.write("    </ul>\n");
      out.write("  </nav>\n");
      out.write("\n");
      out.write("  <div id=\"side-menu\" class=\"side-nav\">\n");
      out.write("    <a href=\"#\" class=\"btn-close\" onclick=\"closeSlideMenu()\">&times;</a>\n");
      out.write("    <a href=\"#\">Jarak</a>                                                                                   \n");
      out.write("    <a class=\"selected\" href=\"#\">Kota</a>\n");
      out.write("    <a href=\"#\" >Lokasi</a>\n");
      out.write("    <a href=\"#\" >Provinsi</a>\n");
      out.write("    <a href=\"#\" >Perjalanan</a>\n");
      out.write("    <a href=\"#\" >Moda Trasportasi</a>\n");
      out.write("    <a href=\"#\" >Transportasi Pribadi</a>\n");
      out.write("    <a href=\"#\" >Transportasi Umum</a>\n");
      out.write("  </div>\n");
      out.write("<div class=\"main-content\">\n");
      out.write("    <div id=\"main\">\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t<div class=\"widget\">\n");
      out.write("            <div class=\"title\">Data Provinsi</div>\n");
      out.write("                <table class=\"table\">\n");
      out.write("                    <tr>\n");
      out.write("                        <th>NO</th>\n");
      out.write("                        <th>Kode Kota</th>\n");
      out.write("                        <th>Nama Lokasi</th>\n");
      out.write("                        <th>Alamat</th>\n");
      out.write("                        <th>Kota</th>\n");
      out.write("                        <th>Provinsi</th>\n");
      out.write("                        <th>ket</th>\n");
      out.write("                    </tr>\n");
      out.write("                    ");

                        DAOLokasi km = new DAOLokasi();
                        List<Lokasi> data = new ArrayList<Lokasi>();
                        String ket = request.getParameter("ket");
                        if (ket == null) {
                        data = km.tampil();
                  } 
                  for (int x = 0; x < data.size(); x++) {
                    
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>");
      out.print(x + 1);
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(data.get(x).getKdLokasi());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(data.get(x).getNamaLokasi());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(data.get(x).getAlamat());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(data.get(x).getId_kota());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(data.get(x).getId_provinsi());
      out.write("</td>\n");
      out.write("                        <td>\n");
      out.write("                            <a href=\"location?proses=edit-lokasi&kd_lokasi=");
      out.print(data.get(x).getKdLokasi());
      out.write("\"><input type=\"submit\" class=\"button1\" value=\"Edit\"></a></a>\n");
      out.write("                            <a href=\"location?proses=hapus-lokasi&kd_lokasi=");
      out.print(data.get(x).getKdLokasi());
      out.write("\"><input type=\"submit\" class=\"button2\" onClick=\"opena()\" value=\"Hapus\" ></a>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");
 
                    }
                    
      out.write("\n");
      out.write("                </table>\n");
      out.write("               \n");
      out.write("\t</div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"widget\">\n");
      out.write("    <div class=\"title\">Tambah Lokasi </div>  \n");
      out.write("        <div class=\"imput\">\n");
      out.write("            <form action=\"../../provinsi?data=provinsi&proses=input-provinsi\" method=\"post\">\n");
      out.write("                Nama Lokasi\n");
      out.write("                <input type=\"text\" placeholder=\"Masukan Nama Lokasi\" name=\"#\" required>\n");
      out.write("                Alamat\n");
      out.write("                <input type=\"text\" placeholder=\"Masukan Alamat\" name=\"#\" required>\n");
      out.write("                Kota\n");
      out.write("                <select class=\"pilih_kota\">\n");
      out.write("                    <option value=\"volvo\">Volv33o</option>\n");
      out.write("                    <option value=\"saab\">Saab</option>\n");
      out.write("                    <option value=\"opel\">Opel</option>\n");
      out.write("                    <option value=\"audi\">Audi</option>\n");
      out.write("                </select>\n");
      out.write("                Provinsi\n");
      out.write("                <select class=\"pilih_kota\">\n");
      out.write("                    <option value=\"volvo\">Volv33o</option>\n");
      out.write("                    <option value=\"saab\">Saab</option>\n");
      out.write("                    <option value=\"opel\">Opel</option>\n");
      out.write("                    <option value=\"audi\">Audi</option>\n");
      out.write("                </select>\n");
      out.write("                <button type=\"submit\" name=\"Tambah\">Update Data</button>\n");
      out.write("                \n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("</div>\n");
      out.write("<!------------------------------------------------------------bagian modal dalet-------------------------------------->   \n");
      out.write("<script>\n");
      out.write("/*----------------------------edit buat mav----------------------------------------------*/\n");
      out.write("    function openSlideMenu(){\n");
      out.write("      document.getElementById('side-menu').style.width = '250px';\n");
      out.write("      document.getElementById('main').style.marginLeft = '250px';\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function closeSlideMenu(){\n");
      out.write("      document.getElementById('side-menu').style.width = '0';\n");
      out.write("      document.getElementById('main').style.marginLeft = '0';\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    /*-------------------------Membuat modal Pop Up-----------------------------------------*/\n");
      out.write("\n");
      out.write("\tfunction openo()\n");
      out.write("\t{\n");
      out.write("\t\tdocument.getElementById(\"confirm\").style.display = \"block\"\n");
      out.write("\t}\n");
      out.write("\tfunction opena()\n");
      out.write("\t{\n");
      out.write("\t\tdocument.getElementById(\"ask\").style.display = \"block\"\n");
      out.write("                document.setUserData(\"\");\n");
      out.write("\t}\n");
      out.write("\tfunction tutup()\n");
      out.write("\t{\n");
      out.write("\t\tdocument.getElementById(\"confirm\").style.display = \"none\"\n");
      out.write("\t}\n");
      out.write("\tfunction tutup2()\n");
      out.write("\t{\n");
      out.write("\t\tdocument.getElementById(\"ask\").style.display = \"none\"\n");
      out.write("\t}\n");
      out.write("\t \n");
      out.write("</script>\t\n");
      out.write("\n");
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
