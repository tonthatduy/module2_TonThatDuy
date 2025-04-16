package bai_tap_lam_them.quan_ly_phuong_tien_giao_thong.repository;

import bai_tap_lam_them.quan_ly_phuong_tien_giao_thong.entity.MotorBike;

public class MotorBikeRepository implements IMotorBikeRepository, IVehicleRepository {
    private static MotorBike[] motorBikes = new MotorBike[10];

    static {
        motorBikes[0] = new MotorBike("43-K1-678.56", "Yamaha", 2019, "Nguyễn Văn A", 100);
        motorBikes[1] = new MotorBike("43-H1-345.89", "Honda", 2019, "Nguyễn Văn B", 150);
        motorBikes[2] = new MotorBike("43-AK-765.23", "Yamaha", 2019, "Nguyễn Văn C", 50);
    }

    @Override
    public MotorBike[] findAll() {
        return motorBikes;
    }

    @Override
    public boolean deleteByControlPlate(String controlPlate) {
        for (int i = 0; i < motorBikes.length; i++) {
            if (motorBikes[i] == null) {
                break;
            }
            if (motorBikes[i].getControlPlate().equalsIgnoreCase(controlPlate)) {
                for (int j = i; j < motorBikes.length; j++) {
                    motorBikes[j] = motorBikes[j + 1];
                    if (motorBikes[j] == null) {
                        break;
                    }

                }
                motorBikes[motorBikes.length - 1] = null;
                return true;
            }

        }
        return false;
    }
        @Override
        public void add (MotorBike motorBike){
            for (int i = 0; i < motorBikes.length; i++) {
                if (motorBikes[i] == null) {
                    motorBikes[i] = motorBike;
                    break;
                }

            }
        }
    }
