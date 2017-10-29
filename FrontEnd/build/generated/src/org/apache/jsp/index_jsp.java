package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Lokasi;
import java.util.List;
import java.util.ArrayList;
import Database.KoneksiDB;
import DAO.DAOLokasi;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Travellender</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("    <center><h1>DAFTAR LOKASI</h1></center>\r\n");
      out.write("    <center>\r\n");
      out.write("        <a class=\"tambah\" href=\"location?proses=input-lokasi\">Tambah</a>\r\n");
      out.write("    </center>\r\n");
      out.write("        <table style=\"margin:20px auto;\" border=\"1\">\r\n");
      out.write("              <tr>\r\n");
      out.write("                  <th>No</th>\r\n");
      out.write("                  <th>Kode Kota</th>\r\n");
      out.write("                  <th>Nama</th>\r\n");
      out.write("                  <th>Alamat</th>\r\n");
      out.write("                  <th>Kota</th>\r\n");
      out.write("                  <th>provinsi</th>\r\n");
      out.write("                  <th>Action</th>\r\n");
      out.write("              </tr>\r\n");
      out.write("              ");

                  DAOLokasi km = new DAOLokasi();
                  List<Lokasi> data = new ArrayList<Lokasi>();
                  String ket = request.getParameter("ket");
                  if (ket == null) {
                      data = km.tampil();
                  } 
                  for (int x = 0; x < data.size(); x++) {
              
      out.write("\r\n");
      out.write("               <tr>\r\n");
      out.write("                  <td>");
      out.print(x + 1);
      out.write("</td>\r\n");
      out.write("                  <td>");
      out.print(data.get(x).getKdLokasi());
      out.write("</td>\r\n");
      out.write("                  <td>");
      out.print(data.get(x).getNamaLokasi());
      out.write("</td>\r\n");
      out.write("                  <td>");
      out.print(data.get(x).getAlamat());
      out.write("</td>\r\n");
      out.write("                  <td>");
      out.print(data.get(x).getId_kota());
      out.write("</td>\r\n");
      out.write("                  <td>");
      out.print(data.get(x).getId_provinsi());
      out.write("</td>\r\n");
      out.write("                  <td>\r\n");
      out.write("                      <a href=\"location?proses=edit-lokasi&kd_lokasi=");
      out.print(data.get(x).getKdLokasi());
      out.write("\">Edit</a>\r\n");
      out.write("                      <a href=\"location?proses=hapus-lokasi&kd_lokasi=");
      out.print(data.get(x).getKdLokasi());
      out.write("\">Hapus</a>\r\n");
      out.write("                  </td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              ");
 
                    }
              
      out.write("\r\n");
      out.write("          </table>\r\n");
      out.write("              \r\n");
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
