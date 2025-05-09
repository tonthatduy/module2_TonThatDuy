package bai_tap_lam_them_ngoai.quan_ly_hoa_don_tien_dien.view;

import bai_tap_lam_them_ngoai.quan_ly_hoa_don_tien_dien.common.ValidateInput;
import bai_tap_lam_them_ngoai.quan_ly_hoa_don_tien_dien.entity.VietNam;

import java.util.Scanner;

public class VietNamView {
    private static Scanner scanner = new Scanner(System.in);

    public static VietNam inputDataForPersonVietNam() {
        System.out.println("Nhập Mã Khách Hàng");
        String maKhachHang = ValidateInput.validateInput("^KHVN-\\d{5}$", "Mã Khách Hàng Sai Định Dạng, Nhập Lại");
        System.out.println("Nhập Tên Khách Hàng (VD: Nguyen Van A)");
        String tenKhachHang = ValidateInput.validateInput("^([A-Z][a-z]*)\\s([A-Z][a-z]*\\s)*([A-Z][a-z]*)$",
                "Tên Phải Ghi Hoa Từng Chữ Cái Đầu. Nhập Lại!!");
        System.out.println("Nhập loại khách");
        return new VietNam();
    }

}
