package ss10_dsa_danh_sach.bai_tap.bai_tap_2.quan_ly_phuong_tien_giao_thong.view;

import ss10_dsa_danh_sach.bai_tap.bai_tap_2.quan_ly_phuong_tien_giao_thong.entity.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarView {
    private static Scanner scanner = new Scanner(System.in);
    public static void displayCar(List<Car> cars) {
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
    }
    public static Car inputDataForCar(){
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
