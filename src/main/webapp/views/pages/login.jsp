<!DOCTYPE html>
<html lang="en">
<head>

    <%@include file="../components/head.jsp" %>

    <title>Login</title>

    <!-- Template Main CSS File -->
    <link href="assets/css/authentication.css" rel="stylesheet"/>
</head>

<body class="bg-gradient-secondary">
<div class="container">
    <!-- Outer Row -->
    <div class="row justify-content-center">
        <div class="col-xl-10 col-lg-12 col-md-9">
            <div class="card o-hidden border-0 shadow-lg my-5">
                <div class="card-body p-0">
                    <!-- Nested Row within Card Body -->
                    <div class="row">
                        <div class="col-lg-6 d-none d-lg-block bg-login-image"></div>
                        <div class="col-lg-6">
                            <div class="p-5">
                                <div class="text-center">
                                    <h1 class="h4 text-gray-900 mb-4">Welcome Back!</h1>
                                </div>
                                <form class="user" action="login" method="post">
                                    <div class="form-group">
                                        <input
                                                type="email"
                                                class="form-control form-control-user"
                                                name="email"
                                                id="exampleInputEmail"
                                                aria-describedby="emailHelp"
                                                placeholder="Enter Email Address..."
                                                required
                                        />
                                    </div>
                                    <div class="form-group">
                                        <input
                                                type="password"
                                                class="form-control form-control-user"
                                                name="password"
                                                id="exampleInputPassword"
                                                placeholder="Password"
                                                required
                                        />
                                    </div>
                                    <div class="form-group row text-center">
                                        <div class="form-check col-3">
                                            <input class="form-check-input" type="radio" name="type"
                                                   id="flexRadioDefault1" value="client">
                                            <label class="form-check-label" for="flexRadioDefault1">
                                                Client
                                            </label>
                                        </div>
                                        <div class="form-check col-3">
                                            <input class="form-check-input" type="radio" name="type"
                                                   id="flexRadioDefault2" checked value="freelancer">
                                            <label class="form-check-label" for="flexRadioDefault2">
                                                Freelancer
                                            </label>
                                        </div>
                                    </div>
                                    <button
                                            class="btn btn-primary btn-user btn-block"
                                            type="submit"
                                    >
                                        Login
                                    </button>
                                    <hr/>
                                    <a
                                            href="#"
                                            class="btn btn-google btn-user btn-block"
                                    >
                                        <i class="fab fa-google fa-fw"></i> Login with Google
                                    </a>
                                    <a
                                            href="#"
                                            class="btn btn-facebook btn-user btn-block"
                                    >
                                        <i class="fab fa-facebook-f fa-fw"></i> Login with
                                        Facebook
                                    </a>
                                </form>
                                <hr/>
                                <div class="text-center">
                                    <a class="small" href="#"
                                    >Forgot Password?</a
                                    >
                                </div>
                                <div class="text-center">
                                    <a class="small" href="register.user"
                                    >Create an Account!</a
                                    >
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

<!-- Vendor JS Files -->
<script src="assets/vendor/aos/aos.js"></script>
<script src="assets/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
<script src="assets/vendor/glightbox/js/glightbox.min.js"></script>
<script src="assets/vendor/swiper/swiper-bundle.min.js"></script>

<!-- Template Main JS File -->
<script src="assets/js/main.js"></script>
</body>
</html>
