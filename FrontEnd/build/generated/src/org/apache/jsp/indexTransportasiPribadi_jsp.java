package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.TransportasiPribadi;
import java.util.ArrayList;
import java.util.List;
import DAO.DAOTransportasiPribadi;

public final class indexTransportasiPribadi_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Travellender</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <h1>DAFTAR TRANSPORTASI PRIBADI</h1>\r\n");
      out.write("        <center>\r\n");
      out.write("        <a class=\"tambah\" href=\"transportasi_pribadi?proses=input-moda-pribadi\">Tambah</a>\r\n");
      out.write("    </center>\r\n");
      out.write("    <table style=\"margin:20px auto;\" border=\"1\">\r\n");
      out.write("              <tr>\r\n");
      out.write("                  <th>No</th>\r\n");
      out.write("                  <th>Kode Transportasi Pribadi</th>\r\n");
      out.write("                  <th>Kode Moda</th>\r\n");
      out.write("                  <th>Nama Transportasi Pribadi</th>\r\n");
      out.write("              </tr>\r\n");
      out.write("              ");

                  DAOTransportasiPribadi kt = new DAOTransportasiPribadi();
                  List<TransportasiPribadi> data = new ArrayList<TransportasiPribadi>();
                  String ket = request.getParameter("ket");
                  if (ket == null) {
                      data = kt.tampil();
                  } 
                  for (int x = 0; x < data.size(); x++) {
              
      out.write("\r\n");
      out.write("               <tr>\r\n");
      out.write("                  <td>");
      out.print(x + 1);
      out.write("</td>\r\n");
      out.write("                  <td>");
      out.print(data.get(x).getKdTansportasiPribadi());
      out.write("</td>\r\n");
      out.write("                  <td>");
      out.print(data.get(x).getKdModa());
      out.write("</td>\r\n");
      out.write("                  <td>");
      out.print(data.get(x).getNamaTransportasiPribadi());
      out.write("</td>\r\n");
      out.write("                  <td>\r\n");
      out.write("                      <a href=\"transportasi_pribadi?proses=edit-moda-pribadi&Kd_Transportasi_pribadi=");
      out.print(data.get(x).getKdTansportasiPribadi());
      out.write("\">Edit</a>\r\n");
      out.write("                      <a href=\"transportasi_pribadi?proses=hapus-moda-pribadi&Kd_Transportasi_Pribadi=");
      out.print(data.get(x).getKdTansportasiPribadi());
      out.write("\">Hapus</a>\r\n");
      out.write("                  </td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              ");
 
                    }
              
      out.write("\r\n");
      out.write("          </table>\r\n");
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
