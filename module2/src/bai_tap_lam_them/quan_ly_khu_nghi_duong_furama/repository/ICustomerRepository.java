package bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.repository;

import bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.entity.Customer;

import java.util.List;

public interface ICustomerRepository {
    List<Customer> findAll();

    void add(Customer customer);

    Customer findByIDCustomer(String idCustomer);

    void editCustomer(Customer customer);
}
