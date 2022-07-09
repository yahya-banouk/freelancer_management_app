<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <%@include file="../components/head.jsp" %>
    <title>GetJob - Home </title>
    <!-- Template Main CSS File -->
    <link href="assets/css/style.css" rel="stylesheet">
</head>

<body>

<%@include file="../components/header.jsp" %>

<!-- ======= Hero Section ======= -->
<section id="hero">
    <div class="container">
        <div class="row d-flex align-items-center m-lg-5">
            <div class="col-lg-6 py-5 py-lg-0 order-2 order-lg-1" data-aos="fade-right">
                <h1>Find the perfect freelance services for your business</h1>
                <%--                <h2>Popular:  <a href="#about" class="">Website Design</a>   WordPress Logo Design NFT Art</h2>--%>
                <input type="text" class="form-text scrollTo" placeholder="Search"/>
                <a href="#" class="btn-get-started">Get started</a>
            </div>
            <div class="col-lg-6 order-1 order-lg-2 hero-img" data-aos="fade-left">
                <img src="assets/img/hero-img.png" class="img-fluid" alt="hero-image-freelance">
            </div>
        </div>
    </div>
</section>
<!-- End Hero -->

<main id="main">

    <!-- ======= Services Section ======= -->
    <section id="services" class="services section-bg">
        <div class="container">

            <div class="section-title">
                <h2 data-aos="fade-in">Services</h2>
                <p data-aos="fade-in">Find the talent needed to get your business growing. Checkout the latest services
                    right now!</p>
            </div>

            <div class="row">
                <c:forEach var="annonce" items="${annonces}">
                    <%@include file="../components/product-card.jsp" %>
                </c:forEach>


            </div>
            <div align="center"><a href="findAnnoncesByName.annonce" class="btn-get-started findOut">Find Out more</a>
            </div>

        </div>
    </section><!-- End Services Section -->

    <!-- ======= Features Section ======= -->
    <section id="features" class="features section-bg">
        <div class="container">

            <div class="section-title">
                <h2 data-aos="fade-in">Features</h2>
                <p data-aos="fade-in">Magnam dolores commodi suscipit. Necessitatibus eius consequatur ex aliquid fuga
                    eum quidem. Sit sint consectetur velit. Quisquam quos quisquam cupiditate. Et nemo qui impedit
                    suscipit alias ea. Quia fugiat sit in iste officiis commodi quidem hic quas.</p>
            </div>

            <div class="row content">
                <div class="col-md-5" data-aos="fade-right">
                    <img src="assets/img/features-1.svg" class="img-fluid" alt="">
                </div>
                <div class="col-md-7 pt-4" data-aos="fade-left">
                    <h3>Voluptatem dignissimos provident quasi corporis voluptates sit assumenda.</h3>
                    <p class="fst-italic">
                        Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut
                        labore et dolore
                        magna aliqua.
                    </p>
                    <ul>
                        <li><i class="bi bi-check"></i> Ullamco laboris nisi ut aliquip ex ea commodo consequat.</li>
                        <li><i class="bi bi-check"></i> Duis aute irure dolor in reprehenderit in voluptate velit.</li>
                    </ul>
                </div>
            </div>

            <div class="row content">
                <div class="col-md-5 order-1 order-md-2" data-aos="fade-left">
                    <img src="assets/img/features-2.svg" class="img-fluid" alt="">
                </div>
                <div class="col-md-7 pt-5 order-2 order-md-1" data-aos="fade-right">
                    <h3>Corporis temporibus maiores provident</h3>
                    <p class="fst-italic">
                        Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut
                        labore et dolore
                        magna aliqua.
                    </p>
                    <p>
                        Ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit
                        in voluptate
                        velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non
                        proident, sunt in
                        culpa qui officia deserunt mollit anim id est laborum
                    </p>
                </div>
            </div>

            <div class="row content">
                <div class="col-md-5" data-aos="fade-right">
                    <img src="assets/img/features-3.svg" class="img-fluid" alt="">
                </div>
                <div class="col-md-7 pt-5" data-aos="fade-left">
                    <h3>Sunt consequatur ad ut est nulla consectetur reiciendis animi voluptas</h3>
                    <p>Cupiditate placeat cupiditate placeat est ipsam culpa. Delectus quia minima quod. Sunt saepe odit
                        aut quia voluptatem hic voluptas dolor doloremque.</p>
                    <ul>
                        <li><i class="bi bi-check"></i> Ullamco laboris nisi ut aliquip ex ea commodo consequat.</li>
                        <li><i class="bi bi-check"></i> Duis aute irure dolor in reprehenderit in voluptate velit.</li>
                        <li><i class="bi bi-check"></i> Facilis ut et voluptatem aperiam. Autem soluta ad fugiat.</li>
                    </ul>
                </div>
            </div>

            <div class="row content">
                <div class="col-md-5 order-1 order-md-2" data-aos="fade-left">
                    <img src="assets/img/features-4.svg" class="img-fluid" alt="">
                </div>
                <div class="col-md-7 pt-5 order-2 order-md-1" data-aos="fade-right">
                    <h3>Quas et necessitatibus eaque impedit ipsum animi consequatur incidunt in</h3>
                    <p class="fst-italic">
                        Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut
                        labore et dolore
                        magna aliqua.
                    </p>
                    <p>
                        Ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit
                        in voluptate
                        velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non
                        proident, sunt in
                        culpa qui officia deserunt mollit anim id est laborum
                    </p>
                </div>
            </div>

        </div>
    </section><!-- End Features Section -->
</main><!-- End #main -->

<!-- ======= Footer ======= -->
<%@include file="../components/footer.jsp" %>
<!-- End Footer -->

<a href="#" class="back-to-top d-flex align-items-center justify-content-center"><i
        class="bi bi-arrow-up-short"></i></a>
<!-- Vendor JS Files -->
<script src="assets/vendor/aos/aos.js"></script>
<script src="assets/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
<script src="assets/vendor/glightbox/js/glightbox.min.js"></script>
<script src="assets/vendor/swiper/swiper-bundle.min.js"></script>

<!-- Template Main JS File -->
<script src="assets/js/main.js"></script>

<%--<c:redirect url="/servlet"/>--%>
</body>

</html>