package ss10_dsa_danh_sach.bai_tap.bai_tap_2.quan_ly_phuong_tien_giao_thong.service;

import ss10_dsa_danh_sach.bai_tap.bai_tap_2.quan_ly_phuong_tien_giao_thong.entity.Vehicle;

import java.util.ArrayList;

public interface IVehicleSerVice {
    Vehicle findByControlPlate (String controlPlate);

    void delete(Vehicle vehicle);
}
