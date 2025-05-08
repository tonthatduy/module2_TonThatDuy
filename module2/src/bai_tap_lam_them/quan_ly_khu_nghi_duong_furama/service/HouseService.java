package bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.service;

import bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.entity.House;
import bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.repository.HouseRepository;
import bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.repository.IHouseRepository;

public class HouseService implements IHouseService {
    private IHouseRepository houseRepository = new HouseRepository();

    @Override
    public void add(House house) {
        houseRepository.add(house);
    }
}
