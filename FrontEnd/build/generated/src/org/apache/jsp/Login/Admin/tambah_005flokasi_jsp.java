package org.apache.jsp.Login.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class tambah_005flokasi_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <div class=\"title\">Tambah Lokasi </div>  \n");
      out.write("        <div class=\"imput\">\n");
      out.write("            <form action=\"../../provinsi?data=provinsi&proses=input-provinsi\" method=\"post\">\n");
      out.write("                Kode Kota\n");
      out.write("                <input type=\"text\" placeholder=\"Masukan id Provinsi\" name=\"#i\" required>\n");
      out.write("                Nama Lokasi\n");
      out.write("                <input type=\"text\" placeholder=\"Masukan Nama Provinsi\" name=\"#\" required>\n");
      out.write("                Alamat\n");
      out.write("                <input type=\"text\" placeholder=\"Masukan Ibu Kota\" name=\"#\" required>\n");
      out.write("                Kota\n");
      out.write("                <select name=\"yyuu\" size=\"4\">\n");
      out.write("                    <option>a</option>\n");
      out.write("                    <option>a</option>\n");
      out.write("                    <option>ssd</option>\n");
      out.write("                    <option>da</option>\n");
      out.write("                    <option>da</option>\n");
      out.write("                    <option>wd</option>\n");
      out.write("                </select>\n");
      out.write("                <input type=\"text\" placeholder=\"Masukan Ibu Kota\" name=\"#\" required>\n");
      out.write("                Provinsi\n");
      out.write("                <input type=\"text\" placeholder=\"Masukan Ibu Kota\" name=\"#\" required>\n");
      out.write("                <button type=\"submit\" name=\"Tambah\">Update Data</button>\n");
      out.write("                \n");
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
