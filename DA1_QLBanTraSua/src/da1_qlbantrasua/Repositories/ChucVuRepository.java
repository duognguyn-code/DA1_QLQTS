/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package da1_qlbantrasua.Repositories;

import da1_qlbantrasua.DomainModels.ChucVu;
import da1_qlbantrasua.ViewModels.ChucVuViewModel;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public interface ChucVuRepository {
    public ArrayList<ChucVu> getListChucVuDB();
    public Boolean themChucVu(ChucVu chucVu);
    public Boolean suaChucVu(ChucVu chucVu, String maCV);
    public Boolean xoaChucVU(String maCV);
    
    public ArrayList<ChucVuViewModel> listCVViewModel();
}
