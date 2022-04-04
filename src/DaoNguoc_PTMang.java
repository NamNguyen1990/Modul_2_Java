import java.util.Scanner;

public class DaoNguoc_PTMang {
    public static void main(String[] args) {
        int size;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử mảng");
        size = scanner.nextInt();
        int[] mang = new int[size];
//      vòng lặp này sẽ duyệt i từ 0 đến chiều dài của mảng - 1
        for (int i=0; i< mang.length; i++) {
            System.out.println("Nhập vào phần tử thứ" + i + ":");
            mang[i] = scanner.nextInt(); // Nhập phần tử cho mảng
        }
        for (int i=0; i< mang.length; i++) {
            System.out.println(mang[i]); // In ra mảng nhập vào
        }
        // Bjo đảo mảng
        for (int i=0; i< mang.length/2; i++) {
            int tgian = mang[i];
            mang[i] = mang[size - 1 - i];
            mang[size - 1 - i] = tgian;
        }
        // In ra mảng đã đảo
        System.out.println("Mảng đảo ngược sẽ là:");
        for (int i=0; i< mang.length; i++) {
            System.out.println(mang[i]);
        }
    }
}
