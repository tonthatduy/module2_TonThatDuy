package ss12_java_collection_framework.bai_tap.bai_tap_1.quan_ly_san_pham.view;

import ss12_java_collection_framework.bai_tap.bai_tap_1.quan_ly_san_pham.entity.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductView {
    private static Scanner scanner = new Scanner(System.in);

    public static void displayProduct(ArrayList<Product> products) {
        for (int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i));
        }
    }

    public static Product inputDataForProduct() {
        System.out.println("Nhập tên sản phẩm");
        String tenSanPham = scanner.nextLine();
        System.out.println("Nhập giá sản phẩm");
        long giaSanPham = Long.parseLong(scanner.nextLine());
        return new Product(tenSanPham, giaSanPham);
    }
    public static int findIDProduct(){
        System.out.println("Nhập id cần sửa/xóa");
        return Integer.parseInt(scanner.nextLine());
    }

    public static Product inputUpdateProDuct(Product product) {
        System.out.println("Nhập tên sản phẩm mới");
        product.setTenSanPham(scanner.nextLine());;
        System.out.println("Nhập giá sản phẩm mới");
        product.setGiaSanPham(Long.parseLong(scanner.nextLine()));
        return product;
    }
    public static String findNameProduct(){
        System.out.println("Nhập tên cần tìm");
        return scanner.nextLine();
    }
}
