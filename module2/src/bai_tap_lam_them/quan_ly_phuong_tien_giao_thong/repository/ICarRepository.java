package bai_tap_lam_them.quan_ly_phuong_tien_giao_thong.repository;

import bai_tap_lam_them.quan_ly_phuong_tien_giao_thong.entity.Car;

public interface ICarRepository {
Car[] findAll();
void add(Car car);
}
