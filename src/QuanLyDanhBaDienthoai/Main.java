package QuanLyDanhBaDienthoai;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        QLDanhBa qlDanhBa = new QLDanhBa();
        Scanner sc = new Scanner(System.in);
        Scanner nhapChu = new Scanner(System.in);
        int luaChon;
        System.out.println("=====Menu====");
        System.out.println("1 - Hiển thị danh sách sinh viên");
        System.out.println("2 - Thêm 1 danh bạ");
        System.out.println("3 - Cập nhật danh bạ theo tên");
        System.out.println("4 - Xóa tên khỏi danh sách");
        System.out.println("5 - Tìm kiếm tên trong danh sách");
        System.out.println("6 - Đọc từ File");
        System.out.println("7 - Ghi vào File");
        System.out.println("8 - Thoát khỏi chương trình");
        System.out.println("9 - Xem lại Menu");


        do {
            System.out.println("Mời bạn chọn chức năng");
            System.out.println("Note: Nhấn 9 để xem lại Menu");


            try {
                luaChon = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Chỉ được nhập số");
                sc.nextLine();
                luaChon = -1;
            }
            if (luaChon == 2) {
                System.out.println("Nhập số điện thoại");
                int sdt = sc.nextInt();
                System.out.println("Nhập nhóm");
                int nhom = sc.nextInt();
                System.out.println("Nhập họ tên");
                String hoTen = nhapChu.nextLine();
                System.out.println("Nhập giới tính");
                String gioiTinh = nhapChu.nextLine();
                System.out.println("Nhập địa chỉ");
                String diaChi = nhapChu.nextLine();

                Nguoi nguoi = new Nguoi(sdt,nhom,hoTen,gioiTinh,diaChi);
                qlDanhBa.them(nguoi);


            } else if (luaChon == 1) {
                qlDanhBa.hienThi();
            }

            else if (luaChon == 3) {
                System.out.println("Nhập tên cần sửa");
                String tens = nhapChu.nextLine();
                System.out.println("Nhập số điện thoại mới");
                int sdtm = sc.nextInt();
                System.out.println("Nhập nhóm mới");
                int nhomm = sc.nextInt();
                System.out.println("Nhập họ tên mới");
                String hoTenm = nhapChu.nextLine();
                System.out.println("Nhập giới tính");
                String gioiTinhm = nhapChu.nextLine();
                System.out.println("Nhập địa chỉ mới");
                String diaChim = nhapChu.nextLine();
                Nguoi nguoi1 = new Nguoi(sdtm,nhomm,hoTenm,gioiTinhm,diaChim);
                qlDanhBa.suaten(tens,nguoi1);

            }
            else if (luaChon == 4) {
                System.out.println("Mời nhập tên  muốn xóa");
                String tenx = nhapChu.nextLine();
                qlDanhBa.xoaten(tenx);
                System.out.println("Tên đã bị xóa khỏi danh sách");

            }

            else if (luaChon == 5) {
                System.out.println("Nhập số điện thoại cần tìm");
                int sdtt = sc.nextInt();
                qlDanhBa.timKiemsdt(sdtt);
//                String sdtt = nhapChu.nextLine();
//                qlDanhBa.timKiemsdt(sdtt);
            }

            else if (luaChon == 7) {

                ghiFile.writeToFile(qlDanhBa.danhbaList);

            }
            else if (luaChon == 6) {

                ghiFile.readFromFile(qlDanhBa.danhbaList);

            }





        } while (luaChon != 8) ;
    }
}
