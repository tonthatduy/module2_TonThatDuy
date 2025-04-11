package ss5_accessmodifier_staticmethoc_staticproperty.bai_tap.bai_tap_3.quan_ly_san_pham_crud;

import java.util.Scanner;

public class ProductManager {
    ProductManager() {
    }

    Scanner scanner = new Scanner(System.in);

    private static final Product[] productManagers = new Product[100];

    static {
        productManagers[0] = new Product("Iphone 14", 15_000_000.0);
        productManagers[1] = new Product("SamSung Galaxy S25", 25_000_000.0);
        productManagers[2] = new Product("ViVo 5", 35_000_000.0);
    }

    public void display() {
        for (int i = 0; i < productManagers.length; i++) {
            if (productManagers[i] != null) {
                System.out.println(productManagers[i]);
            }
        }

    }

    public void create() {
        while (true) {
            System.out.println("Type \"Exit\" to stop, or press \"Enter\" to continue create...");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Back Menu");
                return;
            }
            try {
                System.out.print("Enter Product: ");
                String name = scanner.nextLine();
                System.out.print("Enter Price: ");
                double price = Double.parseDouble(scanner.nextLine());

                Product newProduct = new Product(name, price);
                for (int i = 0; i < productManagers.length; i++) {
                    if (productManagers[i] == null) {
                        productManagers[i] = newProduct;
                        System.out.println("New product added successfully!");
                        break;
                    }
                }
                display();
                return;
            } catch (NumberFormatException e) {
                System.out.println("Re-enter must be number!");
            }
        }
    }

    public void delete() {
        display();
        while (true) {
            System.out.println("Type \"Exit\" to stop, or press \"Enter\" to continue deleting...");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Back Menu");
                return;
            }
            System.out.println("Enter the product id you need to delete: ");
            try {
                int numberDelete = Integer.parseInt(scanner.nextLine());
                int indexDel = -1;
                for (int i = 0; i < productManagers.length; i++) {
                    if (productManagers[i] != null && productManagers[i].getId() == numberDelete) {
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
            } catch (NumberFormatException e) {
                System.out.println("The number you entered is invalid! Please re-enter the number.");
                display();
            }

        }
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
                        boolean test = false;
                        for (int i = 0; i < productManagers.length; i++) {
                            Product product1 = productManagers[i];
                            if (product1 != null && product1.getId() == idSearch) {
                                System.out.println(product1);
                                test = true;
                                break;
                            }
                        }
                        if (!test) {
                            System.out.println("No id found in list!");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("The number you entered is invalid! Please re-enter the number.");
                    }
                }
                case 2 -> {
                    System.out.print("Enter Name: ");
                    String nameSearch = scanner.nextLine().toLowerCase();
                    boolean test = false;
                    for (int i = 0; i < productManagers.length; i++) {
                        Product product1 = productManagers[i];
                        if (product1 != null && product1.getName() != null && product1.getName().toLowerCase().contains(nameSearch)) {
                            System.out.println(product1);
                            test = true;
                            break;
                        }
                    }
                    if (!test) {
                        System.out.println("Name not found in list!");
                    }
                }
                case 3 -> {
                    System.out.println("Enter Price: ");
                    try {
                        double priceSearch = Double.parseDouble(scanner.nextLine());
                        boolean test = false;
                        for (int i = 0; i < productManagers.length; i++) {
                            Product product1 = productManagers[i];
                            if (product1 != null && Math.abs(product1.getPrice() - priceSearch) <= 1_000_000.0) {
                                System.out.println(product1);
                                test = true;
                                break;
                            }
                        }
                        if (!test) {
                            System.out.println("Price not found in list!");
                        }
                    } catch (NumberFormatException e) {
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
        display();
        while (true) {
            System.out.println("Type \"Exit\" to stop, or press \"Enter\" to continue update...");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Back Menu");
                return;
            }
            System.out.println("Enter Id Update: ");
            try {
                int idUpdate = Integer.parseInt(scanner.nextLine());
                boolean test = false;
                for (int i = 0; i < productManagers.length; i++) {
                    if (productManagers[i] != null && productManagers[i].getId() == idUpdate) {
                        System.out.println("Enter Product New: ");
                        String newName = scanner.nextLine();
                        System.out.println("Enter Price New: ");
                        double newPrice = Double.parseDouble(scanner.nextLine());
                        productManagers[i].setName(newName);
                        productManagers[i].setPrice(newPrice);
                        System.out.println("Updated successfully!");
                        test = true;
                        display();
                        break;
                    }
                }
                if (!test) {
                    System.out.println("Id not found! Please try again!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Re-enter must be number!");
                display();
            }
        }
    }
}

