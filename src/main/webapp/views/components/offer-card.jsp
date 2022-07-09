<div class="col-sm-12 col-lg-4 col-md-6">
    <!-- product card -->
    <div class="product-item bg-light">
        <div class="card">
            <div class="thumb-content">
<%--               <div class="price">$200</div>--%>
                <a href="findOneForUser.mission?missionId=${offer.id}">
                    <img
                            class="card-img-top img-fluid"
                            src="assets/img/portfolio/portfolio-2.jpg"
<%--                            src="${annonce.annonceImages.get(0)}"--%>
                            alt="Card image cap"
                    />
                </a>
            </div>
            <div class="card-body">
                <h4 class="card-title">
                    <a href="findOneForUser.mission?missionId=${offer.id}">${offer.titre}</a>
                </h4>
                <ul class="list-inline product-meta">
                    <li class="list-inline-item">
                        <a href="findOneForUser.mission?missionId=${offer.id}"
                        ><i class="fa fa-folder-open-o"></i>Electronics</a
                        >
                    </li>
                    <li class="list-inline-item">
                        <a href="findOneForUser.mission?missionId=${offer.id}"
                        ><i class="fa fa-calendar"></i>26th December</a
                        >
                    </li>
                </ul>
                <p class="card-text">
                    ${offer.description}
                </p>
            </div>
        </div>
    </div>
</div>