package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class adminpage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>BHAROSA BANK</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <meta name=\"keywords\" content=\"Funding Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, \n");
      out.write("              Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design\" />\n");
      out.write("        <script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false);\n");
      out.write("            function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("        <!-- //custom-theme -->\n");
      out.write("\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("        <link href=\"css/style_1.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/mainStyles.css\" />\n");
      out.write("        <link rel='stylesheet' href='css/dscountdown.css' type='text/css' media='all' />\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/flexslider.css\" type=\"text/css\" media=\"screen\" property=\"\" />\n");
      out.write("        <!-- gallery -->\n");
      out.write("        <link href=\"css/lsb.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <!-- //gallery -->\n");
      out.write("        <!-- font-awesome-icons -->\n");
      out.write("        <link href=\"css/font-awesome.css\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" href=\"images/icons/favicon.ico\"/>\n");
      out.write("        <link href=\"//fonts.googleapis.com/css?family=Source+Sans+Pro:300,300i,400,400i,600,600i,700,900\" rel=\"stylesheet\">\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"header\">\n");
      out.write("\n");
      out.write("            <div class=\"w3layouts_header_right\">\n");
      out.write("                <div class=\"agileits-social top_content\">\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"https://www.facebook.com/\"><i class=\"fa fa-facebook\"></i></a></li>\n");
      out.write("                        <li><a href=\"https://twitter.com/\"><i class=\"fa fa-twitter\"></i></a></li>\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"w3layouts_header_left\">\n");
      out.write("                <ul>\n");
      out.write("                    <li><a><i class=\"fa fa-user\" aria-hidden=\"true\"></i> WELCOME ADMIN </a></li>\n");
      out.write("                    <li>\n");
      out.write("                        <!--<div class=\"login-form\">-->\n");
      out.write("\n");
      out.write("                        <h2></h2><a href=\"logout_servlet\"><span class=\"label label-success\" >Log Out</span></a></h2>\t\n");
      out.write("                        <!-- <form action=\"logout_servlet\" method=\"post\">\n");
      out.write("                             <a><input type=\"submit\" value=\"LOG OUT\"></a>\n");
      out.write("                         </form>-->\n");
      out.write("                        <!--</div>-->\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"clearfix\"> </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"header_mid\">\n");
      out.write("            <div class=\"w3layouts_header_mid\">\n");
      out.write("                <ul>\n");
      out.write("                    <li>\n");
      out.write("                        <div class=\"header_contact_details_agile\"><i class=\"fa fa-phone\" aria-hidden=\"true\"></i>\n");
      out.write("                            <div class=\"w3l_header_contact_details_agile\">\n");
      out.write("                                <div class=\"header-contact-detail-title\">Give us a Call</div> \n");
      out.write("                                <a class=\"w3l_header_contact_details_agile-info_inner\"> 9876543210 </a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <div class=\"header_contact_details_agile\"><i class=\"fa fa-clock-o\" aria-hidden=\"true\"></i>\n");
      out.write("                            <div class=\"w3l_header_contact_details_agile\">\n");
      out.write("                                <div class=\"header-contact-detail-title\">Opening Hours</div> \n");
      out.write("                                <a class=\"w3l_header_contact_details_agile-info_inner\">Mon - Sat: 7:00 - 18:00</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <div class=\"header_contact_details_agile\"><i class=\"fa fa-map-marker\" aria-hidden=\"true\"></i>\n");
      out.write("                            <div class=\"w3l_header_contact_details_agile\">\n");
      out.write("                                <div class=\"header-contact-detail-title\">137, V.I.P. Road </div> \n");
      out.write("                                <a class=\"w3l_header_contact_details_agile-info_inner\">Kolkata, West Bengal 700052 </a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"banner\">\n");
      out.write("            <nav class=\"navbar navbar-default\">\n");
      out.write("                <div class=\"navbar-header navbar-left\">\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\n");
      out.write("                        <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                    </button>\n");
      out.write("                    <h1><a class=\"navbar-brand\" href=#><span>B</span>HAROSA BANK</a></h1>\n");
      out.write("                </div>\n");
      out.write("                <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("                <div class=\"collapse navbar-collapse navbar-right\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("                    <nav class=\"link-effect-2\" id=\"link-effect-2\">\n");
      out.write("                        <ul class=\"nav navbar-nav\">\n");
      out.write("                            <li class=\"active\"><a href=#><abbr title=\"PLEASE LOG OUT FIRST\"><span data-hover=\"Home\">Home</span></abbr></a></li>\n");
      out.write("                            <li><a href=#><abbr title=\"PLEASE LOG OUT FIRST\"><span data-hover=\"About Us\">About Us</span></abbr></a></li>\n");
      out.write("                            <li><a href=#><abbr title=\"PLEASE LOG OUT FIRST\"><span data-hover=\"Mail Us\">Mail Us</span></abbr></a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </nav>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </nav>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Do every thing Here-->\n");
      out.write("        <div class=\"bg-agile\">\n");
      out.write("        <div class=\"login-form\">\t\n");
      out.write("                            <form action=\"admin_deposit\" method=\"post\">\n");
      out.write("                                <div class=\"left-w3-agile\">\n");
      out.write("                                <select class=\"form-control\" name=\"accno\">\n");
      out.write("                                    <option>Chose Account</option>\n");
      out.write("                                    ");

                                        try
                                        {
                                          Class.forName("oracle.jdbc.driver.OracleDriver");
                                          String url="jdbc:oracle:thin:@localhost:1521:XE";
                                          Connection con = DriverManager.getConnection(url, "ob_banking", "1234");
                                          String sql="select account from customer";
                                          PreparedStatement ps =con.prepareStatement(sql);
                                          ResultSet rs =ps.executeQuery();
                                          while(rs.next()){
                                    
      out.write("<option>");
out.print(rs.getString("account"));
      out.write("</option>");

                                          }
                                        }
                                        catch(Exception e){}
                                    
      out.write("\n");
      out.write("                                </select>\n");
      out.write("                                </div>\n");
      out.write("                                <input type=\"text\"  name=\"amount\" placeholder=\"Amount in INR\" required=\"\" />\n");
      out.write("                                <a><input type=\"submit\" value=\"DEPOSIT\"></a>\n");
      out.write("                            </form>\n");
      out.write("                                \n");
      out.write("\t\t\t</div>\n");
      out.write("            </div>\n");
      out.write("                                \n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- footer -->\n");
      out.write("        <div class=\"wthree_copy_right\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <p>© 2018 Bharosa Bank. All rights reserved</p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- //footer -->\n");
      out.write("\n");
      out.write("        <!-- js -->\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery-2.1.4.min.js\"></script>\n");
      out.write("        <!-- //js -->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script src=\"js/mainScript.js\"></script>\n");
      out.write("        <script src=\"js/rgbSlide.min.js\"></script>\n");
      out.write("        <!-- carousal -->\n");
      out.write("        <script src=\"js/slick.js\" type=\"text/javascript\" charset=\"utf-8\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            $(document).on('ready', function () {\n");
      out.write("                $(\".center\").slick({\n");
      out.write("                    dots: true,\n");
      out.write("                    infinite: true,\n");
      out.write("                    centerMode: true,\n");
      out.write("                    slidesToShow: 2,\n");
      out.write("                    slidesToScroll: 2,\n");
      out.write("                    responsive: [\n");
      out.write("                        {\n");
      out.write("                            breakpoint: 768,\n");
      out.write("                            settings: {\n");
      out.write("                                arrows: true,\n");
      out.write("                                centerMode: false,\n");
      out.write("                                slidesToShow: 2\n");
      out.write("                            }\n");
      out.write("                        },\n");
      out.write("                        {\n");
      out.write("                            breakpoint: 480,\n");
      out.write("                            settings: {\n");
      out.write("                                arrows: true,\n");
      out.write("                                centerMode: false,\n");
      out.write("                                centerPadding: '40px',\n");
      out.write("                                slidesToShow: 1\n");
      out.write("                            }\n");
      out.write("                        }\n");
      out.write("                    ]\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <!-- //carousal -->\n");
      out.write("        <!-- flexisel -->\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            $(window).load(function () {\n");
      out.write("                $(\"#flexiselDemo1\").flexisel({\n");
      out.write("                    visibleItems: 4,\n");
      out.write("                    animationSpeed: 1000,\n");
      out.write("                    autoPlay: true,\n");
      out.write("                    autoPlaySpeed: 3000,\n");
      out.write("                    pauseOnHover: true,\n");
      out.write("                    enableResponsiveBreakpoints: true,\n");
      out.write("                    responsiveBreakpoints: {\n");
      out.write("                        portrait: {\n");
      out.write("                            changePoint: 480,\n");
      out.write("                            visibleItems: 1\n");
      out.write("                        },\n");
      out.write("                        landscape: {\n");
      out.write("                            changePoint: 640,\n");
      out.write("                            visibleItems: 2\n");
      out.write("                        },\n");
      out.write("                        tablet: {\n");
      out.write("                            changePoint: 768,\n");
      out.write("                            visibleItems: 2\n");
      out.write("                        }\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery.flexisel.js\"></script>\n");
      out.write("        <!-- //flexisel -->\n");
      out.write("\n");
      out.write("        <!-- flexSlider -->\n");
      out.write("        <script defer src=\"js/jquery.flexslider.js\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("                    $(window).load(function () {\n");
      out.write("                        $('.flexslider').flexslider({\n");
      out.write("                            animation: \"slide\",\n");
      out.write("                            start: function (slider) {\n");
      out.write("                                $('body').removeClass('loading');\n");
      out.write("                            }\n");
      out.write("                        });\n");
      out.write("                    });\n");
      out.write("        </script>\n");
      out.write("        <!-- //flexSlider -->\n");
      out.write("\n");
      out.write("        <!-- start-smooth-scrolling -->\n");
      out.write("        <script type=\"text/javascript\" src=\"js/move-top.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/easing.js\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("                            jQuery(document).ready(function ($) {\n");
      out.write("                                $(\".scroll\").click(function (event) {\n");
      out.write("                                    event.preventDefault();\n");
      out.write("                                    $('html,body').animate({scrollTop: $(this.hash).offset().top}, 1000);\n");
      out.write("                                });\n");
      out.write("                            });\n");
      out.write("        </script>\n");
      out.write("        <!-- start-smooth-scrolling -->\n");
      out.write("        <!-- for bootstrap working -->\n");
      out.write("        <script src=\"js/bootstrap.js\"></script>\n");
      out.write("        <!-- //for bootstrap working -->\n");
      out.write("        <!-- here stars scrolling icon -->\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("                    $(document).ready(function () {\n");
      out.write("                        /*\n");
      out.write("                         var defaults = {\n");
      out.write("                         containerID: 'toTop', // fading element id\n");
      out.write("                         containerHoverID: 'toTopHover', // fading element hover id\n");
      out.write("                         scrollSpeed: 1200,\n");
      out.write("                         easingType: 'linear' \n");
      out.write("                         };\n");
      out.write("                         */\n");
      out.write("\n");
      out.write("                        $().UItoTop({easingType: 'easeOutQuart'});\n");
      out.write("\n");
      out.write("                    });\n");
      out.write("        </script>\n");
      out.write("        <!-- //here ends scrolling icon -->\n");
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
