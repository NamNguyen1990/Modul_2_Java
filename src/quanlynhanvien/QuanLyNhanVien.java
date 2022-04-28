package quanlynhanvien;

import QuanLyDanhBaDienthoai.Nguoi;

import java.util.ArrayList;
import java.util.List;

public class QuanLyNhanVien {
    List<NhanVien> nhanVienList = new ArrayList<>();
    public static final String FULL = "Fulltime";
    public static final String PART = "Parttime";
    void them(NhanVien nhanVien) {
        nhanVienList.add(nhanVien);
    }

    void hienThi() {
        boolean check = false;
        int sum = 0;
        for (int i = 0; i < nhanVienList.size(); i++) {
            System.out.println(nhanVienList.get(i));
            sum += nhanVienList.get(i).getLuong();
            check = true;
        }
        if (check == false){
            System.out.println("Danh sách chưa có nhân viên nào. Mời bạn nhập!");
        }
    }
        public void timKiemTen(String ten) {
        boolean check = false;
        for (int i = 0; i < nhanVienList.size(); i++) {
            if (nhanVienList.get(i).getTen().contains(ten)) {
                System.out.println(nhanVienList.get(i));
                check = true;
            }
        }
        if (check == false) {
            System.out.println("Không có nhân viên nào như trên");
        }
    }

    public void timKiemLoaiFull() {
        boolean check = false;
        for (int i = 0; i < nhanVienList.size(); i++) {
            if (nhanVienList.get(i).getLoai().equals(FULL)) {
                System.out.println(nhanVienList.get(i));
                check = true;
            }
        }
        if (check == false) {
            System.out.println("Không có nhân viên Fulltime nào");
        }
    }

    public void timKiemLoaiPart() {
        boolean check = false;
        for (int i = 0; i < nhanVienList.size(); i++) {
            if (nhanVienList.get(i).getLoai().equals(PART)) {
                System.out.println(nhanVienList.get(i));
                check = true;
            }
        }
        if (check == false) {
            System.out.println("Không có nhân viên Parttime nào");
        }
    }


    public void tinhLuongFull() {
        boolean check = false;
        int sum = 0;
        for (int i = 0; i < nhanVienList.size(); i++) {
            if (nhanVienList.get(i).getLoai().equals(FULL)) {
                sum += nhanVienList.get(i).getLuong();
                check = true;
            }
        }
        if (check == false) {
            System.out.println("Không có nhân viên Fulltime nào");
        }else System.out.println("Lương tổng : " + sum);
    }

}
