package ss10_dsa_danh_sach.bai_tap.bai_tap_2.quan_ly_phuong_tien_giao_thong.view;

import ss10_dsa_danh_sach.bai_tap.bai_tap_2.quan_ly_phuong_tien_giao_thong.controller.VehicleController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        VehicleController.displayMenu();
    }
    public static String enterControlPlate(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ControlPlate");
        return scanner.nextLine();
    }
    public static boolean comFirm(){
        String string;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Y to delete N to Cancel");
            string = scanner.nextLine();
        } while (!string.equalsIgnoreCase("Y") && !string.equalsIgnoreCase("N"));
        if (string.equalsIgnoreCase("Y")){
            return true;
        } else {
            return false;
        }
    }
}
