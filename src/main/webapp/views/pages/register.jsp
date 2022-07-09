<!DOCTYPE html>
<html lang="en">

<head>

    <%@include file="../components/head.jsp" %>

    <title>Register</title>

    <!-- Template Main CSS File -->
    <link href="assets/css/authentication.css" rel="stylesheet"/>


</head>

<body class="bg-gradient-primary">

<div class="container">
    <div class="card o-hidden border-0 shadow-lg my-5">
        <div class="card-body p-0">
            <!-- Nested Row within Card Body -->
            <div class="row">
                <div class="col-lg-5 d-none d-lg-block bg-register-image"></div>
                <div class="col-lg-7">
                    <div class="p-5">
                        <div class="text-center">
                            <h1 class="h4 text-gray-900 mb-4">Create an Account!</h1>
                        </div>
                        <form class="user" action="register.user" method="post">
                            <div class="form-group row">
                                <div class="col-sm-6 mb-3 mb-sm-0">
                                    <input type="text" class="form-control form-control-user" id="exampleFirstName"
                                           name="name"
                                           placeholder="Full Name"
                                           required>
                                </div>
                                <div class="col-sm-6">
                                    <input type="text" class="form-control form-control-user" id="exampleLastName"
                                           name="username"
                                           placeholder="username"
                                           required>
                                </div>
                            </div>
                            <div class="form-group">
                                <input type="email" class="form-control form-control-user" id="exampleInputEmail"
                                       name="email"
                                       placeholder="Email Address"
                                       required>
                            </div>
                            <div class="form-group row">
                                <div class="col-sm-6 mb-3 mb-sm-0">
                                    <input type="password" class="form-control form-control-user"
                                           name="password"
                                           id="exampleInputPassword" placeholder="Password"
                                           required>
                                </div>
                                <div class="col-sm-6">
                                    <input type="password" class="form-control form-control-user"
                                           name="passwordRepeated"
                                           id="exampleRepeatPassword" placeholder="Repeat Password">
                                </div>
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
                            <button class="btn btn-primary btn-user btn-block" type="submit">
                                Register Account
                            </button>
                            <hr>
                            <a href="#" class="btn btn-google btn-user btn-block">
                                <i class="fab fa-google fa-fw"></i> Register with Google
                            </a>
                            <a href="#" class="btn btn-facebook btn-user btn-block">
                                <i class="fab fa-facebook-f fa-fw"></i> Register with Facebook
                            </a>
                        </form>
                        <hr>
                        <div class="text-center">
                            <a class="small" href="#">Forgot Password?</a>
                        </div>
                        <div class="text-center">
                            <a class="small" href="login.jsp">Already have an account? Login!</a>
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