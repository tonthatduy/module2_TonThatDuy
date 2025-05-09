package bai_tap_lam_them_ngoai.quan_ly_hoa_don_tien_dien.entity;

public class VietNam extends Person {
    private String loaiKhachHang;
    private double dinhMucTieuThu;

    public VietNam() {
    }

    public VietNam(String maKhachHang, String nameKhachHang, String loaiKhachHang, double dinhMucTieuThu) {
        super(maKhachHang, nameKhachHang);
        this.loaiKhachHang = loaiKhachHang;
        this.dinhMucTieuThu = dinhMucTieuThu;
    }

    public String getLoaiKhachHang() {
        return loaiKhachHang;
    }

    public void setLoaiKhachHang(String loaiKhachHang) {
        this.loaiKhachHang = loaiKhachHang;
    }

    public double getDinhMucTieuThu() {
        return dinhMucTieuThu;
    }

    public void setDinhMucTieuThu(double dinhMucTieuThu) {
        this.dinhMucTieuThu = dinhMucTieuThu;
    }

    @Override
    public String toString() {
        return "PersonVietNam{" + super.toString()
                + "loaiKhachHang='" + loaiKhachHang + '\'' +
                ", dinhMucTieuThu=" + dinhMucTieuThu +
                '}';
    }
}
