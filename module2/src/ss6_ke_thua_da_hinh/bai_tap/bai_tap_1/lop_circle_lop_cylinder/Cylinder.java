package ss6_ke_thua_da_hinh.bai_tap.bai_tap_1.lop_circle_lop_cylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        super();
        this.height = 1.0;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    @Override
    public double circleArea(){
        return 2 * Math.PI * super.getRadius() * (super.getRadius() + getHeight());
    }

    public double cylinderVolume() {
        return circleArea() * this.height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                super.toString() +
                " height=" + this.height +
                " Volume=" + cylinderVolume() +
                " Cylinder Area = " + circleArea() +
                '}';
    }
}
