package ss6_ke_thua_da_hinh.bai_tap.bai_tap_1.lop_circle_lop_cylinder;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(2.5);
        circle.setColor("Blue");
        System.out.println(circle.toString());
        Circle circle1 = new Circle(3.0, "Orange");
        System.out.println(circle1.toString());
        Cylinder cylinder = new Cylinder();
        cylinder.setHeight(10.0);
        System.out.println(cylinder.toString());
        Cylinder cylinder1 = new Cylinder(4.5, 5.0);
        System.out.println(cylinder1.toString());
        Cylinder cylinder2 = new Cylinder(5.5, "Yellow", 6.0);
        System.out.println(cylinder2.toString());

    }
}
