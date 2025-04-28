package bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.entity;

public class Customer extends Person {
    private String loaiKhach;
    private String diaChi;

    public Customer() {
    }

    public Customer(String id, String ten, String ngaySinh,
                    String gioiTinh, int soChungMinhNhanDan, String soDienThoai, String eMail) {
        super(id, ten, ngaySinh, gioiTinh, soChungMinhNhanDan, soDienThoai, eMail);
    }

    public Customer(String id, String ten, String ngaySinh, String gioiTinh,
                    int soChungMinhNhanDan, String soDienThoai, String eMail, String loaiKhach, String diaChi) {
        super(id, ten, ngaySinh, gioiTinh, soChungMinhNhanDan, soDienThoai, eMail);
        this.loaiKhach = loaiKhach;
        this.diaChi = diaChi;
    }

    public String getLoaiKhach() {
        return loaiKhach;
    }

    public void setLoaiKhach(String loaiKhach) {
        this.loaiKhach = loaiKhach;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "Customer{" +
                super.toString() +
                "loaiKhach='" + loaiKhach + '\'' +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }
}
