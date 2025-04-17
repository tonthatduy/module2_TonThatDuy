package ss10_dsa_danh_sach.bai_tap.bai_tap_2.quan_ly_phuong_tien_giao_thong.service;

import ss10_dsa_danh_sach.bai_tap.bai_tap_2.quan_ly_phuong_tien_giao_thong.entity.Truck;
import ss10_dsa_danh_sach.bai_tap.bai_tap_2.quan_ly_phuong_tien_giao_thong.repository.ITruckRepository;
import ss10_dsa_danh_sach.bai_tap.bai_tap_2.quan_ly_phuong_tien_giao_thong.repository.TruckRepository;

import java.util.ArrayList;

public class TruckService implements ITruckService{
    private ITruckRepository truckRepository = new TruckRepository();
    @Override
    public ArrayList<Truck> findAll() {
        return truckRepository.findAll();
    }

    @Override
    public void add(Truck truck) {
        truckRepository.add(truck);
    }
}
