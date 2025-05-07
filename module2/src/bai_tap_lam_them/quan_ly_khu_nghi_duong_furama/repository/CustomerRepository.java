package bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.repository;

import bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.entity.Customer;
import bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.util.ReadAndWriteFileFurama;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    private static final String CUSTOMER_FILE = "src/bai_tap_lam_them/quan_ly_khu_nghi_duong_furama/data/customer.csv";

    @Override
    public List<Customer> findAll() {
        List<Customer> customers = new ArrayList<>();
        List<String> stringList = ReadAndWriteFileFurama.readFile(CUSTOMER_FILE);
        String[] array;
        for (int i = 0; i < stringList.size(); i++) {
            array = stringList.get(i).split(",");
            Customer customer = new Customer(array[0], array[1], array[2], array[3], array[4], array[5], array[6], array[7], array[8]);
            customers.add(customer);
        }
        return customers;
    }

    @Override
    public void add(Customer customer) {
        List<String> stringList = new ArrayList<>();
        stringList.add(customer.getInfoToFileCustomer());
        ReadAndWriteFileFurama.writeFile(CUSTOMER_FILE, stringList, true);
    }

    @Override
    public Customer findByIDCustomer(String idCustomer) {
        List<Customer> customers = findAll();
        for (Customer customer : customers) {
            if (customer.getId().equalsIgnoreCase(idCustomer)) {
                return customer;
            }
        }
        return null;
    }

    @Override
    public void editCustomer(Customer customer) {
        List<Customer> customers = findAll();
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getId().equalsIgnoreCase(customer.getId())) {
                customers.set(i, customer);
                break;
            }
        }
        List<String> stringList = new ArrayList<>();
        for (Customer customer1 : customers) {
            stringList.add(customer1.getInfoToFileCustomer());
        }
        ReadAndWriteFileFurama.writeFile(CUSTOMER_FILE, stringList, false);
    }
}
