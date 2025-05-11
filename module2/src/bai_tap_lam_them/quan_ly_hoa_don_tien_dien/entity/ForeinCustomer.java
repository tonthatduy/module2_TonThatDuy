package bai_tap_lam_them.quan_ly_hoa_don_tien_dien.entity;

public class ForeinCustomer extends Customer {
    String nationlity;

    public ForeinCustomer(String id, String name, String nationlity) {
        super(id, name);
        this.nationlity = nationlity;
    }

    public String getNationlity() {
        return nationlity;
    }

    public void setNationlity(String nationlity) {
        this.nationlity = nationlity;
    }

    @Override
    public String toString() {
        return "ForeinCustomer{" +
                "nationlity='" + nationlity + '\'' +
                '}';
    }

    @Override
    public String toCSVFile() {
        return id + "," + name + ",,," + nationlity;
    }

}
