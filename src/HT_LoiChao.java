import java.util.Scanner;

public class HT_LoiChao {
    public static void main(String[] args) {
        System.out.println("Tên của bạn là gì");
        String str;
        Scanner scanner = new Scanner(System.in);
        str = scanner.nextLine();
        System.out.println("Xin Chào:" + str);
    }
}
