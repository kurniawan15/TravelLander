package org.apache.jsp.Login.Data;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import DAO.DAONewEvent;
import java.text.SimpleDateFormat;
import model.NewEvent;
import DAO.DAONewLokasi;
import model.NewLokasi;
import java.util.List;
import java.util.ArrayList;
import Database.KoneksiDB;

public final class mylist_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<title></title>\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/grid.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n");
      out.write("\t<link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 header\">\n");
      out.write("\t\t<div class=\"col-lg-3 col-md-12 col-sm-12 col-xs-12 kiri\">\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"col-lg-6 col-md-12 col-sm-12 col-xs-12 kiri\">\n");
      out.write("\t\t\t<center><img class=\"img-responsive\" src=\"img/logo1.png\">\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"col-lg-1 col-md-12 col-sm-12 col-xs-12 kiri\">\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"col-lg-1 col-md-12 col-sm-12 col-xs-12 kanan\">\n");
      out.write("\t\t\t<span class=\"glyphicon glyphicon-bell\"></span>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"col-lg-1 col-md-12 col-sm-12 col-xs-12 kanan2\">\n");
      out.write("\t\t\tFajar&nbsp;&nbsp;&nbsp;<span class=\"glyphicon glyphicon-user\"></span>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 fullpage\">\n");
      out.write("\t\t<div class=\"col-lg-6 col-md-12 col-sm-12 col-xs-12 leftpagefinish\">\n");
      out.write("\t\t\t<div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 menubar\">\n");
      out.write("\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t<li class=\"none\">Dashboard</li>\n");
      out.write("\t\t\t\t\t<li class=\"none\">My Calendar</li>\n");
      out.write("\t\t\t\t\t<a href=\"addEvent.jsp\"><li class=\"none\">Add Event</li></a>\n");
      out.write("\t\t\t\t\t<li cla<a href=\"mylist.jsp\"><li class=\"none\">My Event</li></a>\n");
      out.write("\t\t\t\t\t<li class=\"none\">History</li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 isicontent\">\n");
      out.write("\t\t\t<article class=\"article\">\n");
      out.write("\t\t\t  <div class=\"contentlist\">\n");
      out.write("\t\t\t  <div id=\"main\">                                         \n");
      out.write("\t\t\t  <br><br>\n");
      out.write("\t\t\t  <h1 class=\"judul\">Event List</h1>\n");
      out.write("\t\t\t   <table class=\"table\">\n");
      out.write("\t\t\t      <tr>\n");
      out.write("\t\t\t          <th>NO</th>\n");
      out.write("\t\t\t          <th>Event Name</th>\n");
      out.write("\t\t\t          <th>Event Location</th>\n");
      out.write("\t\t\t          <th>Date & Time</th>\n");
      out.write("\t\t\t          <th>&nbsp;&nbsp;Edit&nbsp;&nbsp;</th>\n");
      out.write("\t\t\t          <th>Delete</th>\n");
      out.write("\t\t\t          <th>View</th>\n");
      out.write("\t\t\t      </tr>\n");
      out.write("                              ");

                      SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");
                      DAONewEvent kt = new DAONewEvent();
                      DAONewLokasi dLok = new DAONewLokasi();
                      List<NewEvent> data = new ArrayList<NewEvent>();
                      String ket = request.getParameter("ket");
                      kt.setKdEvent("");
                      if (ket == null) {
                          data = kt.cariID();
                      }
                  
                      for (int x = 0; x < data.size(); x++) {
                              
      out.write("\n");
      out.write("\t\t\t      <tr>\n");
      out.write("\t\t\t\t      <!--____________________________script fungsi option kendaraan umum/pribadi____________________________-->   \n");
      out.write("\t\t\t          <td style=\"font-size: 12px; line-height: 20px;\">");
      out.print(x + 1);
      out.write("</td>\n");
      out.write("\t\t\t          <td style=\"font-size: 12px; line-height: 20px;\">");
      out.print(data.get(x).getNamaEvent());
      out.write("</td>\n");
      out.write("\t\t\t          <td style=\"font-size: 12px; line-height: 20px;\">");
      out.print(dLok.getLokasiAkhir(data.get(x).getKdEvent()));
      out.write("</td>\n");
      out.write("                                  <td style=\"font-size: 12px; line-height: 20px;\">");
      out.print(format.format(data.get(x).getWaktuSelesai()));
      out.write("</td>\n");
      out.write("\t\t\t          <td style=\"font-size: 12px; line-height: 35px;\"><span class=\"glyphicon glyphicon-edit\"></span></td>\n");
      out.write("\t\t\t          <td style=\"font-size: 12px; line-height: 35px;\"><span class=\"glyphicon glyphicon-trash\"></span></td>\n");
      out.write("                                  <td style=\"font-size: 12px; line-height: 20px;\"><button class=\"tablinks\" id=\"defaultOpen\"><span class=\"glyphicon glyphicon glyphicon-list\"></span></button></td>\n");
      out.write("\t\t\t      </tr>\n");
      out.write("                              ");
 
                                }
                              
      out.write("\n");
      out.write("\t\t\t\t      <script type=\"text/javascript\">\n");
      out.write("\t\t\t\t        function openCity(evt, editEvent) {\n");
      out.write("\t\t\t\t          var i, tabcontent, tablinks; //deklarasi variabel\n");
      out.write("\t\t\t\t          //mengambil element yang ada di class tabcontent dan menyembunyikan class \n");
      out.write("\t\t\t\t          tabcontent = document.getElementsByClassName(\"tabcontent\");\n");
      out.write("\t\t\t\t          for (i = 0; i < tabcontent.length; i++) {\n");
      out.write("\t\t\t\t              tabcontent[i].style.display = \"none\";\n");
      out.write("\t\t\t\t          }\n");
      out.write("\t\t\t\t          //mengambil element yang ada di class tablinks dan menghapus yg aktif di display\n");
      out.write("\t\t\t\t          tablinks = document.getElementsByClassName(\"tablinks\");\n");
      out.write("\t\t\t\t          for (i = 0; i < tablinks.length; i++) {\n");
      out.write("\t\t\t\t              tablinks[i].className = tablinks[i].className.replace(\" active\", \"\");\n");
      out.write("\t\t\t\t          }\n");
      out.write("\t\t\t\t          //menampilkan class yang aktif kelayar dengan posisi block/dibawah content tsb\n");
      out.write("\t\t\t\t          document.getElementById(editEvent).style.display = \"block\";\n");
      out.write("\t\t\t\t          evt.currentTarget.className += \" active\";\n");
      out.write("\t\t\t\t          }\n");
      out.write("\t\t\t\t      </script>\n");
      out.write("\t\t\t      </table>\n");
      out.write("\t\t\t  </div>\n");
      out.write("  \t\t</div>\n");
      out.write("</article>\n");
      out.write("  </div>\n");
      out.write("\t\t</div>\n");
      out.write("                \n");
      out.write("\t\t<div class=\"col-lg-6 col-md-12 col-sm-12 col-xs-12 rightpage\">\n");
      out.write("\t\t\t<div id=\"pageedit\" class=\"tabcontent\">\n");
      out.write("\t\t      <h1 class=\"judul\">Detail Event</h1>\n");
      out.write("\t\t\t  <h2 class=\"h2detail\">Detail</h2>\n");
      out.write("\t\t\t    <p class=\"pdetail\">Event Name &nbsp;&nbsp;:  </p>\n");
      out.write("\t\t\t    <p class=\"pdetail\">Event Time &nbsp;&nbsp;: 19.00 07/11/2017 until 21:30 07/11/2017</p>\n");
      out.write("\t\t\t  \n");
      out.write("\t\t\t  <h2 class=\"h2detail\">Location</h2>\n");
      out.write("\t\t\t  <p class=\"pdetail\">Start Point &nbsp;&nbsp;: Hotel Amorossa Bandung</p>\n");
      out.write("\t\t\t  <p class=\"pdetail\">End Point &nbsp;&nbsp;: SMAN 20 Bandung</p>\n");
      out.write("\t\t\t  <p class=\"pdetail\">Description &nbsp;&nbsp;: Description of Event</p>\n");
      out.write("\n");
      out.write("\t\t\t  <h2 class=\"h2detail\">Transportation</h2>\n");
      out.write("\t\t\t  <p class=\"pdetail\">Transport Name &nbsp;&nbsp;: Motorcycle</p>\n");
      out.write("\t\t\t  <p class=\"pdetail\">Distance &nbsp;&nbsp;: 0.55 KM</p>\n");
      out.write("\t\t\t  <p class=\"pdetail\">Estimated &nbsp;&nbsp;: 5 Minutes</p>\n");
      out.write("\t\t\t  <p class=\"pdetail\">Departure Time &nbsp;&nbsp;: 06:45</p>\n");
      out.write("\t\t\t<div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 maptampil\">\n");
      out.write("\t     \t\t<div id=\"map\"><img class=\"img-responsive mapboong\" style=\"margin-left: 80px;\" src=\"img/3.jpg\"></div>\n");
      out.write("\t     \t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("  \t\t</div>\n");
      out.write("  </div>\n");
      out.write("</article>\n");
      out.write("</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t<div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 fullfooter\">&copy; Kelompok B1 | Made With ❤ by FrontEnd in Kosan Uda</div>\n");
      out.write("</body>\n");
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
