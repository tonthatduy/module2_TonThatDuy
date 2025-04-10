package ss5_accessmodifier_staticmethoc_staticproperty.bai_tap.bai_tap_3.quan_ly_san_pham_crud;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        int choice = -1;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Menu:");
            System.out.println("1. Display");
            System.out.println("2. Create");
            System.out.println("3. Read");
            System.out.println("4. Update");
            System.out.println("5. Delete");
            System.out.println("6. Exit");
            System.out.println("Enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1 -> {
                    System.out.println("---Danh sách sản phẩm---");
                    productManager.display();
                }
                case 2 -> {
                    System.out.println("---Thêm sản phẩm---");
                    productManager.create();
                }
                case 3 -> {
                    System.out.println("---Đọc sản phẩm---");
                    productManager.read();
                }
                case 4 -> {
                    System.out.println("---Cập nhập---");
                    productManager.update();
                }
                case 5 -> {
                    System.out.println("Xóa");
                    productManager.delete();
                }
                case 6 -> {
                    System.exit(6);
                }
                default -> {
                    System.out.println("No Choice!");
                }
            }
        } while (choice != 6);
    }
}
