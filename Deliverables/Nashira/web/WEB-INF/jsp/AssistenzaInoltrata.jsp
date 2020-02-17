<%-- 
    Document   : login
    Created on : 13-gen-2020, 12.07.43
    Author     : LittleJoke
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html class="wide wow-animation" lang="en">
    <head>
        <title>Nashira Assistenza</title>

        <meta name="viewport" content="width=device-width, height=device-height, initial-scale=1.0, maximum-scale=1.0, user-scalable=0">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta charset="utf-8">
        <link rel="icon" href="images/icon.ico" type="image/x-icon">
        <!-- Stylesheets-->
        <link rel="stylesheet" href="css/bootstrap.css">
        <link rel="stylesheet" href="css/fonts.css">
        <link rel="stylesheet" href="css/style.css">

    </head>
    <body>

        <div class="page">

            <!-- Page Header-->
            <header class="section page-header">
                <!-- RD Navbar-->
                <%@include file="navbar.jsp" %>
            </header>

            <%String s = (String) request.getAttribute("problema");%>

            <h6 align="center">Assistenza Inviata</h6>
            <p><b>Messaggio Inoltrato:</b> <%=s%> </p>
            <p>Clicca <a href="./AssistenzaServ"> qui </a>  per tornare alla pagina di assistenze</p>       
        </div>
        <script src="js/core.min.js"></script>
        <script src="js/script.js"></script>
    </body>
</html>

