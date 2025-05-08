package bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.repository;

import bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.entity.Villa;

import java.util.Map;

public interface IVillaRepository {
    Map<Villa,Integer> findAll();
    void add(Villa villa);
}
