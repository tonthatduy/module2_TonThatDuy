package bai_tap_lam_them_ngoai.quan_ly_hoa_don_tien_dien.entity;

public class Bill {
    private String maHoaDon;
    private String maKhachHang;
    private String ngayRaHoaDon;
    private int soLuongTieuThu;
    private double donGia;
    private double tien;

    public Bill() {
    }

    public Bill(String maHoaDon, String maKhachHang, String ngayRaHoaDon,
                int soLuongTieuThu, double donGia, double tien) {
        this.maHoaDon = maHoaDon;
        this.maKhachHang = maKhachHang;
        this.ngayRaHoaDon = ngayRaHoaDon;
        this.soLuongTieuThu = soLuongTieuThu;
        this.donGia = donGia;
        this.tien = tien;
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getNgayRaHoaDon() {
        return ngayRaHoaDon;
    }

    public void setNgayRaHoaDon(String ngayRaHoaDon) {
        this.ngayRaHoaDon = ngayRaHoaDon;
    }

    public int getSoLuongTieuThu() {
        return soLuongTieuThu;
    }

    public void setSoLuongTieuThu(int soLuongTieuThu) {
        this.soLuongTieuThu = soLuongTieuThu;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getTien() {
        return tien;
    }

    public void setTien(double tien) {
        this.tien = tien;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "maHoaDon='" + maHoaDon + '\'' +
                ", maKhachHang='" + maKhachHang + '\'' +
                ", ngayRaHoaDon='" + ngayRaHoaDon + '\'' +
                ", soLuongTieuThu=" + soLuongTieuThu +
                ", donGia=" + donGia +
                ", tien=" + tien +
                '}';
    }
}
