package QuanLyDanhBaDienthoai;

public class Danhba extends Nguoi{
    private int ngaySinh;
    private String email;

    public Danhba() {
    }

    public Danhba(int sdt, int nhom, String hoTen, String gioiTinh, String diaChi, int ngaySinh, String email) {
        super(sdt, nhom, hoTen, gioiTinh, diaChi);
        this.ngaySinh = ngaySinh;
        this.email = email;
    }

    public int getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(int ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "ttDanhba{" +
                "sdt=" + getSdt() +
                ", nhom=" + getNhom() +
                ", hoTen= " + getHoTen()  +
                ", gioiTinh= " + getGioiTinh()  +
                ", diaChi= "  + getDiaChi() +
                "ngaySinh=" + ngaySinh +
                ", email= " + email +
                '}';
    }
}
