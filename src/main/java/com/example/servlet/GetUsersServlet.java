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

    private Warehouse warehouse = Warehouse.getInstance();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("users", warehouse.getUsers());
        RequestDispatcher rd = req.getRequestDispatcher("/users");
        rd.forward(req, resp);
    }
}
