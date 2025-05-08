package bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.common;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

import java.util.regex.Pattern;

public class ValidateInput {
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
    public static long validateLuong(String message) {
        long luong = -1;
        while (luong <= 0) {
            System.out.println(message);
            try {
                luong = Long.parseLong(scanner.nextLine());
                if (luong <= 0) {
                    System.err.println("Lương phải lớn hơn 0. Vui lòng nhập lại.");
                }
            } catch (NumberFormatException e) {
                System.err.println("Sai định dạng. Lương phải là số. Nhập lại.");
            }
        }
        return luong;
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

    public static double validateDienTichSuDung() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Nhập diện tích sử dụng (phải > 30): ");
            String input = scanner.nextLine();
            try {
                double value = Double.parseDouble(input);
                if (value > 30) {
                    return value;
                } else {
                    System.err.println("Diện tích phải lớn hơn 30. Nhập lại.");
                }
            } catch (NumberFormatException e) {
                System.err.println("Giá trị không hợp lệ. Vui lòng nhập số thực.");
            }
        }
    }


    public static int getSoLuongNguoiToiDa() {
        while (true) {
            System.out.println("Nhập số lượng người tối đa để ở (1-20): ");
            try {
                int value = Integer.parseInt(scanner.nextLine());
                if (value > 0 && value <= 20) {
                    return value;
                }
            } catch (NumberFormatException ignored) {
            }
            System.err.println("Giá trị không hợp lệ. Nhập số nguyên từ 1 đến 20.");
        }
    }

    public static int getSoTang() {
        while (true) {
            System.out.println("Nhập số tầng: ");
            try {
                int value = Integer.parseInt(scanner.nextLine());
                if (value >= 0) {
                    return value;
                }
            } catch (NumberFormatException ignored) {
            }
            System.err.println("Số tầng phải là số nguyên không âm.");
        }
    }

    public static double validateChiPhiThue() {
        while (true) {
            System.out.println("Nhập chi phí thuê (phải là số thực dương): ");
            String input = scanner.nextLine();
            try {
                double value = Double.parseDouble(input);
                if (value > 0) {
                    return value;
                } else {
                    System.err.println("Chi phí phải lớn hơn 0.");
                }
            } catch (NumberFormatException e) {
                System.err.println("Chi phí không hợp lệ. Vui lòng nhập số thực.");
            }
        }
    }




}
