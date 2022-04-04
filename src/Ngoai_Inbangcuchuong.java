import java.util.Scanner;

public class Ngoai_Inbangcuchuong {
    public static void main(String[] args) {
        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào bảng số cần in");
        a = scanner.nextInt();
        int tich;
        for (int i=1;i<=20; i++) {
            tich = a*i;
            System.out.printf("%d * %d = %d \n", a, i, tich);
        }
    }
}
