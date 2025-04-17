package ss10_dsa_danh_sach.bai_tap.bai_tap_2.quan_ly_phuong_tien_giao_thong.view;

import ss10_dsa_danh_sach.bai_tap.bai_tap_2.quan_ly_phuong_tien_giao_thong.entity.MotorBike;

import java.util.ArrayList;
import java.util.Scanner;

public class MotorBikeView {
    private static Scanner scanner = new Scanner(System.in);
    public static void displayMotorBike(ArrayList<MotorBike> motorBikes) {
        for (int i = 0; i < motorBikes.size(); i++) {
            System.out.println(motorBikes.get(i));

        }
    }
    public static MotorBike inputDataForMotorBike(){
        System.out.println("Enter Control Plate");
        String controlPlate = scanner.nextLine();
        System.out.println("Enter Manufacture Name");
        String manuFaceTureName = scanner.nextLine();
        System.out.println("Enter Year Of Manufacture");
        int year = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Name");
        String name = scanner.nextLine();
        System.out.println("Enter Capacity");
        int capacity = Integer.parseInt(scanner.nextLine());
        return new MotorBike(controlPlate,manuFaceTureName,year,name,capacity);
    }
}
