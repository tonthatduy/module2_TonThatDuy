package bai_tap_lam_them.quan_ly_hoa_don_tien_nuoc.repository;

import bai_tap_lam_them.quan_ly_hoa_don_tien_nuoc.entity.KhachHang;

import java.util.List;

public interface IKhachHangRepository {
    void add(KhachHang khachHang);

    List<KhachHang> findAll();

    List<KhachHang> findByName(String name);

    void delete(KhachHang khachHang);

    KhachHang findByIDKhachHang(String idKhachHang);
}
