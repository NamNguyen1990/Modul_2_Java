package KethuaPoint;

public class Point3D extends Point2D {
    private double z = 0;

    public Point3D() {
    }

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public void setXYZ(double x, double y) {
        super.setX(x);
        super.setY(y);
        this.z = z;
    }

    public double[] getXYZ() {
        double[] XYZ = {super.getX(), super.getY(), this.z};
        return XYZ;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "x=" + super.getX() +
                ", y=" + super.getY() +
                ", z=" + z +
                '}';
    }
}
