package bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.repository;

import bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.entity.House;

import java.util.Map;

public interface IHouseRepository {
    Map<House, Integer> findAll();
}
