package bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.entity;

public class Contract {
    private String soHopDong;
    private String maBooking;
    private double soTienCocTruoc;
    private double tongTienThanhToan;

    public Contract() {
    }

    public Contract(String soHopDong, String maBooking, double soTienCocTruoc, double tongTienThanhToan) {
        this.soHopDong = soHopDong;
        this.maBooking = maBooking;
        this.soTienCocTruoc = soTienCocTruoc;
        this.tongTienThanhToan = tongTienThanhToan;
    }

    public String getMaBooking() {
        return maBooking;
    }

    public void setMaBooking(String maBooking) {
        this.maBooking = maBooking;
    }

    public String getSoHopDong() {
        return soHopDong;
    }

    public void setSoHopDong(String soHopDong) {
        this.soHopDong = soHopDong;
    }

    public double getSoTienCocTruoc() {
        return soTienCocTruoc;
    }

    public void setSoTienCocTruoc(double soTienCocTruoc) {
        this.soTienCocTruoc = soTienCocTruoc;
    }

    public double getTongTienThanhToan() {
        return tongTienThanhToan;
    }

    public void setTongTienThanhToan(double tongTienThanhToan) {
        this.tongTienThanhToan = tongTienThanhToan;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "soHopDong='" + soHopDong + '\'' +
                ", maBooking='" + maBooking + '\'' +
                ", soTienCocTruoc=" + soTienCocTruoc +
                ", tongTienThanhToan=" + tongTienThanhToan +
                '}';
    }
}
