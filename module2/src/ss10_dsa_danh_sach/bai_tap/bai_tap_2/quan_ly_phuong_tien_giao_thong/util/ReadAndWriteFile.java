package ss10_dsa_danh_sach.bai_tap.bai_tap_2.quan_ly_phuong_tien_giao_thong.util;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public static void writeFile(String filePatch, List<String> stringList, boolean append) {
        File file = new File(filePatch);
        try (FileWriter fileWriter = new FileWriter(file, append);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            for (String line : stringList) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }

        } catch (IOException e) {
            System.out.println("Lỗi ghi file");
        }
    }

    public static List<String> readFile(String filePatch) {
        List<String> strings = new ArrayList<>();
        File file = new File(filePatch);
        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                strings.add(line);
            }
        } catch (IOException e) {
            System.out.println("Lỗi đọc file");
            ;
        }
        return strings;
    }
}
