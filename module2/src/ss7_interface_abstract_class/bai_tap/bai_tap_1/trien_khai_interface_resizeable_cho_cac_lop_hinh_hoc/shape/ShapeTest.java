package ss7_interface_abstract_class.bai_tap.bai_tap_1.trien_khai_interface_resizeable_cho_cac_lop_hinh_hoc.shape;

public class ShapeTest {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red", false);
        System.out.println(shape);
    }
}
