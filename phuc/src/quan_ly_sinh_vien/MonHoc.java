/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quan_ly_sinh_vien;

/**
 *
 * @author vukofs
 */
public class MonHoc {
    private String MaMon, TenMon;
    private int SoTc;
    private String MaKhoa;

    public MonHoc() {
    }

    public MonHoc(String MaMon, String TenMon, int SoTc, String MaKhoa) {
        this.MaMon = MaMon;
        this.TenMon = TenMon;
        this.SoTc = SoTc;
        this.MaKhoa = MaKhoa;
    }

    public String getMaMon() {
        return MaMon;
    }

    public void setMaMon(String MaMon) {
        this.MaMon = MaMon;
    }

    public String getTenMon() {
        return TenMon;
    }

    public void setTenMon(String TenMon) {
        this.TenMon = TenMon;
    }

    public int getSoTc() {
        return SoTc;
    }

    public void setSoTc(int SoTc) {
        this.SoTc = SoTc;
    }

    public String getMaKhoa() {
        return MaKhoa;
    }

    public void setMaKhoa(String MaKhoa) {
        this.MaKhoa = MaKhoa;
    }

    @Override
    public String toString() {
          String msg = String.format("%s,%s,%d,%s",MaMon, TenMon, SoTc,MaKhoa);
        return msg;
    }
}
