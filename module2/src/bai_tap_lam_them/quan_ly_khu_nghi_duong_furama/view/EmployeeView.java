package bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.view;

import bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.entity.Employee;

import java.util.List;
import java.util.Scanner;

public class EmployeeView {
    private static Scanner scanner = new Scanner(System.in);

    public static void displayEmployee(List<Employee> employees) {
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i));

        }
    }

    public static Employee inputDataForEmployee() {
        System.out.println("Nhập id nhân viên");
        String idNhanVien = scanner.nextLine();
        System.out.println("Nhập tên nhân viên");
        String tenNhanVien = scanner.nextLine();
        System.out.println("Nhập ngày tháng năm sinh");
        String ngayThangNamSinh = scanner.nextLine();
        System.out.println("Nhập giới tính");
        String gioiTinh = scanner.nextLine();
        System.out.println("Nhập chứng minh nhân dân");
        String soChungMinhNhanDan = scanner.nextLine();
        System.out.println("Nhập số điện thoại");
        String soDienThoai = scanner.nextLine();
        System.out.println("Nhập email nhân viên");
        String emailNhanVien = scanner.nextLine();
        System.out.println("Nhập trình độ nhân viên");
        String trinhDo = scanner.nextLine();
        System.out.println("Nhập vị trí nhân viên");
        String viTri = scanner.nextLine();
        System.out.println("Nhập lương nhân viên");
        long luongNhanVien = Long.parseLong(scanner.nextLine());
        return new Employee(idNhanVien, tenNhanVien, ngayThangNamSinh, gioiTinh,
                soChungMinhNhanDan, soDienThoai, emailNhanVien, trinhDo, viTri, luongNhanVien);

    }
}
