package ss7_interface_abstract_class.bai_tap.bai_tap_1.trien_khai_interface_resizeable_cho_cac_lop_hinh_hoc.shape;

import ss7_interface_abstract_class.bai_tap.square_and_test.Square;
import ss7_interface_abstract_class.bai_tap.circle_and_test.Circle;
import ss7_interface_abstract_class.bai_tap.rectangle_and_test.Rectangle;
import ss7_interface_abstract_class.bai_tap.shape_and_test.Shape;

import java.util.Random;

public class TestInterFaceResizeable {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(7.0);
        shapes[1] = new Rectangle(7.0, 10.0);
        shapes[2] = new Square(9.0);
        Random random = new Random();
        double percent = 100 * random.nextDouble();
        for (Shape shape1 : shapes) {
            if (shape1 instanceof Circle) {
                Resizeable resizeable = (Circle) shape1;
                resizeable.resize(percent);
                System.out.println("Circle = " + shape1.toString() + " AreaCircle =" + ((Circle) shape1).getArea());
            } else if (shape1 instanceof Rectangle) {
                Resizeable resizeable = (Rectangle) shape1;
                resizeable.resize(percent);
                System.out.println("Rectangle = " + shape1.toString() + " Rectangle =" + ((Rectangle) shape1).getArea());

            } else {
                Resizeable resizeable = (Square) shape1;
                resizeable.resize(percent);
                System.out.println("Square = " + shape1.toString() + " Square = " + ((Square) shape1).getArea());
            }
        }
    }
}
