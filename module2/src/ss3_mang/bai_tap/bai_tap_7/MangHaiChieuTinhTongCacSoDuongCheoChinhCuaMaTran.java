package ss3_mang.bai_tap.bai_tap_7;

import java.util.Scanner;

public class MangHaiChieuTinhTongCacSoDuongCheoChinhCuaMaTran {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows, cols;
        int[][] array;
        do {
            System.out.print("Nhập số dòng:");
            rows = Integer.parseInt(scanner.nextLine());
            System.out.print("Nhập số cột:");
            cols = Integer.parseInt(scanner.nextLine());
            if (rows != cols) {
                System.out.print("Nhập lại độ dài bằng nhau: " + "\n");
            }
        } while (rows != cols);
        array = new int[rows][cols];
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
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i][i];
        }
        System.out.println("Tổng các đường chéo trong mảng đa chiều: " + sum);
    }
}
