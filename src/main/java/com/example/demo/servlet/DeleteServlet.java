package com.example.demo.servlet;

import com.example.demo.manager.ManagerNhanVien;
import com.example.demo.model.NhanVien;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/deleteNV")
public class DeleteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        for (int i = 0; i < ManagerNhanVien.nhanViens.size(); i++) {
            if (ManagerNhanVien.nhanViens.get(i).getId() == id) {
                ManagerNhanVien.nhanViens.remove(i);
            }
        }
        resp.sendRedirect("/home");
    }
}
