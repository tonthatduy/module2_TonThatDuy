package ss7_interface_abstract_class.bai_tap.bai_tap_1.trien_khai_interface_resizeable_cho_cac_lop_hinh_hoc.shape;

import ss7_interface_abstract_class.bai_tap.bai_tap_2.trien_khai_interface_colorable_cho_cac_lop_hinh_hoc.Colorable;

public class Square extends Shape implements Resizeable, Colorable {
    private double side = 1.0f;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        super(color, filled);
        this.side = side;

    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return getSide() * getSide();
    }

    public double getPerimeter() {
        return 4 * getSide();
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void resize(double percent) {
        setSide(side * (1 + percent / 100));
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four side");
    }
}
