package ss10_dsa_danh_sach.bai_tap.bai_tap_2.quan_ly_phuong_tien_giao_thong.service;

import ss10_dsa_danh_sach.bai_tap.bai_tap_2.quan_ly_phuong_tien_giao_thong.entity.Vehicle;
import ss10_dsa_danh_sach.bai_tap.bai_tap_2.quan_ly_phuong_tien_giao_thong.repository.IVehicleRepository;
import ss10_dsa_danh_sach.bai_tap.bai_tap_2.quan_ly_phuong_tien_giao_thong.repository.VehicleRepository;

public class VehicleService  implements IVehicleSerVice{
    private IVehicleRepository vehicleRepository = new VehicleRepository();
    @Override
    public Vehicle findByControlPlate(String controlPlate) {
        return vehicleRepository.findByControlPlate(controlPlate);
    }

    @Override
    public void delete(Vehicle vehicle) {
        vehicleRepository.delete(vehicle);
    }
}
