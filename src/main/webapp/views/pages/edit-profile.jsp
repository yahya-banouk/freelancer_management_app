<!DOCTYPE html>
<html lang="en">
<head>
    <!-- SITE TITTLE -->
    <meta charset="utf-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
    <title>Edit Profile</title>

    <!-- Favicons -->
    <link href="../../assets/img/favicon.png" rel="icon"/>
    <link href="../../assets/img/apple-touch-icon.png" rel="apple-touch-icon"/>

    <!--  Bootstrap-->
    <link href="../../assets/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet"/>
    <link href="../../assets/vendor/bootstrap-icons/bootstrap-icons.css" rel="stylesheet"/>

    <!-- Template Main CSS File -->
    <link href="../../assets/css/list-services.css" rel="stylesheet"/>

    <link rel="stylesheet" href="../../assets/vendor/fonts/ionicons.min.css"/>
</head>

<body class="body-wrapper">
<!--==================================
=            User Profile            =
===================================-->

<section class="user-profile section">
    <div class="container">
        <div class="row">
            <div class="col-md-10 offset-md-1 col-lg-3 offset-lg-0">
                <div class="sidebar">
                    <!-- User Widget -->
                    <div class="widget user">
                        <!-- User Image -->
                        <div class="image d-flex justify-content-center">
                            <img src="https://www.biography.com/.image/t_share/MTgwOTkyMzYzODEwNzkyNTM2/gettyimages-666932578.jpg"
                                 alt="" class="icon-image"/>
                        </div>
                        <!-- User Name -->
                        <h5 class="text-center">Jonas Tesla</h5>
                    </div>
                </div>
            </div>
            <div class="col-md-10 offset-md-1 col-lg-9 offset-lg-0">
                <!-- Edit Personal Info -->
                <div class="row">
                    <div class="col-lg-6 col-md-6">
                        <div class="widget personal-info">
                            <h3 class="widget-header user">Edit Personal Information</h3>
                            <form action="#">
                                <!-- Full Name -->
                                <div class="form-group">
                                    <label for="full-name">First Name</label>
                                    <input type="text" class="form-control" id="full-name"/>
                                </div>
                                <!-- Full Name -->
                                <div class="form-group">
                                    <label for="username">Username</label>
                                    <input type="text" class="form-control" id="username"/>
                                </div>
                                <!-- File chooser -->
                                <div class="form-group choose-file d-inline-flex">
                                    <i class="fa fa-user text-center px-3"></i>
                                    <input
                                            type="file"
                                            class="form-control-file mt-2 pt-1"
                                            id="input-file"
                                    />
                                </div>
                                <!-- Checkbox -->
                                <div class="form-check">
                                    <label class="form-check-label" for="hide-profile">
                                        <input
                                                class="form-check-input mt-1"
                                                type="checkbox"
                                                value=""
                                                id="hide-profile"
                                        />
                                        Hide Profile from Public/Community
                                    </label>
                                </div>
                                <!-- Submit button -->
                                <button class="btn btn-transparent">Save My Changes</button>
                            </form>
                        </div>
                    </div>
                    <div class="col-lg-6 col-md-6">
                        <!-- Change Password -->
                        <div class="widget change-password">
                            <h3 class="widget-header user">Edit Password</h3>
                            <form action="#">
                                <!-- Current Password -->
                                <div class="form-group">
                                    <label for="current-password">Current Password</label>
                                    <input
                                            type="password"
                                            class="form-control"
                                            id="current-password"
                                    />
                                </div>
                                <!-- New Password -->
                                <div class="form-group">
                                    <label for="new-password">New Password</label>
                                    <input
                                            type="password"
                                            class="form-control"
                                            id="new-password"
                                    />
                                </div>
                                <!-- Confirm New Password -->
                                <div class="form-group">
                                    <label for="confirm-password">Confirm New Password</label>
                                    <input
                                            type="password"
                                            class="form-control"
                                            id="confirm-password"
                                    />
                                </div>
                                <!-- Submit Button -->
                                <button class="btn btn-transparent">Change Password</button>
                            </form>
                        </div>
                    </div>
                    <div class="col-lg-6 col-md-6">
                        <!-- Change Email Address -->
                        <div class="widget change-email mb-0">
                            <h3 class="widget-header user">Edit Email Address</h3>
                            <form action="#">
                                <!-- Current Password -->
                                <div class="form-group">
                                    <label for="current-email">Current Email</label>
                                    <input
                                            type="email"
                                            class="form-control"
                                            id="current-email"
                                    />
                                </div>
                                <!-- New email -->
                                <div class="form-group">
                                    <label for="new-email">New email</label>
                                    <input type="email" class="form-control" id="new-email"/>
                                </div>
                                <!-- Submit Button -->
                                <button class="btn btn-transparent">Change email</button>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>

<!-- Vendor JS Files -->
<script src="../../assets/js/main.js"></script>
</body>
</html>
