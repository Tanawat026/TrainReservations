<%-- 
    Document   : TicketShowConfirm
    Created on : Dec 17, 2016, 8:03:18 PM
    Author     : Filmm
--%>

<%@page import="hiber.Ticketinfo"%>
<%@page import="hiber.Passenger"%>
<%@page import="java.util.List"%>
<%@page import="hiber.TrainDetail"%>
<%@page import="hiber.Train"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Confirm Ticket</title>
    </head>
    <body>
        <h1>Ticket Detail</h1>
        <%
            try {
                Object obj = session.getAttribute("lastTicketOther");
                Ticketinfo ticket = (Ticketinfo) session.getAttribute("lastTicket");
                String trainname = (String) session.getAttribute("trainname");
               String fromlocation =  (String) session.getAttribute("fromlocation");
                String tolocation = (String) session.getAttribute("tolocation");
                String departuretime = (String) session.getAttribute("departuretime");
                String arrivaltime = (String) session.getAttribute("arrivaltime");
               

        %>
        <form name = "ReservationsTicket" action="TicketUpdateController" method="GET">
            <table border="1"> <% //border="1" %>
                <tbody>
                     <tr>
                        <td >หมายเลขตั๋ว</td>
                        <td ><input type = "text" name = "taickId" value="<%= ticket.getTicketId() %>" readonly</td>
                    </tr>
                    <tr>
                        <td >ชื่อรถไฟ</td>
                        <td ><input type = "text" name = "trainname" value="<%= trainname %>" readonly</td>
                    </tr>
                    <tr>
                        <td>สถานีต้นทาง</td>
                        <td><input type = "text" name = "fromlocation" value="<%= fromlocation %>" readonly</td>
                    </tr>
                    <tr>
                        <td>สถานีปลายทาง</td>
                        <td><input type = "text" name = "tolocation" value="<%= tolocation%>" readonly</td>
                    </tr>
                    <tr>
                        <td>วันที่ออก</td>
                        <td><input type = "text" name = "departuredate" value="<%= ticket.getDepartureDate() %>" readonly</td>
                    </tr>
                    <tr>
                        <td>เวลาออก</td> 
                        <td><input type = "text" name = "departuretime" value="<%= departuretime %>" readonly</td>
                    </tr>
                <td>เวลาถึง</td>
                <td><input type = "text" name = "arrivaltime" value="<%= arrivaltime %>" readonly</td>
                </tr>
                <tr>
                    <td>ราคา(บาท)</td>
                    <td><input type = "text" name = "price" value="<%= ticket.getPriceAll() %>" readonly</td>
                </tr>
                </tr>
        </form>
        <input type ="submit" name ="submit" value = "ยืนยันตั๋วโดยสาร">
        <a href="Home.jsp">ยกเลิกตั๋วโดยสาร</a>
    </tbody>
</table>
<% 
   }catch (Exception e) {
        e.printStackTrace();
    }
%>
</tbody>
</table>
</body>
</html>
