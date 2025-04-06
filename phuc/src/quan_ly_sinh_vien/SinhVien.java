/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quan_ly_sinh_vien;

import java.util.Date;

/**
 *
 * @author vukof
 */
public class SinhVien {
    private String MaSV, TenSV;
    private String NgaySinh;
    private String TenKhoa;
    private  String Anh;

    public String getAnh() {
        return Anh;
    }

    public void setAnh(String Anh) {
        this.Anh = Anh;
    }

    public SinhVien() {
    }

    public SinhVien(String MaSV, String TenSV, String NgaySinh, String TenKhoa, String Anh) {
        this.MaSV = MaSV;
        this.TenSV = TenSV;
        this.NgaySinh = NgaySinh;
        this.TenKhoa = TenKhoa;
        this.Anh = Anh;
    }

    public String getMaSV() {
        return MaSV;
    }

    public void setMaSV(String MaSV) {
        this.MaSV = MaSV;
    }

    public String getTenSV() {
        return TenSV;
    }

    public void setTenSV(String TenSV) {
        this.TenSV = TenSV;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getTenKhoa() {
        return TenKhoa;
    }

    public void setTenKhoa(String TenKhoa) {
        this.TenKhoa = TenKhoa;
    }

    @Override
    public String toString() {
     String msg = String.format("%s,%s,%s,%s,%s",MaSV,TenSV,NgaySinh,TenKhoa,Anh);
        return msg;
    }
}
