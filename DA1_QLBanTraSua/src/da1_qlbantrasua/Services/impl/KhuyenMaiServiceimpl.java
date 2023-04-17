/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package da1_qlbantrasua.Services.impl;

import da1_qlbantrasua.DomainModels.KhuyenMai;
import da1_qlbantrasua.Repositories.KhuyenMaiRespository;
import da1_qlbantrasua.Repositories.impl.KhuyenMaiRespositoryimpl;
import da1_qlbantrasua.Services.KhuyenMaiService;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class KhuyenMaiServiceimpl implements KhuyenMaiService {

    private KhuyenMaiRespository prodkm = new KhuyenMaiRespositoryimpl();

    @Override
    public ArrayList<KhuyenMai> getListKhuyenMaiDB() {
        return this.prodkm.getListKhuyenMaiDB();
    }

    @Override
    public String themKhuyenMai(KhuyenMai km) {
        boolean them = prodkm.themKhuyenMai(km);
        if (them) {
            return "Thêm thành công";
        } else {
            return "Thêm thất bại";
        }
    }

    @Override
    public String updateKhuyenMai(KhuyenMai km, String id) {
        boolean them = prodkm.updateKhuyenMai(km, id);
        if (them) {
            return "Sửa thành công";
        } else {
            return "Sửa thất bại";
        }
    }

    @Override
    public String xoaKhuyenMai(String ma) {
        boolean them = prodkm.xoaKhuyenMai(ma);
        if (them) {
            return "Xóa thành công";
        } else {
            return "Xóa thất bại";
        }
    }

    @Override
    public ArrayList<KhuyenMai> getList() {
        return this.prodkm.all();
    }

}
