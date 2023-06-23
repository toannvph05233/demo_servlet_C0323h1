package com.example.demo.servlet;

import com.example.demo.manager.ManagerNhanVien;
import com.example.demo.model.NhanVien;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/createNV")
public class CreateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("/createNV.jsp");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        String img = req.getParameter("img");
        ManagerNhanVien.nhanViens.add(new NhanVien(id,name,img));

        resp.sendRedirect("/home");
    }
}
