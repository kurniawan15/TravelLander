package org.apache.jsp.Login.Data;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Traveller;
import DAO.DAOTraveller;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title></title>\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/grid.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style2.css\">\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 fixed-header\">\r\n");
      out.write("            <div class=\"col-lg-3 col-md-12 col-sm-12 col-xs-12 kiri\">\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li class=\"pilih\"><i style=\"font-size: 14px;\" class=\"material-icons\">home</i>&nbsp;&nbsp;&nbsp;Home</li>\r\n");
      out.write("                    <a href=\"addEvent.jsp\" style=\"text-decoration: none; color: white;\"><li class=\"none\"><i style=\"font-size: 14px;\" class=\"material-icons\">add</i>&nbsp;&nbsp;&nbsp;Add Event</li></a>\r\n");
      out.write("                    <a href=\"mylist.jsp\" style=\"text-decoration: none; color: white;\"><li class=\"none\"><i style=\"font-size: 14px;\" class=\"material-icons\">toc</i>&nbsp;&nbsp;&nbsp;My Event</li></a>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-lg-6 col-md-12 col-sm-12 col-xs-12 kiri\">\r\n");
      out.write("                <center><img class=\"img-responsive logo\" src=\"img/logo1.png\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-lg-1 col-md-12 col-sm-12 col-xs-12 kanan\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-lg-2 col-md-12 col-sm-12 col-xs-12 dropdown\">\r\n");
      out.write("                        <center><button onclick=\"myFunction()\" class=\"dropbtn\">");
out.println("Hi, ");
      out.print(session.getAttribute("USERNAME"));
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<i style=\"font-size: 14px;\" class=\"material-icons\">arrow_drop_down</i></button></center>\r\n");
      out.write("                        <div id=\"myDropdown\" class=\"dropdown-content\">\r\n");
      out.write("                            <center><a href=\"traveller?proses=logout-traveller\">Logout &nbsp;&nbsp;&nbsp;<i style=\"font-size: 14px;\" class=\"material-icons\">launch</i></a></center>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            ");

                String username = (String) session.getAttribute("USERNAME");

                if (username == null) {
                    response.sendRedirect("../../index.jsp");
                }
            
      out.write("\r\n");
      out.write("            <div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 homepage\">\r\n");
      out.write("\r\n");
      out.write("                <img src=\"img/avatar.png\" alt=\"Avatar\" style=\"width:20%\">\r\n");
      out.write("                <div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 home\">\r\n");
      out.write("                    <article class=\"article\">\r\n");
      out.write("                        <div class=\"contentlist\">\r\n");
      out.write("                            <div id=\"main\">\r\n");
      out.write("                                <h1 class=\"welcome\">WELCOME ");
out.println("");
      out.print(session.getAttribute("USERNAME"));
      out.write(", HAVE NICE DAY</h1>\r\n");
      out.write("                                <br><br>\r\n");
      out.write("                                <h1 class=\"judul\">Your Event Today</h1>\r\n");
      out.write("                                <div class=\"col-lg-12 info\">\r\n");
      out.write("                                    <table class=\"table\">\r\n");
      out.write("                                        <tr>\r\n");
      out.write("                                            <th>NO</th>\r\n");
      out.write("                                            <th>Event Name</th>\r\n");
      out.write("                                            <th>Event Location</th>\r\n");
      out.write("                                            <th>Date & Time</th>\r\n");
      out.write("                                            <th>&nbsp;&nbsp;Edit&nbsp;&nbsp;</th>\r\n");
      out.write("                                            <th>Delete</th>\r\n");
      out.write("                                            <th>View</th>\r\n");
      out.write("                                        </tr>\r\n");
      out.write("                                        <tr>\r\n");
      out.write("                                            <!--____________________________script fungsi option kendaraan umum/pribadi____________________________-->   \r\n");
      out.write("                                            <td style=\"font-size: 12px; line-height: 20px;\">1</td>\r\n");
      out.write("                                            <td style=\"font-size: 12px; line-height: 20px;\">Pengawasan dan Pelatihan</td>\r\n");
      out.write("                                            <td style=\"font-size: 12px; line-height: 20px;\">SMAN 20 BANDUNG</td>\r\n");
      out.write("                                            <td style=\"font-size: 12px; line-height: 20px;\">21-09-2017, 17.00</td>\r\n");
      out.write("                                            <td style=\"font-size: 12px; line-height: 35px;\"><a href=\"edit.html\"><i style=\"font-size: 20px;\" class=\"material-icons\">mode_edit</i></a></td>\r\n");
      out.write("                                            <td style=\"font-size: 12px; line-height: 35px;\"><a href=\"#\" class=\"delete\" data-confirm=\"Are you sure to delete this Event?\"><i style=\"font-size: 20px;\" class=\"material-icons\">delete</i></a></td>\r\n");
      out.write("                                            <td style=\"font-size: 12px; line-height: 20px;\"><button class=\"tablinks\" onclick=\"openCity(event, 'pageedit')\" id=\"defaultOpen\"><i style=\"font-size: 20px;\" class=\"material-icons\">subject</i></button></td>\r\n");
      out.write("                                        </tr>\r\n");
      out.write("                                        <script type=\"text/javascript\">\r\n");
      out.write("                                            function openCity(evt, editEvent) {\r\n");
      out.write("                                                var i, tabcontent, tablinks; //deklarasi variabel\r\n");
      out.write("                                                //mengambil element yang ada di class tabcontent dan menyembunyikan class \r\n");
      out.write("                                                tabcontent = document.getElementsByClassName(\"tabcontent\");\r\n");
      out.write("                                                for (i = 0; i < tabcontent.length; i++) {\r\n");
      out.write("                                                    tabcontent[i].style.display = \"none\";\r\n");
      out.write("                                                }\r\n");
      out.write("                                                //mengambil element yang ada di class tablinks dan menghapus yg aktif di display\r\n");
      out.write("                                                tablinks = document.getElementsByClassName(\"tablinks\");\r\n");
      out.write("                                                for (i = 0; i < tablinks.length; i++) {\r\n");
      out.write("                                                    tablinks[i].className = tablinks[i].className.replace(\" active\", \"\");\r\n");
      out.write("                                                }\r\n");
      out.write("                                                //menampilkan class yang aktif kelayar dengan posisi block/dibawah content tsb\r\n");
      out.write("                                                document.getElementById(editEvent).style.display = \"block\";\r\n");
      out.write("                                                evt.currentTarget.className += \" active\";\r\n");
      out.write("                                            }\r\n");
      out.write("\r\n");
      out.write("                                            function myFunction() {\r\n");
      out.write("                                                document.getElementById(\"myDropdown\").classList.toggle(\"show\");\r\n");
      out.write("                                            }\r\n");
      out.write("\r\n");
      out.write("                                            // Close the dropdown if the user clicks outside of it\r\n");
      out.write("                                            window.onclick = function (event) {\r\n");
      out.write("                                                if (!event.target.matches('.dropbtn')) {\r\n");
      out.write("\r\n");
      out.write("                                                    var dropdowns = document.getElementsByClassName(\"dropdown-content\");\r\n");
      out.write("                                                    var i;\r\n");
      out.write("                                                    for (i = 0; i < dropdowns.length; i++) {\r\n");
      out.write("                                                        var openDropdown = dropdowns[i];\r\n");
      out.write("                                                        if (openDropdown.classList.contains('show')) {\r\n");
      out.write("                                                            openDropdown.classList.remove('show');\r\n");
      out.write("                                                        }\r\n");
      out.write("                                                    }\r\n");
      out.write("                                                }\r\n");
      out.write("                                            }\r\n");
      out.write("                                            var deleteLinks = document.querySelectorAll('.delete');\r\n");
      out.write("\r\n");
      out.write("                                            for (var i = 0; i < deleteLinks.length; i++) {\r\n");
      out.write("                                                deleteLinks[i].addEventListener('click', function (event) {\r\n");
      out.write("                                                    event.preventDefault();\r\n");
      out.write("\r\n");
      out.write("                                                    var choice = confirm(this.getAttribute('data-confirm'));\r\n");
      out.write("\r\n");
      out.write("                                                    if (choice) {\r\n");
      out.write("                                                        window.location.href = this.getAttribute('href');\r\n");
      out.write("                                                    }\r\n");
      out.write("                                                });\r\n");
      out.write("                                            }\r\n");
      out.write("                                        </script>\r\n");
      out.write("                                    </table>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <!--____________________________Tombol Create Event____________________________--> \r\n");
      out.write("                                <div class=\"col-12 enter\">\r\n");
      out.write("                                    <br><center>\r\n");
      out.write("                                        <input type=\"submit\" value=\"Create New Event\" onclick=\"window.location.href = 'addEvent.jsp'\" style=\"background-color: #0062b3; width: 200px; height: 40px; margin-bottom: 20px;\">\r\n");
      out.write("                                        <br></center>\r\n");
      out.write("                                    <br>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </article>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 fixed-footer\">&copy; Kelompok B1 | Front End Team</div>\r\n");
      out.write("    </body>\r\n");
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
