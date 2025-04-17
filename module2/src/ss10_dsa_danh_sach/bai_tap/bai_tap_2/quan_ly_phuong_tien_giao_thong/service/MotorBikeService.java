package ss10_dsa_danh_sach.bai_tap.bai_tap_2.quan_ly_phuong_tien_giao_thong.service;

import ss10_dsa_danh_sach.bai_tap.bai_tap_2.quan_ly_phuong_tien_giao_thong.entity.MotorBike;
import ss10_dsa_danh_sach.bai_tap.bai_tap_2.quan_ly_phuong_tien_giao_thong.repository.IMotorBikeRepository;
import ss10_dsa_danh_sach.bai_tap.bai_tap_2.quan_ly_phuong_tien_giao_thong.repository.MotorBikeRepository;

import java.util.ArrayList;

public class MotorBikeService implements IMotorBikeService {
    private IMotorBikeRepository motorBikeRepository = new MotorBikeRepository();
    @Override
    public ArrayList<MotorBike> findAll() {
        return motorBikeRepository.findAll();
    }

    @Override
    public void add(MotorBike motorBike) {
        motorBikeRepository.add(motorBike);
    }
}
