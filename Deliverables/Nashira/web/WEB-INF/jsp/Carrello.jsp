<%-- 
    Document   : Carrello
    Created on : 13-gen-2020, 12.08.01
    Author     : LittleJoke
--%>

<%@page import="DAO.ChitarraDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html class="wide wow-animation" lang="en">
    <head>
        <style>
            table, th, td {
                border: 1px solid black;
            }
        </style>
        <title>Nashira Carrello Utente</title>

        <meta name="viewport" content="width=device-width, height=device-height, initial-scale=1.0, maximum-scale=1.0, user-scalable=0">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta charset="utf-8">
        <link rel="icon" href="images/icon.ico" type="image/x-icon">
        <!-- Stylesheets-->
        <link rel="stylesheet" href="css/bootstrap.css">
        <link rel="stylesheet" href="css/fonts.css">
        <link rel="stylesheet" href="css/style.css">

        <script>
            $(document).ready(function () {
                var sum = 0;
                var a = document.getElementsById("prezzo");
                var qnt = document.getElementsById("qnt");
                var i;
                for (i = 0; i < a.length; i++) {
                    sum = (parseFloat(a[i].value) * qnt[i].value) + sum;
                    console.log(sum.valueOf());
                }
                $("#prezzoTot").html(sum.valueOf());
            });
        </script>
    </head>
    <body>

        <div class="page">

            <!-- Page Header-->
            <header class="section page-header">
                <!-- RD Navbar-->
                <%@include file="navbar.jsp" %>
            </header>

            <%@ page import="Bean.Utente" %>
            <%@ page import="Bean.Carrello" %>
            <%@ page import="Bean.Chitarra" %>
            <%  ChitarraDAO cdao = new ChitarraDAO();
                Carrello cart = (Carrello) session.getAttribute("cart");
                ArrayList<Chitarra> lista = cdao.getByEmailNonComprate(u.getEmail());
                cart.setListaChitarre(lista);
            %>

            <%  if (lista.size() > 0) { %>
            <h5 align="center">Checkout Carrello</h5><br>

            <div id="carrello">
                <table align="center" style="width: 85%">
                    <tr>
                        <th>Nome</th>
                        <th>Corpo</th>
                        <th>Tastiera</th>
                        <th>Top</th>
                        <th>Pickup</th>
                        <th>Quantità</th> 
                        <th>Prezzo</th> 
                    </tr>
                    <%
                        for (Chitarra chit : cdao.getByEmailNonComprate(u.getEmail())) {
                    %>
                    <tr>
                        <td><p><%=chit.getNome()%></p></td>
                        <td><p><%=chit.getCorpo()%></p></td>
                        <td><p><%=chit.getTastiera()%></p></td>
                        <td><p><%=chit.getTop()%></p></td>
                        <td><p><%=chit.getPickup()%></p></td>
                        <td style="width: 10%;">
                            <form method="post" action="./AggiornaChitarra">
                                <span><input type="number" min="1" value="<%=chit.getQnt()%>" name="qntnew"/></span>
                                <span><input type="hidden" name="idchitnew" value="<%=chit.getIdchitarra()%>"></span>
                                <span><input type="submit" value="Aggiorna"></span>
                            </form>
                            <form action="./RimuoviChitarraCarrello" method="post">
                                <input type="hidden" name="idchitrem" value="<%=chit.getIdchitarra()%>">
                                <span><input type="submit" value="Rimuovi"></span>
                            </form>
                        </td>
                        <td><p id="prezzo">&euro; <%=chit.getPrezzo()%></p></td> 
                    </tr>
                    <%}%> 
                    <tr style="border:1px solid grey; margin:5%;">
                        <td style="text-align:center"><b>Prezzo tot:</b></td>
                        <td colspan="5"> </td>
                        <td><p id="prezzoTot"><b>&euro; <%=cart.getPrezzoTot()%></b></p></td>
                    </tr>
                </table><br>
            </div>
            <form method="post" action="./EffettuaAcquisto">
                <input type="hidden" value="idCarrello">
                <input type="hidden" value="prezzoTot">
                <input type="submit" value="Procedi con l'acquisto">
            </form>

            <%} else {%>
            <div id="carrello"> 
                <p>Non c'è nessuno articolo. Clicca <a href="."> qui </a>  per continuare a navigare</p>       
            </div>
            <%}%>

            <script src="js/core.min.js"></script>
            <script src="js/script.js"></script>
    </body>
</html>
