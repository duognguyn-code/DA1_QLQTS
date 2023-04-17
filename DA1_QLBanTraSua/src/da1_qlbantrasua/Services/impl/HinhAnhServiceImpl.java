/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package da1_qlbantrasua.Services.impl;

import da1_qlbantrasua.DomainModels.HinhAnh;
import da1_qlbantrasua.Repositories.HinhAnhRepository;
import da1_qlbantrasua.Repositories.impl.HinhAnhRepositoryImpl;
import da1_qlbantrasua.Services.HinhAnhService;

/**
 *
 * @author Admin
 */
public class HinhAnhServiceImpl implements HinhAnhService{
    private HinhAnhRepository hinhanhre = new HinhAnhRepositoryImpl();

    @Override
    public String themHinhAnh(HinhAnh hinhAnh) {
        boolean them = hinhanhre.themHinhAnh(hinhAnh);
        if(them){
            return "Hình ảnh ok";
        }else{
            return "Lỗi hình ảnh";
        }
    }

    @Override
    public String updateHinhAnh(HinhAnh hinhAnh, String id) {
        boolean sua = hinhanhre.updateHinhAnh(hinhAnh, id);
        if(sua){
            return "Hình ảnh ok";
        }else{
            return "Lỗi hình ảnh";
        }
    }
    
}
