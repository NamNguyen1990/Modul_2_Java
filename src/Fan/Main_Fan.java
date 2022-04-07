package Fan;

import java.util.Scanner;

public class Main_Fan {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Fan fan1 = new Fan(3,true,10,"yellow");
        System.out.println(fan1);
        Fan fan2 = new Fan(2,false,5, "Blue");
        System.out.println(fan2);

    }
}
