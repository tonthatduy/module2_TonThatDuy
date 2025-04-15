package ss7_interface_abstract_class.bai_tap.bai_tap_1.trien_khai_interface_resizeable_cho_cac_lop_hinh_hoc.shape;

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
