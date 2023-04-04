/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package da1_qlbantrasua.Repositories;

import da1_qlbantrasua.DomainModels.KhachHang;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public interface KhachHangRespository {
    public ArrayList<KhachHang> getListKhachHangDB();
    public ArrayList<KhachHang> all();
    public Boolean themKhachHang(KhachHang k);
    public Boolean updateKhachHang(KhachHang k, String id);
    public Boolean xoaKhachHang(String ma);
    public KhachHang timKhachHangBySDT(String sDT);
    public Boolean updateDiemKhachHang(int diem, String sdt);
}
