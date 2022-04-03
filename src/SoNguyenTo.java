import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {
        int a;
        String s = "SNT";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 1 số");
        a = scanner.nextInt();
        if (a == 1 || a == 2) {
            s = "SNT";
        }
        else {
            for (int i=2; i<a; i++) {
                if (a%i == 0) {
                    s = "KPSNT";
                }
            }
        }

        if (s == "SNT") {
            System.out.println("Đây là Số Nguyên Tố");
        }
        else {
            System.out.println("Đây không phải Số Nguyên Tố");
        }
    }
}
