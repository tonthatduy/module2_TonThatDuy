package bai_tap_lam_them_ngoai.quan_ly_hoa_don_tien_dien.service;

import bai_tap_lam_them_ngoai.quan_ly_hoa_don_tien_dien.entity.VietNam;
import bai_tap_lam_them_ngoai.quan_ly_hoa_don_tien_dien.repository.IVietNamRepository;
import bai_tap_lam_them_ngoai.quan_ly_hoa_don_tien_dien.repository.VietNamRepository;

import java.util.List;

public class VietNamService implements IVietNamService {
    private IVietNamRepository vietNamRepository = new VietNamRepository();
    @Override
    public List<VietNam> findAll() {

        return vietNamRepository.findAll();
    }
}
