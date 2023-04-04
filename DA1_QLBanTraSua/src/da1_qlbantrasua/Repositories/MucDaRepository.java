/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package da1_qlbantrasua.Repositories;

import da1_qlbantrasua.DomainModels.MucDa;
import da1_qlbantrasua.ViewModels.MucDaViewModel;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public interface MucDaRepository {
    public ArrayList<MucDa> getListMucDaDB();
    public Boolean themMucDa(MucDa mucDa);
    public Boolean updateMucDa(MucDa mucDa, String id);
    public Boolean xoaMucDa(String ma);
    public ArrayList<MucDa> timKiem(String tenMucDa);
    public ArrayList<MucDaViewModel> getListView();
     public ArrayList<MucDa> all();
}
