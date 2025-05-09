package bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.service;

import bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.entity.Facility;
import bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.repository.FacilityRepository;
import bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.repository.IFacilityRepository;

import java.util.Map;

public class FacilityService implements IFacilityService {
    private IFacilityRepository facilityRepository = new FacilityRepository();

    @Override
    public Map<Facility, Integer> findAll() {
        return facilityRepository.findAll();
    }

    @Override
    public Map<Facility, Integer> findListFacilityMaintenance() {
        return facilityRepository.findListFacilityMaintenance();
    }
}
