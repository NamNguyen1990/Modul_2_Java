package QuanLySinhVien;

//Xây dựng lớp người(lớp trừu tượng):
//-	Có thuộc tính: mã, tên, tuổi
//Xây dựng lớp sinh viên kế thừa lớp người:
//-	Có thêm thuộc tính: điểm
//Xây dựng interface QuanLy<T>
//-	Có các hàm: thêm, sửa, tìm kiếm, hiển thị
//Xây dựng lớp Quản lý sinh viên:
//-	Thuộc tính: Mảng Sinh viên
//-	Triển khai interface QuanLy
//Xây dựng lớp Main chạy thử các chức năng

public class MainQLSinhvien {
    public static void main(String[] args) {
        QuanLySV quanLySV = new QuanLySV();
        Sinhvien sinhvien1 = new Sinhvien(1,"Nam",32,6);
        Sinhvien sinhvien2 = new Sinhvien(2,"Linh",23,8);
        Sinhvien sinhvien3 = new Sinhvien(3,"Vy",1,9);
        Sinhvien sinhvien4 = new Sinhvien(4,"NL",1,10);
        Sinhvien sinhvien5 = new Sinhvien(5,"LN",1,10);

        Sinhvien sinhvien6 = new Sinhvien(8,"LNNL",1,7);

        quanLySV.them(sinhvien1);
        quanLySV.them(sinhvien2);
        quanLySV.them(sinhvien3);
        quanLySV.them(sinhvien4);
        quanLySV.them(sinhvien5);
        quanLySV.hienthi();

        System.out.println("Vị trí số:" + quanLySV.timkiem("NL"));

        quanLySV.sua("LN", sinhvien6);
        quanLySV.hienthi();

    }
}
