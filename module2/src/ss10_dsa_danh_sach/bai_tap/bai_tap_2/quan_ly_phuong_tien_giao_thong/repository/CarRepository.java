package ss10_dsa_danh_sach.bai_tap.bai_tap_2.quan_ly_phuong_tien_giao_thong.repository;

import ss10_dsa_danh_sach.bai_tap.bai_tap_2.quan_ly_phuong_tien_giao_thong.entity.Car;
import ss10_dsa_danh_sach.bai_tap.bai_tap_2.quan_ly_phuong_tien_giao_thong.util.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class CarRepository implements ICarRepository {
    private static final String CAR_FILE = "src/ss10_dsa_danh_sach/bai_tap/bai_tap_2/quan_ly_phuong_tien_giao_thong/data/car.csv";

    @Override
    public List<Car> findAll() {
        List<Car> cars = new ArrayList<>();
        List<String> stringList = ReadAndWriteFile.readFile(CAR_FILE);
        String[] array;
        for (int i = 0; i < stringList.size(); i++) {
            array = stringList.get(i).split(",");
            Car car = new Car(array[0], array[1], Integer.parseInt(array[2]), array[3], array[4], Integer.parseInt(array[5]));
            cars.add(car);

        }
        return cars;
    }

    @Override
    public void add(Car car) {
        List<String> stringList = new ArrayList<>();
        stringList.add(car.getInfoFileCar());
        ReadAndWriteFile.writeFile(CAR_FILE, stringList, true);
    }

    @Override
    public void delete(Car car) {
        List<Car> cars = findAll();
        cars.remove(car);
        List<String> stringList = new ArrayList<>();
        for (Car car1 : cars){
            stringList.add(car1.getInfoFileCar());
        }
        ReadAndWriteFile.writeFile(CAR_FILE,stringList,false);
    }
}
