package ptbachai;

import java.util.Scanner;

public class Main_PTBacHai {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        double x;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a vào đi");
        a = scanner.nextDouble();
        System.out.println("Nhập b vào đi");
        b = scanner.nextDouble();
        System.out.println("Nhập c vào đi");
        c = scanner.nextDouble();

        PTBacHai ptBacHai = new PTBacHai(a,b,c);
        System.out.println(ptBacHai);

        if (a==0) {
            if (b==0) {
                System.out.println("Phương trình vô nghiệm");
            }
            else {
                x = (-c/b);
                System.out.println("Phương trình có 1 nghiệm x =" + x);
            }
        }
        else {

            if (ptBacHai.getDelta() < 0) {
                System.out.println("Phương trình vô nghiệm");
            }
            if (ptBacHai.getDelta() == 0) {
                System.out.println("Phương trình có nghiệm kép x1 = x2 = " + ptBacHai.getno1());
            }
            if (ptBacHai.getDelta() > 0) {
                System.out.println("Phương trình có nghiệm thứ nhất là x1 = " + ptBacHai.getno1());
                System.out.println("Phương trình có nghiệm thứ hai là x2 = " + ptBacHai.getno2());
            }
        }
    }
}
