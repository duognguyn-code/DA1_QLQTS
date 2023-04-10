/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package da1_qlbantrasua.Services.impl;

import da1_qlbantrasua.Repositories.NhanVienRepository;
import da1_qlbantrasua.Repositories.impl.NhanVienRepositoryImpl;
import da1_qlbantrasua.Services.LoginService;

/**
 *
 * @author Admin
 */
public class LoginServiceImpl implements LoginService {

    private NhanVienRepository nhanvien = new NhanVienRepositoryImpl();

    @Override
    public String checkLogin(String maNV, String matKhau) {
        Boolean checkLogin = nhanvien.checkLogin(maNV, matKhau);
        if (checkLogin) {
            return "Đăng nhập thành công!";
        } else {
            return "Đăng nhập thất bại!";
        }
    }

}
