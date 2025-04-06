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
import java.util.List;

/**
 *
 * @author vukof
 */
public class QuanLyMonHoc {
    private List<MonHoc> data;

    public QuanLyMonHoc() {
        data = new ArrayList<>();
    }

    public QuanLyMonHoc(List<MonHoc> data) {
        this.data = data;
    }

    public List<MonHoc> getData() {
        return data;
    }

    public void setData(List<MonHoc> data) {
        this.data = data;
    }
    public void Themdata(MonHoc  monHoc){
    data.add(monHoc);
    }
        public String HienThidata(){
         String msg="";
         
            for (MonHoc monHoc : data) {
                msg += monHoc.toString() +"\n";
            }
            return msg;
    
 
        }
        
        public void XoaDL(MonHoc monHoc){
            
            for (MonHoc monHoc1 : data) {
                if(monHoc1.getMaMon().equals(monHoc.getMaMon())){
                 data.remove(monHoc1);
                }
            }
   
        }
        public void SuaDL(MonHoc monHoc){
            
            for (MonHoc monHoc1 : data) {
                if(monHoc1.getMaMon().equals(monHoc.getMaMon())){
                 monHoc1.setTenMon(monHoc.getTenMon());
                  monHoc1.setSoTc(monHoc.getSoTc());
                   monHoc1.setMaKhoa(monHoc.getMaKhoa());
                 
                }
            }
   
        }
        
          public void GhiFile(String filename) {
        File file = new File(filename);
        try {
            FileWriter fw = new FileWriter(file);
            for (MonHoc lop : data) {
                fw.write(lop.toString() + "\n");
            }
            fw.close();
        } catch (IOException ex) {
            System.out.println("Ghi không đc");
        }
    }
    
    public List<MonHoc> DocFile(String filename) {
        List<MonHoc> dataLop = new ArrayList<>();
        File file = new File(filename);
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while ((line = br.readLine()) != null) {
                String [] str = line.split(",");
              MonHoc lop = new MonHoc();
                lop.setMaMon(str[0]);
                lop.setTenMon(str[1]);
                lop.setSoTc(Integer.parseInt(str[2]));
                lop.setMaKhoa(str[3]);
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
