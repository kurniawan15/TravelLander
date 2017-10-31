package org.apache.jsp.Login.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import java.util.ArrayList;
import model.Lokasi;
import DAO.DAOLokasi;
import model.Provinsi;
import DAO.DAOProvinsi;
import model.Kota;
import DAO.DAOKota;

public final class edit_005flokasi_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"UTF-8\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\r\n");
      out.write("  <title>Super Admin</title>\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<div class=\"widget\">\r\n");
      out.write("    <div class=\"title\">Edit Lokasi </div>  \r\n");
      out.write("        <div class=\"imput\">\r\n");
      out.write("            <form action=\"../../lokasi?data=lokasi&proses=update-lokasi\" method=\"post\">\r\n");
      out.write("    ");

                String kd_lokasi = request.getParameter("kd_lokasi");
                DAOLokasi km = new DAOLokasi();
                km.setKdLokasi(kd_lokasi);
                List<Lokasi> data = new ArrayList<Lokasi>();
                data = km.cariID();
                
                 DAOProvinsi dpro = new DAOProvinsi();
                        List<Provinsi> pro = new ArrayList<Provinsi>();
                        
                      DAOKota dkot = new DAOKota();
                        List<Kota> kot = new ArrayList<Kota>(); 
                if (data.size() > 0) {

            
      out.write("\r\n");
      out.write("                Nama Lokasi\r\n");
      out.write("                <input type=\"text\" placeholder=\"Masukan kode Lokasi\" name=\"nama_lokasi\" required  value=\"");
      out.print(data.get(0).getNamaLokasi());
      out.write("\"></td>\r\n");
      out.write("                Alamat\r\n");
      out.write("                <input type=\"text\" placeholder=\"Masukan Nama Lokasi\" name=\"alamat\" required value=\"");
      out.print(data.get(0).getAlamat());
      out.write("\"></td>\r\n");
      out.write("              \r\n");
      out.write("                Kota\r\n");
      out.write("                <select class=\"pilih_kota\">\r\n");
      out.write("                    <option value=\"");
      out.print(data.get(0).getId_kota());
      out.write("\"></option>\r\n");
      out.write("                    ");

                    
                    for (Provinsi p : pro) {
                    
      out.write("\r\n");
      out.write("                <option value=\"");
      out.print(p.getIdProvinsi());
      out.write('"');
      out.write('>');
      out.print(p.getNamaProvinsi());
      out.write("</option>\r\n");
      out.write("                ");
 
                       }
                
      out.write("\r\n");
      out.write("                </select>\r\n");
      out.write("                Provinsi\r\n");
      out.write("                <select class=\"pilih_kota\">\r\n");
      out.write("                    <option value=\"");
      out.print(data.get(0).getId_provinsi());
      out.write("\">Volv33o</option>\r\n");
      out.write("                    <option value=\"saab\">Saab</option>\r\n");
      out.write("                    <option value=\"opel\">Opel</option>\r\n");
      out.write("                    <option value=\"audi\">Audi</option>\r\n");
      out.write("                </select>\r\n");
      out.write("                \r\n");
      out.write("                <button type=\"submit\" name=\"Update\">Update Data</button>\r\n");
      out.write("                <td><input type=\"hidden\" name=\"kd_lokasi\" value=\"");
      out.print(data.get(0).getKdLokasi());
      out.write("\"></td>\r\n");
      out.write("                 ");
}
      out.write("\r\n");
      out.write("            </form>\r\n");
      out.write("                \r\n");
      out.write("        </div>\r\n");
      out.write("        </div>\r\n");
      out.write("</div>\r\n");
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
