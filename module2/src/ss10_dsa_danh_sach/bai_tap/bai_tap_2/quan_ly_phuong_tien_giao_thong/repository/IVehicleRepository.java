package ss10_dsa_danh_sach.bai_tap.bai_tap_2.quan_ly_phuong_tien_giao_thong.repository;

import ss10_dsa_danh_sach.bai_tap.bai_tap_2.quan_ly_phuong_tien_giao_thong.entity.Vehicle;

import java.util.ArrayList;

public interface IVehicleRepository {
    ArrayList<Vehicle> findAll();

    Vehicle findByControlPlate(String controlPlate);

    void delete(Vehicle vehicle);
}
