package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(4);
    _jspx_dependants.add("/Navs/index_nav.jsp");
    _jspx_dependants.add("/Models/signup_signin_model.jsp");
    _jspx_dependants.add("/Models/../Forms/SignUp.jsp");
    _jspx_dependants.add("/Models/../Forms/Signin.jsp");
  }

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
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css\\bootstrap.min.css\">\n");
      out.write("        <title>Resin</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-inverse  bg-inverse fixed-top\">\n");
      out.write("\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-5 col-sm-9\">\n");
      out.write("                        <a href=\"index.jsp\" class=\"navbar-brand\"><h4>Faceshoop</h4></a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col col-sm\">\n");
      out.write("                        <a href=\"#\" class=\" btn btn-outline-success mr-3\" id=\"signup_button\">Sign Up</a>\n");
      out.write("                        <a href=\"#\" class=\" btn btn-outline-success\" id=\"login_buttton\" > &ThinSpace; Login &ThinSpace;</a>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("        </nav>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("          <div id=\"loginModal\" class=\"modal fade\" role=\"dialog\">\n");
      out.write("            <div class=\"modal-dialog modal-md \" role=\"content\">\n");
      out.write("                <div class=\"modal-content bg-inverse text-white\">\n");
      out.write("                    <div class=\"modal-header\">\n");
      out.write("\n");
      out.write("                        <ul class=\"nav nav-tabs\" role=\"tablist\">\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link\" data-toggle=\"tab\"id=\"signup_link\"  href=\"#signup\" role=\"tab\">Sign Up</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link\" data-toggle=\"tab\" href=\"#signin\"id=\"login_link\"  role=\"tab\">Sign In</a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                        <button type=\"button\" class=\"close text-white\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"tab-content\">\n");
      out.write("                         <div class=\" tab-pane\" id=\"signup\" role=\"tabpanel\">\n");
      out.write("\n");
      out.write("                             ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\" container\">\r\n");
      out.write("            <br>\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col\">\r\n");
      out.write("                    <form class=\"container-fliud\" id=\"myForm\" action=\"Accueil/display.jsp\" method=\"POST\">\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col\">\r\n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"firstname\" name=\"firstname\" placeholder=\"First Name*\" >\r\n");
      out.write("                                <span class=\"error\">error_description</span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"row \">\r\n");
      out.write("                            <div class=\"col\">\r\n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"lastname\" name=\"lastname\" placeholder=\"Last Name*\">\r\n");
      out.write("                                <span class=\"error\">error_description</span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col\">\r\n");
      out.write("                                <input type=\"email\"class=\"form-control\" id=\"email\" name=\"email\" placeholder=\"Email*\">\r\n");
      out.write("                                <span class=\"error\">error_description</span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col\">\r\n");
      out.write("                                <input type=\"password\" class=\"form-control\" id=\"password\" name=\"password\"placeholder=\"Password*\">\r\n");
      out.write("                                <span class=\"error\">error_description</span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col\">\r\n");
      out.write("                                <input type=\"password\" class=\"form-control\" id=\"confirmpassword\" name=\"confirmpassword\" placeholder=\"Confirm Password*\">\r\n");
      out.write("                                <span class=\"error\">error_description</span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"row \">\r\n");
      out.write("                            <div class=\"col\">\r\n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"address\" name=\"address\" placeholder=\"Address*\" >\r\n");
      out.write("                                <span class=\"error\">error_description</span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col\">\r\n");
      out.write("                                <select name=\"city\" id=\"city\" class=\"form-control\">\r\n");
      out.write("                                    <option value=\"\">city</option>\r\n");
      out.write("                                    <option value=\"Alger\">Alger</option>\r\n");
      out.write("                                    <option value=\"Oran\">Oran</option>\r\n");
      out.write("                                </select>\r\n");
      out.write("                                <span class=\"error\">Blala</span>\r\n");
      out.write("                                <br>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col-sm-8 offset-sm-4\">\r\n");
      out.write("                                <button class=\"btn btn-primary \"id=\"submit_signup\" type=\"button\"onclick=\"return testInput()\" >Sign Up</button>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <br>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\n");
      out.write("                             \n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"tab-pane card-body \" id=\"signin\" role=\"tabpanel\">\n");
      out.write("                        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        ");

        
        
                  Cookie[] cookie=request.getCookies();
    String email="";
    String password="";
    if(cookie != null){
        for (Cookie elem : cookie) {
             
               if("email.resin.signin".equals(elem.getName())) {
                   email=elem.getValue();
               }else if("password.resin.signin".equals(elem.getName())){
                   password=elem.getValue();
               }
         }
    }else{
       
    }
        
        
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <br>\n");
      out.write("                <div class=\"col\">\n");
      out.write("                    <h2>Hello and Welcome!</h2>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col\">\n");
      out.write("                    <form class=\"container-fliud\" id=\"signin_form\">       \n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-12\">\n");
      out.write("                                <label>Email*</label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-12\">\n");
      out.write("                                <input type=\"email\"class=\"form-control\" id=\"email_signin\" placeholder=\"Email*\" value=\"");
      out.print(email);
      out.write("\">\n");
      out.write("                                <br>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-12\">\n");
      out.write("                                <label>Password*</label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-12\">\n");
      out.write("                                <input type=\"password\" class=\"form-control\" id=\"password_signin\" placeholder=\"Password*\" value=\"");
      out.print(password);
      out.write("\">\n");
      out.write("                                <br>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-12\">\n");
      out.write("                                <input type=\"checkbox\" id=\"rememberMe\" checked > Remember me\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-12\">\n");
      out.write("                                <button class=\"btn btn-primary btn-block\" id=\"submit_signin\" type=\"button\">Sign In</button>\n");
      out.write("                                <span class=\"error_in\"></span>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <br>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write(" \n");
      out.write("                    </div>           \n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                   \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        <br><br><br><br>\n");
      out.write("        <h1 class=\"rythm-bass\">Yagoubi</h1>\n");
      out.write("         <script src=\"js/jquery.min.js\"></script>\n");
      out.write("        <script src=\"js/tether.min.js\"></script>\n");
      out.write("        <script src=\"js\\bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"js/controle_model/model_signin_signup.js\"></script>\n");
      out.write("        <script src=\"js/validation/test_validation_signup.js\"></script>\n");
      out.write("        <script src=\"js/validation/test_validation_signin.js\"></script>\n");
      out.write("        \n");
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
