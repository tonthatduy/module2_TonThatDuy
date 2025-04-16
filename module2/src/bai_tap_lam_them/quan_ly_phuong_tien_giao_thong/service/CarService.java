package bai_tap_lam_them.quan_ly_phuong_tien_giao_thong.service;

import bai_tap_lam_them.quan_ly_phuong_tien_giao_thong.entity.Car;
import bai_tap_lam_them.quan_ly_phuong_tien_giao_thong.repository.CarRepository;
import bai_tap_lam_them.quan_ly_phuong_tien_giao_thong.repository.ICarRepository;

public class CarService implements ICarService {
    private ICarRepository carRepository = new CarRepository();

    @Override
    public Car[] findAll() {
        return carRepository.findAll();
    }

    @Override
    public void add(Car car) {
        carRepository.add(car);
    }
}
