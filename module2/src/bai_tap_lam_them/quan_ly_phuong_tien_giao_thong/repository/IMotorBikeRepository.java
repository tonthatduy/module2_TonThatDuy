package bai_tap_lam_them.quan_ly_phuong_tien_giao_thong.repository;

import bai_tap_lam_them.quan_ly_phuong_tien_giao_thong.entity.MotorBike;

public interface IMotorBikeRepository {
    MotorBike[] findAll();
    void add(MotorBike motorBike);
}
