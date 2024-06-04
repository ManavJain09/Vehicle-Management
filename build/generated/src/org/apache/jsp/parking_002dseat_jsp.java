package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.connection.*;
import java.sql.*;

public final class parking_002dseat_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("<!doctype html>\r\n");
      out.write("<html class=\"no-js\" lang=\"\">\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("<title>VPMS - Add Category</title>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<link rel=\"apple-touch-icon\" href=\"https://i.imgur.com/QRAUqs9.png\">\r\n");
      out.write("<link rel=\"shortcut icon\" href=\"https://i.imgur.com/QRAUqs9.png\">\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://cdn.jsdelivr.net/npm/normalize.css@8.0.0/normalize.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/css/bootstrap.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://cdn.jsdelivr.net/npm/font-awesome@4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://cdn.jsdelivr.net/gh/lykmapipo/themify-icons@0.1.2/css/themify-icons.css\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://cdn.jsdelivr.net/npm/pixeden-stroke-7-icon@1.2.3/pe-icon-7-stroke/dist/pe-icon-7-stroke.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://cdnjs.cloudflare.com/ajax/libs/flag-icon-css/3.2.0/css/flag-icon.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"assets/css/cs-skin-elastic.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"assets/css/style.css\">\r\n");
      out.write("\r\n");
      out.write("<link\r\n");
      out.write("\thref='https://fonts.googleapis.com/css?family=Open+Sans:400,600,700,800'\r\n");
      out.write("\trel='stylesheet' type='text/css'>\r\n");
      out.write("\r\n");
      out.write("<!-- <script type=\"text/javascript\" src=\"https://cdn.jsdelivr.net/html5shiv/3.7.3/html5shiv.min.js\"></script> -->\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");

		if (session.getAttribute("uname") != null && session.getAttribute("uname") != "") {
	
      out.write("\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includes/sidebar.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includes/header.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"breadcrumbs\">\r\n");
      out.write("\t\t<div class=\"breadcrumbs-inner\">\r\n");
      out.write("\t\t\t<div class=\"row m-0\">\r\n");
      out.write("\t\t\t\t<div class=\"col-sm-4\">\r\n");
      out.write("\t\t\t\t\t<div class=\"page-header float-left\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"page-title\">\r\n");
      out.write("\t\t\t\t\t\t\t<h1>Dashboard</h1>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-sm-8\">\r\n");
      out.write("\t\t\t\t\t<div class=\"page-header float-right\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"page-title\">\r\n");
      out.write("\t\t\t\t\t\t\t<ol class=\"breadcrumb text-right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"dashboard.jsp\">Dashboard</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"add-category.jsp\">Category</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"active\">Parking Seats</li>\r\n");
      out.write("\t\t\t\t\t\t\t</ol>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"content\">\r\n");
      out.write("\t\t<div class=\"animated fadeIn\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-lg-6\">\r\n");
      out.write("\t\t\t\t\t<div class=\"card\"></div>\r\n");
      out.write("\t\t\t\t\t<!-- .card -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!--/.col-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"col-lg-12\">\r\n");
      out.write("\t\t\t\t\t<div class=\"card\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"card-header\">\r\n");
      out.write("\t\t\t\t\t\t\t<strong>Parking </strong> Seats\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t");

						int parking_seat=0;
						Connection con = DatabaseConnection.getConnection();
						Statement statement = con.createStatement();
						ResultSet resultset = statement.executeQuery("select * from tblParkingSeatCapacity");
						while (resultset.next()) {
							parking_seat = resultset.getInt(1);
						}
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"card-body card-block\">\r\n");
      out.write("\t\t\t\t\t\t\t<form action=\"update-parking-seats.jsp\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"row form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col col-md-3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label for=\"text-input\" class=\" form-control-label\">Parking Seats\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-12 col-md-9\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"text\" id=\"pseats\" name=\"pseats\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"form-control\" \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\trequired=\"true\" value=\"");
      out.print(parking_seat);
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p style=\"text-align: center;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-primary btn-sm\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tname=\"submit\">Update Parking Seats</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"col-lg-6\"></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- .animated -->\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- .content -->\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"clearfix\"></div>\r\n");
      out.write("\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includes/footer.jsp", out, false);
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- /#right-panel -->\r\n");
      out.write("\r\n");
      out.write("\t<!-- Right Panel -->\r\n");
      out.write("\r\n");
      out.write("\t<!-- Scripts -->\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"https://cdn.jsdelivr.net/npm/jquery@2.2.4/dist/jquery.min.js\"></script>\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"https://cdn.jsdelivr.net/npm/popper.js@1.14.4/dist/umd/popper.min.js\"></script>\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/js/bootstrap.min.js\"></script>\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"https://cdn.jsdelivr.net/npm/jquery-match-height@0.7.2/dist/jquery.matchHeight.min.js\"></script>\r\n");
      out.write("\t<script src=\"assets/js/main.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");

	} else {
		response.sendRedirect("admin-login.jsp");
	}

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
