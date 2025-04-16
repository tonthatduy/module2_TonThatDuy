package bai_tap_lam_them.quan_ly_phuong_tien_giao_thong.service;

import bai_tap_lam_them.quan_ly_phuong_tien_giao_thong.entity.MotorBike;
import bai_tap_lam_them.quan_ly_phuong_tien_giao_thong.repository.IMotorBikeRepository;
import bai_tap_lam_them.quan_ly_phuong_tien_giao_thong.repository.MotorBikeRepository;

public class MotorBikeService implements IMotorBikeService{
    private IMotorBikeRepository motorBikeRepository = new MotorBikeRepository();


    @Override
    public MotorBike[] finAll() {
        return motorBikeRepository.findAll();
    }

    @Override
    public void add(MotorBike motorBike) {
        motorBikeRepository.add(motorBike);
    }
}
