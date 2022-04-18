package QLKhuPho;

import java.util.ArrayList;
import java.util.List;

public class QuanLyGD {
    List<HoGiaDinh> hoGiaDinhList = new ArrayList<>();

    void them (HoGiaDinh hoGiaDinh) {
        hoGiaDinhList.add(hoGiaDinh);
    }

    void hienthi() {

        for (int i=0; i< hoGiaDinhList.size(); i++) {
            System.out.println(hoGiaDinhList.get(i));
        }
        System.out.println("-------------------------------");
    }

    public int timKiemten (String ten) {
        for (int i=0; i< hoGiaDinhList.size(); i++) {
            if (hoGiaDinhList.get(i).getTen().equals(ten)) {   // do tìm theo tên kiểu String nên phải dùng equals.
                return i;
            }
        }
        return -1;
    }


    public void suaten (String ten, HoGiaDinh hoGiaDinh) {
        int indexOf = timKiemten(ten);
        if (indexOf == -1) {
            System.out.println("Không có thành viên này này");
        }
        else {
            hoGiaDinhList.set(indexOf, hoGiaDinh);
        }
    }

    void xoaten (String ten) {
        int indexOf = timKiemten(ten);
        if (indexOf == -1) {
            System.out.println("Không có sinh viên này");
        }
        else {
            hoGiaDinhList.remove(indexOf);
        }
    }



}
