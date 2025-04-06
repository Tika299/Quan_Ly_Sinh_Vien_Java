/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quan_ly_sinh_vien;

import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author vukof
 */
public class SapXepTenLop implements Comparator<Lop> {

    @Override
    public int compare(Lop o1, Lop o2) {
        if (o1.getTenLop().compareTo(o2.getTenLop()) > 0) {
            return -1;
        } else if (o1.getTenLop() == o2.getTenLop()) {
            return 0;
        } else {
            return 1;
        }
    }
    

}
