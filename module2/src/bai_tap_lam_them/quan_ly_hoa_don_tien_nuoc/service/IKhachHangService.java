package bai_tap_lam_them.quan_ly_hoa_don_tien_nuoc.service;

import bai_tap_lam_them.quan_ly_hoa_don_tien_nuoc.entity.KhachHang;

import java.util.List;

public interface IKhachHangService {
    void add(KhachHang khachHang);

    List<KhachHang> findAll();

    List<KhachHang> findByName(String Name);

    void delete(KhachHang khachHang);

    KhachHang findByIDKhachHang(String idKhachHang);
    void update(KhachHang khachHang);
    List<KhachHang> findAllSortByName();
}
