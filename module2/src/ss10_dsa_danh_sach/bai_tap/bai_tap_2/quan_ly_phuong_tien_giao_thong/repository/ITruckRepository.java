package ss10_dsa_danh_sach.bai_tap.bai_tap_2.quan_ly_phuong_tien_giao_thong.repository;

import ss10_dsa_danh_sach.bai_tap.bai_tap_2.quan_ly_phuong_tien_giao_thong.entity.Truck;

import java.util.ArrayList;
import java.util.List;

public interface ITruckRepository {
    List<Truck> findAll();
    void add(Truck truck);

    void delete(Truck truck);
}
