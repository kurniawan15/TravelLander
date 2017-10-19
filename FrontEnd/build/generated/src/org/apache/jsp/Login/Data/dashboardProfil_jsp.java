package org.apache.jsp.Login.Data;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dashboardProfil_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<title></title>\n");
      out.write("</head>\n");
      out.write("\t<link href=\"css/bootstrap.css\" type=\"text/css\" rel=\"stylesheet\">\n");
      out.write("\t<link href=\"css/profil.css\" type=\"text/css\" rel=\"stylesheet\">\n");
      out.write("<body>\n");
      out.write("                 ");

            String nama = session.getAttribute("id_Admin").toString();
        //    out.println("Selamat Datang " + nama +"<br> Anda berhasil Login");
            
      out.write("\n");
      out.write("\t<div class=\"col-lg-12 col-sm-12 col-xs-12 col-md-12 wrapper container-fluid\">\n");
      out.write("\t\t<div class=\"col-lg-6 col-sm-6 col-xs-6 col-md-6 menubar\">\n");
      out.write("\t\t\t&nbsp;&nbsp;HalooSource\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"col-lg-6 col-sm-6 col-xs-6 col-md-6 menubarLog\">\n");
      out.write("\t\t\t<ul>\n");
      out.write("\t\t\t\t<li><span class=\"glyphicon glyphicon-user\"> ");
      out.print( nama );
      out.write(" </span>&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t<li>AGENDA&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"glyphicon glyphicon-list-alt\"></span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>\n");
      out.write("\t\t\t\t\t<li style=\"background-color: red; color: white;\">MY PROFIL&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"glyphicon glyphicon-cog\"></span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>\n");
      out.write("\t\t\t\t\t<li><a href=\"../logout.jsp\" style=\"color: black;\">LOGOUT</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"glyphicon glyphicon-off\"></span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 container-fluid dashboard\">\n");
      out.write("\t\t<div class=\"col-lg-2 col-md-12 col-sm-12 col-xs-12 contentkiri visible-lg\">\n");
      out.write("\t\t\t<div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 kiri\">\n");
      out.write("\t\t\t\t&nbsp;&nbsp;Dashboard\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-lg-12 co l-md-12 col-sm-12 col-xs-12 kiri\">\n");
      out.write("\t\t\t\t&nbsp;&nbsp;<a href=\"dashboardCreateSchedule.jsp\" style=\"color: white;\">Create Schedule</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 kiri\">\n");
      out.write("\t\t\t\t&nbsp;&nbsp;Finished Task\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 kiri\">\n");
      out.write("\t\t\t\t&nbsp;&nbsp;Event list\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 contentkiribawah visible-lg\">\n");
      out.write("\t\t\t\t&nbsp;\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 contentkiri visible-sm visible-md\">\n");
      out.write("\t\t\t<div class=\"col-lg-12 col-md-3 col-sm-3 col-xs-3 kirismmd\">\n");
      out.write("\t\t\t\t&nbsp;&nbsp;Dashboard\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-lg-12 col-md-3 col-sm-3 col-xs-3 kirismmd\">\n");
      out.write("\t\t\t\t&nbsp;&nbsp;Create Schedule\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-lg-12 col-md-3 col-sm-3 col-xs-3 kirismmd\">\n");
      out.write("\t\t\t\t&nbsp;&nbsp;Finished Task\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-lg-12 col-md-3 col-sm-3 col-xs-3 kirismmd\">\n");
      out.write("\t\t\t\t&nbsp;&nbsp;Event list\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 contentkiri visible-xs\">\n");
      out.write("\t\t\t<div class=\"col-lg-12 col-md-3 col-sm-3 col-xs-3 kirixs\">\n");
      out.write("\t\t\t\t&nbsp;&nbsp;Dashboard\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-lg-12 col-md-3 col-sm-3 col-xs-3 kirixs\">\n");
      out.write("\t\t\t\t&nbsp;&nbsp;Create Schedule\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-lg-12 col-md-3 col-sm-3 col-xs-3 kirixs\">\n");
      out.write("\t\t\t\t&nbsp;&nbsp;Finished Task\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-lg-12 col-md-3 col-sm-3 col-xs-3 kirixs\">\n");
      out.write("\t\t\t\t&nbsp;&nbsp;Event list\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<div class=\"col-lg-10 col-md-12 col-sm-12 col-xs-12 contentkanan\">\n");
      out.write("\t\t\t<div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 HeaderJudul\">\n");
      out.write("\t\t\t\t<b>My Profil</b>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 isiprofil\">\n");
      out.write("\t\t\t\t<div class=\"col-lg-3 col-md-3 col-sm-12 col-xs-12 fotoprofil\">\n");
      out.write("\t\t\t\t\t<center><span class=\"glyphicon glyphicon-user\" style=\"font-size: 180px;\"></center>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-lg-6 col-md-6 col-sm-6 col-xs-6 keteranganprofil\">\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 nama\">\n");
      out.write("\t\t\t\t\t\t<div class=\"col-lg-4 col-md-4 col-sm-4 col-xs-10 textnama\">\n");
      out.write("\t\t\t\t\t\t\tNama Lengkap\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-lg-2 col-md-2 col-sm-2 col-xs-2 titikdua\">\n");
      out.write("\t\t\t\t\t\t\t:\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-lg-6 col-md-6 col-sm-6 col-xs-12 namalengkapuser\">\n");
      out.write("\t\t\t\t\t\t\tFULL_NAME_USER_1\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 usernama\">\n");
      out.write("\t\t\t\t\t\t<div class=\"col-lg-4 col-md-4 col-sm-4 col-xs-10 textusernama\">\n");
      out.write("\t\t\t\t\t\t\tUsername\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-lg-2 col-md-2 col-sm-2 col-xs-2 titikdua\">\n");
      out.write("\t\t\t\t\t\t\t:\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-lg-6 col-md-6 col-sm-6 col-xs-12 namauser\">\n");
      out.write("\t\t\t\t\t\t\t");
      out.print( nama );
      out.write("\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 birthday\">\n");
      out.write("\t\t\t\t\t\t<div class=\"col-lg-4 col-md-4 col-sm-4 col-xs-10 textbirthday\">\n");
      out.write("\t\t\t\t\t\t\tBirthday\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-lg-2 col-md-2 col-sm-2 col-xs-2 titikdua\">\n");
      out.write("\t\t\t\t\t\t\t:\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-lg-6 col-md-6 col-sm-6 col-xs-12 birthdayuser\">\n");
      out.write("\t\t\t\t\t\t\tBIRTHDAY_USER_1\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 email\">\n");
      out.write("\t\t\t\t\t\t<div class=\"col-lg-4 col-md-4 col-sm-4 col-xs-10 textemail\">\n");
      out.write("\t\t\t\t\t\t\tE-mail\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-lg-2 col-md-2 col-sm-2 col-xs-2 titikdua\">\n");
      out.write("\t\t\t\t\t\t\t:\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-lg-6 col-md-6 col-sm-6 col-xs-12 emailuser\">\n");
      out.write("\t\t\t\t\t\t\tEMAIL_ADDRESS_USER_1\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-lg-3 col-md-3 col-sm-12 col-xs-12 editprofil\">\n");
      out.write("\t\t\t\t\t<input type=\"submit\" style=\"width: 100px; height: 40px;\" value=\"EDIT PROFIL\"/>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
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
