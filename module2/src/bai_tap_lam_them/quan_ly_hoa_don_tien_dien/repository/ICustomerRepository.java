package bai_tap_lam_them.quan_ly_hoa_don_tien_dien.repository;

import bai_tap_lam_them.quan_ly_hoa_don_tien_dien.entity.Customer;

import java.util.List;

public interface ICustomerRepository {
    List<Customer> findAll();

    void add(Customer customer);

    List<Customer> findByName(String name);
}
