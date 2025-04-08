package ss3_mang.bai_tap.bai_tap_1;

import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        int[] array = {10, 4, 6, 7, 8, 6};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập phần tử cần xóa");
        int x = Integer.parseInt(scanner.nextLine());
        int index_del = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                index_del = i;
                break;
            }
        }
        if (index_del == -1) {
            System.out.println("Không có giá trị để xóa");
        } else {
            for (int i = index_del; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }
        }
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}
