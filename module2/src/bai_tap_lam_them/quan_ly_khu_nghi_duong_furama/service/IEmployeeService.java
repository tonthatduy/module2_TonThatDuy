package bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.service;

import bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.entity.Employee;

import java.util.List;

public interface IEmployeeService {
    List<Employee> findAll();

    void add(Employee employee);

    Employee findByIDEmployee(String idEmployee);

    void editEployee(Employee employee);
}
