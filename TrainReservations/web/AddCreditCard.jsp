<%-- 
    Document   : AddCreditCard
    Created on : Dec 17, 2016, 7:04:32 PM
    Author     : Filmm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <link href="dist/css/bootstrap.min.css" rel="stylesheet">
        <link href="dist/css/bootstrap-theme.min.css" rel="stylesheet">
        <link href="assets/css/ie10-viewport-bug-workaround.css" rel="stylesheet">
        <link href="theme.css" rel="stylesheet">
        <script src="assets/js/ie-emulation-modes-warning.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Credit Card</title>
    </head>
    <body>
        <h1>Payment</h1>
        <form name ="payment" action = "PaymentController">
            Card Name : <input type ="text" name="cardname" value=""><br>
            Card Number : <input type ="text" name="cardnumber" value=""><br>
            Expired Month : <input type ="text" name="empmonth" value=""><br>
            Expired Year : <input type ="text" name="empyear" value=""><br>
            <input type ="submit" name ="summit" value ="Confirm payment"><br>
        </form>
    </body>
</html>
