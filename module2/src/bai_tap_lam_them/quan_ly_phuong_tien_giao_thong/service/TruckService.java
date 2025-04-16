package bai_tap_lam_them.quan_ly_phuong_tien_giao_thong.service;

import bai_tap_lam_them.quan_ly_phuong_tien_giao_thong.entity.Truck;
import bai_tap_lam_them.quan_ly_phuong_tien_giao_thong.repository.ITruckRepository;
import bai_tap_lam_them.quan_ly_phuong_tien_giao_thong.repository.TruckRepository;

public class TruckService implements ITruckService {
    private ITruckRepository truckRepository = new TruckRepository();

    @Override
    public Truck[] findAll() {
        return truckRepository.findAll();
    }

    @Override
    public void add(Truck truck) {
        truckRepository.add(truck);
    }
}
