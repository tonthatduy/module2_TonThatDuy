package ss12_java_collection_framework.bai_tap.bai_tap_1.quan_ly_san_pham.entity;

import java.text.DecimalFormat;

public class Product {
    private static int idNext = 0;
    private int id;
    private String tenSanPham;
    private long giaSanPham;

    public Product() {
    }

    public Product(String tenSanPham, long giaSanPham) {
        this.id = ++idNext;
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
}
