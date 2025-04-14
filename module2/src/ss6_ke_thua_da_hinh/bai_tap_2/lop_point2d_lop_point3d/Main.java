package ss6_ke_thua_da_hinh.bai_tap_2.lop_point2d_lop_point3d;

public class Main {
    public static void main(String[] args) {
        //Test Point2D
        Point2D point2D = new Point2D(10.2f, 20.2f);
        System.out.println(point2D.toString());
        point2D.setXY(11.2f, 15.2f);
        float[] xy = point2D.getXY();
        System.out.println("{New Point2D " + "{" + xy[0] + "," + xy[1] + "}");

        //Test Point3D

        Point3D point3D = new Point3D(10.2f, 20.2f, 30.2f);
        System.out.println(point3D.toString());
        point3D.setXYZ(1.2f, 3.2f, 4.2f);
        float[] xyx = point3D.getXYZ();
        System.out.println("{New Point3D " + "{" + xyx[0] + "," + xyx[1] + "," + xyx[2] + "}" + "}");
    }
}
