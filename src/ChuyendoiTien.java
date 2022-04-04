import java.util.Scanner;

public class ChuyendoiTien {
    public static void main(String[] args) {
        int t;
        int ch;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền USD");
        t = scanner.nextInt();
        ch = t*23000;
        System.out.println("Số tiền VND nhận về là:" + ch + "VND");
    }
}
