package ss14_thuat_toan_sap_xep.bai_tap.bai_tap_2.cai_dat_thuat_toan_chen;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng tần tử trong mảng");
        int size = Integer.parseInt(scanner.nextLine());
        int[] list = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1) + ": ");
            list[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Mảng bang đầu nhập vào " + Arrays.toString(list));
        insertionSort(list);
        System.out.println("Mảng sau khi sắp xếp chèn " + Arrays.toString(list));

    }

    public static void insertionSort(int[] arr) {
        int pos, x;
        for (int i = 0; i < arr.length; i++) {
            x = arr[i];
            pos = i;
            while (pos > 0 && x < arr[pos - 1]) {
                arr[pos] = arr[pos - 1];
                pos--;
            }
            arr[pos] = x;
        }
    }
}
