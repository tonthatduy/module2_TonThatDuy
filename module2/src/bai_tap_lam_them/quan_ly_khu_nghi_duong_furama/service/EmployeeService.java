package bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.service;

import bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.entity.Employee;
import bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.repository.EmployeeRepository;
import bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.repository.IEmployeeRepository;

import java.util.List;

public class EmployeeService implements IEmployeeService{
    private IEmployeeRepository employeeRepository = new EmployeeRepository();
    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public void add(Employee employee) {
        employeeRepository.add(employee);
    }

    @Override
    public Employee findByIDEmployee(String idEmployee) {
        return employeeRepository.findByIDEmployee(idEmployee);
    }

    @Override
    public void editEployee(Employee employee) {
        employeeRepository.editEmployee(employee);
    }
}
