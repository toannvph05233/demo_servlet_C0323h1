package com.example.demo.manager;

import com.example.demo.model.NhanVien;

import java.util.ArrayList;
import java.util.List;

public class ManagerNhanVien {
    public static List<NhanVien> nhanViens = new ArrayList<>();

    public ManagerNhanVien() {
        nhanViens.add(new NhanVien(1,"Ngọc Trinh","https://images2.thanhnien.vn/Uploaded/haoph/2021_11_19/ngoctrinh-gejd-455.jpg"));
        nhanViens.add(new NhanVien(2,"Ny Tùng","https://gamek.mediacdn.vn/133514250583805952/2021/12/18/photo-1-16398007858621877694087.jpg"));
        nhanViens.add(new NhanVien(3,"Ny Tốt","https://openseauserdata.com/files/6812dec59a4232ce45eccdb9629f6236.jpg"));
    }

}
