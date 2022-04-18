package QLKhuPho;

public class HoGiaDinh extends Nguoi {
    private String diachi;
    private int soThanhvien;


    public HoGiaDinh() {
    }

    public HoGiaDinh(String ten, int tuoi, String nghenghiep, int cmnd, String diachi, int soThanhvien) {
        super(ten, tuoi, nghenghiep, cmnd);
        this.diachi = diachi;
        this.soThanhvien = soThanhvien;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public int getSoThanhvien() {
        return soThanhvien;
    }

    public void setSoThanhvien(int soThanhvien) {
        this.soThanhvien = soThanhvien;
    }

    @Override
    public String toString() {
        return "HoGiaDinh{" +
                "tên: " + getTen() +
                ", tuổi: " + getTuoi() +
                ", nghề nghiệp: " + getNghenghiep() +
                ", Số cmnd: " + getCmnd() +
                ", địa chỉ = " + diachi  +
                ", Số thành viên = " + soThanhvien +
                '}';
    }
}
