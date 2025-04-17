package ss10_dsa_danh_sach.bai_tap.bai_tap_2.quan_ly_phuong_tien_giao_thong.repository;

import ss10_dsa_danh_sach.bai_tap.bai_tap_2.quan_ly_phuong_tien_giao_thong.entity.MotorBike;

import java.util.ArrayList;

public class MotorBikeRepository implements IMotorBikeRepository{
    private static ArrayList<MotorBike> motorBikes = new ArrayList<>();
    static {
        motorBikes.add(new MotorBike("43-K1-678.56", "Yamaha", 2019, "Nguyễn Văn A", 100));
        motorBikes.add(new MotorBike("43-H1-345.89", "Honda", 2019, "Nguyễn Văn B", 150));
        motorBikes.add(new MotorBike("43-AK-765.23", "Yamaha", 2019, "Nguyễn Văn C", 50));
    }
    @Override
    public ArrayList<MotorBike> findAll() {
        return motorBikes;
    }

    @Override
    public void add(MotorBike motorBike) {
        motorBikes.add(motorBike);
    }

    @Override
    public void delete(MotorBike motorBike) {
        motorBikes.remove(motorBike);
    }
}
