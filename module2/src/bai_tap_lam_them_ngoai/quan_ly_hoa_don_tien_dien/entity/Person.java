package bai_tap_lam_them_ngoai.quan_ly_hoa_don_tien_dien.entity;

public abstract class Person {
    private String maKhachHang;
    private String nameKhachHang;

    public Person() {
    }

    public Person(String maKhachHang, String nameKhachHang) {
        this.maKhachHang = maKhachHang;
        this.nameKhachHang = nameKhachHang;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getNameKhachHang() {
        return nameKhachHang;
    }

    public void setNameKhachHang(String nameKhachHang) {
        this.nameKhachHang = nameKhachHang;
    }

    @Override
    public String toString() {
        return "Ma Khach Hang='" + maKhachHang + '\'' +
                ", Name `KhachHang='" + nameKhachHang + '\'';
    }
}
