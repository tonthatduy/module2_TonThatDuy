package bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.repository;

import bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.entity.House;
import bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.util.ReadAndWriteFileFurama;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class HouseRepository implements IHouseRepository {
    private static final String HOUSE_FILE = "src/bai_tap_lam_them/quan_ly_khu_nghi_duong_furama/data/house.csv";

    @Override
    public Map<House, Integer> findAll() {
        Map<House, Integer> houseIntegerMap = new LinkedHashMap<>();
        List<String> stringList = ReadAndWriteFileFurama.readFile(HOUSE_FILE);
        String[] array;
        for (int i = 0; i < stringList.size(); i++) {
            array = stringList.get(i).split(",");
            houseIntegerMap.put(new House(array[0], array[1], Double.parseDouble(array[2]), Double.parseDouble(array[3])
                    , Integer.parseInt(array[4]), array[5], array[6], Integer.parseInt(array[7])), Integer.parseInt(array[8]));

        }
        return houseIntegerMap;
    }

    @Override
    public void add(House house) {
        List<String> stringList = new ArrayList<>();
        stringList.add(house.getInfoToFileHouse() + ",0");
        ReadAndWriteFileFurama.writeFile(HOUSE_FILE, stringList, true);
    }

}

