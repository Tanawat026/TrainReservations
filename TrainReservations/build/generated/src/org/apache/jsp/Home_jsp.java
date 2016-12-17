package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import hiber.Train;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Train Reservations</title>\n");
      out.write("    </head>\n");
      out.write("    <body><center>\n");
      out.write("        <h1>Phuket Trains</h1>\n");
      out.write("        จองตั๋วรถไฟ <br><br>\n");
      out.write("        (คุณสามารถขึ้นที่สถานีใดก็ได้ภายในจังหวัดนั้น) <br><br>\n");
      out.write("        <form name=\"SearchTicket\" action=\"TrainSearchController\" >\n");
      out.write("        สถานีต้นทาง\n");
      out.write("        <select name =\"TrainFrom\">\n");
      out.write("            <option selected disabled>เลือกต้นทาง</option>\n");
      out.write("            <option value=\"Phuket\">Phuket</option>\n");
      out.write("            <option value=\"Suratthani\">Suratthani</option>\n");
      out.write("            <option value=\"Krabi\">Krabi</option>\n");
      out.write("            <option value=\"Trang\">Trang</option>\n");
      out.write("            <option value=\"Ranong\">Ranong</option>\n");
      out.write("            <option value=\"Phang-nga\">Phang-nga</option>\n");
      out.write("        </select>&nbsp;&nbsp;&nbsp;\n");
      out.write("        สถานีปลายทาง\n");
      out.write("        <select name =\"TrainTo\">\n");
      out.write("            <option selected disabled>เลือกปลายทาง</option>\n");
      out.write("            <option value=\"Phuket\">Phuket</option>\n");
      out.write("            <option value=\"Suratthani\">Suratthani</option>\n");
      out.write("            <option value=\"Krabi\">Krabi</option>\n");
      out.write("            <option value=\"Trang\">Trang</option>\n");
      out.write("            <option value=\"Ranong\">Ranong</option>\n");
      out.write("            <option value=\"Phang-nga\">Phang-nga</option>\n");
      out.write("        </select>&nbsp;&nbsp;&nbsp;\n");
      out.write("         <input type=\"submit\" value=\"ค้นหาตั๋วโดยสาร\" name=\"searchButton\" />\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("    </center>\n");
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
