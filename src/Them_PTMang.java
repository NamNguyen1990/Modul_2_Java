import java.util.Scanner;

public class Them_PTMang {
    public static void main(String[] args) {
        int size;
        int b;
        int d;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử mảng");
        size = scanner.nextInt();
        int[] mang = new int[size];
//      vòng lặp này sẽ duyệt i từ 0 đến chiều dài của mảng - 1
        for (int i=0; i<size; i++) {
            System.out.println("Nhập vào phần tử thứ" + i + ":");
            mang[i] = scanner.nextInt(); // Nhập phần tử cho mảng
        }

        System.out.println("Mảng vừa nhập vào là:");
        for (int i=0; i<size; i++) {
            System.out.print(mang[i] + "\t"); // In ra mảng nhập vào
        }

        System.out.println("\n Nhập số muốn thêm vào đi");
        b = scanner.nextInt();
        System.out.println("Nhập vào vị trí cần thêm đi");
        d = scanner.nextInt();
        int[] e = new int[mang.length + 1];
        for (int i=0; i< e.length; i++) {
            if (i<d) {
                e[i] = mang[i];
            }
            e[d] = b;
            if (i>d) {
                e[i] = mang[i-1];
            }
        }
        System.out.println("Mảng mới sẽ là:");
        for (int i=0; i<e.length; i++) {
            System.out.println(e[i] + "");
        }
    }
}
