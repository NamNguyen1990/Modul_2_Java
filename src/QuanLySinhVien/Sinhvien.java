package QuanLySinhVien;

public class Sinhvien extends Nguoi {
    private int diem;

    public Sinhvien() {
    }

    public Sinhvien(int ma, String ten, int tuoi, int diem) {
        super(ma, ten, tuoi);
        this.diem = diem;
    }

    public int getDiem() {
        return diem;
    }

    public void setDiem(int diem) {
        this.diem = diem;
    }

    @Override
    public String toString() {
        return "Sinhvien{ ma:" + getMa() +
                ", ten: " + getTen() +
                ", tuoi: " + getTuoi() +
                ", diem = " + diem +
                '}';
    }
}
