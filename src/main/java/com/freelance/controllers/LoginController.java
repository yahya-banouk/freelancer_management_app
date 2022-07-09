package com.freelance.controllers;

import com.freelance.beans.Client;
import com.freelance.beans.Freelancer;
import com.freelance.models.ClientRepository;
import com.freelance.models.FreelancerRepository;
import com.freelance.models.IClientRepository;
import com.freelance.models.IFreelanceRepository;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.security.crypto.bcrypt.BCrypt;

import java.io.IOException;

@WebServlet(name = "Login", value = "/login")
public class LoginController extends HttpServlet {

    private IFreelanceRepository freelancerRepository;
    private IClientRepository clientRepository;

    @Override
    public void init() throws ServletException {
        super.init();
        freelancerRepository = new FreelancerRepository();
        clientRepository = new ClientRepository();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher view;
        view = request.getRequestDispatcher("views/pages/login.jsp");
        view.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        String requestPath = request.getServletPath();
        if (requestPath.equals("/login")) {
            String email = request.getParameter("email");
            String pwd = request.getParameter("password");
            String type = request.getParameter("type");
            RequestDispatcher view;
            if (type.equals("freelancer")) {
                Freelancer freelancer = freelancerRepository.findByEmail(email);
                if (freelancer != null) {
                    if (BCrypt.checkpw(pwd, freelancer.getPassword())) {
                        HttpSession session = request.getSession();
                        session.setAttribute("email", email);
                        session.setAttribute("currentUser", freelancer);
                        response.sendRedirect("findAllForHome.annonce");
                    }
                } else {
                    request.setAttribute("errorMessage", "Cannot validate credentials!");
                    doGet(request, response);
                }
            } else {
                Client client = clientRepository.findByEmail(email);
                if (client != null) {
                    if (BCrypt.checkpw(pwd, client.getPassword())) {
                        HttpSession session = request.getSession();
                        session.setAttribute("email", email);
                        session.setAttribute("currentUser", client);
                        response.sendRedirect("findAllForHome.annonce");
                    }
                } else {
                    request.setAttribute("errorMessage", "Cannot validate credentials!");
                    doGet(request, response);
                }
            }

        }
    }
}
