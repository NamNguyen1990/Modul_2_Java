package QuanLy;
//1. Xây dựng lớp PhuongTien(Truu tuong) có các thuộc tính: hãng, màu, tên, giá
//2. Xây dựng lớp Oto kế thừa phương tiên có thêm thuộc tính: số chỗ
//3. Xây dựng lớp Xe máy kế thừa lớp Phương tiện có thêm thuộc tính: dung tích
//4. Xây dựng interface QuanLy<T> có các phương thức: thêm, sửa, xoá, tìm kiếm, in tất cả, sắp xếp
//5. Xây dựng lớp QuanLyXeMay có mảng XeMay, QuanLyOTo có mảng Oto triển khai QuanLy và viết rõ các phương thức
//6. Xây dựng lớp Test, tạo main và chạy thử

// Bài này nếu dùng mảng phải sắp xếp lại là thêm, tìm kiếm, sửa, xắp xếp, xóa. Xóa cuối cùng vì khi xóa thì mảng sẽ bị mất dữ liệu nên ko thể xắp xếp đc.

public class MainQuanLy {
    public static void main(String[] args) {
        QuanLyXeMay qLXM = new QuanLyXeMay(); //Chỗ này phải tạo qLXM để có thể gọi đc các thuộc tính của nó ra. Còn nếu ko thì chỉ có thể sout thông thường.
        XeMay XeMay1 = new XeMay("Honda", "Đỏ-Đen", "Wave RSX", 30, 90);
        XeMay XeMay2 = new XeMay("Yamaha", "Đỏ", "Atila", 32, 110);
        XeMay XeMay3 = new XeMay("Piazo", "Trắng", "Vespa LX", 55, 110);
        XeMay XeMay4 = new XeMay("Honda", "Đen", "SH", 100, 300);
        qLXM.them(XeMay1);
        qLXM.them(XeMay2);
        qLXM.them(XeMay3);
        qLXM.them(XeMay4);
        qLXM.hienThi();

        System.out.println(qLXM.timKiem("Atila"));

        XeMay XeMay5 = new XeMay("Honda", "xanh", "Lead", 45, 125);
        qLXM.sua("Wave RSX", XeMay5);
        qLXM.hienThi();

        qLXM.xapXep();
        qLXM.hienThi();

        System.out.println(qLXM.xoa("SH"));
        qLXM.hienThi();

    }
}
