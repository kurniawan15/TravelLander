package org.apache.jsp.Login.Data;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import DAO.DAONewEvent;
import DAO.DAOEventNext;
import model.EventNext;
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<title></title>\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/grid.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\r\n");
      out.write("\t<link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\r\n");
      out.write("           <script src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyBv4kFWkwB0XYeqOlfLxT0ZYsc4DRyNdag\"></script>\r\n");
      out.write("    <script src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 fixed-header\">\r\n");
      out.write("        <div class=\"col-lg-3 col-md-12 col-sm-12 col-xs-12 kiri\">\r\n");
      out.write("        \t <ul>\r\n");
      out.write("                <a href=\"home.html\" style=\"text-decoration: none; color: white;\"><li class=\"none\"><i style=\"font-size: 14px;\" class=\"material-icons\">home</i>&nbsp;&nbsp;&nbsp;Home</li></a>\r\n");
      out.write("                <a href=\"addEvent.html\" style=\"text-decoration: none; color: white;\"><li class=\"none\"><i style=\"font-size: 14px;\" class=\"material-icons\">add</i>&nbsp;&nbsp;&nbsp;Add Event</li></a>\r\n");
      out.write("                <li class=\"pilih\"><i style=\"font-size: 14px;\" class=\"material-icons\">toc</i>&nbsp;&nbsp;&nbsp;My Event</li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-lg-6 col-md-12 col-sm-12 col-xs-12 kiri\">\r\n");
      out.write("            <center><img class=\"img-responsive logo\" src=\"img/logo1.png\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-lg-1 col-md-12 col-sm-12 col-xs-12 kanan\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-lg-2 col-md-12 col-sm-12 col-xs-12 dropdown\">\r\n");
      out.write("            <center><button onclick=\"myFunction()\" class=\"dropbtn\">Hi, Fajar Panca Saputra&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<i style=\"font-size: 14px;\" class=\"material-icons\">arrow_drop_down</i></button></center>\r\n");
      out.write("              <div id=\"myDropdown\" class=\"dropdown-content\">\r\n");
      out.write("                <center><a href=\"#contact\">Logout &nbsp;&nbsp;&nbsp;<i style=\"font-size: 14px;\" class=\"material-icons\">launch</i></a></center>\r\n");
      out.write("              </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 fullpage\">\r\n");
      out.write("\t\t<div class=\"col-lg-6 col-md-12 col-sm-12 col-xs-12 leftpagefinish\">\r\n");
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
      out.write("\t\t\t          <th>Edit</th>\r\n");
      out.write("\t\t\t          <th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Delete</th>\r\n");
      out.write("\t\t\t          <th>&nbsp;&nbsp;&nbsp;&nbsp;View</th>\r\n");
      out.write("\t\t\t      </tr>\r\n");
      out.write("                             ");

                                  
                      SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");
                      //DAONewEvent kt = new DAONewEvent();
                      DAOEventNext nx = new DAOEventNext();
                      DAONewLokasi dLok = new DAONewLokasi();
                      List<EventNext> data = new ArrayList<EventNext>();
                      try{
                      String ket = request.getParameter("ket");
                      nx.setKdTraveller("");
                      if (ket == null) {
                          data = nx.getEventNext("TD001");
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
      out.write("\t\t\t          <td style=\"font-size: 12px; line-height: 45px;\"><a href=\"edit.html\"><i style=\"font-size: 20px; color: grey;\" class=\"material-icons\">edit</i></a></td>\r\n");
      out.write("\t\t\t          <td><button class=\"btn\"><i style=\"font-size: 19px; text-align: center;\" class=\"material-icons\">delete</i></button>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"popup\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span id=\"close\">&times;</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"confirm\">Do you want to delete this event?</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"option\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a class=\"confirmbtn\" href=\"\">cancel</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a class=\"confirmbtn\" href=\"\">delete</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"cover\"></div>\r\n");
      out.write("\t\t\t\t\t\t<script src=\"js/jquery.min.js\"></script>\r\n");
      out.write("\t\t\t\t\t\t<script>\r\n");
      out.write("\t\t\t\t\t\t\t$(document).ready(function(){\r\n");
      out.write("\t\t\t\t\t\t\t\t$(\".btn\").on('click', function(){\r\n");
      out.write("\t\t\t\t\t\t\t\t\t$(\".cover\").fadeIn('slow');\r\n");
      out.write("\t\t\t\t\t\t\t\t\t$(\".popup\").fadeIn('slow');\r\n");
      out.write("\t\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\t\t$(\".popup\").on('click', function(){\r\n");
      out.write("\t\t\t\t\t\t\t\t\tif($(event.target).is(\"#close\")){\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t$(\".cover\").fadeOut('slow');\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t$(\".popup\").fadeOut('slow');\r\n");
      out.write("\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\t\t$('.cover').on('click', function(){\r\n");
      out.write("\t\t\t\t\t\t\t\t\t$(\".cover\").fadeOut('slow');\r\n");
      out.write("\t\t\t\t\t\t\t\t\t$(\".popup\").fadeOut('slow');\r\n");
      out.write("\t\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t</script>\t</td>\r\n");
      out.write("                                  <td style=\"font-size: 12px; line-height: 20px; background-color: none;\"><a href=\"?kd_event=");
      out.print(data.get(x).getKdEvent());
      out.write("\"><button class=\"tablinks\" id=\"defaultOpen\" onclick=\"opencity('tabcontent','pageedit')\"><i style=\"font-size: 20px; color: grey;\" class=\"material-icons\">subject</i></a></td>\r\n");
      out.write("\t\t\t      \t\t</tr>\r\n");
      out.write("\r\n");
      out.write("                               ");
 
                                }
}catch(Exception ex){
    ex.printStackTrace();
}
                              
      out.write("\r\n");
      out.write("\t\t\t\t      <script type=\"text/javascript\">\r\n");
      out.write("\t\t\t\t        function myFunction() {\r\n");
      out.write("\t\t                    document.getElementById(\"myDropdown\").classList.toggle(\"show\");\r\n");
      out.write("\t\t                }\r\n");
      out.write("\r\n");
      out.write("\t\t                // Close the dropdown if the user clicks outside of it\r\n");
      out.write("\t\t                window.onclick = function(event) {\r\n");
      out.write("\t\t                  if (!event.target.matches('.dropbtn')) {\r\n");
      out.write("\r\n");
      out.write("\t\t                    var dropdowns = document.getElementsByClassName(\"dropdown-content\");\r\n");
      out.write("\t\t                    var i;\r\n");
      out.write("\t\t                    for (i = 0; i < dropdowns.length; i++) {\r\n");
      out.write("\t\t                      var openDropdown = dropdowns[i];\r\n");
      out.write("\t\t                      if (openDropdown.classList.contains('show')) {\r\n");
      out.write("\t\t                        openDropdown.classList.remove('show');\r\n");
      out.write("\t\t                      }\r\n");
      out.write("\t\t                    }\r\n");
      out.write("\t\t                  }\r\n");
      out.write("\t\t                }\r\n");
      out.write("\r\n");
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
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\t<div class=\"col-lg-1\"></div>\r\n");
      out.write("\t\t\t<div class=\"col-lg-10 col-md-12 col-sm-12 col-xs-12 tableviews\">\r\n");
      out.write("\t\t\t<table class=\"tableview\" id=\"\">\r\n");
      out.write("\t            <tr>\r\n");
      out.write("\t                <th>Event Name</th>\r\n");
      out.write("\t                <th>Event Time</th>\r\n");
      out.write("\t            </tr>\r\n");
      out.write("\t            <tr>\r\n");
      out.write("\t                <td title=\"EventName\"> - </td>\r\n");
      out.write("\t                <td title=\"EventTime\"> - </td>\r\n");
      out.write("\t            </tr>\r\n");
      out.write("\t        </table>\r\n");
      out.write("\t        <br><br>\r\n");
      out.write("\t        <table class=\"tableview\" id=\"\">\r\n");
      out.write("\t            <tr>\r\n");
      out.write("\t                <th>End Point</th>\r\n");
      out.write("\t                <th>Description</th>\r\n");
      out.write("\t            </tr>\r\n");
      out.write("\t            <tr>\r\n");
      out.write("\t                <td title=\"EndPoint\"> - </td>\r\n");
      out.write("\t                <td title=\"Description\"> - </td>\r\n");
      out.write("\t            </tr>\r\n");
      out.write("\t        </table>\r\n");
      out.write("\t        <br><br>\r\n");
      out.write("\t        <table class=\"tableview\" id=\"\">\r\n");
      out.write("\t            <tr>\r\n");
      out.write("\t                <th>Transport Name</th>\r\n");
      out.write("\t                <th>Distance</th>\r\n");
      out.write("\t                <th>Estimated</th>\r\n");
      out.write("\t                <th>Departure Time</th>\r\n");
      out.write("\t            </tr>\r\n");
      out.write("\t            <tr>\r\n");
      out.write("\t                <td title=\"Transport\"> - </td>\r\n");
      out.write("\t                <td title=\"Distance\"> - </td>\r\n");
      out.write("\t                <td title=\"Estimated\"> - </td>\r\n");
      out.write("\t                <td title=\"Departure\"> - </td>\r\n");
      out.write("\t            </tr>\r\n");
      out.write("\t        </table>\r\n");
      out.write("\t        <br>\r\n");
      out.write("\t    </div>\r\n");
      out.write("\t\t\t<div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 maptampil\">\r\n");
      out.write("            <div class=\"col-lg-1\"></div>                \r\n");
      out.write("\t\t\t<div class=\"col-lg-10\" id=\"map\" style=\"width: 530px; height:280px;\"></div>\r\n");
      out.write("\t     \t</div>\r\n");
      out.write("\r\n");
      out.write("    <script type=\"text/javascript\">               \r\n");
      out.write("      \r\n");
      out.write("      function initMap() {\r\n");
      out.write("        var directionsService = new google.maps.DirectionsService;\r\n");
      out.write("        var directionsDisplay = new google.maps.DirectionsRenderer;\r\n");
      out.write("        var map = new google.maps.Map(document.getElementById('map'), {\r\n");
      out.write("          zoom: 7,\r\n");
      out.write("          center: {lat: 41.85, lng: -87.65}\r\n");
      out.write("        });\r\n");
      out.write("        directionsDisplay.setMap(map);\r\n");
      out.write("\r\n");
      out.write("        var onChangeHandler = function() {\r\n");
      out.write("          calculateAndDisplayRoute(directionsService, directionsDisplay);\r\n");
      out.write("        };\r\n");
      out.write("        document.getElementById('start').addEventListener('change', onChangeHandler);\r\n");
      out.write("        document.getElementById('end').addEventListener('change', onChangeHandler);\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      function calculateAndDisplayRoute(directionsService, directionsDisplay) {\r\n");
      out.write("        directionsService.route({\r\n");
      out.write("          origin: document.getElementById('start').value,\r\n");
      out.write("          destination: document.getElementById('end').value,\r\n");
      out.write("          \r\n");
      out.write("          travelMode: 'DRIVING'\r\n");
      out.write("        }, function(response, status) {\r\n");
      out.write("          if (status === 'OK') {\r\n");
      out.write("            directionsDisplay.setDirections(response);\r\n");
      out.write("            alert(origin);\r\n");
      out.write("          } else {\r\n");
      out.write("            window.alert('Directions request failed due to ' + status);\r\n");
      out.write("          }\r\n");
      out.write("        });\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      var deleteLinks = document.querySelectorAll('.delete');\r\n");
      out.write("\r\n");
      out.write("\t\tfor (var i = 0; i < deleteLinks.length; i++) {\r\n");
      out.write("\t\t  deleteLinks[i].addEventListener('click', function(event) {\r\n");
      out.write("\t\t\t  event.preventDefault();\r\n");
      out.write("\r\n");
      out.write("\t\t\t  var choice = confirm(this.getAttribute('data-confirm'));\r\n");
      out.write("\r\n");
      out.write("\t\t\t  if (choice) {\r\n");
      out.write("\t\t\t    window.location.href = this.getAttribute('href');\r\n");
      out.write("\t\t\t  }\r\n");
      out.write("\t\t  });\r\n");
      out.write("\t\t}\r\n");
      out.write("    </script>\r\n");
      out.write("    <script async defer\r\n");
      out.write("    src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyBv4kFWkwB0XYeqOlfLxT0ZYsc4DRyNdag&callback=initMap\">\r\n");
      out.write("    </script>              \r\n");
      out.write("\t\t\t\r\n");
      out.write("                     \r\n");
      out.write("  \t\t</div>\r\n");
      out.write("  </div>\r\n");
      out.write("</article>\r\n");
      out.write("</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t<div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 fixed-footer\">&copy; Kelompok B1 | Front End Team</div>\r\n");
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
