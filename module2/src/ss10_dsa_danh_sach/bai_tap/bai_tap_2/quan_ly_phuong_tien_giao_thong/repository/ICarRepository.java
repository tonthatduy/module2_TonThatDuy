package ss10_dsa_danh_sach.bai_tap.bai_tap_2.quan_ly_phuong_tien_giao_thong.repository;

import ss10_dsa_danh_sach.bai_tap.bai_tap_2.quan_ly_phuong_tien_giao_thong.entity.Car;

import java.util.ArrayList;
import java.util.List;

public interface ICarRepository {
    List<Car> findAll();
    void add(Car car);

    void delete(Car car);
}
