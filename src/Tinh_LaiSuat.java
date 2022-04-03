import java.util.Scanner;

public class Tinh_LaiSuat {
    public static void main(String[] args) {
        double ti;
        int th;
        double ls;
        double tls;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền cần gửi");
        ti = scanner.nextDouble();
        System.out.println("Nhập số tháng muốn gửi");
        th = scanner.nextInt();
        System.out.println("Nhập lãi suất");
        ls = scanner.nextDouble();
        tls = ti*(ls/100)*th/12;
        System.out.println("Tiền lãi nhận được là:" + tls);
    }
}