package ss6_ke_thua_da_hinh.thuc_hanh.thuc_hanh_vi_du.thuc_hanh_tinh_ke_thua;

public class Circle extends Geometric {
    /* mở rộng trường dữ liệu của lớp cha */
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, String filled) {
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    public void printCircle() {
        System.out.println("The " + getColor() + " circle is created with the radius is " + radius);
    }
}
