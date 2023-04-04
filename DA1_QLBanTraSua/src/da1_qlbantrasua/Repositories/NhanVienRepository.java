/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package da1_qlbantrasua.Repositories;

import da1_qlbantrasua.DomainModels.NhanVien;
import da1_qlbantrasua.ViewModels.NhanVienViewModel;
import da1_qlbantrasua.ViewModels.TaiKhoanViewModel;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public interface NhanVienRepository {
    public ArrayList<NhanVien> getListNhanVienDB();
    public NhanVien getListNhanVienDB(String maNV);
    public Boolean themNhanVien(NhanVien nhanVien);
    public Boolean suaNhanVien(NhanVien nhanVien, String maNV);
    public Boolean xoaNhanVien(String maNV);
            public ArrayList<NhanVien> timNhanVien(String tenCVTim);
    public ArrayList<NhanVien> findbyMaNv(String manv);
    public ArrayList<TaiKhoanViewModel> getListTaiKhoan();
            public ArrayList<NhanVienViewModel> listNVViewModel();
    public  Boolean checkLogin(String maNV, String matKhau); 
}
