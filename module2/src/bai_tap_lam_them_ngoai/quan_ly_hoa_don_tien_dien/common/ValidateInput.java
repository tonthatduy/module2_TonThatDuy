package bai_tap_lam_them_ngoai.quan_ly_hoa_don_tien_dien.common;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateInput {
    private static Scanner scanner = new Scanner(System.in);
    public static String validateInput(String regex,String errorMessage){
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
}
