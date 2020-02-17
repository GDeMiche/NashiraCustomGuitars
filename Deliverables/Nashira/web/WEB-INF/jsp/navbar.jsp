<%-- 
    Document   : navbar
    Created on : 10-gen-2020, 10.47.30
    Author     : LittleJoke
--%>

<%@page import="Bean.Carrello"%>
<%@page import="Bean.Utente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%Utente u = (Utente) session.getAttribute("utente");%>



<!DOCTYPE html>
<html>
    <div class="rd-navbar-wrap">
        <nav class="rd-navbar rd-navbar-classic" data-layout="rd-navbar-fixed" data-sm-layout="rd-navbar-fixed" data-md-layout="rd-navbar-fixed" data-md-device-layout="rd-navbar-fixed" data-lg-layout="rd-navbar-static" data-lg-device-layout="rd-navbar-fixed" data-xl-layout="rd-navbar-static" data-xl-device-layout="rd-navbar-static" data-xxl-layout="rd-navbar-static" data-xxl-device-layout="rd-navbar-static" data-lg-stick-up-offset="46px" data-xl-stick-up-offset="46px" data-xxl-stick-up-offset="46px" data-lg-stick-up="true" data-xl-stick-up="true" data-xxl-stick-up="true">
            <div class="rd-navbar-main-outer">
                <div class="rd-navbar-main">
                    <!-- RD Navbar Panel-->
                    <div class="rd-navbar-panel">
                        <!-- RD Navbar Toggle-->
                        <button class="rd-navbar-toggle" data-rd-navbar-toggle=".rd-navbar-nav-wrap"><span></span></button>
                        <!-- Logo-->
                        <div class="rd-navbar-brand"><a href="./" ><img src="images/logo.png" alt="" width="229" height="43"/></a></div>
                    </div>
                    <!-- Menu-->
                    <div class="rd-navbar-main-element">
                        <div class="rd-navbar-nav-wrap">
                            <!--Link-->

                            <li class="rd-nav-item"><a class="rd-nav-link" href="/tsw/">Home</a></li>
                            <li class="rd-nav-item"><a class="rd-nav-link" href="/tsw/Scelta">Crea la tua chitarra</a></li>
                                <%
                                    if (session.getAttribute("utente") == null) {
                                %>
                            <li class="rd-nav-item"><a class="rd-nav-link" href="/tsw/PaginaRegistrazione">Registrati</a></li> 
                            <li class="rd-nav-item"><a class="rd-nav-link" href="/tsw/PaginaLogin">Login</a></li>   
                                <%} else { %>       
                            <li class="rd-nav-item"><a class="rd-nav-link" href="/tsw/AssistenzaServ">Assistenza</a></li>
                            <li class="rd-nav-item"><a class="rd-nav-link" href="/tsw/Profilo">Profilo</a></li>
                            <li class="rd-nav-item"><a class="rd-nav-link" href="/tsw/Logout">Logout</a></li>
                            <li class="rd-nav-item"><a class="rd-nav-link" href="/tsw/CarrelloServ"> <img src="images/cart.jpg" height="50%" width="50%" alt="Carrello" /></a></li>
                                    <%}
                                        if (session.getAttribute("utente") != null) {
                                            if (u.isAdmin() == true) {
                                    %>
                            <li class="rd-nav-item"><a class="rd-nav-link" href="/tsw/AdminPanel">Pannello Admin</a></li>
                                <%		}
                                    }
                                %>          
                        </div>
                    </div>
                </div>
            </div>
        </nav>
    </div>
</html>
