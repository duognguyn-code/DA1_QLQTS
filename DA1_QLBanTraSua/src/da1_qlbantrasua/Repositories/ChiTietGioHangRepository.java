/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package da1_qlbantrasua.Repositories;

import da1_qlbantrasua.DomainModels.CTGioHang;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public interface ChiTietGioHangRepository {
    public ArrayList<CTGioHang> getListCTGioHang(String maHoaDon);
    public ArrayList<CTGioHang> hoaDonAo();
    public Boolean themCTGH(CTGioHang cTGioHang);
    public Boolean suaCTGH(CTGioHang cTGioHang, String id);
    public Boolean xoaCTGH(String idCTGH);
    public Boolean xoaCTGHKhiThanhToan(String maHoaDon);
    public Boolean xoaToanBoGioHang(String maHoaDon);
}
