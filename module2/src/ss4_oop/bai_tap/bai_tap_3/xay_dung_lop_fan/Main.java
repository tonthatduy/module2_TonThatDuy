package ss4_oop.bai_tap.bai_tap_3.xay_dung_lop_fan;

public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setOn(true);
        fan1.setSpeed(fan1.getFAST());
        fan1.setRadius(10);
        fan1.setColor("yellow");
        String fans1 = fan1.toString();

        Fan fan2 = new Fan();
        fan2.setOn(false);
        fan2.setSpeed(fan2.getMEDIUM());
        fan2.setRadius(5);
        fan2.setColor("blue");
        String fans2 = fan2.toString();
        System.out.println(fans1);
        System.out.println(fans2);

    }
}
