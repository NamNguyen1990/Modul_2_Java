package ptbachai;

public class PTBacHai {
    double a;
    double b;
    double c;

    public PTBacHai() {
    }

    public PTBacHai(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDelta() {
        return (b * b - 4 * a * c);
    }


    public double getno1() {
        double delta = getDelta();
        double no1 = (-b + Math.sqrt(delta)/(2*a));
        return no1;
    }

    public double getno2() {
        double delta = getDelta();
        double no2 = (-b - Math.sqrt(delta)/(2*a));
        return no2;
    }

    @Override
    public String toString() {
        return "PTBacHai{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
