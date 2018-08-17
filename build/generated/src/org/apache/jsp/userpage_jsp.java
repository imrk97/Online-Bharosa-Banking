package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;
import javax.servlet.http.HttpSession;

public final class userpage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>ACCOUNT DETAILS</title>\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("        <meta name=\"keywords\" content=\"Funding Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, \r\n");
      out.write("              Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design\" />\r\n");
      out.write("        <script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false);\r\n");
      out.write("            function hideURLbar(){ window.scrollTo(0,1); } </script>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" href=\"images/icons/favicon.ico\"/>\r\n");
      out.write("        <!--===============================================================================================-->\t\r\n");
      out.write("\r\n");
      out.write("        <!-- //custom-theme -->\r\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("        <link href=\"css/style_1.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/mainStyles.css\" />\r\n");
      out.write("        <link rel='stylesheet' href='css/dscountdown.css' type='text/css' media='all' />\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/tablestyle.css\">\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/flexslider.css\" type=\"text/css\" media=\"screen\" property=\"\" />\r\n");
      out.write("        <!-- gallery -->\r\n");
      out.write("        <link href=\"css/lsb.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("        <!-- //gallery -->\r\n");
      out.write("        <!-- font-awesome-icons -->\r\n");
      out.write("        <link href=\"css/font-awesome.css\" rel=\"stylesheet\"> \r\n");
      out.write("        <link href=\"//fonts.googleapis.com/css?family=Source+Sans+Pro:300,300i,400,400i,600,600i,700,900\" rel=\"stylesheet\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"header\">\r\n");
      out.write("\r\n");
      out.write("            <div class=\"w3layouts_header_right\">\r\n");
      out.write("                <div class=\"agileits-social top_content\">\r\n");
      out.write("                    <ul>\r\n");
      out.write("                        <li><a href=\"https://www.facebook.com/\"><i class=\"fa fa-facebook\"></i></a></li>\r\n");
      out.write("                        <li><a href=\"https://twitter.com/\"><i class=\"fa fa-twitter\"></i></a></li>\r\n");
      out.write("\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"w3layouts_header_left\">\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li><a><i class=\"fa fa-user\" aria-hidden=\"true\"></i> WELCOME ");
out.print((String) session.getAttribute("usr"));
      out.write(" </a></li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <!--<div class=\"login-form\">-->\r\n");
      out.write("\r\n");
      out.write("                        <h2></h2><a href=\"logout_servlet\"><span class=\"label label-success\" >Log Out</span></a></h2>\t\r\n");
      out.write("                        <!-- <form action=\"logout_servlet\" method=\"post\">\r\n");
      out.write("                             <a><input type=\"submit\" value=\"LOG OUT\"></a>\r\n");
      out.write("                         </form>-->\r\n");
      out.write("                        <!--</div>-->\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"clearfix\"> </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"header_mid\">\r\n");
      out.write("            <div class=\"w3layouts_header_mid\">\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <div class=\"header_contact_details_agile\"><i class=\"fa fa-phone\" aria-hidden=\"true\"></i>\r\n");
      out.write("                            <div class=\"w3l_header_contact_details_agile\">\r\n");
      out.write("                                <div class=\"header-contact-detail-title\">Give us a Call</div> \r\n");
      out.write("                                <a class=\"w3l_header_contact_details_agile-info_inner\"> 9876543210 </a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <div class=\"header_contact_details_agile\"><i class=\"fa fa-clock-o\" aria-hidden=\"true\"></i>\r\n");
      out.write("                            <div class=\"w3l_header_contact_details_agile\">\r\n");
      out.write("                                <div class=\"header-contact-detail-title\">Opening Hours</div> \r\n");
      out.write("                                <a class=\"w3l_header_contact_details_agile-info_inner\">Mon - Sat: 7:00 - 18:00</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <div class=\"header_contact_details_agile\"><i class=\"fa fa-map-marker\" aria-hidden=\"true\"></i>\r\n");
      out.write("                            <div class=\"w3l_header_contact_details_agile\">\r\n");
      out.write("                                <div class=\"header-contact-detail-title\">137, V.I.P. Road </div> \r\n");
      out.write("                                <a class=\"w3l_header_contact_details_agile-info_inner\">Kolkata, West Bengal 700052 </a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"banner\">\r\n");
      out.write("            <nav class=\"navbar navbar-default\">\r\n");
      out.write("                <div class=\"navbar-header navbar-left\">\r\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\r\n");
      out.write("                        <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("                        <span class=\"icon-bar\"></span>\r\n");
      out.write("                        <span class=\"icon-bar\"></span>\r\n");
      out.write("                        <span class=\"icon-bar\"></span>\r\n");
      out.write("                    </button>\r\n");
      out.write("                    <h1><a class=\"navbar-brand\" href=#><span>B</span>HAROSA BANK</a></h1>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- Collect the nav links, forms, and other content for toggling -->\r\n");
      out.write("                <div class=\"collapse navbar-collapse navbar-right\" id=\"bs-example-navbar-collapse-1\">\r\n");
      out.write("                    <nav class=\"link-effect-2\" id=\"link-effect-2\">\r\n");
      out.write("                        <ul class=\"nav navbar-nav\">\r\n");
      out.write("                            <li ><a href=#><abbr title=\"PLEASE LOG OUT FIRST\"><span data-hover=\"Home\">Home</span></abbr></a></li>\r\n");
      out.write("                            <li><a href=#><abbr title=\"PLEASE LOG OUT FIRST\"><span data-hover=\"About Us\">About Us</span></abbr></a></li>\r\n");
      out.write("                            <li><a href=#><abbr title=\"PLEASE LOG OUT FIRST\"><span data-hover=\"Mail Us\">Mail Us</span></abbr></a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </nav>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </nav>\r\n");
      out.write("        </div>\r\n");
      out.write("        <h2 align=\"center\">&nbsp;</h2>\r\n");
      out.write("        <h2 align=\"center\">&nbsp;</h2>\r\n");
      out.write("        <h2 align=\"center\">&nbsp;</h2>\r\n");
      out.write("        <h2 align=\"center\">&nbsp;</h2>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-sm-6\">\r\n");
      out.write("                <h1 id=\"h1.-bootstrap-heading\" align=\"center\">&nbsp;</h1>\r\n");
      out.write("                <h1 align=\"center\">Account Transactions </h1>\r\n");
      out.write("\r\n");
      out.write("                <table width=\"89%\" class=\"table-fill\">\r\n");
      out.write("                    <thead>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <th class=\"text-left\">Particulars</th>\r\n");
      out.write("                            <th class=\"text-left\">Credit</th>\r\n");
      out.write("                            <th class=\"text-left\">Debit</th>\r\n");
      out.write("                            <th class=\"text-left\">Current Balance</th>\r\n");
      out.write("                            <th class=\"text-center\">Date</th>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                    </thead>\r\n");
      out.write("                    <tbody class=\"table-hover\"> \r\n");
      out.write("\r\n");
      out.write("                        ");

                            try {
                                Class.forName("oracle.jdbc.driver.OracleDriver");
                                String url = ("jdbc:oracle:thin:@localhost:1521:xe");

                                Connection con = DriverManager.getConnection(url, "ob_banking", "1234");

                                String table_name = session.getAttribute("accnos").toString();

                                String temp_d_query = "select * from a$table_name";
                                String d_query = temp_d_query.replace("$table_name", table_name);

                                PreparedStatement ps1 = con.prepareStatement(d_query);
                                ResultSet rs1 = ps1.executeQuery();
                                while (rs1.next()) {
                        
      out.write("\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td class=\"text-right\">");
      out.print(rs1.getString(1));
      out.write("</td>\r\n");
      out.write("                            <td class=\"text-right\">");
      out.print(rs1.getString("credit"));
      out.write("</td>\r\n");
      out.write("                            <td class=\"text-right\">");
      out.print(rs1.getString("debit"));
      out.write("</td>\r\n");
      out.write("                            <td class=\"text-right\">");
      out.print(rs1.getString("balance"));
      out.write("</td>\r\n");
      out.write("                            <td class=\"text-right\">");
      out.print(rs1.getString("dates"));
      out.write("</td>\r\n");
      out.write("\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        ");
}
                            } catch (Exception e) {
                                out.print(e);
                            }
                        
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    </tbody>\r\n");
      out.write("                </table>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-sm-6\">\r\n");
      out.write("                <h1 id=\"h1.-bootstrap-heading\" align=\"center\">&nbsp;</h1>\r\n");
      out.write("                <h1 align=\"center\">Money Transfer </h1>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"center-container\">\r\n");
      out.write("                    <div class=\"w3ls-agileinfo\">\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"bg-agile_userpage\">\r\n");
      out.write("                        <div class=\"login-form\">\t\r\n");
      out.write("                            <form action=\"user_transfer\" method=\"post\">\r\n");
      out.write("\r\n");
      out.write("                                \r\n");
      out.write("                                <div class=\"left-w3-agile\">\r\n");
      out.write("                                <select class=\"form-control\" name=\"accno\">\r\n");
      out.write("                                    <option>Chose Account</option>\r\n");
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
                                    
      out.write("\r\n");
      out.write("                                </select>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <input type=\"number\"  name=\"ammount\" placeholder=\"Ammount in INR\" required=\"\" />\r\n");
      out.write("                                <input type=\"submit\" value=\"Transfer\">\r\n");
      out.write("                            </form>\r\n");
      out.write("                        </div>\t\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- Do every thing Here-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- footer -->\r\n");
      out.write("        <div class=\"wthree_copy_right\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <p>© 2018 Bharosa Bank. All rights reserved</p>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- //footer -->\r\n");
      out.write("\r\n");
      out.write("        <!-- js -->\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery-2.1.4.min.js\"></script>\r\n");
      out.write("        <!-- //js -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <script src=\"js/mainScript.js\"></script>\r\n");
      out.write("        <script src=\"js/rgbSlide.min.js\"></script>\r\n");
      out.write("        <!-- carousal -->\r\n");
      out.write("        <script src=\"js/slick.js\" type=\"text/javascript\" charset=\"utf-8\"></script>\r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("            $(document).on('ready', function () {\r\n");
      out.write("                $(\".center\").slick({\r\n");
      out.write("                    dots: true,\r\n");
      out.write("                    infinite: true,\r\n");
      out.write("                    centerMode: true,\r\n");
      out.write("                    slidesToShow: 2,\r\n");
      out.write("                    slidesToScroll: 2,\r\n");
      out.write("                    responsive: [\r\n");
      out.write("                        {\r\n");
      out.write("                            breakpoint: 768,\r\n");
      out.write("                            settings: {\r\n");
      out.write("                                arrows: true,\r\n");
      out.write("                                centerMode: false,\r\n");
      out.write("                                slidesToShow: 2\r\n");
      out.write("                            }\r\n");
      out.write("                        },\r\n");
      out.write("                        {\r\n");
      out.write("                            breakpoint: 480,\r\n");
      out.write("                            settings: {\r\n");
      out.write("                                arrows: true,\r\n");
      out.write("                                centerMode: false,\r\n");
      out.write("                                centerPadding: '40px',\r\n");
      out.write("                                slidesToShow: 1\r\n");
      out.write("                            }\r\n");
      out.write("                        }\r\n");
      out.write("                    ]\r\n");
      out.write("                });\r\n");
      out.write("            });\r\n");
      out.write("        </script>\r\n");
      out.write("        <!-- //carousal -->\r\n");
      out.write("        <!-- flexisel -->\r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("            $(window).load(function () {\r\n");
      out.write("                $(\"#flexiselDemo1\").flexisel({\r\n");
      out.write("                    visibleItems: 4,\r\n");
      out.write("                    animationSpeed: 1000,\r\n");
      out.write("                    autoPlay: true,\r\n");
      out.write("                    autoPlaySpeed: 3000,\r\n");
      out.write("                    pauseOnHover: true,\r\n");
      out.write("                    enableResponsiveBreakpoints: true,\r\n");
      out.write("                    responsiveBreakpoints: {\r\n");
      out.write("                        portrait: {\r\n");
      out.write("                            changePoint: 480,\r\n");
      out.write("                            visibleItems: 1\r\n");
      out.write("                        },\r\n");
      out.write("                        landscape: {\r\n");
      out.write("                            changePoint: 640,\r\n");
      out.write("                            visibleItems: 2\r\n");
      out.write("                        },\r\n");
      out.write("                        tablet: {\r\n");
      out.write("                            changePoint: 768,\r\n");
      out.write("                            visibleItems: 2\r\n");
      out.write("                        }\r\n");
      out.write("                    }\r\n");
      out.write("                });\r\n");
      out.write("\r\n");
      out.write("            });\r\n");
      out.write("        </script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery.flexisel.js\"></script>\r\n");
      out.write("        <!-- //flexisel -->\r\n");
      out.write("\r\n");
      out.write("        <!-- flexSlider -->\r\n");
      out.write("        <script defer src=\"js/jquery.flexslider.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("            $(window).load(function () {\r\n");
      out.write("                $('.flexslider').flexslider({\r\n");
      out.write("                    animation: \"slide\",\r\n");
      out.write("                    start: function (slider) {\r\n");
      out.write("                        $('body').removeClass('loading');\r\n");
      out.write("                    }\r\n");
      out.write("                });\r\n");
      out.write("            });\r\n");
      out.write("        </script>\r\n");
      out.write("        <!-- //flexSlider -->\r\n");
      out.write("\r\n");
      out.write("        <!-- start-smooth-scrolling -->\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/move-top.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/easing.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("            jQuery(document).ready(function ($) {\r\n");
      out.write("                $(\".scroll\").click(function (event) {\r\n");
      out.write("                    event.preventDefault();\r\n");
      out.write("                    $('html,body').animate({scrollTop: $(this.hash).offset().top}, 1000);\r\n");
      out.write("                });\r\n");
      out.write("            });\r\n");
      out.write("        </script>\r\n");
      out.write("        <!-- start-smooth-scrolling -->\r\n");
      out.write("        <!-- for bootstrap working -->\r\n");
      out.write("        <script src=\"js/bootstrap.js\"></script>\r\n");
      out.write("        <!-- //for bootstrap working -->\r\n");
      out.write("        <!-- here stars scrolling icon -->\r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("            $(document).ready(function () {\r\n");
      out.write("                /*\r\n");
      out.write("                 var defaults = {\r\n");
      out.write("                 containerID: 'toTop', // fading element id\r\n");
      out.write("                 containerHoverID: 'toTopHover', // fading element hover id\r\n");
      out.write("                 scrollSpeed: 1200,\r\n");
      out.write("                 easingType: 'linear' \r\n");
      out.write("                 };\r\n");
      out.write("                 */\r\n");
      out.write("\r\n");
      out.write("                $().UItoTop({easingType: 'easeOutQuart'});\r\n");
      out.write("\r\n");
      out.write("            });\r\n");
      out.write("        </script>\r\n");
      out.write("        <!-- //here ends scrolling icon -->\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
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
