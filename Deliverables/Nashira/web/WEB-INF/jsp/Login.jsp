<%-- 
    Document   : login
    Created on : 13-gen-2020, 12.07.43
    Author     : LittleJoke
--%>

<%@page import="Servlet.Login"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html class="wide wow-animation" lang="en">
    <head>
        <title>Nashira Login</title>

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


            <div class="col-md-6 mx-auto text-center">
                <div class="header-title">
                    <h1 style=" font-size: 26px;" class="wv-heading--title">
                        Accedi - Login
                    </h1>
                </div>
            </div>
            <div class="row">
                <div class="col-md-4 mx-auto">
                    <div class="myform form ">
                        <p id="error">${error}</p><br>
                        <%  String ema;
                            String pass;
                            if (request.getAttribute("email") != null) {
                                ema = request.getParameter("email");
                                pass = request.getParameter("password");
                            } else {
                                ema = "";
                                pass = "";
                            }%>
                        <form action="./Login" method="post">
                            <div class="form-group">
                                <input type="email" value="<%=ema%>" name="email"  class="form-control my-input" id="nome" placeholder="Inserisci E-mail" required>
                            </div>
                            <div class="form-group">
                                <input type="password" value="<%=pass%>"  name="password"  class="form-control my-input" id="nome" placeholder="Inserisci Password" required>
                            </div>
                            <div class="text-center ">
                                <button type="submit" value="Login" class=" btn btn-block send-button tx-tfm" style="background: #FFEBCD">Accedi</button>
                            </div>
                            <div class="text-center ">
                                <br/><p>Non sei ancora Registrato? Clicca <a href="./PaginaRegistrazione">qui</a> per farlo!</p>
                            </div>
                        </form> 
                    </div>
                </div>
            </div>

            <script src="js/core.min.js"></script>
            <script src="js/script.js"></script>
    </body>
</html>

