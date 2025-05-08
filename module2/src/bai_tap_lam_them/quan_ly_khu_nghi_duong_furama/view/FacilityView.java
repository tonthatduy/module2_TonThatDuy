package bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.view;

import bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.common.Validate;
import bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.entity.Facility;
import bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.entity.House;

import java.util.Map;
import java.util.Scanner;

public class FacilityView {
    private static Scanner scanner = new Scanner(System.in);

    public static void displayFacilityList(Map<Facility, Integer> facilityIntegerMap) {
        for (Map.Entry<Facility, Integer> entry : facilityIntegerMap.entrySet()) {
            System.out.println(entry.getKey() + ", Số lần sử dụng " + entry.getValue());

        }
    }

//    public static House inputDataForHouse() {
//        System.out.println("Nhập mã dịch vụ (VD:SVHO-0001 ");
//        String maDichVu = Validate.validateInput("^SVHO-\\d{4}", "Mã dịch vụ sai định dạng.Nhập lại như ví dụ");
//        System.out.println("Nhập tên dịch vụ (VD: Villa ");
//        String tenDichVu = Validate.validateInput("^[A-Z][a-z]*([ ][A-Z][a-z]*)*$", "Tên Dịch Vụ Sai Định Dạng. Nhập lại");
//        System.out.println("Nhập diện tích sử dụng");
//        Double dientich = Validate.validateInputDoubleGreaterThan30("^\\d+(\\.\\d+)?$", "Diện Tích Nhập sai định dạng. Nhập lại");
//        int soLuongNguoiToiDa;
//        while (true) {
//            System.out.println("Nhập số lượng người tối đa để ở");
//            soLuongNguoiToiDa = Integer.parseInt(scanner.nextLine());
//            if (soLuongNguoiToiDa > 0 && soLuongNguoiToiDa < 20) {
//                break;
//            }
//            System.err.println("Phải nhập số lượng người ở từ (0-20)!");
//        }
//        System.out.println("Nhập kiểu thuê");
//        String kieuThue=scanner.nextLine();
//        return House;
//    }
}
