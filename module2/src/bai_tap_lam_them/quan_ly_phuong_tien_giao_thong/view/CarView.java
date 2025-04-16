package bai_tap_lam_them.quan_ly_phuong_tien_giao_thong.view;

import bai_tap_lam_them.quan_ly_phuong_tien_giao_thong.entity.Car;

import java.util.Scanner;

public class CarView {
    private static Scanner scanner = new Scanner(System.in);

    public static void displayCar(Car[] cars) {
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] != null) {
                System.out.println(cars[i]);
            } else {
                break;
            }

        }
    }

    public static Car inputDataForCar() {
        System.out.println("Enter Control Plate");
        String controlPlate = scanner.nextLine();
        System.out.println("Enter Manufacture Name");
        String manuFaceTureName = scanner.nextLine();
        System.out.println("Enter Year Of Manufacture");
        int year = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Name");
        String name = scanner.nextLine();
        System.out.println("Enter Type");
        String type = scanner.nextLine();
        System.out.println("Enter Seat Quantity");
        int seatQuantity = Integer.parseInt(scanner.nextLine());
        return new Car(controlPlate,manuFaceTureName,year,name,type,seatQuantity);
    }

}
