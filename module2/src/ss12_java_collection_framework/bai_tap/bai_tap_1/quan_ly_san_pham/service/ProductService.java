package ss12_java_collection_framework.bai_tap.bai_tap_1.quan_ly_san_pham.service;

import ss12_java_collection_framework.bai_tap.bai_tap_1.quan_ly_san_pham.entity.Product;
import ss12_java_collection_framework.bai_tap.bai_tap_1.quan_ly_san_pham.repository.IProductRepository;
import ss12_java_collection_framework.bai_tap.bai_tap_1.quan_ly_san_pham.repository.ProductRepository;

import java.util.ArrayList;

public class ProductService implements IProductService {
    private IProductRepository productRepository = new ProductRepository();

    @Override
    public ArrayList<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public void add(Product product) {
        productRepository.add(product);
    }

    @Override
    public void update(Product product) {
        productRepository.update(product);
    }

    @Override
    public void delete(Product product) {
        productRepository.delete(product);
    }

    @Override
    public Product findByIDProDuct(int idProduct) {
        return productRepository.findByIDProduct(idProduct);
    }

    @Override
    public ArrayList<Product> findNameProduct(String nameProduct) {
        return productRepository.findNameProduct(nameProduct);
    }
}
