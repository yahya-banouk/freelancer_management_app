<%@ page import="com.freelance.beans.Annonce" %>
<%@ page import="java.util.List" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page session="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isErrorPage="true"%>
<%--<c:redirect url="/main"/>--%>

<h3>
  Source
  <a href="https://github.com/NicolasDesnoust/ANNUAIRE-JEE/tree/master/src/dev">
    here
  </a>

  https://github.com/fimtow/projet-jee

  <%
      List<Annonce> annonces = (List<Annonce>) request.getAttribute("annonces");
      Annonce annonce = (Annonce) request.getAttribute("annonce");

      String errorMessage = (String) request.getAttribute("errorMessage");
      PrintWriter printer = response.getWriter();
      printer.println(annonces);
      printer.println(errorMessage);
      printer.println(annonce);

  %>
</h3>