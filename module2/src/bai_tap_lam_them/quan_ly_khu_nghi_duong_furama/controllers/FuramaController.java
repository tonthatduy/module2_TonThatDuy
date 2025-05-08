package bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.controllers;

import bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.service.*;
import bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.entity.Customer;
import bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.entity.Employee;
import bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.view.CustomerView;
import bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.view.EmployeeView;
import bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.view.FacilityView;
import ss3_mang.bai_tap.bai_tap_6.TinhTongCacSoOMotCotXacDinh;

import java.util.Scanner;

public class FuramaController {
    private static Scanner scanner = new Scanner(System.in);
    private static IEmployeeService employeeService = new EmployeeService();
    private static ICustomerService customerService = new CustomerService();
    private static IFacilityService facilityService = new FacilityService();

    public static void displayMainMenu() {
        menuLoop:
        do {
            System.out.println("---------Menu---------");
            System.out.println("1.Employee Management");
            System.out.println("2.Customer Management");
            System.out.println("3.Facility Management ");
            System.out.println("4.Booking Management ");
            System.out.println("5.Promotion Management ");
            System.out.println("6.Exit");
            int choice = readInt("Chọn trong khoảng 1-6", 1, 6);

            switch (choice) {
                case 1 -> {
                    menuEmployee();
                }
                case 2 -> {
                    menuCustomer();
                }
                case 3 -> {
                    menuFacility();
                }
                case 4 -> {
                    menuBooking();
                }
                case 5 -> {
                    menuPromotion();
                }
                case 6 -> {
                    System.out.println("----Thanks----");
                    break menuLoop;
                }
                default -> {
                    System.out.println("No Choice!");
                }
            }
        } while (true);
    }

    public static void menuEmployee() {
        do {
            System.out.println("---Employee Management---");
            System.out.println("1. Display list employees");
            System.out.println("2. Add new employee");
            System.out.println("3. Edit employee");
            System.out.println("4. Return main menu");
            int option = readInt("Chọn trong khoảng 1-4", 1, 4);

            switch (option) {
                case 1 -> {
                    System.out.println("-----Hiển thị Employees-----");
                    EmployeeView.displayEmployee(employeeService.findAll());
                }
                case 2 -> {
                    System.out.println("-----Thêm Nhân Viên-----");
                    employeeService.add(EmployeeView.inputDataForEmployee());
                }
                case 3 -> {
                    System.out.println("-----Sửa Thông Tin Nhân Viên----");
                    EmployeeView.displayEmployee(employeeService.findAll());
                    editEmployee();
                    EmployeeView.displayEmployee(employeeService.findAll());
                }
                case 4 -> {
                    System.out.println("Return to Main Menu");
                    return;
                }
            }
        } while (true);
    }

    public static void menuCustomer() {
        do {
            System.out.println("---Customer Management---");
            System.out.println("1.Display list customers");
            System.out.println("2.Add new customer");
            System.out.println("3.Edit customer");
            System.out.println("4.Return main menu");
            int option = readInt("Chọn trong khoảng 1-4", 1, 4);

            switch (option) {
                case 1 -> {
                    System.out.println("-----Hiển thị Khách Hàng-----");
                    CustomerView.displayCustomer(customerService.findAll());
                }
                case 2 -> {
                    System.out.println("-----Thêm Khách Hàng-----");
                    customerService.add(CustomerView.inputDataForCustomer());
                }
                case 3 -> {
                    System.out.println("-----Sửa Thông Tin Khách Hàng----");
                    CustomerView.displayCustomer(customerService.findAll());
                    editCustomer();
                    CustomerView.displayCustomer(customerService.findAll());
                }
                case 4 -> {
                    System.out.println("Return to Main Menu");
                    return;
                }
            }
        } while (true);
    }


    public static void menuFacility() {
        do {
            System.out.println("---Facility Management---");
            System.out.println("1. Display list facility");
            System.out.println("2. Add new facility");
            System.out.println("3. Display list facility maintenance");
            System.out.println("4.Return main menu");
            int option = readInt("Chọn trong khoảng 1-4", 1, 4);
            switch (option) {
                case 1 -> {
                    System.out.println("-----Hiển Thị Dịch Vụ-----");
                    FacilityView.displayFacilityList(facilityService.findAll());
                }
                case 2 -> {
                    menuAddNewFacility();
                }
                case 3 -> {
                }
                case 4 -> {
                    System.out.println("Return to Main Menu");
                    return;
                }
            }
        } while (true);
    }

    public static void menuBooking() {
        do {
            System.out.println("---Booking Management---");
            System.out.println("1.Add new booking");
            System.out.println("2.Display list booking");
            System.out.println("3.Create new contracts");
            System.out.println("4.Display list contracts");
            System.out.println("5.Edit contracts");
            System.out.println("6.Return main menu");
            int option = readInt("Chọn trong khoảng 1-6", 1, 6);
            switch (option) {
                case 1 -> {
                }
                case 2 -> {
                }
                case 3 -> {
                }
                case 4 -> {
                }
                case 5 -> {
                }
                case 6 -> {
                    System.out.println("Return to Main Menu");
                    return;
                }
            }
        } while (true);
    }

    public static void menuPromotion() {
        do {
            System.out.println("---Promotion Management---");
            System.out.println("1.Display list customers use service");
            System.out.println("2.Display list customers get voucher");
            System.out.println("3.Return main menu");
            int option = readInt("Chọn trong khoảng (1-3)", 1, 3);
            switch (option) {
                case 1 -> {
                }
                case 2 -> {
                }
                case 3 -> {
                    System.out.println("Return to Main Menu");
                    return;
                }
            }
        } while (true);
    }

    public static void menuAddNewFacility() {
        do {
            System.out.println("---Thêm Mới Dịch Vụ---");
            System.out.println("1. Add New Villa");
            System.out.println("2. Add New House");
            System.out.println("3. Add New Room");
            System.out.println("4. Back To Menu");
            int option = readInt("Chọn trong khoảng (1-4)", 1, 4);
            switch (option) {
                case 1 -> {
                }
                case 2 -> {
                }
                case 3 -> {
                }
                case 4 -> {
                    System.out.println("Back to Menu");
                    return;
                }
            }
        } while (true);
    }

    public static int readInt(String prompt, int min, int max) {
        while (true) {
            System.out.println(prompt);
            String input = scanner.nextLine();
            if (input.trim().isEmpty()) {
                System.out.println("Không được để trống");
                continue;
            }
            try {
                int num = Integer.parseInt(input);
                if (num < min || num > max) {
                    System.out.println("Nhập lại trong khoảng " + min + " và " + max + ".");
                } else {
                    return num;
                }
            } catch (NumberFormatException e) {
                System.err.println("Nhập lại số");
            }
        }

    }

    public static void editEmployee() {
        Employee employee = employeeService.findByIDEmployee(EmployeeView.findIDEmployee());
        if (employee == null) {
            System.out.println("Không có trong danh sách");
        } else {
            EmployeeView.inputEditEmployee(employee);
            employeeService.editEployee(employee);
            System.out.println("---Sửa thành công---");
        }
    }

    private static void editCustomer() {
        Customer customer = customerService.findByIDCustomer(CustomerView.findIDCustomer());
        if (customer == null) {
            System.out.println("Không có trong danh sách");
        } else {
            CustomerView.inputEditCustomer(customer);
            customerService.editCustomer(customer);
            System.out.println("-----Sửa thành công-----");
        }
    }

}
