package ss5_access_modifier_static_method_static_property.bai_tap.bai_tap_3.quan_ly_san_pham_crud;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();

        Scanner scanner = new Scanner(System.in);
        menuLoop:
        do {
            System.out.println("-----Menu-----");
            System.out.println("1. Display");
            System.out.println("2. Create");
            System.out.println("3. Search");
            System.out.println("4. Update");
            System.out.println("5. Delete");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                System.out.println("You have not entered anything. Please re-enter!");
                continue;
            }
            int choice;
            try {
                choice = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("You must enter an integer. Please re-enter!");
                continue;
            }
            switch (choice) {
                case 1 -> {
                    System.out.println("---Product List---");
                    productManager.display();
                }
                case 2 -> {
                    System.out.println("---Create Product---");
                    productManager.create();
                }
                case 3 -> {
                    System.out.println("---Search Product---");
                    productManager.search();
                }
                case 4 -> {
                    System.out.println("---Update Product---");
                    productManager.update();
                }
                case 5 -> {
                    System.out.println("---Delete Product---");
                    productManager.delete();
                }
                case 6 -> {
                    System.out.println("---Thanks---");
                    break menuLoop;
                }
                default -> System.out.println("No Choice!");
            }
        } while (true);
    }
}
