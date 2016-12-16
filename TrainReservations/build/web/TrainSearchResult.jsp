<%-- 
    Document   : Home
    Created on : Dec 17, 2016, 1:36:58 AM
    Author     : Filmm
--%>
<%@page import="java.util.List"%>
<%@page import="hiber.Train"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Train Reservations</title>
    </head>
    <body><center>
        <h1>Phuket Trains</h1>
        จองตั๋วรถไฟ <br><br>
        (คุณสามารถขึ้นที่สถานีใดก็ได้ภายในจังหวัดนั้น) <br><br>
        <form name="SearchTicket" action="TrainSearchController" >
        สถานีต้นทาง
        <select name ="TrainFrom">
            <option selected disabled>เลือกต้นทาง</option>
            <option value="Phuket">Phuket</option>
            <option value="Suratthani">Suratthani</option>
            <option value="Krabi">Krabi</option>
            <option value="Trang">Trang</option>
            <option value="Ranong">Ranong</option>
            <option value="Phang-nga">Phang-nga</option>
        </select>&nbsp;&nbsp;&nbsp;
        สถานีปลายทาง
        <select name ="TrainTo">
            <option selected disabled>เลือกปลายทาง</option>
            <option value="Phuket">Phuket</option>
            <option value="Suratthani">Suratthani</option>
            <option value="Krabi">Krabi</option>
            <option value="Trang">Trang</option>
            <option value="Ranong">Ranong</option>
            <option value="Phang-nga">Phang-nga</option>
        </select>&nbsp;&nbsp;&nbsp;
         <input type="submit" value="ค้นหาตั๋วโดยสาร" name="searchButton" />
        </form>
         <%
                try {
                    // Create a session object if it is already not  created.
                    List<Train> trainSearchList = (List<Train>) session.getAttribute("searchResult");
                    if (trainSearchList != null) {
            %>
            <table border="1"> <% //border="1" %>
                <tbody>
                    <tr>
                        <td >ชื่อรถไฟ</td>
                        <td>สถานีต้นทาง</td>
                        <td>สถานีปลายทาง</td>
                         <td>วันที่ออก</td>
                         <td>เวลาออก</td> 
                         <td>เวลาถึง</td>
                         <td>จำนวนที่นั่งว่าง</td>
                    </tr>
                    <% for (Train acc : trainSearchList){%> 
                    <tr>
                        <td ><% out.println(acc.getTrainname()); %></td>
                        <td><% out.println(acc.getFromLocation()); %></td>
                        <td><% out.println(acc.getToLocation()); %></td>
                         <td><% //out.println(acc.getDepartureDate()); %></td>
                         <td><% out.println(acc.getDepartureTime()); %></td>
                         <td><% out.println(acc.getArrivalTime() ); %></td>
                        <td><% //out.println(acc.getAvailableSeat()); %></td>
                    </tr>
                    <%}%>
                </tbody>
            </table>
            <%   
                }
                } catch (Exception e) {
                    out.println(e.getMessage());
                }
            %>
    </center>
    </body>
</html>
