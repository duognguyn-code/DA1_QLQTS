/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package da1_qlbantrasua.Repositories;

import da1_qlbantrasua.DomainModels.HoaDon;
import da1_qlbantrasua.ViewModels.ChiTietHoaDon;
import da1_qlbantrasua.ViewModels.DanhSachHoaDon;
import da1_qlbantrasua.ViewModels.HDBHViewModel;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public interface HoaDonRepository {
    public ArrayList<HoaDon> getListHoaDonDB();
    public Boolean themHoaDon(HoaDon hoaDon);
    public Boolean updateHoaDon(HoaDon hoaDon, String id);
    public Boolean xoaHoaDon(String ma);
    public ArrayList<HoaDon> timKiemHDDB(String tenHoaDon);
    public ArrayList<HDBHViewModel> timKiemHDView(String tenHoaDon);
    public ArrayList<HDBHViewModel> getListHDBHView();
    public ArrayList<HDBHViewModel> getListHDChuaThanhToan();
    public ArrayList<HDBHViewModel> getListHDDaThanhToan();
    public ArrayList<HDBHViewModel> getListHDHuyThanhToan();
    public ArrayList<HoaDon> getListHDChoDB();
    public Boolean huyHoaDon(String hoaDon, String maHoaDon);
    public ArrayList<DanhSachHoaDon> allDS();
    public ArrayList<ChiTietHoaDon> allCT();
    public ArrayList<DanhSachHoaDon> getListDSHoaDonDB();
    public ArrayList<ChiTietHoaDon> allCT(String ma);
    public ArrayList<DanhSachHoaDon> searchTheoKhoangTime(java.util.Date ngayTao, java.util.Date ngayThanhToan);
    public double fillNgaydt(java.util.Date ngayTao);
    public int fillNgayhd(java.util.Date ngayTao);
    public int fillNgayhdh(java.util.Date ngayTao);
    public double fillTuandt(java.util.Date ngayTao);
    public int fillTuanhd(java.util.Date ngayTao);
    public int fillTuanhdh(java.util.Date ngayTao);
    public double fillThangdt(java.util.Date ngayTao);
    public int fillThanghd(java.util.Date ngayTao);
    public int fillThanghdh(java.util.Date ngayTao);
    public double fillKhoangdt(java.util.Date ngayBD, java.util.Date ngayKT);
    public int fillKhoanghd(java.util.Date ngayBD, java.util.Date ngayKT);
    public int fillKhoanghdh(java.util.Date ngayBD, java.util.Date ngayKT);
}
