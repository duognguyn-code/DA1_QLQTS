/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package da1_qlbantrasua.Services.impl;

import da1_qlbantrasua.DomainModels.DanhMucSP;
import da1_qlbantrasua.Repositories.DanhMucRepository;
import da1_qlbantrasua.Repositories.impl.DanhMucSPRepositoryImpl;
import da1_qlbantrasua.Services.DanhMucService;
import da1_qlbantrasua.ViewModels.DanhMucSPViewModel;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class DanhMucServiceImpl implements DanhMucService{
    private DanhMucRepository danhMucRepository = new DanhMucSPRepositoryImpl();
    public static void main(String[] args) {
        ArrayList<DanhMucSP> list = new DanhMucServiceImpl().getListDanhMucSPDB();
        for (DanhMucSP danhMucSP : list) {
            System.out.println(danhMucSP.getTen());
        }
    }

    @Override
    public ArrayList<DanhMucSP> getListDanhMucSPDB() {
        return danhMucRepository.getListDanhMucSPDB();   
    }

    @Override
    public ArrayList<DanhMucSP> getListAllDanhMucSPDB() {
        return danhMucRepository.getListAllDanhMucSPDB();
    }

    @Override
    public ArrayList<DanhMucSP> getListDanhMucSPKinhDoanhDB() {
return danhMucRepository.getListDanhMucSPKinhDoanhDB();    }

    @Override
    public String themDanhMucSP(DanhMucSP mucDa) {
        boolean them = danhMucRepository.themDanhMucSP(mucDa);
        if(them){
            return "Thêm thành công";
        }else{
            return "Thêm thất bại";
        }
    }

    @Override
    public String updateDanhMucSP(DanhMucSP danhMuc, String id) {
        boolean them = danhMucRepository.updateDanhMucSP(danhMuc, id);
        if(them){
            return "Thêm thành công";
        }else{
            return "Thêm thất bại";
        }    }

    @Override
    public String xoaDanhMucSP(String ma) {
 boolean xoa = danhMucRepository.xoaDanhMucSP(ma);
        if(xoa){
            return "Xóa thành công";
        }else{
            return "Xóa thất bại";
        }    }

    @Override
    public ArrayList<DanhMucSP> timKiem(String tenDanhMucSP) {
        return danhMucRepository.timKiem(tenDanhMucSP);
    }

    @Override
    public ArrayList<DanhMucSPViewModel> getListView() {
        return danhMucRepository.getListView();
    }
    
}
