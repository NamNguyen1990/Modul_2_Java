import java.util.Scanner;

public class UCLN {
    public static void main(String[] args) {
        double a;
        double b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập số thứ nhất");
        a = scanner.nextDouble();
        System.out.println("Mời nhập số thứ 2");
        b = scanner.nextDouble();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a==0 && b==0) {
            System.out.println("Không có ƯCLN");
        }
        else if (a==0 || b==0) {
            System.out.println("Không có ƯCLN");
        }
        else {
            while (a != b) {
                if (a>b) {
                    a = a - b;
                }
                else {
                    b = b-a;
                }
            }
            System.out.println("ƯCLN là:" + b);
        }
    }
}