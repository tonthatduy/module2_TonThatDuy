package ss16_io_text_file.bai_tap.copy_file_text;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class CopyFileText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập đường link nguồn ");
        String source = scanner.nextLine();
        Path sourceFile = Paths.get(source);
        if (!Files.exists(sourceFile)) {
            System.out.println("Tệp nguồn không tồn tại");
        }
        System.out.println("Nhập đường link đích ");
        String target = scanner.nextLine();
        Path targetFile = Paths.get(target);
        if (Files.exists(targetFile)) {
            System.out.println("Tệp đích có tồn tại");
        }
        try {
            Files.copy(sourceFile, targetFile);
            System.out.println("Copy Thành Công");
        } catch (IOException e) {
            System.out.println("Có lỗi khi copy");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
