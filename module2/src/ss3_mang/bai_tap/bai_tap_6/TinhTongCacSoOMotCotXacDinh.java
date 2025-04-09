package ss3_mang.bai_tap.bai_tap_6;

import java.util.Scanner;
import java.util.SortedMap;

public class TinhTongCacSoOMotCotXacDinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số dòng:");
        int rows = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập số cột:");
        int cols = Integer.parseInt(scanner.nextLine());
        int[][] array = new int[rows][cols];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("Phần tử [" + i + "] [" + j + "] :");
                array[i][j] = Integer.parseInt(scanner.nextLine());
            }

        }
        System.out.println("Mảng hai chiều vừa nhập: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Nhập số cột cần tính tổng: ");
        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j == number - 1) {
                    sum += array[i][j];
                }
            }
        }
        System.out.println("Tổng số cột : " + number + " là: " + sum);
    }
}
