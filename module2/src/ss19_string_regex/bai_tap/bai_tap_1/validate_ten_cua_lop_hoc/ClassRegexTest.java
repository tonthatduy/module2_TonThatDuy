package ss19_string_regex.bai_tap.bai_tap_1.validate_ten_cua_lop_hoc;

import java.util.Scanner;

public class ClassRegexTest {
    public static void main(String[] args) {
        ClassRegex classRegex = new ClassRegex();
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập tên lớp học");
            String stringClass = scanner.nextLine();
            if (classRegex.validateClass(stringClass)) {
                System.out.println("Tên Đúng Định Dạng");
                break;
            } else {
                System.err.println("Tên Chưa Đúng Định Dạng");
            }
        }
    }
}
