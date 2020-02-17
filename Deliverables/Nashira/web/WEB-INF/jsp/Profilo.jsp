<%-- 
    Document   : login
    Created on : 13-gen-2020, 12.07.43
    Author     : LittleJoke
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html class="wide wow-animation" lang="en">
    <head>
        <title>Nashira Profilo Utente</title>

        <meta name="viewport" content="width=device-width, height=device-height, initial-scale=1.0, maximum-scale=1.0, user-scalable=0">
        <meta charset="utf-8">
        <link rel="icon" href="images/icon.ico" type="image/x-icon">
        <!-- Stylesheets-->
        <link rel="stylesheet" href="css/bootstrap.css">
        <link rel="stylesheet" href="css/fonts.css">
        <link rel="stylesheet" href="css/style.css">
        <script type="text/javascript">
            function password() {
                var x = document.getElementById("myInput");
                if (x.type === "password") {
                    x.type = "text";
                } else {
                    x.type = "password";
                }
            }
        </script>

    </head>
    <body>

        <div class="page">

            <!-- Page Header-->
            <header class="section page-header">
                <!-- RD Navbar-->
                <%@include file="navbar.jsp" %>
            </header>

            <section class="section section-sm section-first bg-default text-left">
                <div class="container">
                    <div class="row row-40 flex-lg-row-reverse justify-content-xl-between">
                        <div class="col-xl-5 d-none d-xl-block">
                            <div class="offset-left-xl-45">
                                <form action="./PaginaModificaProfilo" method="post"> 
                                    <h6  style="color: gray;">Email</h6><br>
                                    <h5></h5>
                                    <h5><em><%=u.getEmail()%></em></h5>
                                    <br/>  
                                    <h6  style="color: gray;">Password</h6><br>
                                    <input readonly="readonly" type="password" class="form-control my-input" value="<%=u.getPassword()%>" id="myInput">
                                    <br/>
                                    <input type="checkbox"  onclick="password()"> Mostra password
                                    <br/><p>Visualizza i prodotti nel tuo <a href="./CarrelloServ">Carrello</a>!</p>
                                    <br/>
                                    <div class="text-center ">
                                        <button type="submit" value="Modifica" class=" btn btn-block send-button tx-tfm" style="background: #FFEBCD">Modifica i tuoi dati </button>
                                    </div>
                            </div>
                        </div>
                        <div class="col-xl-7">
                            <ul class="list-xl box-typography">
                                <li>
                                    <h3 style="color: gray;" class="text-spacing-25 font-weight-normal title-opacity-9">Ciao <%=u.getCognome()%> <%=u.getNome()%>!</h3>
                                </li>
                                <li>
                                    <h6  style="color: gray;">Nome</h6>
                                    <h5><%=u.getNome()%></h5>
                                </li>
                                <li>
                                    <h6  style="color: gray;">Cognome</h6>
                                    <h5><%=u.getCognome()%></h5>
                                </li>
                                <li>
                                    <h6  style="color: gray;">Indirizzo</h6>
                                    <h5><%=u.getIndirizzo()%></h5>
                                </li>
                                <li>
                                    <h6  style="color: gray;">Citta'</h6>
                                    <h5><%=u.getCitta()%></h5>
                                </li>
                                <li>
                                    <h6  style="color: gray;">ZIP Code</h6>
                                    <h5><%=u.getZip()%></h5>
                                </li>
                            </ul>
                        </div>
                        </form>
                    </div>
                </div>
            </section>

        </div>
        <script src="js/core.min.js"></script>
        <script src="js/script.js"></script>
    </body>
</html>

