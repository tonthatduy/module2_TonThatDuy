package bai_tap_lam_them.quan_ly_hoa_don_tien_nuoc.service;

import bai_tap_lam_them.quan_ly_hoa_don_tien_nuoc.entity.KhachHang;
import bai_tap_lam_them.quan_ly_hoa_don_tien_nuoc.repository.IKhachHangRepository;
import bai_tap_lam_them.quan_ly_hoa_don_tien_nuoc.repository.KhachHangRepository;

import java.util.List;

public class KhachHangService implements IKhachHangService {
    private IKhachHangRepository repository = new KhachHangRepository();

    @Override
    public void add(KhachHang khachHang) {
        repository.add(khachHang);
    }

    @Override
    public List<KhachHang> findAll() {
        return repository.findAll();
    }

    @Override
    public List<KhachHang> findByName(String name) {
        return repository.findByName(name);
    }

    @Override
    public void delete(KhachHang khachHang) {
        repository.delete(khachHang);
    }

    @Override
    public KhachHang findByIDKhachHang(String idKhachHang) {
        return repository.findByIDKhachHang(idKhachHang);
    }

    @Override
    public void update(KhachHang khachHang) {
        repository.update(khachHang);
    }

    @Override
    public List<KhachHang> findAllSortByName() {
        return repository.findAllSortByName();
    }


}
