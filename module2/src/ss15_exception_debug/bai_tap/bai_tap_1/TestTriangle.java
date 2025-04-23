package ss15_exception_debug.bai_tap.bai_tap_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Triangle triangle;
        while (true) {
            try {
                System.out.println("Nhập cạnh đầu tiên= ");
                double number1 = scanner.nextDouble();
                System.out.println("Nhập cạnh thứ hai= ");
                double number2 = scanner.nextDouble();
                System.out.println("Nhập cạnh thứ ba= ");
                double number3 = scanner.nextDouble();
                triangle = new Triangle(number1, number2, number3);
                System.out.println("Tam giác hợp lệ");
                break;
            } catch (InvalidTriangleException e) {
                System.err.println(e.getMessage());
            } catch (InputMismatchException e) {
                System.err.println("Nhập lại số");
                scanner.nextLine();
            } catch (Exception e) {
                e.printStackTrace();
                scanner.nextLine();
            }

        }
        System.out.println("Number 1 =  " + triangle.getA());
        System.out.println("Number 2 =  " + triangle.getB());
        System.out.println("Number 3 =  " + triangle.getC());


        //Test Setter
        while (true) {
            try {
                System.out.println("Nhập lại cạnh đầu tiên = ");
                double newNumber1 = scanner.nextDouble();
                System.out.println("Nhập lại cạnh thứ 2 = ");
                double newNumber2 = scanner.nextDouble();
                System.out.println("Nhập lại cạnh thứ 3 = ");
                double newNumber3 = scanner.nextDouble();
                triangle.setAll(newNumber1, newNumber2, newNumber3);
                System.out.println("Các cạnh sau khi thay đổi");
                System.out.println("Number 1 =  " + triangle.getA());
                System.out.println("Number 2 =  " + triangle.getB());
                System.out.println("Number 3 =  " + triangle.getC());
                System.out.println("Là 3 Cạnh một tam giác");
                break;
            } catch (InvalidTriangleException e) {
                System.err.println(e.getMessage());
            } catch (NumberFormatException e) {
                System.err.println("Nhập lại số");
                scanner.nextLine();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}
