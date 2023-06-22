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

@WebServlet("/createNV")
public class CreateNhanVienServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter printWriter = resp.getWriter();
        printWriter.print("<html lang='en'>");
        printWriter.print("<body>");

        String str = "<form action='/createNV' method='POST'>";
        str += "<input name='idToan'><br>";
        str += "<input name='name'><br>";
        str += "<input name='img'><br>";
        str += "<button type='submit'>Submit</button>";
        str += "</form>";
        printWriter.print(str);

        printWriter.print("</body>");
        printWriter.print("</html>");


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("idToan"));
        String name = req.getParameter("name");
        String img = req.getParameter("img");
        ManagerNhanVien.nhanViens.add(new NhanVien(id,name,img));
        resp.sendRedirect("/home");
    }
}
