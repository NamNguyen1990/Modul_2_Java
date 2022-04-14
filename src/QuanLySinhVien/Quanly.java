package QuanLySinhVien;

public interface Quanly<T> {
    void them(T t);

    void sua(String name, T t);

    int timkiem(String name);

    void hienthi();
}
