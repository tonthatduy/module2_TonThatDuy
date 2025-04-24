package ss16_io_text_file.thuc_hanh.thuc_hanh_2.tim_gia_tri_lon_nhat_va_ghi_ra_file;

import java.util.List;

public class FindMaxValue {
    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("D:\\module2_TonThatDuy\\module2\\src\\ss16_io_text_file\\thuc_hanh\\thuc_hanh_2\\tim_gia_tri_lon_nhat_va_ghi_ra_file\\numbers.txt");
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile("result.txt", maxValue);
    }
    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }
        return max;
    }
}
