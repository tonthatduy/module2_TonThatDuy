package bai_tap_lam_them.quan_ly_phuong_tien_giao_thong.service;

import bai_tap_lam_them.quan_ly_phuong_tien_giao_thong.entity.MotorBike;

public interface IMotorBikeService {
    MotorBike[] finAll();
    void add(MotorBike motorBike);
}
