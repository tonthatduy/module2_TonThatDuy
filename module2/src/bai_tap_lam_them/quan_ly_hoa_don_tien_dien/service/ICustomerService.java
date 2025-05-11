package bai_tap_lam_them.quan_ly_hoa_don_tien_dien.service;

import bai_tap_lam_them.quan_ly_hoa_don_tien_dien.entity.Customer;

import java.util.List;

public interface ICustomerService {
    void add(Customer customer);
    List<Customer> findAll();
    List<Customer> findByName(String name);

}
