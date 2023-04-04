/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package da1_qlbantrasua.Repositories;

import da1_qlbantrasua.DomainModels.HinhAnh;
import da1_qlbantrasua.ViewModels.HinhAnhViewModel;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public interface HinhAnhRepository {
    public ArrayList<HinhAnh> getListHinhAnhDB();
    public Boolean themHinhAnh(HinhAnh hinhAnh);
    public Boolean updateHinhAnh(HinhAnh hinhAnh, String id);
    public Boolean xoaHinhAnh(String ma);
    public ArrayList<HinhAnh> timKiem(String tenHinhAnh);
    public ArrayList<HinhAnhViewModel> getListView();
}
