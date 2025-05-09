package bai_tap_lam_them_ngoai.quan_ly_hoa_don_tien_dien.repository;

import bai_tap_lam_them_ngoai.quan_ly_hoa_don_tien_dien.entity.Foreigner;
import bai_tap_lam_them_ngoai.quan_ly_hoa_don_tien_dien.util.ReadAndWriteFileElectricityBill;

import java.util.ArrayList;
import java.util.List;

public class ForeignerRepository implements IForeignerRepository {
    private static final String FOREIGNER_FILE = "src/bai_tap_lam_them_ngoai/quan_ly_hoa_don_tien_dien/data/khachHangNgoaiQuoc.csv";

    @Override
    public List<Foreigner> findAll() {
        List<Foreigner> foreigners = new ArrayList<>();
        List<String> stringList = ReadAndWriteFileElectricityBill.readFile(FOREIGNER_FILE);
        String[] array;
        for (int i = 0; i < stringList.size(); i++) {
            array = stringList.get(i).split(",");
            Foreigner foreigner = new Foreigner(array[0], array[1], array[2]);
            foreigners.add(foreigner);

        }
        return foreigners;
    }
}
