/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package da1_qlbantrasua.Services;

import da1_qlbantrasua.DomainModels.Size;
import da1_qlbantrasua.ViewModels.SizeViewModel;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public interface SizeService {
    public ArrayList<Size> getListSizeDB();

    public String themSize(Size size);

    public String updateSize(Size size, String id);

    public String xoaSize(String ma);

    public ArrayList<Size> timKiem(String tenSize);

    public ArrayList<SizeViewModel> getListView();

    public ArrayList<Size> getListAllSizeDB();
    
    public ArrayList<Size> getListSizeKinhDoanh();
}
