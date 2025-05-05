package bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.repository;

import bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.entity.Employee;
import bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.util.ReadAndWriteFileFurama;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    private static final String EMPLOYEE_FILE = "src/bai_tap_lam_them/quan_ly_khu_nghi_duong_furama/data/employee.csv";

    @Override
    public List<Employee> findAll() {
        List<Employee> employees = new ArrayList<>();
        List<String> stringList = ReadAndWriteFileFurama.readFile(EMPLOYEE_FILE);
        String[] array;
        for (int i = 0; i < stringList.size(); i++) {
            array = stringList.get(i).split(",");
            Employee employee = new Employee(array[0], array[1], array[2], array[3], array[4], array[5],
                    array[6], array[7], array[8], Long.parseLong(array[9]));
            employees.add(employee);
        }
        return employees;
    }

    @Override
    public void add(Employee employee) {
        List<String> stringList = new ArrayList<>();
        stringList.add(employee.getInfoToFileEmployee());
        ReadAndWriteFileFurama.writeFile(EMPLOYEE_FILE, stringList, true);
    }

    @Override
    public Employee findByIDEmployee(String idEmployee) {
        List<Employee> employees = findAll();
        for (Employee employee : employees) {
            if (employee.getId().equalsIgnoreCase(idEmployee)) {
                return employee;
            }
        }
        return null;
    }

    @Override
    public void editEmployee(Employee employee) {
        List<Employee> employees = findAll();
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getId().equalsIgnoreCase(employee.getId())) {
                employees.set(i, employee);
                break;
            }
        }
        List<String> stringList = new ArrayList<>();
        for (Employee employee1 : employees) {
            stringList.add(employee1.getInfoToFileEmployee());
        }
        ReadAndWriteFileFurama.writeFile(EMPLOYEE_FILE, stringList, false);
    }
}



