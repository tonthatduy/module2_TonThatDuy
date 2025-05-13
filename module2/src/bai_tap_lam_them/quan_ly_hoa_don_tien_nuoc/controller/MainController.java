package bai_tap_lam_them.quan_ly_hoa_don_tien_nuoc.controller;

import bai_tap_lam_them.quan_ly_hoa_don_tien_nuoc.entity.KhachHang;
import bai_tap_lam_them.quan_ly_hoa_don_tien_nuoc.entity.KhachHangNoiDia;
import bai_tap_lam_them.quan_ly_hoa_don_tien_nuoc.entity.KhachHangQuocTe;
import bai_tap_lam_them.quan_ly_hoa_don_tien_nuoc.entity.LoaiKhachHang;
import bai_tap_lam_them.quan_ly_hoa_don_tien_nuoc.service.IKhachHangService;
import bai_tap_lam_them.quan_ly_hoa_don_tien_nuoc.service.ILoaiKhachHangService;
import bai_tap_lam_them.quan_ly_hoa_don_tien_nuoc.service.KhachHangService;
import bai_tap_lam_them.quan_ly_hoa_don_tien_nuoc.service.LoaiKhachHangService;
import bai_tap_lam_them.quan_ly_hoa_don_tien_nuoc.view.KhachHangView;

import java.util.List;
import java.util.Scanner;

public class MainController {
    private static Scanner scanner = new Scanner(System.in);
    private static ILoaiKhachHangService loaiKhachHangService = new LoaiKhachHangService();
    private static IKhachHangService khachHangService = new KhachHangService();

    public static void displayMenu() {
        do {
            System.out.println("===Quản lý hóa đơn tiền nước===");
            System.out.println("1.  Thêm mới khách hàng");
            System.out.println("2.  Hiển thị thông tin khách hàng");
            System.out.println("3.  Tìm kiếm khách hàng");
            System.out.println("4.  Xóa khách hàng");
            System.out.println("5.  Sửa thông tin khách hàng");
            System.out.println("6.  Sắp Xếp Theo Tên ");
            System.out.println("7.  Thoát ứng dụng");
            System.out.print("Lựa chọn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1 -> {
                    add();
                }
                case 2 -> {
                    System.out.println("===Hiển Thị Thông Tin Khách Hàng===");
                    display();
                }
                case 3 -> {
                    System.out.println("===Tìm Kiếm Tên Khách Hàng===");
                    search();
                }
                case 4 -> {
                    System.out.println("===Xóa Khách Hàng===");
                    delete();
                }
                case 5 -> {
                    System.out.println("===Sửa Thông Tin Khách Hàng===");
                    update();
                }
                case 6 -> {
                    System.out.println("===Sắp Xếp Theo Tên Khách Hàng===");
                    displayListSortByName();
                }
                case 7 -> {
                    System.out.println("Tạm biệt");
                    System.exit(0);
                }
                default -> {
                    System.out.println("Không hợp lệ nhập lại");
                }
            }
        } while (true);
    }

    private static void add() {
        boolean flag = true;

        do {
            System.out.println("===Thêm mới khách hàng===");
            System.out.println("1.  Thêm khách hàng Việt Nam");
            System.out.println("2.  Thêm khách hàng nước ngoài");
            System.out.println("3.  Thoát");
            System.out.print("Lụa chọn: ");
            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1 -> {
                        System.out.println("===Thêm Khách Hàng Việt nam");
                        addKhachHangNoiDia();
                    }
                    case 2 -> {
                        System.out.println("===Thêm Khách Hàng Quốc Tế");
                        addKhachHangQuocTe();
                    }
                    case 3 -> {
                        flag = false;
                    }
                    default -> {
                        System.out.println("Không Hợp Lệ!");
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Nhập số");
            }

        } while (flag);
    }

    private static void display() {
        List<KhachHang> khachHangs = khachHangService.findAll();
        KhachHangView.displayListKhachHang(khachHangs);
    }

    public static void displayLoaiKhachHang() {
        List<LoaiKhachHang> loaiKhachHangs = loaiKhachHangService.findAll();
        KhachHangView.displayListLoaiKhachHang(loaiKhachHangs);
    }

    public static boolean checkLoaiKhachHang(String type) {
        LoaiKhachHang loaiKhachHang = loaiKhachHangService.findByID(type);
        if (loaiKhachHang != null) {
            return true;
        }
        return false;
    }

    public static String getTenLoaiKhachHang(String id) {
        LoaiKhachHang loaiKhachHang = loaiKhachHangService.findByID(id);
        return loaiKhachHang.getName();
    }

    private static void addKhachHangNoiDia() {
        KhachHang khachHang = new KhachHangView().inputKhachHangVietNam();
        khachHangService.add(khachHang);
        System.out.println("Thêm Mới Thành Công");
    }

    private static void addKhachHangQuocTe() {
        KhachHang khachHang = new KhachHangView().inputKhachHangNuocNgoai();
        khachHangService.add(khachHang);
        System.out.println("Thêm Mơi Thành Công");
    }

    private static void search() {
        String name = KhachHangView.nhapTen();
        List<KhachHang> khachHangs = khachHangService.findByName(name);
        KhachHangView.displayListKhachHang(khachHangs);
    }

    private static void delete() {
        KhachHang khachHangs = khachHangService.findByIDKhachHang(KhachHangView.findIDKhachHang());
        if (khachHangs == null) {
            System.out.println("Không có trong danh sách");
        } else {
            khachHangService.delete(khachHangs);
            System.out.println("Xóa Thành Công");
        }

    }

    private static void update() {
        String id = KhachHangView.findIDKhachHang();
        KhachHang khachHang = khachHangService.findByIDKhachHang(id);
        if (khachHang == null) {
            System.out.println("Không có trong danh sách");
        } else {
            if (khachHang instanceof KhachHangNoiDia) {
                KhachHangView.editKhachHangNoiDia(khachHang);
            } else if (khachHang instanceof KhachHangQuocTe) {
                KhachHangView.editKhachHangQuoc(khachHang);
            }
            khachHangService.update(khachHang);
        }
    }

    private static void displayListSortByName() {
        List<KhachHang> khachHangs = khachHangService.findAllSortByName();
        KhachHangView.displayListKhachHang(khachHangs);
    }
}
