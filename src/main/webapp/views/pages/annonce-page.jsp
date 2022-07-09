<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <%@include file="../components/head.jsp" %>

    <title>Annonce Details</title>

    <!-- Template Main CSS File -->
    <link href="assets/css/style.css" rel="stylesheet"/>
</head>

<body>
<!-- ======= Header ======= -->
<%@include file="../components/header.jsp" %>
<!-- End Header -->

<main id="main">
    <!-- ======= Breadcrumbs Section ======= -->
    <section class="breadcrumbs">
        <div class="container">
            <div class="d-flex justify-content-between align-items-center">
                <h2>Annonce Details</h2>
                <ol>
                    <li><a href="#">Home</a></li>
                    <li><a href="#">Annonces</a></li>
                    <li>Details</li>
                </ol>
            </div>
        </div>
    </section>
    <!-- Breadcrumbs Section -->

    <!-- ======= Portfolio Details Section ======= -->
    <section id="portfolio-details" class="portfolio-details">
        <div class="container">
            <div class="row gy-4">
                <div class="col-lg-8">
                    <div class="portfolio-details-slider swiper">
                        <div class="swiper-wrapper align-items-center">
                            <div class="swiper-slide">
                                <img src="https://broadwayinfosys.com/blog/wp-content/uploads/2017/04/Spring-Framework.png"
                                <%--                                     src="../../assets/img/portfolio/portfolio-1.jpg"--%>
                                     alt=""/>
                            </div>
                            <div class="swiper-slide">
                                <img src="assets/img/portfolio/portfolio-2.jpg" alt=""/>
                            </div>

                            <div class="swiper-slide">
                                <img src="assets/img/portfolio/portfolio-3.jpg" alt=""/>
                            </div>
                        </div>
                        <div class="swiper-pagination"></div>
                    </div>
                </div>

                <div class="col-lg-4">
                    <div class="portfolio-info">
                        <h3>${annonce.titre}</h3>
                        <ul>
                            <li><strong>Category</strong>: Web design</li>
                            <li><strong>Phone number</strong>: +212696969696</li>
                            <li><strong>Contact</strong>: freelancer@email.com</li>
                            <li><strong>Created At</strong>: 01 March, 2020</li>
                        </ul>
                    </div>
                    <div class="portfolio-description">
                        <h2>Description</h2>
                        <p>
                            ${annonce.description}
                        </p>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- End Portfolio Details Section -->
</main>
<!-- End #main -->

<!-- ======= Footer ======= -->
<footer class="footer-clean">
    <div class="container">
        <div class="row justify-content-center">
            <div class="col-sm-4 col-md-3 item">
                <h3>Services</h3>
                <ul>
                    <li><a href="#">Web design</a></li>
                    <li><a href="#">Development</a></li>
                    <li><a href="#">Hosting</a></li>
                </ul>
            </div>
            <div class="col-sm-4 col-md-3 item">
                <h3>About</h3>
                <ul>
                    <li><a href="#">Company</a></li>
                    <li><a href="#">Team</a></li>
                    <li><a href="#">Legacy</a></li>
                </ul>
            </div>
            <div class="col-sm-4 col-md-3 item">
                <h3>Careers</h3>
                <ul>
                    <li><a href="#">Job openings</a></li>
                    <li><a href="#">Employee success</a></li>
                    <li>
                        <a href="#">test</a>
                    </li>
                </ul>
            </div>
            <div class="col-lg-3 item social">
                <a href="#"><i class="icon ion-social-facebook"></i></a
                ><a href="#"><i class="icon ion-social-twitter"></i></a
            ><a href="#"><i class="icon ion-social-snapchat"></i></a
            ><a href="#"><i class="icon ion-social-instagram"></i></a>
                <p class="copyright">Company Name © 2022</p>
            </div>
        </div>
    </div>
</footer>

<a
        href="#"
        class="back-to-top d-flex align-items-center justify-content-center"
><i class="bi bi-arrow-up-short"></i
></a>

<!-- Template Main JS File -->
<script src="assets/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
<script src="assets/js/main.js"></script>
</body>
</html>
