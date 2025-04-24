package ss16_io_text_file.thuc_hanh.thuc_hanh_1.tinh_tong_cac_so_trong_file_text;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("Nhập đường dẫn file: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        ReadFileExample readfileEx = new ReadFileExample();
        readfileEx.readFileText(path);
    }
}
