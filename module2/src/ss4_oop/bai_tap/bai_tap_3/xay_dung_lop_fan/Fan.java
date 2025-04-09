package ss4_oop.bai_tap.bai_tap_3.xay_dung_lop_fan;

import java.awt.*;

public class Fan {
    public final int MEDIUM = 2;
    public final int FAST = 3;
    public final int SlOW = 1;
    int speed = SlOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan() {

    }

    public int getSpeed() {
        return speed;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSlOW() {
        return SlOW;
    }

    public void setSpeed(int newSpeed) {
        speed = newSpeed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double newRadius) {
        radius = newRadius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String newColor) {
        color = newColor;
    }

    public String toString() {
        if (isOn()) {
            return  "Speed: " + this.getSpeed() +
                    " Color: " + this.getColor() +
                    " Radius: " + this.getRadius() +
                    " Fan is on";
        }
        return  "Speed: " + this.getSpeed() +
                " Color: " + this.getColor() +
                " Radius: " + this.getRadius() +
                " Fan is off";

    }

}

