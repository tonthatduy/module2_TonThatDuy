package ss11_dsa_stack_queue.bai_tap.bai_tap_2.chuyen_doi_tu_he_thap_phan_sang_he_nhi_phan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần đổi nhị phân = ");
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println(ConvertToBinary.Convert(number));
    }
}
