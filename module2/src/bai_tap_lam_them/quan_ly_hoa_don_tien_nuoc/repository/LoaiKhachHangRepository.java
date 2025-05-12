package bai_tap_lam_them.quan_ly_hoa_don_tien_nuoc.repository;

import bai_tap_lam_them.quan_ly_hoa_don_tien_nuoc.common.ReadAndWriteFile;
import bai_tap_lam_them.quan_ly_hoa_don_tien_nuoc.entity.LoaiKhachHang;

import java.util.ArrayList;
import java.util.List;

public class LoaiKhachHangRepository implements ILoaiKhachHangRepository {
    private static String PATH = "src/bai_tap_lam_them/quan_ly_hoa_don_tien_nuoc/data/loaikhach.csv";

    @Override
    public List<LoaiKhachHang> findAll() {
        List<String> stringList = ReadAndWriteFile.readFileCSV(PATH);
        List<LoaiKhachHang> loaiKhachHangs = new ArrayList<>();
        for (String s : stringList) {
            String[] array = s.split("\\s*,\\s*");
            loaiKhachHangs.add(new LoaiKhachHang(array[0], array[1]));

        }
        return loaiKhachHangs;
    }

    @Override
    public LoaiKhachHang findById(String type) {
        for (LoaiKhachHang loaiKhachHang : findAll()) {
            if (loaiKhachHang.getId().equals(type)) {
                return loaiKhachHang;
            }
        }
        return null;
    }
}
