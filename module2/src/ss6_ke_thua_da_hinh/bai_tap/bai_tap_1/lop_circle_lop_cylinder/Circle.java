package ss6_ke_thua_da_hinh.bai_tap.bai_tap_1.lop_circle_lop_cylinder;

public class Circle {
    private double radius;
    private String color;

     public Circle() {
         this.radius = 1.0;
         this.color = "Red";
    }
    public Circle( double radius){
         this.radius = radius;
         this.color = "Red";
    }

    public Circle(double radius, String color) {
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

    public double circleArea() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + this.getRadius() +
                ", color='" + this.getColor() + '\'' +
                "CircleArea=" + circleArea() +
                '}';
    }
}

