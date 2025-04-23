package ss12_java_collection_framework.bai_tap.bai_tap_1.quan_ly_san_pham.common;

import ss12_java_collection_framework.bai_tap.bai_tap_1.quan_ly_san_pham.entity.Product;

import java.util.Comparator;

public class ReduceSortByPrice implements Comparator<Product> {


    @Override
    public int compare(Product o1, Product o2) {
        return (int) (o2.getGiaSanPham() - o1.getGiaSanPham());
    }
}
