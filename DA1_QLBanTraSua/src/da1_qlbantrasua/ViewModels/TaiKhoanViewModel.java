/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package da1_qlbantrasua.ViewModels;

/**
 *
 * @author Admin
 */
public class TaiKhoanViewModel {
    private String maNV;
    private String matKhau;
    private String chucVu;

    public TaiKhoanViewModel() {
    }

    public TaiKhoanViewModel(String maNV, String matKhau, String chucVu) {
        this.maNV = maNV;
        this.matKhau = matKhau;
        this.chucVu = chucVu;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }
    
}
