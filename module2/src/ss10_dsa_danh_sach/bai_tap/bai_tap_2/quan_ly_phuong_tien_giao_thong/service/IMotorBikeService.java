package ss10_dsa_danh_sach.bai_tap.bai_tap_2.quan_ly_phuong_tien_giao_thong.service;

import ss10_dsa_danh_sach.bai_tap.bai_tap_2.quan_ly_phuong_tien_giao_thong.entity.MotorBike;

import java.util.ArrayList;
import java.util.List;

public interface IMotorBikeService {
    List<MotorBike> findAll();
    void add(MotorBike motorBike);
}
