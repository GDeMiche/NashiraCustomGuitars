<%-- 
    Document   : login
    Created on : 13-gen-2020, 12.07.43
    Author     : LittleJoke
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html class="wide wow-animation" lang="en">
    <head>
        <title>Nashira Aggiungi Chitarra</title>

        <meta name="viewport" content="width=device-width, height=device-height, initial-scale=1.0, maximum-scale=1.0, user-scalable=0">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta charset="utf-8">
        <link rel="icon" href="images/icon.ico" type="image/x-icon">
        <!-- Stylesheets-->
        <link rel="stylesheet" href="css/bootstrap.css">
        <link rel="stylesheet" href="css/fonts.css">
        <link rel="stylesheet" href="css/style.css">
        
        <script type="text/javascript">
          function OnSelection(select) {
              if (select.value == '0') {
                   document.getElementById("img").style.display = 'block';
                   document.getElementById("select").style.display = 'none';
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
            
            <section class="section section-sm section-first bg-default text-md-left">
              <div class="container">
                <div class="row row-50 justify-content-center align-items-xl-center">
                  <div class="col-md-10 col-lg-5 col-xl-6">
                    <img style="display: none" id="img" src="images/laT.png" alt="" width="250" height="250"/>
                    <div class="select">
                      <select style="width: 100%;" onchange="OnSelection(this)" name="select" id="select">
                        <option value="-">--Select--</option>
                        <option value="0">NaschiraCustomGuitasr LaT</option>
                      </select>
                    </div>
                  </div>
                  <div class="col-md-10 col-lg-7 col-xl-6">
                      <h4 id="ok">${ok}${errore}</h4    >
                      <h3 style="color: grey;" class="text-spacing-25 font-weight-normal title-opacity-9">Aggiungi Chitarra</h3>
                  <form action="./AggiungiChitarraServ" method="post">
                  <div class="form-group"></div>
                  
                  <div class="form-group">
                     <input type="text" name="nome"  class="form-control my-input" id="nomeC" placeholder="Nome Chitarra" required>
                  </div>
                   
                  <div class="form-group">
                      <input type="number" min="1" name="prezzo"  class="form-control my-input" id="prezzo" placeholder="Prezzo Chitarra" required>
                  </div>
                   
                  <div class="form-group">
                      <textarea style="width: 100%;" id="w3mission" name="descrizione"  rows="5" cols="80" placeholder="Descrizione"></textarea>
                  </div>
                   
                  <div class="text-center ">
                     <button type="submit" class=" btn btn-block send-button tx-tfm" style="background: #FFEBCD">Aggiungi Chitarra</button>
                  </div>
               </form>
            </div>
          </div>
        </div>
      </section>

            
            
        </div>      
        <script src="js/core.min.js"></script>
        <script src="js/script.js"></script>
    </body>
</html>
