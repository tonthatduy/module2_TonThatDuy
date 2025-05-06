package bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.util;

import java.util.List;
import java.util.Scanner;

public class InputUtil {
    public static String selectFromList(List<String> option, String title, Scanner scanner) {
        System.out.println("===" + title + "===");
        for (int i = 0; i < option.size(); i++) {
            System.out.println((i + 1) + ". " + option.get(i));
        }
        while (true) {
            System.out.println("Chọn (1-" + option.size() + "): ");
            try {
                int choice = Integer.parseInt(scanner.nextLine());
                if (choice >= 1 && choice <= option.size()) {
                    return option.get(choice - 1);
                } else {
                    System.err.println("Lựa chọn không đúng");
                }
            } catch (NumberFormatException e) {
                System.err.println("Vui lòng nhập số");
            }
        }
    }
}
