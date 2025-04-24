package ss12_java_collection_framework.bai_tap.bai_tap_1.quan_ly_san_pham.entity;

import ss12_java_collection_framework.bai_tap.bai_tap_1.quan_ly_san_pham.common.UpdateID;

import java.text.DecimalFormat;
import java.util.Objects;

public class Product {
    private static int idNext = 0;
    private int id;
    private String tenSanPham;
    private long giaSanPham;

    public Product() {
    }

    public Product(int id, String tenSanPham, long giaSanPham) {
        this.id = id;
        this.tenSanPham = tenSanPham;
        this.giaSanPham = giaSanPham;
    }

    public Product(String tenSanPham, long giaSanPham) {
        this.id = ++UpdateID.currentId;
        this.tenSanPham = tenSanPham;
        this.giaSanPham = giaSanPham;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public long getGiaSanPham() {
        return giaSanPham;
    }

    public void setGiaSanPham(long giaSanPham) {
        this.giaSanPham = giaSanPham;
    }

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("#,###");
        return "Product[" +
                "id=" + id +
                ", tenSanPham='" + tenSanPham + '\'' +
                ", giaSanPham=" + decimalFormat.format(this.giaSanPham) +
                "VND" +
                ']';
    }

    public String getInfoToFile() {
        return this.id + "," + this.tenSanPham + "," + this.giaSanPham;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Product product = (Product) object;
        return id == product.id && giaSanPham == product.giaSanPham && Objects.equals(tenSanPham, product.tenSanPham);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, tenSanPham, giaSanPham);
    }
}
