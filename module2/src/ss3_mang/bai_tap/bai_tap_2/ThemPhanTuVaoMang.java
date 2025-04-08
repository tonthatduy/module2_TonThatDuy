package ss3_mang.bai_tap.bai_tap_2;

import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        int[] array = {10, 4, 6, 7, 8};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập giá trị cần chèn");
        int x = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vị trí cần chèn");
        int index = Integer.parseInt(scanner.nextLine());
        if (index < 0 || index > array.length) {
            System.out.println("Không chèn được phần tử trong mảng");
        } else {
            int[] newArray = new int[array.length + 1];
            for (int i = 0; i < index; i++) {
                newArray[i] = array[i];
            }
            newArray[index] = x;
            for (int i = index; i < array.length; i++) {
                newArray[i + 1] = array[i];
            }
            array = newArray;
            System.out.println("Mảng mới sau khi chèn");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + "\t");
            }
        }
    }
}
