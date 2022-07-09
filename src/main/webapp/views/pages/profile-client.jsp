<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>

    <%@include file="../components/head.jsp" %>

    <title> My Profile </title>

    <!-- Template Main CSS File -->
    <link href="assets/css/list-services.css" rel="stylesheet"/>
    <link href="assets/css/style.css" rel="stylesheet"/>
</head>

<body class="body-wrapper">
<%@include file="../components/header.jsp" %>

<section class="dashboard section">
    <!-- Container Start -->
    <div class="container">
        <!-- Row Start -->
        <div class="row">
            <div class="col-md-10 offset-md-1 col-lg-4 offset-lg-0">
                <%@include file="../components/profile-card.jsp" %>
            </div>
            <div class="col-md-10 offset-md-1 col-lg-8 offset-lg-0">
                <!-- Recently Favorited -->
                <div class="widget dashboard-container my-adslist">
                    <h3 class="widget-header">Mes annonces</h3>
                    <div class="m-3" style="color: green">
                        <c:if test="${errorMessage != null}">
                            ${errorMessage}
                        </c:if>
                    </div>
                    <table class="table table-responsive product-dashboard-table">
                        <thead>
                        <tr>
                            <th>Image</th>
                            <th>Annonce Title</th>
                            <th class="text-center">Category</th>
                            <th class="text-center">Action</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach var="annonce" items="${annonces}">
                            <tr>
                                <td class="product-thumb">
                                    <img width="80px" height="auto" src="assets/img/services-3.jpg"
                                        <%--  src="${annonce.annonceImages.get(0)}" --%>
                                         alt="image description"/>
                                </td>
                                <td class="product-details">
                                    <h3 class="title">${annonce.titre}</h3>
                                    <strong>Posted on: </strong>
                                    <time>Jun 27, 2017</time>
                                    <span class="status active">
                                        <strong>Status</strong>
                                        Active
                                    </span>
                                    <span class="location">
                                        <strong>Location</strong>
                                        LA,California
                                    </span>
                                </td>
                                <td class="product-category">
                                    <span class="categories">Web Design</span>
                                </td>
                                <td class="action" data-title="Action">
                                    <div class="">
                                        <ul class="list-inline justify-content-center">
                                            <li class="list-inline-item">
                                                <a
                                                        data-toggle="tooltip"
                                                        data-placement="top"
                                                        title="View"
                                                        class="view"
                                                        href="findOneForUser.annonce?annonceId=${annonce.id}"
                                                >
                                                    <i class="icon">view</i>
                                                </a>
                                            </li>
                                            <li class="list-inline-item">

                                                <a
                                                        data-toggle="tooltip"
                                                        data-placement="top"
                                                        title="Edit"
                                                        class="edit"
                                                        href="findOneForUserProfile.annonce?annonceId=${annonce.id}"
                                                >
                                                    <i class="icon">edit</i>
                                                </a>
                                            </li>
                                            <li class="list-inline-item">
                                                <a
                                                        data-toggle="tooltip"
                                                        data-placement="top"
                                                        title="Delete"
                                                        class="delete"
                                                        href="deleteForUser.annonce?annonceId=${annonce.id}"
                                                >
                                                    <i class="icon">delete</i>
                                                </a>
                                            </li>
                                        </ul>
                                    </div>
                                </td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                    <a class="btn-secondary btn" href="createOneForUser.annonce"> Add new one</a>
                </div>
            </div>
        </div>
        <!-- Row End -->
    </div>
    <!-- Container End -->
</section>
<!-- Template Main JS File -->
<script src="assets/js/main.js"></script>

</body>
</html>
