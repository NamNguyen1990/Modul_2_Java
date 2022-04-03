import java.util.Scanner;

public class Ktra_NamNhuan {
    public static void main(String[] args) {
        int Nam;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập năm:");
        Nam = scanner.nextInt();
        if (Nam%4 == 0) {
            if (Nam%100 == 0) {
                if (Nam%400 == 0) {
                    System.out.println("Đây là năm nhuận");
                }
                else {
                    System.out.println("Đây không phải là năm nhuận");
                }
            }
            else {
                System.out.println("Đây là năm nhuận");
            }
        }
        else {
            System.out.println("Đây không phải là năm nhuận");
        }
    }
}
