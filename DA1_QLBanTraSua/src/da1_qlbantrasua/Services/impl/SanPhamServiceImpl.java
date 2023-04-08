/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package da1_qlbantrasua.Services.impl;

import da1_qlbantrasua.DomainModels.SanPham;
import da1_qlbantrasua.Repositories.SanPhamRepository;
import da1_qlbantrasua.Repositories.impl.SanPhamRepositoryImpl;
import da1_qlbantrasua.Services.SanPhamService;
import da1_qlbantrasua.ViewModels.SanPhamFromBanHang;
import da1_qlbantrasua.ViewModels.SanPhamViewModel;
import da1_qlbantrasua.ViewModels.ThongKeSanPham;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class SanPhamServiceImpl implements SanPhamService{

    private SanPhamRepository sanPhamRepository1 = new SanPhamRepositoryImpl();
    
    @Override
    public ArrayList<SanPham> getListSanPhamDB() {
         return sanPhamRepository1.getListSanPhamDB();
    }

    @Override
    public String themSanPham(SanPham sanPham) {
       boolean them = sanPhamRepository1.themSanPham(sanPham);
        if(them){
            return "Thêm thành công";
        }else{
            return "Thêm thất bại";
        }
    }

    @Override
    public String updateSanPham(SanPham sanPham, String id) {
        boolean sua = sanPhamRepository1.updateSanPham(sanPham, id);
        if(sua){
            return "Sửa thành công";
        }else{
            return "Sửa thất bại";
        }
    }

    @Override
    public String xoaSanPham(String ma) {
 boolean xoa = sanPhamRepository1.xoaSanPham(ma);
        if(xoa){
            return "Xóa thành công";
        }else{
            return "Xóa thất bại";
        }    }

    @Override
    public ArrayList<SanPham> timKiemSPDBTheoTen(String tenSanPham) {
 return sanPhamRepository1.timKiemSPDBTheoTen(tenSanPham);    }

    @Override
    public ArrayList<SanPhamViewModel> timKiem(String tenSanPham) {
        return sanPhamRepository1.timKiem(tenSanPham);
    }

    @Override
    public ArrayList<SanPhamViewModel> getListView() {
        return sanPhamRepository1.getListView();
    }

    @Override
    public ArrayList<SanPhamFromBanHang> getListSPFormBH() {
        return sanPhamRepository1.getListSPFormBH();
    }

    @Override
    public ArrayList<ThongKeSanPham> getListTKSanPham() {
        return sanPhamRepository1.TKSanPham();
    }

    @Override
    public ArrayList<ThongKeSanPham> getListTKSanPhamTOPSLBNhieu() {
        return sanPhamRepository1.TKSanPhamTOPSLBNhieu();
    }

    @Override
    public ArrayList<ThongKeSanPham> getListTKSanPhamTOPSLBIt() {
        return sanPhamRepository1.TKSanPhamTOPSLBIt();
    }

    @Override
    public ArrayList<SanPham> getListAllSanPhamDB() {
        return sanPhamRepository1.getListAllSanPhamDB();
    }

    @Override
    public SanPham timSanPhamTheoMa(String maSP) {
        return sanPhamRepository1.timSanPhamTheoMa(maSP);
    }

    @Override
    public ArrayList<SanPhamFromBanHang> timSPTheoDanhMuc(String tenDanhMuc) {
        return sanPhamRepository1.timSPTheoDanhMuc(tenDanhMuc);
    }

    @Override
    public ArrayList<SanPhamFromBanHang> timSPTheoTen(String tenSP) {
        return sanPhamRepository1.timSPTheoTen(tenSP);
    }

    @Override
    public ArrayList<SanPham> timKiemSPDBTheoDanhMuc(String tenDanhMuc) {
        return sanPhamRepository1.timKiemSPDBTheoDanhMuc(tenDanhMuc);
    }

    @Override
    public ArrayList<SanPham> timThongTinSanPhamQuanLy(String tenSanPham) {
        return sanPhamRepository1.timThongTinSanPhamQuanLy(tenSanPham);
    }
    public static void main(String[] args) {
        ArrayList list = new SanPhamRepositoryImpl().getListAllSanPhamDB();
        System.out.println(list);
    }
}
