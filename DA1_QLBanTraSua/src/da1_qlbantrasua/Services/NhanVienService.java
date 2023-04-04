/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package da1_qlbantrasua.Services;

import da1_qlbantrasua.DomainModels.CTGioHang;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public interface NhanVienService {
    public ArrayList<CTGioHang> getListCTGioHang(String maHoaDon);
    public ArrayList<CTGioHang> hoaDonAo();
    public String themCTGH(CTGioHang cTGioHang);
    public String suaCTGH(CTGioHang cTGioHang, String id);
    public String xoaCTGH(String idCTGH);
    public String xoaCTGHKhiThanhToan(String maHoaDon);
    public String xoaToanBoGioHang(String maHoaDon);
}
