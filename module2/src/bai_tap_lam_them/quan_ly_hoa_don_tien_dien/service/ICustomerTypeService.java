package bai_tap_lam_them.quan_ly_hoa_don_tien_dien.service;

import bai_tap_lam_them.quan_ly_hoa_don_tien_dien.entity.CustomerType;

import java.util.List;

public interface ICustomerTypeService {
    List<CustomerType> findAll();

    CustomerType findById(String type);
}
