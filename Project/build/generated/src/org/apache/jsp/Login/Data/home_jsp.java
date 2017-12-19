package org.apache.jsp.Login.Data;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

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
      out.write("\t\t<div class=\"col-lg-1 col-md-12 col-sm-12 col-xs-12 kanan\">\n");
      out.write("\t\t\t<span class=\"glyphicon glyphicon-bell\"></span>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"col-lg-1 col-md-12 col-sm-12 col-xs-12 kanan2\">\n");
      out.write("\t\t\tHi, Fajar&nbsp;&nbsp;&nbsp;<span class=\"glyphicon glyphicon-user\"></span>\n");
      out.write("\t\t</div>\n");
      out.write("            <div class=\"col-lg-1 col-md-12 col-sm-12 col-xs-12 kanan2\">\n");
      out.write("                <a href=\"login.jsp\"></a>Logout&nbsp;&nbsp;&nbsp;<span class=\"glyphicon glyphicon-off\"></span>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 homepage\">\n");
      out.write("\t\t<div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 menubar\">\n");
      out.write("\t\t\t<ul>\n");
      out.write("\t\t\t\t<a href=\"home.jsp\"><li class=\"pilih\">Dashboard</li></a>\n");
      out.write("\t\t\t\t<a href=\"calendar.jsp\"><li class=\"none\">My Calendar</li></a>\n");
      out.write("\t\t\t\t<a href=\"addEvent.jsp\"><li class=\"none\">Add Event</li></a>\n");
      out.write("\t\t\t\t<a href=\"mylist.jsp\"><li class=\"none\">My Event</li></a>\n");
      out.write("\t\t\t\t<a href=\"finish.jsp\"><li class=\"none\">History</li></a>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<img src=\"img/avatar.png\" alt=\"Avatar\" style=\"width:20%\">\n");
      out.write("\t\t<div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 home\">\n");
      out.write("\t\t<article class=\"article\">\n");
      out.write("\t\t\t<div class=\"contentlist\">\n");
      out.write("\t\t\t\t<div id=\"main\">\n");
      out.write("\t\t\t\t\t<br><br>\n");
      out.write("\t\t\t\t\t<h1 class=\"judul\">Event Hari Ini</h1>\n");
      out.write("\t\t\t\t\t<table class=\"table\">\n");
      out.write("\t\t\t      \t<tr>\n");
      out.write("\t\t\t        \t<th>NO</th>\n");
      out.write("\t\t\t        \t<th>Event Name</th>\n");
      out.write("\t\t\t        \t<th>Event Location</th>\n");
      out.write("\t\t\t        \t<th>Date & Time</th>\n");
      out.write("\t\t\t        \t<th>&nbsp;&nbsp;Edit&nbsp;&nbsp;</th>\n");
      out.write("\t\t\t        \t<th>Delete</th>\n");
      out.write("\t\t\t        \t<th>View</th>\n");
      out.write("\t\t\t      \t</tr>\n");
      out.write("\t\t\t      \t<tr>\n");
      out.write("\t\t\t\t    \t<!--____________________________script fungsi option kendaraan umum/pribadi____________________________-->   \n");
      out.write("\t\t\t        \t<td style=\"font-size: 12px; line-height: 20px;\">1</td>\n");
      out.write("\t\t\t        \t<td style=\"font-size: 12px; line-height: 20px;\">Pengawasan dan Pelatihan</td>\n");
      out.write("\t\t\t        \t<td style=\"font-size: 12px; line-height: 20px;\">SMAN 20 BANDUNG</td>\n");
      out.write("\t\t\t        \t<td style=\"font-size: 12px; line-height: 20px;\">21-09-2017, 17.00</td>\n");
      out.write("\t\t\t        \t<td style=\"font-size: 12px; line-height: 35px;\"><a href=\"editEvent.html\"><span class=\"glyphicon glyphicon-edit\"></span></a></td>\n");
      out.write("\t\t\t        \t<td style=\"font-size: 12px; line-height: 35px;\"><span class=\"glyphicon glyphicon-trash\"></span></td>\n");
      out.write("\t\t\t        \t<td style=\"font-size: 12px; line-height: 20px;\"><button class=\"tablinks\" onclick=\"openCity(event, 'pageedit')\" id=\"defaultOpen\"><span class=\"glyphicon glyphicon glyphicon-list\"></span></button></td>\n");
      out.write("\t\t\t      \t</tr>\n");
      out.write("\t\t\t\t     \t<script type=\"text/javascript\">\n");
      out.write("\t\t\t\t        \tfunction openCity(evt, editEvent) {\n");
      out.write("\t\t\t\t        \tvar i, tabcontent, tablinks; //deklarasi variabel\n");
      out.write("\t\t\t\t        \t//mengambil element yang ada di class tabcontent dan menyembunyikan class \n");
      out.write("\t\t\t\t        \ttabcontent = document.getElementsByClassName(\"tabcontent\");\n");
      out.write("\t\t\t\t        \tfor (i = 0; i < tabcontent.length; i++) {\n");
      out.write("\t\t\t\t            \ttabcontent[i].style.display = \"none\";\n");
      out.write("\t\t\t\t        \t}\n");
      out.write("\t\t\t\t        \t//mengambil element yang ada di class tablinks dan menghapus yg aktif di display\n");
      out.write("\t\t\t\t        \ttablinks = document.getElementsByClassName(\"tablinks\");\n");
      out.write("\t\t\t\t        \tfor (i = 0; i < tablinks.length; i++) {\n");
      out.write("\t\t\t\t            \ttablinks[i].className = tablinks[i].className.replace(\" active\", \"\");\n");
      out.write("\t\t\t\t          \t}\n");
      out.write("\t\t\t\t          \t//menampilkan class yang aktif kelayar dengan posisi block/dibawah content tsb\n");
      out.write("\t\t\t\t          \tdocument.getElementById(editEvent).style.display = \"block\";\n");
      out.write("\t\t\t\t          \tevt.currentTarget.className += \" active\";\n");
      out.write("\t\t\t\t          \t}\n");
      out.write("\t\t\t\t    \t</script>\n");
      out.write("\t\t\t      \t</table>\n");
      out.write("\t\t\t      \t<!--____________________________Tombol Create Event____________________________--> \n");
      out.write("\t\t      \t\t<div class=\"col-12 enter\">\n");
      out.write("\t\t        \t\t<br>\n");
      out.write("\t\t        \t\t<input type=\"submit\" value=\"Create Event\" onclick=\"window.location.href='addEvent.jsp'\" style=\"background-color: green; width: 15%; float: left; margin-bottom: 20px;\">\n");
      out.write("\t\t        \t\t<br>\n");
      out.write("\t\t      \t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("  \t\t\t</div>\n");
      out.write("\t\t</article>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("<div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 fullfooter\">&copy; Kelompok B1 | Made With by FrontEnd in Kosan Uda</div>\n");
      out.write("</body>\n");
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
