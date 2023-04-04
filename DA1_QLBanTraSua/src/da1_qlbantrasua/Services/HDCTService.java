/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package da1_qlbantrasua.Services;

import da1_qlbantrasua.DomainModels.HoaDonChiTiet;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public interface HDCTService {
    public ArrayList<HoaDonChiTiet> getListHDCTTheoMaHD(String maHoaDon);
    public String themHDCT(HoaDonChiTiet hDCT);
}
