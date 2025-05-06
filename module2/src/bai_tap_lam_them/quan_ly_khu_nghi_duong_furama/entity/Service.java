package bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.entity;

public class Service {
    private String maDichVu;
    private int soLanSuDung;

    public Service() {
    }

    public Service(String maDichVu, int soLanSuDung) {
        this.maDichVu = maDichVu;
        this.soLanSuDung = soLanSuDung;
    }

    public String getMaDichVu() {
        return maDichVu;
    }

    public void setMaDichVu(String maDichVu) {
        this.maDichVu = maDichVu;
    }

    public int getSoLanSuDung() {
        return soLanSuDung;
    }

    public void setSoLanSuDung(int soLanSuDung) {
        this.soLanSuDung = soLanSuDung;
    }

    public boolean needBaoDuong() {
        return soLanSuDung >= 5;
    }

    @Override
    public String toString() {
        return "Service{" +
                "maDichVu='" + maDichVu + '\'' +
                ", soLanSuDung=" + soLanSuDung +
                '}';
    }
}
