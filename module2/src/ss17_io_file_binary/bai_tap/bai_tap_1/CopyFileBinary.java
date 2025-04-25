package ss17_io_file_binary.bai_tap.bai_tap_1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CopyFileBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập đường link nguồn");
        String source = scanner.nextLine();
        System.out.println("Nhập đường link đích");
        String taget = scanner.nextLine();
        try (FileInputStream fileInputStream = new FileInputStream(source);
             FileOutputStream fileOutputStream = new FileOutputStream(taget);) {
            byte[] bytes = new byte[1024];
            int bytesRead;
            while ((bytesRead = fileInputStream.read(bytes)) != -1) {
                fileOutputStream.write(bytes, 0, bytesRead);
            }
            System.out.println("Sao chép thành công");

        } catch (IOException e) {
            System.out.println("Lỗi không tìm thấy file");
        }
    }
}
