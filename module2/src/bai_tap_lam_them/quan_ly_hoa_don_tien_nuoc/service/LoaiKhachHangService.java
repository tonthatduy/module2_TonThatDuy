package bai_tap_lam_them.quan_ly_hoa_don_tien_nuoc.service;

import bai_tap_lam_them.quan_ly_hoa_don_tien_nuoc.entity.LoaiKhachHang;
import bai_tap_lam_them.quan_ly_hoa_don_tien_nuoc.repository.ILoaiKhachHangRepository;
import bai_tap_lam_them.quan_ly_hoa_don_tien_nuoc.repository.LoaiKhachHangRepository;

import java.util.List;

public class LoaiKhachHangService implements ILoaiKhachHangService {
    private ILoaiKhachHangRepository repository = new LoaiKhachHangRepository();

    @Override
    public List<LoaiKhachHang> findAll() {
        return repository.findAll();
    }

    @Override
    public LoaiKhachHang findByID(String type) {
        return repository.findById(type);
    }
}
