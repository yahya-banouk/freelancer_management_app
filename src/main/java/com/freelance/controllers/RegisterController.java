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

@WebServlet(name = "Registration logic", value = "*.user")
public class RegisterController extends HttpServlet {

    private IFreelanceRepository freelanceRepository;
    private IClientRepository clientRepository;

    @Override
    public void init() throws ServletException {
        super.init();
        freelanceRepository = new FreelancerRepository();
        clientRepository = new ClientRepository();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        String requestPath = request.getServletPath();
        if (requestPath.equals("/register.user")) {
            RequestDispatcher view;
            view = request.getRequestDispatcher("views/pages/register.jsp");
            view.forward(request, response);
        }
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        String requestPath = request.getServletPath();
        String name = request.getParameter("name");
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String userType = request.getParameter("type");
        String pwd = BCrypt.hashpw(request.getParameter("password"), BCrypt.gensalt());

        if (userType.equals("freelancer")) {
            Freelancer freelancer = new Freelancer(
                    name,
                    username,
                    email,
                    pwd
            );
            freelanceRepository.saveOrUpdate(freelancer);
            HttpSession session = request.getSession();
            session.setAttribute("email", email);
            session.setAttribute("currentUser", freelancer);
            request.setAttribute("registered", "true");
            response.sendRedirect("findAllForHome.annonce");
        } else if (userType.equals("client")) {
            Client client = new Client(
                    name,
                    username,
                    email,
                    pwd
            );
            clientRepository.saveOrUpdate(client);
            HttpSession session = request.getSession();
            session.setAttribute("email", email);
            session.setAttribute("currentUser", client);
            request.setAttribute("registered", "true");
            response.sendRedirect("findAllForHome.annonce");
        }
    }
}
