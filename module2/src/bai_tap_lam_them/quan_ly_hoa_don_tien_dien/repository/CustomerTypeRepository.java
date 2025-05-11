package bai_tap_lam_them.quan_ly_hoa_don_tien_dien.repository;

import bai_tap_lam_them.quan_ly_hoa_don_tien_dien.common.ReadAndWriteFile;
import bai_tap_lam_them.quan_ly_hoa_don_tien_dien.entity.CustomerType;

import java.util.ArrayList;
import java.util.List;

public class CustomerTypeRepository implements ICustomerTypeRepository {
    private static final String PATH = "src/bai_tap_lam_them/quan_ly_hoa_don_tien_dien/data/customer_type.csv";


    @Override
    public List<CustomerType> findAll() {
        List<String> stringList = ReadAndWriteFile.readFileCSV(PATH);
        List<CustomerType> customerTypes = new ArrayList<>();
        for (String s : stringList){
            String[] array = s.split("\\s*,\\s*");
            customerTypes.add(new CustomerType(array[0], array[1]));
        }
        return customerTypes;
    }

    @Override
    public CustomerType findById(String type) {
        for (CustomerType customerType : findAll()){
            if(customerType.getId().equals(type)){
                return customerType;
            }
        }
        return null;
    }
}
