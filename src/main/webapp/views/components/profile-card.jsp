<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="sidebar">
    <!-- User Widget -->
    <div class="widget user-dashboard-profile">
        <!-- User Image -->
        <div class="profile-thumb">
            <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/7/79/Tesla_circa_1890.jpeg/220px-Tesla_circa_1890.jpeg"
                 alt="profile-avatar" class="rounded-circle"/>
        </div>
        <!-- User Name -->
        <h5 class="text-center"> ${sessionScope.currentUser.name} </h5>
        <p>Joined February 06, 2017</p>
        <p><a href="login" type="btn btn-primary"> Logout </a></p>
        <%-- href="EditProfileForUser.user?userId=1"> --%>
    </div>
</div>

