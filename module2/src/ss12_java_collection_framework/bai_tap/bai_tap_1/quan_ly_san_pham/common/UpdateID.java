package ss12_java_collection_framework.bai_tap.bai_tap_1.quan_ly_san_pham.common;

import ss12_java_collection_framework.bai_tap.bai_tap_1.quan_ly_san_pham.entity.Product;
import ss12_java_collection_framework.bai_tap.bai_tap_1.quan_ly_san_pham.service.ProductService;

import java.util.List;

public class UpdateID {
    private static ProductService service = new ProductService();
    private static List<Product> products = service.findAll();
    public static int currentId = products.get(products.size() - 1).getId();
}
