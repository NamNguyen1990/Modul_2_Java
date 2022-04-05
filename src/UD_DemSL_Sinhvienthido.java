import java.util.Scanner;

public class UD_DemSL_Sinhvienthido {
    public static void main(String[] args) {
        int size;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng điểm của sinh viên");
        size = scanner.nextInt();
        int[] mang = new int[size];
//      vòng lặp này sẽ duyệt i từ 0 đến chiều dài của mảng - 1
        for (int i=0; i< mang.length; i++) {
            System.out.print("Nhập điểm của sinh viên thứ" + " " + (i+1) + ":");
            mang[i] = scanner.nextInt(); // Nhập phần tử cho mảng
        }

        System.out.println("Điểm vừa nhập vào là:");
        for (int i=0; i< mang.length; i++) {
            System.out.print(mang[i] + "\t"); // In ra mảng nhập vào
        }

        int count = 0;
        for (int i=0; i<mang.length; i++) {
            if (mang[i] >= 5 && mang[i] <= 10) {
                count = count + 1;
            }
        }
        System.out.println("\nSố sinh viên thi đỗ là:" + count);
    }
}
