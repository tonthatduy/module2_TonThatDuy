package ss10_dsa_danh_sach.bai_tap.bai_tap_2.quan_ly_phuong_tien_giao_thong.repository;

import ss10_dsa_danh_sach.bai_tap.bai_tap_2.quan_ly_phuong_tien_giao_thong.entity.Truck;
import ss10_dsa_danh_sach.bai_tap.bai_tap_2.quan_ly_phuong_tien_giao_thong.util.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class TruckRepository implements ITruckRepository {
    private static final String TRUCK_FILE = "src/ss10_dsa_danh_sach/bai_tap/bai_tap_2/quan_ly_phuong_tien_giao_thong/data/truck.csv";

    @Override
    public List<Truck> findAll() {
        List<Truck> trucks = new ArrayList<>();
        List<String> stringList = ReadAndWriteFile.readFile(TRUCK_FILE);
        String[] array;
        for (int i = 0; i < stringList.size(); i++) {
            array = stringList.get(i).split(",");
            Truck truck = new Truck(array[0], array[1], Integer.parseInt(array[2]), array[3], Integer.parseInt(array[4]));
            trucks.add(truck);

        }
        return trucks;
    }

    @Override
    public void add(Truck truck) {
        List<String> stringList = new ArrayList<>();
        stringList.add(truck.getInfoFileTruck());
        ReadAndWriteFile.writeFile(TRUCK_FILE, stringList, true);
    }

    @Override
    public void delete(Truck truck) {
        List<Truck> trucks = findAll();
        trucks.remove(truck);
        List<String> stringList = new ArrayList<>();
        for (Truck truck1 : trucks) {
            stringList.add(truck1.getInfoFileTruck());
        }
        ReadAndWriteFile.writeFile(TRUCK_FILE, stringList, false);
    }
}
