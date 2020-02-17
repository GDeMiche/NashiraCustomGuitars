<%-- 
    Document   : ListaAssistenze
    Created on : 11-feb-2020, 12.42.18
    Author     : pc
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="DAO.AssistenzaDAO"%>
<%@page import="Bean.Assistenza"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html class="wide wow-animation" lang="en">
    <head>
        <title>Nashira Lista Assistenze</title>

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


            <h5 align="center">Lista Assistenze</h5><br>
            <%  AssistenzaDAO assdao = new AssistenzaDAO();
                ArrayList<Assistenza> lista = assdao.getAll();
                if (lista.size() > 0) { %>         
            <div>
                <table align="center" style="width: 85%;">
                    <tr>
                        <th>Id Assistenza</th>
                        <th>Email</th>
                        <th>Problema</th>
                        <th>Risolto</th> 
                    </tr>
                    <%
                        for (Assistenza a : lista) {%>
                    <tr>
                        <td><p><%=a.getIdAssistenza()%></p></td>
                        <td><p><%=a.getEmail()%></p></td>
                        <td><p><%=a.getProblema()%></p></td>
                        <td><p><%if (a.isRisolto() == true) {%>Si<%} else {%>No<%}%></p></td>
                        <td><form action="./AssistenzaRisolta" method="post">
                                <input type="hidden" name="id" value="<%=a.getIdAssistenza()%>">
                                <input type="submit" value="Risolto">
                            </form></td>
                        <td><button><a href="mailto:<%=a.getEmail()%>?subject=IdAssistenza: <%=a.getIdAssistenza()%>">Rispondi</a></button></td>
                        <td><form action="./RimuoviAssistenza" method="post">
                                <input type="hidden" name="id" value="<%=a.getIdAssistenza()%>">
                                <input type="submit" value="Rimuovi">
                        </form></td>
                    </tr>
                    <%}
                    } else {%>
                    <h3>Non ci sono Richieste di assistenza</h3>
                    <%}%>
                </table>



                <script src="js/core.min.js"></script>
                <script src="js/script.js"></script>
                </body>
                </html>

