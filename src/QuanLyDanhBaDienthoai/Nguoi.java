package QuanLyDanhBaDienthoai;

public class Nguoi {
    private int sdt;
    private int nhom;
    private String hoTen;
    private String gioiTinh;
    private String diaChi;

    public Nguoi() {
    }

    public Nguoi(int sdt, int nhom, String hoTen, String gioiTinh, String diaChi) {
        this.sdt = sdt;
        this.nhom = nhom;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }

    public int getSdt() {
        return sdt;
    }

    public void setSdt(int sdt) {
        this.sdt = sdt;
    }

    public int getNhom() {
        return nhom;
    }

    public void setNhom(int nhom) {
        this.nhom = nhom;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "Nguoi{" +
                "sdt=" + sdt +
                ", nhom=" + nhom +
                ", hoTen= " + hoTen  +
                ", gioiTinh= " + gioiTinh  +
                ", diaChi= "  + diaChi +
                '}';
    }
}
