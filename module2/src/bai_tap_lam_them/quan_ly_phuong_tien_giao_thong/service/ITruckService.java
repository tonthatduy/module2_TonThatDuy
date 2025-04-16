package bai_tap_lam_them.quan_ly_phuong_tien_giao_thong.service;

import bai_tap_lam_them.quan_ly_phuong_tien_giao_thong.entity.Truck;

public interface ITruckService {
    Truck[] findAll();
    void add(Truck truck);
}
