package bai_tap_lam_them.quan_ly_hoa_don_tien_nuoc.view;

import bai_tap_lam_them.quan_ly_hoa_don_tien_nuoc.controller.MainController;
import bai_tap_lam_them.quan_ly_hoa_don_tien_nuoc.entity.KhachHang;
import bai_tap_lam_them.quan_ly_hoa_don_tien_nuoc.entity.KhachHangNoiDia;
import bai_tap_lam_them.quan_ly_hoa_don_tien_nuoc.entity.KhachHangQuocTe;
import bai_tap_lam_them.quan_ly_hoa_don_tien_nuoc.entity.LoaiKhachHang;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class KhachHangView {
    private static Scanner scanner = new Scanner(System.in);

    public static void displayListKhachHang(List<KhachHang> khachHangs) {
        for (KhachHang khachHang : khachHangs) {
            if (khachHang instanceof KhachHangNoiDia) {
                KhachHangNoiDia khachHangNoiDia = (KhachHangNoiDia) khachHang;
                System.out.println(khachHangNoiDia.getId() + "," + khachHangNoiDia.getName() + "," + khachHangNoiDia.getDiaChi() +
                        "," + khachHangNoiDia.getType() + "," + khachHangNoiDia.getMucTieuChuan());
            } else if (khachHang instanceof KhachHangQuocTe) {
                KhachHangQuocTe khachHangQuocTe = (KhachHangQuocTe) khachHang;
                System.out.println(khachHangQuocTe.getId() + "," + khachHangQuocTe.getName() +
                        "," + "-----" + "," + "-----" + "," + "-----" + "," + khachHangQuocTe.getQuocTich());

            }
        }
    }

    public static String nhapTen() {
        System.out.println("Nhập tên khách hàng cần tìm");
        return scanner.nextLine();
    }

    public static void displayListLoaiKhachHang(List<LoaiKhachHang> loaiKhachHangs) {
        for (LoaiKhachHang loaiKhachHang : loaiKhachHangs) {
            System.out.println(loaiKhachHang.getId() + "," + loaiKhachHang.getName());
        }
    }

    public static void editKhachHangQuoc(KhachHang khachHang) {
        System.out.println("Nhập tên khách hàng");
        khachHang.setName(scanner.nextLine());
        System.out.println("Nhập quốc tịch: ");
        ((KhachHangQuocTe) khachHang).setQuocTich(scanner.nextLine());
    }

    public KhachHang inputKhachHangVietNam() {
        String idRegex = "KHVN-\\d{4}";
        Pattern pattern = Pattern.compile(idRegex);
        String id;
        do {
            System.out.println("Nhập mã khách hàng(KHVN-XXXX): ");
            id = scanner.nextLine();
            Matcher matcher = pattern.matcher(id);
            if (matcher.matches()) {
                break;
            } else {
                System.out.println("ID không hợp lệ");
            }
        } while (true);
        System.out.println("Nhập tên khách hàng");
        String name = scanner.nextLine();
        System.out.println("Nhập địa chỉ khách hàng");
        String diaChi = scanner.nextLine();
        MainController.displayLoaiKhachHang();
        String type;
        do {
            System.out.print("chọn loại khách(ID): ");
            type = scanner.nextLine();
            if (MainController.checkLoaiKhachHang(type)) {
                type = MainController.getTenLoaiKhachHang(type);
                break;
            } else {
                System.out.println("Không Hợp Lệ");
            }
        } while (true);
        System.out.print("Nhập định mức tiêu thụ: ");
        double dinhMucTieuThu = Double.parseDouble(scanner.nextLine());
        return new KhachHangNoiDia(id, name, type, diaChi, dinhMucTieuThu);
    }

    public KhachHang inputKhachHangNuocNgoai() {
        String idRegex = "KHNN-\\d{4}";
        Pattern pattern = Pattern.compile(idRegex);
        String id;
        do {
            System.out.println("Nhập mã khách hàng(KHNN-XXXX): ");
            id = scanner.nextLine();
            Matcher matcher = pattern.matcher(id);
            if (matcher.matches()) {
                break;
            } else {
                System.out.println("ID không hợp lệ");
            }
        } while (true);
        System.out.println("Nhập tên khách hàng");
        String name = scanner.nextLine();
        System.out.println("Nhập quốc tịch: ");
        String quocTich = scanner.nextLine();
        return new KhachHangQuocTe(id, name, quocTich);
    }

    public static String findIDKhachHang() {
        System.out.println("Nhập id cần sửa/xóa");
        return scanner.nextLine();
    }

    public static void editKhachHangNoiDia(KhachHang khachHang) {
        System.out.println("Nhập tên khách hàng");
        khachHang.setName(scanner.nextLine());
        System.out.println("Nhập địa chỉ khách hàng");
        ((KhachHangNoiDia) khachHang).setDiaChi(scanner.nextLine());
        MainController.displayLoaiKhachHang();
        String type;
        do {
            System.out.print("chọn loại khách(ID): ");
            type = scanner.nextLine();
            if (MainController.checkLoaiKhachHang(type)) {
                type = MainController.getTenLoaiKhachHang(type);
                ((KhachHangNoiDia) khachHang).setType(type);
                break;
            } else {
                System.out.println("Không Hợp Lệ");
            }
        } while (true);
        System.out.print("Nhập định mức tiêu thụ: ");
        ((KhachHangNoiDia) khachHang).setMucTieuChuan(Double.parseDouble(scanner.nextLine()));
    }


}
