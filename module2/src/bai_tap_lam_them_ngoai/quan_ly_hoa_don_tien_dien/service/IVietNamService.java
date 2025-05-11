package bai_tap_lam_them_ngoai.quan_ly_hoa_don_tien_dien.service;

import bai_tap_lam_them_ngoai.quan_ly_hoa_don_tien_dien.entity.VietNam;

import java.util.List;

public interface IVietNamService {
    List<VietNam> findAll();

    void add(VietNam vietNam);
}
