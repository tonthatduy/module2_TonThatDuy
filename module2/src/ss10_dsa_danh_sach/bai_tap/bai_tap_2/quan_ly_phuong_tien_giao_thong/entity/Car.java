package ss10_dsa_danh_sach.bai_tap.bai_tap_2.quan_ly_phuong_tien_giao_thong.entity;

public class Car extends Vehicle {
    private int seatQuantity;
    private String type;

    public Car() {
    }

    public Car(String type, int seatQuantity) {
        this.seatQuantity = seatQuantity;
        this.type = type;
    }

    public Car(String controlPlate, String manufactureName, int yearOfManufacture, String name, String type, int seatQuantity) {
        super(controlPlate, manufactureName, yearOfManufacture, name);
        this.seatQuantity = seatQuantity;
        this.type = type;
    }

    public int getSeatNumber() {
        return seatQuantity;
    }

    public void setSeatNumber(int seatQuantity) {
        this.seatQuantity = seatQuantity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Car[ " +
                super.toString() +
                " seatQuantity=" + seatQuantity +
                ", type='" + type + '\'' +
                ']';
    }
}
