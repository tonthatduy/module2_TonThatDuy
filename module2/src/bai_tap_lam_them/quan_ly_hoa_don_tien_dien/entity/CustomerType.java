package bai_tap_lam_them.quan_ly_hoa_don_tien_dien.entity;

public class CustomerType {
    String id;
    String name;

    public CustomerType(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
