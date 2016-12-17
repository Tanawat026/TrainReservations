<%-- 
    Document   : AddCreditCard
    Created on : Dec 17, 2016, 7:04:32 PM
    Author     : Filmm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Credit Card</title>
    </head>
    <body>
        <h1>Payment</h1>
        <form name ="payment" action = "PaymentController">
        Card Name : <input type ="text" name="cardname" value="">
        Card Number : <input type ="text" name="cardnumber" value="">
        Expired Month : <input type ="text" name="empmonth" value="">
        Expired Year : <input type ="text" name="empyear" value="">
        <input text ="submit" name ="summit" vaule ="Confirm payment">
        <a href = "Home.jsp">Cancle Ticket</a>
        </form>
    </body>
</html>
