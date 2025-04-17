package ss10_dsa_danh_sach.bai_tap.bai_tap_2.quan_ly_phuong_tien_giao_thong.repository;

import ss10_dsa_danh_sach.bai_tap.bai_tap_2.quan_ly_phuong_tien_giao_thong.entity.Car;

import java.util.ArrayList;

public class CarRepository implements ICarRepository {
    private static ArrayList<Car> cars = new ArrayList<>();

    static {
        cars.add(new Car("43A-212.56", "Toyota", 2019, "Du lịch", "Nguyễn Văn C", 5));
        cars.add(new Car("43B-453.88", "Huyndai", 2020, "Xe khách", "Nguyễn Văn B", 45));
        cars.add(new Car("43B-453.89", "Ford", 2020, " Xe  khách", "Nguyễn Văn C", 16));
    }

    @Override
    public ArrayList<Car> findAll() {
        return cars;
    }

    @Override
    public void add(Car car) {
        cars.add(car);
    }

    @Override
    public void delete(Car car) {
        cars.remove(car);
    }
}
