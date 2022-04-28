package quanlynhanvien;

public class NhanVien {
    private String ten;
    private String loai;
    private String trangThai;
    private int luong;
    public NhanVien() {
    }

    public NhanVien(String ten, String loai, String trangThai, int luong) {
        this.ten = ten;
        this.loai = loai;
        this.trangThai = trangThai;
        this.luong = luong;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "ten = " + ten +
                ", loai = " + loai +
                ", trangThai = " + trangThai +
                ", luong = " + luong +
                '}';
    }
}
