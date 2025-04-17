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

public class MenuCreateCotroller {
    public static void menuCreateVehicle() {
        CarService carService= new CarService();
        TruckService truckService = new TruckService();
        MotorBikeService motorBikeService = new MotorBikeService();
        Scanner scanner = new Scanner(System.in);
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
                case 2->{
                    Car car = CarView.inputDataForCar();
                    carService.add(car);
                }
                case 3->{
                    MotorBike motorBike = MotorBikeView.inputDataForMotorBike();
                    motorBikeService.add(motorBike);

                }
                case 4->{
                    System.out.println("Return to Main Menu");
                    return;
                }
            }
        } while (true);
    }
}
