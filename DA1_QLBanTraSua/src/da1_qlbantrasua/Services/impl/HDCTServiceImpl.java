/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package da1_qlbantrasua.Services.impl;

import da1_qlbantrasua.DomainModels.HoaDonChiTiet;
import da1_qlbantrasua.Repositories.HoaDonChiTietRepository;
import da1_qlbantrasua.Repositories.impl.HDCTRepositoryImpl;
import da1_qlbantrasua.Services.HDCTService;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class HDCTServiceImpl implements HDCTService{
private HoaDonChiTietRepository hoaDonChiTiet = new HDCTRepositoryImpl();
    @Override
    public ArrayList<HoaDonChiTiet> getListHDCTTheoMaHD(String maHoaDon) {
        return hoaDonChiTiet.getListHDCTTheoMaHD(maHoaDon);
    }

    @Override
    public String themHDCT(HoaDonChiTiet hDCT) {
        boolean them = hoaDonChiTiet.themHDCT(hDCT);
        if(them){
            return "Thêm hóa đơn chi tiết thành công";
        }else{
            return "Thêm hóa đơn chi tiết thất bại";
        }
    }
    
}
