package ss10_dsa_danh_sach.bai_tap.bai_tap_2.quan_ly_phuong_tien_giao_thong.entity;

import java.util.Objects;

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

    public String getInfoVehicle() {
        return this.controlPlate + ","
                + this.manufactureName + ","
                + this.yearOfManufacture + ","
                + this.name;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Vehicle vehicle = (Vehicle) object;
        return yearOfManufacture == vehicle.yearOfManufacture && Objects.equals(controlPlate, vehicle.controlPlate) && Objects.equals(manufactureName, vehicle.manufactureName) && Objects.equals(name, vehicle.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(controlPlate, manufactureName, yearOfManufacture, name);
    }
}
