package bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.common;

import java.time.LocalDate;
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

    public static String validateDateInput(String promt) {
        String dateString;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        while (true){
            System.out.println(promt);
            dateString = validateInput("^\\d{2}-\\d{2}-\\d{4}$",
                    "Nhập sai định dạng, Nhập lại đúng định dạng dd-MM-yyyy");
            try {
                LocalDate date = LocalDate.parse(dateString,formatter);
                LocalDate today = LocalDate.now();
                LocalDate minDate = today.minusYears(18);
                if (date.isAfter(today)){
                    System.err.println("Không nhập ngày trong tương lai. Nhập lại");
                } else if (date.isAfter(minDate)){
                    System.err.println("Chưa đủ 18 tuổi");
                } else {
                    return dateString;
                }
            } catch (DateTimeParseException e){
                System.err.println("Ngày không hợp lệ nhập lại! " + e.getMessage());
            }
        }
    }

}
