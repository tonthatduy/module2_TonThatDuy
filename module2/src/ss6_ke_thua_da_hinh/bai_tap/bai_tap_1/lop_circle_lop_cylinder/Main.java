package ss6_ke_thua_da_hinh.bai_tap.bai_tap_1.lop_circle_lop_cylinder;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(2.5, " Red");
        System.out.println(circle.toString());
        Cylinder cylinder = new Cylinder(2.5, "Green", 5.0);
        System.out.println(cylinder.toString());
    }
}
