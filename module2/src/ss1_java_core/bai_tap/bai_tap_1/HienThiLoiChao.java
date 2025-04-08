package ss1_java_core.bai_tap.bai_tap_1;

import java.util.Scanner;

public class HienThiLoiChao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        String name = sc.nextLine();
        System.out.printf("Hello " + name);
    }
}
