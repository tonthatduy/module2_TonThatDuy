package ss13_thuat_toan_tim_kiem.bai_tap.bai_tap_1.tim_chuoi_tang_dan_co_do_dai_lon_nhat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi cần kiểm tra");
        String stringInput = scanner.nextLine();
        System.out.println("Chuỗi sắp xếp: " + lineSearch(stringInput));
    }

    public static String lineSearch(String string) {
        char character = string.charAt(0);
        String result = String.valueOf(character);
        for (int i = 1; i < string.length(); i++) {
            if (character < string.charAt(i)) {
                result += string.charAt(i);
                character = string.charAt(i);
            }
        }
        return result;
    }

}
