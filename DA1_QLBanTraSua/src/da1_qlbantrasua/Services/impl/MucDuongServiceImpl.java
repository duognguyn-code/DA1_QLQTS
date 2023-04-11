/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package da1_qlbantrasua.Services.impl;

import da1_qlbantrasua.DomainModels.MucDuong;
import da1_qlbantrasua.Repositories.MucDuongRepository;
import da1_qlbantrasua.Repositories.impl.MucDuongRepositoryImpl;
import da1_qlbantrasua.Services.MucDuongService;
import da1_qlbantrasua.ViewModels.MucDuongViewModel;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class MucDuongServiceImpl implements MucDuongService{
    private MucDuongRepository mucDuongRepository = new MucDuongRepositoryImpl();
    @Override
    public ArrayList<MucDuong> getListMucDuongDB() {
        return mucDuongRepository.getListMucDuongDB();
    }

    @Override
    public String themMucDuong(MucDuong mucDuong) {
        boolean them = mucDuongRepository.themMucDuong(mucDuong);
        if(them){
            return "Thêm thành công";
        }else{
            return "Thêm thất bại";
        }
    }

    @Override
    public String updateMucDuong(MucDuong mucDuong, String id) {
        boolean update = mucDuongRepository.updateMucDuong(mucDuong, id);
        if(update){
            return "Sửa thành công";
        }else{
            return "Sửa thất bại";
        }
    }

    @Override
    public String xoaMucDuong(String ma) {
        boolean xoa = mucDuongRepository.xoaMucDuong(ma);
        if(xoa){
            return "Xóa thành công";
        }else{
            return "Xóa thất bại";
        }
    }

    @Override
    public ArrayList<MucDuong> timKiem(String tenMucDuong) {
        return mucDuongRepository.timKiem(tenMucDuong);
    }

    @Override
    public ArrayList<MucDuongViewModel> getListView() {
        return mucDuongRepository.getListView();
    }

    @Override
    public ArrayList<MucDuong> all() {
        return mucDuongRepository.all();
    }
    
}
