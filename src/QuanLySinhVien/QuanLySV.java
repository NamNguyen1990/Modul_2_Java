package QuanLySinhVien;

public class QuanLySV implements Quanly<Sinhvien> {
    private  Sinhvien[] danhsach = new Sinhvien[5];
    public int size = 0;


    @Override
    public void them(Sinhvien sinhvien) {
        danhsach[size] = sinhvien;
        size++;
    }

    @Override
    public void sua(String name, Sinhvien sinhvien) {
        danhsach[timkiem(name)] = sinhvien;

    }

    @Override
    public int timkiem(String name) {
        for (int i=0; i<size; i++) {
            if (name == danhsach[i].getTen()) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void hienthi() {
        for (int i=0; i<size;i++) {
            System.out.println(danhsach[i]);
        }

    }
}
