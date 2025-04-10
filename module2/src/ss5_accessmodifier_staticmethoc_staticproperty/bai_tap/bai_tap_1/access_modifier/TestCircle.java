package ss5_accessmodifier_staticmethoc_staticproperty.bai_tap.bai_tap_1.access_modifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("Radius: " + circle.getRadius() + " Area: " + circle.getArea());
        Circle circle1 = new Circle(5.0);
        System.out.println("Radius: " + circle1.getRadius() + " Area: " + circle1.getArea());
    }

}
