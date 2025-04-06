/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quan_ly_sinh_vien;

/**
 *
 * @author vukof
 */
public class Lop implements Comparable<Lop> {

    private String maLop, tenLop, giangVien;
    private int siSo;

    public Lop() {
    }

    public Lop(String maLop, String tenLop, String giangVien, int siSo) {
        this.maLop = maLop;
        this.tenLop = tenLop;
        this.giangVien = giangVien;
        this.siSo = siSo;
    }

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public String getGiangVien() {
        return giangVien;
    }

    public void setGiangVien(String giangVien) {
        this.giangVien = giangVien;
    }

    public int getSiSo() {
        return siSo;
    }

    public void setSiSo(int siSo) {
        this.siSo = siSo;
    }

    @Override
    public String toString() {
        String msg = String.format("%s,%s,%s,%d",maLop,tenLop,giangVien,siSo);
        return msg;
    }

    @Override
    public int compareTo(Lop o) {
        if (tenLop.compareTo(o.tenLop) > 0) {
            return 1;
        } else if (tenLop == o.tenLop) {
            return 0;
        } else {
            return -1;
        }
    }

}
