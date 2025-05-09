package bai_tap_lam_them_ngoai.quan_ly_hoa_don_tien_dien.service;

import bai_tap_lam_them_ngoai.quan_ly_hoa_don_tien_dien.entity.Foreigner;
import bai_tap_lam_them_ngoai.quan_ly_hoa_don_tien_dien.repository.ForeignerRepository;
import bai_tap_lam_them_ngoai.quan_ly_hoa_don_tien_dien.repository.IForeignerRepository;

import java.util.List;

public class ForeignerService implements IForeignerService {
    private IForeignerRepository foreignerRepository = new ForeignerRepository();

    @Override
    public List<Foreigner> findAll() {
        return foreignerRepository.findAll();
    }
}
