package org.apache.jsp.Login.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Kota;
import java.util.List;
import java.util.ArrayList;
import Database.KoneksiDB;
import DAO.DAOKota;

public final class edit_005fkota_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("  <meta charset=\"UTF-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n");
      out.write("  <title>Super Admin</title>\n");
      out.write("  <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("</head>\n");
      out.write("<div class=\"widget\">\n");
      out.write("    <div class=\"title\">Edit Kota </div>  \n");
      out.write("        <div class=\"imput\">\n");
      out.write("            <form action=\"../../provinsi?data=provinsi&proses=update-provinsi\" method=\"post\">\n");
      out.write("\n");
      out.write("                Kode Kota\n");
      out.write("                <input type=\"text\" placeholder=\"");
//=data.get(0).getIdProvinsi()
      out.write("\" name=\"id_provinsi\" required>\n");
      out.write("                Id Provinsi Provinsi\n");
      out.write("                <input type=\"text\" placeholder=\"");
//=data.get(0).getNamaProvinsi()
      out.write("\" name=\"nama_provinsi\" required>\n");
      out.write("                Nama Kota\n");
      out.write("                <input type=\"text\" placeholder=\"");
//=data.get(0).getIbuKota()
      out.write("\" name=\"ibu_kota\" required>\n");
      out.write("               \n");
      out.write("               <button type=\"submit\" name=\"Tambah\">Update Data</button>\n");
      out.write("                ");
//}
      out.write("\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("</div>\n");
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
