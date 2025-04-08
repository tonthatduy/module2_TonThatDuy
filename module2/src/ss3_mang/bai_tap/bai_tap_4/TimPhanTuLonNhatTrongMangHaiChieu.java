package ss3_mang.bai_tap.bai_tap_4;

import java.util.Scanner;

public class TimPhanTuLonNhatTrongMangHaiChieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số dòng");
        int rows = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập số Cột");
        int cols = Integer.parseInt(scanner.nextLine());
        int[][] array = new int[rows][cols];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("Phần tử [" + i + "] [" + j + "]:");
                array[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        System.out.println("Mảng Hai Chiều Vừa Nhập:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                }
            }
        }
        System.out.println("Phần tử lớn nhất trong mảng 2 chiều: " + max);
    }
}
