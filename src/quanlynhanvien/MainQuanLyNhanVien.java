package quanlynhanvien;

import java.util.Scanner;

public class MainQuanLyNhanVien {
    public static void main(String[] args) {
        QuanLyNhanVien quanLyNhanVien = new QuanLyNhanVien();
        Scanner sc = new Scanner(System.in);
        Scanner nhapChu = new Scanner(System.in);
        int luaChon;
        System.out.println("=====Menu====");
        System.out.println("1 - Thêm 1 Nhân viên");
        System.out.println("3 - Cập nhật trạng thái Nhân viên");
        System.out.println("4 - Tìm kiếm thông tin");
        System.out.println("5 - In ra danh sách toàn bộ nhân viên ");
        System.out.println("6 - In ra danh sách nhân viên Fulltime");
        System.out.println("7 - In ra danh sách nhân viên Parttime");
        System.out.println("8 - Tính lương nhân viên");
        System.out.println("9 - Ghi ra File");
        System.out.println("10 - Đọc từ File");
        System.out.println("11 - Thoát");




        do {
            System.out.println("Mời bạn chọn chức năng");
            try {
                luaChon = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Chỉ được nhập số");
                sc.nextLine();
                luaChon = -1;
            }
            if (luaChon == 1) {
                System.out.println("Nhập tên");
                String ten = nhapChu.nextLine();
                System.out.println("Nhập loại (Fulltime/Parttime)");
                String loai = nhapChu.nextLine();
                System.out.println("Nhập trạng thái (đang làm/thôi việc)");
                String trangThai = nhapChu.nextLine();
                System.out.println("Nhập lương");
                int luong = sc.nextInt();

                NhanVien nhanVien = new NhanVien(ten,loai,trangThai,luong);
                quanLyNhanVien.them(nhanVien);

            }
            else if (luaChon == 3) {

            }
            else if (luaChon == 4) {
                System.out.println("Nhập vào tên cần tìm");
                String tenm = nhapChu.nextLine();
                quanLyNhanVien.timKiemTen(tenm);

            }
            else if (luaChon == 5) {
                quanLyNhanVien.hienThi();

            }
            else if (luaChon == 6) {
                quanLyNhanVien.timKiemLoaiFull();

            }
            else if (luaChon == 7) {
                quanLyNhanVien.timKiemLoaiPart();
            }
            else if (luaChon == 8) {

            }
            else if (luaChon == 9) {

            }
            else if (luaChon == 10) {

            }

        } while (luaChon != 11);
    }
}


