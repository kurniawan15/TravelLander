package org.apache.jsp.TestAPI;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Route_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta name=\"viewport\" content=\"initial-scale=1.0, user-scalable=no\">\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <title>Directions service</title>\r\n");
      out.write("    <style>\r\n");
      out.write("      /* Always set the map height explicitly to define the size of the div\r\n");
      out.write("       * element that contains the map. */\r\n");
      out.write("      #map {\r\n");
      out.write("        height: 100%;\r\n");
      out.write("      }\r\n");
      out.write("      /* Optional: Makes the sample page fill the window. */\r\n");
      out.write("      html, body {\r\n");
      out.write("        height: 100%;\r\n");
      out.write("        margin: 0;\r\n");
      out.write("        padding: 0;\r\n");
      out.write("      }\r\n");
      out.write("      #floating-panel {\r\n");
      out.write("        position: absolute;\r\n");
      out.write("        top: 10px;\r\n");
      out.write("        left: 25%;\r\n");
      out.write("        z-index: 5;\r\n");
      out.write("        background-color: #fff;\r\n");
      out.write("        padding: 5px;\r\n");
      out.write("        border: 1px solid #999;\r\n");
      out.write("        text-align: center;\r\n");
      out.write("        font-family: 'Roboto','sans-serif';\r\n");
      out.write("        line-height: 30px;\r\n");
      out.write("        padding-left: 10px;\r\n");
      out.write("      }\r\n");
      out.write("    </style>\r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("    <div id=\"floating-panel\">\r\n");
      out.write("    <b>Start: </b>\r\n");
      out.write("    <select id=\"start\">\r\n");
      out.write("      <option value=\"chicago, il\">Chicago</option>\r\n");
      out.write("      <option value=\"st louis, mo\">St Louis</option>\r\n");
      out.write("      <option value=\"joplin, mo\">Joplin, MO</option>\r\n");
      out.write("      <option value=\"oklahoma city, ok\">Oklahoma City</option>\r\n");
      out.write("      <option value=\"amarillo, tx\">Amarillo</option>\r\n");
      out.write("      <option value=\"gallup, nm\">Gallup, NM</option>\r\n");
      out.write("      <option value=\"flagstaff, az\">Flagstaff, AZ</option>\r\n");
      out.write("      <option value=\"winona, az\">Winona</option>\r\n");
      out.write("      <option value=\"kingman, az\">Kingman</option>\r\n");
      out.write("      <option value=\"barstow, ca\">Barstow</option>\r\n");
      out.write("      <option value=\"san bernardino, ca\">San Bernardino</option>\r\n");
      out.write("      <option value=\"los angeles, ca\">Los Angeles</option>\r\n");
      out.write("    </select>\r\n");
      out.write("    <b>End: </b>\r\n");
      out.write("    <select id=\"end\">\r\n");
      out.write("      <option value=\"chicago, il\">Chicago</option>\r\n");
      out.write("      <option value=\"st louis, mo\">St Louis</option>\r\n");
      out.write("      <option value=\"joplin, mo\">Joplin, MO</option>\r\n");
      out.write("      <option value=\"oklahoma city, ok\">Oklahoma City</option>\r\n");
      out.write("      <option value=\"amarillo, tx\">Amarillo</option>\r\n");
      out.write("      <option value=\"gallup, nm\">Gallup, NM</option>\r\n");
      out.write("      <option value=\"flagstaff, az\">Flagstaff, AZ</option>\r\n");
      out.write("      <option value=\"winona, az\">Winona</option>\r\n");
      out.write("      <option value=\"kingman, az\">Kingman</option>\r\n");
      out.write("      <option value=\"barstow, ca\">Barstow</option>\r\n");
      out.write("      <option value=\"san bernardino, ca\">San Bernardino</option>\r\n");
      out.write("      <option value=\"los angeles, ca\">Los Angeles</option>\r\n");
      out.write("    </select>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div id=\"map\"></div>\r\n");
      out.write("    <script>\r\n");
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
      out.write("          travelMode: 'DRIVING'\r\n");
      out.write("        }, function(response, status) {\r\n");
      out.write("          if (status === 'OK') {\r\n");
      out.write("            directionsDisplay.setDirections(response);\r\n");
      out.write("          } else {\r\n");
      out.write("            window.alert('Directions request failed due to ' + status);\r\n");
      out.write("          }\r\n");
      out.write("        });\r\n");
      out.write("      }\r\n");
      out.write("    </script>\r\n");
      out.write("    <script async defer\r\n");
      out.write("    src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyBv4kFWkwB0XYeqOlfLxT0ZYsc4DRyNdag&callback=initMap\">\r\n");
      out.write("    </script>\r\n");
      out.write("  </body>\r\n");
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
