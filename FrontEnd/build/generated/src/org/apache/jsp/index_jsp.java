package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
<<<<<<< HEAD
import model.Lokasi;
import java.util.List;
import java.util.ArrayList;
import repository.KoneksiDB;
=======
>>>>>>> 53f6ac11f1db7919862e290ca23157b8fbad4078

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

      out.write("\n");
      out.write("\n");
      out.write("\n");
<<<<<<< HEAD
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
      out.write("    <center><h1>DAFTAR LOKASI</h1></center>\n");
      out.write("    <center>\n");
      out.write("        <a class=\"tambah\" href=\"location?proses=input-lokasi\">Tambah</a>\n");
      out.write("    </center>\n");
      out.write("        <table style=\"margin:20px auto;\" border=\"1\">\n");
      out.write("              <tr>\n");
      out.write("                  <th>No</th>\n");
      out.write("                  <th>Kode Kota</th>\n");
      out.write("                  <th>Nama</th>\n");
      out.write("                  <th>Alamat</th>\n");
      out.write("                  <th>Action</th>\n");
      out.write("              </tr>\n");
      out.write("              ");

                  Lokasi km = new Lokasi();
                  List<Lokasi> data = new ArrayList<Lokasi>();
                  String ket = request.getParameter("ket");
                  if (ket == null) {
                      data = km.tampil();
                  } 
                  for (int x = 0; x < data.size(); x++) {
              
      out.write("\n");
      out.write("               <tr>\n");
      out.write("                  <td>");
      out.print(x + 1);
      out.write("</td>\n");
      out.write("                  <td>");
      out.print(data.get(x).getIdLokasi());
      out.write("</td>\n");
      out.write("                  <td>");
      out.print(data.get(x).getNamaLokasi());
      out.write("</td>\n");
      out.write("                  <td>");
      out.print(data.get(x).getAlamat());
      out.write("</td>\n");
      out.write("                  <td>\n");
      out.write("                      <a href=\"location?proses=edit-lokasi&idLokasi=");
      out.print(data.get(x).getIdLokasi());
      out.write("\">Edit</a>\n");
      out.write("                      <a href=\"location?proses=hapus-lokasi&idLokasi=");
      out.print(data.get(x).getIdLokasi());
      out.write("\">Hapus</a>\n");
      out.write("                  </td>\n");
      out.write("              </tr>\n");
      out.write("              ");
 
                    }
              
      out.write("\n");
      out.write("          </table>\n");
      out.write("              \n");
      out.write("</body>\n");
      out.write("</html>\n");
=======
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head lang=\"en\"> \n");
      out.write("   <!--     <meta charset=\"utf-8\"> -->\n");
      out.write("        <title>Travelender</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"style.css\"/>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        <nav> \n");
      out.write("            <img src=\"images/logo_head.png\" width=20% height=100%>\n");
      out.write("        </nav>\n");
      out.write("        \n");
      out.write("\n");
      out.write("        <div id=\"head\">\n");
      out.write("            <nav>\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"#\">Home</a></li>\n");
      out.write("                    <li><a href=\"#anchor-headline\">What's This?</a></li>\n");
      out.write("                    <li><a href=\"#\">Admin</a></li>\n");
      out.write("                    <li><a href=\"#\">Go to Date</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
      out.write("        \n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("             \n");
      out.write("        <div class=\"sect sectOne\">         \n");
      out.write(" \n");
      out.write("           <br />\n");
      out.write("           <p id=\"Tagline\">Create Your Simple Plans</p>   \n");
      out.write("           <a href=\"Login/login.jsp\"> <button>Get's Started</button> </a>  \n");
      out.write("        \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"subSection\">\n");
      out.write("            \n");
      out.write("            <h3 id=\"anchor-headline\"> Anchor </h3>            \n");
      out.write("            \n");
      out.write("            <br />\n");
      out.write("\n");
      out.write("\n");
      out.write("            <h2 id=\"heading-headline\">Schedule - Check - Go</h2>\n");
      out.write("            \n");
      out.write("            <img src=\"images/logo_kotak.png\" width=\"50%\"\" height=\"80%\" >\n");
      out.write("            <p>\n");
      out.write("                  Create Your any Plan for Tomorrow and Next <br> Anything, Anytime, Anywhere\n");
      out.write("            </p>\n");
      out.write("            \n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"tesc sectTwo\">\n");
      out.write("            \n");
      out.write("           <br />\n");
      out.write("           \n");
      out.write("           <!--<img src=\"images/DAYS.png\" width=\"20%\" height=\"20%\" id=\"Anchor-Down\"> -->\n");
      out.write("           <p>Start your Date Now!</p>  \n");
      out.write("           <a href=\"Login/login.jsp\"> <button>Sign Up</button> </a>  \n");
      out.write("        \n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>");
>>>>>>> 53f6ac11f1db7919862e290ca23157b8fbad4078
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
