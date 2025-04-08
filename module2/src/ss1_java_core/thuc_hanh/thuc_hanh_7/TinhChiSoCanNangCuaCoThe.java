package ss1_java_core.thuc_hanh.thuc_hanh_7;

import java.util.Scanner;

public class TinhChiSoCanNangCuaCoThe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;
        System.out.println("Your weight (in kilogram): ");
        weight = Double.parseDouble(scanner.nextLine());
        System.out.println("Your height (in meter): ");
        height = Double.parseDouble(scanner.nextLine());
        bmi = weight / Math.pow(height, 2);
        System.out.println(bmi + "Interpretation \n");
        if (bmi < 18) {
            System.out.println(bmi + "Underweight");
        } else if (bmi < 25.0) {
            System.out.println(bmi + "Normal");
        } else if (bmi < 30.0) {
            System.out.println(bmi + "Overweight");
        } else {
            System.out.println(bmi + "Obese");
        }
    }
}
