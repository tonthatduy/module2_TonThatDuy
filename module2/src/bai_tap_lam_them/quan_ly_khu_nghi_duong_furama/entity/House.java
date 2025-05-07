package bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.entity;

public class House extends Facility {
    private String tieuChuanPhong;
    private int soTang;

    public House() {
    }

    public House(String maDichVu, String nameDichVu, double dienTichSuDung, int soLuongNguoiToiDa, String kieuThue) {
        super(maDichVu, nameDichVu, dienTichSuDung, soLuongNguoiToiDa, kieuThue);
    }

    public House(String maDichVu, String nameDichVu, double dienTichSuDung, int soLuongNguoiToiDa,
                 String kieuThue, String tieuChuanPhong, int soTang) {
        super(maDichVu, nameDichVu, dienTichSuDung, soLuongNguoiToiDa, kieuThue);
        this.tieuChuanPhong = tieuChuanPhong;
        this.soTang = soTang;
    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    @Override
    public String toString() {
        return "House{" +
                super.toString() +
                "tieuChuanPhong='" + tieuChuanPhong + '\'' +
                ", soTang=" + soTang +
                '}';
    }
}
