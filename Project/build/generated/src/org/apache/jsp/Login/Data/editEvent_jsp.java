package org.apache.jsp.Login.Data;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class editEvent_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <li class=\"none\"><a href=\"#\"><i class=\"material-icons\" style=\"font-size:20px;color:white; padding-right: 30px;\">home</i>Dashboard</a></li>\r\n");
      out.write("    <li class=\"pilih\"><i class=\"material-icons\" style=\"font-size:20px;color:white; padding-right: 30px;\">add</i>Create Schedule</li>\r\n");
      out.write("    <li class=\"none\"><a href=\"#\"><i class=\"material-icons\" style=\"font-size:20px;color:white; padding-right: 30px;\">done</i>Finished Task</a></li>\r\n");
      out.write("    <li class=\"none\"><a href=\"#\"><i class=\"material-icons\" style=\"font-size:20px;color:white; padding-right: 30px;\">list</i>Event List</a></li>\r\n");
      out.write("    <li class=\"none\"><a href=\"#\"><i class=\"material-icons\" style=\"font-size:20px;color:white; padding-right: 30px;\">build</i>Manage</a></li>\r\n");
      out.write("</ul>\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("<article class=\"article\">\r\n");
      out.write("  <div class=\"content\">\r\n");
      out.write("  <div id=\"main\">                                         \r\n");
      out.write("  <br><br><br><br><br>\r\n");
      out.write("  <h1 class=\"judul\">Edit Schedule</h1>\r\n");
      out.write("    <div class=\"widget\">\r\n");
      out.write("    <div class=\"title\"><b>Detail</b></div>\r\n");
      out.write("    \r\n");
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
      out.write("      <input type=\"datetime-local\" name=\"waktu_mulai\" placeholder=\"start time\"> <i>&nbsp;until&nbsp;</i>\r\n");
      out.write("      <!--____________________________Form input waktu akhir--> \r\n");
      out.write("      <input type=\"datetime-local\" name=\"waktu_selesai\" placeholder=\"End time\">   \r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <!--____________________________Form Inputan Lokasi Awal____________________________-->\r\n");
      out.write("    <div class=\"LokasiAwal\">\r\n");
      out.write("      <div class=\"title\"><b><br>Location</b></div>\r\n");
      out.write("      <h1 class=\"hlokasiawal\">Start Location :</h1>\r\n");
      out.write("      <select id=\"LokasiAwal\" name=\"kd_lokasi_awal\">\r\n");
      out.write("        <option value=\"Lokasi1\">Lokasi 1</option>\r\n");
      out.write("        <option value=\"Lokasi2\">Lokasi 2</option>\r\n");
      out.write("        <option value=\"Lokasi3\">Lokasi 3</option>\r\n");
      out.write("        <option value=\"Lokasi4\">Lokasi 4</option>\r\n");
      out.write("        <option value=\"Lokasi5\">Lokasi 5</option>\r\n");
      out.write("      </select>     \r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <!--____________________________Form Inputan Lokasi Akhir____________________________-->   \r\n");
      out.write("    <div class=\"LokasiAkhir\">\r\n");
      out.write("      <h1 class=\"hlokasiakhir\">End Location :</h1>\r\n");
      out.write("      <select id=\"LokasiAkhir\" name=\"kd_lokasi_akhir\">\r\n");
      out.write("        <option value=\"Lokasi1\">Lokasi 1</option>\r\n");
      out.write("        <option value=\"Lokasi2\">Lokasi 2</option>\r\n");
      out.write("        <option value=\"Lokasi3\">Lokasi 3</option>\r\n");
      out.write("        <option value=\"Lokasi4\">Lokasi 4</option>\r\n");
      out.write("        <option value=\"Lokasi5\">Lokasi 5</option>\r\n");
      out.write("      </select>     \r\n");
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
      out.write("        <button class=\"tablinks\" onclick=\"openCity(event, 'Umum')\" id=\"defaultOpen\">Umum</button>\r\n");
      out.write("        <button class=\"tablinks\" onclick=\"openCity(event, 'Pribadi')\">Pribadi</button>\r\n");
      out.write("      </div>\r\n");
      out.write("      <!--____________________________script fungsi option kendaraan umum/pribadi____________________________-->   \r\n");
      out.write("      <script type=\"text/javascript\">\r\n");
      out.write("        function openCity(evt, cityName) {\r\n");
      out.write("          var i, tabcontent, tablinks; //deklarasi variabel\r\n");
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
      out.write("          //menampilkan class yang aktif kelayar dengan posisi block/dibawah content tsb\r\n");
      out.write("          document.getElementById(cityName).style.display = \"block\";\r\n");
      out.write("          evt.currentTarget.className += \" active\";\r\n");
      out.write("          }\r\n");
      out.write("      </script>\r\n");
      out.write("        <!--____________________________isi option di kendaraan umum____________________________-->      \r\n");
      out.write("        <div id=\"Umum\" class=\"tabcontent\">\r\n");
      out.write("        <select id=\"UmumModa\" name=\"kd_moda\">\r\n");
      out.write("          <option value=\"Taksi\">Taksi</option>\r\n");
      out.write("          <option value=\"Bus\">Bus</option>\r\n");
      out.write("          <option value=\"Kereta\">Kereta</option>\r\n");
      out.write("          <option value=\"Pesawat\">Pesawat</option>\r\n");
      out.write("        </select>     \r\n");
      out.write("        </div>\r\n");
      out.write("        <!--____________________________isi option di kendaraan pribadi____________________________--> \r\n");
      out.write("        <div id=\"Pribadi\" class=\"tabcontent\">\r\n");
      out.write("        <select id=\"PribadiModa\" name=\"kd_transport_pribadi\">\r\n");
      out.write("          <option value=\"Sepeda\">Sepeda</option>\r\n");
      out.write("          <option value=\"Motor\">Motor</option>\r\n");
      out.write("          <option value=\"Mobil\">Mobil</option>\r\n");
      out.write("        </select>      \r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!--____________________________Tombol Submit or cancel____________________________--> \r\n");
      out.write("      <div class=\"col-12 enter\">\r\n");
      out.write("        <br>\r\n");
      out.write("        <input type=\"submit\" value=\"Cancel\" style=\"background-color: red;\">\r\n");
      out.write("        <input type=\"submit\" value=\"Create Schedule\">\r\n");
      out.write("      </div><br> \r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</article>\r\n");
      out.write("\r\n");
      out.write("<footer>Copyright &copy; Kelompok B1 | Front-End [Made With Love] </footer>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
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
