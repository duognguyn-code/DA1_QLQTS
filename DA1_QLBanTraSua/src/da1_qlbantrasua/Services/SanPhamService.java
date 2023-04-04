/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package da1_qlbantrasua.Services;

import da1_qlbantrasua.DomainModels.SanPham;
import da1_qlbantrasua.ViewModels.SanPhamFromBanHang;
import da1_qlbantrasua.ViewModels.SanPhamViewModel;
import da1_qlbantrasua.ViewModels.ThongKeSanPham;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public interface SanPhamService {
    public ArrayList<SanPham> getListSanPhamDB();
    public String themSanPham(SanPham sanPham);
    public String updateSanPham(SanPham sanPham, String id);
    public String xoaSanPham(String ma);
    public ArrayList<SanPham> timKiemSPDBTheoTen(String tenSanPham);
    public ArrayList<SanPhamViewModel> timKiem(String tenSanPham);
    public ArrayList<SanPhamViewModel> getListView();
    public ArrayList<SanPhamFromBanHang> getListSPFormBH();
    public ArrayList<ThongKeSanPham> getListTKSanPham();
    public ArrayList<ThongKeSanPham> getListTKSanPhamTOPSLBNhieu();
    public ArrayList<ThongKeSanPham> getListTKSanPhamTOPSLBIt();
    public ArrayList<SanPham> getListAllSanPhamDB();
    public SanPham timSanPhamTheoMa(String maSP);
    public ArrayList<SanPhamFromBanHang> timSPTheoDanhMuc(String tenDanhMuc);
    public ArrayList<SanPhamFromBanHang> timSPTheoTen(String tenSP);
    public ArrayList<SanPham> timKiemSPDBTheoDanhMuc(String tenDanhMuc);
    public ArrayList<SanPham> timThongTinSanPhamQuanLy(String tenSanPham);
}
