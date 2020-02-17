<!DOCTYPE html>
<html>
  <head>
    <title>Nashira Home</title>
    
    <meta name="viewport" content="width=device-width, height=device-height, initial-scale=1.0, maximum-scale=1.0, user-scalable=0">
    <link rel="icon" href="images/icon.ico" type="image/x-icon">
    <!-- Stylesheets-->
    <link rel="stylesheet" href="css/bootstrap.css">
    <link rel="stylesheet" href="css/fonts.css">
    <link rel="stylesheet" href="css/style.css">
    
  </head>
  <body>
      
    <div class="page">
            <!-- RD Navbar-->
            <%@include file="navbar.jsp" %>
      <!-- Swiper-->
        
      <section class="section swiper-container swiper-slider swiper-slider-classic" data-loop="true" data-autoplay="5000" data-simulate-touch="true" data-direction="vertical" data-nav="false">
        <div class="swiper-wrapper text-center">
          <div class="swiper-slide context-dark" data-slide-bg="images/Principale1.jpg">
            <div class="swiper-slide-caption section-md">
              <div class="container">
                <h1 data-caption-animate="fadeInLeft" data-caption-delay="0">Innovativo e conveniente</h1>
                <p class="text-width-large" data-caption-animate="fadeInRight" data-caption-delay="100">Il nostro team utilizza le innovazioni combinate con la pianificazione personalizzata per offrire il miglior design risparmiando sui costi.</p><a class="button button-primary button-ujarak" href="/tsw/Scelta" data-caption-animate="fadeInUp" data-caption-delay="200">Crea il tuo stile</a>
              </div>
            </div>
          </div>
          <div class="swiper-slide context-dark" data-slide-bg="images/Principale2.jpg">
            <div class="swiper-slide-caption section-md">
              <div class="container">
                <h1 data-caption-animate="fadeInLeft" data-caption-delay="0">Sicura e professionale</h1>
                <p class="text-width-large" data-caption-animate="fadeInRight" data-caption-delay="100">Tutti i nostri designer sono completamente impegnati nel risultato finale, pur essendo completamente professionali in tutti gli aspetti della pianificazione e del design</p><a class="button button-primary button-ujarak" href="/tsw/Scelta" data-caption-animate="fadeInUp" data-caption-delay="200">Crea il tuo stile</a>
              </div>
            </div>
          </div>
          <div class="swiper-slide context-dark" data-slide-bg="images/Principale3.jpg">
            <div class="swiper-slide-caption section-md">
              <div class="container">
                <h1 data-caption-animate="fadeInLeft" data-caption-delay="0">Armonico e accogliente</h1>
                <p class="text-width-large" data-caption-animate="fadeInRight" data-caption-delay="100">Sviluppiamo secondo il tuo stile</p><a class="button button-primary button-ujarak" href="/tsw/Scelta" data-caption-animate="fadeInUp" data-caption-delay="200">Crea il tuo stile</a>
              </div>
            </div>
          </div>
        </div>
        <!-- Swiper delle pagine-->
        <div class="swiper-pagination__module">
          <div class="swiper-pagination__fraction"><span class="swiper-pagination__fraction-index">00</span><span class="swiper-pagination__fraction-divider">/</span><span class="swiper-pagination__fraction-count">00</span></div>
          <div class="swiper-pagination__divider"></div>
          <div class="swiper-pagination"></div>
        </div>
      </section>
   <!--fine swiper-->
    

      <!-- Caratteristiche-->
      <section class="section section-sm section-fluid bg-default text-center">
        <div class="container-fluid">
          <h3 class="wow fadeInLeft">Caratteristiche</h3>
          
          
          <div class="row row-30 isotope" data-isotope-layout="fitRows" data-isotope-group="gallery" data-lightgallery="group">
            <div class="col-sm-6 col-lg-4 col-xxl-3 isotope-item wow fadeInLeft" data-filter="Type 3">
              <!-- Thumbnail Classic-->
              <article class="thumbnail thumbnail-classic thumbnail-md">
                <div class="thumbnail-classic-figure"><img src="images/c1.jpg" alt="" width="420" height="350"/>
                </div>
                <div class="thumbnail-classic-caption">
                  <div class="thumbnail-classic-title-wrap"><a class="icon fl-bigmug-line-zoom60" href="images/c1.jpg" data-lightgallery="item"><img src="images/c1.jpg" alt="" width="420" height="350"/></a>
                    <h5 class="thumbnail-classic-title"><a>Design</a></h5>
                  </div>
                  <p class="thumbnail-classic-text">Forniamo un ottimo connubio tra tendenze tradizionali e moderne nel settore della chitarra elettrica. Progettiamo strumenti versatili di qualità  superiore, ricercati dal musicista moderno.</p>
                </div>
              </article>
            </div>
            <div class="col-sm-6 col-lg-4 col-xxl-3 isotope-item wow fadeInLeft" data-filter="Type 2" data-wow-delay=".1s">
              <article class="thumbnail thumbnail-classic thumbnail-md">
                <div class="thumbnail-classic-figure"><img src="images/c2.jpg" alt="" width="420" height="350"/>
                </div>
                <div class="thumbnail-classic-caption">
                  <div class="thumbnail-classic-title-wrap"><a class="icon fl-bigmug-line-zoom60" href="images/c2.jpg" data-lightgallery="item"><img src="images/c2.jpg" alt="" width="420" height="350"/></a>
                    <h5 class="thumbnail-classic-title"><a>Personalizzazione</a></h5>
                  </div>
                  <p class="thumbnail-classic-text">Ogni aspetto della build puó essere aggiornato e personalizzato come desideri!</p>
                </div>
              </article>
            </div>
            <div class="col-sm-6 col-lg-4 col-xxl-3 isotope-item wow fadeInLeft" data-filter="Type 1" data-wow-delay=".2s">
              <article class="thumbnail thumbnail-classic thumbnail-md">
                <div class="thumbnail-classic-figure"><img src="images/c3.jpg" alt="" width="420" height="350"/>
                </div>
                <div class="thumbnail-classic-caption">
                  <div class="thumbnail-classic-title-wrap"><a class="icon fl-bigmug-line-zoom60" href="images/c3.jpg" data-lightgallery="item"><img src="images/c3.jpg" alt="" width="420" height="350"/></a>
                    <h5 class="thumbnail-classic-title"><a>Qualità</a></h5>
                  </div>
                  <p class="thumbnail-classic-text">Riceviamo il nostro legno da fornitori di fiducia specializzati in legni destinati a strumenti musicali, al fine di garantire le massime qualità  costruttive.</p>
                </div>
              </article>
            </div>
              <div class="col-sm-6 col-lg-4 col-xxl-3 isotope-item wow fadeInLeft" data-filter="Type 3" data-wow-delay=".3s">
              <!-- Thumbnail Classic-->
              <article class="thumbnail thumbnail-classic thumbnail-md">
                <div class="thumbnail-classic-figure"><img src="images/c4.jpg" alt="" width="420" height="350"/>
                </div>
                <div class="thumbnail-classic-caption">
                  <div class="thumbnail-classic-title-wrap"><a class="icon fl-bigmug-line-zoom60" href="images/c4.jpg" data-lightgallery="item"><img src="images/c4.jpg" alt="" width="420" height="350"/></a>
                    <h5 class="thumbnail-classic-title"><a>Professionalità</a></h5>
                  </div>
                  <p class="thumbnail-classic-text">Ogni build riceve la nostra massima attenzione. Iniziamo fornendoti una visualizzazione al computer, seguendoti discutendo ogni aspetto della build e finendo per dare vita alla chitarra dei tuoi sogni.</p>
                </div>
              </article>
            </div>
          </div>
        </div>
      </section>
    </div>

      
      <!-- Javascript-->
    <script src="js/core.min.js"></script>
    <script src="js/script.js"></script>
  </body>
</html>