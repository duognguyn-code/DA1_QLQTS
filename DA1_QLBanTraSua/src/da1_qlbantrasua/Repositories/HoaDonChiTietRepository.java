/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package da1_qlbantrasua.Repositories;

import da1_qlbantrasua.DomainModels.HoaDonChiTiet;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public interface HoaDonChiTietRepository {
    public ArrayList<HoaDonChiTiet> getListHDCTTheoMaHD(String maHoaDon);
    public boolean themHDCT(HoaDonChiTiet hDCT);
}
