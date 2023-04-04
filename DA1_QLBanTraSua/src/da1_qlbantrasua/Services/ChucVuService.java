/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package da1_qlbantrasua.Services;

import da1_qlbantrasua.DomainModels.ChucVu;
import da1_qlbantrasua.ViewModels.ChucVuViewModel;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public interface ChucVuService {
    public ArrayList<ChucVuViewModel> getListCVDB();
    
    public String themChucVu(ChucVu cv);
    
    public String suaChucVu(ChucVu cv, String maCv);
    
    public String xoaChucVu(String maCv);
    
    public ArrayList<ChucVu> getListChucVuDB();
}
