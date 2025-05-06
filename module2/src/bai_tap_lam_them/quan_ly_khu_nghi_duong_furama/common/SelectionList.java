package bai_tap_lam_them.quan_ly_khu_nghi_duong_furama.common;

import java.util.Arrays;
import java.util.List;

public class SelectionList {
    public static List<String> getTrinhDoList() {
        return Arrays.asList("Trung cấp", "Cao đẳng", "Đại học", "Sau đại học");
    }

    public static List<String> getViTriList() {
        return Arrays.asList("Lễ tân", "Phục vụ", "Chuyên viên", "Giám sát", "Quản lý", "Giám đốc");
    }

    public static List<String> getLoaiKhachList() {
        return Arrays.asList("Diamond", "Platinum", "Gold", "Silver", "Member");
    }
}
