package bai_tap_lam_them.quan_ly_hoa_don_tien_nuoc.entity;

public class KhachHangNoiDia extends KhachHang {
    String diaChi;
    String type;
    double mucTieuChuan;

    public KhachHangNoiDia(String id, String name, String diaChi, String type, double mucTieuChuan) {
        super(id, name);
        this.diaChi = diaChi;
        this.type = type;
        this.mucTieuChuan = mucTieuChuan;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getMucTieuChuan() {
        return mucTieuChuan;
    }

    public void setMucTieuChuan(double mucTieuChuan) {
        this.mucTieuChuan = mucTieuChuan;
    }

    @Override
    public String toString() {
        return "KhachHangNoiDia{" +
                "diaChi='" + diaChi + '\'' +
                ", type='" + type + '\'' +
                ", mucTieuChuan=" + mucTieuChuan +
                '}';
    }

    @Override
    public String toFileCSV() {
        return id + "," + name + "," + diaChi + "," + type + "," + mucTieuChuan + ",";
    }
}
