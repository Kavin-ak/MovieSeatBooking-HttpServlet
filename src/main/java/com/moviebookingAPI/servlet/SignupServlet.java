package com.moviebookingAPI.servlet;

import java.io.IOException;

import com.moviebookingAPI.models.User;
import com.moviebookingAPI.service.UserService;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SignupServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
	private UserService userService;

 
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        User newUser = new User(username, password); 
        userService.register(newUser);
        
        response.sendRedirect("login.jsp");
    }
}