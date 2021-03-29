package com.example.baitapandroidtuan3;

import java.io.Serializable;

public class SanPhamDienThoai implements Serializable {
    private String tenSanPham;
    private Colors mauSac;
    private String nhaCungCap;
    private double giaTien;

    public SanPhamDienThoai(String tenSanPham, Colors mauSac, String nhaCungCap, double giaTien) {
        this.tenSanPham = tenSanPham;
        this.mauSac = mauSac;
        this.nhaCungCap = nhaCungCap;
        this.giaTien = giaTien;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public Colors getMauSac() {
        return mauSac;
    }

    public void setMauSac(Colors mauSac) {
        this.mauSac = mauSac;
    }

    public String getNhaCungCap() {
        return nhaCungCap;
    }

    public void setNhaCungCap(String nhaCungCap) {
        this.nhaCungCap = nhaCungCap;
    }

    public double getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(double giaTien) {
        this.giaTien = giaTien;
    }

    @Override
    public String toString() {
        return "SanPhamDienThoai{" +
                "tenSanPham='" + tenSanPham + '\'' +
                ", mauSac=" + mauSac +
                ", nhaCungCap='" + nhaCungCap + '\'' +
                ", giaTien=" + giaTien +
                '}';
    }
}
