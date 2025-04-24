package ss12_java_collection_framework.bai_tap.bai_tap_1.quan_ly_san_pham.repository;

import ss12_java_collection_framework.bai_tap.bai_tap_1.quan_ly_san_pham.entity.Product;

import java.util.ArrayList;
import java.util.List;

public interface IProductRepository {
    List<Product> findAll();

    void add(Product product);
    void update(Product product);

    Product findByIDProduct(int idProduct);
    void delete(Product product);

    ArrayList<Product> findNameProduct(String nameProduct);
}
