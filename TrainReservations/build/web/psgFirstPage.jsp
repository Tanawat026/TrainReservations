<%-- 
    Document   : Home
    Created on : Dec 17, 2016, 1:36:58 AM
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
        <title>Train ticket</title>
    </head>
    <body>
        <form class="form-inline" method="POST" action="LoginController">
            <div class="form-group">
                <label class="sr-only">Email address</label>
                <input type="email" class="form-control" name="username" placeholder="Email">
            </div>
            <div class="form-group">
                <label class="sr-only">Password</label>
                <input type="password" name="password" class="form-control" placeholder="Password">
            </div>

            <button type="submit" class="btn btn-default">Sign in</button>
        </form>

        <%
            String message = request.getParameter("message");
            if (message != null) {
        %>
        <div class="alert alert-danger" role="alert">
            <span class="glyphicon glyphicon-exclamation-sign" aria-hidden="true"></span>
            <span class="sr-only">Error:</span>
            Enter a valid email address or password
        </div>
        <%
            }
        %>

    </body>
</html>
