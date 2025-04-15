package ss7_interface_abstract_class.bai_tap.circle_and_test;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle(3.0, "indigo", false);
        System.out.println(circle);
        circle.resize(50);
        System.out.println(circle);
    }
}
