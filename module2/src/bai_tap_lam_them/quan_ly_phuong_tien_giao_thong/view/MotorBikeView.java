package bai_tap_lam_them.quan_ly_phuong_tien_giao_thong.view;

import bai_tap_lam_them.quan_ly_phuong_tien_giao_thong.entity.MotorBike;

import java.util.Scanner;

public class MotorBikeView {
    private static Scanner scanner = new Scanner(System.in);

    public static void displayMotorBike(MotorBike[] motorBikes) {
        for (int i = 0; i < motorBikes.length; i++) {
            if (motorBikes[i] != null) {
                System.out.println(motorBikes[i]);
            } else {
                break;
            }

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
