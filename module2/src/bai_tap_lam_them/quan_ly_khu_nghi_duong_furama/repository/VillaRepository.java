package bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.repository;

import bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.entity.Villa;
import bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.util.ReadAndWriteFileFurama;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class VillaRepository implements IVillaRepository {
    private static final String VILLA_FILE = "src/bai_tap_lam_them/quan_ly_khu_nghi_duong_furama/data/villa.csv";

    @Override
    public Map<Villa, Integer> findAll() {
        Map<Villa, Integer> villaIntegerMap = new LinkedHashMap<>();
        List<String> stringList = ReadAndWriteFileFurama.readFile(VILLA_FILE);
        String[] array;
        for (int i = 0; i < stringList.size(); i++) {
            array = stringList.get(i).split(",");
            villaIntegerMap.put(new Villa(array[0], array[1], Double.parseDouble(array[2]), Integer.parseInt(array[3]),
                    array[4], array[5], Double.parseDouble(array[6]), Integer.parseInt(array[7])), Integer.parseInt(array[8]));

        }
        return villaIntegerMap;
    }

    @Override
    public void add(Villa villa) {
        List<String> stringList = new ArrayList<>();
        stringList.add(villa.getInfoToFileVilla());
        ReadAndWriteFileFurama.writeFile(VILLA_FILE, stringList, true);
    }
}
