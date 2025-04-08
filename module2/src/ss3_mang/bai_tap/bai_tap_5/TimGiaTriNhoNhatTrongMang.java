package ss3_mang.bai_tap.bai_tap_5;

import java.util.Scanner;

public class TimGiaTriNhoNhatTrongMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int[] array;
        do {
            System.out.print("Enter a size: ");
            size = Integer.parseInt(scanner.nextLine());
            if (size > 20) {
                System.out.println("Size should not exceed 20");
                ;
            }
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element" + (i + 1) + " : ");
            array[i] = Integer.parseInt(scanner.nextLine());
            i++;
        }
        System.out.print("Property list: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        int min = array[0];
        int index = 1;
        for (int j = 1; j < array.length; j++) {
            if (array[j] < min) {
                min = array[j];
                index = j;
            }
        }
        System.out.println("The small property value in the list is " + min + " ,at position " + index);

    }
}
