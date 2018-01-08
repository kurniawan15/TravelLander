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
      out.write("\t<title></title>\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/grid.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\r\n");
      out.write("\t<link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\r\n");
      out.write("           \r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 header\">\r\n");
      out.write("\t\t<div class=\"col-lg-3 col-md-12 col-sm-12 col-xs-12 kiri\">\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"col-lg-6 col-md-12 col-sm-12 col-xs-12 kiri\">\r\n");
      out.write("\t\t\t<center><img class=\"img-responsive\" src=\"img/logo1.png\">\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"col-lg-1 col-md-12 col-sm-12 col-xs-12 kanan\">\r\n");
      out.write("\t\t\t<span class=\"glyphicon glyphicon-bell\"></span>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"col-lg-1 col-md-12 col-sm-12 col-xs-12 kanan2\">\r\n");
      out.write("\t\t\tHi, Fajar&nbsp;&nbsp;&nbsp;<span class=\"glyphicon glyphicon-user\"></span>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("                <div class=\"col-lg-1 col-md-12 col-sm-12 col-xs-12 kanan2\">\r\n");
      out.write("                    Logout&nbsp;&nbsp;&nbsp;<span class=\"glyphicon glyphicon-off\"></span>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 fullpage\">\r\n");
      out.write("\t\t<div class=\"col-lg-6 col-md-12 col-sm-12 col-xs-12 leftpagefinish\">\r\n");
      out.write("\t\t\t<div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 menubar\">\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("                                <a href=\"home.jsp\"><li class=\"pilih\">Dashboard</li></a>\r\n");
      out.write("\t\t\t\t<a href=\"calendar.jsp\"><li class=\"none\">My Calendar</li></a>\r\n");
      out.write("\t\t\t\t<a href=\"addEvent.jsp\"><li class=\"none\">Add Event</li></a>\r\n");
      out.write("\t\t\t\t<a href=\"mylist.jsp\"><li class=\"pilih\">My Event</li></a>\r\n");
      out.write("\t\t\t\t<a href=\"finish.jsp\"><li class=\"none\">History</li></a>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 isicontent\">\r\n");
      out.write("\t\t\t<article class=\"article\">\r\n");
      out.write("\t\t\t  <div class=\"contentlist\">\r\n");
      out.write("\t\t\t  <div id=\"main\">                                         \r\n");
      out.write("\t\t\t  <br><br>\r\n");
      out.write("\t\t\t  <h1 class=\"judul\">Event List</h1>\r\n");
      out.write("\t\t\t   <table class=\"table\">\r\n");
      out.write("\t\t\t      <tr>\r\n");
      out.write("\t\t\t          <th>NO</th>\r\n");
      out.write("\t\t\t          <th>Event Name</th>\r\n");
      out.write("\t\t\t          <th>Event Location</th>\r\n");
      out.write("\t\t\t          <th>Date & Time</th>\r\n");
      out.write("\t\t\t          <th>&nbsp;&nbsp;Edit&nbsp;&nbsp;</th>\r\n");
      out.write("\t\t\t          <th>Delete</th>\r\n");
      out.write("\t\t\t          <th>View</th>\r\n");
      out.write("\t\t\t      </tr>\r\n");
      out.write("                              ");

                      SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");
                      DAONewEvent kt = new DAONewEvent();
                      DAONewLokasi dLok = new DAONewLokasi();
                      List<NewEvent> data = new ArrayList<NewEvent>();
                      String ket = request.getParameter("ket");
                      kt.setKdEvent("");
                      if (ket == null) {
                          data = kt.tampil();
                      }
                  
                      for (int x = 0; x < data.size(); x++) {
                              
      out.write("\r\n");
      out.write("\t\t\t      <tr>\r\n");
      out.write("\t\t\t\t      <!--____________________________script fungsi option kendaraan umum/pribadi____________________________-->   \r\n");
      out.write("\t\t\t          <td style=\"font-size: 12px; line-height: 20px;\">");
      out.print(x + 1);
      out.write("</td>\r\n");
      out.write("\t\t\t          <td style=\"font-size: 12px; line-height: 20px;\">");
      out.print(data.get(x).getNamaEvent());
      out.write("</td>\r\n");
      out.write("\t\t\t          <td style=\"font-size: 12px; line-height: 20px;\">");
      out.print(dLok.getLokasiAkhir(data.get(x).getKdEvent()));
      out.write("</td>\r\n");
      out.write("                                  <td style=\"font-size: 12px; line-height: 20px;\">");
      out.print(format.format(data.get(x).getWaktuSelesai()));
      out.write("</td>\r\n");
      out.write("\t\t\t          <td style=\"font-size: 12px; line-height: 35px;\"><span class=\"glyphicon glyphicon-edit\"></span></td>\r\n");
      out.write("\t\t\t          <td style=\"font-size: 12px; line-height: 35px;\"><a href=\"../../Event?kd_event=");
      out.print(data.get(x).getKdEvent());
      out.write("&proses=hapus-event\"><span class=\"glyphicon glyphicon-trash\"></span></a></td>\r\n");
      out.write("                                  <td style=\"font-size: 12px; line-height: 20px;\"><a href=\"?kd_event=");
      out.print(data.get(x).getKdEvent());
      out.write("\"><button class=\"tablinks\" id=\"defaultOpen\" onclick=\"opencity('tabcontent','pageedit')\"><span class=\"glyphicon glyphicon glyphicon-list\"></span></button></a></td>\r\n");
      out.write("\t\t\t      </tr>\r\n");
      out.write("                              ");
 
                                }
                              
      out.write("\r\n");
      out.write("\t\t\t\t      <script type=\"text/javascript\">\r\n");
      out.write("\t\t\t\t        function openCity(evt, editEvent) {\r\n");
      out.write("\t\t\t\t          var i, tabcontent, tablinks; //deklarasi variabel\r\n");
      out.write("\t\t\t\t          //mengambil element yang ada di class tabcontent dan menyembunyikan class \r\n");
      out.write("\t\t\t\t          tabcontent = document.getElementsByClassName(\"tabcontent\");\r\n");
      out.write("\t\t\t\t          for (i = 0; i < tabcontent.length; i++) {\r\n");
      out.write("\t\t\t\t              tabcontent[i].style.display = \"none\";\r\n");
      out.write("\t\t\t\t          }\r\n");
      out.write("\t\t\t\t          //mengambil element yang ada di class tablinks dan menghapus yg aktif di display\r\n");
      out.write("\t\t\t\t          tablinks = document.getElementsByClassName(\"tablinks\");\r\n");
      out.write("\t\t\t\t          for (i = 0; i < tablinks.length; i++) {\r\n");
      out.write("\t\t\t\t              tablinks[i].className = tablinks[i].className.replace(\" active\", \"\");\r\n");
      out.write("\t\t\t\t          }\r\n");
      out.write("\t\t\t\t          //menampilkan class yang aktif kelayar dengan posisi block/dibawah content tsb\r\n");
      out.write("\t\t\t\t          document.getElementById(editEvent).style.display = \"block\";\r\n");
      out.write("\t\t\t\t          evt.currentTarget.className += \" active\";\r\n");
      out.write("\t\t\t\t          }\r\n");
      out.write("\t\t\t\t      </script>\r\n");
      out.write("\t\t\t      </table>\r\n");
      out.write("\t\t\t  </div>\r\n");
      out.write("  \t\t</div>\r\n");
      out.write("</article>\r\n");
      out.write("  </div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("                \r\n");
      out.write("\t\t<div class=\"col-lg-6 col-md-12 col-sm-12 col-xs-12 rightpage\">\r\n");
      out.write("\t\t\t<!--<div id=\"pageedit\" class=\"tabcontent\">-->\r\n");
      out.write("\t\t      <h1 class=\"judul\">Detail Event</h1>\r\n");
      out.write("                      ");

                          if(request.getParameter("kd_event")!= null){
                                String kd = request.getParameter("kd_event");
                                kt.setKdEvent(kd);
                                List<NewEvent> ev = new ArrayList<NewEvent>();
                                ev = kt.cariID();
                      
      out.write("\r\n");
      out.write("                      <div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 detail1judul\">\r\n");
      out.write("\t\t\t  <h2 class=\"h2detail\">Detail</h2>\r\n");
      out.write("                      </div>\r\n");
      out.write("                      <div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 detail1\">\r\n");
      out.write("                          <p class=\"pdetail\">Event Name &nbsp;&nbsp;:  ");
      out.print(ev.get(0).getNamaEvent());
      out.write("</p>\r\n");
      out.write("\t\t\t  <p class=\"pdetail\">Event Time &nbsp;&nbsp;: ");
      out.print(format.format(ev.get(0).getWaktuMulai()));
      out.write(" until ");
      out.print(format.format(ev.get(0).getWaktuSelesai()));
      out.write("</p>\r\n");
      out.write("                      </div>\r\n");
      out.write("                      <div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 detail1judul\">\r\n");
      out.write("\t\t\t  <h2 class=\"h2detail\">Location</h2>\r\n");
      out.write("                      </div>\r\n");
      out.write("                      <div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 detail1\">\r\n");
      out.write("                          \r\n");
      out.write("                      <p class=\"pdetail\">End Point &nbsp;&nbsp;:");
      out.print(dLok.getLokasiAkhir(kd));
      out.write("</div></p>  <div id=\"end\">\r\n");
      out.write("\t\t\t  <p class=\"pdetail\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Description &nbsp;&nbsp;: ");
      out.print(ev.get(0).getKeterangan());
      out.write("</p>\r\n");
      out.write("                      </div>\r\n");
      out.write("                      <div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 detail1judul\">\r\n");
      out.write("\t\t\t  <h2 class=\"h2detail\">Transportation</h2>\r\n");
      out.write("                      </div>\r\n");
      out.write("                      <div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 detail1\">\r\n");
      out.write("\t\t\t  <p class=\"pdetail\">Transport Name &nbsp;&nbsp;: Motorcycle</p>\r\n");
      out.write("\t\t\t  <p class=\"pdetail\">Distance &nbsp;&nbsp;: 0.55 KM</p>\r\n");
      out.write("\t\t\t  <p class=\"pdetail\">Estimated &nbsp;&nbsp;: 5 Minutes</p>\r\n");
      out.write("\t\t\t  <p class=\"pdetail\">Departure Time &nbsp;&nbsp;: 06:45</p>\r\n");
      out.write("                      </div>\r\n");
      out.write("\t\t\t<div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 maptampil\">\r\n");
      out.write("                            <div id=\"map\" style=\"width: 500px; height:500px;\"></div>\r\n");
      out.write("\t     \t</div>\r\n");
      out.write("                <script type=\"text/javascript\">\r\n");
      out.write("<script>\r\n");
      out.write("      function initMap() {\r\n");
      out.write("        var directionsDisplay = new google.maps.DirectionsRenderer;\r\n");
      out.write("        var directionsService = new google.maps.DirectionsService;\r\n");
      out.write("        var map = new google.maps.Map(document.getElementById('map'), {\r\n");
      out.write("          zoom: 7,\r\n");
      out.write("          center: {lat: 41.85, lng: -87.65}\r\n");
      out.write("        });\r\n");
      out.write("        directionsDisplay.setMap(map);\r\n");
      out.write("        directionsDisplay.setPanel(document.getElementById('right-panel'));\r\n");
      out.write("\r\n");
      out.write("        var control = document.getElementById('floating-panel');\r\n");
      out.write("        control.style.display = 'block';\r\n");
      out.write("        map.controls[google.maps.ControlPosition.TOP_CENTER].push(control);\r\n");
      out.write("\r\n");
      out.write("        var onChangeHandler = function() {\r\n");
      out.write("          calculateAndDisplayRoute(directionsService, directionsDisplay);\r\n");
      out.write("        };\r\n");
      out.write("        document.getElementById('start').addEventListener('change', onChangeHandler);\r\n");
      out.write("        document.getElementById('end').addEventListener('change', onChangeHandler);\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      function calculateAndDisplayRoute(directionsService, directionsDisplay) {\r\n");
      out.write("        var start = document.getElementById('start').value;\r\n");
      out.write("        var end = document.getElementById('end').value;\r\n");
      out.write("        directionsService.route({\r\n");
      out.write("          origin: '");
      out.print(dLok.getLokasiAwal(kd));
      out.write("',\r\n");
      out.write("          destination: '");
      out.print(dLok.getLokasiAkhir(kd));
      out.write("',\r\n");
      out.write("          travelMode: 'DRIVING'\r\n");
      out.write("        }, function(response, status) {\r\n");
      out.write("          if (status === 'OK') {\r\n");
      out.write("            directionsDisplay.setDirections(response);\r\n");
      out.write("          } else {\r\n");
      out.write("            window.alert('Directions request failed due to ' + status);\r\n");
      out.write("          }\r\n");
      out.write("        });\r\n");
      out.write("      }\r\n");
      out.write("    </script>\r\n");
      out.write("    </script>\r\n");
      out.write("    <script async defer\r\n");
      out.write("    src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyBv4kFWkwB0XYeqOlfLxT0ZYsc4DRyNdag&callback=initMap\">\r\n");
      out.write("    </script>              \r\n");
      out.write("                              \r\n");
      out.write("                              \r\n");
      out.write("                          \r\n");
      out.write("                         \r\n");
      out.write("                          \r\n");
      out.write("\t\t\t\r\n");
      out.write("                        ");

                        }

                        
      out.write("\r\n");
      out.write("  \t\t</div>\r\n");
      out.write("  </div>\r\n");
      out.write("</article>\r\n");
      out.write("</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t<div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 fullfooter\">&copy; Kelompok B1 | Made With â¤ by FrontEnd in Kosan Uda</div>\r\n");
      out.write("</body>\r\n");
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
