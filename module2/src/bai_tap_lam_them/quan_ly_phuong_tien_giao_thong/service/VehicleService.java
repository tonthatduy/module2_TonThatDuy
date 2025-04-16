package bai_tap_lam_them.quan_ly_phuong_tien_giao_thong.service;

import bai_tap_lam_them.quan_ly_phuong_tien_giao_thong.entity.Vehicle;
import bai_tap_lam_them.quan_ly_phuong_tien_giao_thong.repository.CarRepository;
import bai_tap_lam_them.quan_ly_phuong_tien_giao_thong.repository.IVehicleRepository;
import bai_tap_lam_them.quan_ly_phuong_tien_giao_thong.repository.MotorBikeRepository;
import bai_tap_lam_them.quan_ly_phuong_tien_giao_thong.repository.TruckRepository;

public class VehicleService {
    private IVehicleRepository[] repositories = {
            new CarRepository(),
            new TruckRepository(),
            new MotorBikeRepository()
    };

    public boolean deleteByControlPlate(String controlPlate) {
        for (IVehicleRepository repo : repositories) {
            if (repo.deleteByControlPlate(controlPlate)) {
                return true;
            }
        }
        return false;
    }
    public Vehicle findByControlPlate(String controlPlate) {
        for (IVehicleRepository repo : repositories) {
            for (Vehicle vehicle : repo.findAll()) {
                if (vehicle != null && vehicle.getControlPlate().equalsIgnoreCase(controlPlate)) {
                    return vehicle;
                }
            }
        }
        return null;
    }


}
