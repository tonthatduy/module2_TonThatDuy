package ss12_java_collection_framework.bai_tap.bai_tap_1.quan_ly_san_pham.controller;

import ss12_java_collection_framework.bai_tap.bai_tap_1.quan_ly_san_pham.common.AscendingSortByPrice;
import ss12_java_collection_framework.bai_tap.bai_tap_1.quan_ly_san_pham.common.ReduceSortByPrice;
import ss12_java_collection_framework.bai_tap.bai_tap_1.quan_ly_san_pham.entity.Product;
import ss12_java_collection_framework.bai_tap.bai_tap_1.quan_ly_san_pham.service.ProductService;
import ss12_java_collection_framework.bai_tap.bai_tap_1.quan_ly_san_pham.view.ProductView;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductController {
    private static Scanner scanner = new Scanner(System.in);
    private static ProductService productService = new ProductService();

    public static void displayMenu() {

        int choice;
        menuLoop:
        do {
            System.out.println("--------Product Manager--------");
            System.out.println("1. Thêm Sản Phẩm ");
            System.out.println("2. Sửa Sản Phẩm ");
            System.out.println("3. Xóa Sản Phẩm ");
            System.out.println("4. Hiển Thị Sản Phẩm ");
            System.out.println("5. Tìm Kiếm Sản Phảm ");
            System.out.println("6. Sắp Xếp Sản Phẩm ");
            System.out.println("7 Thoát!");
            choice = readInt("Chọn trong khoảng 1 -7: ", 1, 7);
            switch (choice) {
                case 1 -> {
                    System.out.println("---Thêm Sản Phẩm---");
                    productService.add(ProductView.inputDataForProduct());
                    System.out.println("---Thêm Thành Công---");
                    ProductView.displayProduct(productService.findAll());
                }
                case 2 -> {
                    System.out.println("---Sửa Sản Phẩm---");
                    ProductView.displayProduct(productService.findAll());
                    update();
                    ProductView.displayProduct(productService.findAll());
                }
                case 3 -> {
                    System.out.println("---Xóa Sản Phẩm---");
                    ProductView.displayProduct(productService.findAll());
                    delete();
                }
                case 4 -> {
                    System.out.println("---Hiển Thị Sản Phẩm---");
                    ProductView.displayProduct(productService.findAll());
                }
                case 5 -> {
                    System.out.println("---Tìm Kiếm Sản Phẩm---");
                    ArrayList<Product> product = productService.findNameProduct(ProductView.findNameProduct());
                    ProductView.displayProduct(product);
                }
                case 6 -> {
                    System.out.println("---Sắp Xếp Sản Phẩm---");
                    sort();
                }
                case 7 -> {
                    System.out.println("-----Thank!-----");
                    break menuLoop;
                }
                default -> {
                    System.out.println("Chọn Lại");
                }
            }
        } while (true);
    }

    public static int readInt(String prompt, int min, int max) {
        while (true) {
            System.out.println(prompt);
            String string = scanner.nextLine();
            if (string.trim().isEmpty()) {
                System.out.println("Không được dể trống");
                continue;
            }
            try {
                int num = Integer.parseInt(string);
                if (num < min || num > max) {
                    System.out.println("Nhập lại trong khoảng 1-7: ");
                } else
                    return num;
            } catch (NumberFormatException e) {
                System.out.println("Nhập lại");
            }
        }
    }

    public static void delete() {
        Product product = productService.findByIDProDuct(ProductView.findIDProduct());
        if (product == null) {
            System.out.println("Không có trong danh sách");
        } else {
            productService.delete(product);
            System.out.println("Xóa thành công");
        }
    }

    public static void update() {
        Product product = productService.findByIDProDuct(ProductView.findIDProduct());
        if (product == null) {
            System.out.println("Không có trong danh sách");
        } else {
            productService.update(ProductView.inputUpdateProDuct(product));
            System.out.println("--- Sửa Thành Công---");
        }

    }

    public static void sort() {
        int choice;
        do {
            System.out.println("1. Sắp Xếp Tăng dần");
            System.out.println("2. Sắp Xếp Giảm dần");
            System.out.println("3. Quay lại Trang Chủ");
            choice = readInt("Chọn trong khoảng 1-3:", 1, 3);
            if (choice == 1) {
                ArrayList<Product> products = productService.findAll();
//                products.sort(((o1, o2) -> (int) (o1.getGiaSanPham() - o2.getGiaSanPham())));
                products.sort(new AscendingSortByPrice());
                ProductView.displayProduct(productService.findAll());

            } else if (choice == 2) {
                ArrayList<Product> products = productService.findAll();
                products.sort(new ReduceSortByPrice());
                ProductView.displayProduct(productService.findAll());

            } else {
                return;
            }
        } while (true);

    }
}
