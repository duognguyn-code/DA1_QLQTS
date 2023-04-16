/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package da1_qlbantrasua.Services;

import da1_qlbantrasua.DomainModels.KhachHang;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public interface KhachHangService {
    public ArrayList<KhachHang> getListKhachHangDB();
    public String themKhachHang(KhachHang k);
    public String updateKhachHang(KhachHang k, String id);
    public String xoaKhachHang(String ma);
    public ArrayList<KhachHang> getList();
    public KhachHang timKhachHangBySDT(String sdt);
    public String updateDiemKhachHang(int diem, String sdt);
    public ArrayList<KhachHang> all();
    
}
