package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class patientlogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <!-- Required Meta Tags -->\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Page Title -->\r\n");
      out.write("    <title>Doctor Appointment</title>\r\n");
      out.write("\r\n");
      out.write("    <!-- Favicon -->\r\n");
      out.write("    <link rel=\"shortcut icon\" href=\"assets/images/logo/favicon.png\" type=\"image/x-icon\">\r\n");
      out.write("\r\n");
      out.write("    <!-- CSS Files -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/animate-3.7.0.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/font-awesome-4.7.0.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/bootstrap-4.1.3.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/owl-carousel.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/jquery.datetimepicker.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/linearicons.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/style.css\">\r\n");
      out.write("    <style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write(".style1 {color: #00b3ea}\r\n");
      out.write(".style20 {font-size: x-large;\r\n");
      out.write("\tcolor: #000000;\r\n");
      out.write("}\r\n");
      out.write(".style25 {color: #00b3ea; font-size: medium;}\r\n");
      out.write(".style26 {font-size: large; color: #00b3ea;}\r\n");
      out.write(".style27 {font-size: 18px}\r\n");
      out.write("-->\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <!-- Preloader Starts -->\r\n");
      out.write("    <div class=\"preloader\">\r\n");
      out.write("        <div class=\"spinner\"></div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- Preloader End -->\r\n");
      out.write("\r\n");
      out.write("    <!-- Header Area Starts -->\r\n");
      out.write("    <header class=\"header-area\">\r\n");
      out.write("        <div class=\"header-top\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                  <div class=\"col-lg-3\">\r\n");
      out.write("                        \r\n");
      out.write("                  </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div id=\"header\" id=\"home\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row align-items-center justify-content-between d-flex\">\r\n");
      out.write("                <div id=\"logo\"><a href=\"index.html\"><img src=\"assets/images/logo/logo.png\" alt=\"\" title=\"\" /></a></div>\r\n");
      out.write("                <nav id=\"nav-menu-container\">\r\n");
      out.write("                    <ul class=\"nav-menu\">\r\n");
      out.write("                        <li class=\"menu-active\"><a href=\"index.jsp\">Home</a></li>\r\n");
      out.write("                        <li><a href=\"departments.jsp\">departments</a></li>\r\n");
      out.write("                        <li><a href=\"doctors.jsp\">doctors</a></li>\r\n");
      out.write("                        <li class=\"menu-has-children\"><a href=\"\">Login</a>\r\n");
      out.write("                            <ul>\r\n");
      out.write("                                <li><a href=\"patientlogin.jsp\">Patient Login</a></li>\r\n");
      out.write("                                <li><a href=\"doctorlogin.jsp\">Doctor Login</a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("                       \t          \t\t\t\t          \r\n");
      out.write("                    </ul>\r\n");
      out.write("                </nav><!-- #nav-menu-container -->\t\t    \t\t\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </header>\r\n");
      out.write("    <!-- Header Area End -->\r\n");
      out.write("\r\n");
      out.write("    <!-- Banner Area Starts -->\r\n");
      out.write("    <section class=\"banner-area\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("              <div class=\"col-lg-5\">\r\n");
      out.write("                    <h4>Caring for better life</h4>\r\n");
      out.write("                    <h1>Leading the way in medical excellence</h1>\r\n");
      out.write("                    <p>Earth greater grass for good. Place for divide evening yielding them that. Creeping beginning over gathered brought.</p>\r\n");
      out.write("                   \r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </section>\r\n");
      out.write("    <!-- Banner Area End -->\r\n");
      out.write("\r\n");
      out.write("    <!-- Feature Area Starts -->\r\n");
      out.write("<section class=\"feature-area section-padding\"></section>\r\n");
      out.write("    <!-- Feature Area End -->\r\n");
      out.write("\r\n");
      out.write("    <!-- Welcome Area Starts -->\r\n");
      out.write("    <section class=\"welcome-area section-padding3\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("              <div class=\"col-lg-7\">\r\n");
      out.write("                  <div class=\"welcome-text mt-5 mt-lg-0\">\r\n");
      out.write("                        <h2>Patient Login </h2>\r\n");
      out.write("                        <form name=\"form1\" method=\"post\" action=\"PatientLogin\">\r\n");
      out.write("                          <table width=\"418\" height=\"340\" border=\"0\" align=\"center\">\r\n");
      out.write("                            <tr>\r\n");
      out.write("                              <td height=\"60\" colspan=\"2\"><div align=\"center\" class=\"main style20\">\r\n");
      out.write("                                  <div align=\"center\" class=\"style1\">Patients Login</div>\r\n");
      out.write("                              </div></td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                              <td width=\"186\" height=\"51\"><span class=\"style25\">User Name</span> </td>\r\n");
      out.write("                              <td width=\"222\"><label>\r\n");
      out.write("                                <input name=\"username\" type=\"text\" id=\"username\" />\r\n");
      out.write("                                </label>\r\n");
      out.write("                              </td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                              <td height=\"54\" class=\"style26\">Password</td>\r\n");
      out.write("                              <td><label>\r\n");
      out.write("                                <input name=\"password\" type=\"password\" id=\"password\" />\r\n");
      out.write("                                </label>\r\n");
      out.write("                              </td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                              <td colspan=\"2\"><div align=\"center\"><a href=\"admin.jsp\"> </a><a href=\"admin.jsp\"></a><a href=\"admin.jsp\"></a></div>\r\n");
      out.write("                                  <a href=\"admin.jsp\">\r\n");
      out.write("                                  <label></label>\r\n");
      out.write("                                  </a>\r\n");
      out.write("                                  <div align=\"center\">\r\n");
      out.write("                                    <input type=\"submit\" name=\"Submit\" value=\"Submit\" />\r\n");
      out.write("                                  </div>\r\n");
      out.write("                                <p align=\"center\">&nbsp;</p>\r\n");
      out.write("                                <p align=\"center\"><a href=\"patientregister.jsp\" class=\"style27\">New User Registration </a></p></td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                          </table>\r\n");
      out.write("                                                </form>\r\n");
      out.write("                        <p>&nbsp;</p>\r\n");
      out.write("                        <p class=\"pt-3\">&nbsp;</p>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </section>\r\n");
      out.write("    <!-- Welcome Area End -->\r\n");
      out.write("\r\n");
      out.write("    <!-- Department Area Starts --><!-- Department Area Starts -->\r\n");
      out.write("\r\n");
      out.write("    <!-- Patient Area Starts --><!-- Patient Area Starts -->\r\n");
      out.write("\r\n");
      out.write("    <!-- Specialist Area Starts --><!-- Specialist Area Starts -->\r\n");
      out.write("\r\n");
      out.write("    <!-- Hotline Area Starts -->\r\n");
      out.write("    <!-- Hotline Area End -->\r\n");
      out.write("\r\n");
      out.write("    <!-- News Area Starts -->\r\n");
      out.write("<section class=\"news-area section-padding\"></section>\r\n");
      out.write("    <!-- News Area Starts -->\r\n");
      out.write("    \r\n");
      out.write("    <!-- Footer Area Starts -->\r\n");
      out.write("    <footer class=\"footer-area section-padding\">\r\n");
      out.write("        <div class=\"footer-widget\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("              <div class=\"row\"></div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("</footer>\r\n");
      out.write("    <!-- Footer Area End -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- Javascript -->\r\n");
      out.write("    <script src=\"assets/js/vendor/jquery-2.2.4.min.js\"></script>\r\n");
      out.write("\t<script src=\"assets/js/vendor/bootstrap-4.1.3.min.js\"></script>\r\n");
      out.write("    <script src=\"assets/js/vendor/wow.min.js\"></script>\r\n");
      out.write("    <script src=\"assets/js/vendor/owl-carousel.min.js\"></script>\r\n");
      out.write("    <script src=\"assets/js/vendor/jquery.datetimepicker.full.min.js\"></script>\r\n");
      out.write("    <script src=\"assets/js/vendor/jquery.nice-select.min.js\"></script>\r\n");
      out.write("    <script src=\"assets/js/vendor/superfish.min.js\"></script>\r\n");
      out.write("    <script src=\"assets/js/main.js\"></script>\r\n");
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
