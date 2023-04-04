/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package da1_qlbantrasua.Repositories;

import da1_qlbantrasua.DomainModels.DanhMucSP;
import da1_qlbantrasua.ViewModels.DanhMucSPViewModel;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public interface DanhMucRepository {
    public ArrayList<DanhMucSP> getListDanhMucSPDB();
    public ArrayList<DanhMucSP> getListAllDanhMucSPDB();
    public ArrayList<DanhMucSP> getListDanhMucSPKinhDoanhDB();
    public Boolean themDanhMucSP(DanhMucSP danhMucSP);
    public Boolean updateDanhMucSP(DanhMucSP danhMucSP, String id);
    public Boolean xoaDanhMucSP(String ma);
    public ArrayList<DanhMucSP> timKiem(String tenDanhMucSP);
    public ArrayList<DanhMucSPViewModel> getListView();
}
