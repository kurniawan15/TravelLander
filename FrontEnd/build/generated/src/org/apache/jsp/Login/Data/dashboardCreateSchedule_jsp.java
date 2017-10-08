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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<title></title>\n");
      out.write("</head>\n");
      out.write("\t<link href=\"css/bootstrap.css\" type=\"text/css\" rel=\"stylesheet\">\n");
      out.write("\t<link href=\"css/dashboard.css\" type=\"text/css\" rel=\"stylesheet\">\n");
      out.write("<body>\n");
      out.write("                     ");

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
      out.write("\t\t\t\t\t<li><a href=\"dashboardProfil.jsp\" style=\"color: black;\">MY PROFIL</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"glyphicon glyphicon-cog\"></span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>\n");
      out.write("                                        <li><a href=\"../logout.jsp\" style=\"color: black;\" >LOGOUT</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=\"glyphicon glyphicon-off\"></span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 dashboard container-fluid\">\n");
      out.write("\t\t<div class=\"col-lg-2 col-md-12 col-sm-12 col-xs-12 contentkiri visible-lg\">\n");
      out.write("\t\t\t<div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 kiri\">\n");
      out.write("\t\t\t\t&nbsp;&nbsp;Dashboard\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-lg-12 co l-md-12 col-sm-12 col-xs-12 kiripilih\">\n");
      out.write("\t\t\t\t&nbsp;&nbsp;Create Schedule\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 kiri\">\n");
      out.write("\t\t\t\t&nbsp;&nbsp;Finished Task\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 kiri\">\n");
      out.write("\t\t\t\t&nbsp;&nbsp;Event List\n");
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
      out.write("\t\t\t<div class=\"col-lg-12 col-md-3 col-sm-3 col-xs-3 kirismmdpilih\">\n");
      out.write("\t\t\t\t&nbsp;&nbsp;Create Schedule\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-lg-12 col-md-3 col-sm-3 col-xs-3 kirismmd\">\n");
      out.write("\t\t\t\t&nbsp;&nbsp;Finished Task\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-lg-12 col-md-3 col-sm-3 col-xs-3 kirismmd\">\n");
      out.write("\t\t\t\t&nbsp;&nbsp;Event List\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 contentkiri visible-xs\">\n");
      out.write("\t\t\t<div class=\"col-lg-12 col-md-3 col-sm-3 col-xs-3 kirixs\">\n");
      out.write("\t\t\t\t&nbsp;&nbsp;Dashboard\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-lg-12 col-md-3 col-sm-3 col-xs-3 kirixspilih\">\n");
      out.write("\t\t\t\t&nbsp;&nbsp;Create Schedule\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-lg-12 col-md-3 col-sm-3 col-xs-3 kirixs\">\n");
      out.write("\t\t\t\t&nbsp;&nbsp;Finished Task\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-lg-12 col-md-3 col-sm-3 col-xs-3 kirixs\">\n");
      out.write("\t\t\t\t&nbsp;&nbsp;Event List\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<div class=\"col-lg-10 col-md-12 col-sm-12 col-xs-12 contentkanan\">\n");
      out.write("\t\t\t<div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 HeaderJudul\">\n");
      out.write("\t\t\t\t<b>Create Schedule</b>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 HeaderJudul2\">\n");
      out.write("\t\t\t\t<b>Please Input Created In here</b>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 InputNama\">\n");
      out.write("\t\t\t\t<div class=\"col-lg-3 col-md-6 col-sm-12 col-xs-12 textNama\">\n");
      out.write("\t\t\t\t\tNama Acara\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-lg-9 col-md-6 col-sm-12 col-xs-12 formNama\">\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"nama_agenda\" placeholder=\"Untitled event\" size=\"26\" maxlength=\"40\">\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 InputWaktu\">\n");
      out.write("\t\t\t\t<div class=\"col-lg-3 col-md-6 col-sm-12 col-xs-12 textWaktu\">\n");
      out.write("\t\t\t\t\tInput Waktu\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-lg-9 col-md-6 col-sm-12 col-xs-12 formWaktu\">\n");
      out.write("\t\t\t\t\t<input type=\"datetime-local\" style=\"width: 230px;\" size=\"40\" name=\"waktu_mulai\" placeholder=\"start time\">\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 HeaderJudul3\">\n");
      out.write("\t\t\t\tEvent Detail\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 startPoint\">\n");
      out.write("\t\t\t\t<div class=\"col-lg-3 col-md-6 col-sm-12 col-xs-12 textStart\">\n");
      out.write("\t\t\t\t\tStarting Point : Location\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-lg-9 col-md-6 col-sm-12 col-xs-12 formStart\">\n");
      out.write("\t\t\t\t\t<input type=\"text\" id=\"txtautocomplete\" size=\"26\" maxlength=\"40\" placeholder=\"Location\"/>\n");
      out.write("                    <label id=\"lblresult\"></label>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 endPoint\">\n");
      out.write("\t\t\t\t<div class=\"col-lg-3 col-sm-6 col-xs-12 col-xs-12 textEnd\">\n");
      out.write("\t\t\t\t\tEnd Point\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-lg-9 col-md-6 col-sm-12 col-xs-12 formEnd\">\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"long_rumah\" size=\"26\" maxlength=\"40\" placeholder=\"Posisi Akhir\">\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 Destination\">\n");
      out.write("\t\t\t\t<div class=\"col-lg-3 col-md-6 col-sm-12 col-xs-12 textDest\">\n");
      out.write("\t\t\t\t\tDestination\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-lg-9 col-md-6 col-sm-12 col-xs-12 formDest\">\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"destination\" size=\"26\" maxlength=\"40\" placeholder=\"Destinasi\">\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 HeaderJudul4\">\n");
      out.write("\t\t\t\tTransportation\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 pilihanTransport\">\n");
      out.write("\t\t\t\t<div class=\"wrap\">\n");
      out.write("                    <form action=\"\" class=\"choise\">\n");
      out.write("                        <div class=\"radio\">\n");
      out.write("                            <input type=\"radio\" name=\"#1\" id=\"mobil\">\n");
      out.write("                                <label for=\"Mobil\" style=\"width: 100px;\">Mobil</label>\n");
      out.write("                                \n");
      out.write("                            <input type=\"radio\" name=\"#2\" id=\"motor\">\n");
      out.write("                                <label for=\"Motor\" style=\"width: 100px;\">Motor</label>\n");
      out.write("                                \n");
      out.write("                            <input type=\"radio\" name=\"#3\" id=\"angkot\">\n");
      out.write("                                <label for=\"Angkot\" style=\"width: 100px;\">Angkot</label>\n");
      out.write("                                \n");
      out.write("                            <input type=\"radio\" name=\"#4\" id=\"Bus\">\n");
      out.write("                                <label for=\"Bus\" style=\"width: 100px;\">Bus</label>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("            \t</div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 submitAgenda\">\n");
      out.write("\t\t\t\t<input type=\"submit\" style=\"width: 100px; height: 40px;\" value=\"CREATE\"/>\n");
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
