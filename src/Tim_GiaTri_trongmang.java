import java.util.Scanner;

public class Tim_GiaTri_trongmang {
    public static int KiemTra(String[] mang, String ten) {
        for (int i=0; i< mang.length;i++) {
            if (mang[i].equals(ten)) {
                return i;
            }
        } return -1;
    }

    public static void main(String[] args) {
        String[] mang = {"Son", "Hung", "Huy", "Thien", "Hoc", "Lam"};
        String ten;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào tên cần tìm:");
        ten = scanner.nextLine();
        int Tim = KiemTra(mang, ten);
        if (Tim == -1) {
            System.out.println("Ko tìm thấy");
        }
        else {
            System.out.println("Tìm thấy tại vị trí: " + Tim);
        }
    }
}