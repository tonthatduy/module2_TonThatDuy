package bai_tap_lam_them.quan_ly_phuong_tien_giao_thong.controller;

import bai_tap_lam_them.quan_ly_phuong_tien_giao_thong.entity.Vehicle;
import bai_tap_lam_them.quan_ly_phuong_tien_giao_thong.service.VehicleService;

import java.util.Scanner;

public class VehicleController {
    private static Scanner scanner = new Scanner(System.in);

    public static void displayMenu() {


        menuLoop:
        do {
            System.out.println("--- CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG ---");
            System.out.println("Enter your Management :");
            System.out.println("1. Create Vehicle.");
            System.out.println("2. Display Vehicle.");
            System.out.println("3. Delete Vehicle. ");
            System.out.println("4. Exit. ");
            System.out.println("Enter your choice");
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                System.out.println("You have not entered anything.Please re-enter!");
                continue;
            }
            int choice;
            try {
                choice = Integer.parseInt(input);
            } catch (Exception ex) {
                System.out.println("You must enter an integer. Please re-enter!");
                continue;
            }
            switch (choice) {
                case 1 -> {
                    Create.menuCreateVehicle();
                    System.out.println("---Create Vehicle ---");
                }

                case 2 -> {
                    Display.menuDisplayVehicle();
                    System.out.println("---Display Vehicle---");
                }

                case 3 -> {
                    System.out.println("---Delete Vehicle---");
                    deleteVehicle();
                }

                case 4 -> {
                    System.out.println("---Thanks---");
                    break menuLoop;
                }
                default -> {
                    System.out.println("No Choice!");
                }

            }
        } while (true);
    }

    private static void deleteVehicle() {
        VehicleService vehicleService = new VehicleService();
        System.out.println("Enter Control Plate");
        String input1 = scanner.nextLine();
        Vehicle vehicle = vehicleService.findByControlPlate(input1);

        if (vehicle == null) {
            System.out.println("No Control Plate");
        }
        System.out.println("Enter \"Yes\" to clear \"No\" Return to Menu ");
        String a = scanner.nextLine();
        if (a.equalsIgnoreCase("yes")) {
            vehicleService.deleteByControlPlate(input1);
            System.out.println("Deleted successfully");
        } else if (a.equalsIgnoreCase("no")) {
            System.out.println("Return to Menu");
        }
    }
}

