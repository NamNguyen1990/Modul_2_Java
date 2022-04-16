package QuanLy;

import java.util.Arrays;

public class QuanLyXeMay implements QuanLy<XeMay> {
    private XeMay[] danhSach = new XeMay[4];
    private int size = 0;

    @Override
    public void them(XeMay xeMay) {
        danhSach[size] = xeMay;
        size++;
    }

    @Override
    public void sua(String ten, XeMay xeMay) {
        danhSach[timKiem(ten)] = xeMay;
    }

    @Override
    public char[] xoa (String ten) {
        danhSach[timKiem(ten)] = null;
        return new char[0];
    }

    @Override
    public int timKiem(String ten) {
        for (int i=0;i<size;i++) {
            if (ten == danhSach[i].getTen()) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void hienThi() {
        for (int i=0;i<size;i++) {
            System.out.println(danhSach[i]);
        }
        System.out.println("----------------------------------");

    }

    @Override
    public void xapXep() {
        Arrays.sort(danhSach);

    }

}
