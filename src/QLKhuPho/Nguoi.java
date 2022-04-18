package QLKhuPho;

public class Nguoi {
    private String ten;
    private int tuoi;
    private String nghenghiep;
    private int cmnd;

    public Nguoi() {
    }

    public Nguoi(String ten, int tuoi, String nghenghiep, int cmnd) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.nghenghiep = nghenghiep;
        this.cmnd = cmnd;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getNghenghiep() {
        return nghenghiep;
    }

    public void setNghenghiep(String nghenghiep) {
        this.nghenghiep = nghenghiep;
    }

    public int getCmnd() {
        return cmnd;
    }

    public void setCmnd(int cmnd) {
        this.cmnd = cmnd;
    }
}
