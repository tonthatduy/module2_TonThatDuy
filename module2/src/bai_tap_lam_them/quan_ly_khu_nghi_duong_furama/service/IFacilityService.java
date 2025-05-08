package bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.service;

import bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.entity.Facility;

import java.util.Map;

public interface IFacilityService {
    Map<Facility,Integer> findAll();
}
