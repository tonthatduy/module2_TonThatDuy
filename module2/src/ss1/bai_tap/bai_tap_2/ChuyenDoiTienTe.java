package ss1.bai_tap.bai_tap_2;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        final String USD = "2";
        final String VN = "1";
        double rate = 26000;
        String select;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Mời bạn chọn phương thức cần đổi: \n"
                    + "1. VND -> USD \n"
                    + "2. USD - > VND");
            select = sc.nextLine();
        } while (!select.equals(USD) && !select.equals(VN));
        System.out.println("Nhập số tiền cần quy đổi :");
        double money = Double.parseDouble(sc.nextLine());
        if (select.equals(VN)) {
            double resultUSD = money / rate;
            System.out.println("Số tiền đổi ra USD: " + resultUSD);
        } else if (select.equals(USD)) {
            double resultVN = money * rate;
            System.out.println("Số tiền đổi ra VNĐ: " + resultVN);
        }
    }
}

