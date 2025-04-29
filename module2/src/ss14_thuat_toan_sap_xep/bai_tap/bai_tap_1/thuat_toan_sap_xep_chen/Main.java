package ss14_thuat_toan_sap_xep.bai_tap.bai_tap_1.thuat_toan_sap_xep_chen;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        int[] array1 = {9, 2, 20, 1, -9};
        int[] array2 = {1, 2, 3, 4, 5};
        System.out.println("Trước sắp xếp " + Arrays.toString(array1));
        System.out.println("-----------------------------------------");
        insertionSort(array1);
        System.out.println("------------------------------------------");
        System.out.println("Sau sắp xếp " + Arrays.toString(array1));
    }
    public static void insertionSort(int[] arr){
        int x;
        int pos;
        for (int i = 1; i < arr.length; i++) {
            // lấy giá trị để chèn
            x = arr[i];
            pos = i;
            // chèn vào vị trí thích hợp ở mảng con
            while (0<pos && x < arr[pos-1]){
                arr[pos] = arr[pos-1];
                pos--;
                System.out.println("Dịch chuyển");
            }
            arr[pos] = x;
            System.out.println("Lần thứ " + i + ": " + Arrays.toString(arr));

        }
    }
}
