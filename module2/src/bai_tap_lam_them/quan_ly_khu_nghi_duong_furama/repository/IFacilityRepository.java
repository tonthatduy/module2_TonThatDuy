package bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.repository;

import bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.entity.Facility;

import java.util.Map;

public interface IFacilityRepository {
    Map<Facility, Integer> findAll();
    Map<Facility,Integer> findListFacilityMaintenance();
}
