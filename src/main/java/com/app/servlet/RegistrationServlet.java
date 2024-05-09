package com.app.servlet;

import com.app.entity.Person;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "com.app.servlet.RegistrationServlet", urlPatterns = "/register")
public class RegistrationServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String email = request.getParameter("email");
        String name = request.getParameter("name");
        String age = request.getParameter("age");
        String password = request.getParameter("password");
        String confirmPassword = request.getParameter("confirmPassword");

        if (email.isEmpty() || name.isEmpty() || Integer.parseInt(age) <= 0 || password.isEmpty() || confirmPassword.isEmpty()) {
            System.out.println("coming here");
            request.setAttribute("error", "You are missing of the inputs");
            doGet(request, response);
        } else {
            if (!password.equalsIgnoreCase(confirmPassword)) {
                request.setAttribute("error", "The password do not match.");
                doGet(request, response);
            } else {
                Person person = new Person(name, email, Integer.parseInt(age));
                request.setAttribute("person", person);
                getServletContext().getRequestDispatcher("/success.jsp").forward(request, response);
            }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String error = (String) request.getAttribute("error");
        if (error != null && !error.isEmpty()) {
            request.setAttribute("error", error);
        }
        getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
    }

}
