/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package da1_qlbantrasua.Repositories;

import da1_qlbantrasua.DomainModels.Size;
import da1_qlbantrasua.ViewModels.SizeViewModel;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public interface SizeRepository {
    public ArrayList<Size> getListSizeKinhDoanh();
    public ArrayList<Size> getListSizeDB();
    public ArrayList<Size> getListAllSizeDB();
    public Boolean themSize(Size size);
    public Boolean updateSize(Size size, String id);
    public Boolean xoaSize(String ma);
    public ArrayList<Size> timKiem(String tenSize);
    public ArrayList<SizeViewModel> getListView();
}
