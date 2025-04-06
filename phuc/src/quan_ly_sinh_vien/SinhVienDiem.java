/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quan_ly_sinh_vien;

import java.util.Comparator;

/**
 *
 * @author vukof
 */
public class SinhVienDiem{
   private String maSV, hoTen, lop;
    private double diem, Ktr15p, Ktr1tiet, Thi;
    private double diemTB;
    private String ketQua, loai;

    public SinhVienDiem() {
    }

    public SinhVienDiem(String maSV, String hoTen, double diem, String lop, double Ktr15p, double Ktr1tiet, double Thi) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diem = diem;
        this.lop = lop;
        this.Ktr15p = Ktr15p;
        this.Ktr1tiet = Ktr1tiet;
        this.Thi = Thi;
        tinhDiemTB();
        xacDinhKetQua();
        xepLoai();
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public double getKtr15p() {
        return Ktr15p;
    }

    public void setKtr15p(double Ktr15p) {
        this.Ktr15p = Ktr15p;
         
        tinhDiemTB();
        xacDinhKetQua();
        xepLoai();
    }

    public double getKtr1tiet() {
        return Ktr1tiet;
    }

    public void setKtr1tiet(double Ktr1tiet) {
        this.Ktr1tiet = Ktr1tiet;
        tinhDiemTB();
        xacDinhKetQua();
        xepLoai();
    }

    public double getThi() {
        return Thi;
    }

    public void setThi(double Thi) {
        this.Thi = Thi;
    }
    public double getDiemTB() {
        return diemTB;
    }

    public String getKetQua() {
        return ketQua;
    }

    public String getLoai() {
        return loai;
    }
     private void tinhDiemTB() {
        this.diemTB = (Ktr15p + Ktr1tiet*2 + Thi*3) / 6;
    }

    private void xacDinhKetQua() {
        this.ketQua = diemTB >= 5 ? "Đậu" : "Rớt";
    }

    private void xepLoai() {
        if (diemTB >= 9) {
            this.loai = "Xuất sắc";
        } else if (diemTB >= 8) {
            this.loai = "Giỏi";
        } else if (diemTB >= 6.5) {
            this.loai = "Khá";
        } else if (diemTB >= 5) {
            this.loai = "Trung bình";
        } else {
            this.loai = "Rớt";
        }
    }

     @Override
    public String toString() {
        return String.format("%s,%s,%.2f,%.2f,%.2f,%.2f,%s,%s,%s",
            maSV, hoTen, Ktr15p, Ktr1tiet, Thi, diemTB, ketQua, loai, lop);
    }
}
