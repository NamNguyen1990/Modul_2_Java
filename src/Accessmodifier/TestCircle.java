package Accessmodifier;

public class TestCircle {
    public static void main(String[] args) {
        MainCircle Circle1 = new MainCircle();
        System.out.println(Circle1);
        System.out.println(Circle1.getColor());
        MainCircle Circle2 = new MainCircle(8,"Blue");
        System.out.println(Circle2.getArea());

    }
}
