package bai_tap_lam_them.quan_ly_hoa_don_tien_nuoc.entity;

public class KhachHangQuocTe extends KhachHang {
    String quocTich;

    public KhachHangQuocTe(String id, String name, String quocTich) {
        super(id, name);
        this.quocTich = quocTich;
    }

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }

    @Override
    public String toString() {
        return "KhachHangQuocTe{" +
                "quocTich='" + quocTich + '\'' +
                '}';
    }

    @Override
    public String toFileCSV() {
        return id + "," + name + "," + ",,," + quocTich;
    }
}
