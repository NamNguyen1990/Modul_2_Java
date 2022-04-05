
import java.util.Scanner;

public class GiatriNhoNhat_Mang {
    public static int GTNN(int[] mang) {
        int min = mang[0];
        for (int i=0; i<mang.length; i++) {
            if (mang[i]<min) {
                mang[i] = min;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int size;
        int min;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử mảng");
        size = scanner.nextInt();
        int[] mang = new int[size];
        for (int i=0; i<size; i++) {
            System.out.println("Nhập vào phần tử thứ" + i + ":");
            mang[i] = scanner.nextInt(); // Nhập phần tử cho mảng
        }

        System.out.println("Mảng vừa nhập vào là:");
        for (int i=0; i<size; i++) {
            System.out.print(mang[i] + "\t");
        }

        min = GTNN(mang);
        System.out.println("Giá trị nhỏ nhất trong mảng là" + min);
    }
}