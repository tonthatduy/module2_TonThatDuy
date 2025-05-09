package bai_tap_lam_them_ngoai.quan_ly_hoa_don_tien_dien.entity;

public class Foreigner extends Person {
    private String quocTich;

    public Foreigner() {
    }

    public Foreigner(String maKhachHang, String nameKhachHang, String quocTich) {
        super(maKhachHang, nameKhachHang);
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
        return "Foreigner{" + super.toString() +
                "quocTich='" + quocTich + '\'' +
                '}';
    }
}
