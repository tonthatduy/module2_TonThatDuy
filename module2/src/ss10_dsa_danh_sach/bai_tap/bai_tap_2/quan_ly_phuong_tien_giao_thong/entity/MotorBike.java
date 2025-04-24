package ss10_dsa_danh_sach.bai_tap.bai_tap_2.quan_ly_phuong_tien_giao_thong.entity;

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
                super.toString() +
                " Capacity=" + Capacity +
                ']';
    }

    public String getInfoFileMotorBike() {
        return super.getInfoVehicle() + "," + this.Capacity;
    }

}
