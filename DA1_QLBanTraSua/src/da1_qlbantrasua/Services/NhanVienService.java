/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package da1_qlbantrasua.Services;

import da1_qlbantrasua.DomainModels.CTGioHang;
import da1_qlbantrasua.DomainModels.NhanVien;
import da1_qlbantrasua.ViewModels.NhanVienViewModel;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public interface NhanVienService {
    public ArrayList<NhanVien> getListNSXDB();
    public NhanVien getListNhanVienDB(String maNV);
    public String themNhanVien(NhanVien nhanVien);
    
    public String suaNhanVien(NhanVien nhanVien, String maNVSua);
    
    public String xoaNhanVien(String maNVXoa);
    
    public ArrayList<NhanVien> timKiemNV(String tenNV);
    
    public ArrayList<NhanVien> findByMaNv(String maNV);
    
    
    
    public ArrayList<NhanVienViewModel> listNVViewModel();
}
