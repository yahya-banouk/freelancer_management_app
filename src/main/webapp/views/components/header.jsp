<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 5/8/2022
  Time: 11:34 AM
  To change this template use File | Settings | File Templates.
--%>
<!-- ======= Header ======= -->
<header id="header">
    <div class="container d-flex align-items-center justify-content-between">
        <div class="logo">
            <h1><a href="findAllForHome.annonce">GetJob<span>.</span></a></h1>
        </div>
        <nav id="navbar" class="navbar">
            <ul>
                <li><a class="nav-link active" href="findAllForHome.annonce">Home</a></li>
                <li><a class="nav-link" href="findAnnoncesByName.annonce">Services</a></li>
                <li><a class="nav-link" href="findAllForUser.mission">Offers</a></li>
                <c:choose>
                    <c:when test="${sessionScope.email == null}">
                        <li><a class="getstarted" href="login">Sign in</a></li>
                    </c:when>
                    <c:otherwise>
                        <li><a class="getstarted" href="findAllForUserProfile.annonce">My profile</a></li>
                    </c:otherwise>
                </c:choose>
            </ul>
            <i class="bi bi-list mobile-nav-toggle"></i>
        </nav>
        <!-- .navbar -->

    </div>
</header>
<!-- End Header -->
