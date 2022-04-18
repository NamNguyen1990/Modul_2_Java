package QLKhuPho;

import java.util.ArrayList;
import java.util.List;

public class QuanLyKP {

    List<QuanLyGD> quanLyGDList = new ArrayList<>();

    void them (QuanLyGD quanLyGD) {
        quanLyGDList.add(quanLyGD);
    }

    void hienthi() {

        for (int i=0; i< quanLyGDList.size(); i++) {
            System.out.println(quanLyGDList.get(i));
        }
        System.out.println("-------------------------------");
    }

}
