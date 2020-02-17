<%-- 
    Document   : login
    Created on : 13-gen-2020, 12.07.43
    Author     : LittleJoke
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html class="wide wow-animation" lang="en">
    <head>
        <title>Nashira Modifica Profilo</title>

        <meta name="viewport" content="width=device-width, height=device-height, initial-scale=1.0, maximum-scale=1.0, user-scalable=0">
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


            <h5 align="center">Modifica Profilo</h5><br>
            <form action="./ModificaProfilo" method="post">
                <table align="center">
                    <tr><th><strong>Email:</strong></th><th><input class="form-control my-input" type="text" name="nome" min="3" requierd readonly="readonly" value="<%=u.getEmail()%>"></th></tr>
                    <tr><th><strong>Password:</strong></th><th><input class="form-control my-input" type=password name="password" min="8" required  value="<%=u.getPassword()%>"></th></tr>
                    <tr><th><strong>Nome:</strong></th><th><input class="form-control my-input" type="text" name="nome"  value="<%=u.getNome()%>"></th></tr>
                    <tr><th><strong>Cognome:</strong></th><th><input class="form-control my-input" type="text" name="cognome" value="<%=u.getCognome()%>"></th></tr>
                    <tr><th><strong>Indirizzo:</strong></th><th><input class="form-control my-input" type="text" name="indirizzo" value="<%=u.getIndirizzo()%>"></th></tr>
                    <tr><th><strong>Cittá:</strong></th><th><input class="form-control my-input" type="text" name="citta" value="<%=u.getCitta()%>"></th></tr>
                    <tr><th><strong>Zip:</strong></th><th><input class="form-control my-input" type="text" name="zip" value="<%=u.getZip()%>"></th></tr>
                </table><br>
                <input align="center" type="submit" value="Modifica">			
                </div>
            </form>      
            <script src="js/core.min.js"></script>
            <script src="js/script.js"></script>
    </body>
</html>

