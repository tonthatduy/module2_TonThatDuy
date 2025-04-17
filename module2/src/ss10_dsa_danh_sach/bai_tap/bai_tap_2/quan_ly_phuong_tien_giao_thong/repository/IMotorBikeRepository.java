package ss10_dsa_danh_sach.bai_tap.bai_tap_2.quan_ly_phuong_tien_giao_thong.repository;

import ss10_dsa_danh_sach.bai_tap.bai_tap_2.quan_ly_phuong_tien_giao_thong.entity.MotorBike;

import java.util.ArrayList;

public interface IMotorBikeRepository {
    ArrayList<MotorBike> findAll();
    void add(MotorBike motorBike);

    void delete(MotorBike motorBike);
}
