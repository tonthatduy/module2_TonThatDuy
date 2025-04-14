package ss6_ke_thua_da_hinh.bai_tap_2.lop_point2d_lop_point3d;

public class Point3D extends Point2D {
    private float z;

    Point3D() {
        super();
    }

    Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;

    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ() {
        return new float[]{getX(), getY(), z};
    }

    public void setXYZ(float x, float y, float z) {
        setX(x);
        setY(y);
        this.z = z;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                super.toString() +
                "z=" + this.z +
                '}';
    }
}
