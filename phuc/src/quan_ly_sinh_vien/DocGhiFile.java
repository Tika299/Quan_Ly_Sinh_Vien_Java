/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quan_ly_sinh_vien;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vukof
 */
public class DocGhiFile {
    private String filename;

    public DocGhiFile(String filename) {
        this.filename = filename;
    }

    public DocGhiFile() {
        filename="data.bin";
    }
    
    public void GhiFile(String data)
    {
        File file = new File(filename);
        try {
            FileWriter fw= new FileWriter(file);
            fw.write(data);
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(DocGhiFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    public String DocFile()
    {
        String msg="";
        File file = new File(filename);
        try {
            FileReader fr= new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line="";
            while ((line=br.readLine())!=null) {
                msg+=line+"\n";                
            }
            fr.close();
            br.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DocGhiFile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DocGhiFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return msg;
    }
    

    public void WriteBinData(int data) {
        try {
            FileOutputStream fos = new FileOutputStream(filename);
            DataOutputStream dos = new DataOutputStream(fos);
            dos.writeInt(data);
            fos.close();
            dos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DocGhiFile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DocGhiFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String ReadBinData() {
        String msg = "";
        try {
            FileInputStream fis = new FileInputStream(filename);
            DataInputStream dis = new DataInputStream(fis);
            int n = dis.readInt();
            msg += n;
            fis.close();
            dis.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DocGhiFile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DocGhiFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        return msg;
    }
}
