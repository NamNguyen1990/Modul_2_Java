import java.util.Scanner;

public class Xoa_PTkhoMang {

    public static int tim (int[] mang, int x) {
        for (int i=0; i< mang.length; i++) {
            if (mang[i] == x) {
                return i;
            }
        } return -1;
    }

    public static void main(String[] args) {
        int size;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử mảng");
        size = scanner.nextInt();
        int[] mang = new int[size];
//      vòng lặp này sẽ duyệt i từ 0 đến chiều dài của mảng - 1
        for (int i=0; i<size; i++) {
            System.out.println("Nhập vào phần tử thứ" + i + ":");
            mang[i] = scanner.nextInt(); // Nhập phần tử cho mảng
        }

        System.out.println("Mảng vừa nhập vào là:");
        for (int i=0; i<size; i++) {
            System.out.print(mang[i] + "\t"); // In ra mảng nhập vào
        }


        System.out.println("\nNhập vào số cần xóa:");
        int soCanXoa = scanner.nextInt();
        int viTriXoa = tim(mang, soCanXoa);
        if (viTriXoa == -1) {
            System.out.println("Làm gì có số này mà xóa, hâm ah");
        } else {
            int[] mangMoi = new int[mang.length - 1];
            for (int i=0; i<viTriXoa; i++) {
                mangMoi[i] = mang[i];
            }
            for (int i=viTriXoa; i<mang.length -1; i++) {
                mangMoi[i] = mang[i+1];
            }
            mang = mangMoi;
            System.out.println("Mảng mới sau khi xóa sẽ là:");
            for (int i=0; i<mang.length; i++) {
                System.out.print(mang[i] + "\t");
            }
        }
    }
}
