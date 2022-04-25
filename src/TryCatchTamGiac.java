import java.util.Scanner;

public class TryCatchTamGiac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào cạnh 1");
        int a = sc.nextInt();
        System.out.println("Nhập vào cạnh 2");
        int b = sc.nextInt();
        System.out.println("Nhập vào cạnh 3");
        int c = sc.nextInt();
        if (a<0||b<0||c<0 || a+b<c || b+c<b || c+b<a) {
            try {
                throw new IllegalTriangleException();
            }catch (IllegalTriangleException e) {
                System.out.println(e);
            }
        }else {
            System.out.println("Đây là cạnh của tam giác");
        }
    }

    public static class IllegalTriangleException extends Exception {
        @Override
        public String toString() {
            return "Tam giác này không đúng";
        }
    }

}
