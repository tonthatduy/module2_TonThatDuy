package bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.Service;

import bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.entity.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();

    void add(Customer customer);

    Customer findByIDCustomer(String idCustomer);

    void editCustomer(Customer customer);
}
