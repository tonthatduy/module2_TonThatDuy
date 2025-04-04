package ss1.bai_tap.bai_tap_1;

import jdk.swing.interop.SwingInterOpUtils;

import javax.sql.rowset.serial.SQLOutputImpl;
import java.sql.SQLOutput;
import java.util.Scanner;

public class HienThiLoiChao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        String name = sc.nextLine();
        System.out.printf("Hello " + name);
    }
}
