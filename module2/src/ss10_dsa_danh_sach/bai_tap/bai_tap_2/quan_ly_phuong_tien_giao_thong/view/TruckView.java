package ss10_dsa_danh_sach.bai_tap.bai_tap_2.quan_ly_phuong_tien_giao_thong.view;

import ss10_dsa_danh_sach.bai_tap.bai_tap_2.quan_ly_phuong_tien_giao_thong.entity.Truck;

import java.util.ArrayList;
import java.util.Scanner;

public class TruckView {
    private static Scanner scanner = new Scanner(System.in);

    public static void displayTruck(ArrayList<Truck> trucks) {
        for (int i = 0; i < trucks.size(); i++) {
            System.out.println(trucks.get(i));

        }
    }

    public static Truck inputDataForTruck() {
        System.out.println("Enter Control Plate");
        String controlPlate = scanner.nextLine();
        System.out.println("Enter Manufacture Name");
        String manuFaceTureName = scanner.nextLine();
        System.out.println("Enter Year Of Manufacture");
        int year = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Name");
        String name = scanner.nextLine();
        System.out.println("Enter Pay Load");
        int payLoad = Integer.parseInt(scanner.nextLine());
        return new Truck(controlPlate, manuFaceTureName, year, name, payLoad);
    }
}
