package com.example.demo.servlet;

import com.example.demo.manager.ManagerNhanVien;
import com.example.demo.model.NhanVien;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/home")
public class HomeServlet extends HttpServlet {
    ManagerNhanVien managerNhanVien = new ManagerNhanVien();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // khi request co method la GET.
        PrintWriter printWriter = resp.getWriter();
        printWriter.print("<a href='/createNV'>Create Nhân Viên</a>");
        String str = "<table>";
        for (NhanVien nv: managerNhanVien.nhanViens) {
            str += "<tr>";
            str += "<td>" + nv.getId() + "</td>";
            str += "<td>" + nv.getName() + "</td>";
            str += "<td><img src='" + nv.getImg() + "' width=300, height= 250></td>";
            str += "</tr>";
        }
        str += "</table>";
        printWriter.print(str);


    }

}
