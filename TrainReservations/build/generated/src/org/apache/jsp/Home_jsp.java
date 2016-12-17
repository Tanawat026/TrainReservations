package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import hiber.Train;
import hiber.TrainDetail;

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
      out.write("            สถานีต้นทาง\n");
      out.write("            <select name =\"TrainFrom\">\n");
      out.write("                <option selected disabled>เลือกต้นทาง</option>\n");
      out.write("                <option value=\"Phuket\">Phuket</option>\n");
      out.write("                <option value=\"Suratthani\">Suratthani</option>\n");
      out.write("                <option value=\"Krabi\">Krabi</option>\n");
      out.write("                <option value=\"Trang\">Trang</option>\n");
      out.write("                <option value=\"Ranong\">Ranong</option>\n");
      out.write("                <option value=\"Phang-nga\">Phang-nga</option>\n");
      out.write("            </select>&nbsp;&nbsp;&nbsp;\n");
      out.write("            สถานีปลายทาง\n");
      out.write("            <select name =\"TrainTo\">\n");
      out.write("                <option selected disabled>เลือกปลายทาง</option>\n");
      out.write("                <option value=\"Phuket\">Phuket</option>\n");
      out.write("                <option value=\"Suratthani\">Suratthani</option>\n");
      out.write("                <option value=\"Krabi\">Krabi</option>\n");
      out.write("                <option value=\"Trang\">Trang</option>\n");
      out.write("                <option value=\"Ranong\">Ranong</option>\n");
      out.write("                <option value=\"Phang-nga\">Phang-nga</option>\n");
      out.write("            </select>&nbsp;&nbsp;&nbsp;\n");
      out.write("            <input type=\"submit\" value=\"ค้นหาตั๋วโดยสาร\" name=\"searchButton\" />\n");
      out.write("        </form>\n");
      out.write("        ");

            try {
                // Create a session object if it is already not created.
                List<Object[]> trainSearchList = (List<Object[]>) session.getAttribute("searchResult");
                if (trainSearchList != null) {
        
      out.write("\n");
      out.write("        <table border=\"1\"> ");
 //border="1" 
      out.write("\n");
      out.write("            <tbody>\n");
      out.write("                <tr>\n");
      out.write("                    <td >ชื่อรถไฟ</td>\n");
      out.write("                    <td>สถานีต้นทาง</td>\n");
      out.write("                    <td>สถานีปลายทาง</td>\n");
      out.write("                    <td>วันที่ออก</td>\n");
      out.write("                    <td>เวลาออก</td> \n");
      out.write("                    <td>เวลาถึง</td>\n");
      out.write("                    <td>จำนวนที่นั่งว่าง</td>\n");
      out.write("                    <td>ราคา(บาท)</td>\n");
      out.write("                    <td>จอง</td>\n");
      out.write("                </tr>\n");
      out.write("                ");
 
                    for (Object[] obj : trainSearchList) {
                        Train train = (Train) obj[0];
                        TrainDetail traindetail = (TrainDetail) obj[1];
                
      out.write(" \n");
      out.write("                <tr>\n");
      out.write("                    <td ><input type = \"text\" name = \"trainname\" value=\"");
 out.println(train.getTrainname()); 
      out.write("\" readonly</td>\n");
      out.write("                    <td><input type = \"text\" name = \"fromlocation\" value=\"");
 out.println(train.getFromLocation()); 
      out.write("\" readonly</td>\n");
      out.write("                    <td><input type = \"text\" name = \"tolocation\" value=\"");
 out.println(train.getToLocation()); 
      out.write("\" readonly</td>\n");
      out.write("                    <td><input type = \"text\" name = \"departuredate\" value=\"");
 out.println(traindetail.getDepartureDate()); 
      out.write("\" readonly</td>\n");
      out.write("                    <td><input type = \"text\" name = \"departuretime\" value=\"");
 out.println(train.getDepartureTime()); 
      out.write("\" readonly</td>\n");
      out.write("                    <td><input type = \"text\" name = \"arrivaltime\" value=\"");
 out.println(train.getArrivalTime()); 
      out.write("\" readonly</td>\n");
      out.write("                    <td><input type = \"text\" name = \"availableseat\" value=\"");
 out.println(traindetail.getAvailableSeat()); 
      out.write("\" readonly</td>\n");
      out.write("                    <td><input type = \"text\" name = \"price\" value=\"");
 out.println(traindetail.getPrice()); 
      out.write("\" readonly</td>\n");
      out.write("                    <td><input type =\"submit\" name =\"submit\" value = \"จองตั๋วโดยสาร\"></td>\n");
      out.write("                </tr>\n");
      out.write("                ");
}
      out.write("\n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("        ");
 }
            } catch (Exception e) {
                e.printStackTrace();
            }
        
      out.write("\n");
      out.write("    </center>\n");
      out.write("</body>\n");
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
