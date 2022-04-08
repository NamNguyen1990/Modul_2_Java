package Accessmodifier;

public class MainCircle {
    private double radius = 1.0;
    private String color = "Red";


    public MainCircle() {
    }

    public MainCircle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public String toString() {
        return "MainCircle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
