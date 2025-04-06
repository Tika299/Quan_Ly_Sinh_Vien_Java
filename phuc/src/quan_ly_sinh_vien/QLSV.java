/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quan_ly_sinh_vien;

import static com.sun.tools.attach.VirtualMachine.list;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import static java.nio.file.Files.list;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 *
 * @author vukof
 */
public class QLSV {

    private List<SinhVien> data;

    public QLSV() {
        data = new ArrayList<>();
    }

    public QLSV(List<SinhVien> data) {
        this.data = data;
    }

    public List<SinhVien> getData() {
        return data;
    }

    public void setData(List<SinhVien> data) {
        this.data = data;
    }

    public void Themdata(SinhVien sv) {
        data.add(sv);
    }

    public String HienThidata() {
        String msg = "";

        for (SinhVien sv : data) {
            msg += sv.toString() + "\n";
        }
        return msg;

    }

    public void XoaDL(SinhVien sv) {

        List<SinhVien> sv1 = new CopyOnWriteArrayList<>();
        for (SinhVien sv2 : data) {
            sv1.add(sv2);
        }
        for (SinhVien item : sv1) {
            if (item.getMaSV().equals(sv.getMaSV())) {
                sv1.remove(item);
            }
        }
        data.removeAll(data);
        for (SinhVien sv2 : sv1) {
            data.add(sv2);
        }

    }

    public void SuaDL(SinhVien sv) {

        for (SinhVien sv1 : data) {
            if (sv1.getMaSV().equals(sv.getMaSV())) {
                sv1.setTenSV(sv.getTenSV());
                sv1.setNgaySinh(sv.getNgaySinh());
                sv1.setTenKhoa(sv.getTenKhoa());
                sv1.setAnh(sv.getAnh());
            }
        }

    }

    public void GhiFile(String filename) {
        File file = new File(filename);
        try {
            FileWriter fw = new FileWriter(file);
            for (SinhVien sv : data) {
                fw.write(sv.toString() + "\n");
            }
            fw.close();
        } catch (IOException ex) {
            System.out.println("Ghi file thất bại đc");
        }
    }

    public List<SinhVien> DocFile(String filename) {
        List<SinhVien> dataSV = new ArrayList<>();
        File file = new File(filename);
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while ((line = br.readLine()) != null) {
                String[] str = line.split(",");
                SinhVien sv = new SinhVien();
                sv.setMaSV(str[0]);
                sv.setTenSV(str[1]);
                sv.setNgaySinh(str[2]);
                sv.setTenKhoa(str[3]);
                sv.setAnh(str[4]);
                dataSV.add(sv);
            }
            fr.close();
            br.close();
        } catch (IOException ex) {
            System.out.println("Doc khong duoc");
        }
        return dataSV;
    }

    public void DocFileHai(String filename) {

        try (FileReader fileReader = new FileReader("LopTen.txt"); BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                // Process the line of text here
                System.out.println(line); // Print the line to the console
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
