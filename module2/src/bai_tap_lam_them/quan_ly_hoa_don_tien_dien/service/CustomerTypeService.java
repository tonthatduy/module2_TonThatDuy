package bai_tap_lam_them.quan_ly_hoa_don_tien_dien.service;

import bai_tap_lam_them.quan_ly_hoa_don_tien_dien.entity.CustomerType;
import bai_tap_lam_them.quan_ly_hoa_don_tien_dien.repository.CustomerTypeRepository;
import bai_tap_lam_them.quan_ly_hoa_don_tien_dien.repository.ICustomerTypeRepository;

import java.util.List;

public class CustomerTypeService implements ICustomerTypeService{
    private ICustomerTypeRepository repository = new CustomerTypeRepository();

    @Override
    public List<CustomerType> findAll() {
        return repository.findAll();
    }

    @Override
    public CustomerType findById(String type) {
        return repository.findById(type);
    }
}
