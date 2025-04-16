package bai_tap_lam_them.quan_ly_phuong_tien_giao_thong.entity;

public abstract class Vehicle {
    private String controlPlate;
    private String manufactureName;
    private int yearOfManufacture;
    private String name;

    public Vehicle() {
    }

    public Vehicle(String controlPlate, String manufactureName, int yearOfManufacture, String name) {
        this.controlPlate = controlPlate;
        this.manufactureName = manufactureName;
        this.yearOfManufacture = yearOfManufacture;
        this.name = name;
    }

    public String getControlPlate() {
        return controlPlate;
    }

    public void setControlPlate(String controlPlate) {
        this.controlPlate = controlPlate;
    }

    public String getManufactureName() {
        return manufactureName;
    }

    public void setManufactureName(String manufactureName) {
        this.manufactureName = manufactureName;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "controlPlate='" + controlPlate + '\'' +
                ", manufactureName='" + manufactureName + '\'' +
                ", yearOfManufacture=" + yearOfManufacture +
                ", name='" + name + '\'' +
                '}';
    }
}
