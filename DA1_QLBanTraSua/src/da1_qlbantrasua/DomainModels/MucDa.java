/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package da1_qlbantrasua.DomainModels;

/**
 *
 * @author Admin
 */
public class MucDa {
    private String id;
    private String ma;
    private String ten;
    private double gia;
    private int trangThai;

    public MucDa() {
    }

    public MucDa(String id, String ten) {
        this.id = id;
        this.ten = ten;
    }
    

    public MucDa(String id, String ma, String ten, double gia, int trangThai) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
        this.trangThai = trangThai;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }
    
    
}
