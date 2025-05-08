package bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.view;

import bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.common.SelectionList;
import bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.common.ValidateInput;
import bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.entity.Customer;
import bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.util.InputUtil;

import java.util.List;
import java.util.Scanner;

public class CustomerView {
    private static Scanner scanner = new Scanner(System.in);

    public static void displayCustomer(List<Customer> customers) {
        for (int i = 0; i < customers.size(); i++) {
            System.out.println(customers.get(i));

        }
    }
    public static String findIDCustomer() {
        System.out.println("Nhập mã khách hàng cần sửa ");
        return scanner.nextLine();
    }

    public static Customer inputDataForCustomer() {
        System.out.println("Nhập id nhân viên(VD: KH-1234):");
        String idKhachHang = ValidateInput.validateInput("^KH-\\d{4}$",
                "Mã nhân viên sai định dạng. Nhập lại như ví dụ");
        System.out.println("Nhập tên nhân viên (VD: Nguyen Van A)");
        String tenKhachHang = ValidateInput.validateInput("^([A-Z][a-z]*)\\s([A-Z][a-z]*\\s)*([A-Z][a-z]*)$",
                "Tên sai định dạng,Nhập lại như ví dụ");
        String ngayThangNamSinh;
        while (true){
            System.out.println("Nhập ngày tháng năm sinh(VD: 01-01-2025)");
            ngayThangNamSinh=scanner.nextLine();
            if (ValidateInput.isValidateDateInput(ngayThangNamSinh)){
                break;
            }
            System.err.println("Dữ Liệu không hợp lệ vui lòng nhập lại");
        }
        System.out.println("Nhập giới tính");

        String gioiTinh = ValidateInput.validateInput("^(?i)(Nam|Nữ|Khác)$",
                "Nhập giới tính sai, Nhập lại");
        System.out.println("Nhập chứng minh nhân dân(9-12 số)");
        String soChungMinhNhanDan = ValidateInput.validateInput("^\\d{9,12}$",
                "Nhập sai, Nhập từ 9-12 số");
        System.out.println("Nhập số điện thoại");
        String soDienThoai = ValidateInput.validateInput("^0\\d{9}$", "Nhập số điện thoại sai, Nhập lại");
        System.out.println("Nhập email nhân viên");
        String emailNhanVien = ValidateInput.validateInput("^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$",
                "Nhập sai, Nhập lại");
        String loaiKhach = InputUtil.selectFromList(SelectionList.getLoaiKhachList(), "Loại Khách", scanner);
        System.out.println("Nhập địa chỉ");
        String diaChi = scanner.nextLine();
        return new Customer(idKhachHang, tenKhachHang, ngayThangNamSinh, gioiTinh, soChungMinhNhanDan, soDienThoai, emailNhanVien, loaiKhach, diaChi);
    }


    public static void inputEditCustomer(Customer customer) {
        System.out.println("Nhập tên khách hàng");
        String tenKhachHang = ValidateInput.validateInput("^([A-Z][a-z]*)\\s([A-Z][a-z]*\\s)*([A-Z][a-z]*)$", "Tên sai định dạng,Nhập lại như ví dụ");
        customer.setTen(tenKhachHang);
        String ngayThangNamSinh;
        while (true){
            System.out.println("Nhập ngày tháng năm sinh(VD: 01-01-2025)");
            ngayThangNamSinh = scanner.nextLine();
            if (ValidateInput.isValidateDateInput(ngayThangNamSinh)){
                break;
            }
            System.err.println("Dữ liệu không hợp lệ vui lòng nhập lại!!!");
        }
        customer.setNgaySinh(ngayThangNamSinh);
        System.out.println("Nhập giới tính");
        String gioiTinh = ValidateInput.validateInput("^(?i)(Nam|Nữ|Khác)$", "Nhập giới tính sai, Nhập lại");
        customer.setGioiTinh(gioiTinh);
        System.out.println("Nhập chứng minh nhân dân");
        String soChungMinhNhanDan = ValidateInput.validateInput("^\\d{9,12}$",
                "Nhập sai, Nhập từ 9-12 số");
        customer.setSoChungMinhNhanDan(soChungMinhNhanDan);
        System.out.println("Nhập số điện thoại");
        String soDienThoai= ValidateInput.validateInput("^0\\d{9}$", "Nhập số điện thoại sai, Nhập lại");
        customer.setSoDienThoai(soDienThoai);
        System.out.println("Nhập email khách hàng");
        String eMail = ValidateInput.validateInput("^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$",
                "Nhập sai, Nhập lại");
        customer.seteMail(eMail);
        String loaiKhach = InputUtil.selectFromList(SelectionList.getLoaiKhachList(), "Loại Khách", scanner);
        customer.setLoaiKhach(loaiKhach);
        System.out.println("Nhập địa chỉ");
        customer.setDiaChi(scanner.nextLine());
    }
}
