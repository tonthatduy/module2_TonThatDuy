package bai_tap_lam_them.quan_ly_hoa_don_tien_dien.view;

import bai_tap_lam_them.quan_ly_hoa_don_tien_dien.controller.ManagementController;
import bai_tap_lam_them.quan_ly_hoa_don_tien_dien.entity.Customer;
import bai_tap_lam_them.quan_ly_hoa_don_tien_dien.entity.CustomerType;
import bai_tap_lam_them.quan_ly_hoa_don_tien_dien.entity.ForeinCustomer;
import bai_tap_lam_them.quan_ly_hoa_don_tien_dien.entity.LocalCustomer;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomerView {
    private static Scanner scanner = new Scanner(System.in);

    public static void displayCustomerList(List<Customer> customers) {
        for (Customer customer : customers) {
            if (customer instanceof LocalCustomer) {
                LocalCustomer lCustomer = (LocalCustomer) customer;
                System.out.println(lCustomer.getId() + "," + lCustomer.getName() + "," +
                        lCustomer.getType() + "," + lCustomer.getConsumption());
            } else if (customer instanceof ForeinCustomer) {
                ForeinCustomer fCustomer = (ForeinCustomer) customer;
                System.out.println(fCustomer.getId() + "," + fCustomer.getName() + "," + "-----" + "," + "-----" + "," + fCustomer.getNationlity());

            }
        }
    }

    public static String enterName() {
        System.out.print("Nhập tên khách hàng cần tìm: ");
        return scanner.nextLine();
    }

    public static void displayCustomerTypeList(List<CustomerType> customerTypes) {
        System.out.printf("%-10s | %-15s \n", "Mã loại", "Tên");
        for (CustomerType customerType : customerTypes) {
            System.out.printf("%-10s | %-15s \n", customerType.getId(), customerType.getName());
        }
    }

    public Customer inputVietNamCustomer() {
        String idRegex = "KHVN-\\d{4}";
        Pattern pattern = Pattern.compile(idRegex);
        String id;
        do {
            System.out.print("Nhập mã khách hàng (KHVN-XXXX): ");
            id = scanner.nextLine();
            Matcher matcher = pattern.matcher(id);
            if (matcher.matches()) {
                break;
            } else {
                System.out.println("ID không hợp lệ");
            }
        } while (true);
        System.out.print("Nhập tên khách hàng: ");
        String name = scanner.nextLine();

        ManagementController.displayCustomerType();
        String type;
        do {
            System.out.print("Chọn loại khách (ID): ");
            type = scanner.nextLine();
            if (ManagementController.checkCustomerType(type)) {
                type = ManagementController.getCustomerTypeName(type);
                break;
            } else {
                System.out.println("Không hợp lệ");
            }
        } while (true);

        System.out.print("Nhập định mức tiêu thụ: ");
        double consumption = Double.parseDouble(scanner.nextLine());
        return new LocalCustomer(id, name, type, consumption);
    }

    public Customer inputForeignCustomer() {
        String idRegex = "KHNN-\\d{4}";
        Pattern pattern = Pattern.compile(idRegex);
        String id;
        do {
            System.out.print("Nhập mã khách hàng (KHNN-XXXX): ");
            id = scanner.nextLine();
            Matcher matcher = pattern.matcher(id);
            if (matcher.matches()) {
                break;
            } else {
                System.out.println("ID không hợp lệ");
            }
        } while (true);
        System.out.print("Nhập tên khách hàng: ");
        String name = scanner.nextLine();
        System.out.print("Nhập quốc tịch: ");
        String nationality = scanner.nextLine();
        return new ForeinCustomer(id, name, nationality);
    }

}
