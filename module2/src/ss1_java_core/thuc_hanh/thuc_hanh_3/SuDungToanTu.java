package ss1_java_core.thuc_hanh.thuc_hanh_3;

import java.util.Scanner;

public class SuDungToanTu {
    public static void main(String[] args) {
        float wight;
        float height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width: ");
        wight = Float.parseFloat(scanner.nextLine());
        System.out.println("Enter height: ");
        height = Float.parseFloat(scanner.nextLine());
        float area = wight * height;
        System.out.println("Area: " + area);

    }
}
