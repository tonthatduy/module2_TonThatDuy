package ss3_mang.bai_tap.bai_tap_3;

import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        int sizeOne;
        int[] arrayOne;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size Array One: ");
            sizeOne = Integer.parseInt(scanner.nextLine());
            if (sizeOne > 20) {
                System.out.print("Size does not exceed 20");
            }
        } while (sizeOne > 20);
        arrayOne = new int[sizeOne];
        int i = 0;
        while (i < arrayOne.length) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arrayOne[i] = Integer.parseInt(scanner.nextLine());
            i++;
        }
        int sizeTwo;
        int[] arrayTwo;
        do {
            System.out.print("Enter a size Array Two: ");
            sizeTwo = Integer.parseInt(scanner.nextLine());
            if (sizeTwo > 20) {
                System.out.print("Size does not exceed 20");
            }
        } while (sizeTwo > 20);
        arrayTwo = new int[sizeTwo];
        int j = 0;
        while (j < arrayTwo.length) {
            System.out.print("Enter element " + (j + 1) + ": ");
            arrayTwo[j] = Integer.parseInt(scanner.nextLine());
            j++;
        }
        int[] arrayThree = new int[arrayOne.length + arrayTwo.length];
        for (int k = 0; k < arrayOne.length; k++) {
            arrayThree[k] = arrayOne[k];
        }
        for (int k = 0; k < arrayTwo.length; k++) {
            arrayThree[arrayOne.length + k] = arrayTwo[k];
        }
        for (int k = 0; k < arrayThree.length; k++) {
            System.out.print(arrayThree[k] + "\t");
        }
    }
}
