package bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.common;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

import java.util.regex.Pattern;

public class Validate {
    private static Scanner scanner = new Scanner(System.in);

    public static String validateInput(String regex, String errorMessage) {
        while (true) {
            String input = scanner.nextLine().trim();
            if (input.isEmpty()) {
                System.out.println("Không được để rỗng. Nhập lại");
                continue;
            }
            if (Pattern.matches(regex, input)) {
                return input;
            }
            System.err.println(errorMessage);
        }
    }

    public static boolean isValidateDateInput(String input) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        try {
            LocalDate birthDate = LocalDate.parse(input, formatter);
            LocalDate today = LocalDate.now();
            Period age = Period.between(birthDate, today);
            return age.getYears() > 18 || (age.getYears() == 18 &&
                    (age.getMonths() > 0 || age.getDays() > 0));
        } catch (DateTimeParseException e) {
            return false;
        }
    }
    public static Double validateInputDoubleGreaterThan30(String regex, String errorMessage) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.matches(regex)) {
                double value = Double.parseDouble(input);
                if (value > 30) {
                    return value;
                } else {
                    System.out.println("Giá trị phải lớn hơn 30. Nhập lại:");
                }
            } else {
                System.err.println(errorMessage);
            }
        }
    }

}
