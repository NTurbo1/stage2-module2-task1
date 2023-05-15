package com.example.servlet;

import com.example.Warehouse;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/users")
public class GetUsersServlet extends HttpServlet {
    //write your code here!

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Warehouse warehouse = Warehouse.getInstance();
        req.setAttribute("users", warehouse.getUsers());
        RequestDispatcher rd = req.getRequestDispatcher("/jsp/users.jsp");
        rd.forward(req, resp);
    }
}
