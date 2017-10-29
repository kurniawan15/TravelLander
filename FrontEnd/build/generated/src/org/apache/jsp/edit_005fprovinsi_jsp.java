package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import java.util.ArrayList;
import model.Provinsi;
import DAO.DAOProvinsi;

public final class edit_005fprovinsi_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title></title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <center><h1>Edit User </h1></center>\n");
      out.write("        <form action=\"provinsi?data=provinsi&proses=update-provinsi cekprovinsi.jsp\" method=\"post\">\n");
      out.write("            <table style=\"margin:20px auto;\">\n");
      out.write("            ");

                String id_provinsi = request.getParameter("id_provinsi");
                DAOProvinsi prov = new DAOProvinsi();
                prov.setIdProvinsi(id_provinsi);
                List<Provinsi> data = new ArrayList<Provinsi>();
                data = prov.cariID(); 
                if (data.size() > 0) {

            
      out.write("\n");
      out.write("\t\t<tr>\n");
      out.write("                    <td>ID PROV</td>\n");
      out.write("                    <td><input type=\"text\" name=\"id_provinsi\" value=\"");
      out.print(data.get(0).getIdProvinsi());
      out.write("\"></td>\n");
      out.write("\t\t</tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Nama PROV</td>\n");
      out.write("                    <td><input type=\"text\" name=\"nama_provinsi\" value=\"");
      out.print(data.get(0).getNamaProvinsi());
      out.write("\"></td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t\t<tr>\n");
      out.write("                    <td>Ibu Kota</td>\n");
      out.write("                    <td><input type=\"text\" name=\"ibu_kota\" value=\"");
      out.print(data.get(0).getIdProvinsi());
      out.write("\"></td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t\t<tr>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td><input type=\"submit\" value=\"Update\"></td>\n");
      out.write("\t\t</tr>\n");
      out.write("                  ");
}
      out.write("\n");
      out.write("            </table>\n");
      out.write("          \n");
      out.write("\t</form>\t\n");
      out.write("    \n");
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
