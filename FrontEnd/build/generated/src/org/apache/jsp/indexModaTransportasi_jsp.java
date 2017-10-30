package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.ModaTransportasi;
import java.util.ArrayList;
import java.util.List;
import DAO.DAOModaTransportasi;

public final class indexModaTransportasi_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Travellender</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>DAFTAR MODA TRANSPORTASI</h1>\n");
      out.write("        <center>\n");
      out.write("        <a class=\"tambah\" href=\"moda_transportasi?proses=input-moda\">Tambah</a>\n");
      out.write("    </center>\n");
      out.write("    <table style=\"margin:20px auto;\" border=\"1\">\n");
      out.write("              <tr>\n");
      out.write("                  <th>No</th>\n");
      out.write("                  <th>Kode Moda</th>\n");
      out.write("                  <th>Tipe Moda</th>\n");
      out.write("              </tr>\n");
      out.write("              ");

                  DAOModaTransportasi kt = new DAOModaTransportasi();
                  List<ModaTransportasi> data = new ArrayList<ModaTransportasi>();
                  //String ket = request.getParameter("ket");
                  //if (ket == null) {
                      data = kt.tampil();
                  //} 
                  for (int x = 0; x < data.size(); x++) {
              
      out.write("\n");
      out.write("               <tr>\n");
      out.write("                  <td>");
      out.print(x + 1);
      out.write("</td>\n");
      out.write("                  <td>");
      out.print(data.get(x).getKdModa());
      out.write("</td>\n");
      out.write("                  <td>");
      out.print(data.get(x).getTipeModa());
      out.write("</td>\n");
      out.write("                  <td>\n");
      out.write("                      <a href=\"moda_transportasi?proses=edit-moda&Kd_Moda=");
      out.print(data.get(x).getKdModa());
      out.write("\">Edit</a>\n");
      out.write("                      <a href=\"moda_transportasi?proses=hapus-moda&Kd_Moda=");
      out.print(data.get(x).getKdModa());
      out.write("\">Hapus</a>\n");
      out.write("                  </td>\n");
      out.write("              </tr>\n");
      out.write("              ");
 
                    }
              
      out.write("\n");
      out.write("          </table>\n");
      out.write("    </body>\n");
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
