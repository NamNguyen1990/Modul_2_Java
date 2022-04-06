import java.util.Scanner;

public class DemKyTu_Chuoi {
    public static void main(String[] args) {
        String chuoi;
        char kytu;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 1 chuỗi đi");
        chuoi = scanner.nextLine();
        System.out.println("Nhập vào ký tự cần tìm đi");
        kytu = scanner.next().charAt(0);

        for (int i=0; i<chuoi.length(); i++) {
            if (chuoi.charAt(i) == kytu) {
                count = count + 1;
            }
        }
        System.out.println("Số lần ký tự này xuất hiện là:" + count);
    }
}
