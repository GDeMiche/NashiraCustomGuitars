<%-- 
    Document   : login
    Created on : 13-gen-2020, 12.07.43
    Author     : LittleJoke
--%>

<%@page import="Bean.Assistenza"%>
<%@page import="java.util.ArrayList"%>
<%@page import="DAO.AssistenzaDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html class="wide wow-animation" lang="en">
    <head>
        <title>Nashira Assistenza</title>

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

            <h5>Assistenza</h5><br>
            <% if (u.isEsperto() || u.isAdmin() == true) { %>
            <a style="padding: 3px;" type="button" align="right" class="rd-nav-link" href="/tsw/ListaAssistenze">Lista Assistenze</a>
            <%}%>
            <div>
                <p><b>Spiegaci il tuo problema</b></p>
                <form action="./InoltraAssistenza" method="post" style="margin: 30px; width: 95%;">
                    <input class="form-control my-input" type="text" style="width:100%;" name="problema"><br>
                    <br><input align="center" type="submit" value="Richiedi Assistenza">
                </form>
                <p id="error">${error}</p>
                <p id="ok">${ok}</p>
            </div>
            <%  AssistenzaDAO assdao = new AssistenzaDAO();
                ArrayList<Assistenza> lista = assdao.getAssistenzeByEmail(u.getEmail());
                if (lista.size() > 0) { %>         
            <div>
                <h6>Lista Assistenze Inviate</h6><br>   
                <table align="center" style="width:85%;">
                    <tr>
                        <th>Id</th>
                        <th>Problema</th>
                        <th>Risolto</th> 
                    </tr>
                    <%
                        for (Assistenza a : lista) {%>
                    <tr>
                        <td style="width: 5%;"><p><%=a.getIdAssistenza()%></p></td>
                        <td><p><%=a.getProblema()%></p></td>
                        <td style="width: 5%;"><p><%if (a.isRisolto() == true) {%>Si<%} else {%>No<%}%></p></td>              
                    </tr>
                    <%}
                    } else {%>  <p>Lista Assistenze Vuota</p>  <%}%>
                </table><br><br>         
            </div>
        </div>
        <script src="js/core.min.js"></script>
        <script src="js/script.js"></script>
</body>
</html>

