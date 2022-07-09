<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <%@include file="../components/head.jsp" %>

    <title>List Offers</title>

    <!-- Template Main CSS File -->
    <link href="assets/css/list-services.css" rel="stylesheet"/>
    <link href="assets/css/style.css" rel="stylesheet"/>

</head>

<body class="body-wrapper">

<%@include file="../components/header.jsp" %>

<section id="hero">
    <div class="container">
        <div class="row d-flex align-items-center mb-lg-5 mt-lg-5">
            <%--   TODO: Customize search bar --%>
            <form method="get" action="findAnnoncesByName.annonce">
                <label>
                    <input type="text" placeholder="Search..." name="annonceTitle" required>
                </label>
                <input type="submit" value="search">
            </form>
        </div>
    </div>
</section>

<section class="section-sm">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <div class="search-result bg-gray">
                    <c:choose>
                        <c:when test="${offerName != null}">
                            <h2>Results for "${offerName}" </h2>
                        </c:when>
                        <c:otherwise>
                            <h2>List Offers</h2>
                        </c:otherwise>
                    </c:choose>
                    <c:set var="now" value="<%= new java.util.Date()%>"/>
                    <!-- TODO: Make results number dynamic -->
                    <p><c:out value="${offers.size()}"/>
                        Results on
                        <fmt:formatDate type="date" value="${now}"/>
                    </p>
                </div>
            </div>
        </div>
        <div class="product-grid-list">
            <div class="row mt-30">
                <c:choose>
                    <c:when test="${offers.size() != 0}">
                        <c:forEach var="offer" items="${offers}">
                            <%@include file="../components/offer-card.jsp" %>
                        </c:forEach>
                    </c:when>
                    <c:otherwise>
                        <h1 align="center">Oops! No resources Found!!</h1>
                    </c:otherwise>
                </c:choose>
            </div>
        </div>
    </div>
</section>

<%@include file="../components/footer.jsp"%>

<!-- Vendor JS Files -->
<script src="assets/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

<!-- Template Main JS File -->
<script src="assets/js/main.js"></script>
</body>
</html>
