package bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.util;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFileFurama {
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
        }
        return strings;
    }
}
