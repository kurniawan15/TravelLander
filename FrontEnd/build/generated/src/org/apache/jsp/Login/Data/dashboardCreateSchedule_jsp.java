package org.apache.jsp.Login.Data;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dashboardCreateSchedule_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t<title></title>\r\n");
      out.write("</head>\r\n");
      out.write("\t<link href=\"css/bootstrap.css\" type=\"text/css\" rel=\"stylesheet\">\r\n");
      out.write("\t<link href=\"css/dashboard.css\" type=\"text/css\" rel=\"stylesheet\">\r\n");
      out.write("<body>\r\n");
      out.write("                     ");

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
      out.write("\t\t\t\t\t<li><a href=\"dashboardProfil.jsp\" style=\"color: black;\">MY PROFIL</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"glyphicon glyphicon-cog\"></span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>\r\n");
      out.write("                                        <li><a href=\"../logout.jsp\" style=\"color: black;\" >LOGOUT</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"glyphicon glyphicon-off\"></span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 dashboard container-fluid\">\r\n");
      out.write("\t\t<div class=\"col-lg-2 col-md-12 col-sm-12 col-xs-12 contentkiri visible-lg\">\r\n");
      out.write("\t\t\t<div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 kiri\">\r\n");
      out.write("\t\t\t\t&nbsp;&nbsp;Dashboard\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-lg-12 co l-md-12 col-sm-12 col-xs-12 kiripilih\">\r\n");
      out.write("\t\t\t\t&nbsp;&nbsp;Create Schedule\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 kiri\">\r\n");
      out.write("\t\t\t\t&nbsp;&nbsp;Finished Task\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 kiri\">\r\n");
      out.write("\t\t\t\t&nbsp;&nbsp;Event List\r\n");
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
      out.write("\t\t\t<div class=\"col-lg-12 col-md-3 col-sm-3 col-xs-3 kirismmdpilih\">\r\n");
      out.write("\t\t\t\t&nbsp;&nbsp;Create Schedule\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-lg-12 col-md-3 col-sm-3 col-xs-3 kirismmd\">\r\n");
      out.write("\t\t\t\t&nbsp;&nbsp;Finished Task\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-lg-12 col-md-3 col-sm-3 col-xs-3 kirismmd\">\r\n");
      out.write("\t\t\t\t&nbsp;&nbsp;Event List\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 contentkiri visible-xs\">\r\n");
      out.write("\t\t\t<div class=\"col-lg-12 col-md-3 col-sm-3 col-xs-3 kirixs\">\r\n");
      out.write("\t\t\t\t&nbsp;&nbsp;Dashboard\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-lg-12 col-md-3 col-sm-3 col-xs-3 kirixspilih\">\r\n");
      out.write("\t\t\t\t&nbsp;&nbsp;Create Schedule\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-lg-12 col-md-3 col-sm-3 col-xs-3 kirixs\">\r\n");
      out.write("\t\t\t\t&nbsp;&nbsp;Finished Task\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-lg-12 col-md-3 col-sm-3 col-xs-3 kirixs\">\r\n");
      out.write("\t\t\t\t&nbsp;&nbsp;Event List\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"col-lg-10 col-md-12 col-sm-12 col-xs-12 contentkanan\">\r\n");
      out.write("\t\t\t<div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 HeaderJudul\">\r\n");
      out.write("\t\t\t\t<b>Create Schedule</b>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 HeaderJudul2\">\r\n");
      out.write("\t\t\t\t<b>Please Input Created In here</b>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 InputNama\">\r\n");
      out.write("\t\t\t\t<div class=\"col-lg-3 col-md-6 col-sm-12 col-xs-12 textNama\">\r\n");
      out.write("\t\t\t\t\tNama Acara\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-lg-9 col-md-6 col-sm-12 col-xs-12 formNama\">\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"nama_agenda\" placeholder=\"Untitled event\" size=\"26\" maxlength=\"40\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 InputWaktu\">\r\n");
      out.write("\t\t\t\t<div class=\"col-lg-3 col-md-6 col-sm-12 col-xs-12 textWaktu\">\r\n");
      out.write("\t\t\t\t\tInput Waktu\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-lg-9 col-md-6 col-sm-12 col-xs-12 formWaktu\">\r\n");
      out.write("\t\t\t\t\t<input type=\"datetime-local\" style=\"width: 230px;\" size=\"40\" name=\"waktu_mulai\" placeholder=\"start time\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 HeaderJudul3\">\r\n");
      out.write("\t\t\t\tEvent Detail\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 startPoint\">\r\n");
      out.write("\t\t\t\t<div class=\"col-lg-3 col-md-6 col-sm-12 col-xs-12 textStart\">\r\n");
      out.write("\t\t\t\t\tStarting Point : Location\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-lg-9 col-md-6 col-sm-12 col-xs-12 formStart\">\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" id=\"txtautocomplete\" size=\"26\" maxlength=\"40\" placeholder=\"Location\"/>\r\n");
      out.write("                    <label id=\"lblresult\"></label>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 endPoint\">\r\n");
      out.write("\t\t\t\t<div class=\"col-lg-3 col-sm-6 col-xs-12 col-xs-12 textEnd\">\r\n");
      out.write("\t\t\t\t\tEnd Point\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-lg-9 col-md-6 col-sm-12 col-xs-12 formEnd\">\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"long_rumah\" size=\"26\" maxlength=\"40\" placeholder=\"Posisi Akhir\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 Destination\">\r\n");
      out.write("\t\t\t\t<div class=\"col-lg-3 col-md-6 col-sm-12 col-xs-12 textDest\">\r\n");
      out.write("\t\t\t\t\tDestination\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-lg-9 col-md-6 col-sm-12 col-xs-12 formDest\">\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"destination\" size=\"26\" maxlength=\"40\" placeholder=\"Destinasi\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 HeaderJudul4\">\r\n");
      out.write("\t\t\t\tTransportation\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 pilihanTransport\">\r\n");
      out.write("\t\t\t\t<div class=\"wrap\">\r\n");
      out.write("                    <form action=\"\" class=\"choise\">\r\n");
      out.write("                        <div class=\"radio\">\r\n");
      out.write("                            <input type=\"radio\" name=\"#1\" id=\"mobil\">\r\n");
      out.write("                                <label for=\"Mobil\" style=\"width: 100px;\">Mobil</label>\r\n");
      out.write("                                \r\n");
      out.write("                            <input type=\"radio\" name=\"#2\" id=\"motor\">\r\n");
      out.write("                                <label for=\"Motor\" style=\"width: 100px;\">Motor</label>\r\n");
      out.write("                                \r\n");
      out.write("                            <input type=\"radio\" name=\"#3\" id=\"angkot\">\r\n");
      out.write("                                <label for=\"Angkot\" style=\"width: 100px;\">Angkot</label>\r\n");
      out.write("                                \r\n");
      out.write("                            <input type=\"radio\" name=\"#4\" id=\"Bus\">\r\n");
      out.write("                                <label for=\"Bus\" style=\"width: 100px;\">Bus</label>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </form>\r\n");
      out.write("            \t</div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 submitAgenda\">\r\n");
      out.write("\t\t\t\t<input type=\"submit\" style=\"width: 100px; height: 40px;\" value=\"CREATE\"/>\r\n");
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
