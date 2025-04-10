package ss5_accessmodifier_staticmethoc_staticproperty.bai_tap.bai_tap_3.quan_ly_san_pham_crud;

import java.util.Scanner;

public class ProductManager {
    ProductManager() {
    }

    Scanner scanner = new Scanner(System.in);

    private static final Product[] productManagers = new Product[100];

    static {
        productManagers[0] = new Product(1, "Iphone 14", 15_000_000.0);
        productManagers[1] = new Product(2, "SamSung Galaxy S25", 25_000_000.0);
        productManagers[2] = new Product(3, "ViVo 5", 35_000_000.0);
    }

    public void display() {
        for (int i = 0; i < productManagers.length; i++) {
            if (productManagers[i] != null) {
                System.out.println(productManagers[i]);
            }
        }
    }

    public void create() {
        System.out.print(" Enter id:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter Product");
        String name = scanner.nextLine();
        System.out.print("Enter Price");
        double price = Double.parseDouble(scanner.nextLine());

        Product newProduct = new Product(id, name, price);
        for (int i = 0; i < productManagers.length; i++) {
            if (productManagers[i] == null) {
                productManagers[i] = newProduct;
                System.out.println("New product added successfully");
                break;
            }
        }
        display();
    }

    public void delete() {
        System.out.println("Enter the product id you need to delete: ");
        int numberDelete = Integer.parseInt(scanner.nextLine());
        int indexDel = -1;
        for (int i = 0; i < productManagers.length; i++) {
            if (productManagers[i].getId() == numberDelete && productManagers[i] != null) {
                indexDel = i;
                break;
            }
        }
        if (indexDel == -1) {
            System.out.println("There are no products with that id number! ");
        } else {
            for (int i = indexDel; i < productManagers.length - 1; i++) {
                productManagers[i] = productManagers[i + 1];
            }
        }
        display();
    }

    public void search() {
        int option;
        do {
            System.out.println("1. Search by Id");
            System.out.println("2. Search by Name");
            System.out.println("3. Search by Price");
            System.out.println("4. Return to Main Menu");
            System.out.println("Choose option: ");
            option = Integer.parseInt(scanner.nextLine());
            switch (option) {
                case 1 -> {
                    System.out.print("Enter Id: ");
                    try {
                        int idSearch = Integer.parseInt(scanner.nextLine());
                        for (int i = 0; i < productManagers.length; i++) {
                            Product product1 = productManagers[i];
                            if (product1.getId() != 0 && product1.getId() == idSearch) {
                                System.out.println(product1);
                                break;
                            }
                        }
                        System.out.println("No id found in list!");
                    } catch (NumberFormatException e){
                        System.out.println("The number you entered is invalid! Please re-enter the number.");
                    }
                }
                case 2 -> {
                    System.out.print("Enter Name: ");
                    String nameSearch = scanner.nextLine().toLowerCase();
                    for (int i = 0; i < productManagers.length; i++) {
                        Product product1 = productManagers[i];
                        if (product1 != null && product1.getName() != null && product1.getName().toLowerCase().contains(nameSearch)) {
                            System.out.println(product1);
                            break;
                        }
                    }
                    System.out.println("Name not found in list!");
                }
                case 3 -> {
                    System.out.println("Enter Price: ");
                    try {
                        double priceSearch = Double.parseDouble(scanner.nextLine());
                        for (int i = 0; i < productManagers.length; i++) {
                            Product product1 = productManagers[i];
                            if (product1 != null && Math.abs(product1.getPrice() - priceSearch) <= 1_000_000.0) {
                                System.out.println(product1);
                                break;
                            }
                        }
                        System.out.println("Price not found in list!");
                    } catch (NumberFormatException e){
                        System.out.println("The price you entered is invalid! Please re-enter the number.");
                    }
                }
                case 4 -> {
                    System.out.println("Return to Main Menu");
                    return;
                }
                default -> System.out.println("Invalid search option. Please choose again.");
            }
        } while (true);
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