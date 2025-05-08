package bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.entity;

public class Villa extends Facility {
    private String tieuChuanPhong;
    private Double dienTichHoBoi;
    private int soTang;

    public Villa() {
    }

    public Villa(String maDichVu, String nameDichVu, double dienTichSuDung, int soLuongNguoiToiDa, String kieuThue) {
        super(maDichVu, nameDichVu, dienTichSuDung, soLuongNguoiToiDa, kieuThue);
    }

    public Villa(String maDichVu, String nameDichVu, double dienTichSuDung, int soLuongNguoiToiDa, String kieuThue, String tieuChuanPhong, Double dienTichHoBoi, int soTang) {
        super(maDichVu, nameDichVu, dienTichSuDung, soLuongNguoiToiDa, kieuThue);
        this.tieuChuanPhong = tieuChuanPhong;
        this.dienTichHoBoi = dienTichHoBoi;
        this.soTang = soTang;
    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public Double getDienTichHoBoi() {
        return dienTichHoBoi;
    }

    public void setDienTichHoBoi(Double dienTichHoBoi) {
        this.dienTichHoBoi = dienTichHoBoi;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    @Override
    public String toString() {
        return "Villa | " +
                super.toString() +
                "tieuChuanPhong='" + tieuChuanPhong + '\'' +
                ", dienTichHoBoi=" + dienTichHoBoi +
                ", soTang=" + soTang +
                '|';
    }

    public String getInfoToFileVilla() {
        return super.getInfoToFileFacility() + "," + this.tieuChuanPhong + "," + this.dienTichHoBoi + "," + this.soTang;
    }
}
