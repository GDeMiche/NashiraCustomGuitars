<%-- 
    Document   : Giannola
    Created on : 9-gen-2020, 12.38.02
    Author     : LittleJoke
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html class="wide wow-animation" lang="en">
    <head>
        <title>Giannola</title>

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

            <!-- Latest Projects-->
            <section class="breadcrumbs-custom-inset">
                <div class="sceltafinestra context-dark bg-overlay-60">
                    <div class="container">
                        <h2 class="breadcrumbs-custom-title">Giannola</h2>
                        <ul class="breadcrumbs-custom-path">
                            <li><a href="./">Home</a></li>
                            <li><a href="./Scelta">Set chitarre</a></li>     
                            <li class="active">Giannola</li>
                        </ul>
                    </div>
                    <div class="box-position" style="background-image: url(images/sfondo.jpg);"></div>
                </div>
            </section>

            <!-- You dream — we embody-->
            <section class="section section-sm bg-default text-md-left">
                <div class="container">
                    <div class="row row-50 align-items-center justify-content-center justify-content-xl-between">
                        <div class="col-lg-6 col-xl-5 wow fadeInLeft">
                            <!-- Bootstrap tabs-->
                            <div class="tabs-custom tabs-horizontal tabs-line tabs-line-big text-center text-md-left" id="tabs-6">
                                <!-- Nav tabs-->
                                <ul class="nav nav-tabs">
                                    <li class="nav-item" role="presentation"><a class="nav-link nav-link-big active" href="#tabs-6-1" data-toggle="tab">01</a></li>
                                    <li class="nav-item" role="presentation"><a class="nav-link nav-link-big" href="#tabs-6-2" data-toggle="tab">02</a></li>
                                    <li class="nav-item" role="presentation"><a class="nav-link nav-link-big" href="#tabs-6-3" data-toggle="tab">03</a></li>
                                    <li class="nav-item" role="presentation"><a class="nav-link nav-link-big" href="#tabs-6-4" data-toggle="tab">04</a></li>
                                </ul>
                                <!-- Tab panes-->
                                <div class="tab-content">
                                    <div class="tab-pane fade show active" id="tabs-6-1">
                                        <h5 class="font-weight-normal">Corpo dello strumento</h5> 
                                        <br/>
                                        <a href="#" title="Frassino" onclick="frassino('a1', 'a2', 'b1', 'b2', 'c1', 'c11', 'c111', 'c1111', 'c2', 'c22', 'c222', 'c2222', 'c3', 'c33', 'c333', 'c3333', 'c4', 'c44', 'c444', 'c4444', 'cc1', 'cs1', 'sc1', 'ss1', 'cc2', 'cs2', 'sc2', 'ss2', 'cc3', 'cs3', 'sc3', 'ss3', 'cc4', 'cs4', 'sc4', 'ss4', 'cc11', 'cs11', 'sc11', 'ss11', 'cc22', 'cs22', 'sc22', 'ss22', 'cc33', 'cs33', 'sc33', 'ss33', 'cc44', 'cs44', 'sc44', 'ss44'); return false;">
                                            <img src="images/frassino.png" alt="" width="100" height="100"/></a>
                                        <a href="#" title="Palissandro" onclick="mogano('a1', 'a2', 'b1', 'b2', 'c1', 'c11', 'c111', 'c1111', 'c2', 'c2', 'c22', 'c222', 'c2222', 'c3', 'c33', 'c333', 'c3333', 'c4', 'c44', 'c444', 'c4444', 'cc1', 'cs1', 'sc1', 'ss1', 'cc2', 'cs2', 'sc2', 'ss2', 'cc3', 'cs3', 'sc3', 'ss3', 'cc4', 'cs4', 'sc4', 'ss4', 'cc11', 'cs11', 'sc11', 'ss11', 'cc22', 'cs22', 'sc22', 'ss22', 'cc33', 'cs33', 'sc33', 'ss33', 'cc44', 'cs44', 'sc44', 'ss44'); return false;">
                                            <img src="images/palissandro.png" alt="" width="100" height="100"/>
                                        </a>
                                        <div class="group-md group-middle">
                                        </div>
                                        <br/>
                                        <h5>&euro; 1390 </h5> 
                                    </div>
                                    <div class="tab-pane fade" id="tabs-6-2">
                                        <h5 class="font-weight-normal">Tastiera dello strumento</h5>
                                        <br/>
                                        <a href="#" title="Acero" onclick="acero('a1', 'a2', 'b1', 'b2', 'c1', 'c11', 'c111', 'c1111', 'c2', 'c22', 'c222', 'c2222', 'c3', 'c33', 'c333', 'c3333', 'c4', 'c44', 'c444', 'c4444', 'cc0', 'cc1', 'cc2', 'cc3', 'cc4', 'cc00', 'cc11', 'cc22', 'cc33', 'cc44', 'cs0', 'cs1', 'cs2', 'cs3', 'cs4', 'cs00', 'cs11', 'cs22', 'cs33', 'cs44', 'sc0', 'sc1', 'sc2', 'sc3', 'sc4', 'sc00', 'sc11', 'sc22', 'sc33', 'sc44', 'ss0', 'ss1', 'ss2', 'ss3', 'ss4', 'ss00', 'ss11', 'ss22', 'ss33', 'ss44'); return false;">
                                            <img src="images/acero.png" alt="" width="100" height="100"/></a>

                                        <a href="#" title="Palissandro" onclick="palissandro('a1', 'a2', 'b1', 'b2', 'c1', 'c11', 'c111', 'c1111', 'c2', 'c22', 'c222', 'c2222', 'c3', 'c33', 'c333', 'c3333', 'c4', 'c44', 'c444', 'c4444', 'cc0', 'cc1', 'cc2', 'cc3', 'cc4', 'cc00', 'cc11', 'cc22', 'cc33', 'cc44', 'cs0', 'cs1', 'cs2', 'cs3', 'cs4', 'cs00', 'cs11', 'cs22', 'cs33', 'cs44', 'sc0', 'sc1', 'sc2', 'sc3', 'sc4', 'sc00', 'sc11', 'sc22', 'sc33', 'sc44', 'ss0', 'ss1', 'ss2', 'ss3', 'ss4', 'ss00', 'ss11', 'ss22', 'ss33', 'ss44'); return false;">
                                            <img src="images/palissandro.png" alt="" width="100" height="100"/>
                                        </a>

                                        <div class="group-md group-middle"></div>
                                        <br/>
                                        <h5>&euro; 1390 </h5> 
                                    </div>
                                    <div class="tab-pane fade" id="tabs-6-3">
                                        <h5 class="font-weight-normal">Top dello strumento</h5>
                                        <br/>
                                        <a href="#" title="Acquamarina Burst" onclick="top1('a1', 'a2', 'b1', 'b2', 'c1', 'c11', 'c111', 'c1111', 'c2', 'c22', 'c222', 'c2222', 'c3', 'c33', 'c333', 'c3333', 'c4', 'c44', 'c444', 'c4444', 'cc1', 'cs1', 'sc1', 'ss1', 'cc2', 'cs2', 'sc2', 'ss2', 'cc3', 'cs3', 'sc3', 'ss3', 'cc4', 'cs4', 'sc4', 'ss4', 'cc11', 'cs11', 'sc11', 'ss11', 'cc22', 'cs22', 'sc22', 'ss22', 'cc33', 'cs33', 'sc33', 'ss33', 'cc44', 'cs44', 'sc44', 'ss44'); return false;">
                                            <img src="images/giannola/acquamarina.png" alt="" width="100" height="100"/></a>

                                        <a href="#" title="Black Red Yellow Burst" onclick="top2('a1', 'a2', 'b1', 'b2', 'c2', 'c22', 'c222', 'c2222', 'c1', 'c11', 'c111', 'c1111', 'c3', 'c33', 'c333', 'c3333', 'c4', 'c44', 'c444', 'c4444', 'cc2', 'cs2', 'sc2', 'ss2', 'cc1', 'cs1', 'sc1', 'ss1', 'cc3', 'cs3', 'sc3', 'ss3', 'cc4', 'cs4', 'sc4', 'ss4', 'cc11', 'cs11', 'sc11', 'ss11', 'cc22', 'cs22', 'sc22', 'ss22', 'cc33', 'cs33', 'sc33', 'ss33', 'cc44', 'cs44', 'sc44', 'ss44'); return false;">
                                            <img src="images/giannola/top2.png" alt="" width="100" height="100"/>
                                        </a>
                                        <a href="#" title="Green Burst" onclick="top3('a1', 'a2', 'b1', 'b2', 'c3', 'c33', 'c333', 'c3333', 'c1', 'c11', 'c111', 'c1111', 'c2', 'c22', 'c222', 'c2222', 'c4', 'c44', 'c444', 'c4444', 'cc1', 'cs1', 'sc1', 'ss1', 'cc2', 'cs2', 'sc2', 'ss2', 'cc3', 'cs3', 'sc3', 'ss3', 'cc4', 'cs4', 'sc4', 'ss4', 'cc11', 'cs11', 'sc11', 'ss11', 'cc22', 'cs22', 'sc22', 'ss22', 'cc33', 'cs33', 'sc33', 'ss33', 'cc44', 'cs44', 'sc44', 'ss44'); return false;">
                                            <img src="images/giannola/top3.png" alt="" width="100" height="100"/>
                                        </a>
                                        <a href="#" title="Transparent Purple" onclick="top4('a1', 'a2', 'b1', 'b2', 'c3', 'c33', 'c333', 'c3333', 'c1', 'c11', 'c111', 'c1111', 'c2', 'c22', 'c222', 'c2222', 'c4', 'c44', 'c444', 'c4444', 'cc1', 'cs1', 'sc1', 'ss1', 'cc2', 'cs2', 'sc2', 'ss2', 'cc3', 'cs3', 'sc3', 'ss3', 'cc4', 'cs4', 'sc4', 'ss4', 'cc11', 'cs11', 'sc11', 'ss11', 'cc22', 'cs22', 'sc22', 'ss22', 'cc33', 'cs33', 'sc33', 'ss33', 'cc44', 'cs44', 'sc44', 'ss44'); return false;">
                                            <img src="images/giannola/top4.png" alt="" width="100" height="100"/>
                                        </a>
                                        <br/> 

                                        <div class="group-md group-middle"></div>
                                        <br/>
                                        <h5>&euro; 1390 </h5> 
                                    </div>
                                    <div class="tab-pane fade" id="tabs-6-4">
                                        <h5 class="font-weight-normal">Pickup dello strumento</h5>

                                        <a href="#" title="Rivale" onclick="vortex1('a1', 'a2', 'b1', 'b2', 'c1', 'c11', 'c111', 'c1111', 'c2', 'c22', 'c222', 'c2222', 'c3', 'c33', 'c333', 'c3333', 'c4', 'c44', 'c444', 'c4444', 'cc1', 'cs1', 'sc1', 'ss1', 'cc2', 'cs2', 'sc2', 'ss2', 'cc3', 'cs3', 'sc3', 'ss3', 'cc4', 'cs4', 'sc4', 'ss4', 'cc0', 'cs0', 'sc0', 'ss0', 'cc11', 'cs11', 'sc11', 'ss11', 'cc22', 'cs22', 'sc22', 'ss22', 'cc33', 'cs33', 'sc33', 'ss33', 'cc44', 'cs44', 'sc44', 'ss44', 'cc00', 'cs00', 'sc00', 'ss00'); return false;">
                                            <img src="images/vortex1.png" alt="" width="100" height="100"/></a>

                                        <a href="#" title="California" onclick="vortex2('a1', 'a2', 'b1', 'b2', 'c2', 'c22', 'c222', 'c2222', 'c1', 'c11', 'c111', 'c1111', 'c3', 'c33', 'c333', 'c3333', 'c4', 'c44', 'c444', 'c4444', 'cc11', 'cs11', 'sc11', 'ss11', 'cc22', 'cs22', 'sc22', 'ss22', 'cc33', 'cs33', 'sc33', 'ss33', 'cc44', 'cs44', 'sc44', 'ss44', 'cc00', 'cs00', 'sc00', 'ss00', 'cc1', 'cs1', 'sc1', 'ss1', 'cc2', 'cs2', 'sc2', 'ss2', 'cc3', 'cs3', 'sc3', 'ss3', 'cc4', 'cs4', 'sc4', 'ss4', 'cc0', 'cs0', 'sc0', 'ss0'); return false;">
                                            <img src="images/vortex2.png" alt="" width="100" height="100"/>
                                        </a>

                                        <script type="text/javascript">
                                            var nome;
                                            var corpo;
                                            var tastiera;
                                            var top;
                                            var pickup;
                                            
                                            function setAttrChit(c1, cc11, c11, cs11, c111, sc11, c1111, ss11, c2, cc22, c22, cs22, c222, sc22, c2222, ss22, c3, cc33, c33, cs33, c333, sc33, c3333, ss33, c4, cc44, c44, cs44, c444, sc44, c4444, ss44) {

                                                //Prima chitarra
                                                if (document.getElementById(c1).style.display == 'block') {
                                                    document.getElementById("nome").value = "Giannola";
                                                    document.getElementById("corpo").value = "Frassino";
                                                    document.getElementById("tastiera").value = "Acero";
                                                    document.getElementById("top").value = "Acquamarina Burst";
                                                    document.getElementById("pickup").value = "Rivale";
                                                }
                                                if (document.getElementById(cc11).style.display == 'block') {
                                                    document.getElementById("nome").value = "Giannola";
                                                    document.getElementById("corpo").value = "Frassino";
                                                    document.getElementById("tastiera").value = "Acero";
                                                    document.getElementById("top").value = "Acquamarina Burst";
                                                    document.getElementById("pickup").value = "California";
                                                }
                                                if (document.getElementById(c11).style.display == 'block') {
                                                    document.getElementById("nome").value = "Giannola";
                                                    document.getElementById("corpo").value = "Frassino";
                                                    document.getElementById("tastiera").value = "Palissandro";
                                                    document.getElementById("top").value = "Acquamarina Burst";
                                                    document.getElementById("pickup").value = "Rivale";
                                                }
                                                if (document.getElementById(cs11).style.display == 'block') {
                                                    document.getElementById("nome").value = "Giannola";
                                                    document.getElementById("corpo").value = "Frassino";
                                                    document.getElementById("tastiera").value = "Palissandro";
                                                    document.getElementById("top").value = "Acquamarina Burst";
                                                    document.getElementById("pickup").value = "California";
                                                }
                                                if (document.getElementById(c111).style.display == 'block') {
                                                    document.getElementById("nome").value = "Giannola";
                                                    document.getElementById("corpo").value = "Mogano";
                                                    document.getElementById("tastiera").value = "Acero";
                                                    document.getElementById("top").value = "Acquamarina Burst";
                                                    document.getElementById("pickup").value = "Rivale";
                                                }
                                                if (document.getElementById(sc11).style.display == 'block') {
                                                    document.getElementById("nome").value = "Giannola";
                                                    document.getElementById("corpo").value = "Mogano";
                                                    document.getElementById("tastiera").value = "Acero";
                                                    document.getElementById("top").value = "Acquamarina Burst";
                                                    document.getElementById("pickup").value = "California";
                                                }
                                                if (document.getElementById(c1111).style.display == 'block') {
                                                    document.getElementById("nome").value = "Giannola";
                                                    document.getElementById("corpo").value = "Mogano";
                                                    document.getElementById("tastiera").value = "Palissandro";
                                                    document.getElementById("top").value = "Acquamarina Burst";
                                                    document.getElementById("pickup").value = "Rivale";
                                                }
                                                if (document.getElementById(ss11).style.display == 'block') {
                                                    document.getElementById("nome").value = "Giannola";
                                                    document.getElementById("corpo").value = "Mogano";
                                                    document.getElementById("tastiera").value = "Palissandro";
                                                    document.getElementById("top").value = "Acquamarina Burstn";
                                                    document.getElementById("pickup").value = "California";
                                                }

                                                //Seconda chitarra
                                                if (document.getElementById(c2).style.display == 'block') {
                                                    document.getElementById("nome").value = "Giannola";
                                                    document.getElementById("corpo").value = "Frassino";
                                                    document.getElementById("tastiera").value = "Acero";
                                                    document.getElementById("top").value = "Black Red Yellow Burst";
                                                    document.getElementById("pickup").value = "Rivale";
                                                }
                                                if (document.getElementById(cc22).style.display == 'block') {
                                                    document.getElementById("nome").value = "Giannola";
                                                    document.getElementById("corpo").value = "Frassino";
                                                    document.getElementById("tastiera").value = "Acero";
                                                    document.getElementById("top").value = "Black Red Yellow Burst";
                                                    document.getElementById("pickup").value = "California";
                                                }
                                                if (document.getElementById(c22).style.display == 'block') {
                                                    document.getElementById("nome").value = "Giannola";
                                                    document.getElementById("corpo").value = "Frassino";
                                                    document.getElementById("tastiera").value = "Palissandro";
                                                    document.getElementById("top").value = "Black Red Yellow Burst";
                                                    document.getElementById("pickup").value = "Rivale";
                                                }
                                                if (document.getElementById(cs22).style.display == 'block') {
                                                    document.getElementById("nome").value = "Giannola";
                                                    document.getElementById("corpo").value = "Frassino";
                                                    document.getElementById("tastiera").value = "Palissandro";
                                                    document.getElementById("top").value = "Black Red Yellow Burst";
                                                    document.getElementById("pickup").value = "California";
                                                }
                                                if (document.getElementById(c2222).style.display == 'block') {
                                                    document.getElementById("nome").value = "Giannola";
                                                    document.getElementById("corpo").value = "Mogano";
                                                    document.getElementById("tastiera").value = "Acero";
                                                    document.getElementById("top").value = "Black Red Yellow Burst";
                                                    document.getElementById("pickup").value = "Rivale";
                                                }
                                                if (document.getElementById(sc22).style.display == 'block') {
                                                    document.getElementById("nome").value = "Giannola";
                                                    document.getElementById("corpo").value = "Mogano";
                                                    document.getElementById("tastiera").value = "Acero";
                                                    document.getElementById("top").value = "Black Red Yellow Burst";
                                                    document.getElementById("pickup").value = "California";
                                                }
                                                if (document.getElementById(c222).style.display == 'block') {
                                                    document.getElementById("nome").value = "Giannola";
                                                    document.getElementById("corpo").value = "Mogano";
                                                    document.getElementById("tastiera").value = "Palissandro";
                                                    document.getElementById("top").value = "Black Red Yellow Burst";
                                                    document.getElementById("pickup").value = "Rivale";
                                                }
                                                if (document.getElementById(ss22).style.display == 'block') {
                                                    document.getElementById("nome").value = "Giannola";
                                                    document.getElementById("corpo").value = "Mogano";
                                                    document.getElementById("tastiera").value = "Palissandro";
                                                    document.getElementById("top").value = "Black Red Yellow Burst";
                                                    document.getElementById("pickup").value = "California";
                                                }

                                                //Terza chitarra
                                                if (document.getElementById(c3).style.display == 'block') {
                                                    document.getElementById("nome").value = "Giannola";
                                                    document.getElementById("corpo").value = "Frassino";
                                                    document.getElementById("tastiera").value = "Acero";
                                                    document.getElementById("top").value = "Green Burst";
                                                    document.getElementById("pickup").value = "Rivale";
                                                }
                                                if (document.getElementById(cc33).style.display == 'block') {
                                                    document.getElementById("nome").value = "Giannola";
                                                    document.getElementById("corpo").value = "Frassino";
                                                    document.getElementById("tastiera").value = "Acero";
                                                    document.getElementById("top").value = "Green Burst";
                                                    document.getElementById("pickup").value = "California";
                                                }
                                                if (document.getElementById(c33).style.display == 'block') {
                                                    document.getElementById("nome").value = "Giannola";
                                                    document.getElementById("corpo").value = "Frassino";
                                                    document.getElementById("tastiera").value = "Palissandro";
                                                    document.getElementById("top").value = "Green Burst";
                                                    document.getElementById("pickup").value = "Rivale";
                                                }
                                                if (document.getElementById(cs33).style.display == 'block') {
                                                    document.getElementById("nome").value = "Giannola";
                                                    document.getElementById("corpo").value = "Frassino";
                                                    document.getElementById("tastiera").value = "Palissandro";
                                                    document.getElementById("top").value = "Green Burst";
                                                    document.getElementById("pickup").value = "California";
                                                }
                                                if (document.getElementById(c3333).style.display == 'block') {
                                                    document.getElementById("nome").value = "Giannola";
                                                    document.getElementById("corpo").value = "Mogano";
                                                    document.getElementById("tastiera").value = "Acero";
                                                    document.getElementById("top").value = "Green Burst";
                                                    document.getElementById("pickup").value = "Rivale";
                                                }
                                                if (document.getElementById(sc33).style.display == 'block') {
                                                    document.getElementById("nome").value = "Giannola";
                                                    document.getElementById("corpo").value = "Mogano";
                                                    document.getElementById("tastiera").value = "Acero";
                                                    document.getElementById("top").value = "Green Burst";
                                                    document.getElementById("pickup").value = "California";
                                                }
                                               
                                                if (document.getElementById(c333).style.display == 'block') {
                                                    document.getElementById("nome").value = "Giannola";
                                                    document.getElementById("corpo").value = "Mogano";
                                                    document.getElementById("tastiera").value = "Palissandro";
                                                    document.getElementById("top").value = "Green Burst";
                                                    document.getElementById("pickup").value = "Rivale";
                                                }
                                                if (document.getElementById(ss33).style.display == 'block') {
                                                    document.getElementById("nome").value = "Giannola";
                                                    document.getElementById("corpo").value = "Mogano";
                                                    document.getElementById("tastiera").value = "Palissandro";
                                                    document.getElementById("top").value = "Green Burst";
                                                    document.getElementById("pickup").value = "California";
                                                }

                                                //Quarta chitarra
                                                if (document.getElementById(c4).style.display == 'block') {
                                                    document.getElementById("nome").value = "Giannola";
                                                    document.getElementById("corpo").value = "Frassino";
                                                    document.getElementById("tastiera").value = "Acero";
                                                    document.getElementById("top").value = "Transparent Purple";
                                                    document.getElementById("pickup").value = "Rivale";
                                                }
                                                if (document.getElementById(cc44).style.display == 'block') {
                                                    document.getElementById("nome").value = "Giannola";
                                                    document.getElementById("corpo").value = "Frassino";
                                                    document.getElementById("tastiera").value = "Acero";
                                                    document.getElementById("top").value = "Transparent Purple";
                                                    document.getElementById("pickup").value = "California";
                                                }
                                                if (document.getElementById(c44).style.display == 'block') {
                                                    document.getElementById("nome").value = "Giannola";
                                                    document.getElementById("corpo").value = "Frassino";
                                                    document.getElementById("tastiera").value = "Palissandro";
                                                    document.getElementById("top").value = "Transparent Purple";
                                                    document.getElementById("pickup").value = "Rivale";
                                                }
                                                if (document.getElementById(cs44).style.display == 'block') {
                                                    document.getElementById("nome").value = "Giannola";
                                                    document.getElementById("corpo").value = "Frassino";
                                                    document.getElementById("tastiera").value = "Palissandro";
                                                    document.getElementById("top").value = "Transparent Purple";
                                                    document.getElementById("pickup").value = "California";
                                                }
                                                if (document.getElementById(c4444).style.display == 'block') {
                                                    document.getElementById("nome").value = "Giannola";
                                                    document.getElementById("corpo").value = "Mogano";
                                                    document.getElementById("tastiera").value = "Acero";
                                                    document.getElementById("top").value = "Transparent Purple";
                                                    document.getElementById("pickup").value = "Rivale";
                                                }
                                                if (document.getElementById(sc44).style.display == 'block') {
                                                    document.getElementById("nome").value = "Giannola";
                                                    document.getElementById("corpo").value = "Mogano";
                                                    document.getElementById("tastiera").value = "Acero";
                                                    document.getElementById("top").value = "Transparent Purple";
                                                    document.getElementById("pickup").value = "California";
                                                }
                                                if (document.getElementById(c444).style.display == 'block') {
                                                    document.getElementById("nome").value = "Giannola";
                                                    document.getElementById("corpo").value = "Mogano";
                                                    document.getElementById("tastiera").value = "Palissandro";
                                                    document.getElementById("top").value = "Transparent Purple";
                                                    document.getElementById("pickup").value = "Rivale";
                                                }
                                                if (document.getElementById(ss44).style.display == 'block') {
                                                    document.getElementById("nome").value = "Giannola";
                                                    document.getElementById("corpo").value = "Mogano";
                                                    document.getElementById("tastiera").value = "Palissandro";
                                                    document.getElementById("top").value = "Transparent Purple";
                                                    document.getElementById("pickup").value = "California";
                                                }
                                            }
                                        </script>

                                        <div class="group-md group-middle">
                                            <form action="./CarrelloServ" method="post">
                                                <input type="hidden" id="nome" name="nome"/>
                                                <input type="hidden" id="corpo" name="corpo"/>
                                                <input type="hidden" id="tastiera" name="tastiera"/>
                                                <input type="hidden" id="top" name="top"/>
                                                <input type="hidden" id="pickup" name="pickup"/>
                                                <input type="hidden" id="prezzo" value="1390" name="prezzo"/>
                                                <input type="number" id="qnt"  min="1" value="1" name="qnt"/>
                                                <input style="background-color: red;" value="Aggiungi al Carrello" type="submit" onclick="setAttrChit('c1', 'cc11', 'c11', 'cs11', 'c111', 'sc11', 'c1111', 'ss11', 'c2', 'cc22', 'c22', 'cs22', 'c222', 'sc22', 'c2222', 'ss22', 'c3', 'cc33', 'c33', 'cs33', 'c333', 'sc33', 'c3333', 'ss33', 'c4', 'cc44', 'c44', 'cs44', 'c444', 'sc44', 'c4444', 'ss44')"  class="button button-secondary button-pipaluk">
                                            </form>


                                        </div>
                                        <br/>
                                        <h5>&euro; 1390 </h5> 
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-6 text-center wow fadeInUp" data-wow-delay=".1s">
                            <span id="a2" style="display: none;">
                                <img src="images/giannola/chitarra3.png" alt="" width="556" height="434"/>
                            </span>
                            <span id="a1" style="display: block;">
                                <img src="images/giannola/chitarra1.png" alt="" width="556" height="434"/>
                            </span>
                            <span id="b1" style="display: none;">
                                <img src="images/giannola/chitarra2.png" alt="" width="556" height="434"/>
                            </span>
                            <span id="b2" style="display: none;">
                                <img src="images/giannola/chitarra4.png" alt="" width="556" height="434"/>
                            </span>

                            <span id="c1" style="display: none;">
                                <img src="images/giannola/c1.png" alt="" width="556" height="434"/>
                            </span>
                            <span id="c2" style="display: none;">
                                <img src="images/giannola/c2.png" alt="" width="556" height="434"/>
                            </span>
                            <span id="c3" style="display: none;">
                                <img src="images/giannola/c3.png" alt="" width="556" height="434"/>
                            </span>
                            <span id="c4" style="display: none;">
                                <img src="images/giannola/c4.png" alt="" width="556" height="434"/>
                            </span>


                            <span id="c11" style="display: none;">
                                <img src="images/giannola/c11.png" alt="" width="556" height="434"/>
                            </span>
                            <span id="c22" style="display: none;">
                                <img src="images/giannola/c22.png" alt="" width="556" height="434"/>
                            </span>
                            <span id="c33" style="display: none;">
                                <img src="images/giannola/c33.png" alt="" width="556" height="434"/>
                            </span>
                            <span id="c44" style="display: none;">
                                <img src="images/giannola/c44.png" alt="" width="556" height="434"/>
                            </span>


                            <span id="c111" style="display: none;">
                                <img src="images/giannola/c1111.png" alt="" width="556" height="434"/>
                            </span>
                            <span id="c222" style="display: none;">
                                <img src="images/giannola/c222.png" alt="" width="556" height="434"/>
                            </span>
                            <span id="c333" style="display: none;">
                                <img src="images/giannola/c333.png" alt="" width="556" height="434"/>
                            </span>
                            <span id="c444" style="display: none;">
                                <img src="images/giannola/c444.png" alt="" width="556" height="434"/>
                            </span>


                            <span id="c1111" style="display: none;">
                                <img src="images/giannola/c111.png" alt="" width="556" height="434"/>
                            </span>
                            <span id="c2222" style="display: none;">
                                <img src="images/giannola/c2222.png" alt="" width="556" height="434"/>
                            </span>
                            <span id="c3333" style="display: none;">
                                <img src="images/giannola/c3333.png" alt="" width="556" height="434"/>
                            </span>
                            <span id="c4444" style="display: none;">
                                <img src="images/giannola/c4444.png" alt="" width="556" height="434"/>
                            </span>

                            <span id="cc0" style="display: none;">
                                <img src="images/giannola/chitarra1.png" alt="" width="556" height="434"/>
                            </span>
                            <span id="cs0" style="display: none;">
                                <img src="images/giannola/chitarra2.png" alt="" width="556" height="434"/>
                            </span>
                            <span id="sc0" style="display: none;">
                                <img src="images/giannola/chitarra3.png" alt="" width="556" height="434"/>
                            </span>
                            <span id="ss0" style="display: none;">
                                <img src="images/giannola/chitarra4.png" alt="" width="556" height="434"/>
                            </span>

                            <span id="cc00" style="display: none;">
                                <img src="images/giannola/cc00.png" alt="" width="556" height="434"/>
                            </span>
                            <span id="cs00" style="display: none;">
                                <img src="images/giannola/cs00.png" alt="" width="556" height="434"/>
                            </span>
                            <span id="sc00" style="display: none;">
                                <img src="images/giannola/sc00.png" alt="" width="556" height="434"/>
                            </span>
                            <span id="ss00" style="display: none;">
                                <img src="images/giannola/ss00.png" alt="" width="556" height="434"/>
                            </span>

                            <span id="cc1" style="display: none;">
                                <img src="images/giannola/c1.png" alt="" width="556" height="434"/>
                            </span>
                            <span id="cs1" style="display: none;">
                                <img src="images/giannola/c11.png" alt="" width="556" height="434"/>
                            </span>
                            <span id="sc1" style="display: none;">
                                <img src="images/giannola/c111.png" alt="" width="556" height="434"/>
                            </span>
                            <span id="ss1" style="display: none;">
                                <img src="images/giannola/c1111.png" alt="" width="556" height="434"/>
                            </span>

                            <span id="cc11" style="display: none;">
                                <img src="images/giannola/cc11.png" alt="" width="556" height="434"/>
                            </span>
                            <span id="cs11" style="display: none;">
                                <img src="images/giannola/cs11.png" alt="" width="556" height="434"/>
                            </span>
                            <span id="sc11" style="display: none;">
                                <img src="images/giannola/sc11.png" alt="" width="556" height="434"/>
                            </span>
                            <span id="ss11" style="display: none;">
                                <img src="images/giannola/ss11.png" alt="" width="556" height="434"/>
                            </span>

                            <span id="cc2" style="display: none;">
                                <img src="images/giannola/c2.png" alt="" width="556" height="434"/>
                            </span>
                            <span id="cs2" style="display: none;">
                                <img src="images/giannola/c22.png" alt="" width="556" height="434"/>
                            </span>
                            <span id="sc2" style="display: none;">
                                <img src="images/giannola/c2222.png" alt="" width="556" height="434"/>
                            </span>
                            <span id="ss2" style="display: none;">
                                <img src="images/giannola/c222.png" alt="" width="556" height="434"/>
                            </span>

                            <span id="cc22" style="display: none;">
                                <img src="images/giannola/cc22.png" alt="" width="556" height="434"/>
                            </span>
                            <span id="cs22" style="display: none;">
                                <img src="images/giannola/cs22.png" alt="" width="556" height="434"/>
                            </span>
                            <span id="sc22" style="display: none;">
                                <img src="images/giannola/sc22.png" alt="" width="556" height="434"/>
                            </span>
                            <span id="ss22" style="display: none;">
                                <img src="images/giannola/ss22.png" alt="" width="556" height="434"/>
                            </span>

                            <span id="cc3" style="display: none;">
                                <img src="images/giannola/c3.png" alt="" width="556" height="434"/>
                            </span>
                            <span id="cs3" style="display: none;">
                                <img src="images/giannola/c33.png" alt="" width="556" height="434"/>
                            </span>
                            <span id="sc3" style="display: none;">
                                <img src="images/giannola/c3333.png" alt="" width="556" height="434"/>
                            </span>
                            <span id="ss3" style="display: none;">
                                <img src="images/giannola/c333.png" alt="" width="556" height="434"/>
                            </span>

                            <span id="cc33" style="display: none;">
                                <img src="images/giannola/cc33.png" alt="" width="556" height="434"/>
                            </span>
                            <span id="cs33" style="display: none;">
                                <img src="images/giannola/cs33.png" alt="" width="556" height="434"/>
                            </span>
                            <span id="sc33" style="display: none;">
                                <img src="images/giannola/sc33.png" alt="" width="556" height="434"/>
                            </span>
                            <span id="ss33" style="display: none;">
                                <img src="images/giannola/ss33.png" alt="" width="556" height="434"/>
                            </span>

                            <span id="cc4" style="display: none;">
                                <img src="images/giannola/c4.png" alt="" width="556" height="434"/>
                            </span>
                            <span id="cs4" style="display: none;">
                                <img src="images/giannola/c44.png" alt="" width="556" height="434"/>
                            </span>
                            <span id="sc4" style="display: none;">
                                <img src="images/giannola/c4444.png" alt="" width="556" height="434"/>
                            </span>
                            <span id="ss4" style="display: none;">
                                <img src="images/giannola/c444.png" alt="" width="556" height="434"/>
                            </span>

                            <span id="cc44" style="display: none;">
                                <img src="images/giannola/cc44.png" alt="" width="556" height="434"/>
                            </span>
                            <span id="cs44" style="display: none;">
                                <img src="images/giannola/cs44.png" alt="" width="556" height="434"/>
                            </span>
                            <span id="sc44" style="display: none;">
                                <img src="images/giannola/sc44.png" alt="" width="556" height="434"/>
                            </span>
                            <span id="ss44" style="display: none;">
                                <img src="images/giannola/ss44.png" alt="" width="556" height="434"/>
                            </span>

                        </div>
                    </div>
                </div>
            </section>
        </div>
        <!-- Javascript-->
        <script src="js/core.min.js"></script>
        <script src="js/script.js"></script>
        <script src="js/Giannola.js"></script>
    </body>
</html>
