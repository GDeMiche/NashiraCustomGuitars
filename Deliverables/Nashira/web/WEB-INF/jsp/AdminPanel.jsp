<%@page import="Bean.ChitarraAdmin"%>
<%@page import="DAO.ChitarraAdminDAO"%>
<%@page import="Bean.Chitarra"%>
<%@page import="DAO.ChitarraDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="DAO.UtenteDAO"%>
<%@page import="Bean.Utente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html class="wide wow-animation" lang="en">
    <head>
        <title>Nashira Admin Panel</title>
        <style>
            table, th, td {
                border: 1px solid black;
            }
        </style>
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

            <h5 align="center">Admin Panel</h5><br>
            <div>
                <h6><b>Lista Utenti</b></h6></br>
                <table align="center" style="width: 85%">
                    <%  UtenteDAO dao = new UtenteDAO();
                        ArrayList<Utente> utenti = dao.getAll();
                        if (utenti.size() != 0) {
                    %>
                    <tr>
                        <th>Email</th>  
                        <th>Nome</th>   
                        <th>Cognome</th>
                        <th>Indirizzo</th>
                        <th>Città</th>
                        <th>Zip</th>
                        <th>Esperto</th>
                        <th>Admin</th>
                    </tr>
                    <%
                        for (Utente utente : utenti) {
                    %>      
                    <tr>
                        <td><p><%=utente.getEmail()%></p></td>
                        <td><p><%=utente.getNome()%></p></td>
                        <td><p><%=utente.getCognome()%></p></td>
                        <td><p><%=utente.getIndirizzo()%></p></td>
                        <td><p><%=utente.getCitta()%></p></td>        
                        <td><p><%=utente.getZip()%></p></td>
                        <td><p><%if (utente.isEsperto() == true) {%>Si<%} else {%>No<%}%></p></td>
                        <td><p><%if (utente.isAdmin() == true) {%>Si<%} else {%>No<%}%></p></td>
                        <td><%if (utente.isEsperto() == false) {%>
                            <form action="./PromoEsperto" method="post">
                                <input type="hidden" name="email" value="<%=utente.getEmail()%>">
                                <input type="submit" value="Promuovi Esperto">
                            </form>
                            <%} else {%>
                            <form action="./RimuoviEsperto" method="post">
                                <input type="hidden" name="email" value="<%=utente.getEmail()%>">
                                <input type="submit" value="Rimuovi Esperto">
                            </form><%}%>
                        </td>
                        <td> 
                            <%if (utente.isAdmin() == false) {%>
                            <form action="./PromoAdmin" method="post">
                                <input type="hidden" name="email" value="<%=utente.getEmail()%>">
                                <input type="submit" value="Promuovi Admin">
                            </form>
                            <%} else {%>
                            <form action="./RimuoviAdmin" method="post">
                                <input type="hidden" name="email" value="<%=utente.getEmail()%>">
                                <input type="submit" value="Rimuovi Admin">
                            </form><%}%>
                        </td>    
                    </tr><%}
                    } else {%>  <p>Lista Utenti Vuota</p>  <%}%>
                </table>
                <br>
                <h6><b>Lista Chitarre</b></h6></br>
                <table align="center" style="width: 85%">
                    <%  ChitarraDAO cdao = new ChitarraDAO();
                        ArrayList<Chitarra> chitarre = cdao.getAllComprate();
                        if (chitarre.size() != 0) {
                    %>

                    <tr>
                        <th>Email</th>
                        <th>Nome</th>
                        <th>Corpo</th>
                        <th>Tastiera</th>
                        <th>Top</th>
                        <th>Pickup</th>
                        <th>Quantità</th>
                        <th>Prezzo</th>
                    </tr>
                    <%
                        for (Chitarra chitarra : chitarre) {
                    %>      
                    <tr>
                        <td><p><%=chitarra.getEmail()%></p></td>
                        <td><p><%=chitarra.getNome()%></p></td>
                        <td><p><%=chitarra.getCorpo()%></p></td>
                        <td><p><%=chitarra.getTastiera()%></p></td>
                        <td><p><%=chitarra.getTop()%></p></td>        
                        <td><p><%=chitarra.getPickup()%></p></td>
                        <td><p><%=chitarra.getQnt()%></p></td>
                        <td><p>&euro; <%=chitarra.getPrezzo()%></p></td>
                        <td>
                            <form action="./RimuoviChitarra" method="post">
                                <input type="hidden" name="idchit" value="<%=chitarra.getIdchitarra()%>">
                                <input type="submit" value="Chitarra Spedita">
                            </form>
                        </td>   
                    </tr><%}
                    } else {%>  <p>Lista Chitarre Vuota</p>  <%}%>
                </table>
                <br>
                <h6><b>Lista Basi Chitarre</b></h6></br>
                <table align="center" style="width: 85%">
                    <%  ChitarraAdminDAO cadao = new ChitarraAdminDAO();
                        ArrayList<ChitarraAdmin> chitarreadmin = cadao.getAll();
                        if (chitarreadmin.size() != 0) {
                    %>

                    <tr>
                        <th>Id Base</th>
                        <th>Nome</th>
                        <th>Descrizione</th>
                        <th>Prezzo</th>
                    </tr>
                    <%
                        for (ChitarraAdmin chitarraad : chitarreadmin) {
                    %>      
                    <tr>
                        <td style="width: 5%;"><p><%=chitarraad.getIdchitarradmin()%></p></td>
                        <td style="width: 8%;"><p><%=chitarraad.getNome()%></p></td>
                        <td><p><%=chitarraad.getDesc()%></p></td>
                        <td style="width: 7%;"><p>&euro; <%=chitarraad.getPrezzo()%></p></td>
                        <td style="width: 15%;">
                            <form action="./RimuoviChitarraAdmin" method="post">
                                <input type="hidden" name="idchitad" value="<%=chitarraad.getIdchitarradmin()%>">
                                <input type="submit" value="Rimuovi Base Chitarra">
                            </form>
                        </td>   
                    </tr><%}
                    } else {%>  <p>Lista Basi Chitarre Vuota</p>  <%}%>
                </table><br><br>

            </div>
            <script src="js/core.min.js"></script>
            <script src="js/script.js"></script>
    </body>
</html>

