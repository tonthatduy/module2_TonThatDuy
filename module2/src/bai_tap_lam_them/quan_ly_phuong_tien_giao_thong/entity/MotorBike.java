package bai_tap_lam_them.quan_ly_phuong_tien_giao_thong.entity;

public class MotorBike extends Vehicle {
    private int Capacity;

    public MotorBike(int capacity) {
        Capacity = capacity;
    }

    public MotorBike() {
    }

    public MotorBike(String controlPlate, String manufactureName, int yearOfManufacture, String name, int capacity) {
        super(controlPlate, manufactureName, yearOfManufacture, name);
        Capacity = capacity;
    }

    public int getCapacity() {
        return Capacity;
    }

    public void setCapacity(int capacity) {
        Capacity = capacity;
    }

    @Override
    public String toString() {
        return "MotorBike[" +
                super.toString()+
                " Capacity=" + Capacity +
                ']';
    }
}
