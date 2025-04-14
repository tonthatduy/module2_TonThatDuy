package ss6_ke_thua_da_hinh.bai_tap_3.lop_point_moveable_point;

public class Main {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(2.0f, 3.0f, 1.0f, 1.5f);
        System.out.println("Before move: " + movablePoint);

        movablePoint.move().move().move().move();
        System.out.println("After move: " + movablePoint);
    }
}

