package ss5_accessmodifier_staticmethoc_staticproperty.bai_tap.bai_tap_3.quan_ly_san_pham_crud;

import java.util.Scanner;

public class ProductManager {
    ProductManager() {
    }

    Product product = new Product();

    Scanner scanner = new Scanner(System.in);

    private static Product[] productManagers = new Product[100];

    static {
        productManagers[0] = new Product(1, "Iphone 14", 15_000_000.0);
        productManagers[1] = new Product(2, "Iphone 15", 25_000_000.0);
        productManagers[2] = new Product(3, "Iphone 16", 35_000_000.0);
    }

    public void display() {
        for (int i = 0; i < productManagers.length; i++) {
            if (productManagers[i] != null) {
                System.out.println(productManagers[i]);
            }
        }
    }

    public void create() {
        System.out.print(" Nhập id:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập tên sản phẩm");
        String name = scanner.nextLine();
        System.out.println("Nhập giá sản phẩm");
        double price = Double.parseDouble(scanner.nextLine());

        Product newProduct = new Product(id, name, price);
        for (int i = 0; i < productManagers.length; i++) {
            if (productManagers[i] == null) {
                productManagers[i] = newProduct;
                System.out.println("Thêm sản phẩm mới thành công");
                break;
            }
        }
    }

    public void delete() {
        System.out.println("Nhập id sản phẩm bạn cần xóa: ");
        int numberDelete = Integer.parseInt(scanner.nextLine());
        int indexDel = -1;
        for (int i = 0; i < productManagers.length; i++) {
            if (productManagers[i].getId() == numberDelete && productManagers[i] != null) {
                indexDel = i;
                break;
            }
        }
        if (indexDel == -1) {
            System.out.println("Không có sản phẩm nào với số id đó! ");
        } else {
            for (int i = indexDel; i < productManagers.length - 1; i++) {
                productManagers[i] = productManagers[i + 1];
            }
        }
        display();
    }

    public void read() {
        System.out.println("Nhập id sản phẩm bạn cần kiểm tra: ");
        int idRead = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < productManagers.length; i++) {
            if (productManagers[i].getId() == idRead && productManagers[i] != null) {
                System.out.println(productManagers[i]);
                return;
            }
        }
        System.out.println("Không có id sản phẩm bạn cần kiểm tra!");
    }

    public void update() {
        System.out.println("Nhập id sản phẩm bạn cần sửa: ");
        int idUpdate = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < productManagers.length; i++) {
            if (productManagers[i].getId() == idUpdate && productManagers[i] != null) {
                System.out.println("Nhập id mới:");
                int newId = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập tên sản phẩm mới:");
                String newName = scanner.nextLine();
                System.out.println("Nhập giá sản phẩm mới:");
                double newPrice = Double.parseDouble(scanner.nextLine());
                productManagers[i].setId(newId);
                productManagers[i].setName(newName);
                productManagers[i].setPrice(newPrice);
                System.out.println("Cập nhập thành công!");
                display();
                return;
            }
        }
        System.out.println("Không tìm thấy sản phẩm để cập nhập!");
    }
}