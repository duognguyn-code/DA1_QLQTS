/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package da1_qlbantrasua.Services;

import da1_qlbantrasua.DomainModels.KhuyenMai;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public interface KhuyenMaiService {
    public ArrayList<KhuyenMai> getListKhuyenMaiDB();
    public String themKhuyenMai(KhuyenMai km);
    public String updateKhuyenMai(KhuyenMai km, String id);
    public String xoaKhuyenMai(String ma);
    public ArrayList<KhuyenMai> getList();
}
