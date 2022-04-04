import java.util.Scanner;

public class GTLonNhat_Mang {
    public static void main(String[] args) {
        int size;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng tài sản");
        size = scanner.nextInt();
        int[] mang = new int[size];
//      vòng lặp này sẽ duyệt i từ 0 đến chiều dài của mảng - 1
        for (int i=0; i< mang.length; i++) {
            System.out.print("Nhập giá trị tài sản thứ" + " " + (i+1) + ":");
            mang[i] = scanner.nextInt(); // Nhập phần tử cho mảng
        }

        System.out.println("Tài sản vừa nhập vào là:");
        for (int i=0; i< mang.length; i++) {
            System.out.print(mang[i] + "\t"); // In ra mảng nhập vào
        }

        int max = mang[0];
        for (int i=0; i<mang.length; i++) {
            if (mang[i] > max) {
                max = mang[i];
            }
        }
        System.out.println("Giá trị tài sản lớn nhất là:" + max);
    }
}
