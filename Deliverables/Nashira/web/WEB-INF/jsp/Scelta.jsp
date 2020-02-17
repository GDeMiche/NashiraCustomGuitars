<%-- 
    Document   : Scelta
    Created on : 9-gen-2020, 12.35.16
    Author     : LittleJoke
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html class="wide wow-animation" lang="en">
    <head>
        <title>Crea il tuo strumento</title>

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
                <%@include file="navbar.jsp" %>
            </header>
            <!-- Swiper-->


            <!-- Latest Projects-->
            <section class="section section-sm section-fluid bg-default text-center">
                <div class="container-fluid">
                    <h3 class="wow fadeInLeft">Crea il tuo strumento</h3>

                    <div class="row justify-content-center">

                        <div class="col-md-6 col-lg-5 col-xl-3 wow fadeInRight" data-wow-delay=".1s">
                            <!-- Team Classic-->
                            <article class="team-classic team-classic-lg"><a href="/tsw/Ribelle"><img src="images/ribellecat.jpg" alt="" width="250" height="420"/></a>
                                <div class="team-classic-caption">
                                    <h5 class="team-classic-name"><a href="/tsw/Ribelle">Ribelle</a></h5>
                                    <p class="team-classic-status">&euro; 690,00</p>
                                </div>
                            </article>
                        </div>
                        <div class="col-md-6 col-lg-5 col-xl-3 wow fadeInRight" data-wow-delay=".2s">
                            <!-- Team Classic-->
                            <article class="team-classic team-classic-lg"><a href="/tsw/Giannola"><img src="images/apollonia.png" alt="" width="185" height="420"/></a>
                                <div class="team-classic-caption">
                                    <h5 class="team-classic-name"><a href="/tsw/Giannola">Giannola</a></h5>
                                    <p class="team-classic-status">&euro; 1.390,00</p>
                                </div>
                            </article>
                        </div>
                        <div class="col-md-6 col-lg-5 col-xl-3 wow fadeInRight" data-wow-delay=".3s">
                            <!-- Team Classic-->
                            <article class="team-classic team-classic-lg"><a href="/tsw/las"><img src="images/sline.png" alt="" width="185" height="424"/></a>
                                <div class="team-classic-caption">
                                    <h5 class="team-classic-name"><a href="/tsw/las">La S</a></h5>
                                    <p class="team-classic-status">&euro; 1.190,00</p>
                                </div>
                            </article>
                        </div>
                    </div>
                    <%if (session.getAttribute("utente") != null) {
                        if (u.isAdmin() == true) {
                    %>
                    <div class="col-md-6 col-lg-5 col-xl-3 wow fadeInRight" data-wow-delay=".3s" >
                        <!-- Team Classic-->
                        <article class="team-classic team-classic-lg"><a href="/tsw/PaginaAggiungiChitarra"><img src="images/plus.png" alt="" width="185" height="424"/></a>
                            <div class="team-classic-caption">
                                <h5 class="team-classic-name"><a href="/tsw/PaginaAggiungiChitarra">Aggiungi Chitarra</a></h5>
                            </div>
                        </article>
                    </div>
                    <%}}%>
                </div>
            </section>
        </div>
        <!-- Javascript-->
        <script src="js/core.min.js"></script>
        <script src="js/script.js"></script>
        <!-- coded by Himic-->
    </body>
</html>
