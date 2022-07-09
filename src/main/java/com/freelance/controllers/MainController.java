package com.freelance.controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "MainController", value = "/servlet")
public class MainController extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");

        boolean userAuthenticated = true;

        if (userAuthenticated){
            req.getRequestDispatcher("main.jsp").forward(req, res);
        } else {
            req.getRequestDispatcher("/login");
        }

    }
}
