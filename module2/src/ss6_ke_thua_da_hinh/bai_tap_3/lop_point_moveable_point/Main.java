package ss6_ke_thua_da_hinh.bai_tap_3.lop_point_moveable_point;

public class Main {
    public static void main(String[] args) {
        // Test New Point
        Point point = new Point();
        point.setXY(3.0f, 5.9f);
        float[] xy = point.getXY();
        System.out.println("[ New Point: " + xy[0] + "," + xy[1] + "]");

        // Test Move 4 đầy đủ tham số
        MovablePoint movablePoint = new MovablePoint(2.0f, 3.0f, 1.0f, 1.5f);
        System.out.println("Before move: " + movablePoint);

        movablePoint.move().move().move().move();
        System.out.println("After move: " + movablePoint);

        // Test Đổi thông tin Speed
        MovablePoint movablePoint1 = new MovablePoint();
        movablePoint1.setSpeed(2.0f, 2.5f);
        float[] speed = movablePoint1.getSpeed();
        System.out.println("[ New Speed: " + speed[0] + "," + speed[1] + "]");
        movablePoint1.move().move();
        System.out.println("After move new speed: " + movablePoint1);
    }
}

