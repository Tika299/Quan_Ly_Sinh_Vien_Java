/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quan_ly_sinh_vien;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author vukof
 */
public class QuanLyLop {
    private List<Lop> data;

    public QuanLyLop() {
        data = new ArrayList<>();
    }

    public QuanLyLop(List<Lop> data) {
        this.data = data;
    }

    public List<Lop> getData() {
        return data;
    }

    public void setData(List<Lop> data) {
        this.data = data;
    }
    
    public void ThemDL(Lop lop){
    data.add(lop);
    }
        public String HienThiDL(){
         String msg="";
         
            for (Lop lop : data) {
                msg += lop.toString() +"\n";
            }
            return msg;
    
 
        }
        
        public void XoaDL(Lop lop){
            
            for (Lop lop1 : data) {
                if(lop1.getMaLop().equals(lop.getMaLop())){
                 data.remove(lop1);
                }
            }
   
        }
        public void SuaDL(Lop lop){
            
            for (Lop lop1 : data) {
                if(lop1.getMaLop().equals(lop.getMaLop())){
                 lop1.setTenLop(lop.getTenLop());
                  lop1.setGiangVien(lop.getGiangVien());
                   lop1.setSiSo(lop.getSiSo());
                 
                }
            }
   
        }
        public void SapXepTenLopTang() {
            Collections.sort(data);
        }
        
        public void SapXepTenLopGiam() {
            Collections.sort(data, new SapXepTenLop());
        }
        
        public void GhiFile(String filename) {
        File file = new File(filename);
        try {
            FileWriter fw = new FileWriter(file);
            for (Lop lop : data) {
                fw.write(lop.toString() + "\n");
            }
            fw.close();
        } catch (IOException ex) {
            System.out.println("Ghi khong dc đc");
        }
    }
        public void GhiFileHai(String filename) {
        File file = new File(filename);
        try {
            FileWriter fw = new FileWriter(file);
            for (Lop lop : data) {
                fw.write(lop.getTenLop() + "\n");
            }
            fw.close();
        } catch (IOException ex) {
            System.out.println("Ghi khong dc đc");
        }
        }
    
    public List<Lop> DocFile(String filename) {
        List<Lop> dataLop = new ArrayList<>();
        File file = new File(filename);
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while ((line = br.readLine()) != null) {
                String [] str = line.split(",");
                Lop lop = new Lop();
                lop.setMaLop(str[0]);
                lop.setTenLop(str[1]);
                lop.setGiangVien(str[2]);
                lop.setSiSo(Integer.parseInt(str[3]));
                dataLop.add(lop);
            }
            fr.close();
            br.close();
        }catch (IOException ex) {
            System.out.println("Doc khong duoc");
        }
        return dataLop;
    }
    
     public List<Lop> DocFileHai(String filename) {
        List<Lop> dataLop = new ArrayList<>();
        File file = new File(filename);
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while ((line = br.readLine()) != null) {
                String [] str = line.split(" ");
                Lop lop = new Lop();
           
                lop.setTenLop(str[1]);
                
                dataLop.add(lop);
            }
            fr.close();
            br.close();
        }catch (IOException ex) {
            System.out.println("Doc khong duoc");
        }
        return dataLop;
    }
}
