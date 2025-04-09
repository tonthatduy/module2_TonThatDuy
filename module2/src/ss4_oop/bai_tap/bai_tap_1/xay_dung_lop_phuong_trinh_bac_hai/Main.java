package ss4_oop.bai_tap.bai_tap_1.xay_dung_lop_phuong_trinh_bac_hai;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number a: ");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter number b: ");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter number c: ");
        double c = Double.parseDouble(scanner.nextLine());
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        System.out.println("Number \n" + quadraticEquation.display());
        System.out.println("Delta " + quadraticEquation.getDiscriminant());
        if (quadraticEquation.getDiscriminant() > 0) {
            System.out.println("Có 2 nghệm: " +
                    "r1 = " + quadraticEquation.getRoot1() +
                    "r2 = " + quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("Có 1 nghiệm kép: " + quadraticEquation.getRoot3());
        } else {
            System.out.println("Phương trình vô nghiệm");
        }
    }
}
