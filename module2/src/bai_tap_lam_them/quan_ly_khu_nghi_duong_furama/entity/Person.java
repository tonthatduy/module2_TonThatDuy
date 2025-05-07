package bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.entity;

import java.time.LocalDate;

public abstract class Person {
    private String id;
    private String ten;
    private String ngaySinh;
    private String gioiTinh;
    private String soChungMinhNhanDan;
    private String soDienThoai;
    private String eMail;

    public Person() {
    }

    public Person(String id, String ten, String ngaySinh,
                  String gioiTinh, String soChungMinhNhanDan, String soDienThoai, String eMail) {
        this.id = id;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.soChungMinhNhanDan = soChungMinhNhanDan;
        this.soDienThoai = soDienThoai;
        this.eMail = eMail;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getSoChungMinhNhanDan() {
        return soChungMinhNhanDan;
    }

    public void setSoChungMinhNhanDan(String soChungMinhNhanDan) {
        this.soChungMinhNhanDan = soChungMinhNhanDan;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", ten='" + ten + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", soChungMinhNhanDan=" + soChungMinhNhanDan +
                ", soDienThoai='" + soDienThoai + '\'' +
                ", eMail='" + eMail + '\'' +
                '}';
    }

    protected String getInfoToFilePerson() {
        return this.id + "," + this.ten + ","
                + this.ngaySinh + "," + this.gioiTinh + ","
                + this.soChungMinhNhanDan + "," + this.soDienThoai +
                "," + this.eMail;
    }
}
