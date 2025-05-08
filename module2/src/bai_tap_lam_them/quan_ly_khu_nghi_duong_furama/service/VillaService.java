package bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.service;

import bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.entity.Villa;
import bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.repository.IVillaRepository;
import bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.repository.VillaRepository;

public class VillaService implements IVillaService {
    private IVillaRepository villaRepository = new VillaRepository();

    @Override
    public void add(Villa villa) {
        villaRepository.add(villa);

    }
}
