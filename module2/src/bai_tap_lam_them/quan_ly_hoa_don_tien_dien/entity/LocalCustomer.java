package bai_tap_lam_them.quan_ly_hoa_don_tien_dien.entity;

public class LocalCustomer extends Customer {
    String type;
    double consumption;

    public LocalCustomer(String id, String name, String type, double consumption) {
        super(id, name);
        this.type = type;
        this.consumption = consumption;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getConsumption() {
        return consumption;
    }

    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }

    @Override
    public String toString() {
        return "LocalCustomer{" +
                "type='" + type + '\'' +
                ", consumption=" + consumption +
                '}';
    }

    @Override
    public String toCSVFile() {
        return id + "," + name + "," + type + "," + consumption + ",";
    }

}
