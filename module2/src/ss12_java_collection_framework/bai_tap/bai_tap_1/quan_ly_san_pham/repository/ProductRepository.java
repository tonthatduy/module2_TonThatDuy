package ss12_java_collection_framework.bai_tap.bai_tap_1.quan_ly_san_pham.repository;

import ss12_java_collection_framework.bai_tap.bai_tap_1.quan_ly_san_pham.entity.Product;

import java.util.ArrayList;

public class ProductRepository implements IProductRepository {
    private static ArrayList<Product> products = new ArrayList<>();

    static {
        products.add(new Product("Iphone ProMax 15", 25_000_000));
        products.add(new Product("Redmi Pro Note 5", 7_000_000));
        products.add(new Product("SamSung Galaxy Note 15", 35_000_000));
        products.add(new Product("Galaxy S24", 23_000_000));
        products.add(new Product("Xiaomi 13", 15_000_000));
    }

    @Override
    public ArrayList<Product> findAll() {
        return products;
    }

    @Override
    public void add(Product product) {
        products.add(product);
    }

    @Override
    public void update(Product product) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == product.getId()) {
                products.set(i, product);
                break;
            }
        }
    }

    @Override
    public Product findByIDProduct(int idProduct) {
        for (Product product : products) {
            if (product.getId() == idProduct) {
                return product;
            }
        }
        return null;
    }

    @Override
    public void delete(Product product) {
        products.remove(product);
    }

    @Override
    public ArrayList<Product> findNameProduct(String nameProduct) {
        ArrayList<Product> products1 = new ArrayList<>();
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getTenSanPham().toLowerCase().contains(nameProduct.toLowerCase())) {
                products1.add(products.get(i));
            }
        }
        return products1;
    }
}
