package QuanLyDanhBaDienthoai;

import QuanLySinhVien.Sinhvien;

import java.util.ArrayList;
import java.util.List;

public class QLDanhBa {
    List<Nguoi> danhbaList = new ArrayList<>();

    void them(Nguoi nguoi) {
        danhbaList.add(nguoi);
    }

    void hienThi() {
        boolean check = false;
        for (int i = 0; i < danhbaList.size(); i++) {
            System.out.println(danhbaList.get(i));
            check = true;
        }
        if (check == false){
            System.out.println("Danh sách chưa có sinh viên nào. Mời bạn nhập!");
        }
    }

    public void timKiemsdt(int sdt) {
        boolean check = false;
        for (int i = 0; i < danhbaList.size(); i++) {
            if (danhbaList.get(i).getSdt() == sdt) {
                System.out.println(danhbaList.get(i));
                check = true;
            }
        }
        if (check == false) {
            System.out.println("Không có số điện thoại nào như trên");
        }
    }


//    public void timKiemsdt(String sdt) {
//        boolean check = false;
//        for (int i = 0; i < danhbaList.size(); i++) {
//            if (String.valueOf(danhbaList.get(i).getSdt()).contains(sdt)) {
//                System.out.println(danhbaList.get(i));
//                check = true;
//            }
//        }
//        if (check == false) {
//            System.out.println("Không có số điện thoại nào như trên");
//        }
//    }


    public int timKiemten (String ten) {
        for (int i = 0; i < danhbaList.size(); i++) {
            if (danhbaList.get(i).getHoTen().equals(ten)) {
                return i;
            }
        }
        return -1;
    }

    public void suaten(String ten, Nguoi nguoi) {
        int indexOf = timKiemten(ten);
        if (indexOf == -1) {
            System.out.println("Không có tên người này");
        } else {
            danhbaList.set(indexOf, nguoi);
        }
    }

    void xoaten(String ten) {
        int indexOf = timKiemten(ten);
        if (indexOf == -1) {
            System.out.println("Không có sinh viên này");
        } else {
            danhbaList.remove(indexOf);
        }
    }

}
