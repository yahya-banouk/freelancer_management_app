<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 5/8/2022
  Time: 2:23 PM
  To change this template use File | Settings | File Templates.
--%>
<div class="col-md-12 col-lg-4 d-flex" data-aos="fade-right">
    <div class="card">
        <div class="card-img">
<%--            <img src="${annonce.annonceImages.get(0)}" alt="service1">--%>
            <img src="assets/img/portfolio/portfolio-1.jpg" alt="service1">
        </div>
        <div class="card-body">
            <h5 class="card-title"><a href="findOneForUser.annonce?annonceId=${annonce.id}">${annonce.titre}</a></h5>
            <p class="card-text">${annonce.description}</p>
            <div class="read-more"><a href="findOneForUser.annonce?annonceId=${annonce.id}"><i class="bi bi-arrow-right"></i> Read More</a></div>
        </div>
    </div>
</div>
