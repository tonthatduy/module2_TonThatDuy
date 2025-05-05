package bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.Service;

import bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.entity.Customer;
import bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.repository.CustomerRepository;
import bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.repository.ICustomerRepository;

import java.util.ArrayList;
import java.util.List;

public class CustomerService implements  ICustomerService{
    private ICustomerRepository customerRepository = new CustomerRepository();
    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public void add(Customer customer) {
        customerRepository.add(customer);
    }

    @Override
    public Customer findByIDCustomer(String idCustomer) {
        return customerRepository.findByIDCustomer(idCustomer);
    }

    @Override
    public void editCustomer(Customer customer) {
        customerRepository.editCustomer(customer);
    }
}
