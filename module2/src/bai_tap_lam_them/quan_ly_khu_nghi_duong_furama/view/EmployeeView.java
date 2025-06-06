package bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.view;

import bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.common.SelectionList;
import bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.common.ValidateInput;
import bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.entity.Employee;
import bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.util.InputUtil;

import java.util.List;
import java.util.Scanner;

public class EmployeeView {
    private static Scanner scanner = new Scanner(System.in);

    public static void displayEmployee(List<Employee> employees) {
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i));

        }
    }

    public static String findIDEmployee() {
        System.out.println("Nhập mã nhân viên cần sửa ");
        return scanner.nextLine();
    }

    public static void inputEditEmployee(Employee employee) {
        System.out.println("Nhập tên nhân viên");
        String tenNhanVien = ValidateInput.validateInput("^([A-Z][a-z]*)\\s([A-Z][a-z]*\\s)*([A-Z][a-z]*)$",
                "Tên sai định dạng,Nhập lại như ví dụ");
        employee.setTen(tenNhanVien);
        String ngayThangNamSinh;
        while (true) {
            System.out.println("Nhập ngày tháng năm sinh(VD: 01-01-2025)");
            ngayThangNamSinh = scanner.nextLine();
            if (ValidateInput.isValidateDateInput(ngayThangNamSinh)) {
                break;
            }
            System.err.println("Dữ liệu không hợp lệ vui lòng nhập lại !!!");
        }
        employee.setNgaySinh(ngayThangNamSinh);
        System.out.println("Nhập giới tính");
        String gioiTinh = ValidateInput.validateInput("^(?i)(Nam|Nữ|Khác)$", "Nhập giới tính sai, Nhập lại");
        employee.setGioiTinh(gioiTinh);
        System.out.println("Nhập chứng minh nhân dân");
        String soChungMinhNhanDan = ValidateInput.validateInput("^\\d{9,12}$", "Nhập sai, Nhập từ 9-12 số");
        employee.setSoChungMinhNhanDan(soChungMinhNhanDan);
        System.out.println("Nhập số điện thoại");
        String soDienThoai = ValidateInput.validateInput("^0\\d{9}$", "Nhập số điện thoại sai, Nhập lại");
        employee.setSoDienThoai(soDienThoai);
        System.out.println("Nhập email nhân viên");
        String eMail = ValidateInput.validateInput("^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$", "Nhập sai, Nhập lại");
        employee.seteMail(eMail);
        String trinhDo = InputUtil.selectFromList(SelectionList.getTrinhDoList(), "Chọn Trình Độ Nhân Viên", scanner);
        employee.setTrinhDo(trinhDo);
        String viTri = InputUtil.selectFromList(SelectionList.getViTriList(), "Chọn Vị Trí", scanner);
        employee.setViTri(viTri);
        long luongNhanVien = ValidateInput.validateLuong("Nhập lương nhân viên (Lương > 0):");
        employee.setLuong(luongNhanVien);
    }

    public static Employee inputDataForEmployee() {
        System.out.println("Nhập id nhân viên(VD: NV-1234):");
        String idNhanVien = ValidateInput.validateInput("^NV-\\d{4}$", "Mã nhân viên sai định dạng. Nhập lại như ví dụ");
        System.out.println("Nhập tên nhân viên (VD: Nguyen Van A)");
        String tenNhanVien = ValidateInput.validateInput("^([A-Z][a-z]*)\\s([A-Z][a-z]*\\s)*([A-Z][a-z]*)$", "Tên sai định dạng,Nhập lại như ví dụ");
        String ngayThangNamSinh;
        while (true) {
            System.out.println("Nhập ngày tháng năm sinh(VD: 01-01-2025)");
            ngayThangNamSinh = scanner.nextLine();
            if (ValidateInput.isValidateDateInput(ngayThangNamSinh)) {
                break;
            }
            System.err.println("Dữ liệu không hợp lệ vui lòng nhập lại!");
        }
        System.out.println("Nhập giới tính");
        String gioiTinh = ValidateInput.validateInput("^(?i)(Nam|Nữ|Khác)$", "Nhập giới tính sai, Nhập lại");
        System.out.println("Nhập chứng minh nhân dân(9-12 số)");
        String soChungMinhNhanDan = ValidateInput.validateInput("^\\d{9,12}$", "Nhập sai, Nhập từ 9-12 số");
        System.out.println("Nhập số điện thoại");
        String soDienThoai = ValidateInput.validateInput("^0\\d{9}$", "Nhập số điện thoại sai, Nhập lại");
        System.out.println("Nhập email nhân viên");
        String emailNhanVien = ValidateInput.validateInput("^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$", "Nhập sai, Nhập lại");
        String trinhDo = InputUtil.selectFromList(SelectionList.getTrinhDoList(), "Chọn Trình Độ Nhân Viên", scanner);
        String viTri = InputUtil.selectFromList(SelectionList.getViTriList(), "Chọn Vị Trí", scanner);
        long luongNhanVien = ValidateInput.validateLuong("Nhập lương nhân viên(Lương > 0)");
        return new Employee(idNhanVien, tenNhanVien, ngayThangNamSinh, gioiTinh,
                soChungMinhNhanDan, soDienThoai, emailNhanVien, trinhDo, viTri, luongNhanVien);

    }


}
