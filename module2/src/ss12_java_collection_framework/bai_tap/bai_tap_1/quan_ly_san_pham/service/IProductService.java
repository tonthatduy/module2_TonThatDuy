package ss12_java_collection_framework.bai_tap.bai_tap_1.quan_ly_san_pham.service;

import ss12_java_collection_framework.bai_tap.bai_tap_1.quan_ly_san_pham.entity.Product;

import java.util.ArrayList;

public interface IProductService {
    ArrayList<Product> findAll();
    void add(Product product);
    void update(Product product);
    void delete(Product product);

    Product findByIDProDuct(int idProduct);

    ArrayList<Product> findNameProduct(String nameProduct);
}
