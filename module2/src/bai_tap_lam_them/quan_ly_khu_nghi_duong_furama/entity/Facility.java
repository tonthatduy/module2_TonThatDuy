package bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.entity;

public abstract class Facility {
    private String maDichVu;
    private String nameDichVu;
    private double dienTichSuDung;
    private double chiPhiThue;
    private int soLuongNguoiToiDa;
    private String kieuThue;

    public Facility() {
    }

    public Facility(String maDichVu, String nameDichVu, double dienTichSuDung, double chiPhiThue, int soLuongNguoiToiDa, String kieuThue) {
        this.maDichVu = maDichVu;
        this.nameDichVu = nameDichVu;
        this.dienTichSuDung = dienTichSuDung;
        this.chiPhiThue = chiPhiThue;
        this.soLuongNguoiToiDa = soLuongNguoiToiDa;
        this.kieuThue = kieuThue;
    }


    public String getMaDichVu() {
        return maDichVu;
    }

    public void setMaDichVu(String maDichVu) {
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

    public double getChiPhiThue() {
        return chiPhiThue;
    }

    public void setChiPhiThue(double chiPhiThue) {
        this.chiPhiThue = chiPhiThue;
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
        return "Ma Dich Vụ = '" + maDichVu + '\'' +
                ", Tên Dịch Vụ = '" + nameDichVu + '\'' +
                ", Dien Tich Su Dung =" + dienTichSuDung +
                ", Chi Phi Thue = " + chiPhiThue +
                ", So Luong Nguoi Toi Da= " + soLuongNguoiToiDa +
                ", Kieu Thue= '" + kieuThue + '\'';
    }

    public String getInfoToFileFacility() {
        return this.maDichVu + "," + this.nameDichVu + "," + this.dienTichSuDung + "," + this.chiPhiThue + "," +
                this.soLuongNguoiToiDa + "," + this.kieuThue;
    }
}
