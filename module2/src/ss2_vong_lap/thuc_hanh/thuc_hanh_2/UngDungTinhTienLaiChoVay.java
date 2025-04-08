package ss2_vong_lap.thuc_hanh.thuc_hanh_2;

import java.util.Scanner;

public class UngDungTinhTienLaiChoVay {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter investment amount: ");
        money = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter number of months: ");
        month = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter annual interest rate in percentage: ");
        interestRate = Double.parseDouble(scanner.nextLine());
        double totalInterest = 0;
        for (int i = 0; i < month; i++) {
            totalInterest += money * (interestRate / 100) / 12 * month;
        }
        System.out.println("Total of interest: " + totalInterest);
    }
}
