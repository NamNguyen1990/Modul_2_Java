import java.util.Scanner;

public class ChiSoCanNang_CoThe {
    public static void main(String[] args) {
        double cc;
        double cn;
        double cs;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều cao");
        cc = scanner.nextDouble();
        System.out.println("Nhập cân nặng");
        cn = scanner.nextDouble();
        cs = cn/(cc*cc);
        if (cs < 18.5) {
            System.out.println("Bạn như con mắm");
        }
        else if (cs < 25.0) {
            System.out.println("Bạn là người mẫu");
        }
        else if (cs  < 30) {
            System.out.println("Bạn đã béo phì");
        }
        else {
            System.out.println("Bạn như con lợn");
        }
    }
}
