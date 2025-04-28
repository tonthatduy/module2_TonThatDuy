package bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.entity;

public abstract class Facility {
    private  int maDichVu;
    private  String nameDichVu;
    private  double dienTichSuDung;
    private  int soLuongNguoiToiDa;
    private  String kieuThue;

    public Facility() {
    }

    public Facility(int maDichVu, String nameDichVu, double dienTichSuDung, int soLuongNguoiToiDa, String kieuThue) {
        this.maDichVu = maDichVu;
        this.nameDichVu = nameDichVu;
        this.dienTichSuDung = dienTichSuDung;
        this.soLuongNguoiToiDa = soLuongNguoiToiDa;
        this.kieuThue = kieuThue;
    }

    public int getMaDichVu() {
        return maDichVu;
    }

    public void setMaDichVu(int maDichVu) {
        this.maDichVu = maDichVu;
    }

    public String getNameDichVu() {
        return nameDichVu;
    }

    public void setNameDichVu(String nameDichVu) {
        this.nameDichVu = nameDichVu;
    }

    public double getDienTichSuDung() {
        return dienTichSuDung;
    }

    public void setDienTichSuDung(double dienTichSuDung) {
        this.dienTichSuDung = dienTichSuDung;
    }

    public int getSoLuongNguoiToiDa() {
        return soLuongNguoiToiDa;
    }

    public void setSoLuongNguoiToiDa(int soLuongNguoiToiDa) {
        this.soLuongNguoiToiDa = soLuongNguoiToiDa;
    }

    public String getKieuThue() {
        return kieuThue;
    }

    public void setKieuThue(String kieuThue) {
        this.kieuThue = kieuThue;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "maDichVu=" + maDichVu +
                ", nameDichVu='" + nameDichVu + '\'' +
                ", dienTichSuDung=" + dienTichSuDung +
                ", soLuongNguoiToiDa=" + soLuongNguoiToiDa +
                ", kieuThue='" + kieuThue + '\'' +
                '}';
    }
}
