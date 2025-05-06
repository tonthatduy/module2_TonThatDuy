package bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.entity;

import java.time.LocalDate;

public class Event {
    private String tenSuKien;
    private LocalDate ngayToChuc;

    public Event() {
    }

    public Event(String tenSuKien, LocalDate ngayToChuc) {
        this.tenSuKien = tenSuKien;
        this.ngayToChuc = ngayToChuc;
    }

    public String getTenSuKien() {
        return tenSuKien;
    }

    public void setTenSuKien(String tenSuKien) {
        this.tenSuKien = tenSuKien;
    }

    public LocalDate getNgayToChuc() {
        return ngayToChuc;
    }

    public void setNgayToChuc(LocalDate ngayToChuc) {
        this.ngayToChuc = ngayToChuc;
    }

    @Override
    public String toString() {
        return "Event{" +
                "tenSuKien='" + tenSuKien + '\'' +
                ", ngayToChuc=" + ngayToChuc +
                '}';
    }
}
