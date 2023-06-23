package com.example.demo.servlet;

import com.example.demo.manager.ManagerNhanVien;
import com.example.demo.model.NhanVien;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/editNV")
public class EditServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        NhanVien nhanVien = findById(id);
        req.setAttribute("nhanvien", nhanVien);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/edit.jsp");
        dispatcher.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        String img = req.getParameter("img");
        NhanVien nhanVien = findById(id);
        if (nhanVien != null){
            nhanVien.setImg(img);
            nhanVien.setName(name);
        }
        resp.sendRedirect("/home");
    }



    public NhanVien findById(int id){
        for (NhanVien nv: ManagerNhanVien.nhanViens) {
            if (nv.getId() == id){
               return nv;
            }
        }
        return null;
    }

}
