package ss2_vong_lap.bai_tap.bai_tap_2;

import java.util.Scanner;

public class HienThiHaiMuoiSoNguyenDauTien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng số nguyên tố cần in");
        int number = Integer.parseInt(scanner.nextLine());
        int count = 0;
        int N = 2;
        while (count < number) {
            if (isPrime(N)) {
                System.out.print(N + " ");
                count++;
            }
            N++;
        }
    }
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
