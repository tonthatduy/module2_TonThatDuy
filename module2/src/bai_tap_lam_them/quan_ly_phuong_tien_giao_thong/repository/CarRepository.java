package bai_tap_lam_them.quan_ly_phuong_tien_giao_thong.repository;

import bai_tap_lam_them.quan_ly_phuong_tien_giao_thong.entity.Car;

public class CarRepository implements ICarRepository, IVehicleRepository {
    private static Car[] cars = new Car[50];
//    private static int carCount= 0;

    static {
        cars[0] = new Car("43A-212.56", "Toyota", 2019, "Du lịch", "Nguyễn Văn C", 5);
        cars[1] = new Car("43B-453.88", "Huyndai", 2020, "Xe khách", "Nguyễn Văn B", 45);
        cars[2] = new Car("43B-453.89", "Ford", 2020, " Xe  khách", "Nguyễn Văn C", 16);
    }


    @Override
    public Car[] findAll() {
        return cars;
    }

    @Override
    public boolean deleteByControlPlate(String controlPlate) {
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] == null) {
                break;
            }
            if (cars[i].getControlPlate().equalsIgnoreCase(controlPlate)) {
                for (int j = i; j < cars.length; j++) {
                    cars[j] = cars[j + 1];
                    if (cars[j] == null) {
                        break;
                    }

                }
                cars[cars.length - 1] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public void add(Car car) {
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] == null) {
                cars[i] = car;
                break;
            }
        }
    }


}
