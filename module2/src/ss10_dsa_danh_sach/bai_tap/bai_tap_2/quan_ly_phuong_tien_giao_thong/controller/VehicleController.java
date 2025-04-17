package ss10_dsa_danh_sach.bai_tap.bai_tap_2.quan_ly_phuong_tien_giao_thong.controller;

import ss10_dsa_danh_sach.bai_tap.bai_tap_2.quan_ly_phuong_tien_giao_thong.entity.Car;
import ss10_dsa_danh_sach.bai_tap.bai_tap_2.quan_ly_phuong_tien_giao_thong.entity.MotorBike;
import ss10_dsa_danh_sach.bai_tap.bai_tap_2.quan_ly_phuong_tien_giao_thong.entity.Truck;
import ss10_dsa_danh_sach.bai_tap.bai_tap_2.quan_ly_phuong_tien_giao_thong.entity.Vehicle;
import ss10_dsa_danh_sach.bai_tap.bai_tap_2.quan_ly_phuong_tien_giao_thong.service.CarService;
import ss10_dsa_danh_sach.bai_tap.bai_tap_2.quan_ly_phuong_tien_giao_thong.service.MotorBikeService;
import ss10_dsa_danh_sach.bai_tap.bai_tap_2.quan_ly_phuong_tien_giao_thong.service.TruckService;
import ss10_dsa_danh_sach.bai_tap.bai_tap_2.quan_ly_phuong_tien_giao_thong.service.VehicleService;
import ss10_dsa_danh_sach.bai_tap.bai_tap_2.quan_ly_phuong_tien_giao_thong.view.CarView;
import ss10_dsa_danh_sach.bai_tap.bai_tap_2.quan_ly_phuong_tien_giao_thong.view.Main;
import ss10_dsa_danh_sach.bai_tap.bai_tap_2.quan_ly_phuong_tien_giao_thong.view.MotorBikeView;
import ss10_dsa_danh_sach.bai_tap.bai_tap_2.quan_ly_phuong_tien_giao_thong.view.TruckView;

import java.util.ArrayList;
import java.util.Scanner;

public class VehicleController {
    private static Scanner scanner = new Scanner(System.in);
    private static CarService carService = new CarService();
    private static MotorBikeService motorBikeService = new MotorBikeService();
    private static TruckService truckService = new TruckService();
    private static VehicleService vehicleService = new VehicleService();

    public static void displayMenu() {


        menuLoop:
        do {
            System.out.println("--- VEHICLE MANAGEMENT PROGRAM ---");
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
                    menuCreate();
                }
                case 2 -> {
                    menuDisplay();
                }
                case 3 -> {
                    System.out.println("---Delete Vehicle---");
                    delete();
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

    public static void menuDisplay() {
        int option;
        do {
            System.out.println("---Display Vehicle---");
            System.out.println("1. Display Truck");
            System.out.println("2. Display Car");
            System.out.println("3. Display MotoBike");
            System.out.println("4. Return to Main Menu");
            System.out.println("Choose Option: ");
            option = Integer.parseInt(scanner.nextLine());
            switch (option) {
                case 1 -> {
                    ArrayList<Truck> trucks = truckService.findAll();
                    TruckView.displayTruck(trucks);
                }
                case 2 -> {
                    ArrayList<Car> cars = carService.findAll();
                    CarView.displayCar(cars);
                }
                case 3 -> {
                    ArrayList<MotorBike> motorBikes = motorBikeService.findAll();
                    MotorBikeView.displayMotorBike(motorBikes);
                }
                case 4 -> {
                    System.out.println("Return to Main Menu");
                    return;
                }
            }
        } while (true);
    }

    public static void menuCreate() {
        int option;
        do {
            System.out.println("---Create Vehicle---");
            System.out.println("1. Create Truck");
            System.out.println("2. Create Car");
            System.out.println("3. Create MotoBike");
            System.out.println("4. Return to Main Menu");
            System.out.println("Choose option: ");
            option = Integer.parseInt(scanner.nextLine());
            switch (option) {
                case 1 -> {
                    Truck truck = TruckView.inputDataForTruck();
                    truckService.add(truck);
                }
                case 2 -> {
                    Car car = CarView.inputDataForCar();
                    carService.add(car);
                }
                case 3 -> {
                    MotorBike motorBike = MotorBikeView.inputDataForMotorBike();
                    motorBikeService.add(motorBike);
                }
                case 4 -> {
                    System.out.println("Return to Main Menu");
                    return;
                }
            }
        } while (true);
    }

    public static void delete() {
        String controlPlate = Main.enterControlPlate();
        Vehicle vehicle = vehicleService.findByControlPlate(controlPlate);
        if (vehicle == null) {
            System.out.println("No license plate    ");
        } else {
            if (Main.comFirm()) {
                vehicleService.delete(vehicle);
                System.out.println("Deleted successfully");
            } else {
                System.out.println("Cancelled");
            }
        }
    }
}

