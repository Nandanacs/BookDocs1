package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class departments_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>Departments</title>\r\n");
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
      out.write("                       \r\n");
      out.write("                  </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div id=\"header\" id=\"home\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row align-items-center justify-content-between d-flex\">\r\n");
      out.write("                <div id=\"logo\">\r\n");
      out.write("                    <a href=\"index.html\"><img src=\"assets/images/logo/logo.png\" alt=\"\" title=\"\" /></a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <nav id=\"nav-menu-container\">\r\n");
      out.write("                     <ul class=\"nav-menu\">\r\n");
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
      out.write("    <section class=\"banner-area other-page\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-lg-12\">\r\n");
      out.write("                    <h1>Departments</h1>\r\n");
      out.write("                    <a href=\"index.html\">Home</a> <span>|</span> <a href=\"departments.html\">Departments</a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </section>\r\n");
      out.write("    <!-- Banner Area End -->\r\n");
      out.write("\r\n");
      out.write("    <!-- Feature Area Starts -->\r\n");
      out.write("    <section class=\"feature-area section-padding\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-lg-3 col-md-6\">\r\n");
      out.write("                    <div class=\"single-feature text-center item-padding\">\r\n");
      out.write("                        <img src=\"assets/images/feature1.png\" alt=\"\">\r\n");
      out.write("                        <h3>advance technology</h3>\r\n");
      out.write("                        <p class=\"pt-3\">Creeping for female light years that lesser can't evening heaven isn't bearing tree appear</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-lg-3 col-md-6\">\r\n");
      out.write("                    <div class=\"single-feature text-center item-padding mt-4 mt-md-0\">\r\n");
      out.write("                        <img src=\"assets/images/feature2.png\" alt=\"\">\r\n");
      out.write("                        <h3>comfortable place</h3>\r\n");
      out.write("                        <p class=\"pt-3\">Creeping for female light years that lesser can't evening heaven isn't bearing tree appear</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-lg-3 col-md-6\">\r\n");
      out.write("                    <div class=\"single-feature text-center item-padding mt-4 mt-lg-0\">\r\n");
      out.write("                        <img src=\"assets/images/feature3.png\" alt=\"\">\r\n");
      out.write("                        <h3>quality equipment</h3>\r\n");
      out.write("                        <p class=\"pt-3\">Creeping for female light years that lesser can't evening heaven isn't bearing tree appear</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-lg-3 col-md-6\">\r\n");
      out.write("                    <div class=\"single-feature text-center item-padding mt-4 mt-lg-0\">\r\n");
      out.write("                        <img src=\"assets/images/feature4.png\" alt=\"\">\r\n");
      out.write("                        <h3>friendly staff</h3>\r\n");
      out.write("                        <p class=\"pt-3\">Creeping for female light years that lesser can't evening heaven isn't bearing tree appear</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </section>\r\n");
      out.write("    <!-- Feature Area End -->\r\n");
      out.write("\r\n");
      out.write("    <!-- Department Area Starts -->\r\n");
      out.write("    <section class=\"department-area section-padding4\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-lg-6 offset-lg-3\">\r\n");
      out.write("                    <div class=\"section-top text-center\">\r\n");
      out.write("                        <h2>Popular department</h2>\r\n");
      out.write("                        <p>Green above he cattle god saw day multiply under fill in the cattle fowl a all, living, tree word link available in the service for subdue fruit.</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-lg-12\">\r\n");
      out.write("                    <div class=\"department-slider owl-carousel\">\r\n");
      out.write("                        <div class=\"single-slide\">\r\n");
      out.write("                            <div class=\"slide-img\">\r\n");
      out.write("                                <img src=\"assets/images/department1.jpg\" alt=\"\" class=\"img-fluid\">\r\n");
      out.write("                                <div class=\"hover-state\">\r\n");
      out.write("                                    <a href=\"#\"><i class=\"fa fa-stethoscope\"></i></a>                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"single-department item-padding text-center\">\r\n");
      out.write("                                <h3>cardiac clinic</h3>\r\n");
      out.write("                                <p>Hath creeping subdue he fish gred face whose spirit that seasons today multiply female midst upon</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"single-slide\">\r\n");
      out.write("                            <div class=\"slide-img\">\r\n");
      out.write("                                <img src=\"assets/images/department2.jpg\" alt=\"\" class=\"img-fluid\">\r\n");
      out.write("                                <div class=\"hover-state\">\r\n");
      out.write("                                    <a href=\"departments.html\"><i class=\"fa fa-stethoscope\"></i></a>                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"single-department item-padding text-center\">\r\n");
      out.write("                                <h3>plastic surgery</h3>\r\n");
      out.write("                                <p>Hath creeping subdue he fish gred face whose spirit that seasons today multiply female midst upon</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"single-slide\">\r\n");
      out.write("                            <div class=\"slide-img\">\r\n");
      out.write("                                <img src=\"assets/images/department3.jpg\" alt=\"\" class=\"img-fluid\">\r\n");
      out.write("                                <div class=\"hover-state\">\r\n");
      out.write("                                    <a href=\"departments.html\"><i class=\"fa fa-stethoscope\"></i></a>                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"single-department item-padding text-center\">\r\n");
      out.write("                                <h3>dental clinic</h3>\r\n");
      out.write("                                <p>Hath creeping subdue he fish gred face whose spirit that seasons today multiply female midst upon</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"single-slide\">\r\n");
      out.write("                            <div class=\"slide-img\">\r\n");
      out.write("                                <img src=\"assets/images/department1.jpg\" alt=\"\" class=\"img-fluid\">\r\n");
      out.write("                                <div class=\"hover-state\">\r\n");
      out.write("                                    <a href=\"departments.html\"><i class=\"fa fa-stethoscope\"></i></a>                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"single-department item-padding text-center\">\r\n");
      out.write("                                <h3>cardiac clinic</h3>\r\n");
      out.write("                                <p>Hath creeping subdue he fish gred face whose spirit that seasons today multiply female midst upon</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </section>\r\n");
      out.write("    <!-- Department Area Starts -->\r\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("   \r\n");
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
      out.write("\r\n");
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