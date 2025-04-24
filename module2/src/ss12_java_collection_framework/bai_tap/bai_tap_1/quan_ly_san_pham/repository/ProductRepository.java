package ss12_java_collection_framework.bai_tap.bai_tap_1.quan_ly_san_pham.repository;

import ss12_java_collection_framework.bai_tap.bai_tap_1.quan_ly_san_pham.entity.Product;
import ss12_java_collection_framework.bai_tap.bai_tap_1.quan_ly_san_pham.util.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private static final String STUDENT_FILE = "src/ss12_java_collection_framework/bai_tap/bai_tap_1/quan_ly_san_pham/data/product.csv";
    @Override
    public List<Product> findAll() {
        // đọc file/ kết nối db => danh sách sản phẩm
        List<Product> products = new ArrayList<>();
        List<String> stringList = ReadAndWriteFile.readFile(STUDENT_FILE);
        String[] array;
        for (int i = 0; i < stringList.size(); i++) {
            array = stringList.get(i).split(",");
            Product product = new Product(Integer.parseInt(array[0]), array[1].trim(), Long.parseLong(array[2].trim()));
            products.add(product);
        }
        return products;
    }

    @Override
    public void add(Product product) {
        List<String> stringList = new ArrayList<>();
        stringList.add(product.getInfoToFile());
        ReadAndWriteFile.writeFile(STUDENT_FILE, stringList, true);
    }

    @Override
    public void update(Product product) {
        List<Product> products = findAll();

        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == product.getId()) {
                products.set(i, product);
                break;
            }
        }
        List<String> stringList = new ArrayList<>();
        for (Product product1 : products) {
            stringList.add(product1.getInfoToFile());
        }
        ReadAndWriteFile.writeFile(STUDENT_FILE,stringList,false);
    }

    @Override
    public Product findByIDProduct(int idProduct) {
        List<Product> products = findAll();

        for (Product product : products) {
            if (product.getId() == idProduct) {
                return product;
            }
        }
        return null;
    }

    @Override
    public void delete(Product product) {
        List<Product> products = findAll();
        products.remove(product);
        List<String> stringList = new ArrayList<>();
        for (Product product1 : products) {
            stringList.add(product1.getInfoToFile());
        }
        ReadAndWriteFile.writeFile(STUDENT_FILE,stringList,false);
    }

    @Override
    public ArrayList<Product> findNameProduct(String nameProduct) {
        List<Product> products = findAll();

        ArrayList<Product> products1 = new ArrayList<>();
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getTenSanPham().toLowerCase().contains(nameProduct.toLowerCase())) {
                products1.add(products.get(i));
            }
        }
        return products1;
    }
}
