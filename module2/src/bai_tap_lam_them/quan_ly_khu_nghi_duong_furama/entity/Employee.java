package bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.entity;

public class Employee extends Person {
    private String trinhDo;
    private String viTri;
    private long luong;

    public Employee() {
    }

    public Employee(String id, String ten, String ngaySinh,
                    String gioiTinh, int soChungMinhNhanDan, String soDienThoai, String eMail) {
        super(id, ten, ngaySinh, gioiTinh, soChungMinhNhanDan, soDienThoai, eMail);
    }

    public Employee(String id, String ten, String ngaySinh, String gioiTinh,
                    int soChungMinhNhanDan, String soDienThoai, String eMail, String trinhDo, String viTri, long luong) {
        super(id, ten, ngaySinh, gioiTinh, soChungMinhNhanDan, soDienThoai, eMail);
        this.trinhDo = trinhDo;
        this.viTri = viTri;
        this.luong = luong;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public long getLuong() {
        return luong;
    }

    public void setLuong(long luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        return "Employee{" +
                super.toString() +
                "trinhDo='" + trinhDo + '\'' +
                ", viTri='" + viTri + '\'' +
                ", luong=" + luong +
                '}';
    }
}
