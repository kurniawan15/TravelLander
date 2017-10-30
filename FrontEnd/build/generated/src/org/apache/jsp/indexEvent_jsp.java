package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Event;
import DAO.DAOEvent;
import model.Lokasi;
import java.util.List;
import java.util.ArrayList;
import Database.KoneksiDB;
import DAO.DAOLokasi;

public final class indexEvent_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Travellender</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("    <center><h1>DAFTAR LOKASI</h1></center>\r\n");
      out.write("    <center>\r\n");
      out.write("        <a class=\"tambah\" href=\"addEvent?proses=input-event\">Tambah</a>\r\n");
      out.write("    </center>\r\n");
      out.write("    \r\n");
      out.write("    <input type=hidden id=blah1 value=true name=blah1 />\r\n");
      out.write("        <table style=\"margin:20px auto;\" border=\"1\">\r\n");
      out.write("              <tr>\r\n");
      out.write("                  <th>No</th>\r\n");
      out.write("                  <th>Kode Event</th>\r\n");
      out.write("                  <th>Nama Event</th>\r\n");
      out.write("                  <th>Waktu Mulai</th>\r\n");
      out.write("                  <th>Waktu Selesai</th>\r\n");
      out.write("                  <th>Keterangan</th>\r\n");
      out.write("                  <th>Action</th>\r\n");
      out.write("                  \r\n");
      out.write("              </tr>\r\n");
      out.write("              ");

                  DAOEvent ev = new DAOEvent();
                  List<Event> data = new ArrayList<Event>();
                  String ket = request.getParameter("ket");
//                  if (ket == null) {
                      data = ev.tampil();
//                  } 
                  for (int x = 0; x < data.size(); x++) {
              
      out.write("\r\n");
      out.write("               <tr>\r\n");
      out.write("                  <td>");
      out.print(x + 1);
      out.write("</td>\r\n");
      out.write("                  <td>");
      out.print(data.get(x).getIdEvent());
      out.write("</td>\r\n");
      out.write("                  <td>");
      out.print(data.get(x).getNameEvent());
      out.write("</td>\r\n");
      out.write("                  <td>");
      out.print(data.get(x).getStartTime());
      out.write("</td>\r\n");
      out.write("                  <td>");
      out.print(data.get(x).getEndTime());
      out.write("</td>\r\n");
      out.write("                  <td>");
      out.print(data.get(x).getKeterangan());
      out.write("</td>\r\n");
      out.write("                  <td>\r\n");
      out.write("                      <a href=\"addEvent?proses=edit-event&id_event=");
      out.print(data.get(x).getIdEvent());
      out.write("\">Edit</a>\r\n");
      out.write("                      <a href=\"addEvent?proses=hapus-event&id_event=");
      out.print(data.get(x).getIdEvent());
      out.write("\">Hapus</a>\r\n");
      out.write("                  </td>               \r\n");
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
