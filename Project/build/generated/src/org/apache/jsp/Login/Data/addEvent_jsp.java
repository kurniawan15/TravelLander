package org.apache.jsp.Login.Data;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.TransportasiPribadi;
import DAO.DAOTransportasiPribadi;
import model.TransportasiPublik;
import DAO.DAOTransportasiPublik;
import model.Lokasi;
import java.util.ArrayList;
import java.util.List;
import DAO.DAOLokasi;

public final class addEvent_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <!--____________________________Call Css Page Input____________________________-->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/Createschedule.css\">\r\n");
      out.write("    <!--____________________________Title Website____________________________-->\r\n");
      out.write("    <title>Travelendar - Input Schedule</title>\r\n");
      out.write("</head>\r\n");
      out.write("<!--____________________________Background page____________________________-->\r\n");
      out.write("<style>\r\n");
      out.write("  body{\r\n");
      out.write("    background-image: url(img/2.jpg);/*call image*/\r\n");
      out.write("    background-position: center center;/*set posisi background agar ditengah*/\r\n");
      out.write("    background-repeat: no-repeat;/*set gambar biar gaberulang*/\r\n");
      out.write("    background-attachment: fixed;/*set gambar agar ketika discroll tidak ikut bergerak*/\r\n");
      out.write("    background-size: cover;/*set ukuran gambar sesuai ukuran layar*/\r\n");
      out.write("    }\r\n");
      out.write("</style>\r\n");
      out.write("<body>\r\n");
      out.write("  <!--____________________________Header-Menu____________________________-->\r\n");
      out.write("  <nav class=\"navbar\">\r\n");
      out.write("    <span class=\"open-slide\">\r\n");
      out.write("      <a href=\"#\" onclick=\"openSlideMenu()\">\r\n");
      out.write("      <svg width=\"30\" height=\"30\">\r\n");
      out.write("      <path d=\"M0,5 30,5\" stroke=\"#fff\"stroke-width=\"5\"/>\r\n");
      out.write("      <path d=\"M0,14 30,14\" stroke=\"#fff\" stroke-width=\"5\"/>\r\n");
      out.write("      <path d=\"M0,23 30,23\" stroke=\"#fff\" stroke-width=\"5\"/>\r\n");
      out.write("      </svg>\r\n");
      out.write("      </a>\r\n");
      out.write("    </span>\r\n");
      out.write("    <!--____________________________Tombol-Logout____________________________-->\r\n");
      out.write("    <ul id=\"dropdown\">\r\n");
      out.write("      <li><a href=\"#\">Log Out</a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    <!--____________________________Script Fungsi Slide Menu____________________________-->\r\n");
      out.write("    <script>\r\n");
      out.write("      function openSlideMenu(){\r\n");
      out.write("        //ukuran menu ketika ditampilkan\r\n");
      out.write("        document.getElementById('side-menu').style.width = '250px';\r\n");
      out.write("        document.getElementById('main').style.marginLeft = '250px';\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      function closeSlideMenu(){\r\n");
      out.write("        //ukuran menu ketika dihide\r\n");
      out.write("        document.getElementById('side-menu').style.width = '0';\r\n");
      out.write("        document.getElementById('main').style.marginLeft = '0';\r\n");
      out.write("      }\r\n");
      out.write("    </script>\r\n");
      out.write("  </nav>\r\n");
      out.write("<form action=\"../../addEvent?data=event&proses=input-event\" method=\"post\">\r\n");
      out.write("  <div id=\"side-menu\" class=\"side-nav\">\r\n");
      out.write("    <a href=\"#\" class=\"btn-close\" onclick=\"closeSlideMenu()\">&times;</a>\r\n");
      out.write("    <a href=\"dashboardCreateSchedule.jsp\">Dashboard</a>                                                                  \r\n");
      out.write("    <a href=\"addEvent.jsp\">Create Schedule</a>\r\n");
      out.write("    <a href=\"#\">Finished Task</a>\r\n");
      out.write("    <a href=\"lisData.jsp\">Event List</a>\r\n");
      out.write("    <a href=\"../Admin/jarak.jsp\">Manage</a>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("  <!--____________________________Isi Content Tabel Inputan____________________________-->\r\n");
      out.write("  <div class=\"main-content\">\r\n");
      out.write("    <div id=\"main\">                                         \r\n");
      out.write("    <div class=\"widget\">\r\n");
      out.write("    <div class=\"title\">Create Schedule</div>\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("    <!--____________________________Form Inputan Nama Event____________________________-->\r\n");
      out.write("    <div class=\"namaevent\">\r\n");
      out.write("      <h1 class=\"hnamaevent\">Event Name :</h1>\r\n");
      out.write("      <input type=\"text\" id=\"fname\" name=\"nama_event\" placeholder=\"Input Event Name\">\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <!--____________________________Form Inputan Waktu Event____________________________-->\r\n");
      out.write("    <div class=\"waktu\">\r\n");
      out.write("      <h1 class=\"hwaktu\">Event Time :</h1>\r\n");
      out.write("      <!--____________________________Form input waktu awal____________________________-->\r\n");
      out.write("      <input type=\"datetime-local\" style=\"width: 230px; border-radius:5px;\r\n");
      out.write("      box-sizing: border-box; width: 45.6%; padding-top: 2%; padding-bottom: 2%; padding-left:4%; opacity: 0.8;\" name=\"waktu_mulai\" placeholder=\"start time\"> <i>&nbsp;until&nbsp;</i>\r\n");
      out.write("      <!--____________________________Form input waktu akhir--> \r\n");
      out.write("      <input type=\"datetime-local\" style=\"width: 230px; border-radius:5px;\r\n");
      out.write("      box-sizing: border-box; width: 45.6%; padding-top: 2%; padding-bottom: 2%; padding-left:4%; opacity: 0.8;\" name=\"waktu_selesai\" placeholder=\"End time\">   \r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <!--____________________________Form Inputan Lokasi Awal____________________________-->\r\n");
      out.write("    <div class=\"LokasiAwal\">\r\n");
      out.write("      <h1 class=\"hlokasiawal\">Start Location :</h1>\r\n");
      out.write("      <select id=\"LokasiAwal\" name=\"kd_lokasi_awal\">\r\n");
      out.write("         ");

             DAOLokasi dLok = new DAOLokasi();
             List<Lokasi> lok = new ArrayList<Lokasi>();
             lok = dLok.tampil();
             
             for(Lokasi l:lok){
         
      out.write("\r\n");
      out.write("        <option value=\"");
      out.print(l.getKdLokasi());
      out.write('"');
      out.write('>');
      out.print(l.getNamaLokasi());
      out.write("</option>\r\n");
      out.write("        ");

            }
        
      out.write("\r\n");
      out.write("      </select>     \r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <!--____________________________Form Inputan Lokasi Akhir____________________________-->   \r\n");
      out.write("    <div class=\"LokasiAkhir\">\r\n");
      out.write("      <h1 class=\"hlokasiakhir\">End Location :</h1>\r\n");
      out.write("      <select id=\"LokasiAkhir\" name=\"kd_lokasi_akhir\">\r\n");
      out.write("        ");

             for(Lokasi l:lok){
         
      out.write("\r\n");
      out.write("        <option value=\"");
      out.print(l.getKdLokasi());
      out.write('"');
      out.write('>');
      out.print(l.getNamaLokasi());
      out.write("</option>\r\n");
      out.write("        ");

            }
        
      out.write("\r\n");
      out.write("      </select> \r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <!--____________________________Form Inputan Nama Event____________________________-->\r\n");
      out.write("    <div class=\"keteranganevent\">\r\n");
      out.write("      <h1 class=\"hketevent\">Event Description :</h1>\r\n");
      out.write("      <input type=\"text\" id=\"fname\" name=\"keterangan\" placeholder=\"Input Event Description\">\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!--____________________________Form Inputan Transportasi____________________________-->   \r\n");
      out.write("    <div class=\"Transportasi\">\r\n");
      out.write("      <h1 class=\"htransportasi\">Transportation :</h1>\r\n");
      out.write("      <div class=\"tab\">\r\n");
      out.write("         <input type=\"hidden\" name=\"jenis_moda\" id=\"jenis_moda\">\r\n");
      out.write("        <button type=\"button\" class=\"tablinks\" onclick=\"openCity(event, 'Umum')\" id=\"defaultOpen\">Umum</button>\r\n");
      out.write("        <button type=\"button\" class=\"tablinks\" onclick=\"openCity(event, 'Pribadi')\">Pribadi</button>\r\n");
      out.write("      </div>\r\n");
      out.write("      <!--____________________________script fungsi option kendaraan umum/pribadi____________________________-->   \r\n");
      out.write("      \r\n");
      out.write("      <script type=\"text/javascript\">\r\n");
      out.write("        function openCity(evt, cityName) {\r\n");
      out.write("          var i, tabcontent, tablinks; //deklarasi variabel\r\n");
      out.write("          //\r\n");
      out.write("          //mengambil element yang ada di class tabcontent dan menyembunyikan class \r\n");
      out.write("          tabcontent = document.getElementsByClassName(\"tabcontent\");\r\n");
      out.write("          for (i = 0; i < tabcontent.length; i++) {\r\n");
      out.write("              tabcontent[i].style.display = \"none\";\r\n");
      out.write("          }\r\n");
      out.write("          //mengambil element yang ada di class tablinks dan menghapus yg aktif di display\r\n");
      out.write("          tablinks = document.getElementsByClassName(\"tablinks\");\r\n");
      out.write("          for (i = 0; i < tablinks.length; i++) {\r\n");
      out.write("              tablinks[i].className = tablinks[i].className.replace(\" active\", \"\");\r\n");
      out.write("          }\r\n");
      out.write("          \r\n");
      out.write("          //menampilkan class yang aktif kelayar dengan posisi block/dibawah content tsb\r\n");
      out.write("          document.getElementById(cityName).style.display = \"block\";\r\n");
      out.write("          evt.currentTarget.className += \" active\";\r\n");
      out.write("          \r\n");
      out.write("           document.getElementById(\"jenis_moda\").value = cityName;\r\n");
      out.write("                    }\r\n");
      out.write("      </script>\r\n");
      out.write("     \r\n");
      out.write("        <!--____________________________isi option di kendaraan umum____________________________-->      \r\n");
      out.write("        <div id=\"Umum\" class=\"tabcontent\">\r\n");
      out.write("        <select id=\"UmumModa\" name=\"kd_transportasi_publik\">\r\n");
      out.write("            ");

                DAOTransportasiPublik dTransP = new DAOTransportasiPublik();
                List<TransportasiPublik> listTP = new ArrayList<TransportasiPublik>();
                listTP = dTransP.tampil();
                for(TransportasiPublik tp : listTP){
            
      out.write("\r\n");
      out.write("                <option value=\" ");
      out.print(tp.getKdTransportasiPublik());
      out.write("\"> ");
      out.print(tp.getNamaTransportasiPublik());
      out.write("</option>\r\n");
      out.write("            ");

                }
            
      out.write("\r\n");
      out.write("        </select>     \r\n");
      out.write("        </div>\r\n");
      out.write("        <!--____________________________isi option di kendaraan pribadi____________________________--> \r\n");
      out.write("        <div id=\"Pribadi\" class=\"tabcontent\">\r\n");
      out.write("        <select id=\"PribadiModa\" name=\"kd_transportasi_pribadi\">\r\n");
      out.write("          ");

                DAOTransportasiPribadi dTransPr = new DAOTransportasiPribadi();
                List<TransportasiPribadi> listTPr = new ArrayList<TransportasiPribadi>();
                listTPr = dTransPr.tampil();
                for(int x = 0; x < listTPr.size(); x++){
            
      out.write("\r\n");
      out.write("                <option value=\"");
      out.print(listTPr.get(x).getKdTansportasiPribadi());
      out.write("\"> ");
      out.print(listTPr.get(x).getNamaTransportasiPribadi());
      out.write("</option>\r\n");
      out.write("            ");

                }
            
      out.write("\r\n");
      out.write("        </select>      \r\n");
      out.write("        </div>\r\n");
      out.write("      </div><br>\r\n");
      out.write("\r\n");
      out.write("      <!--____________________________Tombol Submit or cancel____________________________--> \r\n");
      out.write("      <div class=\"col-12 enter\">\r\n");
      out.write("        \r\n");
      out.write("            <input type=\"submit\" value=\"Create Schedule\">\r\n");
      out.write("        \r\n");
      out.write("            <input type=\"submit\" value=\"Cancel\" style=\"background-color: red;\">\r\n");
      out.write("      </div><br> \r\n");
      out.write("      \r\n");
      out.write("\r\n");
      out.write("      </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</form>  \r\n");
      out.write("    <!--____________________________Footer Page____________________________--> \r\n");
      out.write("    <div class=\"footer\">\r\n");
      out.write("        <a href=\"addEvent.jsp\"></a>\r\n");
      out.write("      <div class=\"footkiri\">\r\n");
      out.write("        <img class=\"logoweb\" src=\"img/L21.png\">\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"footkanan\">\r\n");
      out.write("        <p class=\"pfooter\">  \r\n");
      out.write("        ©Copyright Kelompok B1 [<i><b>Brave Heart-Group</b></i>] | Front-End [Made With Love] | October 2017</p>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
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
