package org.apache.jsp.Login.Data;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.SimpleDateFormat;
import model.NewLokasi;
import DAO.DAONewLokasi;
import model.NewEvent;
import java.util.ArrayList;
import java.util.List;
import DAO.DAONewEvent;
import Database.KoneksiDB;

public final class PageEventList_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("  <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("</head>\r\n");
      out.write("<style>\r\n");
      out.write("  body{\r\n");
      out.write("    background-image: url(img/backweb.jpg);/*call image*/\r\n");
      out.write("    background-position: center center;/*set posisi background agar ditengah*/\r\n");
      out.write("    background-repeat: no-repeat;/*set gambar biar gaberulang*/\r\n");
      out.write("    background-attachment: fixed;/*set gambar agar ketika discroll tidak ikut bergerak*/\r\n");
      out.write("    background-size: cover;/*set ukuran gambar sesuai ukuran layar*/\r\n");
      out.write("    }\r\n");
      out.write("</style>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div class=\"flex-container\">\r\n");
      out.write("<div class=\"headbar\">\r\n");
      out.write("<header>\r\n");
      out.write("  <center><img class=\"logoweb\" src=\"img/L210.png\"></center>\r\n");
      out.write("</header>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<nav class=\"nav\">\r\n");
      out.write("<ul>\r\n");
      out.write("   <br><br><br>\r\n");
      out.write("    <a href=\"myEvent.jsp\"><li class=\"none\"><i class=\"material-icons\" style=\"font-size:20px;color:white; padding-right: 30px;\">home</i>Dasboard</li></a>\r\n");
      out.write("    <a href=\"calendar.jsp\"><li class=\"none\"><i class=\"material-icons\" style=\"font-size:20px;color:white; padding-right: 30px;\">date_range</i>Calendar</li></a>\r\n");
      out.write("    <a href=\"addEvent.jsp\"><li class=\"none\"><i class=\"material-icons\" style=\"font-size:20px;color:white; padding-right: 30px;\">add</i>Create Schedule</li></a>\r\n");
      out.write("    <a href=\"listData.jsp\"><li class=\"none\"><i class=\"material-icons\" style=\"font-size:20px;color:white; padding-right: 30px;\">done</i>Finished Task</li>\r\n");
      out.write("   <li class=\"pilih\"><i class=\"material-icons\" style=\"font-size:20px;color:white\">list</i>Event List</li>\r\n");
      out.write("    <a href=\"#\"><li class=\"none\"><i class=\"material-icons\" style=\"font-size:20px;color:white; padding-right: 30px;\">build</i>Manage</li></a>\r\n");
      out.write("</ul>\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("<article class=\"article\">\r\n");
      out.write("  <div class=\"contentlist\">\r\n");
      out.write("  <div id=\"main\">                                         \r\n");
      out.write("  <br><br><br><br><br>\r\n");
      out.write("  <h1 class=\"judul\">Event List</h1>\r\n");
      out.write("   <table class=\"tableeventlist\">\r\n");
      out.write("      <tr>\r\n");
      out.write("          <th>NO</th>\r\n");
      out.write("          <th>Event Name</th>\r\n");
      out.write("          <th>Event Location</th>\r\n");
      out.write("          <th>Date & Time</th>\r\n");
      out.write("          <th>Edit</th>\r\n");
      out.write("      </tr>\r\n");
      out.write("      ");

                      SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");            
                      DAONewEvent namatanggal = new DAONewEvent();
                      List<NewEvent> list = new ArrayList<NewEvent>();
                      DAONewLokasi lokasi = new DAONewLokasi();
//                      List<NewLokasi> list1 = new ArrayList<NewLokasi>();
                      String ket = request.getParameter("ket");
                      if (ket == null) {
                          list = namatanggal.tampil();
//                          list1 = lokasi.tampil();
                      } 
                      for (int x = 0; x < list.size(); x++) {
                          String kd = list.get(x).getKdEvent();
                    
      out.write("\r\n");
      out.write("      <tr>\r\n");
      out.write("          <td style=\"font-size: 14px;\">");
      out.print(x + 1);
      out.write("</td>\r\n");
      out.write("          <td style=\"font-size: 14px;\">");
      out.print(list.get(x).getNamaEvent());
      out.write("</td>\r\n");
      out.write("          <td style=\"font-size: 14px;\">");
      out.print(lokasi.getLokasiAkhir(kd));
      out.write("</td>\r\n");
      out.write("          <td style=\"font-size: 14px;\">");
      out.print(format.format(list.get(x).getWaktuMulai()));
      out.write("</td>\r\n");
      out.write("          <td><a href=\"edit.html\"><input type=\"submit\" name=\"\" value=\"EDIT\" style=\"background-color: grey; width: 50%; height: 5px; line-height: 2px;\"></a><a href=\"pageedit.html\"><input type=\"submit\" name=\"\" value=\"DELETE\" style=\"background-color: red; width: 50%; height: 5px; line-height: 2px;\"></a></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      ");

          }
       
      out.write("\r\n");
      out.write("      </table>\r\n");
      out.write("  </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</article>\r\n");
      out.write("\r\n");
      out.write("<footer>Copyright &copy; Kelompok B1 | Front-End [Made With Love] </footer>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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
