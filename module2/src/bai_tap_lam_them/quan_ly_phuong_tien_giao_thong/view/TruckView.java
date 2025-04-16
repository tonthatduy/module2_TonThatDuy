package bai_tap_lam_them.quan_ly_phuong_tien_giao_thong.view;

import bai_tap_lam_them.quan_ly_phuong_tien_giao_thong.entity.Car;
import bai_tap_lam_them.quan_ly_phuong_tien_giao_thong.entity.Truck;

import java.util.Scanner;

public class TruckView {
    private static Scanner scanner = new Scanner(System.in);

    public static void displayTruck(Truck[] trucks) {
        for (int i = 0; i < trucks.length; i++) {
            if (trucks[i] != null) {
                System.out.println(trucks[i]);
            } else {
                break;
            }

        }
    }
    public static Truck inputDataForTruck(){
        System.out.println("Enter Control Plate");
        String controlPlate = scanner.nextLine();
        System.out.println("Enter Manufacture Name");
        String manuFaceTureName = scanner.nextLine();
        System.out.println("Enter Year Of Manufacture");
        int year = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Name");
        String name = scanner.nextLine();
        System.out.println("Enter Pay Load");
        int payLoad =Integer.parseInt(scanner.nextLine()) ;
        return new Truck(controlPlate,manuFaceTureName,year,name,payLoad);

    }
}
