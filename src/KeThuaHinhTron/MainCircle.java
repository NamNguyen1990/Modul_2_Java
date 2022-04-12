package KeThuaHinhTron;

public class MainCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5,"Red");
        System.out.println(circle1);
        System.out.println("Chu vi hình tròn là:" + circle1.getChuvi());
        System.out.println("Diện tích hình tròn là:" + circle1.getDientich());

        Cylinder cylinder1 = new Cylinder(8,"Blue",10);
        System.out.println(cylinder1);
        System.out.println("Thể tích hình trụ là: "+ cylinder1.getThetich());

    }
}
