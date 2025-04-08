package ss3_mang.bai_tap.bai_tap_8;

import java.util.Scanner;

public class DemSoLanXuatHienCuaKyTuTrongChuoi {
    public static void main(String[] args) {
        String hello = " Hello CodeGym";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập ký tự cần đếm : ");
        String checkString = scanner.nextLine();
        char checkChar = checkString.charAt(0);
        int count = 0;
        for (int i = 0; i < hello.length(); i++) {
            if (hello.charAt(i) == checkChar) {
                count++;
            }
        }
        System.out.println("Số lần xuất hiện ký tự : " + checkChar + " Là: " + count);
    }
}
