package ss10_dsa_danh_sach.bai_tap.bai_tap_2.quan_ly_phuong_tien_giao_thong.entity;

public class Truck extends Vehicle {
    private int payLoad;

    public Truck() {
    }

    public Truck(int payLoad) {
        this.payLoad = payLoad;
    }

    public Truck(String controlPlate, String manufactureName, int yearOfManufacture, String name, int payLoad) {
        super(controlPlate, manufactureName, yearOfManufacture, name);
        this.payLoad = payLoad;
    }

    public void setPayLoad(int payLoad) {
        this.payLoad = payLoad;
    }

    public int getPayLoad() {
        return payLoad;
    }

    @Override
    public String toString() {
        return "Truck[" +
                super.toString() +
                "payLoad=" + payLoad +
                ']';
    }

    public String getInfoFileTruck() {
        return super.getInfoVehicle() + "," + this.payLoad;
    }
}
