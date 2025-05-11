package bai_tap_lam_them.quan_ly_hoa_don_tien_dien.repository;

import bai_tap_lam_them.quan_ly_hoa_don_tien_dien.common.ReadAndWriteFile;
import bai_tap_lam_them.quan_ly_hoa_don_tien_dien.entity.Customer;
import bai_tap_lam_them.quan_ly_hoa_don_tien_dien.entity.ForeinCustomer;
import bai_tap_lam_them.quan_ly_hoa_don_tien_dien.entity.LocalCustomer;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    private static final String PATH = "src/bai_tap_lam_them/quan_ly_hoa_don_tien_dien/data/customer.csv";

    @Override
    public List<Customer> findAll() {
        List<Customer> customers = new ArrayList<>();
        List<String> stringList = ReadAndWriteFile.readFileCSV(PATH);
        for (String s : stringList) {
            String[] array = s.split("\\s*,\\s*");
            if (array[0].contains("KHVN")) {
                customers.add(new LocalCustomer(array[0], array[1], array[2], Double.parseDouble(array[3])));
            } else if (array[0].contains("KHNN")) {
                customers.add(new ForeinCustomer(array[0], array[1], array[4]));

            }
        }
        return customers;
    }

    @Override
    public void add(Customer customer) {
        List<String> stringList = new ArrayList<>();
        if(customer instanceof LocalCustomer){
            stringList.add(((LocalCustomer) customer).toCSVFile());
        }else if(customer instanceof ForeinCustomer){
            stringList.add(((ForeinCustomer) customer).toCSVFile());
        }
        ReadAndWriteFile.writeFileCSV(PATH, stringList, true);
    }

    @Override
    public List<Customer> findByName(String name) {
        List<Customer> foundCustomers = new ArrayList<>();
        for (Customer c : findAll()){
            if (c.getName().contains(name)){
                foundCustomers.add(c);
            }
        }
        return foundCustomers;    }
}
