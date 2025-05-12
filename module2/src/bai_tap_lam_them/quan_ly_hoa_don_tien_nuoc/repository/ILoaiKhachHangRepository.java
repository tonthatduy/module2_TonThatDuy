package bai_tap_lam_them.quan_ly_hoa_don_tien_nuoc.repository;

import bai_tap_lam_them.quan_ly_hoa_don_tien_nuoc.entity.LoaiKhachHang;

import java.util.List;

public interface ILoaiKhachHangRepository {
    List<LoaiKhachHang> findAll();

    LoaiKhachHang findById(String type);
}
