package ss12_java_collection_framework.bai_tap.bai_tap_1.quan_ly_san_pham.common;

import ss12_java_collection_framework.bai_tap.bai_tap_1.quan_ly_san_pham.entity.Product;
import ss12_java_collection_framework.bai_tap.bai_tap_1.quan_ly_san_pham.service.ProductService;

import java.util.List;

public class UpdateID {
    private static int getCurrentId() {
        ProductService service = new ProductService();
        List<Product> products = service.findAll();
        if (products.size()>0){
           return products.get(products.size() - 1).getId();
        } else {
            return 0;
        }
    }

    public static int currentId = getCurrentId();
}
