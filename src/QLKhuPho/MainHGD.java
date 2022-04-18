package QLKhuPho;

public class MainHGD {
    public static void main(String[] args) {
        QuanLyGD quanLyGD = new QuanLyGD();

        quanLyGD.them(new HoGiaDinh("Nam",32,"tự do",111,"Vạn Phúc",1));
        quanLyGD.them(new HoGiaDinh("Linh",23,"tự do",222,"Vạn Phúc",2));
        quanLyGD.them(new HoGiaDinh("Vy",7,"tự do",333,"Vạn Phúc",3));
        quanLyGD.them(new HoGiaDinh("Chính",30,"tự do",444,"Vạn Phúc",4));
        quanLyGD.them(new HoGiaDinh("Xuân",35,"tự do",555,"Vạn Phúc",5));
        quanLyGD.hienthi();

        System.out.println(quanLyGD.timKiemten("Chính"));

        quanLyGD.suaten("Chính", new HoGiaDinh("Chính",59,"nhân viên",6666,"Yên Nghĩa",7));
        quanLyGD.hienthi();

        quanLyGD.xoaten("Chính");
        quanLyGD.hienthi();



    }
}
