package ss10_dsa_danh_sach.bai_tap.bai_tap_2.quan_ly_phuong_tien_giao_thong.repository;

import ss10_dsa_danh_sach.bai_tap.bai_tap_2.quan_ly_phuong_tien_giao_thong.entity.MotorBike;
import ss10_dsa_danh_sach.bai_tap.bai_tap_2.quan_ly_phuong_tien_giao_thong.util.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class MotorBikeRepository implements IMotorBikeRepository {
    private static final String MOTORBIKE_FILE = "src/ss10_dsa_danh_sach/bai_tap/bai_tap_2/quan_ly_phuong_tien_giao_thong/data/motorbike.csv";

    @Override
    public List<MotorBike> findAll() {
        List<MotorBike> motorBikes = new ArrayList<>();
        List<String> stringList = ReadAndWriteFile.readFile(MOTORBIKE_FILE);
        String[] array;
        for (int i = 0; i < stringList.size(); i++) {
            array = stringList.get(i).split(",");
            MotorBike motorBike = new MotorBike(array[0], array[1],
                    Integer.parseInt(array[2]), array[3], Integer.parseInt(array[4]));
            motorBikes.add(motorBike);
        }
        return motorBikes;
    }

    @Override
    public void add(MotorBike motorBike) {
        List<String> stringList = new ArrayList<>();
        stringList.add(motorBike.getInfoFileMotorBike());
        ReadAndWriteFile.writeFile(MOTORBIKE_FILE, stringList, true);
    }

    @Override
    public void delete(MotorBike motorBike) {
        List<MotorBike> motorBikes = new ArrayList<>();
        motorBikes.remove(motorBike);
        List<String> stringList = new ArrayList<>();
        for (MotorBike motorBike1 : motorBikes) {
            stringList.add(motorBike1.getInfoFileMotorBike());
        }
        ReadAndWriteFile.writeFile(MOTORBIKE_FILE, stringList, false);

    }
}
