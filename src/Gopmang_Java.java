
import java.util.Scanner;
public class Gopmang_Java {
    public static void main(String[] args) {

        int size1;
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử mảng 1:");
        size1 = scanner1.nextInt();
        int[] mang1 = new int[size1];
//      vòng lặp này sẽ duyệt i từ 0 đến chiều dài của mảng - 1
        for (int i=0; i<size1; i++) {
            System.out.println("Nhập vào phần tử thứ" + (i+1) + ":");
            mang1[i] = scanner1.nextInt(); // Nhập phần tử cho mảng
        }

        System.out.println("Mảng 1 vừa nhập vào là:");
        for (int i=0; i<size1; i++) {
            System.out.print(mang1[i] + "\t"); // In ra mảng nhập vào
        }

        int size2;
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("\nNhập số lượng phần tử mảng 2:");
        size2 = scanner2.nextInt();
        int[] mang2 = new int[size2];
//      vòng lặp này sẽ duyệt i từ 0 đến chiều dài của mảng - 1
        for (int i=0; i<size2; i++) {
            System.out.println("Nhập vào phần tử thứ" + (i+1) + ":");
            mang2[i] = scanner2.nextInt(); // Nhập phần tử cho mảng
        }

        System.out.println("Mảng 2 vừa nhập vào là:");
        for (int i=0; i<size2; i++) {
            System.out.print(mang2[i] + "\t"); // In ra mảng nhập vào
        }


        int[] c = new int[mang1.length+ mang2.length];
         for (int i=0; i< mang1.length; i++) {
             c[i] = mang1[i];
         }
         for (int i=0; i< mang2.length; i++) {
             c[mang1.length+i] = mang2[i];
         }
         for (int i=0; i< c.length; i++) {
             System.out.println("\t"+c[i]);
         }
    }
}