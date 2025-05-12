package bai_tap_lam_them.quan_ly_hoa_don_tien_nuoc.service;

import bai_tap_lam_them.quan_ly_hoa_don_tien_nuoc.entity.LoaiKhachHang;

import java.util.List;

public interface ILoaiKhachHangService {
    List<LoaiKhachHang> findAll();

    LoaiKhachHang findByID(String type);
}
