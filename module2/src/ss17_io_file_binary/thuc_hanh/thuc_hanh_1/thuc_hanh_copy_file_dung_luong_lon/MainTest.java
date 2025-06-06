package ss17_io_file_binary.thuc_hanh.thuc_hanh_1.thuc_hanh_copy_file_dung_luong_lon;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import static ss17_io_file_binary.thuc_hanh.thuc_hanh_1.thuc_hanh_copy_file_dung_luong_lon.Main.copyFileUsingJava7Files;

public class MainTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.printf("Enter source file:");
        String sourcePath = in.nextLine();
        System.out.printf("Enter destination file:");
        String destPath = in.nextLine();

        File sourceFile = new File(sourcePath);
        File destFile = new File(destPath);

        try {
            //thay đổi lần lượt 2 method để thấy kết quả
            copyFileUsingJava7Files(sourceFile, destFile);
            //copyFileUsingStream(sourceFile, destFile);
            System.out.printf("Copy completed");
        } catch (IOException ioe) {
            System.out.printf("Can't copy that file");
            System.out.printf(ioe.getMessage());
        }
    }
}
