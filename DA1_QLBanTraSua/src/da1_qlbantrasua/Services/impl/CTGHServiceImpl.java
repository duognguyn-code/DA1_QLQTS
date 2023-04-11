/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package da1_qlbantrasua.Services.impl;

import da1_qlbantrasua.DomainModels.CTGioHang;
import da1_qlbantrasua.Repositories.ChiTietGioHangRepository;
import da1_qlbantrasua.Repositories.impl.CTGHRepositoryImpl;
import da1_qlbantrasua.Services.CTGHServiece;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class CTGHServiceImpl implements CTGHServiece{
    private ChiTietGioHangRepository chitietgioihangRepository = new CTGHRepositoryImpl();    

    @Override
    public ArrayList<CTGioHang> getListCTGioHang(String maHoaDon) {
        return chitietgioihangRepository.getListCTGioHang(maHoaDon);
    }

    @Override
    public ArrayList<CTGioHang> hoaDonAo() {
       return chitietgioihangRepository.hoaDonAo();
    }

    @Override
    public String themCTGH(CTGioHang cTGioHang) {
        boolean them = chitietgioihangRepository.themCTGH(cTGioHang);
        if(them){
            return "Thêm sản phẩm thành công!";
        }else{
            return "Thêm sản phẩm thất bại!";
        }
    }

    @Override
    public String suaCTGH(CTGioHang cTGioHang, String id) {
       boolean sua = chitietgioihangRepository.suaCTGH(cTGioHang, id);
        if(sua){
            return "Sửa sản phẩm thành công!";
        }else{
            return "Sửa sản phẩm thất bại!";
        }
    }

    @Override
    public String xoaCTGH(String idCTGH) {
        boolean xoa = chitietgioihangRepository.xoaCTGH(idCTGH);
        if(xoa){
            return "Xóa sản phẩm thành công!";
        }else{
            return "Xóa sản phẩm thất bại!";
        }
    }

    @Override
    public String xoaCTGHKhiThanhToan(String maHoaDon) {
        boolean xoa = chitietgioihangRepository.xoaCTGHKhiThanhToan(maHoaDon);
        if(xoa){
            return "Thanh toán thành công";
        }else{
            return "Thanh toán thất bại";
        }
    }

    @Override
    public String xoaToanBoGioHang(String maHoaDon) {
         boolean xoa = chitietgioihangRepository.xoaToanBoGioHang(maHoaDon);
        if(xoa){
            return "Xóa hết giỏ hàng!";
        }else{
            return "Xóa không thành công!";
        }
    }
    
}
