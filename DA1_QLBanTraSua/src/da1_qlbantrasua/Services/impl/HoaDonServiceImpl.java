/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package da1_qlbantrasua.Services.impl;

import da1_qlbantrasua.DomainModels.HoaDon;
import da1_qlbantrasua.Repositories.HoaDonRepository;
import da1_qlbantrasua.Repositories.impl.HoaDonRepositoryImpl;
import da1_qlbantrasua.Services.HoaDonService;
import da1_qlbantrasua.ViewModels.ChiTietHoaDon;
import da1_qlbantrasua.ViewModels.DanhSachHoaDon;
import da1_qlbantrasua.ViewModels.HDBHViewModel;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class HoaDonServiceImpl implements HoaDonService{

    private HoaDonRepository hoadonrepo = new HoaDonRepositoryImpl();
    
    @Override
    public ArrayList<HoaDon> getListHoaDonDB() {
       return hoadonrepo.getListHDChoDB();
    }

    @Override
    public String themHoaDon(HoaDon hoaDon) {
        boolean them = hoadonrepo.themHoaDon(hoaDon);
        if (them) {
            return "Tạo mới hóa đơn thành công!";
        } else {
            return "Tạo hóa đơn thất bại!";
        }
    }

    @Override
    public String updateHoaDon(HoaDon hoaDon, String maHoaDon) {
       boolean update = hoadonrepo.updateHoaDon(hoaDon, maHoaDon);
        if (update) {
            return "Update hóa đơn thành công!";
        } else {
            return "Update hóa đơn thất bại!";
        }
    }

    @Override
    public String xoaHoaDon(String ma) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<HoaDon> timKiemHDDB(String tenHoaDon) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<HDBHViewModel> timKiemHDView(String tenHoaDon) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<HDBHViewModel> getListHDBHView() {
        return hoadonrepo.getListHDBHView();
    }

    @Override
    public ArrayList<HDBHViewModel> getListHDChuaThanhToan() {
        return hoadonrepo.getListHDChuaThanhToan();
    }

    @Override
    public ArrayList<HDBHViewModel> getListHDDaThanhToan() {
        return hoadonrepo.getListHDDaThanhToan();
    }

    @Override
    public ArrayList<HDBHViewModel> getListHDHuyThanhToan() {
       return hoadonrepo.getListHDHuyThanhToan();
    }

    @Override
    public ArrayList<HoaDon> getListHDChoDB() {
        return hoadonrepo.getListHDChoDB();
    }

    @Override
    public String huyHoaDon(String lyDoHuy, String maHoaDon) {
        boolean huy = hoadonrepo.huyHoaDon(lyDoHuy, maHoaDon);
        if (huy) {
            return "Hóa đơn đã bị hủy!";
        } else {
            return "Hủy không thành công!";
        }
    }

    @Override
    public ArrayList<DanhSachHoaDon> getListDS() {
       return this.hoadonrepo.allDS();
    }

    @Override
    public ArrayList<ChiTietHoaDon> getListCT() {
        return this.hoadonrepo.allCT();
    }

    @Override
    public ArrayList<DanhSachHoaDon> searchTheoKhoangTime(Date ngayTao, Date ngayThanhToan) {
         return hoadonrepo.searchTheoKhoangTime(ngayTao, ngayThanhToan);
    }

    @Override
    public ArrayList<DanhSachHoaDon> getListDSHoaDonDB() {
        return hoadonrepo.getListDSHoaDonDB();
    }

    @Override
    public ArrayList<ChiTietHoaDon> getListCTTheoMa(String ma) {
       return hoadonrepo.allCT(ma);
    }

//    @Override
//    public int fillNgay(Date ngayTao) {
//        return hoadonrepo.fillNgaydt(ngayTao);
//    }

    @Override
    public double fillNgaydt(Date ngayTao) {
        return hoadonrepo.fillNgaydt(ngayTao);
    }

    @Override
    public int fillNgayhd(Date ngayTao) {
        return hoadonrepo.fillNgayhd(ngayTao);
    }

    @Override
    public int fillNgayhdh(Date ngayTao) {
        return hoadonrepo.fillNgayhdh(ngayTao);
    }

    @Override
    public double fillTuandt(Date ngayTao) {
        return hoadonrepo.fillTuandt(ngayTao);
    }

    @Override
    public int fillTuanhd(Date ngayTao) {
        return hoadonrepo.fillTuanhd(ngayTao);
    }

    @Override
    public int fillTuanhdh(Date ngayTao) {
        return hoadonrepo.fillTuanhdh(ngayTao);
    }

    @Override
    public double fillThangdt(Date ngayTao) {
        return hoadonrepo.fillThangdt(ngayTao);
    }

    @Override
    public int fillThanghd(Date ngayTao) {
        return hoadonrepo.fillThanghd(ngayTao);
    }

    @Override
    public int fillThanghdh(Date ngayTao) {
        return hoadonrepo.fillThanghdh(ngayTao);
    }

    @Override
    public double fillKhoangdt(Date ngayBD, Date ngayKT) {
        return hoadonrepo.fillKhoangdt(ngayBD, ngayKT);
    }

    @Override
    public int fillKhoanghd(Date ngayBD, Date ngayKT) {
        return hoadonrepo.fillKhoanghd(ngayBD, ngayKT);
    }

    @Override
    public int fillKhoanghdh(Date ngayBD, Date ngayKT) {
        return hoadonrepo.fillKhoanghdh(ngayBD, ngayKT);
    }
    
}
