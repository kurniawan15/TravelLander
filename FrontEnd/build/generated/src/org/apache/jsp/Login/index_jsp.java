package org.apache.jsp.Login;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>LOGIN</title>\n");
      out.write("            <link rel=\"stylesheet\" href=\"css/index.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"loginBox\">\n");
      out.write("        <h3> Silakan Log In di </h3>\n");
      out.write("      <form name=\"login\" action=\"ceklogin.jsp\">\n");
      out.write("        \t<div class=\"inputBox\">\n");
      out.write("            \t<input type=\"text\" name=\"user\" placeholder=\"UserName\">\n");
      out.write("                <span><i class=\"fa fa-user\" aria-hidden=\"true\"></i></span>\n");
      out.write("        \t</div>\n");
      out.write("          \n");
      out.write("        \t<div class=\"inputBox\">\n");
      out.write("            \t<input type=\"password\" name=\"pass\" placeholder=\"Password\">\n");
      out.write("                <span><i class=\"fa fa-user\" aria-hidden=\"true\"></i></span>\n");
      out.write("        \t</div>\n");
      out.write("            \t<input type=\"submit\" name=\"login\" value=\" Sign In\">\n");
      out.write("                <a href=\"registrasi.jsp\">Daftar Disini !!</a>\n");
      out.write("   \n");
      out.write("<!--                <a href=\"www.google.com\">Forget Password</a>-->\n");
      out.write("         \t</form>\n");
      out.write("                </div>    \n");
      out.write(" \n");
      out.write("        \n");
      out.write("<!--            <tr>\n");
      out.write("               <td colspan=\"2\">Tidak Memiliki Akun?! <a href=\"registrasi.jsp\">Daftar Disini</a></td>\n");
      out.write("            </tr>-->\n");
      out.write("            \n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("    </form>\n");
      out.write("        \n");
      out.write("\n");
      out.write("    </body>\n");
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
