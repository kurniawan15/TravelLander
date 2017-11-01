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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<title></title>\r\n");
      out.write("</head>\r\n");
      out.write("\t<link href=\"css/bootstrap.css\" type=\"text/css\" rel=\"stylesheet\">\r\n");
      out.write("\t<link href=\"css/profil.css\" type=\"text/css\" rel=\"stylesheet\">\r\n");
      out.write("<body>\r\n");
      out.write("                 ");

            String nama = session.getAttribute("id_Admin").toString();
        //    out.println("Selamat Datang " + nama +"<br> Anda berhasil Login");
            
      out.write("\r\n");
      out.write("\t<div class=\"col-lg-12 col-sm-12 col-xs-12 col-md-12 wrapper container-fluid\">\r\n");
      out.write("\t\t<div class=\"col-lg-6 col-sm-6 col-xs-6 col-md-6 menubar\">\r\n");
      out.write("\t\t\t&nbsp;&nbsp;HalooSource\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"col-lg-6 col-sm-6 col-xs-6 col-md-6 menubarLog\">\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li><span class=\"glyphicon glyphicon-user\"> ");
      out.print( nama );
      out.write(" </span>&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li>AGENDA&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"glyphicon glyphicon-list-alt\"></span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>\r\n");
      out.write("\t\t\t\t\t<li style=\"background-color: red; color: white;\">MY PROFIL&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"glyphicon glyphicon-cog\"></span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"../logout.jsp\" style=\"color: black;\">LOGOUT</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"glyphicon glyphicon-off\"></span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 container-fluid dashboard\">\r\n");
      out.write("\t\t<div class=\"col-lg-2 col-md-12 col-sm-12 col-xs-12 contentkiri visible-lg\">\r\n");
      out.write("\t\t\t<div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 kiri\">\r\n");
      out.write("\t\t\t\t&nbsp;&nbsp;Dashboard\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-lg-12 co l-md-12 col-sm-12 col-xs-12 kiri\">\r\n");
      out.write("\t\t\t\t&nbsp;&nbsp;<a href=\"dashboardCreateSchedule.jsp\" style=\"color: white;\">Create Schedule</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 kiri\">\r\n");
      out.write("\t\t\t\t&nbsp;&nbsp;Finished Task\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 kiri\">\r\n");
      out.write("\t\t\t\t&nbsp;&nbsp;Event list\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 contentkiribawah visible-lg\">\r\n");
      out.write("\t\t\t\t&nbsp;\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 contentkiri visible-sm visible-md\">\r\n");
      out.write("\t\t\t<div class=\"col-lg-12 col-md-3 col-sm-3 col-xs-3 kirismmd\">\r\n");
      out.write("\t\t\t\t&nbsp;&nbsp;Dashboard\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-lg-12 col-md-3 col-sm-3 col-xs-3 kirismmd\">\r\n");
      out.write("\t\t\t\t&nbsp;&nbsp;Create Schedule\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-lg-12 col-md-3 col-sm-3 col-xs-3 kirismmd\">\r\n");
      out.write("\t\t\t\t&nbsp;&nbsp;Finished Task\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-lg-12 col-md-3 col-sm-3 col-xs-3 kirismmd\">\r\n");
      out.write("\t\t\t\t&nbsp;&nbsp;Event list\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 contentkiri visible-xs\">\r\n");
      out.write("\t\t\t<div class=\"col-lg-12 col-md-3 col-sm-3 col-xs-3 kirixs\">\r\n");
      out.write("\t\t\t\t&nbsp;&nbsp;Dashboard\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-lg-12 col-md-3 col-sm-3 col-xs-3 kirixs\">\r\n");
      out.write("\t\t\t\t&nbsp;&nbsp;Create Schedule\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-lg-12 col-md-3 col-sm-3 col-xs-3 kirixs\">\r\n");
      out.write("\t\t\t\t&nbsp;&nbsp;Finished Task\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-lg-12 col-md-3 col-sm-3 col-xs-3 kirixs\">\r\n");
      out.write("\t\t\t\t&nbsp;&nbsp;Event list\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"col-lg-10 col-md-12 col-sm-12 col-xs-12 contentkanan\">\r\n");
      out.write("\t\t\t<div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 HeaderJudul\">\r\n");
      out.write("\t\t\t\t<b>My Profil</b>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 isiprofil\">\r\n");
      out.write("\t\t\t\t<div class=\"col-lg-3 col-md-3 col-sm-12 col-xs-12 fotoprofil\">\r\n");
      out.write("\t\t\t\t\t<center><span class=\"glyphicon glyphicon-user\" style=\"font-size: 180px;\"></center>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-lg-6 col-md-6 col-sm-6 col-xs-6 keteranganprofil\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 nama\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-lg-4 col-md-4 col-sm-4 col-xs-10 textnama\">\r\n");
      out.write("\t\t\t\t\t\t\tNama Lengkap\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-lg-2 col-md-2 col-sm-2 col-xs-2 titikdua\">\r\n");
      out.write("\t\t\t\t\t\t\t:\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-lg-6 col-md-6 col-sm-6 col-xs-12 namalengkapuser\">\r\n");
      out.write("\t\t\t\t\t\t\tFULL_NAME_USER_1\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 usernama\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-lg-4 col-md-4 col-sm-4 col-xs-10 textusernama\">\r\n");
      out.write("\t\t\t\t\t\t\tUsername\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-lg-2 col-md-2 col-sm-2 col-xs-2 titikdua\">\r\n");
      out.write("\t\t\t\t\t\t\t:\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-lg-6 col-md-6 col-sm-6 col-xs-12 namauser\">\r\n");
      out.write("\t\t\t\t\t\t\t");
      out.print( nama );
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 birthday\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-lg-4 col-md-4 col-sm-4 col-xs-10 textbirthday\">\r\n");
      out.write("\t\t\t\t\t\t\tBirthday\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-lg-2 col-md-2 col-sm-2 col-xs-2 titikdua\">\r\n");
      out.write("\t\t\t\t\t\t\t:\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-lg-6 col-md-6 col-sm-6 col-xs-12 birthdayuser\">\r\n");
      out.write("\t\t\t\t\t\t\tBIRTHDAY_USER_1\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 email\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-lg-4 col-md-4 col-sm-4 col-xs-10 textemail\">\r\n");
      out.write("\t\t\t\t\t\t\tE-mail\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-lg-2 col-md-2 col-sm-2 col-xs-2 titikdua\">\r\n");
      out.write("\t\t\t\t\t\t\t:\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-lg-6 col-md-6 col-sm-6 col-xs-12 emailuser\">\r\n");
      out.write("\t\t\t\t\t\t\tEMAIL_ADDRESS_USER_1\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-lg-3 col-md-3 col-sm-12 col-xs-12 editprofil\">\r\n");
      out.write("\t\t\t\t\t<input type=\"submit\" style=\"width: 100px; height: 40px;\" value=\"EDIT PROFIL\"/>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
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
