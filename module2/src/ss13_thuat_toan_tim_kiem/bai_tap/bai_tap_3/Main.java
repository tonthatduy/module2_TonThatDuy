package ss13_thuat_toan_tim_kiem.bai_tap.bai_tap_3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử của mảng");
        int size = Integer.parseInt(scanner.nextLine());
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1) + ": ");
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Mảng ban đầu nhập vào " + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Mảng sau khi sắp xếp " + Arrays.toString(array));
        System.out.println("Nhập số cần tìm vị trí");
        int value = Integer.parseInt(scanner.nextLine());
        int result = binarySearch(array, 0, array.length - 1, value);
        System.out.println("Vị trí của số " + value + ":" + (result+1));
    }

    public static int binarySearch(int[] array, int left, int right, int value) {
        if (right >= left) {
            int middle = (left + right) / 2;
            if (array[middle] == value) {
                return middle;
            }
            if (value > array[middle]) {
                return binarySearch(array, middle + 1, right, value);
            }
            if (value < array[middle]) {
                return binarySearch(array, left, middle - 1, value);
            }
        }
        return -1;
    }
}
