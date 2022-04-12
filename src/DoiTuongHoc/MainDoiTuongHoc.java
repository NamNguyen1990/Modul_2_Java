package DoiTuongHoc;

public class MainDoiTuongHoc {
    public static void main(String[] args) {
        Shape shape1 = new Shape();
        System.out.println(shape1);

        Shape shape2 = new Shape("Red",false);
        System.out.println(shape2);

        Circle circle1 = new Circle();
        System.out.println(circle1); // Mặc định ban đầu
        Circle circle2 = new Circle(5);
        System.out.println(circle2); // Truyền vào để thay đổi bán kính
        Circle circle3 = new Circle(10,"Blue",false);
        System.out.println(circle3); // Truyền vào thay đổi theo kế thừa

        Rectangle rectangle1 = new Rectangle();
        System.out.println(rectangle1);
        Rectangle rectangle2 = new Rectangle(2,8);
        System.out.println(rectangle2);
        Rectangle rectangle3 = new Rectangle(10,20,"Blue",true);
        System.out.println(rectangle3);

        Square square1 = new Square();
        System.out.println(square1);
        Square square2 = new Square(4,"While",false);
        System.out.println(square2);


        Triangle triangle1 = new Triangle();
        System.out.println(triangle1);
        Triangle triangle2 = new Triangle("Blue",true,2,4,4);
        System.out.println(triangle2);

    }

}
