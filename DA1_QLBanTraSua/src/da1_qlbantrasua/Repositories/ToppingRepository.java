/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package da1_qlbantrasua.Repositories;

import da1_qlbantrasua.DomainModels.Topping;
import da1_qlbantrasua.ViewModels.ToppingViewModel;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public interface ToppingRepository {
    public ArrayList<Topping> getListToppingDB();
    public Boolean themTopping(Topping topping);
    public Boolean updateTopping(Topping topping, String id);
    public Boolean xoaTopping(String ma);
    public ArrayList<Topping> timKiem(String tenToppString);
    public ArrayList<ToppingViewModel> getListView();
    public ArrayList<Topping> all();
}
