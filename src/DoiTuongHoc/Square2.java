package DoiTuongHoc;

public class Square2 extends Shape implements Colorable {
    private double side;


    public Square2() {
    }

    public Square2(double side) {
        this.side = side;
    }

    public Square2(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square2{" +
                "side=" + side +
                '}';
    }

    @Override
    public void resize(double percent) {
        this.side = (this.side*(percent/100));
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides..");
    }
}
