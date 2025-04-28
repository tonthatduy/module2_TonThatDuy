package ss13_thuat_toan_tim_kiem.bai_tap.bai_tap_2.kiem_tra_chuoi_lien_tiep_dai_nhat;

import java.util.Scanner;

public class CheckStringMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi cần kiểm tra!!");
        String string = scanner.nextLine();
        System.out.println(searchLongestString(string));
    }

    public static String searchLongestString(String string) {
        String result = "";
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            int j = i;
            while (j + 1 <= string.length() - 1) {
                if (string.charAt(j) < string.charAt(j + 1)) {
                    if (temp.isEmpty()) {
                        temp.append(string.charAt(j));
                    }
                    temp.append(string.charAt(j + 1));
                    j++;
                } else {
                    break;
                }
            }
            if (temp.length() > result.length()) {
                result = temp.toString();
            }
            temp.setLength(0);
            i = j;
        }
        return result;
    }
}
