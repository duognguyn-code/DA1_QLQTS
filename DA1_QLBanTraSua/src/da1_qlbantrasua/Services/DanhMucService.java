/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package da1_qlbantrasua.Services;

import da1_qlbantrasua.DomainModels.DanhMucSP;
import da1_qlbantrasua.ViewModels.DanhMucSPViewModel;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public interface DanhMucService {
    public ArrayList<DanhMucSP> getListDanhMucSPDB();

    public ArrayList<DanhMucSP> getListAllDanhMucSPDB();

    public ArrayList<DanhMucSP> getListDanhMucSPKinhDoanhDB();

    public String themDanhMucSP(DanhMucSP mucDa);

    public String updateDanhMucSP(DanhMucSP mucDa, String id);

    public String xoaDanhMucSP(String ma);

    public ArrayList<DanhMucSP> timKiem(String tenDanhMucSP);

    public ArrayList<DanhMucSPViewModel> getListView();
}
