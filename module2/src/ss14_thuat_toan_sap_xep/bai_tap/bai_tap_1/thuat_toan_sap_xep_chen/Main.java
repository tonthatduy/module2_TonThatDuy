package ss14_thuat_toan_sap_xep.bai_tap.bai_tap_1.thuat_toan_sap_xep_chen;

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
        System.out.println("---------------------------------------------------");
        insertionSort(list);
        System.out.println("---------------------------------------------------");
        System.out.println("Mảng sau khi sắp xếp chèn " + Arrays.toString(list));

    }

    public static void insertionSort(int[] arr) {
        int x;
        int pos;
        for (int i = 1; i < arr.length; i++) {
            // lấy giá trị để chèn
            x = arr[i];
            pos = i;
            // chèn vào vị trí thích hợp ở mảng con
            while (0 < pos && x < arr[pos - 1]) {
                System.out.println("Dịch chuyển số " + x + " với số " + arr[pos - 1]);
                arr[pos] = arr[pos - 1];
                pos--;
            }
            arr[pos] = x;
            System.out.println("Mảng sau khi dịch chuyển lần thứ " + i + ": " + Arrays.toString(arr));
            System.out.println();
        }
    }
}
