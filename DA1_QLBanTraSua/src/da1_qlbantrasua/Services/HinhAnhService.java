/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package da1_qlbantrasua.Services;

import da1_qlbantrasua.DomainModels.HinhAnh;

/**
 *
 * @author Admin
 */
public interface HinhAnhService {
    public String themHinhAnh(HinhAnh hinhAnh);
    public String updateHinhAnh(HinhAnh hinhAnh, String id);
}
