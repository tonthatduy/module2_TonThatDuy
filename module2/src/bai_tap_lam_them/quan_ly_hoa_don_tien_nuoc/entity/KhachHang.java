package bai_tap_lam_them.quan_ly_hoa_don_tien_nuoc.entity;

import java.util.Objects;

public abstract class KhachHang implements Comparable<KhachHang> {
    String id;
    String name;


    public KhachHang(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "KhachHang{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public abstract String toFileCSV();

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        KhachHang khachHang = (KhachHang) object;
        return Objects.equals(id, khachHang.id) && Objects.equals(name, khachHang.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public int compareTo(KhachHang o) {
        return this.getName().compareTo(o.getName());
    }
}
