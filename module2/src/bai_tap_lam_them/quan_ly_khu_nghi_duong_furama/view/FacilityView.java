package bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.view;

import bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.common.ValidateInput;
import bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.entity.Facility;
import bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.entity.House;
import bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.entity.Room;
import bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.entity.Villa;

import java.util.Map;
import java.util.Scanner;

public class FacilityView {
    private static Scanner scanner = new Scanner(System.in);

    public static void displayFacilityList(Map<Facility, Integer> facilityIntegerMap) {
        for (Map.Entry<Facility, Integer> entry : facilityIntegerMap.entrySet()) {
            System.out.println(entry.getKey() + ", Số lần sử dụng " + entry.getValue());
        }
    }

    public static House inputDataForHouse() {
        System.out.println("Nhập mã dịch vụ (VD: SVHO-0001)");
        String maDichVu = ValidateInput.validateInput("^SVHO-\\d{4}", "Mã dịch vụ sai định dạng.Nhập lại như ví dụ");
        System.out.println("Nhập tên dịch vụ (VD: Villa) ");
        String tenDichVu = ValidateInput.validateInput("^[A-Z][a-z]*([ ][A-Z][a-z]*)*$", "Tên Dịch Vụ Sai Định Dạng. Nhập lại");
        Double dienTich = ValidateInput.validateDienTichSuDung();
        Double chiPhiThue = ValidateInput.validateChiPhiThue();
        int soLuongNguoiToiDa = ValidateInput.getSoLuongNguoiToiDa();
        System.out.println("Nhập kiểu thuê(Năm,Tháng,Ngày,Giờ)");
        String kieuThue = ValidateInput.validateInput("(?i)^(năm|tháng|ngày|giờ)$", "Kiểu thuê không hợp lệ. Nhập lại ( Năm, Tháng, Ngày , Giờ)");
        System.out.println("Nhập tiêu chuẩn phòng: ");
        String tieuChuanPhong = scanner.nextLine();
        int soTang = ValidateInput.getSoTang();
        return new House(maDichVu, tenDichVu, dienTich, chiPhiThue, soLuongNguoiToiDa, kieuThue, tieuChuanPhong, soTang);
    }

    public static Villa inputDataForVilla() {
        System.out.println("Nhập mã dịch vụ (VD: SVVL-0001)");
        String maDichVu = ValidateInput.validateInput("^SVVL-\\d{4}", "Mã dịch vụ sai định dạng.Nhập lại như ví dụ");
        System.out.println("Nhập tên dịch vụ (VD: Villa House)");
        String tenDichVu = ValidateInput.validateInput("^[A-Z][a-z]*([ ][A-Z][a-z]*)*$", "Tên Dịch Vụ Sai Định Dạng. Nhập lại");
        Double dienTich = ValidateInput.validateDienTichSuDung();
        Double chiPhiThue = ValidateInput.validateChiPhiThue();
        int soLuongNguoiToiDa = ValidateInput.getSoLuongNguoiToiDa();
        System.out.println("Nhập kiểu thuê(Năm,Tháng,Ngày,Giờ)");
        String kieuThue = ValidateInput.validateInput("(?i)^(năm|tháng|ngày|giờ)$", "Kiểu thuê không hợp lệ. Nhập lại ( Năm, Tháng, Ngày , Giờ)");
        System.out.println("Nhập tiêu chuẩn phòng: ");
        String tieuChuanPhong = scanner.nextLine();
        Double dienTichHoBoi = ValidateInput.validateDienTichSuDung();
        int soTang = ValidateInput.getSoTang();
        return new Villa(maDichVu, tenDichVu, dienTich, chiPhiThue, soLuongNguoiToiDa, kieuThue, tieuChuanPhong, dienTichHoBoi, soTang);

    }

    public static Room inputDataForRoom() {
        System.out.println("Nhập mã dịch vụ (VD: SVRO-0001)");
        String maDichVu = ValidateInput.validateInput("^SVRO-\\d{4}", "Mã dịch vụ sai định dạng.Nhập lại như ví dụ");
        System.out.println("Nhập tên dịch vụ (VD: Room House)");
        String tenDichVu = ValidateInput.validateInput("^[A-Z][a-z]*([ ][A-Z][a-z]*)*$", "Tên Dịch Vụ Sai Định Dạng. Nhập lại");
        Double dienTich = ValidateInput.validateDienTichSuDung();
        Double chiPhiThue = ValidateInput.validateChiPhiThue();
        int soLuongNguoiToiDa = ValidateInput.getSoLuongNguoiToiDa();
        System.out.println("Nhập kiểu thuê(Năm,Tháng,Ngày,Giờ)");
        String kieuThue = ValidateInput.validateInput("(?i)^(năm|tháng|ngày|giờ)$", "Kiểu thuê không hợp lệ. Nhập lại ( Năm, Tháng, Ngày , Giờ)");
        System.out.println("Nhập tiêu chuẩn phòng: ");
        String dichVuMienPhiDiKem = scanner.nextLine();
        return new Room(maDichVu, tenDichVu, dienTich, chiPhiThue, soLuongNguoiToiDa, kieuThue, dichVuMienPhiDiKem);
    }
}
