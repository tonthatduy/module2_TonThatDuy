package ss7_interface_abstract_class.bai_tap.bai_tap_2.trien_khai_interface_colorable_cho_cac_lop_hinh_hoc;

import ss7_interface_abstract_class.bai_tap.circle_and_test.Circle;
import ss7_interface_abstract_class.bai_tap.rectangle_and_test.Rectangle;
import ss7_interface_abstract_class.bai_tap.shape_and_test.Shape;
import ss7_interface_abstract_class.bai_tap.square_and_test.Square;

public class TestInterfaceColorable {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5.0);
        shapes[1] = new Rectangle(5.0, 7.0);
        shapes[2] = new Square(6.0);
        System.out.println("Area is: ");
        for (Shape shape1 : shapes) {
            if (shape1 instanceof Circle) {
                System.out.println("Area Circle = " + ((Circle) shape1).getArea());
            } else if (shape1 instanceof Rectangle) {
                System.out.println("Area Rectangle = " + ((Rectangle) shape1).getArea());
            } else {
                Colorable colorable = (Square) shape1;
                System.out.println("Area Square= " + ((Square) shape1).getArea());
                colorable.howToColor();
            }
        }
    }
}
