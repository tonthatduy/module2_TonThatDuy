package bai_tap_ngoai.test.quan_ly_khach_san;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HotelManager {
    private List<Room> rooms = new ArrayList<>();
    private List<Customer> customers = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    private int nextCustomerId = 1;

    public static void main(String[] args) {
        new HotelManager().run();
    }

    private void run() {
        while (true) {
            System.out.println("\n===== HOTEL MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Room");
            System.out.println("2. Show All Rooms");
            System.out.println("3. Add Customer");
            System.out.println("4. Show All Customers");
            System.out.println("5. Update Customer");
            System.out.println("6. Delete Customer");
            System.out.println("7. Check-Out (Free Room)");
            System.out.println("8. Search Customer");
            System.out.println("9. Exit");
            System.out.print("Choose option: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1 -> addRoom();
                case 2 -> showRooms();
                case 3 -> addCustomer();
                case 4 -> showCustomers();
                case 5 -> updateCustomer();
                case 6 -> deleteCustomer();
                case 7 -> checkoutCustomer();
                case 8 -> searchCustomer();
                case 9 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid option.");
            }
        }
    }

    private void addRoom() {
        System.out.print("Enter room number: ");
        String roomNumber = scanner.nextLine();
        System.out.print("Enter room type (Single/Double/Suite): ");
        String type = scanner.nextLine();
        rooms.add(new Room(roomNumber, type));
        System.out.println("Room added successfully!");
    }

    private void showRooms() {
        if (rooms.isEmpty()) {
            System.out.println("No rooms available.");
        } else {
            for (Room r : rooms) {
                System.out.println(r);
            }
        }
    }

    private void addCustomer() {
        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();
        System.out.print("Enter phone number: ");
        String phone = scanner.nextLine();

        Room availableRoom = findAvailableRoom();
        if (availableRoom == null) {
            System.out.println("No available rooms at the moment.");
            return;
        }

        Customer customer = new Customer(nextCustomerId++, name, phone, availableRoom);
        customers.add(customer);
        availableRoom.setOccupied(true);
        System.out.println("Customer added and assigned to room " + availableRoom.getRoomNumber());
    }

    private void showCustomers() {
        if (customers.isEmpty()) {
            System.out.println("No customers found.");
        } else {
            for (Customer c : customers) {
                System.out.println(c);
            }
        }
    }

    private void updateCustomer() {
        System.out.print("Enter customer ID to update: ");
        int id = Integer.parseInt(scanner.nextLine());
        Customer customer = findCustomerById(id);

        if (customer == null) {
            System.out.println("Customer not found.");
            return;
        }

        System.out.print("Enter new name (leave blank to keep current): ");
        String name = scanner.nextLine();
        if (!name.isEmpty()) {
            customer.setName(name);
        }

        System.out.print("Enter new phone (leave blank to keep current): ");
        String phone = scanner.nextLine();
        if (!phone.isEmpty()) {
            customer.setPhoneNumber(phone);
        }

        System.out.println("Customer updated successfully!");
    }

    private void deleteCustomer() {
        System.out.print("Enter customer ID to delete: ");
        int id = Integer.parseInt(scanner.nextLine());
        Customer customer = findCustomerById(id);

        if (customer == null) {
            System.out.println("Customer not found.");
            return;
        }

        Room room = customer.getRoom();
        if (room != null) {
            room.setOccupied(false);
        }
        customers.remove(customer);
        System.out.println("Customer deleted and room freed successfully!");
    }

    private void checkoutCustomer() {
        System.out.print("Enter customer ID to checkout: ");
        int id = Integer.parseInt(scanner.nextLine());
        Customer customer = findCustomerById(id);

        if (customer == null) {
            System.out.println("Customer not found.");
            return;
        }

        Room room = customer.getRoom();
        if (room != null) {
            room.setOccupied(false);
            System.out.println("\"Room \"" + room.getRoomNumber() + "\" is now available.\"");
        }

        customers.remove(customer);
        System.out.println("\"Customer checked out successfully!\"");
    }

    private Room findAvailableRoom() {
        for (Room r : rooms) {
            if (!r.isOccupied()) {
                return r;
            }
        }
        return null;
    }

    private Customer findCustomerById(int id) {
        for (Customer c : customers) {
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }

    private void searchCustomer() {
        System.out.println("\n--- Search Customer ---");
        System.out.println("1. Search by Name");
        System.out.println("2. Search by Phone Number");
        System.out.println("3. Search by Room Number");
        System.out.print("Choose option: ");
        int option = Integer.parseInt(scanner.nextLine());

        switch (option) {
            case 1 -> {
                System.out.print("Enter part of name: ");
                String namePart = scanner.nextLine().toLowerCase();
                for (int i = 0; i < customers.size(); i++) {
                    Customer c = customers.get(i);
                    if (c.getName().toLowerCase().contains(namePart)) {
                        System.out.println(c);
                    }
                }
            }
            case 2 -> {
                System.out.print("Enter phone number: ");
                String phone = scanner.nextLine();
                for (int i = 0; i < customers.size(); i++) {
                    Customer c = customers.get(i);
                    if (c.getPhoneNumber().equals(phone)) {
                        System.out.println(c);
                    }
                }
            }
            case 3 -> {
                System.out.print("Enter room number: ");
                String roomNumber = scanner.nextLine();
                for (int i = 0; i < customers.size(); i++) {
                    Customer c = customers.get(i);
                    if (c.getRoom() != null && c.getRoom().getRoomNumber().equals(roomNumber)) {
                        System.out.println(c);
                    }
                }
            }
            default -> System.out.println("Invalid search option.");
        }
    }


}

