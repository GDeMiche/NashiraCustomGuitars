<%-- 
    Document   : login
    Created on : 13-gen-2020, 12.07.43
    Author     : LittleJoke
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html class="wide wow-animation" lang="en">
    <head>
        <title>Nashira Registrazione Utente</title>

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
                    <h1 style="font-size: 26px;" class="wv-heading--title">
                        Registrati
                    </h1>
                </div>
            </div>
            <div class="row">
                <div class="col-md-4 mx-auto">
                    <div class="myform form ">
                        <form action="./Registrazione" method="post">
                            <p id="error">${error}</p><br>
                            <%  String ema;
                                String nome;
                                String cognome;
                                String indirizzo;
                                String citta;
                                String zip;
                                if (request.getAttribute("nome") != null) {
                                    nome = request.getParameter("nome");
                                    cognome = request.getParameter("cognome");
                                    indirizzo = request.getParameter("indirizzo");
                                    citta = request.getParameter("citta");
                                    zip = request.getParameter("zip");
                                    ema = request.getParameter("email");
                                } else {
                                    nome = "";
                                    cognome = "";
                                    indirizzo = "";
                                    citta = "";
                                    zip = "";
                                    ema = "";
                                }%>
                            <div class="form-group">
                                <input type="text" name="nome" value="<%=nome%>" class="form-control my-input" id="nome" placeholder="Nome" required>
                            </div>

                            <div class="form-group">
                                <input type="text" name="cognome" value="<%=cognome%>" class="form-control my-input" id="cognome" placeholder="Cognome" required>
                            </div>

                            <div class="form-group">
                                <input type="text" name="indirizzo" value="<%=indirizzo%>" class="form-control my-input" id="indirizzo" placeholder="Indirizzo" required>
                            </div>

                            <div class="form-group">
                                <input type="text" name="citta" value="<%=citta%>" class="form-control my-input" id="citta" placeholder="Citta'" required>
                            </div>

                            <div class="form-group">
                                <input type="text" name="zip" value="<%=zip%>" class="form-control my-input" id="zip" placeholder="Zip" required>
                            </div> 

                            <div class="form-group">
                                <input type="email" name="email" value="<%=ema%>" class="form-control my-input" id="email" placeholder="Email" required>
                            </div>

                            <div class="form-group">
                                <input type="password" name="password"  class="form-control my-input" id="password" placeholder="Password">
                            </div>

                            <div class="form-group">
                                <input type="password" name="Cpassword"  class="form-control my-input" id="Cpassword" placeholder="Conferma Password">
                            </div>

                            <div class="text-center ">
                                <button type="submit" class=" btn btn-block send-button tx-tfm" style="background: #FFEBCD">Registrati</button>
                            </div><br>
                        </form>
                    </div>
                </div>
            </div>
        </div>      
        <script src="js/core.min.js"></script>
        <script src="js/script.js"></script>
    </body>
</html>

