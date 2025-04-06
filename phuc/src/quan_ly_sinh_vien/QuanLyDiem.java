/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quan_ly_sinh_vien;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vukof
 */
public class QuanLyDiem {

     private List<SinhVienDiem> data;

    public QuanLyDiem() {
        data = new ArrayList<>();
    }

    public QuanLyDiem(List<SinhVienDiem> data) {
        this.data = data;
    }

    public List<SinhVienDiem> getData() {
        return data;
    }

    public void setData(List<SinhVienDiem> data) {
        this.data = data;
    }

    //thêm diem cua sinh vien
    public void Them(SinhVienDiem sv) {
        data.add(sv);
    }

    // hien thi tt sinh vien
    public void HienThi() {
        String msg = "";
        for (SinhVienDiem sinhvien : data) {
            msg += sinhvien.toString() + "\n";
        }
    }

    // xóa
    public void Xoa(SinhVienDiem sv) {
        for (SinhVienDiem sinhvien : data) {
            if (sinhvien.getMaSV().equals(sv.getMaSV())) {
                data.remove(sinhvien);
                break;
            }
        }
    }

    // sửa diểm
    public void Sua(SinhVienDiem sv) {
        for (SinhVienDiem sinhvien : data) {
            if (sinhvien.getMaSV().equals(sv.getMaSV())) {
                sinhvien.setDiem(sv.getDiem());
                sinhvien.setHoTen(sv.getHoTen());
                sinhvien.setKtr15p(sv.getKtr15p());
                sinhvien.setKtr1tiet(sv.getKtr1tiet());
                sinhvien.setThi(sv.getThi());
                sinhvien.setLop(sv.getLop());
            }
        }
    }

    //tiem kiem bang maSV
    public boolean TimKiem(String tk) {
        for (SinhVienDiem sinhvien : data) {
            if (sinhvien.getMaSV().equals(tk)
                    || sinhvien.getHoTen().equals(tk)) {
                return true;

            }
        }
        return false;
    }

    //tải thông tin sinh viên lên
    public void GhiGile(String filename) {
        File fl = new File(filename);
        try {
            FileWriter fw = new FileWriter(fl);
            for (SinhVienDiem sv : data) {
                fw.write(sv.toString() + "\n");
            }
            fw.close();

        } catch (IOException ex) {
            Logger.getLogger(DocGhiFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //tải thông tin sinh viên lên
    public List<SinhVienDiem> DocFile(String filename) {
        List<SinhVienDiem> datasv = new ArrayList<>();
        File file = new File(filename);
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while ((line = br.readLine()) != null) {
                String[] str = line.split(",");
                SinhVienDiem sv = new SinhVienDiem();
                sv.setMaSV(str[0]);
                sv.setHoTen(str[1]);
                 sv.setKtr15p(Double.parseDouble(str[2]));
                sv.setKtr1tiet(Double.parseDouble(str[3]));
                sv.setThi(Double.parseDouble(str[4]));
                sv.setLop(str[8]);
                datasv.add(sv);
            }
            fr.close();
            br.close();
        } catch (IOException ex) {
            System.out.println("Doc File that bai " + ex.getMessage());
        }
        return datasv;
    }
}
