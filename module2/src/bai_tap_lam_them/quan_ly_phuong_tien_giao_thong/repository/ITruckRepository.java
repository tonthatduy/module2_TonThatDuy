package bai_tap_lam_them.quan_ly_phuong_tien_giao_thong.repository;

import bai_tap_lam_them.quan_ly_phuong_tien_giao_thong.entity.MotorBike;
import bai_tap_lam_them.quan_ly_phuong_tien_giao_thong.entity.Truck;

public interface ITruckRepository {
    Truck[] findAll();
    void add(Truck truck);
}
