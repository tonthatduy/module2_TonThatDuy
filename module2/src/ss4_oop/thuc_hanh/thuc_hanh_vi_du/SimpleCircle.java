package ss4_oop.thuc_hanh.thuc_hanh_vi_du;

public class SimpleCircle {
    double radius;
    /* Construct a circle with radius */

    SimpleCircle() {
        radius = 1;
    }

    /* Construct a circle with a specified radius */
    SimpleCircle(double newRadius) {
        radius = newRadius;
    }

    /* Return the area of this circle */
    double getArea() {
        return radius * radius * Math.PI;
    }

    /* return the perimeter of this circle */
    double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    /* set a new radius for this circle */
    void setRadius(double newRadius) {
        radius = newRadius;
    }
}
