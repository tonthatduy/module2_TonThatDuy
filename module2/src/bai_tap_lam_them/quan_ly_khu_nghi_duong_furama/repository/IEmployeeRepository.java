package bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.repository;

import bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.entity.Employee;

import java.util.List;

public interface IEmployeeRepository {

    List<Employee> findAll();

    void add(Employee employee);

    Employee findByIDEmployee(String idEmployee);

    void editEmployee(Employee employee);
}
