package bai_tap_lam_them.quan_ly_hoa_don_tien_dien.service;

import bai_tap_lam_them.quan_ly_hoa_don_tien_dien.entity.Customer;
import bai_tap_lam_them.quan_ly_hoa_don_tien_dien.repository.CustomerRepository;
import bai_tap_lam_them.quan_ly_hoa_don_tien_dien.repository.ICustomerRepository;

import java.util.List;

public class CustomerService implements ICustomerService {
    private ICustomerRepository repository = new CustomerRepository();

    @Override
    public void add(Customer customer) {
        repository.add(customer);
    }

    @Override
    public List<Customer> findAll() {
        return repository.findAll();
    }

    @Override
    public List<Customer> findByName(String name) {
        return repository.findByName(name);

    }
}
