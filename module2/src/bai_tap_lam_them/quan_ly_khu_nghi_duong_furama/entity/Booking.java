package bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.entity;

import java.time.LocalDate;

public class Booking {
    private String maBooking;
    private LocalDate ngayBooking;
    private LocalDate ngayBatDau;
    private LocalDate ngayKetThuc;
    private String maKhachHang;
    private String maDichVu;

    public Booking() {
    }

    public Booking(String maBooking, LocalDate ngayBooking, LocalDate ngayBatDau,
                   LocalDate ngayKetThuc, String maKhachHang, String maDichVu) {
        this.maBooking = maBooking;
        this.ngayBooking = ngayBooking;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.maKhachHang = maKhachHang;
        this.maDichVu = maDichVu;
    }

    public String getMaBooking() {
        return maBooking;
    }

    public void setMaBooking(String maBooking) {
        this.maBooking = maBooking;
    }

    public LocalDate getNgayBooking() {
        return ngayBooking;
    }

    public void setNgayBooking(LocalDate ngayBooking) {
        this.ngayBooking = ngayBooking;
    }

    public LocalDate getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(LocalDate ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public LocalDate getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(LocalDate ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getMaDichVu() {
        return maDichVu;
    }

    public void setMaDichVu(String maDichVu) {
        this.maDichVu = maDichVu;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "maBooking='" + maBooking + '\'' +
                ", ngayBooking=" + ngayBooking +
                ", ngayBatDau=" + ngayBatDau +
                ", ngayKetThuc=" + ngayKetThuc +
                ", maKhachHang='" + maKhachHang + '\'' +
                ", maDichVu='" + maDichVu + '\'' +
                '}';
    }
}
