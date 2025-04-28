package ss19_string_regex.bai_tap.bai_tap_2.validate_ten_dien_thoai;

import java.util.Scanner;

public class PhoneRegexTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhoneRegex phoneRegex = new PhoneRegex();
        while (true) {
            System.out.println("Nhập số điện thoại");
            String phone = scanner.nextLine();
            if (phoneRegex.validatePhone(phone)) {
                System.out.println("Số điện thoại đúng định dạng");
                break;
            } else {
                System.err.println("Số điện thoại sai định dạng");
            }
        }
    }
}
