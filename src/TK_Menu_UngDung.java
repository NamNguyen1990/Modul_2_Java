import java.util.Scanner;

public class TK_Menu_UngDung {
    public static void main(String[] args) {
        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("0 - Exit");
        System.out.println("1 - Vẽ hình tam giác vuông");
        System.out.println("2 - Vẽ hình tam giác cân");
        System.out.println("3 - Vẽ hình vuông");
        System.out.println("4 - Vẽ hình chữ nhật");
        System.out.println("5 - Vẽ hình thoi");
        System.out.println("Mời nhập lựa chọn");
        a = scanner.nextInt();
        if (a == 1) {
            System.out.println("Bạn đã chọn vẽ hình tam giác vuông");
            System.out.println("*");
            System.out.println("***");
            System.out.println("*****");
            System.out.println("*******");
            System.out.println("*********");
        }
        else if (a == 2) {
            System.out.println("Bạn đã chọn vẽ hình tam giác cân");
            System.out.println(" "+" "+" "+"*");
            System.out.println(" "+" "+"*"+"*"+"*");
            System.out.println(" "+"*"+"*"+"*"+"*"+"*");
            System.out.println("*"+"*"+"*"+"*"+"*"+"*"+"*");
        }
        else if (a == 3) {
            System.out.println("Bạn đã chọn vẽ hình vuông");
            System.out.println("* * * * *");
            System.out.println("* * * * *");
            System.out.println("* * * * *");
            System.out.println("* * * * *");
        }
        else if (a == 4) {
            System.out.println("Bạn đã chọn vẽ hình chữ nhật");
            System.out.println("* * * * * *");
            System.out.println("* * * * * *");
            System.out.println("* * * * * *");
        }
        else if (a == 5) {
            System.out.println("Bạn đã chọn vẽ hình thoi");
            System.out.println("     * * * * *");
            System.out.println("   * * * * *");
            System.out.println(" * * * * *");
        }
        else if (a == 0){
            System.exit(0);
        }
        else {
            System.out.println("Bạn chọn không đúng");
        }
    }
}
