package ss7_interface_abstract_class.bai_tap.bai_tap_1.trien_khai_interface_resizeable_cho_cac_lop_hinh_hoc.shape;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);

        rectangle = new Rectangle(2.5, 4.0, "orange", true);
        System.out.println(rectangle);
        rectangle.resize(50);
        System.out.println(rectangle);
    }
}
