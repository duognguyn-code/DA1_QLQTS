/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package da1_qlbantrasua.Repositories;

import da1_qlbantrasua.DomainModels.KhuyenMai;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public interface KhuyenMaiRespository {
    public ArrayList<KhuyenMai> getListKhuyenMaiDB();
    public ArrayList<KhuyenMai> all();
    public Boolean themKhuyenMai(KhuyenMai km);
    public Boolean updateKhuyenMai(KhuyenMai km, String id);
    public Boolean xoaKhuyenMai(String ma);
}
