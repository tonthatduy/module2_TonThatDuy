package ss5_accessmodifier_staticmethoc_staticproperty.bai_tap.bai_tap_1.access_modifier;

public class Circle {
    private double radius = 1.0;
    private String color = "Red";

    Circle() {
    }

    Circle(double radius) {
        this.radius = radius;
    }

    protected double getRadius() {
        return radius;
    }

    protected double getArea() {
        return radius * radius * Math.PI;
    }
}
