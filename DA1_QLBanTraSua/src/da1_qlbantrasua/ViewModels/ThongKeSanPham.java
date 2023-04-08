/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package da1_qlbantrasua.ViewModels;

/**
 *
 * @author Admin
 */
public class ThongKeSanPham {
    private String ma;
    private String ten;
    private double gia;
    private int soLuongBan;
    private double  doanhThu;
    private int trangThai;

    public ThongKeSanPham() {
    }

    public ThongKeSanPham(String ma, String ten, double gia, int soLuongBan, double doanhThu, int trangThai) {
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
        this.soLuongBan = soLuongBan;
        this.doanhThu = doanhThu;
        this.trangThai = trangThai;
    }
    public ThongKeSanPham(String ma, String ten, double gia, int soLuongBan, int trangThai) {
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
        this.soLuongBan = soLuongBan;
        this.trangThai = trangThai;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public int getSoLuongBan() {
        return soLuongBan;
    }

    public void setSoLuongBan(int soLuongBan) {
        this.soLuongBan = soLuongBan;
    }

    public double getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(double doanhThu) {
        this.doanhThu = doanhThu;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }
    
}
