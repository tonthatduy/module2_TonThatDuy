package ss15_exception_debug.bai_tap.bai_tap_1;

public class Triangle {
    private double a;
    private double b;
    private double c;

    public Triangle() {
    }

    public Triangle(double a, double b, double c) throws InvalidTriangleException {
        setAll(a, b, c);
    }

    public double getA() {
        return a;
    }


    public double getB() {
        return b;
    }


    public double getC() {
        return c;
    }

    public void setAll(double a, double b, double c) throws InvalidTriangleException {
        checkNumber(a, b, c);
        checkLogic(a, b, c);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void checkNumber(double a, double b, double c) throws InvalidTriangleException {
        if (a <= 0) {
            throw new InvalidTriangleException("Cạnh không được là số âm");
        }
        if (b <= 0) {
            throw new InvalidTriangleException("Cạnh không được là số âm");
        }
        if (c <= 0) {
            throw new InvalidTriangleException("Cạnh không được là số âm");
        }

    }

    public void checkLogic(double a, double b, double c) throws InvalidTriangleException {
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new InvalidTriangleException("Cạnh không là tam giác");
        }
    }
}

