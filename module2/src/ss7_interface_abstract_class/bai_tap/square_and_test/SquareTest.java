package ss7_interface_abstract_class.bai_tap.square_and_test;

public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(square);

        square = new Square(5.8, "yellow", true);
        System.out.println(square);
        square.resize(50);
        System.out.println(square);
    }
}
