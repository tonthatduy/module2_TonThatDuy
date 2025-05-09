package bai_tap_lam_them_ngoai.quan_ly_hoa_don_tien_dien.controller;

import bai_tap_lam_them_ngoai.quan_ly_hoa_don_tien_dien.service.*;
import bai_tap_lam_them_ngoai.quan_ly_hoa_don_tien_dien.view.PersonView;
import bai_tap_lam_them_ngoai.quan_ly_hoa_don_tien_dien.view.VietNamView;

import java.util.Scanner;

public class ElectricityBillManagement {
    private static Scanner scanner = new Scanner(System.in);
    private static IPersonService personService = new PersonService();
    private static IForeignerService foreignerService = new ForeignerService();
    private static IVietNamService vietNamService = new VietNamService();

    public static void displayMainMenu() {
        menuLoop:
        do {
            System.out.println("-Quản Lý Hóa Đơn Tiền Điện-");
            System.out.println("1.Thêm Mới Khách Hàng");
            System.out.println("2.Hiển Thị Thông Tin Khách Hàng");
            System.out.println("3.Tìm Kiếm Khách Hàng");
            System.out.println("4.Thêm Mới Hóa Đơn");
            System.out.println("5.Chỉnh Sửa Hóa Đơn");
            System.out.println("6.Hiện Thị Thông Tin Chi Tiết Hóa Đơn");
            System.out.println("7.Exit");
            int choice = readInPut("Chọn Trong Khoảng (1-7)", 1, 7);
            switch (choice) {
                case 1 -> {
                    displayMenuAdd();
                }
                case 2 -> {
                    System.out.println("---Hiển Thị Thông Tin Khách Hàng---");
                    PersonView.displayPerson(personService.findAll());
                }
                case 3 -> {
                }
                case 4 -> {
                }
                case 5 -> {
                }
                case 6 -> {
                }
                case 7 -> {
                    System.out.println("---Thanks---");
                    break menuLoop;
                }
                default -> {
                    System.out.println("Không nằm trong danh sách");
                }
            }
        } while (true);
    }

    public static void displayMenuAdd() {
        do {
            System.out.println("---Thêm Mới Khách Hàng---");
            System.out.println("1. Thêm Khách Hàng VN");
            System.out.println("2. Thêm Khách Hàng Nước Ngoài");
            System.out.println("3. Trở Lại Menu Chính");
            int option = readInPut("Chọn Khoảng (1-3)", 1, 3);
            switch (option) {
                case 1 -> {
                    System.out.println("---Thêm Khách Hàng VN---");
                    vietNamService.add(VietNamView.inputDataForPersonVietNam());
                }
                case 2 -> {
                }
                case 3 -> {
                    System.out.println("Trở Lại Menu");
                    return;
                }
            }
        } while (true);
    }

    public static int readInPut(String prompt, int min, int max) {
        while (true) {
            System.out.println(prompt);
            String input = scanner.nextLine();
            if (input.trim().isEmpty()) {
                System.err.println("Không được để trống");
                continue;
            }
            try {
                int num = Integer.parseInt(input);
                if (num < min || num > max) {
                    System.err.println("Nhập lại trong khoảng " + min + " và " + max + ".");
                } else {
                    return num;
                }
            } catch (NumberFormatException e) {
                System.err.println("Nhập lại số");
            }
        }
    }

}
