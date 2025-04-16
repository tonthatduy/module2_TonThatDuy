package bai_tap_lam_them.quan_ly_phuong_tien_giao_thong.controller;

import bai_tap_lam_them.quan_ly_phuong_tien_giao_thong.entity.Car;
import bai_tap_lam_them.quan_ly_phuong_tien_giao_thong.entity.MotorBike;
import bai_tap_lam_them.quan_ly_phuong_tien_giao_thong.entity.Truck;
import bai_tap_lam_them.quan_ly_phuong_tien_giao_thong.service.CarService;
import bai_tap_lam_them.quan_ly_phuong_tien_giao_thong.service.MotorBikeService;
import bai_tap_lam_them.quan_ly_phuong_tien_giao_thong.service.TruckService;
import bai_tap_lam_them.quan_ly_phuong_tien_giao_thong.view.CarView;
import bai_tap_lam_them.quan_ly_phuong_tien_giao_thong.view.MotorBikeView;
import bai_tap_lam_them.quan_ly_phuong_tien_giao_thong.view.TruckView;

import java.util.Scanner;

public class Display {
    public static void menuDisplayVehicle() {
        CarService carService = new CarService();
        TruckService truckService = new TruckService();
        MotorBikeService motorBikeService = new MotorBikeService();
        Scanner scanner = new Scanner(System.in);
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
                    Truck[] trucks = truckService.findAll();
                    TruckView.displayTruck(trucks);
                }
                case 2 -> {
                    Car[] cars = carService.findAll();
                    CarView.displayCar(cars);
                }
                case 3 -> {
                    MotorBike[] motorBikes = motorBikeService.finAll();
                    MotorBikeView.displayMotorBike(motorBikes);
                }
                case 4 -> {
                    System.out.println("Return to Main Menu");
                    return;
                }
            }
        } while (true);
    }

}
